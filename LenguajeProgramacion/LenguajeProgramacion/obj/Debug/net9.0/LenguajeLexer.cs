//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.6.6
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from C:\Users\noble\source\repos\LenguajeProgramacion\LenguajeProgramacion\Content\Lenguaje.g4 by ANTLR 4.6.6

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

namespace LenguajeProgramacion.Content {
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.6.6")]
[System.CLSCompliant(false)]
public partial class LenguajeLexer : Lexer {
	public const int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, IF=22, WHILE=23, BOOL_OPERATOR=24, 
		INTEGER=25, FLOAT=26, DOUBLE=27, STRING=28, BOOL=29, NULL=30, WS=31, IDENTIFIER=32;
	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "IF", "WHILE", "BOOL_OPERATOR", "INTEGER", 
		"FLOAT", "DOUBLE", "STRING", "BOOL", "NULL", "WS", "IDENTIFIER"
	};


	public LenguajeLexer(ICharStream input)
		: base(input)
	{
		_interp = new LexerATNSimulator(this,_ATN);
	}

	private static readonly string[] _LiteralNames = {
		null, "';'", "'else'", "'='", "'('", "','", "')'", "'!'", "'^'", "'raiz'", 
		"'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", 
		"'{'", "'}'", "'si'", null, null, null, null, null, null, null, "'null'"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "IF", "WHILE", 
		"BOOL_OPERATOR", "INTEGER", "FLOAT", "DOUBLE", "STRING", "BOOL", "NULL", 
		"WS", "IDENTIFIER"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[System.Obsolete("Use Vocabulary instead.")]
	public static readonly string[] tokenNames = GenerateTokenNames(DefaultVocabulary, _SymbolicNames.Length);

	private static string[] GenerateTokenNames(IVocabulary vocabulary, int length) {
		string[] tokenNames = new string[length];
		for (int i = 0; i < tokenNames.Length; i++) {
			tokenNames[i] = vocabulary.GetLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = vocabulary.GetSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}

		return tokenNames;
	}

	[System.Obsolete("Use IRecognizer.Vocabulary instead.")]
	public override string[] TokenNames
	{
		get
		{
			return tokenNames;
		}
	}

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "Lenguaje.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return _serializedATN; } }

	public static readonly string _serializedATN =
		"\x3\xAF6F\x8320\x479D\xB75C\x4880\x1605\x191C\xAB37\x2\"\xE7\b\x1\x4\x2"+
		"\t\x2\x4\x3\t\x3\x4\x4\t\x4\x4\x5\t\x5\x4\x6\t\x6\x4\a\t\a\x4\b\t\b\x4"+
		"\t\t\t\x4\n\t\n\x4\v\t\v\x4\f\t\f\x4\r\t\r\x4\xE\t\xE\x4\xF\t\xF\x4\x10"+
		"\t\x10\x4\x11\t\x11\x4\x12\t\x12\x4\x13\t\x13\x4\x14\t\x14\x4\x15\t\x15"+
		"\x4\x16\t\x16\x4\x17\t\x17\x4\x18\t\x18\x4\x19\t\x19\x4\x1A\t\x1A\x4\x1B"+
		"\t\x1B\x4\x1C\t\x1C\x4\x1D\t\x1D\x4\x1E\t\x1E\x4\x1F\t\x1F\x4 \t \x4!"+
		"\t!\x3\x2\x3\x2\x3\x3\x3\x3\x3\x3\x3\x3\x3\x3\x3\x4\x3\x4\x3\x5\x3\x5"+
		"\x3\x6\x3\x6\x3\a\x3\a\x3\b\x3\b\x3\t\x3\t\x3\n\x3\n\x3\n\x3\n\x3\n\x3"+
		"\v\x3\v\x3\f\x3\f\x3\r\x3\r\x3\xE\x3\xE\x3\xF\x3\xF\x3\xF\x3\x10\x3\x10"+
		"\x3\x10\x3\x11\x3\x11\x3\x12\x3\x12\x3\x13\x3\x13\x3\x13\x3\x14\x3\x14"+
		"\x3\x14\x3\x15\x3\x15\x3\x16\x3\x16\x3\x17\x3\x17\x3\x17\x3\x18\x3\x18"+
		"\x3\x18\x3\x18\x3\x18\x3\x18\x3\x18\x3\x18\x3\x18\x3\x18\x3\x18\x3\x18"+
		"\x3\x18\x5\x18\x88\n\x18\x3\x19\x3\x19\x3\x19\x3\x19\x3\x19\x3\x19\x3"+
		"\x19\x3\x19\x5\x19\x92\n\x19\x3\x1A\x6\x1A\x95\n\x1A\r\x1A\xE\x1A\x96"+
		"\x3\x1B\x6\x1B\x9A\n\x1B\r\x1B\xE\x1B\x9B\x3\x1B\x3\x1B\x6\x1B\xA0\n\x1B"+
		"\r\x1B\xE\x1B\xA1\x3\x1C\x6\x1C\xA5\n\x1C\r\x1C\xE\x1C\xA6\x3\x1C\x3\x1C"+
		"\x6\x1C\xAB\n\x1C\r\x1C\xE\x1C\xAC\x3\x1C\x3\x1C\x5\x1C\xB1\n\x1C\x3\x1C"+
		"\x6\x1C\xB4\n\x1C\r\x1C\xE\x1C\xB5\x3\x1D\x3\x1D\a\x1D\xBA\n\x1D\f\x1D"+
		"\xE\x1D\xBD\v\x1D\x3\x1D\x3\x1D\x3\x1D\a\x1D\xC2\n\x1D\f\x1D\xE\x1D\xC5"+
		"\v\x1D\x3\x1D\x5\x1D\xC8\n\x1D\x3\x1E\x3\x1E\x3\x1E\x3\x1E\x3\x1E\x3\x1E"+
		"\x3\x1E\x3\x1E\x3\x1E\x5\x1E\xD3\n\x1E\x3\x1F\x3\x1F\x3\x1F\x3\x1F\x3"+
		"\x1F\x3 \x6 \xDB\n \r \xE \xDC\x3 \x3 \x3!\x3!\a!\xE3\n!\f!\xE!\xE6\v"+
		"!\x2\x2\x2\"\x3\x2\x3\x5\x2\x4\a\x2\x5\t\x2\x6\v\x2\a\r\x2\b\xF\x2\t\x11"+
		"\x2\n\x13\x2\v\x15\x2\f\x17\x2\r\x19\x2\xE\x1B\x2\xF\x1D\x2\x10\x1F\x2"+
		"\x11!\x2\x12#\x2\x13%\x2\x14\'\x2\x15)\x2\x16+\x2\x17-\x2\x18/\x2\x19"+
		"\x31\x2\x1A\x33\x2\x1B\x35\x2\x1C\x37\x2\x1D\x39\x2\x1E;\x2\x1F=\x2 ?"+
		"\x2!\x41\x2\"\x3\x2\t\x3\x2\x32;\x4\x2GGgg\x4\x2--//\x3\x2$$\x3\x2))\x5"+
		"\x2\v\f\xF\xF\"\"\x6\x2\x32;\x43\\\x61\x61\x63|\xF6\x2\x3\x3\x2\x2\x2"+
		"\x2\x5\x3\x2\x2\x2\x2\a\x3\x2\x2\x2\x2\t\x3\x2\x2\x2\x2\v\x3\x2\x2\x2"+
		"\x2\r\x3\x2\x2\x2\x2\xF\x3\x2\x2\x2\x2\x11\x3\x2\x2\x2\x2\x13\x3\x2\x2"+
		"\x2\x2\x15\x3\x2\x2\x2\x2\x17\x3\x2\x2\x2\x2\x19\x3\x2\x2\x2\x2\x1B\x3"+
		"\x2\x2\x2\x2\x1D\x3\x2\x2\x2\x2\x1F\x3\x2\x2\x2\x2!\x3\x2\x2\x2\x2#\x3"+
		"\x2\x2\x2\x2%\x3\x2\x2\x2\x2\'\x3\x2\x2\x2\x2)\x3\x2\x2\x2\x2+\x3\x2\x2"+
		"\x2\x2-\x3\x2\x2\x2\x2/\x3\x2\x2\x2\x2\x31\x3\x2\x2\x2\x2\x33\x3\x2\x2"+
		"\x2\x2\x35\x3\x2\x2\x2\x2\x37\x3\x2\x2\x2\x2\x39\x3\x2\x2\x2\x2;\x3\x2"+
		"\x2\x2\x2=\x3\x2\x2\x2\x2?\x3\x2\x2\x2\x2\x41\x3\x2\x2\x2\x3\x43\x3\x2"+
		"\x2\x2\x5\x45\x3\x2\x2\x2\aJ\x3\x2\x2\x2\tL\x3\x2\x2\x2\vN\x3\x2\x2\x2"+
		"\rP\x3\x2\x2\x2\xFR\x3\x2\x2\x2\x11T\x3\x2\x2\x2\x13V\x3\x2\x2\x2\x15"+
		"[\x3\x2\x2\x2\x17]\x3\x2\x2\x2\x19_\x3\x2\x2\x2\x1B\x61\x3\x2\x2\x2\x1D"+
		"\x63\x3\x2\x2\x2\x1F\x66\x3\x2\x2\x2!i\x3\x2\x2\x2#k\x3\x2\x2\x2%m\x3"+
		"\x2\x2\x2\'p\x3\x2\x2\x2)s\x3\x2\x2\x2+u\x3\x2\x2\x2-w\x3\x2\x2\x2/\x87"+
		"\x3\x2\x2\x2\x31\x91\x3\x2\x2\x2\x33\x94\x3\x2\x2\x2\x35\x99\x3\x2\x2"+
		"\x2\x37\xA4\x3\x2\x2\x2\x39\xC7\x3\x2\x2\x2;\xD2\x3\x2\x2\x2=\xD4\x3\x2"+
		"\x2\x2?\xDA\x3\x2\x2\x2\x41\xE0\x3\x2\x2\x2\x43\x44\a=\x2\x2\x44\x4\x3"+
		"\x2\x2\x2\x45\x46\ag\x2\x2\x46G\an\x2\x2GH\au\x2\x2HI\ag\x2\x2I\x6\x3"+
		"\x2\x2\x2JK\a?\x2\x2K\b\x3\x2\x2\x2LM\a*\x2\x2M\n\x3\x2\x2\x2NO\a.\x2"+
		"\x2O\f\x3\x2\x2\x2PQ\a+\x2\x2Q\xE\x3\x2\x2\x2RS\a#\x2\x2S\x10\x3\x2\x2"+
		"\x2TU\a`\x2\x2U\x12\x3\x2\x2\x2VW\at\x2\x2WX\a\x63\x2\x2XY\ak\x2\x2YZ"+
		"\a|\x2\x2Z\x14\x3\x2\x2\x2[\\\a,\x2\x2\\\x16\x3\x2\x2\x2]^\a\x31\x2\x2"+
		"^\x18\x3\x2\x2\x2_`\a-\x2\x2`\x1A\x3\x2\x2\x2\x61\x62\a/\x2\x2\x62\x1C"+
		"\x3\x2\x2\x2\x63\x64\a?\x2\x2\x64\x65\a?\x2\x2\x65\x1E\x3\x2\x2\x2\x66"+
		"g\a#\x2\x2gh\a?\x2\x2h \x3\x2\x2\x2ij\a@\x2\x2j\"\x3\x2\x2\x2kl\a>\x2"+
		"\x2l$\x3\x2\x2\x2mn\a@\x2\x2no\a?\x2\x2o&\x3\x2\x2\x2pq\a>\x2\x2qr\a?"+
		"\x2\x2r(\x3\x2\x2\x2st\a}\x2\x2t*\x3\x2\x2\x2uv\a\x7F\x2\x2v,\x3\x2\x2"+
		"\x2wx\au\x2\x2xy\ak\x2\x2y.\x3\x2\x2\x2z{\ao\x2\x2{|\ak\x2\x2|}\ag\x2"+
		"\x2}~\ap\x2\x2~\x7F\av\x2\x2\x7F\x80\at\x2\x2\x80\x81\a\x63\x2\x2\x81"+
		"\x88\au\x2\x2\x82\x83\aj\x2\x2\x83\x84\a\x63\x2\x2\x84\x85\au\x2\x2\x85"+
		"\x86\av\x2\x2\x86\x88\a\x63\x2\x2\x87z\x3\x2\x2\x2\x87\x82\x3\x2\x2\x2"+
		"\x88\x30\x3\x2\x2\x2\x89\x8A\a\x63\x2\x2\x8A\x8B\ap\x2\x2\x8B\x92\a\x66"+
		"\x2\x2\x8C\x8D\aq\x2\x2\x8D\x92\at\x2\x2\x8E\x8F\az\x2\x2\x8F\x90\aq\x2"+
		"\x2\x90\x92\at\x2\x2\x91\x89\x3\x2\x2\x2\x91\x8C\x3\x2\x2\x2\x91\x8E\x3"+
		"\x2\x2\x2\x92\x32\x3\x2\x2\x2\x93\x95\t\x2\x2\x2\x94\x93\x3\x2\x2\x2\x95"+
		"\x96\x3\x2\x2\x2\x96\x94\x3\x2\x2\x2\x96\x97\x3\x2\x2\x2\x97\x34\x3\x2"+
		"\x2\x2\x98\x9A\t\x2\x2\x2\x99\x98\x3\x2\x2\x2\x9A\x9B\x3\x2\x2\x2\x9B"+
		"\x99\x3\x2\x2\x2\x9B\x9C\x3\x2\x2\x2\x9C\x9D\x3\x2\x2\x2\x9D\x9F\a\x30"+
		"\x2\x2\x9E\xA0\t\x2\x2\x2\x9F\x9E\x3\x2\x2\x2\xA0\xA1\x3\x2\x2\x2\xA1"+
		"\x9F\x3\x2\x2\x2\xA1\xA2\x3\x2\x2\x2\xA2\x36\x3\x2\x2\x2\xA3\xA5\t\x2"+
		"\x2\x2\xA4\xA3\x3\x2\x2\x2\xA5\xA6\x3\x2\x2\x2\xA6\xA4\x3\x2\x2\x2\xA6"+
		"\xA7\x3\x2\x2\x2\xA7\xA8\x3\x2\x2\x2\xA8\xAA\a\x30\x2\x2\xA9\xAB\t\x2"+
		"\x2\x2\xAA\xA9\x3\x2\x2\x2\xAB\xAC\x3\x2\x2\x2\xAC\xAA\x3\x2\x2\x2\xAC"+
		"\xAD\x3\x2\x2\x2\xAD\xAE\x3\x2\x2\x2\xAE\xB0\t\x3\x2\x2\xAF\xB1\t\x4\x2"+
		"\x2\xB0\xAF\x3\x2\x2\x2\xB0\xB1\x3\x2\x2\x2\xB1\xB3\x3\x2\x2\x2\xB2\xB4"+
		"\t\x2\x2\x2\xB3\xB2\x3\x2\x2\x2\xB4\xB5\x3\x2\x2\x2\xB5\xB3\x3\x2\x2\x2"+
		"\xB5\xB6\x3\x2\x2\x2\xB6\x38\x3\x2\x2\x2\xB7\xBB\a$\x2\x2\xB8\xBA\n\x5"+
		"\x2\x2\xB9\xB8\x3\x2\x2\x2\xBA\xBD\x3\x2\x2\x2\xBB\xB9\x3\x2\x2\x2\xBB"+
		"\xBC\x3\x2\x2\x2\xBC\xBE\x3\x2\x2\x2\xBD\xBB\x3\x2\x2\x2\xBE\xC8\a$\x2"+
		"\x2\xBF\xC3\a)\x2\x2\xC0\xC2\n\x6\x2\x2\xC1\xC0\x3\x2\x2\x2\xC2\xC5\x3"+
		"\x2\x2\x2\xC3\xC1\x3\x2\x2\x2\xC3\xC4\x3\x2\x2\x2\xC4\xC6\x3\x2\x2\x2"+
		"\xC5\xC3\x3\x2\x2\x2\xC6\xC8\a)\x2\x2\xC7\xB7\x3\x2\x2\x2\xC7\xBF\x3\x2"+
		"\x2\x2\xC8:\x3\x2\x2\x2\xC9\xCA\av\x2\x2\xCA\xCB\at\x2\x2\xCB\xCC\aw\x2"+
		"\x2\xCC\xD3\ag\x2\x2\xCD\xCE\ah\x2\x2\xCE\xCF\a\x63\x2\x2\xCF\xD0\an\x2"+
		"\x2\xD0\xD1\au\x2\x2\xD1\xD3\ag\x2\x2\xD2\xC9\x3\x2\x2\x2\xD2\xCD\x3\x2"+
		"\x2\x2\xD3<\x3\x2\x2\x2\xD4\xD5\ap\x2\x2\xD5\xD6\aw\x2\x2\xD6\xD7\an\x2"+
		"\x2\xD7\xD8\an\x2\x2\xD8>\x3\x2\x2\x2\xD9\xDB\t\a\x2\x2\xDA\xD9\x3\x2"+
		"\x2\x2\xDB\xDC\x3\x2\x2\x2\xDC\xDA\x3\x2\x2\x2\xDC\xDD\x3\x2\x2\x2\xDD"+
		"\xDE\x3\x2\x2\x2\xDE\xDF\b \x2\x2\xDF@\x3\x2\x2\x2\xE0\xE4\t\b\x2\x2\xE1"+
		"\xE3\t\b\x2\x2\xE2\xE1\x3\x2\x2\x2\xE3\xE6\x3\x2\x2\x2\xE4\xE2\x3\x2\x2"+
		"\x2\xE4\xE5\x3\x2\x2\x2\xE5\x42\x3\x2\x2\x2\xE6\xE4\x3\x2\x2\x2\x12\x2"+
		"\x87\x91\x96\x9B\xA1\xA6\xAC\xB0\xB5\xBB\xC3\xC7\xD2\xDC\xE4\x3\b\x2\x2";
	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN.ToCharArray());
}
} // namespace LenguajeProgramacion.Content
