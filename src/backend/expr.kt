package backend

import java.io.BufferedReader
import java.io.FileReader
import java.io.File
import java.io.FileWriter
import java.io.PrintWriter

abstract class Expr {
    abstract fun eval(runtime:Runtime):Data
}

class NoneExpr(): Expr() {
    override fun eval(runtime:Runtime) = None
}

class PrintExpr(val valueExpr: Expr) : Expr() {
    override fun eval(runtime: Runtime): Data {
        val t = valueExpr.eval(runtime)
        println(t.toString())
        return t
    }
}

class VariableExpr(val lexeme:String): Expr() {
    override fun eval(runtime:Runtime): Data
    = VariableData(lexeme)
}

class ConcatExpr(val expr1: Expr, val expr2: Expr) : Expr() {
    override fun eval(runtime: Runtime): Data {
        val data1 = expr1.eval(runtime)
        val data2 = expr2.eval(runtime)
        
        return StringData(data1.toString() + data2.toString())
    }
}


enum class Operator {
    Add,
    Sub,
    Mul,
    Div
}

class Block(val exprList: List<Expr>): Expr() {
    override fun eval(runtime:Runtime): Data {
        var result: Data = NullData
        exprList.forEach { expr ->
            val evaluated = expr.eval(runtime)
            if (evaluated != NullData) {
                result = evaluated
            }
        }
        return result
    }
}

object NullExpr: Expr() {
    override fun eval(runtime:Runtime): Data = NullData
}

class IntLiteral(val lexeme:String): Expr() {
    val value: Int = lexeme.toInt()
    
    override fun eval(runtime:Runtime): Data
    = IntData(Integer.parseInt(lexeme))
    
    fun intValue(): Int {
        return value
    }
}

class StringLiteral(val lexeme: String) : Expr() {
    override fun eval(runtime: Runtime): Data {
        val value = lexeme.substring(1, lexeme.length - 1)
        return StringData(value)
    }
}

class BooleanLiteral(val lexeme:String): Expr() {
    override fun eval(runtime:Runtime): Data
    = BooleanData(lexeme.equals("true"))
}

class Arithmetics(
    val op:Operator,
    val left:Expr,
    val right:Expr
): Expr() {
    override fun eval(runtime:Runtime): Data {
        val x = left.eval(runtime)
        val y = right.eval(runtime)
        
        //Add two strings
        if(x !is IntData && y !is IntData) {
            return StringData(x.toString() + y.toString())
        }
        
        //Multiply string by int
        if(x !is IntData && y is IntData) {
            var finalStr = x.toString()

            for (i in 1 until y.value) {
                finalStr += x.toString()
            }
            return StringData(finalStr)
        }
        
        if (x is IntData && y is IntData) {
            return IntData(
                when(op) {
                    Operator.Add -> x.value + y.value
                    Operator.Sub -> x.value - y.value
                    Operator.Mul -> x.value * y.value
                    Operator.Div -> {
                        if(y.value != 0) {
                            x.value / y.value
                        } else {
                            throw Exception("cannot divide by zero")
                        }
                    }
                    else -> throw Exception("Unknown operator")
                }
            )
        }
        return StringData("Error")
    }
}

class Assign(val symbol:String, val expr:Expr): Expr() {
    override fun eval(runtime:Runtime): Data
    = expr.eval(runtime).apply {
        runtime.symbolTable.put(symbol, this)
    }
}

class Deref(val name:String): Expr() {
    override fun eval(runtime:Runtime):Data {
        val data = runtime.symbolTable[name]
        if(data == null) {
            throw Exception("$name is not assigned.")
        }
        return data
    }
}


enum class Comparator {
    LT,
    LE,
    GT,
    GE,
    EQ,
    NE,
}

class Compare(
    val comparator: Comparator,
    val left: Expr,
    val right: Expr
): Expr() {
    override fun eval(runtime:Runtime): Data {
        val x = left.eval(runtime)
        val y = right.eval(runtime)
        if(x is IntData && y is IntData) {
            return BooleanData(
                when(comparator) {
                    Comparator.LT -> x.value < y.value
                    Comparator.LE -> x.value <= y.value
                    Comparator.GT -> x.value > y.value
                    Comparator.GE -> x.value >= y.value
                    Comparator.EQ -> x.value == y.value
                    Comparator.NE -> x.value != y.value
                }
            )
        } else {
            throw Exception("Non-integer data in comparison")
        }
    }
}

class Ifelse(
    val cond:Expr,
    val trueExpr:Expr,
    val falseExpr:Expr
): Expr() {
    override fun eval(runtime:Runtime): Data {
        val cond_data = cond.eval(runtime)
        if(cond_data !is BooleanData) {
            throw Exception("need boolean data in if-else")
        }
        return if(cond_data.value) {
            return trueExpr.eval(runtime)
        } else {
            return falseExpr.eval(runtime)
        }
    }
}

