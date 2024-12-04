// Generated from Lenguaje.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, IF=23, ELSE=24, WHILE=25, 
		FOR=26, BOOL_OPERATOR=27, INTEGER=28, FLOAT=29, DOUBLE=30, STRING=31, 
		BOOL=32, NULL=33, WS=34, IDENTIFIER=35;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_ifBlock = 3, 
		RULE_elseifBlock = 4, RULE_elseBlock = 5, RULE_whileBlock = 6, RULE_forBlock = 7, 
		RULE_matrixDeclaration = 8, RULE_row = 9, RULE_indexAccess = 10, RULE_assignment = 11, 
		RULE_functionCall = 12, RULE_expression = 13, RULE_powOp = 14, RULE_sqrtOp = 15, 
		RULE_multOp = 16, RULE_addOp = 17, RULE_compareOp = 18, RULE_boolOp = 19, 
		RULE_constant = 20, RULE_block = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "statement", "ifBlock", "elseifBlock", "elseBlock", 
			"whileBlock", "forBlock", "matrixDeclaration", "row", "indexAccess", 
			"assignment", "functionCall", "expression", "powOp", "sqrtOp", "multOp", 
			"addOp", "compareOp", "boolOp", "constant", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'='", "'['", "','", "']'", "'!'", "'^'", 
			"'raiz'", "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'>'", "'<'", "'>='", 
			"'<='", "'{'", "'}'", null, null, null, null, null, null, null, null, 
			null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "IF", 
			"ELSE", "WHILE", "FOR", "BOOL_OPERATOR", "INTEGER", "FLOAT", "DOUBLE", 
			"STRING", "BOOL", "NULL", "WS", "IDENTIFIER"
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
	public String getGrammarFileName() { return "Lenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LenguajeParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(44);
				line();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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

	public static class LineContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				ifBlock();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				whileBlock();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				forBlock();
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MatrixDeclarationContext matrixDeclaration() {
			return getRuleContext(MatrixDeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(58);
				assignment();
				}
				break;
			case 2:
				{
				setState(59);
				matrixDeclaration();
				}
				break;
			case 3:
				{
				setState(60);
				functionCall();
				}
				break;
			}
			setState(63);
			match(T__0);
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LenguajeParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseifBlockContext elseifBlock() {
			return getRuleContext(ElseifBlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitIfBlock(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(IF);
			setState(66);
			match(T__1);
			setState(67);
			expression(0);
			setState(68);
			match(T__2);
			setState(69);
			block();
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(70);
				elseifBlock();
				}
				break;
			case 2:
				{
				setState(71);
				elseBlock();
				}
				break;
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

	public static class ElseifBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LenguajeParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(LenguajeParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public ElseifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterElseifBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitElseifBlock(this);
		}
	}

	public final ElseifBlockContext elseifBlock() throws RecognitionException {
		ElseifBlockContext _localctx = new ElseifBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elseifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(ELSE);
			setState(75);
			match(IF);
			setState(76);
			match(T__1);
			setState(77);
			expression(0);
			setState(78);
			match(T__2);
			setState(79);
			block();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(80);
				elseBlock();
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

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LenguajeParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitElseBlock(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(ELSE);
			setState(84);
			block();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(85);
				elseBlock();
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

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LenguajeParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitWhileBlock(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(WHILE);
			setState(89);
			match(T__1);
			setState(90);
			expression(0);
			setState(91);
			match(T__2);
			setState(92);
			block();
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

	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LenguajeParser.FOR, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitForBlock(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(FOR);
			setState(95);
			match(T__1);
			setState(96);
			assignment();
			setState(97);
			match(T__0);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << INTEGER) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << NULL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(98);
				expression(0);
				}
			}

			setState(101);
			match(T__0);
			setState(102);
			assignment();
			setState(103);
			match(T__2);
			setState(104);
			block();
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

	public static class MatrixDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LenguajeParser.IDENTIFIER, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public MatrixDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterMatrixDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitMatrixDeclaration(this);
		}
	}

	public final MatrixDeclarationContext matrixDeclaration() throws RecognitionException {
		MatrixDeclarationContext _localctx = new MatrixDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_matrixDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(IDENTIFIER);
			setState(107);
			match(T__3);
			setState(108);
			match(T__4);
			setState(109);
			row();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(110);
				match(T__5);
				setState(111);
				row();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(T__6);
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

	public static class RowContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__4);
			setState(120);
			expression(0);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(121);
				match(T__5);
				setState(122);
				expression(0);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(T__6);
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

	public static class IndexAccessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LenguajeParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IndexAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterIndexAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitIndexAccess(this);
		}
	}

	public final IndexAccessContext indexAccess() throws RecognitionException {
		IndexAccessContext _localctx = new IndexAccessContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_indexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IDENTIFIER);
			setState(131);
			match(T__4);
			setState(132);
			expression(0);
			setState(133);
			match(T__6);
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(134);
				match(T__4);
				setState(135);
				expression(0);
				setState(136);
				match(T__6);
				}
				break;
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LenguajeParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IDENTIFIER);
			setState(141);
			match(T__3);
			setState(142);
			expression(0);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LenguajeParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(IDENTIFIER);
			setState(145);
			match(T__1);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << INTEGER) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << NULL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(146);
				expression(0);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(147);
					match(T__5);
					setState(148);
					expression(0);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(156);
			match(T__2);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpresionNOContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpresionNOContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterExpresionNO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitExpresionNO(this);
		}
	}
	public static class IdentificadoresContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(LenguajeParser.IDENTIFIER, 0); }
		public IdentificadoresContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterIdentificadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitIdentificadores(this);
		}
	}
	public static class ComparativosContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public ComparativosContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterComparativos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitComparativos(this);
		}
	}
	public static class MulDivContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public MulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitMulDiv(this);
		}
	}
	public static class ParentesisContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParentesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitParentesis(this);
		}
	}
	public static class RaizContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SqrtOpContext sqrtOp() {
			return getRuleContext(SqrtOpContext.class,0);
		}
		public RaizContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterRaiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitRaiz(this);
		}
	}
	public static class IndicesContext extends ExpressionContext {
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public IndicesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterIndices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitIndices(this);
		}
	}
	public static class LlamadoFuncionesContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LlamadoFuncionesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterLlamadoFunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitLlamadoFunciones(this);
		}
	}
	public static class PotenciaContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PowOpContext powOp() {
			return getRuleContext(PowOpContext.class,0);
		}
		public PotenciaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitPotencia(this);
		}
	}
	public static class ConstantesContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitConstantes(this);
		}
	}
	public static class SumaRestaContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public SumaRestaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterSumaResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitSumaResta(this);
		}
	}
	public static class BooleanosContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public BooleanosContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterBooleanos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitBooleanos(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ConstantesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(159);
				constant();
				}
				break;
			case 2:
				{
				_localctx = new IdentificadoresContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				_localctx = new IndicesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				indexAccess();
				}
				break;
			case 4:
				{
				_localctx = new LlamadoFuncionesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				functionCall();
				}
				break;
			case 5:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(T__1);
				setState(164);
				expression(0);
				setState(165);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new ExpresionNOContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(T__7);
				setState(168);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PotenciaContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(172);
						powOp();
						setState(173);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new RaizContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(176);
						sqrtOp();
						setState(177);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(180);
						multOp();
						setState(181);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new SumaRestaContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(184);
						addOp();
						setState(185);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ComparativosContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(188);
						compareOp();
						setState(189);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new BooleanosContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(192);
						boolOp();
						setState(193);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(199);
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

	public static class PowOpContext extends ParserRuleContext {
		public PowOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterPowOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitPowOp(this);
		}
	}

	public final PowOpContext powOp() throws RecognitionException {
		PowOpContext _localctx = new PowOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_powOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__8);
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

	public static class SqrtOpContext extends ParserRuleContext {
		public SqrtOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrtOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterSqrtOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitSqrtOp(this);
		}
	}

	public final SqrtOpContext sqrtOp() throws RecognitionException {
		SqrtOpContext _localctx = new SqrtOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sqrtOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__9);
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

	public static class MultOpContext extends ParserRuleContext {
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitMultOp(this);
		}
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
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

	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitAddOp(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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

	public static class CompareOpContext extends ParserRuleContext {
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterCompareOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitCompareOp(this);
		}
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
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

	public static class BoolOpContext extends ParserRuleContext {
		public TerminalNode BOOL_OPERATOR() { return getToken(LenguajeParser.BOOL_OPERATOR, 0); }
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitBoolOp(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boolOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(BOOL_OPERATOR);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(LenguajeParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(LenguajeParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(LenguajeParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(LenguajeParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(LenguajeParser.BOOL, 0); }
		public TerminalNode NULL() { return getToken(LenguajeParser.NULL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << NULL))) != 0)) ) {
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

	public static class BlockContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__20);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(215);
				line();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(T__21);
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
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00e2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\5\4@\n\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6T\n\6\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\5\tf\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\ns\n\n\f"+
		"\n\16\nv\13\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13~\n\13\f\13\16\13\u0081"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008d\n\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u0098\n\16\f\16\16\16\u009b\13"+
		"\16\5\16\u009d\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00ac\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00c6\n\17\f\17\16\17\u00c9\13\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\7\27\u00db"+
		"\n\27\f\27\16\27\u00de\13\27\3\27\3\27\3\27\2\3\34\30\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,\2\6\3\2\r\16\3\2\17\20\3\2\21\26\3\2\36"+
		"#\2\u00e7\2\61\3\2\2\2\4:\3\2\2\2\6?\3\2\2\2\bC\3\2\2\2\nL\3\2\2\2\fU"+
		"\3\2\2\2\16Z\3\2\2\2\20`\3\2\2\2\22l\3\2\2\2\24y\3\2\2\2\26\u0084\3\2"+
		"\2\2\30\u008e\3\2\2\2\32\u0092\3\2\2\2\34\u00ab\3\2\2\2\36\u00ca\3\2\2"+
		"\2 \u00cc\3\2\2\2\"\u00ce\3\2\2\2$\u00d0\3\2\2\2&\u00d2\3\2\2\2(\u00d4"+
		"\3\2\2\2*\u00d6\3\2\2\2,\u00d8\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\63\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\2\2"+
		"\3\65\3\3\2\2\2\66;\5\6\4\2\67;\5\b\5\28;\5\16\b\29;\5\20\t\2:\66\3\2"+
		"\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\5\3\2\2\2<@\5\30\r\2=@\5\22\n\2"+
		">@\5\32\16\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@A\3\2\2\2AB\7\3\2\2B\7\3\2"+
		"\2\2CD\7\31\2\2DE\7\4\2\2EF\5\34\17\2FG\7\5\2\2GJ\5,\27\2HK\5\n\6\2IK"+
		"\5\f\7\2JH\3\2\2\2JI\3\2\2\2JK\3\2\2\2K\t\3\2\2\2LM\7\32\2\2MN\7\31\2"+
		"\2NO\7\4\2\2OP\5\34\17\2PQ\7\5\2\2QS\5,\27\2RT\5\f\7\2SR\3\2\2\2ST\3\2"+
		"\2\2T\13\3\2\2\2UV\7\32\2\2VX\5,\27\2WY\5\f\7\2XW\3\2\2\2XY\3\2\2\2Y\r"+
		"\3\2\2\2Z[\7\33\2\2[\\\7\4\2\2\\]\5\34\17\2]^\7\5\2\2^_\5,\27\2_\17\3"+
		"\2\2\2`a\7\34\2\2ab\7\4\2\2bc\5\30\r\2ce\7\3\2\2df\5\34\17\2ed\3\2\2\2"+
		"ef\3\2\2\2fg\3\2\2\2gh\7\3\2\2hi\5\30\r\2ij\7\5\2\2jk\5,\27\2k\21\3\2"+
		"\2\2lm\7%\2\2mn\7\6\2\2no\7\7\2\2ot\5\24\13\2pq\7\b\2\2qs\5\24\13\2rp"+
		"\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\t\2\2x"+
		"\23\3\2\2\2yz\7\7\2\2z\177\5\34\17\2{|\7\b\2\2|~\5\34\17\2}{\3\2\2\2~"+
		"\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0082\u0083\7\t\2\2\u0083\25\3\2\2\2\u0084\u0085\7%\2\2\u0085"+
		"\u0086\7\7\2\2\u0086\u0087\5\34\17\2\u0087\u008c\7\t\2\2\u0088\u0089\7"+
		"\7\2\2\u0089\u008a\5\34\17\2\u008a\u008b\7\t\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u0088\3\2\2\2\u008c\u008d\3\2\2\2\u008d\27\3\2\2\2\u008e\u008f\7%\2\2"+
		"\u008f\u0090\7\6\2\2\u0090\u0091\5\34\17\2\u0091\31\3\2\2\2\u0092\u0093"+
		"\7%\2\2\u0093\u009c\7\4\2\2\u0094\u0099\5\34\17\2\u0095\u0096\7\b\2\2"+
		"\u0096\u0098\5\34\17\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u0094\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\5"+
		"\2\2\u009f\33\3\2\2\2\u00a0\u00a1\b\17\1\2\u00a1\u00ac\5*\26\2\u00a2\u00ac"+
		"\7%\2\2\u00a3\u00ac\5\26\f\2\u00a4\u00ac\5\32\16\2\u00a5\u00a6\7\4\2\2"+
		"\u00a6\u00a7\5\34\17\2\u00a7\u00a8\7\5\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00aa"+
		"\7\n\2\2\u00aa\u00ac\5\34\17\t\u00ab\u00a0\3\2\2\2\u00ab\u00a2\3\2\2\2"+
		"\u00ab\u00a3\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00c7\3\2\2\2\u00ad\u00ae\f\b\2\2\u00ae\u00af\5\36\20\2"+
		"\u00af\u00b0\5\34\17\t\u00b0\u00c6\3\2\2\2\u00b1\u00b2\f\7\2\2\u00b2\u00b3"+
		"\5 \21\2\u00b3\u00b4\5\34\17\b\u00b4\u00c6\3\2\2\2\u00b5\u00b6\f\6\2\2"+
		"\u00b6\u00b7\5\"\22\2\u00b7\u00b8\5\34\17\7\u00b8\u00c6\3\2\2\2\u00b9"+
		"\u00ba\f\5\2\2\u00ba\u00bb\5$\23\2\u00bb\u00bc\5\34\17\6\u00bc\u00c6\3"+
		"\2\2\2\u00bd\u00be\f\4\2\2\u00be\u00bf\5&\24\2\u00bf\u00c0\5\34\17\5\u00c0"+
		"\u00c6\3\2\2\2\u00c1\u00c2\f\3\2\2\u00c2\u00c3\5(\25\2\u00c3\u00c4\5\34"+
		"\17\4\u00c4\u00c6\3\2\2\2\u00c5\u00ad\3\2\2\2\u00c5\u00b1\3\2\2\2\u00c5"+
		"\u00b5\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00c1\3\2"+
		"\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\35\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\13\2\2\u00cb\37\3\2\2\2"+
		"\u00cc\u00cd\7\f\2\2\u00cd!\3\2\2\2\u00ce\u00cf\t\2\2\2\u00cf#\3\2\2\2"+
		"\u00d0\u00d1\t\3\2\2\u00d1%\3\2\2\2\u00d2\u00d3\t\4\2\2\u00d3\'\3\2\2"+
		"\2\u00d4\u00d5\7\35\2\2\u00d5)\3\2\2\2\u00d6\u00d7\t\5\2\2\u00d7+\3\2"+
		"\2\2\u00d8\u00dc\7\27\2\2\u00d9\u00db\5\4\3\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\30\2\2\u00e0-\3\2\2\2\22\61:?J"+
		"SXet\177\u008c\u0099\u009c\u00ab\u00c5\u00c7\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}