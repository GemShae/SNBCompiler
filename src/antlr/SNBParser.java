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
		WS=1, LINE_COMMENT=2, VOID=3, TRUE=4, FALSE=5, STARTPROGRAM=6, ENDPROGRAM=7, 
		OBRACKET=8, CBRACKET=9, OCBRACE=10, CCBRACE=11, POINT=12, COMMA=13, DOUBLEQUOTE=14, 
		EQUAL=15, IF=16, THEN=17, ELSE=18, ENDIF=19, WHILE=20, DO=21, ENDWHILE=22, 
		FOR=23, ENDFOR=24, TO=25, BY=26, RETURN=27, BREAK=28, SHOW=29, OR=30, 
		AND=31, NOT=32, INTDATATYPE=33, FLOATDATATYPE=34, CHARDATATYPE=35, STRINGDATATYPE=36, 
		BOOLDATATYPE=37, SIMPLIFYOPERATORS=38, PLUSMINUSOPERATORS=39, RELATIONOPERATORS=40, 
		PLUS=41, MINUS=42, MULTIPLY=43, DIVIDE=44, MODULUS=45, POWEROPERATOR=46, 
		INT=47, FLOAT=48, BOOL=49, STRING=50, VARIABLE=51, CHAR=52, DIGIT=53;
	public static final int
		RULE_program = 0, RULE_variableDeclaration = 1, RULE_statement = 2, RULE_expressionStatement = 3, 
		RULE_printStatement = 4, RULE_expression = 5, RULE_sumExpression = 6, 
		RULE_multiplyExpression = 7, RULE_unaryExpression = 8, RULE_factor = 9, 
		RULE_mutable = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "variableDeclaration", "statement", "expressionStatement", 
			"printStatement", "expression", "sumExpression", "multiplyExpression", 
			"unaryExpression", "factor", "mutable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'void'", "'true'", "'false'", "'SNB'", "'BNS'", "'('", 
			"')'", "'{'", "'}'", "'.'", "','", "'\"'", "'='", "'if'", "'then'", "'else'", 
			"'endif'", "'while'", "'do'", "'endwhile'", "'for'", "'endfor'", "'to'", 
			"'by'", "'return'", "'break'", "'show'", "'or'", "'and'", "'not'", "'int'", 
			"'float'", "'char'", "'string'", "'bool'", null, null, null, "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LINE_COMMENT", "VOID", "TRUE", "FALSE", "STARTPROGRAM", 
			"ENDPROGRAM", "OBRACKET", "CBRACKET", "OCBRACE", "CCBRACE", "POINT", 
			"COMMA", "DOUBLEQUOTE", "EQUAL", "IF", "THEN", "ELSE", "ENDIF", "WHILE", 
			"DO", "ENDWHILE", "FOR", "ENDFOR", "TO", "BY", "RETURN", "BREAK", "SHOW", 
			"OR", "AND", "NOT", "INTDATATYPE", "FLOATDATATYPE", "CHARDATATYPE", "STRINGDATATYPE", 
			"BOOLDATATYPE", "SIMPLIFYOPERATORS", "PLUSMINUSOPERATORS", "RELATIONOPERATORS", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULUS", "POWEROPERATOR", "INT", 
			"FLOAT", "BOOL", "STRING", "VARIABLE", "CHAR", "DIGIT"
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
			setState(22);
			match(STARTPROGRAM);
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(25);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTDATATYPE:
				case FLOATDATATYPE:
				case CHARDATATYPE:
				case STRINGDATATYPE:
				case BOOLDATATYPE:
					{
					setState(23);
					variableDeclaration();
					}
					break;
				case OBRACKET:
				case SHOW:
				case INT:
				case FLOAT:
				case BOOL:
				case STRING:
				case VARIABLE:
				case CHAR:
					{
					setState(24);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBRACKET) | (1L << SHOW) | (1L << INTDATATYPE) | (1L << FLOATDATATYPE) | (1L << CHARDATATYPE) | (1L << STRINGDATATYPE) | (1L << BOOLDATATYPE) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING) | (1L << VARIABLE) | (1L << CHAR))) != 0) );
			setState(29);
			match(ENDPROGRAM);
			setState(30);
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
	public static class IntegerDeclarationContext extends VariableDeclarationContext {
		public TerminalNode INTDATATYPE() { return getToken(SNBParser.INTDATATYPE, 0); }
		public TerminalNode VARIABLE() { return getToken(SNBParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(SNBParser.EQUAL, 0); }
		public TerminalNode INT() { return getToken(SNBParser.INT, 0); }
		public IntegerDeclarationContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterIntegerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitIntegerDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitIntegerDeclaration(this);
			else return visitor.visitChildren(this);
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
	public static class CharacterDeclarationContext extends VariableDeclarationContext {
		public TerminalNode CHARDATATYPE() { return getToken(SNBParser.CHARDATATYPE, 0); }
		public TerminalNode VARIABLE() { return getToken(SNBParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(SNBParser.EQUAL, 0); }
		public TerminalNode CHAR() { return getToken(SNBParser.CHAR, 0); }
		public CharacterDeclarationContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterCharacterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitCharacterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitCharacterDeclaration(this);
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
	public static class BooleanDeclarationContext extends VariableDeclarationContext {
		public TerminalNode BOOLDATATYPE() { return getToken(SNBParser.BOOLDATATYPE, 0); }
		public TerminalNode VARIABLE() { return getToken(SNBParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(SNBParser.EQUAL, 0); }
		public TerminalNode BOOL() { return getToken(SNBParser.BOOL, 0); }
		public BooleanDeclarationContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterBooleanDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitBooleanDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitBooleanDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableDeclaration);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTDATATYPE:
				_localctx = new IntegerDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(INTDATATYPE);
				setState(33);
				match(VARIABLE);
				setState(34);
				match(EQUAL);
				setState(35);
				match(INT);
				}
				break;
			case FLOATDATATYPE:
				_localctx = new FloatDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(FLOATDATATYPE);
				setState(37);
				match(VARIABLE);
				setState(38);
				match(EQUAL);
				setState(39);
				match(FLOAT);
				}
				break;
			case STRINGDATATYPE:
				_localctx = new StringDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(STRINGDATATYPE);
				setState(41);
				match(VARIABLE);
				setState(42);
				match(EQUAL);
				setState(43);
				match(STRING);
				}
				break;
			case CHARDATATYPE:
				_localctx = new CharacterDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(CHARDATATYPE);
				setState(45);
				match(VARIABLE);
				setState(46);
				match(EQUAL);
				setState(47);
				match(CHAR);
				}
				break;
			case BOOLDATATYPE:
				_localctx = new BooleanDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				match(BOOLDATATYPE);
				setState(49);
				match(VARIABLE);
				setState(50);
				match(EQUAL);
				setState(51);
				match(BOOL);
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
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACKET:
			case INT:
			case FLOAT:
			case BOOL:
			case STRING:
			case VARIABLE:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				expressionStatement();
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			expression();
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
		public List<MutableContext> mutable() {
			return getRuleContexts(MutableContext.class);
		}
		public MutableContext mutable(int i) {
			return getRuleContext(MutableContext.class,i);
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
		enterRule(_localctx, 8, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(SHOW);
			setState(61);
			mutable();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(62);
				match(COMMA);
				setState(63);
				mutable();
				}
				}
				setState(68);
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

	public static class ExpressionContext extends ParserRuleContext {
		public MutableContext mutable() {
			return getRuleContext(MutableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SNBParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SumExpressionContext sumExpression() {
			return getRuleContext(SumExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				mutable();
				setState(70);
				match(EQUAL);
				setState(71);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				sumExpression();
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

	public static class SumExpressionContext extends ParserRuleContext {
		public MultiplyExpressionContext multiplyExpression() {
			return getRuleContext(MultiplyExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SNBParser.PLUS, 0); }
		public SumExpressionContext sumExpression() {
			return getRuleContext(SumExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SNBParser.MINUS, 0); }
		public SumExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterSumExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitSumExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitSumExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumExpressionContext sumExpression() throws RecognitionException {
		SumExpressionContext _localctx = new SumExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sumExpression);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				multiplyExpression();
				setState(77);
				match(PLUS);
				setState(78);
				sumExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				multiplyExpression();
				setState(81);
				match(MINUS);
				setState(82);
				sumExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				multiplyExpression();
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

	public static class MultiplyExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(SNBParser.MULTIPLY, 0); }
		public MultiplyExpressionContext multiplyExpression() {
			return getRuleContext(MultiplyExpressionContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(SNBParser.DIVIDE, 0); }
		public MultiplyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitMultiplyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitMultiplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyExpressionContext multiplyExpression() throws RecognitionException {
		MultiplyExpressionContext _localctx = new MultiplyExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multiplyExpression);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				unaryExpression();
				setState(88);
				match(MULTIPLY);
				setState(89);
				multiplyExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				unaryExpression();
				setState(92);
				match(DIVIDE);
				setState(93);
				multiplyExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				unaryExpression();
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(SNBParser.OBRACKET, 0); }
		public SumExpressionContext sumExpression() {
			return getRuleContext(SumExpressionContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(SNBParser.CBRACKET, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryExpression);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(OBRACKET);
				setState(99);
				sumExpression();
				setState(100);
				match(CBRACKET);
				}
				break;
			case INT:
			case FLOAT:
			case BOOL:
			case STRING:
			case VARIABLE:
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public MutableContext mutable() {
			return getRuleContext(MutableContext.class,0);
		}
		public TerminalNode POWEROPERATOR() { return getToken(SNBParser.POWEROPERATOR, 0); }
		public TerminalNode INT() { return getToken(SNBParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SNBParser.FLOAT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				mutable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				mutable();
				setState(107);
				match(POWEROPERATOR);
				setState(108);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class MutableContext extends ParserRuleContext {
		public MutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutable; }
	 
		public MutableContext() { }
		public void copyFrom(MutableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerContext extends MutableContext {
		public TerminalNode INT() { return getToken(SNBParser.INT, 0); }
		public IntegerContext(MutableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends MutableContext {
		public TerminalNode FLOAT() { return getToken(SNBParser.FLOAT, 0); }
		public FloatContext(MutableContext ctx) { copyFrom(ctx); }
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
	public static class VariableContext extends MutableContext {
		public TerminalNode VARIABLE() { return getToken(SNBParser.VARIABLE, 0); }
		public VariableContext(MutableContext ctx) { copyFrom(ctx); }
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
	public static class CharacterContext extends MutableContext {
		public TerminalNode CHAR() { return getToken(SNBParser.CHAR, 0); }
		public CharacterContext(MutableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends MutableContext {
		public TerminalNode STRING() { return getToken(SNBParser.STRING, 0); }
		public StringContext(MutableContext ctx) { copyFrom(ctx); }
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
	public static class BooleanContext extends MutableContext {
		public TerminalNode BOOL() { return getToken(SNBParser.BOOL, 0); }
		public BooleanContext(MutableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MutableContext mutable() throws RecognitionException {
		MutableContext _localctx = new MutableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mutable);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(VARIABLE);
				}
				break;
			case INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(FLOAT);
				}
				break;
			case CHAR:
				_localctx = new CharacterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(CHAR);
				}
				break;
			case BOOL:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				match(BOOL);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67{\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\67"+
		"\n\3\3\4\3\4\5\4;\n\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6C\n\6\f\6\16\6F\13\6"+
		"\3\7\3\7\3\7\3\7\3\7\5\7M\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"X\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tc\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\5\nj\n\n\3\13\3\13\3\13\3\13\3\13\5\13q\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\fy\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\61\62\2\u0083\2"+
		"\30\3\2\2\2\4\66\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\n>\3\2\2\2\fL\3\2\2\2\16"+
		"W\3\2\2\2\20b\3\2\2\2\22i\3\2\2\2\24p\3\2\2\2\26x\3\2\2\2\30\33\7\b\2"+
		"\2\31\34\5\4\3\2\32\34\5\6\4\2\33\31\3\2\2\2\33\32\3\2\2\2\34\35\3\2\2"+
		"\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \7\t\2\2 !\7\2\2\3!\3"+
		"\3\2\2\2\"#\7#\2\2#$\7\65\2\2$%\7\21\2\2%\67\7\61\2\2&\'\7$\2\2\'(\7\65"+
		"\2\2()\7\21\2\2)\67\7\62\2\2*+\7&\2\2+,\7\65\2\2,-\7\21\2\2-\67\7\64\2"+
		"\2./\7%\2\2/\60\7\65\2\2\60\61\7\21\2\2\61\67\7\66\2\2\62\63\7\'\2\2\63"+
		"\64\7\65\2\2\64\65\7\21\2\2\65\67\7\63\2\2\66\"\3\2\2\2\66&\3\2\2\2\66"+
		"*\3\2\2\2\66.\3\2\2\2\66\62\3\2\2\2\67\5\3\2\2\28;\5\b\5\29;\5\n\6\2:"+
		"8\3\2\2\2:9\3\2\2\2;\7\3\2\2\2<=\5\f\7\2=\t\3\2\2\2>?\7\37\2\2?D\5\26"+
		"\f\2@A\7\17\2\2AC\5\26\f\2B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\13"+
		"\3\2\2\2FD\3\2\2\2GH\5\26\f\2HI\7\21\2\2IJ\5\f\7\2JM\3\2\2\2KM\5\16\b"+
		"\2LG\3\2\2\2LK\3\2\2\2M\r\3\2\2\2NO\5\20\t\2OP\7+\2\2PQ\5\16\b\2QX\3\2"+
		"\2\2RS\5\20\t\2ST\7,\2\2TU\5\16\b\2UX\3\2\2\2VX\5\20\t\2WN\3\2\2\2WR\3"+
		"\2\2\2WV\3\2\2\2X\17\3\2\2\2YZ\5\22\n\2Z[\7-\2\2[\\\5\20\t\2\\c\3\2\2"+
		"\2]^\5\22\n\2^_\7.\2\2_`\5\20\t\2`c\3\2\2\2ac\5\22\n\2bY\3\2\2\2b]\3\2"+
		"\2\2ba\3\2\2\2c\21\3\2\2\2de\7\n\2\2ef\5\16\b\2fg\7\13\2\2gj\3\2\2\2h"+
		"j\5\24\13\2id\3\2\2\2ih\3\2\2\2j\23\3\2\2\2kq\5\26\f\2lm\5\26\f\2mn\7"+
		"\60\2\2no\t\2\2\2oq\3\2\2\2pk\3\2\2\2pl\3\2\2\2q\25\3\2\2\2ry\7\65\2\2"+
		"sy\7\61\2\2ty\7\62\2\2uy\7\66\2\2vy\7\63\2\2wy\7\64\2\2xr\3\2\2\2xs\3"+
		"\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\27\3\2\2\2\r\33\35\66"+
		":DLWbipx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}