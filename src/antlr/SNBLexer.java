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
		WS=1, LINE_COMMENT=2, STARTPROGRAM=3, ENDPROGRAM=4, SHOW=5, FLOATDATATYPE=6, 
		STRINGDATATYPE=7, OBRACKET=8, CBRACKET=9, OCBRACE=10, CCBRACE=11, POINT=12, 
		COMMA=13, DOUBLEQUOTE=14, EQUAL=15, PLUS=16, MINUS=17, MULTIPLY=18, DIVIDE=19, 
		MODULUS=20, POWEROPERATOR=21, INT=22, FLOAT=23, STRING=24, VARIABLE=25, 
		DIGIT=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "LINE_COMMENT", "STARTPROGRAM", "ENDPROGRAM", "SHOW", "FLOATDATATYPE", 
			"STRINGDATATYPE", "OBRACKET", "CBRACKET", "OCBRACE", "CCBRACE", "POINT", 
			"COMMA", "DOUBLEQUOTE", "EQUAL", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"MODULUS", "POWEROPERATOR", "INT", "FLOAT", "STRING", "VARIABLE", "DIGIT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\6\29\n\2\r\2\16\2:\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\7\3C\n\3\f\3\16\3F\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\5\27"+
		"\u0081\n\27\3\27\6\27\u0084\n\27\r\27\16\27\u0085\3\30\3\30\3\30\6\30"+
		"\u008b\n\30\r\30\16\30\u008c\3\30\3\30\6\30\u0091\n\30\r\30\16\30\u0092"+
		"\3\30\3\30\3\30\3\30\5\30\u0099\n\30\3\31\3\31\7\31\u009d\n\31\f\31\16"+
		"\31\u00a0\13\31\3\31\3\31\3\32\3\32\7\32\u00a6\n\32\f\32\16\32\u00a9\13"+
		"\32\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\3\2\b\5\2\13\f\17\17\"\"\4\2\f\f\17\17\n\2\"#%(..\60\60\62=A\\"+
		"c|~~\3\2c|\6\2\62;C\\aac|\3\2\62;\2\u00b5\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\38\3\2\2\2\5>\3\2\2\2\7I\3\2\2\2\tM\3\2\2\2\13Q\3\2\2\2"+
		"\rV\3\2\2\2\17\\\3\2\2\2\21c\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27i\3\2\2"+
		"\2\31k\3\2\2\2\33m\3\2\2\2\35o\3\2\2\2\37q\3\2\2\2!s\3\2\2\2#u\3\2\2\2"+
		"%w\3\2\2\2\'y\3\2\2\2){\3\2\2\2+}\3\2\2\2-\u0080\3\2\2\2/\u0098\3\2\2"+
		"\2\61\u009a\3\2\2\2\63\u00a3\3\2\2\2\65\u00aa\3\2\2\2\679\t\2\2\28\67"+
		"\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\b\2\2\2=\4\3\2\2\2"+
		">?\7/\2\2?@\7/\2\2@D\3\2\2\2AC\n\3\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2D"+
		"E\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\b\3\2\2H\6\3\2\2\2IJ\7U\2\2JK\7P\2\2K"+
		"L\7D\2\2L\b\3\2\2\2MN\7D\2\2NO\7P\2\2OP\7U\2\2P\n\3\2\2\2QR\7u\2\2RS\7"+
		"j\2\2ST\7q\2\2TU\7y\2\2U\f\3\2\2\2VW\7h\2\2WX\7n\2\2XY\7q\2\2YZ\7c\2\2"+
		"Z[\7v\2\2[\16\3\2\2\2\\]\7u\2\2]^\7v\2\2^_\7t\2\2_`\7k\2\2`a\7p\2\2ab"+
		"\7i\2\2b\20\3\2\2\2cd\7*\2\2d\22\3\2\2\2ef\7+\2\2f\24\3\2\2\2gh\7}\2\2"+
		"h\26\3\2\2\2ij\7\177\2\2j\30\3\2\2\2kl\7\60\2\2l\32\3\2\2\2mn\7.\2\2n"+
		"\34\3\2\2\2op\7$\2\2p\36\3\2\2\2qr\7?\2\2r \3\2\2\2st\7-\2\2t\"\3\2\2"+
		"\2uv\7/\2\2v$\3\2\2\2wx\7,\2\2x&\3\2\2\2yz\7\61\2\2z(\3\2\2\2{|\7\'\2"+
		"\2|*\3\2\2\2}~\7`\2\2~,\3\2\2\2\177\u0081\5#\22\2\u0080\177\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\5\65\33\2\u0083\u0082\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		".\3\2\2\2\u0087\u0088\5-\27\2\u0088\u008a\5\31\r\2\u0089\u008b\5\65\33"+
		"\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u0099\3\2\2\2\u008e\u0090\5\31\r\2\u008f\u0091\5\65\33"+
		"\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0099\3\2\2\2\u0094\u0095\5-\27\2\u0095\u0096\5\31\r\2"+
		"\u0096\u0097\7\62\2\2\u0097\u0099\3\2\2\2\u0098\u0087\3\2\2\2\u0098\u008e"+
		"\3\2\2\2\u0098\u0094\3\2\2\2\u0099\60\3\2\2\2\u009a\u009e\5\35\17\2\u009b"+
		"\u009d\t\4\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\5\35\17\2\u00a2\62\3\2\2\2\u00a3\u00a7\t\5\2\2\u00a4\u00a6\t\6"+
		"\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\64\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\t\7\2"+
		"\2\u00ab\66\3\2\2\2\f\2:D\u0080\u0085\u008c\u0092\u0098\u009e\u00a7\3"+
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