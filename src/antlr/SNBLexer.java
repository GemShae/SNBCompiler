// Generated from /Users/shae/IdeaProjects/SNBLanguage/src/antlr/SNB.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SNBLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "LINE_COMMENT", "VOID", "TRUE", "FALSE", "STARTPROGRAM", "ENDPROGRAM", 
			"OBRACKET", "CBRACKET", "OCBRACE", "CCBRACE", "POINT", "COMMA", "DOUBLEQUOTE", 
			"DEFINE", "EQUAL", "IF", "THEN", "ELSE", "ENDIF", "WHILE", "DO", "ENDWHILE", 
			"FOR", "ENDFOR", "TO", "BY", "RETURN", "BREAK", "SHOW", "OR", "AND", 
			"NOT", "DATATYPE", "SIMPLIFYOPERATORS", "RELATIONOPERATORS", "SUMOPERATORS", 
			"MULTIPLYOPERATOR", "POWEROPERATOR", "NEGATIVE", "INT", "FLOAT", "BOOL", 
			"STRING", "VARIABLE", "CHAR", "DIGIT"
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


	public SNBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SNB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u015b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\6\2c\n\2\r\2\16\2d\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#"+
		"\u0109\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0117\n$\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\5%\u0122\n%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\5*\u012d\n*\3"+
		"*\6*\u0130\n*\r*\16*\u0131\3+\3+\3+\6+\u0137\n+\r+\16+\u0138\3+\3+\6+"+
		"\u013d\n+\r+\16+\u013e\3+\5+\u0142\n+\3,\3,\5,\u0146\n,\3-\3-\7-\u014a"+
		"\n-\f-\16-\u014d\13-\3-\3-\3.\3.\7.\u0153\n.\f.\16.\u0156\13.\3/\3/\3"+
		"\60\3\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\13\5\2"+
		"\13\f\17\17\"\"\4\2\f\f\17\17\4\2>>@@\4\2--//\5\2\'\',,\61\61\3\2c|\6"+
		"\2\62;C\\aac|\4\2C\\c|\3\2\62;\2\u0172\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3b\3\2\2\2\5h\3\2\2\2\7s\3\2\2\2\tx\3"+
		"\2\2\2\13}\3\2\2\2\r\u0083\3\2\2\2\17\u0087\3\2\2\2\21\u008b\3\2\2\2\23"+
		"\u008d\3\2\2\2\25\u008f\3\2\2\2\27\u0091\3\2\2\2\31\u0093\3\2\2\2\33\u0095"+
		"\3\2\2\2\35\u0097\3\2\2\2\37\u0099\3\2\2\2!\u009d\3\2\2\2#\u009f\3\2\2"+
		"\2%\u00a2\3\2\2\2\'\u00a7\3\2\2\2)\u00ac\3\2\2\2+\u00b2\3\2\2\2-\u00b8"+
		"\3\2\2\2/\u00bb\3\2\2\2\61\u00c4\3\2\2\2\63\u00c8\3\2\2\2\65\u00cf\3\2"+
		"\2\2\67\u00d2\3\2\2\29\u00d5\3\2\2\2;\u00dc\3\2\2\2=\u00e2\3\2\2\2?\u00e7"+
		"\3\2\2\2A\u00ea\3\2\2\2C\u00ee\3\2\2\2E\u0108\3\2\2\2G\u0116\3\2\2\2I"+
		"\u0121\3\2\2\2K\u0123\3\2\2\2M\u0125\3\2\2\2O\u0127\3\2\2\2Q\u0129\3\2"+
		"\2\2S\u012c\3\2\2\2U\u0141\3\2\2\2W\u0145\3\2\2\2Y\u0147\3\2\2\2[\u0150"+
		"\3\2\2\2]\u0157\3\2\2\2_\u0159\3\2\2\2ac\t\2\2\2ba\3\2\2\2cd\3\2\2\2d"+
		"b\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\b\2\2\2g\4\3\2\2\2hi\7/\2\2ij\7/\2\2j"+
		"n\3\2\2\2km\n\3\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2"+
		"pn\3\2\2\2qr\b\3\2\2r\6\3\2\2\2st\7x\2\2tu\7q\2\2uv\7k\2\2vw\7f\2\2w\b"+
		"\3\2\2\2xy\7v\2\2yz\7t\2\2z{\7w\2\2{|\7g\2\2|\n\3\2\2\2}~\7h\2\2~\177"+
		"\7c\2\2\177\u0080\7n\2\2\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\f"+
		"\3\2\2\2\u0083\u0084\7U\2\2\u0084\u0085\7P\2\2\u0085\u0086\7D\2\2\u0086"+
		"\16\3\2\2\2\u0087\u0088\7D\2\2\u0088\u0089\7P\2\2\u0089\u008a\7U\2\2\u008a"+
		"\20\3\2\2\2\u008b\u008c\7*\2\2\u008c\22\3\2\2\2\u008d\u008e\7+\2\2\u008e"+
		"\24\3\2\2\2\u008f\u0090\7}\2\2\u0090\26\3\2\2\2\u0091\u0092\7\177\2\2"+
		"\u0092\30\3\2\2\2\u0093\u0094\7\60\2\2\u0094\32\3\2\2\2\u0095\u0096\7"+
		".\2\2\u0096\34\3\2\2\2\u0097\u0098\7$\2\2\u0098\36\3\2\2\2\u0099\u009a"+
		"\7f\2\2\u009a\u009b\7g\2\2\u009b\u009c\7h\2\2\u009c \3\2\2\2\u009d\u009e"+
		"\7?\2\2\u009e\"\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7h\2\2\u00a1$\3"+
		"\2\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"\u00a6\7p\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7n\2\2\u00a9"+
		"\u00aa\7u\2\2\u00aa\u00ab\7g\2\2\u00ab(\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7h\2\2"+
		"\u00b1*\3\2\2\2\u00b2\u00b3\7y\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7k\2"+
		"\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7g\2\2\u00b7,\3\2\2\2\u00b8\u00b9\7"+
		"f\2\2\u00b9\u00ba\7q\2\2\u00ba.\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd"+
		"\7p\2\2\u00bd\u00be\7f\2\2\u00be\u00bf\7y\2\2\u00bf\u00c0\7j\2\2\u00c0"+
		"\u00c1\7k\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7g\2\2\u00c3\60\3\2\2\2\u00c4"+
		"\u00c5\7h\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7t\2\2\u00c7\62\3\2\2\2\u00c8"+
		"\u00c9\7g\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\7h\2\2"+
		"\u00cc\u00cd\7q\2\2\u00cd\u00ce\7t\2\2\u00ce\64\3\2\2\2\u00cf\u00d0\7"+
		"v\2\2\u00d0\u00d1\7q\2\2\u00d1\66\3\2\2\2\u00d2\u00d3\7d\2\2\u00d3\u00d4"+
		"\7{\2\2\u00d48\3\2\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8"+
		"\7v\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7p\2\2\u00db"+
		":\3\2\2\2\u00dc\u00dd\7d\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7g\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00e1\7m\2\2\u00e1<\3\2\2\2\u00e2\u00e3\7u\2\2\u00e3"+
		"\u00e4\7j\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7y\2\2\u00e6>\3\2\2\2\u00e7"+
		"\u00e8\7q\2\2\u00e8\u00e9\7t\2\2\u00e9@\3\2\2\2\u00ea\u00eb\7c\2\2\u00eb"+
		"\u00ec\7p\2\2\u00ec\u00ed\7f\2\2\u00edB\3\2\2\2\u00ee\u00ef\7p\2\2\u00ef"+
		"\u00f0\7q\2\2\u00f0\u00f1\7v\2\2\u00f1D\3\2\2\2\u00f2\u00f3\7k\2\2\u00f3"+
		"\u00f4\7p\2\2\u00f4\u0109\7v\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7\7n\2\2"+
		"\u00f7\u00f8\7q\2\2\u00f8\u00f9\7c\2\2\u00f9\u0109\7v\2\2\u00fa\u00fb"+
		"\7e\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fd\7c\2\2\u00fd\u0109\7t\2\2\u00fe"+
		"\u00ff\7u\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7t\2\2\u0101\u0102\7k\2\2"+
		"\u0102\u0103\7p\2\2\u0103\u0109\7i\2\2\u0104\u0105\7d\2\2\u0105\u0106"+
		"\7q\2\2\u0106\u0107\7q\2\2\u0107\u0109\7n\2\2\u0108\u00f2\3\2\2\2\u0108"+
		"\u00f5\3\2\2\2\u0108\u00fa\3\2\2\2\u0108\u00fe\3\2\2\2\u0108\u0104\3\2"+
		"\2\2\u0109F\3\2\2\2\u010a\u010b\7-\2\2\u010b\u0117\7?\2\2\u010c\u010d"+
		"\7/\2\2\u010d\u0117\7?\2\2\u010e\u010f\7,\2\2\u010f\u0117\7?\2\2\u0110"+
		"\u0111\7\61\2\2\u0111\u0117\7?\2\2\u0112\u0113\7-\2\2\u0113\u0117\7-\2"+
		"\2\u0114\u0115\7/\2\2\u0115\u0117\7/\2\2\u0116\u010a\3\2\2\2\u0116\u010c"+
		"\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u0110\3\2\2\2\u0116\u0112\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117H\3\2\2\2\u0118\u0119\7>\2\2\u0119\u0122\7?\2\2\u011a"+
		"\u0122\t\4\2\2\u011b\u011c\7@\2\2\u011c\u0122\7?\2\2\u011d\u011e\7?\2"+
		"\2\u011e\u0122\7?\2\2\u011f\u0120\7#\2\2\u0120\u0122\7?\2\2\u0121\u0118"+
		"\3\2\2\2\u0121\u011a\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011d\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122J\3\2\2\2\u0123\u0124\t\5\2\2\u0124L\3\2\2\2\u0125"+
		"\u0126\t\6\2\2\u0126N\3\2\2\2\u0127\u0128\7`\2\2\u0128P\3\2\2\2\u0129"+
		"\u012a\7/\2\2\u012aR\3\2\2\2\u012b\u012d\5Q)\2\u012c\u012b\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0130\5_\60\2\u012f\u012e\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"T\3\2\2\2\u0133\u0134\5S*\2\u0134\u0136\5\31\r\2\u0135\u0137\5_\60\2\u0136"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u0142\3\2\2\2\u013a\u013c\5\31\r\2\u013b\u013d\5_\60\2\u013c"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0142\3\2\2\2\u0140\u0142\5S*\2\u0141\u0133\3\2\2\2\u0141\u013a"+
		"\3\2\2\2\u0141\u0140\3\2\2\2\u0142V\3\2\2\2\u0143\u0146\5\t\5\2\u0144"+
		"\u0146\5\13\6\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146X\3\2\2\2"+
		"\u0147\u014b\5\35\17\2\u0148\u014a\5]/\2\u0149\u0148\3\2\2\2\u014a\u014d"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\5\35\17\2\u014fZ\3\2\2\2\u0150\u0154\t\7\2"+
		"\2\u0151\u0153\t\b\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\\\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0158\t\t\2\2\u0158^\3\2\2\2\u0159\u015a\t\n\2\2\u015a`\3\2\2\2\20\2"+
		"dn\u0108\u0116\u0121\u012c\u0131\u0138\u013e\u0141\u0145\u014b\u0154\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}