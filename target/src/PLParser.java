// Generated from ./src/PL.g4 by ANTLR 4.13.1

import backend.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, ID=34, STRING=35, INTEGER=36, SINGLE_QUOTE=37, WHITESPACE=38;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_print = 4, RULE_forStatement = 5, RULE_functionDeclaration = 6, RULE_parameterList = 7, 
		RULE_argumentList = 8, RULE_functionInvocation = 9, RULE_ifStatement = 10, 
		RULE_expression = 11, RULE_concatenationExpr = 12, RULE_arithmeticExpr = 13, 
		RULE_symbol = 14, RULE_compare = 15, RULE_comparator = 16, RULE_openFileRead = 17, 
		RULE_openFileWrite = 18, RULE_openFileAppend = 19, RULE_readFile = 20, 
		RULE_writeFile = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "assignment", "print", "forStatement", 
			"functionDeclaration", "parameterList", "argumentList", "functionInvocation", 
			"ifStatement", "expression", "concatenationExpr", "arithmeticExpr", "symbol", 
			"compare", "comparator", "openFileRead", "openFileWrite", "openFileAppend", 
			"readFile", "writeFile"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "'print('", "')'", "'for'", "'('", 
			"'in'", "'..'", "'function'", "','", "'if'", "'else'", "'++'", "'+'", 
			"'-'", "'*'", "'/'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'with'", 
			"'open'", "'r'", "'as'", "'w'", "'a'", "'.read()'", "'.write('", null, 
			null, null, "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ID", "STRING", 
			"INTEGER", "SINGLE_QUOTE", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public PLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Expr expr;
		public StatementContext statement;
		public TerminalNode EOF() { return getToken(PLParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Expr> statements = new ArrayList<Expr>();
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				((ProgramContext)_localctx).statement = statement();
				statements.add(((ProgramContext)_localctx).statement.expr);
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17246988448L) != 0) );
			setState(52);
			match(EOF);
			((ProgramContext)_localctx).expr =  new Block(statements);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public Expr expr;
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Expr> codeBlock = new ArrayList<Expr>();
			setState(56);
			match(T__0);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17246988448L) != 0)) {
				{
				{
				setState(57);
				((BlockContext)_localctx).statement = statement();
				 codeBlock.add(((BlockContext)_localctx).statement.expr); 
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(T__1);
			 ((BlockContext)_localctx).expr =  new Block(codeBlock); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Expr expr;
		public AssignmentContext assignment;
		public PrintContext print;
		public ForStatementContext forStatement;
		public FunctionDeclarationContext functionDeclaration;
		public FunctionInvocationContext functionInvocation;
		public IfStatementContext ifStatement;
		public OpenFileReadContext openFileRead;
		public OpenFileWriteContext openFileWrite;
		public OpenFileAppendContext openFileAppend;
		public WriteFileContext writeFile;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public OpenFileReadContext openFileRead() {
			return getRuleContext(OpenFileReadContext.class,0);
		}
		public OpenFileWriteContext openFileWrite() {
			return getRuleContext(OpenFileWriteContext.class,0);
		}
		public OpenFileAppendContext openFileAppend() {
			return getRuleContext(OpenFileAppendContext.class,0);
		}
		public WriteFileContext writeFile() {
			return getRuleContext(WriteFileContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				((StatementContext)_localctx).assignment = assignment();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(69);
					match(T__2);
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((StatementContext)_localctx).expr =  ((StatementContext)_localctx).assignment.expr; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((StatementContext)_localctx).print = print();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(78);
					match(T__2);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((StatementContext)_localctx).expr =  ((StatementContext)_localctx).print.expr; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				((StatementContext)_localctx).forStatement = forStatement();
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(87);
					match(T__2);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((StatementContext)_localctx).expr =  ((StatementContext)_localctx).forStatement.expr; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				((StatementContext)_localctx).functionDeclaration = functionDeclaration();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(96);
					match(T__2);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((StatementContext)_localctx).expr =  ((StatementContext)_localctx).functionDeclaration.expr; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				((StatementContext)_localctx).functionInvocation = functionInvocation();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(105);
					match(T__2);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((StatementContext)_localctx).expr =  ((StatementContext)_localctx).functionInvocation.expr; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				((StatementContext)_localctx).ifStatement = ifStatement();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(114);
					match(T__2);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((StatementContext)_localctx).expr =  ((StatementContext)_localctx).ifStatement.expr; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				((StatementContext)_localctx).openFileRead = openFileRead();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(123);
					match(T__2);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((StatementContext)_localctx).expr =  ((StatementContext)_localctx).openFileRead.expr; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				((StatementContext)_localctx).openFileWrite = openFileWrite();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(132);
					match(T__2);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((StatementContext)_localctx).expr =  ((StatementContext)_localctx).openFileWrite.expr; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(140);
				((StatementContext)_localctx).openFileAppend = openFileAppend();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(141);
					match(T__2);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((StatementContext)_localctx).expr =  ((StatementContext)_localctx).openFileAppend.expr; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(149);
				((StatementContext)_localctx).writeFile = writeFile();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(150);
					match(T__2);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((StatementContext)_localctx).expr =  ((StatementContext)_localctx).writeFile.expr; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Expr expr;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(161);
			match(T__3);
			setState(162);
			((AssignmentContext)_localctx).expression = expression();
			 ((AssignmentContext)_localctx).expr =  new Assign((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), ((AssignmentContext)_localctx).expression.expr); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public Expr expr;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__4);
			setState(166);
			((PrintContext)_localctx).expression = expression();
			setState(167);
			match(T__5);
			 
			        Expr expr2 = ((PrintContext)_localctx).expression.expr;
			        if (expr2 instanceof VariableExpr) {
			           expr2 = new Deref((((PrintContext)_localctx).expression!=null?_input.getText(((PrintContext)_localctx).expression.start,((PrintContext)_localctx).expression.stop):null));
			        }
			        ((PrintContext)_localctx).expr =  new PrintExpr(expr2); 
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public Expr expr;
		public Token ID;
		public Token lhs;
		public Token rhs;
		public BlockContext block;
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> INTEGER() { return getTokens(PLParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(PLParser.INTEGER, i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__6);
			setState(171);
			match(T__7);
			setState(172);
			((ForStatementContext)_localctx).ID = match(ID);
			setState(173);
			match(T__8);
			setState(174);
			((ForStatementContext)_localctx).lhs = match(INTEGER);
			setState(175);
			match(T__9);
			setState(176);
			((ForStatementContext)_localctx).rhs = match(INTEGER);
			setState(177);
			match(T__5);
			setState(178);
			((ForStatementContext)_localctx).block = block();

			        ((ForStatementContext)_localctx).expr =  new ForLoop(new VariableExpr((((ForStatementContext)_localctx).ID!=null?((ForStatementContext)_localctx).ID.getText():null)), new IntLiteral((((ForStatementContext)_localctx).lhs!=null?((ForStatementContext)_localctx).lhs.getText():null)), new IntLiteral((((ForStatementContext)_localctx).rhs!=null?((ForStatementContext)_localctx).rhs.getText():null)), ((ForStatementContext)_localctx).block.expr);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public Expr expr;
		public Token name;
		public ParameterListContext params;
		public BlockContext block;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__10);
			setState(182);
			((FunctionDeclarationContext)_localctx).name = match(ID);
			setState(183);
			match(T__7);
			setState(184);
			((FunctionDeclarationContext)_localctx).params = parameterList();
			setState(185);
			match(T__5);
			setState(186);
			((FunctionDeclarationContext)_localctx).block = block();

			          ((FunctionDeclarationContext)_localctx).expr =  new Declare((((FunctionDeclarationContext)_localctx).name!=null?((FunctionDeclarationContext)_localctx).name.getText():null), ((FunctionDeclarationContext)_localctx).params.list, ((FunctionDeclarationContext)_localctx).block.expr);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<String> list;
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(PLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLParser.ID, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(189);
				((ParameterListContext)_localctx).ID = match(ID);
				 ((ParameterListContext)_localctx).list =  new ArrayList<String>(); _localctx.list.add((((ParameterListContext)_localctx).ID!=null?((ParameterListContext)_localctx).ID.getText():null)); 
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(191);
					match(T__11);
					setState(192);
					((ParameterListContext)_localctx).ID = match(ID);
					 _localctx.list.add((((ParameterListContext)_localctx).ID!=null?((ParameterListContext)_localctx).ID.getText():null)); 
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<Expr> list;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084544L) != 0)) {
				{
				setState(201);
				((ArgumentListContext)_localctx).expression = expression();
				 ((ArgumentListContext)_localctx).list =  new ArrayList<Expr>(); _localctx.list.add(((ArgumentListContext)_localctx).expression.expr); 
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(203);
					match(T__11);
					setState(204);
					((ArgumentListContext)_localctx).expression = expression();
					 _localctx.list.add(((ArgumentListContext)_localctx).expression.expr); 
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionInvocationContext extends ParserRuleContext {
		public Expr expr;
		public Token name;
		public ArgumentListContext args;
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocation; }
	}

	public final FunctionInvocationContext functionInvocation() throws RecognitionException {
		FunctionInvocationContext _localctx = new FunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((FunctionInvocationContext)_localctx).name = match(ID);
			setState(215);
			match(T__7);
			setState(216);
			((FunctionInvocationContext)_localctx).args = argumentList();
			setState(217);
			match(T__5);

			          ((FunctionInvocationContext)_localctx).expr =  new Invoke((((FunctionInvocationContext)_localctx).name!=null?((FunctionInvocationContext)_localctx).name.getText():null), ((FunctionInvocationContext)_localctx).args.list);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public Expr expr;
		public CompareContext condition;
		public BlockContext thenBlock;
		public BlockContext elseBlock;
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__12);
			setState(221);
			match(T__7);
			setState(222);
			((IfStatementContext)_localctx).condition = compare();
			setState(223);
			match(T__5);
			setState(224);
			((IfStatementContext)_localctx).thenBlock = block();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(225);
				match(T__13);
				setState(226);
				((IfStatementContext)_localctx).elseBlock = block();
				}
			}


			          ((IfStatementContext)_localctx).expr =  new Ifelse(((IfStatementContext)_localctx).condition.expr, ((IfStatementContext)_localctx).thenBlock.expr, ((IfStatementContext)_localctx).elseBlock.expr);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expr expr;
		public SymbolContext symbol;
		public ArithmeticExprContext arithmeticExpr;
		public ConcatenationExprContext concatenationExpr;
		public ReadFileContext readFile;
		public ExpressionContext expression;
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public ConcatenationExprContext concatenationExpr() {
			return getRuleContext(ConcatenationExprContext.class,0);
		}
		public ReadFileContext readFile() {
			return getRuleContext(ReadFileContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				((ExpressionContext)_localctx).symbol = symbol();
				 ((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).symbol.expr ;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				((ExpressionContext)_localctx).arithmeticExpr = arithmeticExpr();
				 ((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).arithmeticExpr.expr ;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				((ExpressionContext)_localctx).concatenationExpr = concatenationExpr();
				 ((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).concatenationExpr.expr ;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				((ExpressionContext)_localctx).readFile = readFile();
				 ((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).readFile.expr ;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				match(T__7);
				setState(244);
				((ExpressionContext)_localctx).expression = expression();
				setState(245);
				match(T__5);
				 ((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).expression.expr; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConcatenationExprContext extends ParserRuleContext {
		public Expr expr;
		public SymbolContext lhs;
		public ExpressionContext rhs;
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConcatenationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenationExpr; }
	}

	public final ConcatenationExprContext concatenationExpr() throws RecognitionException {
		ConcatenationExprContext _localctx = new ConcatenationExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_concatenationExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			((ConcatenationExprContext)_localctx).lhs = symbol();
			setState(251);
			match(T__14);
			setState(252);
			((ConcatenationExprContext)_localctx).rhs = expression();
			 
			        Expr left = ((ConcatenationExprContext)_localctx).lhs.expr;
			        Expr right = ((ConcatenationExprContext)_localctx).rhs.expr;
			        if (left instanceof VariableExpr) {
			           left = new Deref((((ConcatenationExprContext)_localctx).lhs!=null?_input.getText(((ConcatenationExprContext)_localctx).lhs.start,((ConcatenationExprContext)_localctx).lhs.stop):null));
			        }
			        if (right instanceof VariableExpr) {
			           right = new Deref((((ConcatenationExprContext)_localctx).rhs!=null?_input.getText(((ConcatenationExprContext)_localctx).rhs.start,((ConcatenationExprContext)_localctx).rhs.stop):null));
			        }
			        ((ConcatenationExprContext)_localctx).expr =  new ConcatExpr(left, right);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExprContext extends ParserRuleContext {
		public Expr expr;
		public SymbolContext left;
		public Token op;
		public SymbolContext right;
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public ArithmeticExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpr; }
	}

	public final ArithmeticExprContext arithmeticExpr() throws RecognitionException {
		ArithmeticExprContext _localctx = new ArithmeticExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arithmeticExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			((ArithmeticExprContext)_localctx).left = symbol();
			setState(256);
			((ArithmeticExprContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 983040L) != 0)) ) {
				((ArithmeticExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(257);
			((ArithmeticExprContext)_localctx).right = symbol();

			        Operator operator;
			        switch (((ArithmeticExprContext)_localctx).op.getText()) {
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
			                throw new IllegalStateException("Unknown operator: " + ((ArithmeticExprContext)_localctx).op.getText());
			        }
			        
			        Expr leftExpr = ((ArithmeticExprContext)_localctx).left.expr;
			        Expr rightExpr = ((ArithmeticExprContext)_localctx).right.expr;
			       if (leftExpr instanceof VariableExpr) {
			           leftExpr = new Deref((((ArithmeticExprContext)_localctx).left!=null?_input.getText(((ArithmeticExprContext)_localctx).left.start,((ArithmeticExprContext)_localctx).left.stop):null));
			       }
			       if (rightExpr instanceof VariableExpr) {
			           rightExpr = new Deref((((ArithmeticExprContext)_localctx).right!=null?_input.getText(((ArithmeticExprContext)_localctx).right.start,((ArithmeticExprContext)_localctx).right.stop):null));
			       }
			        
			        ((ArithmeticExprContext)_localctx).expr =  new Arithmetics(operator, leftExpr, rightExpr);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SymbolContext extends ParserRuleContext {
		public Expr expr;
		public Token STRING;
		public Token ID;
		public Token INTEGER;
		public TerminalNode STRING() { return getToken(PLParser.STRING, 0); }
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public TerminalNode INTEGER() { return getToken(PLParser.INTEGER, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_symbol);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				((SymbolContext)_localctx).STRING = match(STRING);
				 ((SymbolContext)_localctx).expr =  new StringLiteral((((SymbolContext)_localctx).STRING!=null?((SymbolContext)_localctx).STRING.getText():null)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				((SymbolContext)_localctx).ID = match(ID);
				 ((SymbolContext)_localctx).expr =  new VariableExpr((((SymbolContext)_localctx).ID!=null?((SymbolContext)_localctx).ID.getText():null));
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				((SymbolContext)_localctx).INTEGER = match(INTEGER);
				 
				        ((SymbolContext)_localctx).expr =  new IntLiteral((((SymbolContext)_localctx).INTEGER!=null?((SymbolContext)_localctx).INTEGER.getText():null));
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompareContext extends ParserRuleContext {
		public Expr expr;
		public ExpressionContext left;
		public ComparatorContext comparator;
		public ExpressionContext right;
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			((CompareContext)_localctx).left = expression();
			setState(269);
			((CompareContext)_localctx).comparator = comparator();
			setState(270);
			((CompareContext)_localctx).right = expression();

			          ((CompareContext)_localctx).expr =  new Compare(((CompareContext)_localctx).comparator.type, ((CompareContext)_localctx).left.expr, ((CompareContext)_localctx).right.expr);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparatorContext extends ParserRuleContext {
		public Comparator type;
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparator);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(T__19);
				 ((ComparatorContext)_localctx).type =  Comparator.LT; 
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(T__20);
				 ((ComparatorContext)_localctx).type =  Comparator.LE; 
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(T__21);
				 ((ComparatorContext)_localctx).type =  Comparator.GT; 
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				match(T__22);
				 ((ComparatorContext)_localctx).type =  Comparator.GE; 
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				match(T__23);
				 ((ComparatorContext)_localctx).type =  Comparator.EQ; 
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				match(T__24);
				 ((ComparatorContext)_localctx).type =  Comparator.NE; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenFileReadContext extends ParserRuleContext {
		public Expr expr;
		public Token STRING;
		public Token ID;
		public BlockContext block;
		public TerminalNode STRING() { return getToken(PLParser.STRING, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(PLParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(PLParser.SINGLE_QUOTE, i);
		}
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OpenFileReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openFileRead; }
	}

	public final OpenFileReadContext openFileRead() throws RecognitionException {
		OpenFileReadContext _localctx = new OpenFileReadContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_openFileRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__25);
			setState(288);
			match(T__26);
			setState(289);
			match(T__7);
			setState(290);
			((OpenFileReadContext)_localctx).STRING = match(STRING);
			setState(291);
			match(T__11);
			setState(292);
			match(SINGLE_QUOTE);
			setState(293);
			match(T__27);
			setState(294);
			match(SINGLE_QUOTE);
			setState(295);
			match(T__5);
			setState(296);
			match(T__28);
			setState(297);
			((OpenFileReadContext)_localctx).ID = match(ID);
			setState(298);
			((OpenFileReadContext)_localctx).block = block();

			        ((OpenFileReadContext)_localctx).expr =  new OpenFileRead((((OpenFileReadContext)_localctx).STRING!=null?((OpenFileReadContext)_localctx).STRING.getText():null), (((OpenFileReadContext)_localctx).ID!=null?((OpenFileReadContext)_localctx).ID.getText():null), ((OpenFileReadContext)_localctx).block.expr);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenFileWriteContext extends ParserRuleContext {
		public Expr expr;
		public Token STRING;
		public Token ID;
		public BlockContext block;
		public TerminalNode STRING() { return getToken(PLParser.STRING, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(PLParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(PLParser.SINGLE_QUOTE, i);
		}
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OpenFileWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openFileWrite; }
	}

	public final OpenFileWriteContext openFileWrite() throws RecognitionException {
		OpenFileWriteContext _localctx = new OpenFileWriteContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_openFileWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__25);
			setState(302);
			match(T__26);
			setState(303);
			match(T__7);
			setState(304);
			((OpenFileWriteContext)_localctx).STRING = match(STRING);
			setState(305);
			match(T__11);
			setState(306);
			match(SINGLE_QUOTE);
			setState(307);
			match(T__29);
			setState(308);
			match(SINGLE_QUOTE);
			setState(309);
			match(T__5);
			setState(310);
			match(T__28);
			setState(311);
			((OpenFileWriteContext)_localctx).ID = match(ID);
			setState(312);
			((OpenFileWriteContext)_localctx).block = block();

			        ((OpenFileWriteContext)_localctx).expr =  new OpenFileWrite((((OpenFileWriteContext)_localctx).STRING!=null?((OpenFileWriteContext)_localctx).STRING.getText():null), (((OpenFileWriteContext)_localctx).ID!=null?((OpenFileWriteContext)_localctx).ID.getText():null), ((OpenFileWriteContext)_localctx).block.expr);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenFileAppendContext extends ParserRuleContext {
		public Expr expr;
		public Token STRING;
		public Token ID;
		public BlockContext block;
		public TerminalNode STRING() { return getToken(PLParser.STRING, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(PLParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(PLParser.SINGLE_QUOTE, i);
		}
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OpenFileAppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openFileAppend; }
	}

	public final OpenFileAppendContext openFileAppend() throws RecognitionException {
		OpenFileAppendContext _localctx = new OpenFileAppendContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_openFileAppend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__25);
			setState(316);
			match(T__26);
			setState(317);
			match(T__7);
			setState(318);
			((OpenFileAppendContext)_localctx).STRING = match(STRING);
			setState(319);
			match(T__11);
			setState(320);
			match(SINGLE_QUOTE);
			setState(321);
			match(T__30);
			setState(322);
			match(SINGLE_QUOTE);
			setState(323);
			match(T__5);
			setState(324);
			match(T__28);
			setState(325);
			((OpenFileAppendContext)_localctx).ID = match(ID);
			setState(326);
			((OpenFileAppendContext)_localctx).block = block();

			        ((OpenFileAppendContext)_localctx).expr =  new OpenFileAppend((((OpenFileAppendContext)_localctx).STRING!=null?((OpenFileAppendContext)_localctx).STRING.getText():null), (((OpenFileAppendContext)_localctx).ID!=null?((OpenFileAppendContext)_localctx).ID.getText():null), ((OpenFileAppendContext)_localctx).block.expr);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadFileContext extends ParserRuleContext {
		public Expr expr;
		public Token ID;
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public ReadFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFile; }
	}

	public final ReadFileContext readFile() throws RecognitionException {
		ReadFileContext _localctx = new ReadFileContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_readFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			((ReadFileContext)_localctx).ID = match(ID);
			setState(330);
			match(T__31);

			        ((ReadFileContext)_localctx).expr =  new ReadFile((((ReadFileContext)_localctx).ID!=null?((ReadFileContext)_localctx).ID.getText():null));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WriteFileContext extends ParserRuleContext {
		public Expr expr;
		public Token ID;
		public Token STRING;
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public TerminalNode STRING() { return getToken(PLParser.STRING, 0); }
		public WriteFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeFile; }
	}

	public final WriteFileContext writeFile() throws RecognitionException {
		WriteFileContext _localctx = new WriteFileContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_writeFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			((WriteFileContext)_localctx).ID = match(ID);
			setState(334);
			match(T__32);
			setState(335);
			((WriteFileContext)_localctx).STRING = match(STRING);
			setState(336);
			match(T__5);

			        ((WriteFileContext)_localctx).expr =  new WriteFile((((WriteFileContext)_localctx).ID!=null?((WriteFileContext)_localctx).ID.getText():null), (((WriteFileContext)_localctx).STRING!=null?((WriteFileContext)_localctx).STRING.getText():null));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u0154\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u00001\b\u0000"+
		"\u000b\u0000\f\u00002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001=\b\u0001"+
		"\n\u0001\f\u0001@\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0005\u0002G\b\u0002\n\u0002\f\u0002J\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002P\b\u0002\n\u0002\f\u0002"+
		"S\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"Y\b\u0002\n\u0002\f\u0002\\\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002b\b\u0002\n\u0002\f\u0002e\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002k\b\u0002\n\u0002\f\u0002"+
		"n\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"t\b\u0002\n\u0002\f\u0002w\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002}\b\u0002\n\u0002\f\u0002\u0080\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0086\b\u0002\n"+
		"\u0002\f\u0002\u0089\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u008f\b\u0002\n\u0002\f\u0002\u0092\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0098\b\u0002\n\u0002"+
		"\f\u0002\u009b\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u009f\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c3\b\u0007"+
		"\n\u0007\f\u0007\u00c6\t\u0007\u0003\u0007\u00c8\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00d0\b\b\n\b\f\b\u00d3\t\b"+
		"\u0003\b\u00d5\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e4\b\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00f9\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u010b\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u011e\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000"+
		"\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*\u0000\u0001\u0001\u0000\u0010\u0013\u0162\u0000"+
		",\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u0004\u009e\u0001"+
		"\u0000\u0000\u0000\u0006\u00a0\u0001\u0000\u0000\u0000\b\u00a5\u0001\u0000"+
		"\u0000\u0000\n\u00aa\u0001\u0000\u0000\u0000\f\u00b5\u0001\u0000\u0000"+
		"\u0000\u000e\u00c7\u0001\u0000\u0000\u0000\u0010\u00d4\u0001\u0000\u0000"+
		"\u0000\u0012\u00d6\u0001\u0000\u0000\u0000\u0014\u00dc\u0001\u0000\u0000"+
		"\u0000\u0016\u00f8\u0001\u0000\u0000\u0000\u0018\u00fa\u0001\u0000\u0000"+
		"\u0000\u001a\u00ff\u0001\u0000\u0000\u0000\u001c\u010a\u0001\u0000\u0000"+
		"\u0000\u001e\u010c\u0001\u0000\u0000\u0000 \u011d\u0001\u0000\u0000\u0000"+
		"\"\u011f\u0001\u0000\u0000\u0000$\u012d\u0001\u0000\u0000\u0000&\u013b"+
		"\u0001\u0000\u0000\u0000(\u0149\u0001\u0000\u0000\u0000*\u014d\u0001\u0000"+
		"\u0000\u0000,0\u0006\u0000\uffff\uffff\u0000-.\u0003\u0004\u0002\u0000"+
		"./\u0006\u0000\uffff\uffff\u0000/1\u0001\u0000\u0000\u00000-\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0005\u0000\u0000\u0001"+
		"56\u0006\u0000\uffff\uffff\u00006\u0001\u0001\u0000\u0000\u000078\u0006"+
		"\u0001\uffff\uffff\u00008>\u0005\u0001\u0000\u00009:\u0003\u0004\u0002"+
		"\u0000:;\u0006\u0001\uffff\uffff\u0000;=\u0001\u0000\u0000\u0000<9\u0001"+
		"\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000AB\u0005\u0002\u0000\u0000BC\u0006\u0001\uffff\uffff\u0000C\u0003"+
		"\u0001\u0000\u0000\u0000DH\u0003\u0006\u0003\u0000EG\u0005\u0003\u0000"+
		"\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000KL\u0006\u0002\uffff\uffff\u0000L\u009f\u0001\u0000"+
		"\u0000\u0000MQ\u0003\b\u0004\u0000NP\u0005\u0003\u0000\u0000ON\u0001\u0000"+
		"\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"TU\u0006\u0002\uffff\uffff\u0000U\u009f\u0001\u0000\u0000\u0000VZ\u0003"+
		"\n\u0005\u0000WY\u0005\u0003\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\"+
		"\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0006\u0002"+
		"\uffff\uffff\u0000^\u009f\u0001\u0000\u0000\u0000_c\u0003\f\u0006\u0000"+
		"`b\u0005\u0003\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0006\u0002\uffff\uffff\u0000"+
		"g\u009f\u0001\u0000\u0000\u0000hl\u0003\u0012\t\u0000ik\u0005\u0003\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000op\u0006\u0002\uffff\uffff\u0000p\u009f\u0001\u0000"+
		"\u0000\u0000qu\u0003\u0014\n\u0000rt\u0005\u0003\u0000\u0000sr\u0001\u0000"+
		"\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000"+
		"xy\u0006\u0002\uffff\uffff\u0000y\u009f\u0001\u0000\u0000\u0000z~\u0003"+
		"\"\u0011\u0000{}\u0005\u0003\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0080"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0006\u0002\uffff\uffff\u0000\u0082\u009f\u0001\u0000"+
		"\u0000\u0000\u0083\u0087\u0003$\u0012\u0000\u0084\u0086\u0005\u0003\u0000"+
		"\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0006\u0002\uffff\uffff\u0000\u008b\u009f\u0001\u0000"+
		"\u0000\u0000\u008c\u0090\u0003&\u0013\u0000\u008d\u008f\u0005\u0003\u0000"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0006\u0002\uffff\uffff\u0000\u0094\u009f\u0001\u0000"+
		"\u0000\u0000\u0095\u0099\u0003*\u0015\u0000\u0096\u0098\u0005\u0003\u0000"+
		"\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0006\u0002\uffff\uffff\u0000\u009d\u009f\u0001\u0000"+
		"\u0000\u0000\u009eD\u0001\u0000\u0000\u0000\u009eM\u0001\u0000\u0000\u0000"+
		"\u009eV\u0001\u0000\u0000\u0000\u009e_\u0001\u0000\u0000\u0000\u009eh"+
		"\u0001\u0000\u0000\u0000\u009eq\u0001\u0000\u0000\u0000\u009ez\u0001\u0000"+
		"\u0000\u0000\u009e\u0083\u0001\u0000\u0000\u0000\u009e\u008c\u0001\u0000"+
		"\u0000\u0000\u009e\u0095\u0001\u0000\u0000\u0000\u009f\u0005\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005\"\u0000\u0000\u00a1\u00a2\u0005\u0004\u0000"+
		"\u0000\u00a2\u00a3\u0003\u0016\u000b\u0000\u00a3\u00a4\u0006\u0003\uffff"+
		"\uffff\u0000\u00a4\u0007\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0005"+
		"\u0000\u0000\u00a6\u00a7\u0003\u0016\u000b\u0000\u00a7\u00a8\u0005\u0006"+
		"\u0000\u0000\u00a8\u00a9\u0006\u0004\uffff\uffff\u0000\u00a9\t\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005\u0007\u0000\u0000\u00ab\u00ac\u0005\b\u0000"+
		"\u0000\u00ac\u00ad\u0005\"\u0000\u0000\u00ad\u00ae\u0005\t\u0000\u0000"+
		"\u00ae\u00af\u0005$\u0000\u0000\u00af\u00b0\u0005\n\u0000\u0000\u00b0"+
		"\u00b1\u0005$\u0000\u0000\u00b1\u00b2\u0005\u0006\u0000\u0000\u00b2\u00b3"+
		"\u0003\u0002\u0001\u0000\u00b3\u00b4\u0006\u0005\uffff\uffff\u0000\u00b4"+
		"\u000b\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u000b\u0000\u0000\u00b6"+
		"\u00b7\u0005\"\u0000\u0000\u00b7\u00b8\u0005\b\u0000\u0000\u00b8\u00b9"+
		"\u0003\u000e\u0007\u0000\u00b9\u00ba\u0005\u0006\u0000\u0000\u00ba\u00bb"+
		"\u0003\u0002\u0001\u0000\u00bb\u00bc\u0006\u0006\uffff\uffff\u0000\u00bc"+
		"\r\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\"\u0000\u0000\u00be\u00c4"+
		"\u0006\u0007\uffff\uffff\u0000\u00bf\u00c0\u0005\f\u0000\u0000\u00c0\u00c1"+
		"\u0005\"\u0000\u0000\u00c1\u00c3\u0006\u0007\uffff\uffff\u0000\u00c2\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u000f"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003\u0016\u000b\u0000\u00ca\u00d1"+
		"\u0006\b\uffff\uffff\u0000\u00cb\u00cc\u0005\f\u0000\u0000\u00cc\u00cd"+
		"\u0003\u0016\u000b\u0000\u00cd\u00ce\u0006\b\uffff\uffff\u0000\u00ce\u00d0"+
		"\u0001\u0000\u0000\u0000\u00cf\u00cb\u0001\u0000\u0000\u0000\u00d0\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d4\u00c9\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u0011\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0005\"\u0000\u0000\u00d7\u00d8\u0005\b\u0000\u0000\u00d8\u00d9\u0003"+
		"\u0010\b\u0000\u00d9\u00da\u0005\u0006\u0000\u0000\u00da\u00db\u0006\t"+
		"\uffff\uffff\u0000\u00db\u0013\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005"+
		"\r\u0000\u0000\u00dd\u00de\u0005\b\u0000\u0000\u00de\u00df\u0003\u001e"+
		"\u000f\u0000\u00df\u00e0\u0005\u0006\u0000\u0000\u00e0\u00e3\u0003\u0002"+
		"\u0001\u0000\u00e1\u00e2\u0005\u000e\u0000\u0000\u00e2\u00e4\u0003\u0002"+
		"\u0001\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0006\n\uffff"+
		"\uffff\u0000\u00e6\u0015\u0001\u0000\u0000\u0000\u00e7\u00e8\u0003\u001c"+
		"\u000e\u0000\u00e8\u00e9\u0006\u000b\uffff\uffff\u0000\u00e9\u00f9\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0003\u001a\r\u0000\u00eb\u00ec\u0006\u000b"+
		"\uffff\uffff\u0000\u00ec\u00f9\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003"+
		"\u0018\f\u0000\u00ee\u00ef\u0006\u000b\uffff\uffff\u0000\u00ef\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0003(\u0014\u0000\u00f1\u00f2\u0006\u000b"+
		"\uffff\uffff\u0000\u00f2\u00f9\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005"+
		"\b\u0000\u0000\u00f4\u00f5\u0003\u0016\u000b\u0000\u00f5\u00f6\u0005\u0006"+
		"\u0000\u0000\u00f6\u00f7\u0006\u000b\uffff\uffff\u0000\u00f7\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f8\u00e7\u0001\u0000\u0000\u0000\u00f8\u00ea\u0001"+
		"\u0000\u0000\u0000\u00f8\u00ed\u0001\u0000\u0000\u0000\u00f8\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f3\u0001\u0000\u0000\u0000\u00f9\u0017\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0003\u001c\u000e\u0000\u00fb\u00fc\u0005"+
		"\u000f\u0000\u0000\u00fc\u00fd\u0003\u0016\u000b\u0000\u00fd\u00fe\u0006"+
		"\f\uffff\uffff\u0000\u00fe\u0019\u0001\u0000\u0000\u0000\u00ff\u0100\u0003"+
		"\u001c\u000e\u0000\u0100\u0101\u0007\u0000\u0000\u0000\u0101\u0102\u0003"+
		"\u001c\u000e\u0000\u0102\u0103\u0006\r\uffff\uffff\u0000\u0103\u001b\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0005#\u0000\u0000\u0105\u010b\u0006\u000e"+
		"\uffff\uffff\u0000\u0106\u0107\u0005\"\u0000\u0000\u0107\u010b\u0006\u000e"+
		"\uffff\uffff\u0000\u0108\u0109\u0005$\u0000\u0000\u0109\u010b\u0006\u000e"+
		"\uffff\uffff\u0000\u010a\u0104\u0001\u0000\u0000\u0000\u010a\u0106\u0001"+
		"\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u001d\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0003\u0016\u000b\u0000\u010d\u010e\u0003"+
		" \u0010\u0000\u010e\u010f\u0003\u0016\u000b\u0000\u010f\u0110\u0006\u000f"+
		"\uffff\uffff\u0000\u0110\u001f\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		"\u0014\u0000\u0000\u0112\u011e\u0006\u0010\uffff\uffff\u0000\u0113\u0114"+
		"\u0005\u0015\u0000\u0000\u0114\u011e\u0006\u0010\uffff\uffff\u0000\u0115"+
		"\u0116\u0005\u0016\u0000\u0000\u0116\u011e\u0006\u0010\uffff\uffff\u0000"+
		"\u0117\u0118\u0005\u0017\u0000\u0000\u0118\u011e\u0006\u0010\uffff\uffff"+
		"\u0000\u0119\u011a\u0005\u0018\u0000\u0000\u011a\u011e\u0006\u0010\uffff"+
		"\uffff\u0000\u011b\u011c\u0005\u0019\u0000\u0000\u011c\u011e\u0006\u0010"+
		"\uffff\uffff\u0000\u011d\u0111\u0001\u0000\u0000\u0000\u011d\u0113\u0001"+
		"\u0000\u0000\u0000\u011d\u0115\u0001\u0000\u0000\u0000\u011d\u0117\u0001"+
		"\u0000\u0000\u0000\u011d\u0119\u0001\u0000\u0000\u0000\u011d\u011b\u0001"+
		"\u0000\u0000\u0000\u011e!\u0001\u0000\u0000\u0000\u011f\u0120\u0005\u001a"+
		"\u0000\u0000\u0120\u0121\u0005\u001b\u0000\u0000\u0121\u0122\u0005\b\u0000"+
		"\u0000\u0122\u0123\u0005#\u0000\u0000\u0123\u0124\u0005\f\u0000\u0000"+
		"\u0124\u0125\u0005%\u0000\u0000\u0125\u0126\u0005\u001c\u0000\u0000\u0126"+
		"\u0127\u0005%\u0000\u0000\u0127\u0128\u0005\u0006\u0000\u0000\u0128\u0129"+
		"\u0005\u001d\u0000\u0000\u0129\u012a\u0005\"\u0000\u0000\u012a\u012b\u0003"+
		"\u0002\u0001\u0000\u012b\u012c\u0006\u0011\uffff\uffff\u0000\u012c#\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0005\u001a\u0000\u0000\u012e\u012f\u0005"+
		"\u001b\u0000\u0000\u012f\u0130\u0005\b\u0000\u0000\u0130\u0131\u0005#"+
		"\u0000\u0000\u0131\u0132\u0005\f\u0000\u0000\u0132\u0133\u0005%\u0000"+
		"\u0000\u0133\u0134\u0005\u001e\u0000\u0000\u0134\u0135\u0005%\u0000\u0000"+
		"\u0135\u0136\u0005\u0006\u0000\u0000\u0136\u0137\u0005\u001d\u0000\u0000"+
		"\u0137\u0138\u0005\"\u0000\u0000\u0138\u0139\u0003\u0002\u0001\u0000\u0139"+
		"\u013a\u0006\u0012\uffff\uffff\u0000\u013a%\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0005\u001a\u0000\u0000\u013c\u013d\u0005\u001b\u0000\u0000\u013d"+
		"\u013e\u0005\b\u0000\u0000\u013e\u013f\u0005#\u0000\u0000\u013f\u0140"+
		"\u0005\f\u0000\u0000\u0140\u0141\u0005%\u0000\u0000\u0141\u0142\u0005"+
		"\u001f\u0000\u0000\u0142\u0143\u0005%\u0000\u0000\u0143\u0144\u0005\u0006"+
		"\u0000\u0000\u0144\u0145\u0005\u001d\u0000\u0000\u0145\u0146\u0005\"\u0000"+
		"\u0000\u0146\u0147\u0003\u0002\u0001\u0000\u0147\u0148\u0006\u0013\uffff"+
		"\uffff\u0000\u0148\'\u0001\u0000\u0000\u0000\u0149\u014a\u0005\"\u0000"+
		"\u0000\u014a\u014b\u0005 \u0000\u0000\u014b\u014c\u0006\u0014\uffff\uffff"+
		"\u0000\u014c)\u0001\u0000\u0000\u0000\u014d\u014e\u0005\"\u0000\u0000"+
		"\u014e\u014f\u0005!\u0000\u0000\u014f\u0150\u0005#\u0000\u0000\u0150\u0151"+
		"\u0005\u0006\u0000\u0000\u0151\u0152\u0006\u0015\uffff\uffff\u0000\u0152"+
		"+\u0001\u0000\u0000\u0000\u00152>HQZclu~\u0087\u0090\u0099\u009e\u00c4"+
		"\u00c7\u00d1\u00d4\u00e3\u00f8\u010a\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}