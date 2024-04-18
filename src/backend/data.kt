package backend

import java.io.BufferedReader
import java.io.FileReader
import java.io.File

abstract class Data

object None:Data() {
    override fun toString() = "None"
}

class StringData(val value:String): Data() {
    override fun toString(): String = 
        "$value"
}

object NullData: Data() {
    override fun toString(): String = "NULL"
}

class IntData(val value:Int): Data() {
    override fun toString(): String = "$value"
}

class BooleanData(val value:Boolean): Data() {
    override fun toString() = 
    "$value"
}

class VariableData(val value:String): Data() {
    override fun toString(): String = 
        "$value"
}

class FuncData(
    val name: String,
    val params: List<String>,
    val body: Expr
): Data() {
    override fun toString()
    = params.joinToString(", ").let {
        "$name($it) { ... }"
    }
}


//Project

enum class FileMode {
    read,
    write,
    append,
}

class FileData(val fileObj: File, val fileName: String, val mode: FileMode) : Data() 
