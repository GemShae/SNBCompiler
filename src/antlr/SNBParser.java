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
		DEFINE=15, EQUAL=16, IF=17, THEN=18, ELSE=19, ENDIF=20, WHILE=21, DO=22, 
		ENDWHILE=23, FOR=24, ENDFOR=25, TO=26, BY=27, RETURN=28, BREAK=29, SHOW=30, 
		OR=31, AND=32, NOT=33, DATATYPE=34, SIMPLIFYOPERATORS=35, RELATIONOPERATORS=36, 
		SUMOPERATORS=37, MULTIPLYOPERATOR=38, POWEROPERATOR=39, NEGATIVE=40, INT=41, 
		FLOAT=42, BOOL=43, STRING=44, VARIABLE=45, CHAR=46, DIGIT=47;
	public static final int
		RULE_program = 0, RULE_variableDeclaration = 1, RULE_statement = 2, RULE_expressionStatement = 3, 
		RULE_selectStatement = 4, RULE_iterationStatement = 5, RULE_iterationRange = 6, 
		RULE_printStatement = 7, RULE_expression = 8, RULE_simpleExpression = 9, 
		RULE_andExpression = 10, RULE_unaryRelationExpression = 11, RULE_relationExpression = 12, 
		RULE_sumExpression = 13, RULE_multiplyExpression = 14, RULE_unaryExpression = 15, 
		RULE_factor = 16, RULE_mutable = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "variableDeclaration", "statement", "expressionStatement", 
			"selectStatement", "iterationStatement", "iterationRange", "printStatement", 
			"expression", "simpleExpression", "andExpression", "unaryRelationExpression", 
			"relationExpression", "sumExpression", "multiplyExpression", "unaryExpression", 
			"factor", "mutable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'void'", "'true'", "'false'", "'SNB'", "'BNS'", "'('", 
			"')'", "'{'", "'}'", "'.'", "','", "'\"'", "'def'", "'='", "'if'", "'then'", 
			"'else'", "'endif'", "'while'", "'do'", "'endwhile'", "'for'", "'endfor'", 
			"'to'", "'by'", "'return'", "'break'", "'show'", "'or'", "'and'", "'not'", 
			null, null, null, null, null, "'^'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LINE_COMMENT", "VOID", "TRUE", "FALSE", "STARTPROGRAM", 
			"ENDPROGRAM", "OBRACKET", "CBRACKET", "OCBRACE", "CCBRACE", "POINT", 
			"COMMA", "DOUBLEQUOTE", "DEFINE", "EQUAL", "IF", "THEN", "ELSE", "ENDIF", 
			"WHILE", "DO", "ENDWHILE", "FOR", "ENDFOR", "TO", "BY", "RETURN", "BREAK", 
			"SHOW", "OR", "AND", "NOT", "DATATYPE", "SIMPLIFYOPERATORS", "RELATIONOPERATORS", 
			"SUMOPERATORS", "MULTIPLYOPERATOR", "POWEROPERATOR", "NEGATIVE", "INT", 
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
			setState(36);
			match(STARTPROGRAM);
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(39);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFINE:
					{
					setState(37);
					variableDeclaration();
					}
					break;
				case OBRACKET:
				case IF:
				case WHILE:
				case FOR:
				case SHOW:
				case NOT:
				case INT:
				case FLOAT:
				case BOOL:
				case STRING:
				case VARIABLE:
				case CHAR:
					{
					setState(38);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBRACKET) | (1L << DEFINE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SHOW) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING) | (1L << VARIABLE) | (1L << CHAR))) != 0) );
			setState(43);
			match(ENDPROGRAM);
			setState(44);
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
		public TerminalNode DEFINE() { return getToken(SNBParser.DEFINE, 0); }
		public TerminalNode DATATYPE() { return getToken(SNBParser.DATATYPE, 0); }
		public TerminalNode VARIABLE() { return getToken(SNBParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(SNBParser.EQUAL, 0); }
		public TerminalNode INT() { return getToken(SNBParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SNBParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(SNBParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(SNBParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(SNBParser.BOOL, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(DEFINE);
			setState(47);
			match(DATATYPE);
			setState(48);
			match(VARIABLE);
			setState(49);
			match(EQUAL);
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
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
			case NOT:
			case INT:
			case FLOAT:
			case BOOL:
			case STRING:
			case VARIABLE:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				expressionStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				selectStatement();
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				iterationStatement();
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 4);
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

	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SNBParser.IF, 0); }
		public TerminalNode OBRACKET() { return getToken(SNBParser.OBRACKET, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(SNBParser.CBRACKET, 0); }
		public TerminalNode THEN() { return getToken(SNBParser.THEN, 0); }
		public List<TerminalNode> OCBRACE() { return getTokens(SNBParser.OCBRACE); }
		public TerminalNode OCBRACE(int i) {
			return getToken(SNBParser.OCBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> CCBRACE() { return getTokens(SNBParser.CCBRACE); }
		public TerminalNode CCBRACE(int i) {
			return getToken(SNBParser.CCBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(SNBParser.ELSE, 0); }
		public TerminalNode ENDIF() { return getToken(SNBParser.ENDIF, 0); }
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectStatement);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(IF);
				setState(61);
				match(OBRACKET);
				setState(62);
				simpleExpression(0);
				setState(63);
				match(CBRACKET);
				setState(64);
				match(THEN);
				setState(65);
				match(OCBRACE);
				setState(66);
				statement();
				setState(67);
				match(CCBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(IF);
				setState(70);
				match(OBRACKET);
				setState(71);
				simpleExpression(0);
				setState(72);
				match(CBRACKET);
				setState(73);
				match(THEN);
				setState(74);
				match(OCBRACE);
				setState(75);
				statement();
				setState(76);
				match(CCBRACE);
				setState(77);
				match(ELSE);
				setState(78);
				match(OCBRACE);
				setState(79);
				statement();
				setState(80);
				match(CCBRACE);
				setState(81);
				match(ENDIF);
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

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SNBParser.WHILE, 0); }
		public TerminalNode OBRACKET() { return getToken(SNBParser.OBRACKET, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(SNBParser.CBRACKET, 0); }
		public TerminalNode DO() { return getToken(SNBParser.DO, 0); }
		public TerminalNode OCBRACE() { return getToken(SNBParser.OCBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CCBRACE() { return getToken(SNBParser.CCBRACE, 0); }
		public TerminalNode ENDWHILE() { return getToken(SNBParser.ENDWHILE, 0); }
		public TerminalNode FOR() { return getToken(SNBParser.FOR, 0); }
		public TerminalNode VARIABLE() { return getToken(SNBParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(SNBParser.EQUAL, 0); }
		public IterationRangeContext iterationRange() {
			return getRuleContext(IterationRangeContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(SNBParser.ENDFOR, 0); }
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_iterationStatement);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(WHILE);
				setState(86);
				match(OBRACKET);
				setState(87);
				simpleExpression(0);
				setState(88);
				match(CBRACKET);
				setState(89);
				match(DO);
				setState(90);
				match(OCBRACE);
				setState(91);
				statement();
				setState(92);
				match(CCBRACE);
				setState(93);
				match(ENDWHILE);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(FOR);
				setState(96);
				match(VARIABLE);
				setState(97);
				match(EQUAL);
				setState(98);
				iterationRange();
				setState(99);
				match(DO);
				setState(100);
				match(OCBRACE);
				setState(101);
				statement();
				setState(102);
				match(CCBRACE);
				setState(103);
				match(ENDFOR);
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

	public static class IterationRangeContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(SNBParser.TO, 0); }
		public IterationRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterIterationRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitIterationRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitIterationRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationRangeContext iterationRange() throws RecognitionException {
		IterationRangeContext _localctx = new IterationRangeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_iterationRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			simpleExpression(0);
			setState(108);
			match(TO);
			setState(109);
			simpleExpression(0);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 14, RULE_printStatement);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(SHOW);
				setState(112);
				mutable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(SHOW);
				setState(114);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(SHOW);
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(116);
					mutable();
					}
					break;
				case 2:
					{
					setState(117);
					expression();
					}
					break;
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(120);
					match(COMMA);
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(121);
						mutable();
						}
						break;
					case 2:
						{
						setState(122);
						expression();
						}
						break;
					}
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
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

	public static class ExpressionContext extends ParserRuleContext {
		public MutableContext mutable() {
			return getRuleContext(MutableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SNBParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SIMPLIFYOPERATORS() { return getToken(SNBParser.SIMPLIFYOPERATORS, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
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
		enterRule(_localctx, 16, RULE_expression);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				mutable();
				setState(132);
				match(EQUAL);
				setState(133);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				mutable();
				setState(136);
				match(SIMPLIFYOPERATORS);
				setState(137);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				mutable();
				setState(140);
				match(SIMPLIFYOPERATORS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				simpleExpression(0);
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(SNBParser.OR, 0); }
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		return simpleExpression(0);
	}

	private SimpleExpressionContext simpleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, _parentState);
		SimpleExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_simpleExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(146);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
					setState(148);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(149);
					match(OR);
					setState(150);
					andExpression(0);
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public UnaryRelationExpressionContext unaryRelationExpression() {
			return getRuleContext(UnaryRelationExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SNBParser.AND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(157);
			unaryRelationExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(159);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(160);
					match(AND);
					setState(161);
					unaryRelationExpression();
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class UnaryRelationExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SNBParser.NOT, 0); }
		public UnaryRelationExpressionContext unaryRelationExpression() {
			return getRuleContext(UnaryRelationExpressionContext.class,0);
		}
		public RelationExpressionContext relationExpression() {
			return getRuleContext(RelationExpressionContext.class,0);
		}
		public UnaryRelationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryRelationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterUnaryRelationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitUnaryRelationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitUnaryRelationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryRelationExpressionContext unaryRelationExpression() throws RecognitionException {
		UnaryRelationExpressionContext _localctx = new UnaryRelationExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unaryRelationExpression);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(NOT);
				setState(168);
				unaryRelationExpression();
				}
				break;
			case OBRACKET:
			case INT:
			case FLOAT:
			case BOOL:
			case STRING:
			case VARIABLE:
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				relationExpression();
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

	public static class RelationExpressionContext extends ParserRuleContext {
		public List<SumExpressionContext> sumExpression() {
			return getRuleContexts(SumExpressionContext.class);
		}
		public SumExpressionContext sumExpression(int i) {
			return getRuleContext(SumExpressionContext.class,i);
		}
		public TerminalNode RELATIONOPERATORS() { return getToken(SNBParser.RELATIONOPERATORS, 0); }
		public RelationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).enterRelationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SNBListener ) ((SNBListener)listener).exitRelationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SNBVisitor ) return ((SNBVisitor<? extends T>)visitor).visitRelationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationExpressionContext relationExpression() throws RecognitionException {
		RelationExpressionContext _localctx = new RelationExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relationExpression);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				sumExpression(0);
				setState(173);
				match(RELATIONOPERATORS);
				setState(174);
				sumExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				sumExpression(0);
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
		public SumExpressionContext sumExpression() {
			return getRuleContext(SumExpressionContext.class,0);
		}
		public TerminalNode SUMOPERATORS() { return getToken(SNBParser.SUMOPERATORS, 0); }
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
		return sumExpression(0);
	}

	private SumExpressionContext sumExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumExpressionContext _localctx = new SumExpressionContext(_ctx, _parentState);
		SumExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_sumExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			multiplyExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sumExpression);
					setState(182);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(183);
					match(SUMOPERATORS);
					setState(184);
					multiplyExpression(0);
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class MultiplyExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplyExpressionContext multiplyExpression() {
			return getRuleContext(MultiplyExpressionContext.class,0);
		}
		public TerminalNode MULTIPLYOPERATOR() { return getToken(SNBParser.MULTIPLYOPERATOR, 0); }
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
		return multiplyExpression(0);
	}

	private MultiplyExpressionContext multiplyExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplyExpressionContext _localctx = new MultiplyExpressionContext(_ctx, _parentState);
		MultiplyExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_multiplyExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(191);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplyExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplyExpression);
					setState(193);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(194);
					match(MULTIPLYOPERATOR);
					setState(195);
					unaryExpression();
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 30, RULE_unaryExpression);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(OBRACKET);
				setState(202);
				sumExpression(0);
				setState(203);
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
				setState(205);
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
		enterRule(_localctx, 32, RULE_factor);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				mutable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				mutable();
				setState(210);
				match(POWEROPERATOR);
				setState(211);
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
		enterRule(_localctx, 34, RULE_mutable);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(VARIABLE);
				}
				break;
			case INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(FLOAT);
				}
				break;
			case CHAR:
				_localctx = new CharacterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(CHAR);
				}
				break;
			case BOOL:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				match(BOOL);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return simpleExpression_sempred((SimpleExpressionContext)_localctx, predIndex);
		case 10:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 13:
			return sumExpression_sempred((SumExpressionContext)_localctx, predIndex);
		case 14:
			return multiplyExpression_sempred((MultiplyExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean simpleExpression_sempred(SimpleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sumExpression_sempred(SumExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplyExpression_sempred(MultiplyExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00e2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\6\2*\n\2\r\2\16\2+\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6V"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\ty\n\t\3\t\3\t\3\t\5\t~\n\t\6\t\u0080\n\t\r\t\16\t\u0081\5\t\u0084\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0092\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u009a\n\13\f\13\16\13\u009d\13\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u00a5\n\f\f\f\16\f\u00a8\13\f\3\r\3\r\3\r\5\r\u00ad"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00b4\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00bc\n\17\f\17\16\17\u00bf\13\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00c7\n\20\f\20\16\20\u00ca\13\20\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00d1\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00d8\n\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u00e0\n\23\3\23\2\6\24\26\34\36\24\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$\2\4\4\2+.\60\60\3\2+,\2\u00eb\2&\3\2\2"+
		"\2\4\60\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\nU\3\2\2\2\fk\3\2\2\2\16m\3\2\2"+
		"\2\20\u0083\3\2\2\2\22\u0091\3\2\2\2\24\u0093\3\2\2\2\26\u009e\3\2\2\2"+
		"\30\u00ac\3\2\2\2\32\u00b3\3\2\2\2\34\u00b5\3\2\2\2\36\u00c0\3\2\2\2 "+
		"\u00d0\3\2\2\2\"\u00d7\3\2\2\2$\u00df\3\2\2\2&)\7\b\2\2\'*\5\4\3\2(*\5"+
		"\6\4\2)\'\3\2\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-."+
		"\7\t\2\2./\7\2\2\3/\3\3\2\2\2\60\61\7\21\2\2\61\62\7$\2\2\62\63\7/\2\2"+
		"\63\64\7\22\2\2\64\65\t\2\2\2\65\5\3\2\2\2\66;\5\b\5\2\67;\5\n\6\28;\5"+
		"\f\7\29;\5\20\t\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\7\3\2\2"+
		"\2<=\5\22\n\2=\t\3\2\2\2>?\7\23\2\2?@\7\n\2\2@A\5\24\13\2AB\7\13\2\2B"+
		"C\7\24\2\2CD\7\f\2\2DE\5\6\4\2EF\7\r\2\2FV\3\2\2\2GH\7\23\2\2HI\7\n\2"+
		"\2IJ\5\24\13\2JK\7\13\2\2KL\7\24\2\2LM\7\f\2\2MN\5\6\4\2NO\7\r\2\2OP\7"+
		"\25\2\2PQ\7\f\2\2QR\5\6\4\2RS\7\r\2\2ST\7\26\2\2TV\3\2\2\2U>\3\2\2\2U"+
		"G\3\2\2\2V\13\3\2\2\2WX\7\27\2\2XY\7\n\2\2YZ\5\24\13\2Z[\7\13\2\2[\\\7"+
		"\30\2\2\\]\7\f\2\2]^\5\6\4\2^_\7\r\2\2_`\7\31\2\2`l\3\2\2\2ab\7\32\2\2"+
		"bc\7/\2\2cd\7\22\2\2de\5\16\b\2ef\7\30\2\2fg\7\f\2\2gh\5\6\4\2hi\7\r\2"+
		"\2ij\7\33\2\2jl\3\2\2\2kW\3\2\2\2ka\3\2\2\2l\r\3\2\2\2mn\5\24\13\2no\7"+
		"\34\2\2op\5\24\13\2p\17\3\2\2\2qr\7 \2\2r\u0084\5$\23\2st\7 \2\2t\u0084"+
		"\5\22\n\2ux\7 \2\2vy\5$\23\2wy\5\22\n\2xv\3\2\2\2xw\3\2\2\2y\177\3\2\2"+
		"\2z}\7\17\2\2{~\5$\23\2|~\5\22\n\2}{\3\2\2\2}|\3\2\2\2~\u0080\3\2\2\2"+
		"\177z\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0084\3\2\2\2\u0083q\3\2\2\2\u0083s\3\2\2\2\u0083u\3\2\2\2\u0084"+
		"\21\3\2\2\2\u0085\u0086\5$\23\2\u0086\u0087\7\22\2\2\u0087\u0088\5\22"+
		"\n\2\u0088\u0092\3\2\2\2\u0089\u008a\5$\23\2\u008a\u008b\7%\2\2\u008b"+
		"\u008c\5\22\n\2\u008c\u0092\3\2\2\2\u008d\u008e\5$\23\2\u008e\u008f\7"+
		"%\2\2\u008f\u0092\3\2\2\2\u0090\u0092\5\24\13\2\u0091\u0085\3\2\2\2\u0091"+
		"\u0089\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u0090\3\2\2\2\u0092\23\3\2\2"+
		"\2\u0093\u0094\b\13\1\2\u0094\u0095\5\26\f\2\u0095\u009b\3\2\2\2\u0096"+
		"\u0097\f\4\2\2\u0097\u0098\7!\2\2\u0098\u009a\5\26\f\2\u0099\u0096\3\2"+
		"\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\25\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\b\f\1\2\u009f\u00a0\5\30\r"+
		"\2\u00a0\u00a6\3\2\2\2\u00a1\u00a2\f\4\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a5"+
		"\5\30\r\2\u00a4\u00a1\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\27\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa"+
		"\7#\2\2\u00aa\u00ad\5\30\r\2\u00ab\u00ad\5\32\16\2\u00ac\u00a9\3\2\2\2"+
		"\u00ac\u00ab\3\2\2\2\u00ad\31\3\2\2\2\u00ae\u00af\5\34\17\2\u00af\u00b0"+
		"\7&\2\2\u00b0\u00b1\5\34\17\2\u00b1\u00b4\3\2\2\2\u00b2\u00b4\5\34\17"+
		"\2\u00b3\u00ae\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\33\3\2\2\2\u00b5\u00b6"+
		"\b\17\1\2\u00b6\u00b7\5\36\20\2\u00b7\u00bd\3\2\2\2\u00b8\u00b9\f\4\2"+
		"\2\u00b9\u00ba\7\'\2\2\u00ba\u00bc\5\36\20\2\u00bb\u00b8\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\35\3\2\2"+
		"\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\b\20\1\2\u00c1\u00c2\5 \21\2\u00c2"+
		"\u00c8\3\2\2\2\u00c3\u00c4\f\4\2\2\u00c4\u00c5\7(\2\2\u00c5\u00c7\5 \21"+
		"\2\u00c6\u00c3\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\37\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\n\2\2\u00cc"+
		"\u00cd\5\34\17\2\u00cd\u00ce\7\13\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00d1"+
		"\5\"\22\2\u00d0\u00cb\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1!\3\2\2\2\u00d2"+
		"\u00d8\5$\23\2\u00d3\u00d4\5$\23\2\u00d4\u00d5\7)\2\2\u00d5\u00d6\t\3"+
		"\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8"+
		"#\3\2\2\2\u00d9\u00e0\7/\2\2\u00da\u00e0\7+\2\2\u00db\u00e0\7,\2\2\u00dc"+
		"\u00e0\7\60\2\2\u00dd\u00e0\7-\2\2\u00de\u00e0\7.\2\2\u00df\u00d9\3\2"+
		"\2\2\u00df\u00da\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0%\3\2\2\2\25)+:Ukx}\u0081\u0083"+
		"\u0091\u009b\u00a6\u00ac\u00b3\u00bd\u00c8\u00d0\u00d7\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}