class While(val cond:Expr, val body:Expr): Expr() {
    override fun eval(runtime:Runtime): Data {
        var flag = cond.eval(runtime) as BooleanData
        var result:Data = NullData
        var iter:Int = 1_000_000
        while(flag.value) {
            result = body.eval(runtime)
            flag = cond.eval(runtime) as BooleanData
            if(iter == 0) {
                println("MAX_ITER reached")
                println(runtime)
                return NullData
            }
            iter --
        }
        return result
    }
}



class Declare(
    val name: String,
    val params: List<String>,
    val body: Expr
): Expr() {
    override fun eval(runtime:Runtime):Data
    = FuncData(name, params, body).also {
        runtime.symbolTable[name] = it
    }
}

class Invoke(val name:String, val args:List<Expr>):Expr() {
    override fun eval(runtime:Runtime):Data {
        val func:Data? = runtime.symbolTable[name]
        if(func == null) {
            throw Exception("$name does not exist")
        }
        if(func !is FuncData) {
            throw Exception("$name is not a function.")
        }
        if(func.params.size != args.size) {
            throw Exception(
                "$name expects ${func.params.size} arguments "
                + "but received ${args.size}"
            )
        }
        
        val r = runtime.subscope(
            func.params.zip(args.map {it.eval(runtime)}).toMap()
        )
        return func.body.eval(r)
    }
}


class ForLoop(val variable: VariableExpr, val start: IntLiteral, val end: IntLiteral, val body: Expr) : Expr() {
    override fun eval(runtime: Runtime): Data {
        val statements = mutableListOf<Data>()
        
        for (i in start.value..end.value) {
            val assignExpr = Assign("i", IntLiteral(i.toString()))
            assignExpr.eval(runtime)
            
            statements.add(body.eval(runtime))
        }
        return statements.lastOrNull() ?: None
    }
}


//Project
class OpenFileRead(val filePath: String, val fileName: String, val body: Expr) : Expr() {
    override fun eval(runtime: Runtime): Data {
        
        val currentDirPath = System.getProperty("user.dir")
        val noQuoteFilePath = filePath.removeSurrounding("\"");
        val absFilePath = "$currentDirPath/$noQuoteFilePath"
        
        val fileDataObj = FileData(File(absFilePath), fileName, FileMode.read)
        runtime.symbolTable[fileName] = fileDataObj
        
        
        body.eval(runtime)
         
        
        return fileDataObj
    }
}

class OpenFileWrite(val filePath: String, val fileName: String, val body: Expr) : Expr() {
    override fun eval(runtime: Runtime): Data {
        
        val currentDirPath = System.getProperty("user.dir")
        val noQuoteFilePath = filePath.removeSurrounding("\"");
        val absFilePath = "$currentDirPath/$noQuoteFilePath"
        
        val thisFile = File(absFilePath)
        if (!thisFile.exists()) { 
            thisFile.createNewFile() 
        }
        
        val fileDataObj = FileData(thisFile, fileName, FileMode.write)
        runtime.symbolTable[fileName] = fileDataObj
        
        
        body.eval(runtime)
 
        
        return fileDataObj
    }
}

class OpenFileAppend(val filePath: String, val fileName: String, val body: Expr) : Expr() {
    override fun eval(runtime: Runtime): Data {
        
        val currentDirPath = System.getProperty("user.dir")
        val noQuoteFilePath = filePath.removeSurrounding("\"");
        val absFilePath = "$currentDirPath/$noQuoteFilePath"
        
        val thisFile = File(absFilePath)
        if (!thisFile.exists()) { 
            thisFile.createNewFile() 
        }
        
        val fileDataObj = FileData(thisFile, fileName, FileMode.append)
        runtime.symbolTable[fileName] = fileDataObj
        
        
        body.eval(runtime)
 
        
        return fileDataObj
    }
}

class ReadFile(val fileName: String) : Expr() {
    override fun eval(runtime: Runtime): Data {
        val fileObj : FileData = runtime.symbolTable[fileName] as FileData
        
        if (fileObj.mode == FileMode.read) {
            return StringData(fileObj.fileObj.readText())
        }
        else {
            throw Exception("Incorrect File Mode: You must be in write or append mode to perform writing operations")
        }
    
    }
}

class WriteFile(val fileName: String, val newText: String) : Expr() {
    override fun eval(runtime: Runtime): Data {
        val fileDataObj : FileData = runtime.symbolTable[fileName] as FileData
        
        val noQuoteNewText = newText.removeSurrounding("\"");
        
        if (fileDataObj.mode == FileMode.write || fileDataObj.mode == FileMode.append) {
            val isAppend = (fileDataObj.mode == FileMode.append)
            val file = fileDataObj.fileObj
            PrintWriter(FileWriter(file, isAppend)).use { writer ->
                writer.println(noQuoteNewText)
            }
            
            runtime.symbolTable[fileName] = fileDataObj
            return fileDataObj
        }
        else {
            throw Exception("Incorrect File Mode: You must be in read mode to perform reading operations.")
        }
    
    }
}
