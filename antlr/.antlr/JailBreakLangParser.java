// Generated from /home/lenovo/Projects/Int/Interpreter-Project/antlr/JailBreakLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JailBreakLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, EQUALS=30, NOT_EQUALS=31, 
		LESS_THAN=32, GREATER_THAN=33, LPAREN=34, RPAREN=35, MUL=36, DIV=37, ADD=38, 
		SUB=39, COMMENT=40, ID=41, RAND=42, INT=43, WS=44;
	public static final int
		RULE_start = 0, RULE_code = 1, RULE_objects = 2, RULE_variables = 3, RULE_comparison = 4, 
		RULE_expr = 5, RULE_term = 6, RULE_factor = 7, RULE_commands = 8, RULE_function_declaration = 9, 
		RULE_expressions = 10, RULE_guard_extra_code = 11, RULE_guard_control = 12, 
		RULE_booleanValue = 13, RULE_condition = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "code", "objects", "variables", "comparison", "expr", "term", 
			"factor", "commands", "function_declaration", "expressions", "guard_extra_code", 
			"guard_control", "booleanValue", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'WALL'", "'='", "','", "'TRAP'", "'KEY'", "'GATE'", "'GUARD'", 
			"'{'", "'}'", "'MAP'", "'PLAYER'", "'EXIT'", "'INT'", "'BOOLEAN'", "'IF'", 
			"'ELSE'", "'WHILE'", "'FOR'", "'IN'", "'FUN'", "'LEFT'", "'RIGHT'", "'UP'", 
			"'DOWN'", "'TRUE'", "'FALSE'", "'NOT'", "'AND'", "'OR'", "'=='", "'!='", 
			"'<'", "'>'", "'('", "')'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "EQUALS", "NOT_EQUALS", "LESS_THAN", 
			"GREATER_THAN", "LPAREN", "RPAREN", "MUL", "DIV", "ADD", "SUB", "COMMENT", 
			"ID", "RAND", "INT", "WS"
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
	public String getGrammarFileName() { return "JailBreakLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JailBreakLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JailBreakLangParser.EOF, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				code();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0) );
			setState(35);
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

	public static class CodeContext extends ParserRuleContext {
		public ObjectsContext objects() {
			return getRuleContext(ObjectsContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				objects();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				commands();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				function_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				variables();
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

	public static class ObjectsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(JailBreakLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JailBreakLangParser.ID, i);
		}
		public List<TerminalNode> RAND() { return getTokens(JailBreakLangParser.RAND); }
		public TerminalNode RAND(int i) {
			return getToken(JailBreakLangParser.RAND, i);
		}
		public List<Guard_extra_codeContext> guard_extra_code() {
			return getRuleContexts(Guard_extra_codeContext.class);
		}
		public Guard_extra_codeContext guard_extra_code(int i) {
			return getRuleContext(Guard_extra_codeContext.class,i);
		}
		public ObjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objects; }
	}

	public final ObjectsContext objects() throws RecognitionException {
		ObjectsContext _localctx = new ObjectsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_objects);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(T__0);
				setState(44);
				match(T__1);
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(45);
					expr();
					}
					break;
				case 2:
					{
					setState(46);
					match(ID);
					}
					break;
				case 3:
					{
					setState(47);
					match(RAND);
					}
					break;
				}
				setState(50);
				match(T__2);
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(51);
					expr();
					}
					break;
				case 2:
					{
					setState(52);
					match(ID);
					}
					break;
				case 3:
					{
					setState(53);
					match(RAND);
					}
					break;
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(T__3);
				setState(57);
				match(T__1);
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(58);
					expr();
					}
					break;
				case 2:
					{
					setState(59);
					match(ID);
					}
					break;
				case 3:
					{
					setState(60);
					match(RAND);
					}
					break;
				}
				setState(63);
				match(T__2);
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(64);
					expr();
					}
					break;
				case 2:
					{
					setState(65);
					match(ID);
					}
					break;
				case 3:
					{
					setState(66);
					match(RAND);
					}
					break;
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(T__4);
				setState(70);
				match(T__1);
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(71);
					expr();
					}
					break;
				case 2:
					{
					setState(72);
					match(ID);
					}
					break;
				}
				setState(75);
				match(T__2);
				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(76);
					expr();
					}
					break;
				case 2:
					{
					setState(77);
					match(ID);
					}
					break;
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(T__5);
				setState(81);
				match(T__1);
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(82);
					expr();
					}
					break;
				case 2:
					{
					setState(83);
					match(ID);
					}
					break;
				}
				setState(86);
				match(T__2);
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(87);
					expr();
					}
					break;
				case 2:
					{
					setState(88);
					match(ID);
					}
					break;
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				match(T__6);
				setState(92);
				match(T__1);
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(93);
					expr();
					}
					break;
				case 2:
					{
					setState(94);
					match(ID);
					}
					break;
				}
				setState(97);
				match(T__2);
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(98);
					expr();
					}
					break;
				case 2:
					{
					setState(99);
					match(ID);
					}
					break;
				}
				setState(102);
				match(T__2);
				setState(103);
				expr();
				setState(104);
				match(T__7);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) {
					{
					{
					setState(105);
					guard_extra_code();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				match(T__9);
				setState(114);
				match(T__1);
				setState(115);
				expr();
				setState(116);
				match(T__2);
				setState(117);
				expr();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				match(T__10);
				setState(120);
				match(T__1);
				setState(121);
				expr();
				setState(122);
				match(T__2);
				setState(123);
				expr();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(125);
				match(T__11);
				setState(126);
				match(T__1);
				setState(127);
				expr();
				setState(128);
				match(T__2);
				setState(129);
				expr();
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JailBreakLangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(T__12);
				setState(134);
				match(ID);
				setState(135);
				match(T__1);
				setState(136);
				expr();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(ID);
				setState(138);
				match(T__1);
				setState(139);
				expr();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(T__13);
				setState(141);
				match(ID);
				setState(142);
				match(T__1);
				setState(143);
				condition(0);
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(JailBreakLangParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(JailBreakLangParser.NOT_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(JailBreakLangParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(JailBreakLangParser.GREATER_THAN, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			expr();
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << GREATER_THAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(148);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(JailBreakLangParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(JailBreakLangParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(JailBreakLangParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(JailBreakLangParser.SUB, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			term();
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(152);
					term();
					}
					} 
				}
				setState(157);
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
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(JailBreakLangParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(JailBreakLangParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(JailBreakLangParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(JailBreakLangParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			factor();
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					_la = _input.LA(1);
					if ( !(_la==MUL || _la==DIV) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(160);
					factor();
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JailBreakLangParser.ID, 0); }
		public TerminalNode INT() { return getToken(JailBreakLangParser.INT, 0); }
		public TerminalNode LPAREN() { return getToken(JailBreakLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JailBreakLangParser.RPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(INT);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(LPAREN);
				setState(169);
				expr();
				setState(170);
				match(RPAREN);
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

	public static class CommandsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JailBreakLangParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JailBreakLangParser.RPAREN, 0); }
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(JailBreakLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JailBreakLangParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commands);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__14);
				setState(175);
				match(LPAREN);
				setState(176);
				condition(0);
				setState(177);
				match(RPAREN);
				setState(178);
				match(T__7);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
					{
					{
					setState(179);
					expressions();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(T__8);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(186);
					match(T__15);
					setState(187);
					match(T__7);
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
						{
						{
						setState(188);
						expressions();
						}
						}
						setState(193);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(194);
					match(T__8);
					}
				}

				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(T__16);
				setState(198);
				match(LPAREN);
				setState(199);
				condition(0);
				setState(200);
				match(RPAREN);
				setState(201);
				match(T__7);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
					{
					{
					setState(202);
					expressions();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				match(T__8);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(T__17);
				setState(211);
				match(LPAREN);
				setState(212);
				match(ID);
				setState(213);
				match(T__18);
				setState(214);
				expr();
				setState(215);
				match(RPAREN);
				setState(216);
				match(T__7);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
					{
					{
					setState(217);
					expressions();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				match(T__8);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(ID);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(226);
					match(LPAREN);
					setState(227);
					match(ID);
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(228);
						match(T__2);
						setState(229);
						match(ID);
						}
						}
						setState(234);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(235);
					match(RPAREN);
					}
				}

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

	public static class Function_declarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JailBreakLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JailBreakLangParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(JailBreakLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JailBreakLangParser.RPAREN, 0); }
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__19);
			setState(241);
			match(ID);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(242);
				match(LPAREN);
				setState(243);
				match(ID);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(244);
					match(T__2);
					setState(245);
					match(ID);
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251);
				match(RPAREN);
				}
			}

			setState(254);
			match(T__7);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				{
				setState(255);
				expressions();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
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

	public static class ExpressionsContext extends ParserRuleContext {
		public ObjectsContext objects() {
			return getRuleContext(ObjectsContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressions);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				objects();
				}
				break;
			case T__14:
			case T__16:
			case T__17:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				commands();
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

	public static class Guard_extra_codeContext extends ParserRuleContext {
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public Guard_controlContext guard_control() {
			return getRuleContext(Guard_controlContext.class,0);
		}
		public Guard_extra_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_extra_code; }
	}

	public final Guard_extra_codeContext guard_extra_code() throws RecognitionException {
		Guard_extra_codeContext _localctx = new Guard_extra_codeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_guard_extra_code);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__16:
			case T__17:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				commands();
				}
				break;
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				guard_control();
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

	public static class Guard_controlContext extends ParserRuleContext {
		public Guard_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_control; }
	}

	public final Guard_controlContext guard_control() throws RecognitionException {
		Guard_controlContext _localctx = new Guard_controlContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_guard_control);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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

	public static class BooleanValueContext extends ParserRuleContext {
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JailBreakLangParser.LPAREN, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JailBreakLangParser.RPAREN, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(276);
				match(LPAREN);
				setState(277);
				condition(0);
				setState(278);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(280);
				match(T__26);
				setState(281);
				condition(5);
				}
				break;
			case 3:
				{
				setState(282);
				booleanValue();
				}
				break;
			case 4:
				{
				setState(283);
				comparison();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(292);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(286);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(287);
						match(T__27);
						setState(288);
						condition(5);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(289);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(290);
						match(T__28);
						setState(291);
						condition(4);
						}
						break;
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		case 14:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u012c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16"+
		"\2#\3\2\3\2\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3"+
		"\4\3\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\3\4\3\4\3\4\5"+
		"\4F\n\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\4\3\4\3\4\5\4Q\n\4\3\4\3\4\3\4\3\4"+
		"\5\4W\n\4\3\4\3\4\3\4\5\4\\\n\4\3\4\3\4\3\4\3\4\5\4b\n\4\3\4\3\4\3\4\5"+
		"\4g\n\4\3\4\3\4\3\4\3\4\7\4m\n\4\f\4\16\4p\13\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0086\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0093\n\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\7\7\u009c\n\7\f\7\16\7\u009f\13\7\3\b\3\b\3\b\7\b\u00a4"+
		"\n\b\f\b\16\b\u00a7\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00af\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u00b7\n\n\f\n\16\n\u00ba\13\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00c0\n\n\f\n\16\n\u00c3\13\n\3\n\5\n\u00c6\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u00ce\n\n\f\n\16\n\u00d1\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u00dd\n\n\f\n\16\n\u00e0\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7"+
		"\n\u00e9\n\n\f\n\16\n\u00ec\13\n\3\n\5\n\u00ef\n\n\5\n\u00f1\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00f9\n\13\f\13\16\13\u00fc\13\13\3\13"+
		"\5\13\u00ff\n\13\3\13\3\13\7\13\u0103\n\13\f\13\16\13\u0106\13\13\3\13"+
		"\3\13\3\f\3\f\5\f\u010c\n\f\3\r\3\r\5\r\u0110\n\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u011f\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u0127\n\20\f\20\16\20\u012a\13\20\3\20\2\3\36"+
		"\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\7\3\2 #\3\2()\3\2&\'\3\2"+
		"\27\32\3\2\33\34\2\u0150\2!\3\2\2\2\4+\3\2\2\2\6\u0085\3\2\2\2\b\u0092"+
		"\3\2\2\2\n\u0094\3\2\2\2\f\u0098\3\2\2\2\16\u00a0\3\2\2\2\20\u00ae\3\2"+
		"\2\2\22\u00f0\3\2\2\2\24\u00f2\3\2\2\2\26\u010b\3\2\2\2\30\u010f\3\2\2"+
		"\2\32\u0111\3\2\2\2\34\u0113\3\2\2\2\36\u011e\3\2\2\2 \"\5\4\3\2! \3\2"+
		"\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7\2\2\3&\3\3\2\2\2\',"+
		"\5\6\4\2(,\5\22\n\2),\5\24\13\2*,\5\b\5\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2"+
		"\2+*\3\2\2\2,\5\3\2\2\2-.\7\3\2\2.\62\7\4\2\2/\63\5\f\7\2\60\63\7+\2\2"+
		"\61\63\7,\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64"+
		"8\7\5\2\2\659\5\f\7\2\669\7+\2\2\679\7,\2\28\65\3\2\2\28\66\3\2\2\28\67"+
		"\3\2\2\29\u0086\3\2\2\2:;\7\6\2\2;?\7\4\2\2<@\5\f\7\2=@\7+\2\2>@\7,\2"+
		"\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@A\3\2\2\2AE\7\5\2\2BF\5\f\7\2CF\7+\2"+
		"\2DF\7,\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\u0086\3\2\2\2GH\7\7\2\2HK\7"+
		"\4\2\2IL\5\f\7\2JL\7+\2\2KI\3\2\2\2KJ\3\2\2\2LM\3\2\2\2MP\7\5\2\2NQ\5"+
		"\f\7\2OQ\7+\2\2PN\3\2\2\2PO\3\2\2\2Q\u0086\3\2\2\2RS\7\b\2\2SV\7\4\2\2"+
		"TW\5\f\7\2UW\7+\2\2VT\3\2\2\2VU\3\2\2\2WX\3\2\2\2X[\7\5\2\2Y\\\5\f\7\2"+
		"Z\\\7+\2\2[Y\3\2\2\2[Z\3\2\2\2\\\u0086\3\2\2\2]^\7\t\2\2^a\7\4\2\2_b\5"+
		"\f\7\2`b\7+\2\2a_\3\2\2\2a`\3\2\2\2bc\3\2\2\2cf\7\5\2\2dg\5\f\7\2eg\7"+
		"+\2\2fd\3\2\2\2fe\3\2\2\2gh\3\2\2\2hi\7\5\2\2ij\5\f\7\2jn\7\n\2\2km\5"+
		"\30\r\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr"+
		"\7\13\2\2r\u0086\3\2\2\2st\7\f\2\2tu\7\4\2\2uv\5\f\7\2vw\7\5\2\2wx\5\f"+
		"\7\2x\u0086\3\2\2\2yz\7\r\2\2z{\7\4\2\2{|\5\f\7\2|}\7\5\2\2}~\5\f\7\2"+
		"~\u0086\3\2\2\2\177\u0080\7\16\2\2\u0080\u0081\7\4\2\2\u0081\u0082\5\f"+
		"\7\2\u0082\u0083\7\5\2\2\u0083\u0084\5\f\7\2\u0084\u0086\3\2\2\2\u0085"+
		"-\3\2\2\2\u0085:\3\2\2\2\u0085G\3\2\2\2\u0085R\3\2\2\2\u0085]\3\2\2\2"+
		"\u0085s\3\2\2\2\u0085y\3\2\2\2\u0085\177\3\2\2\2\u0086\7\3\2\2\2\u0087"+
		"\u0088\7\17\2\2\u0088\u0089\7+\2\2\u0089\u008a\7\4\2\2\u008a\u0093\5\f"+
		"\7\2\u008b\u008c\7+\2\2\u008c\u008d\7\4\2\2\u008d\u0093\5\f\7\2\u008e"+
		"\u008f\7\20\2\2\u008f\u0090\7+\2\2\u0090\u0091\7\4\2\2\u0091\u0093\5\36"+
		"\20\2\u0092\u0087\3\2\2\2\u0092\u008b\3\2\2\2\u0092\u008e\3\2\2\2\u0093"+
		"\t\3\2\2\2\u0094\u0095\5\f\7\2\u0095\u0096\t\2\2\2\u0096\u0097\5\f\7\2"+
		"\u0097\13\3\2\2\2\u0098\u009d\5\16\b\2\u0099\u009a\t\3\2\2\u009a\u009c"+
		"\5\16\b\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e\r\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a5\5"+
		"\20\t\2\u00a1\u00a2\t\4\2\2\u00a2\u00a4\5\20\t\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\17\3\2\2"+
		"\2\u00a7\u00a5\3\2\2\2\u00a8\u00af\7+\2\2\u00a9\u00af\7-\2\2\u00aa\u00ab"+
		"\7$\2\2\u00ab\u00ac\5\f\7\2\u00ac\u00ad\7%\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00a8\3\2\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af\21\3\2\2"+
		"\2\u00b0\u00b1\7\21\2\2\u00b1\u00b2\7$\2\2\u00b2\u00b3\5\36\20\2\u00b3"+
		"\u00b4\7%\2\2\u00b4\u00b8\7\n\2\2\u00b5\u00b7\5\26\f\2\u00b6\u00b5\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00c5\7\13\2\2\u00bc\u00bd\7"+
		"\22\2\2\u00bd\u00c1\7\n\2\2\u00be\u00c0\5\26\f\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\7\13\2\2\u00c5\u00bc\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00f1\3\2\2\2\u00c7\u00c8\7\23\2\2\u00c8\u00c9\7"+
		"$\2\2\u00c9\u00ca\5\36\20\2\u00ca\u00cb\7%\2\2\u00cb\u00cf\7\n\2\2\u00cc"+
		"\u00ce\5\26\f\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\7\13\2\2\u00d3\u00f1\3\2\2\2\u00d4\u00d5\7\24\2\2\u00d5\u00d6\7"+
		"$\2\2\u00d6\u00d7\7+\2\2\u00d7\u00d8\7\25\2\2\u00d8\u00d9\5\f\7\2\u00d9"+
		"\u00da\7%\2\2\u00da\u00de\7\n\2\2\u00db\u00dd\5\26\f\2\u00dc\u00db\3\2"+
		"\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\13\2\2\u00e2\u00f1\3"+
		"\2\2\2\u00e3\u00ee\7+\2\2\u00e4\u00e5\7$\2\2\u00e5\u00ea\7+\2\2\u00e6"+
		"\u00e7\7\5\2\2\u00e7\u00e9\7+\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ef\7%\2\2\u00ee\u00e4\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00b0\3\2\2\2\u00f0\u00c7\3\2\2\2\u00f0"+
		"\u00d4\3\2\2\2\u00f0\u00e3\3\2\2\2\u00f1\23\3\2\2\2\u00f2\u00f3\7\26\2"+
		"\2\u00f3\u00fe\7+\2\2\u00f4\u00f5\7$\2\2\u00f5\u00fa\7+\2\2\u00f6\u00f7"+
		"\7\5\2\2\u00f7\u00f9\7+\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u00ff\7%\2\2\u00fe\u00f4\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0104\7\n\2\2\u0101\u0103\5\26\f\2\u0102\u0101\3"+
		"\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\13\2\2\u0108\25\3\2\2"+
		"\2\u0109\u010c\5\6\4\2\u010a\u010c\5\22\n\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010a\3\2\2\2\u010c\27\3\2\2\2\u010d\u0110\5\22\n\2\u010e\u0110\5\32"+
		"\16\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\31\3\2\2\2\u0111\u0112"+
		"\t\5\2\2\u0112\33\3\2\2\2\u0113\u0114\t\6\2\2\u0114\35\3\2\2\2\u0115\u0116"+
		"\b\20\1\2\u0116\u0117\7$\2\2\u0117\u0118\5\36\20\2\u0118\u0119\7%\2\2"+
		"\u0119\u011f\3\2\2\2\u011a\u011b\7\35\2\2\u011b\u011f\5\36\20\7\u011c"+
		"\u011f\5\34\17\2\u011d\u011f\5\n\6\2\u011e\u0115\3\2\2\2\u011e\u011a\3"+
		"\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0128\3\2\2\2\u0120"+
		"\u0121\f\6\2\2\u0121\u0122\7\36\2\2\u0122\u0127\5\36\20\7\u0123\u0124"+
		"\f\5\2\2\u0124\u0125\7\37\2\2\u0125\u0127\5\36\20\6\u0126\u0120\3\2\2"+
		"\2\u0126\u0123\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\37\3\2\2\2\u012a\u0128\3\2\2\2$#+\628?EKPV[afn\u0085\u0092"+
		"\u009d\u00a5\u00ae\u00b8\u00c1\u00c5\u00cf\u00de\u00ea\u00ee\u00f0\u00fa"+
		"\u00fe\u0104\u010b\u010f\u011e\u0126\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}