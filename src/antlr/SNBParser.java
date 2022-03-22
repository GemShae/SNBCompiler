// Generated from /Users/shae/IdeaProjects/SNBLanguage/src/antlr/SNB.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SNBParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LINE_COMMENT=2, STARTPROGRAM=3, ENDPROGRAM=4, SHOW=5, FLOATDATATYPE=6, 
		STRINGDATATYPE=7, OBRACKET=8, CBRACKET=9, OCBRACE=10, CCBRACE=11, POINT=12, 
		COMMA=13, DOUBLEQUOTE=14, EQUAL=15, PLUS=16, MINUS=17, MULTIPLY=18, DIVIDE=19, 
		MODULUS=20, POWEROPERATOR=21, INT=22, FLOAT=23, STRING=24, VARIABLE=25, 
		DIGIT=26;
	public static final int
		RULE_program = 0, RULE_variableDeclaration = 1, RULE_statement = 2, RULE_printStatement = 3, 
		RULE_expressionStatement = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "variableDeclaration", "statement", "printStatement", "expressionStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'SNB'", "'BNS'", "'show'", "'float'", "'string'", 
			"'('", "')'", "'{'", "'}'", "'.'", "','", "'\"'", "'='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LINE_COMMENT", "STARTPROGRAM", "ENDPROGRAM", "SHOW", "FLOATDATATYPE", 
			"STRINGDATATYPE", "OBRACKET", "CBRACKET", "OCBRACE", "CCBRACE", "POINT", 
			"COMMA", "DOUBLEQUOTE", "EQUAL", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"MODULUS", "POWEROPERATOR", "INT", "FLOAT", "STRING", "VARIABLE", "DIGIT"
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
	public String getGrammarFileName() { return "SNB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SNBParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode STARTPROGRAM() { return getToken(SNBParser.STARTPROGRAM, 0); }
		public TerminalNode ENDPROGRAM() { return getToken(SNBParser.ENDPROGRAM, 0); }
		public TerminalNode EOF() { return getToken(SNBParser.EOF, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(STARTPROGRAM);
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(13);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FLOATDATATYPE:
				case STRINGDATATYPE:
					{
					setState(11);
					variableDeclaration();
					}
					break;
				case SHOW:
				case OBRACKET:
				case FLOAT:
				case STRING:
				case VARIABLE:
					{
					setState(12);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHOW) | (1L << FLOATDATATYPE) | (1L << STRINGDATATYPE) | (1L << OBRACKET) | (1L << FLOAT) | (1L << STRING) | (1L << VARIABLE))) != 0) );
			setState(17);
			match(ENDPROGRAM);
			setState(18);
			match(EOF);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringDeclarationContext extends VariableDeclarationContext {
		public TerminalNode STRINGDATATYPE() { return getToken(SNBParser.STRINGDATATYPE, 0); }
		public TerminalNode VARIABLE() { return getToken(SNBParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(SNBParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(SNBParser.STRING, 0); }
		public StringDeclarationContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterStringDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitStringDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitStringDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatDeclarationContext extends VariableDeclarationContext {
		public TerminalNode FLOATDATATYPE() { return getToken(SNBParser.FLOATDATATYPE, 0); }
		public TerminalNode VARIABLE() { return getToken(SNBParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(SNBParser.EQUAL, 0); }
		public TerminalNode FLOAT() { return getToken(SNBParser.FLOAT, 0); }
		public FloatDeclarationContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterFloatDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitFloatDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitFloatDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableDeclaration);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOATDATATYPE:
				_localctx = new FloatDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(FLOATDATATYPE);
				setState(21);
				match(VARIABLE);
				setState(22);
				match(EQUAL);
				setState(23);
				match(FLOAT);
				}
				break;
			case STRINGDATATYPE:
				_localctx = new StringDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(STRINGDATATYPE);
				setState(25);
				match(VARIABLE);
				setState(26);
				match(EQUAL);
				setState(27);
				match(STRING);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACKET:
			case FLOAT:
			case STRING:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				expressionStatement(0);
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				printStatement();
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SNBParser.SHOW, 0); }
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SNBParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SNBParser.COMMA, i);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(SHOW);
			setState(35);
			expressionStatement(0);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(36);
				match(COMMA);
				setState(37);
				expressionStatement(0);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	 
		public ExpressionStatementContext() { }
		public void copyFrom(ExpressionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends ExpressionStatementContext {
		public TerminalNode VARIABLE() { return getToken(SNBParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(SNBParser.EQUAL, 0); }
		public TerminalNode OBRACKET() { return getToken(SNBParser.OBRACKET, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(SNBParser.CBRACKET, 0); }
		public AssignmentContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketExpressionContext extends ExpressionStatementContext {
		public TerminalNode OBRACKET() { return getToken(SNBParser.OBRACKET, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(SNBParser.CBRACKET, 0); }
		public BracketExpressionContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterBracketExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitBracketExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitBracketExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends ExpressionStatementContext {
		public TerminalNode FLOAT() { return getToken(SNBParser.FLOAT, 0); }
		public FloatContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends ExpressionStatementContext {
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(SNBParser.MULTIPLY, 0); }
		public MultiplicationContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends ExpressionStatementContext {
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SNBParser.PLUS, 0); }
		public AdditionContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionStatementContext {
		public TerminalNode VARIABLE() { return getToken(SNBParser.VARIABLE, 0); }
		public VariableContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends ExpressionStatementContext {
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(SNBParser.MINUS, 0); }
		public SubtractionContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends ExpressionStatementContext {
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(SNBParser.DIVIDE, 0); }
		public DivisionContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentialContext extends ExpressionStatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public TerminalNode POWEROPERATOR() { return getToken(SNBParser.POWEROPERATOR, 0); }
		public TerminalNode FLOAT() { return getToken(SNBParser.FLOAT, 0); }
		public ExponentialContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterExponential(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitExponential(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitExponential(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionStatementContext {
		public TerminalNode STRING() { return getToken(SNBParser.STRING, 0); }
		public StringContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		return expressionStatement(0);
	}

	private ExpressionStatementContext expressionStatement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, _parentState);
		ExpressionStatementContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expressionStatement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(44);
				match(VARIABLE);
				setState(45);
				match(EQUAL);
				setState(46);
				match(OBRACKET);
				setState(47);
				expressionStatement(0);
				setState(48);
				match(CBRACKET);
				}
				break;
			case 2:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(OBRACKET);
				setState(51);
				expressionStatement(0);
				setState(52);
				match(CBRACKET);
				}
				break;
			case 3:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(VARIABLE);
				}
				break;
			case 4:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(FLOAT);
				}
				break;
			case 5:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(74);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExpressionStatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStatement);
						setState(59);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(60);
						match(MULTIPLY);
						setState(61);
						expressionStatement(8);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExpressionStatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStatement);
						setState(62);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(63);
						match(DIVIDE);
						setState(64);
						expressionStatement(7);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new ExpressionStatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStatement);
						setState(65);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(66);
						match(PLUS);
						setState(67);
						expressionStatement(6);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionContext(new ExpressionStatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStatement);
						setState(68);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(69);
						match(MINUS);
						setState(70);
						expressionStatement(5);
						}
						break;
					case 5:
						{
						_localctx = new ExponentialContext(new ExpressionStatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStatement);
						setState(71);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(72);
						match(POWEROPERATOR);
						setState(73);
						match(FLOAT);
						}
						break;
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expressionStatement_sempred((ExpressionStatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionStatement_sempred(ExpressionStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34R\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\6\2\20\n\2\r\2\16\2\21\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\5\4#\n\4\3\5\3"+
		"\5\3\5\3\5\7\5)\n\5\f\5\16\5,\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6<\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\6\2\3\n\7\2\4\6\b\n\2\2"+
		"\2Z\2\f\3\2\2\2\4\36\3\2\2\2\6\"\3\2\2\2\b$\3\2\2\2\n;\3\2\2\2\f\17\7"+
		"\5\2\2\r\20\5\4\3\2\16\20\5\6\4\2\17\r\3\2\2\2\17\16\3\2\2\2\20\21\3\2"+
		"\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\24\7\6\2\2\24\25\7\2"+
		"\2\3\25\3\3\2\2\2\26\27\7\b\2\2\27\30\7\33\2\2\30\31\7\21\2\2\31\37\7"+
		"\31\2\2\32\33\7\t\2\2\33\34\7\33\2\2\34\35\7\21\2\2\35\37\7\32\2\2\36"+
		"\26\3\2\2\2\36\32\3\2\2\2\37\5\3\2\2\2 #\5\n\6\2!#\5\b\5\2\" \3\2\2\2"+
		"\"!\3\2\2\2#\7\3\2\2\2$%\7\7\2\2%*\5\n\6\2&\'\7\17\2\2\')\5\n\6\2(&\3"+
		"\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\t\3\2\2\2,*\3\2\2\2-.\b\6\1\2./"+
		"\7\33\2\2/\60\7\21\2\2\60\61\7\n\2\2\61\62\5\n\6\2\62\63\7\13\2\2\63<"+
		"\3\2\2\2\64\65\7\n\2\2\65\66\5\n\6\2\66\67\7\13\2\2\67<\3\2\2\28<\7\33"+
		"\2\29<\7\31\2\2:<\7\32\2\2;-\3\2\2\2;\64\3\2\2\2;8\3\2\2\2;9\3\2\2\2;"+
		":\3\2\2\2<N\3\2\2\2=>\f\t\2\2>?\7\24\2\2?M\5\n\6\n@A\f\b\2\2AB\7\25\2"+
		"\2BM\5\n\6\tCD\f\7\2\2DE\7\22\2\2EM\5\n\6\bFG\f\6\2\2GH\7\23\2\2HM\5\n"+
		"\6\7IJ\f\n\2\2JK\7\27\2\2KM\7\31\2\2L=\3\2\2\2L@\3\2\2\2LC\3\2\2\2LF\3"+
		"\2\2\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PN\3\2\2\2\n"+
		"\17\21\36\"*;LN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}