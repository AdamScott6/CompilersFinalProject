grammar PL;

@header {
import backend.*;
}

@members {
}

program returns [Expr expr]
    : {List<Expr> statements = new ArrayList<Expr>();}
    (statement {statements.add($statement.expr);})+ EOF
    {$expr = new Block(statements);};

block returns [Expr expr]
    : {List<Expr> codeBlock = new ArrayList<Expr>();}
    '{' (statement { codeBlock.add($statement.expr); })* '}'
      { $expr = new Block(codeBlock); };


statement returns [Expr expr]
    : assignment ';'* { $expr = $assignment.expr; }
    | print ';'* { $expr = $print.expr; }
    | forStatement ';'* { $expr = $forStatement.expr; }
    | functionDeclaration ';'* { $expr = $functionDeclaration.expr; }
    | functionInvocation ';'* { $expr = $functionInvocation.expr; }
    | ifStatement ';'* { $expr = $ifStatement.expr; }
    | openFileRead ';'* { $expr = $openFileRead.expr; }
    | openFileWrite ';'* { $expr = $openFileWrite.expr; }
    | openFileAppend ';'* { $expr = $openFileAppend.expr; }
    | writeFile ';'* { $expr = $writeFile.expr; };
    


assignment returns [Expr expr]
    : ID '=' expression { $expr = new Assign($ID.text, $expression.expr); };
    
   
print returns [Expr expr]
    : 'print(' expression ')' { 
        Expr expr2 = $expression.expr;
        if (expr2 instanceof VariableExpr) {
           expr2 = new Deref($expression.text);
        }
        $expr = new PrintExpr(expr2); 
    };


forStatement returns [Expr expr]
    : 'for' '(' ID 'in' lhs=INTEGER '..' rhs=INTEGER ')' block {
        $expr = new ForLoop(new VariableExpr($ID.text), new IntLiteral($lhs.text), new IntLiteral($rhs.text), $block.expr);
    }
    ;
    
functionDeclaration returns [Expr expr]
    : 'function' name=ID '(' params=parameterList ')' block
      {
          $expr = new Declare($name.text, $params.list, $block.expr);
      }
    ;
    
parameterList returns [List<String> list]
    : (ID { $list = new ArrayList<String>(); $list.add($ID.text); } (',' ID { $list.add($ID.text); })*)?
    ;

   
argumentList returns [List<Expr> list]
    : (expression { $list = new ArrayList<Expr>(); $list.add($expression.expr); } (',' expression { $list.add($expression.expr); })*)?
    ;



functionInvocation returns [Expr expr]
    : name=ID '(' args=argumentList ')'
      {
          $expr = new Invoke($name.text, $args.list);
      }
    ;
    
    
    
    
    
ifStatement returns [Expr expr]
    : 'if' '(' condition=compare ')' thenBlock=block ('else' elseBlock=block)?
      {
          $expr = new Ifelse($condition.expr, $thenBlock.expr, $elseBlock.expr);
      }
    ;

expression returns [Expr expr]
    : symbol { $expr = $symbol.expr ;}
    | arithmeticExpr { $expr = $arithmeticExpr.expr ;}
    | concatenationExpr { $expr = $concatenationExpr.expr ;}
    | readFile { $expr = $readFile.expr ;}
    | '(' expression ')' { $expr = $expression.expr; };


concatenationExpr returns [Expr expr]
    : lhs=symbol '++' rhs=expression { 
        Expr left = $lhs.expr;
        Expr right = $rhs.expr;
        if (left instanceof VariableExpr) {
           left = new Deref($lhs.text);
        }
        if (right instanceof VariableExpr) {
           right = new Deref($rhs.text);
        }
        $expr = new ConcatExpr(left, right);
    };
    
    
arithmeticExpr returns [Expr expr]
    : left=symbol op=('+' | '-' | '*' | '/') right=symbol {
        Operator operator;
        switch ($op.getText()) {
            case "+":
                operator = Operator.Add;
                break;
            case "-":
                operator = Operator.Sub;
                break;
            case "*":
                operator = Operator.Mul;
                break;
            case "/":
                operator = Operator.Div;
                break;
            default:
                throw new IllegalStateException("Unknown operator: " + $op.getText());
        }
        
        Expr leftExpr = $left.expr;
        Expr rightExpr = $right.expr;
       if (leftExpr instanceof VariableExpr) {
           leftExpr = new Deref($left.text);
       }
       if (rightExpr instanceof VariableExpr) {
           rightExpr = new Deref($right.text);
       }
        
        $expr = new Arithmetics(operator, leftExpr, rightExpr);
    }
    ;

    
symbol returns [Expr expr]
    : STRING { $expr = new StringLiteral($STRING.text); }
    | ID { $expr = new VariableExpr($ID.text);}
    | INTEGER { 
        $expr = new IntLiteral($INTEGER.text);
        };





compare returns [Expr expr]
    : left=expression comparator right=expression
      {
          $expr = new Compare($comparator.type, $left.expr, $right.expr);
      }
    ;

comparator returns [Comparator type]
    : '<' { $type = Comparator.LT; }
    | '<=' { $type = Comparator.LE; }
    | '>' { $type = Comparator.GT; }
    | '>=' { $type = Comparator.GE; }
    | '==' { $type = Comparator.EQ; }
    | '!=' { $type = Comparator.NE; }
    ;



    
openFileRead returns [Expr expr]
    : 'with' 'open' '(' STRING ',' SINGLE_QUOTE 'r' SINGLE_QUOTE ')' 'as' ID block {
        $expr = new OpenFileRead($STRING.text, $ID.text, $block.expr);
    };
    
openFileWrite returns [Expr expr]
    : 'with' 'open' '(' STRING ',' SINGLE_QUOTE 'w' SINGLE_QUOTE ')' 'as' ID block {
        $expr = new OpenFileWrite($STRING.text, $ID.text, $block.expr);
    };
    
openFileAppend returns [Expr expr]
    : 'with' 'open' '(' STRING ',' SINGLE_QUOTE 'a' SINGLE_QUOTE ')' 'as' ID block {
        $expr = new OpenFileAppend($STRING.text, $ID.text, $block.expr);
    };  
  
readFile returns [Expr expr]
    : ID '.read()' {
        $expr = new ReadFile($ID.text);
    };
    
writeFile returns [Expr expr]
    : ID '.write(' STRING ')' {
        $expr = new WriteFile($ID.text, $STRING.text);
    };

    
    
    
    

ID : [a-zA-Z]+;
STRING : '"' ( ~[\\"\n\r] | '\\' [\\"] )* '"';
INTEGER : [0-9]+;
SINGLE_QUOTE: '\'';

WHITESPACE : [ \t\r\n] -> skip;



