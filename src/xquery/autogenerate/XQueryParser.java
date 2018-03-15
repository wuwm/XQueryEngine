// Generated from /Users/wuwenyi/XQueryEngine/src/xquery/autogenerate/XQuery.g4 by ANTLR 4.7
package xquery.autogenerate;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, StringConstant=33, VEQ=34, IEQ=35, ID=36, FILENAME=37, WHITESPACE=38;
	public static final int
		RULE_xq = 0, RULE_joinClause = 1, RULE_idList = 2, RULE_var = 3, RULE_forClause = 4, 
		RULE_letClause = 5, RULE_whereClause = 6, RULE_returnClause = 7, RULE_cond = 8, 
		RULE_ap = 9, RULE_rp = 10, RULE_f = 11, RULE_tagName = 12, RULE_attName = 13, 
		RULE_filename = 14;
	public static final String[] ruleNames = {
		"xq", "joinClause", "idList", "var", "forClause", "letClause", "whereClause", 
		"returnClause", "cond", "ap", "rp", "f", "tagName", "attName", "filename"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'/'", "'//'", "'<'", "'>'", "'{'", "'}'", 
		"'return'", "'join'", "'['", "']'", "'$'", "'for'", "'in'", "'let'", "':='", 
		"'where'", "'empty'", "'some'", "'satisfies'", "'and'", "'or'", "'not'", 
		"'doc(\"'", "'\")'", "'*'", "'.'", "'..'", "'text()'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "StringConstant", 
		"VEQ", "IEQ", "ID", "FILENAME", "WHITESPACE"
	};
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
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Xq_StringConstantContext extends XqContext {
		public TerminalNode StringConstant() { return getToken(XQueryParser.StringConstant, 0); }
		public Xq_StringConstantContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_StringConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_IDxqIDContext extends XqContext {
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Xq_IDxqIDContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_IDxqID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_xqCxqContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public Xq_xqCxqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_xqCxq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_xqSxqContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Xq_xqSxqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_xqSxq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_xqSSxqContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Xq_xqSSxqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_xqSSxq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_LETxqContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Xq_LETxqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_LETxq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_apContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public Xq_apContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_ap(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_varContext extends XqContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Xq_varContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_PxqPContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Xq_PxqPContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_PxqP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_JoinContext extends XqContext {
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public Xq_JoinContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_Join(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_ForLetWhereReturnContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public Xq_ForLetWhereReturnContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_ForLetWhereReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				_localctx = new Xq_varContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(31);
				var();
				}
				break;
			case StringConstant:
				{
				_localctx = new Xq_StringConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(StringConstant);
				}
				break;
			case T__25:
				{
				_localctx = new Xq_apContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				ap();
				}
				break;
			case T__0:
				{
				_localctx = new Xq_PxqPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(T__0);
				setState(35);
				xq(0);
				setState(36);
				match(T__1);
				}
				break;
			case T__5:
				{
				_localctx = new Xq_IDxqIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(T__5);
				setState(39);
				tagName();
				setState(40);
				match(T__6);
				setState(41);
				match(T__7);
				setState(42);
				xq(0);
				setState(43);
				match(T__8);
				setState(44);
				match(T__5);
				setState(45);
				match(T__3);
				setState(46);
				tagName();
				setState(47);
				match(T__6);
				}
				break;
			case T__14:
				{
				_localctx = new Xq_ForLetWhereReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				forClause();
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(50);
					letClause();
					}
				}

				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(53);
					whereClause();
					}
				}

				setState(56);
				match(T__9);
				setState(57);
				returnClause(0);
				}
				break;
			case T__16:
				{
				_localctx = new Xq_LETxqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				letClause();
				setState(60);
				xq(2);
				}
				break;
			case T__10:
				{
				_localctx = new Xq_JoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				joinClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(74);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Xq_xqCxqContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(65);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(66);
						match(T__2);
						setState(67);
						xq(8);
						}
						break;
					case 2:
						{
						_localctx = new Xq_xqSxqContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(68);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(69);
						match(T__3);
						setState(70);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new Xq_xqSSxqContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(71);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(72);
						match(T__4);
						setState(73);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class JoinClauseContext extends ParserRuleContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<IdListContext> idList() {
			return getRuleContexts(IdListContext.class);
		}
		public IdListContext idList(int i) {
			return getRuleContext(IdListContext.class,i);
		}
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_joinClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__10);
			setState(80);
			match(T__0);
			setState(81);
			xq(0);
			setState(82);
			match(T__2);
			setState(83);
			xq(0);
			setState(84);
			match(T__2);
			setState(85);
			idList();
			setState(86);
			match(T__2);
			setState(87);
			idList();
			setState(88);
			match(T__1);
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

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(XQueryParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XQueryParser.ID, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__11);
			setState(91);
			match(ID);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(92);
				match(T__2);
				setState(93);
				match(ID);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__12);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQueryParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__13);
			setState(102);
			match(ID);
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

	public static class ForClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__14);
			setState(105);
			var();
			setState(106);
			match(T__15);
			setState(107);
			xq(0);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(108);
				match(T__2);
				setState(109);
				var();
				setState(110);
				match(T__15);
				setState(111);
				xq(0);
				}
				}
				setState(117);
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

	public static class LetClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__16);
			setState(119);
			var();
			setState(120);
			match(T__17);
			setState(121);
			xq(0);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(122);
				match(T__2);
				setState(123);
				var();
				setState(124);
				match(T__17);
				setState(125);
				xq(0);
				}
				}
				setState(131);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__18);
			setState(133);
			cond(0);
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

	public static class ReturnClauseContext extends ParserRuleContext {
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
	 
		public ReturnClauseContext() { }
		public void copyFrom(ReturnClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Return_tagContext extends ReturnClauseContext {
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public Return_tagContext(ReturnClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitReturn_tag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Return_xqContext extends ReturnClauseContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Return_xqContext(ReturnClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitReturn_xq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Return_CommaContext extends ReturnClauseContext {
		public List<ReturnClauseContext> returnClause() {
			return getRuleContexts(ReturnClauseContext.class);
		}
		public ReturnClauseContext returnClause(int i) {
			return getRuleContext(ReturnClauseContext.class,i);
		}
		public Return_CommaContext(ReturnClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitReturn_Comma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		return returnClause(0);
	}

	private ReturnClauseContext returnClause(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, _parentState);
		ReturnClauseContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_returnClause, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new Return_xqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(136);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new Return_tagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(T__5);
				setState(138);
				tagName();
				setState(139);
				match(T__6);
				setState(140);
				returnClause(0);
				setState(141);
				match(T__5);
				setState(142);
				match(T__3);
				setState(143);
				tagName();
				setState(144);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Return_CommaContext(new ReturnClauseContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_returnClause);
					setState(148);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(149);
					match(T__2);
					setState(150);
					returnClause(3);
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Cond_EMPTYxqContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Cond_EMPTYxqContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_EMPTYxq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_NOTcondContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Cond_NOTcondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_NOTcond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_xqIEQxqContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode IEQ() { return getToken(XQueryParser.IEQ, 0); }
		public Cond_xqIEQxqContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_xqIEQxq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_xqVEQxqContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode VEQ() { return getToken(XQueryParser.VEQ, 0); }
		public Cond_xqVEQxqContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_xqVEQxq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_PcondPContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Cond_PcondPContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_PcondP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_SomeContext extends CondContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Cond_SomeContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_Some(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_condORcondContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public Cond_condORcondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_condORcond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_condANDcondContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public Cond_condANDcondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_condANDcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new Cond_xqVEQxqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(157);
				xq(0);
				setState(158);
				match(VEQ);
				setState(159);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new Cond_xqIEQxqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				xq(0);
				setState(162);
				match(IEQ);
				setState(163);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new Cond_EMPTYxqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(T__19);
				setState(166);
				match(T__0);
				setState(167);
				xq(0);
				setState(168);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new Cond_SomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(T__20);
				setState(171);
				var();
				setState(172);
				match(T__15);
				setState(173);
				xq(0);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(174);
					match(T__2);
					setState(175);
					var();
					setState(176);
					match(T__15);
					setState(177);
					xq(0);
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				match(T__21);
				setState(185);
				cond(5);
				}
				break;
			case 5:
				{
				_localctx = new Cond_PcondPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(T__0);
				setState(188);
				cond(0);
				setState(189);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new Cond_NOTcondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(T__24);
				setState(192);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Cond_condANDcondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(195);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(196);
						match(T__22);
						setState(197);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new Cond_condORcondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(198);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(199);
						match(T__23);
						setState(200);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Single_apContext extends ApContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Single_apContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSingle_ap(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Double_apContext extends ApContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Double_apContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitDouble_ap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ap);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new Single_apContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__25);
				setState(207);
				filename();
				setState(208);
				match(T__26);
				setState(209);
				match(T__3);
				setState(210);
				rp(0);
				}
				break;
			case 2:
				_localctx = new Double_apContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__25);
				setState(213);
				filename();
				setState(214);
				match(T__26);
				setState(215);
				match(T__4);
				setState(216);
				rp(0);
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

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Attname_rpContext extends RpContext {
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public Attname_rpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAttname_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Single_prsContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public Single_prsContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSingle_prs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_rpContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public Filter_rpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilter_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Double_prsContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public Double_prsContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitDouble_prs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Parent_rpContext extends RpContext {
		public Parent_rpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitParent_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Self_rpContext extends RpContext {
		public Self_rpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSelf_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Brace_rpContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Brace_rpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitBrace_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tagname_rpContext extends RpContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public Tagname_rpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagname_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Child_rpContext extends RpContext {
		public Child_rpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitChild_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_rpContext extends RpContext {
		public Value_rpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitValue_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Comma_rpsContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public Comma_rpsContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitComma_rps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new Tagname_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(221);
				tagName();
				}
				break;
			case T__27:
				{
				_localctx = new Child_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(T__27);
				}
				break;
			case T__28:
				{
				_localctx = new Self_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(T__28);
				}
				break;
			case T__29:
				{
				_localctx = new Parent_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(T__29);
				}
				break;
			case T__30:
				{
				_localctx = new Value_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(T__30);
				}
				break;
			case T__31:
				{
				_localctx = new Attname_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(T__31);
				setState(227);
				attName();
				}
				break;
			case T__0:
				{
				_localctx = new Brace_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				match(T__0);
				setState(229);
				rp(0);
				setState(230);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new Comma_rpsContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(234);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(235);
						match(T__2);
						setState(236);
						rp(6);
						}
						break;
					case 2:
						{
						_localctx = new Single_prsContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(237);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(238);
						match(T__3);
						setState(239);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new Double_prsContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(240);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(241);
						match(T__4);
						setState(242);
						rp(3);
						}
						break;
					case 4:
						{
						_localctx = new Filter_rpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(243);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(244);
						match(T__11);
						setState(245);
						f(0);
						setState(246);
						match(T__12);
						}
						break;
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Rp_fContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Rp_fContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRp_f(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class And_fsContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public And_fsContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAnd_fs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Not_fContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public Not_fContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitNot_f(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Or_fsContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public Or_fsContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitOr_fs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Brace_fContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public Brace_fContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitBrace_f(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rps_veq_fContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode VEQ() { return getToken(XQueryParser.VEQ, 0); }
		public Rps_veq_fContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRps_veq_f(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rps_ieq_fContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode IEQ() { return getToken(XQueryParser.IEQ, 0); }
		public Rps_ieq_fContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRps_ieq_f(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new Rp_fContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(254);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new Rps_veq_fContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				rp(0);
				setState(256);
				match(VEQ);
				setState(257);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new Rps_ieq_fContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				rp(0);
				setState(260);
				match(IEQ);
				setState(261);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new Brace_fContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263);
				match(T__0);
				setState(264);
				f(0);
				setState(265);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new Not_fContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(T__24);
				setState(268);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new And_fsContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(271);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(272);
						match(T__22);
						setState(273);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new Or_fsContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(274);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(275);
						match(T__23);
						setState(276);
						f(3);
						}
						break;
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQueryParser.ID, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(ID);
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

	public static class AttNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQueryParser.ID, 0); }
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(ID);
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

	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode FILENAME() { return getToken(XQueryParser.FILENAME, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(FILENAME);
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
		case 0:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 7:
			return returnClause_sempred((ReturnClauseContext)_localctx, predIndex);
		case 8:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 10:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 11:
			return f_sempred((FContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean returnClause_sempred(ReturnClauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0123\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\66"+
		"\n\2\3\2\5\29\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2B\n\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\7\2M\n\2\f\2\16\2P\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4a\n\4\f\4\16\4d\13\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6t\n\6\f\6\16\6w\13\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0082\n\7\f\7\16\7\u0085\13\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0095\n\t\3"+
		"\t\3\t\3\t\7\t\u009a\n\t\f\t\16\t\u009d\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00b6\n\n\f\n\16\n\u00b9\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00c4\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00cc\n\n\f\n\16\n\u00cf\13\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00dd"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00eb\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00fb\n\f\f"+
		"\f\16\f\u00fe\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u0110\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0118\n\r\f\r\16"+
		"\r\u011b\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2\7\2\20\22\26\30\21"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2\u013d\2A\3\2\2\2\4Q\3\2"+
		"\2\2\6\\\3\2\2\2\bg\3\2\2\2\nj\3\2\2\2\fx\3\2\2\2\16\u0086\3\2\2\2\20"+
		"\u0094\3\2\2\2\22\u00c3\3\2\2\2\24\u00dc\3\2\2\2\26\u00ea\3\2\2\2\30\u010f"+
		"\3\2\2\2\32\u011c\3\2\2\2\34\u011e\3\2\2\2\36\u0120\3\2\2\2 !\b\2\1\2"+
		"!B\5\b\5\2\"B\7#\2\2#B\5\24\13\2$%\7\3\2\2%&\5\2\2\2&\'\7\4\2\2\'B\3\2"+
		"\2\2()\7\b\2\2)*\5\32\16\2*+\7\t\2\2+,\7\n\2\2,-\5\2\2\2-.\7\13\2\2./"+
		"\7\b\2\2/\60\7\6\2\2\60\61\5\32\16\2\61\62\7\t\2\2\62B\3\2\2\2\63\65\5"+
		"\n\6\2\64\66\5\f\7\2\65\64\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\679\5\16"+
		"\b\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\f\2\2;<\5\20\t\2<B\3\2\2\2=>"+
		"\5\f\7\2>?\5\2\2\4?B\3\2\2\2@B\5\4\3\2A \3\2\2\2A\"\3\2\2\2A#\3\2\2\2"+
		"A$\3\2\2\2A(\3\2\2\2A\63\3\2\2\2A=\3\2\2\2A@\3\2\2\2BN\3\2\2\2CD\f\t\2"+
		"\2DE\7\5\2\2EM\5\2\2\nFG\f\b\2\2GH\7\6\2\2HM\5\26\f\2IJ\f\7\2\2JK\7\7"+
		"\2\2KM\5\26\f\2LC\3\2\2\2LF\3\2\2\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3"+
		"\2\2\2O\3\3\2\2\2PN\3\2\2\2QR\7\r\2\2RS\7\3\2\2ST\5\2\2\2TU\7\5\2\2UV"+
		"\5\2\2\2VW\7\5\2\2WX\5\6\4\2XY\7\5\2\2YZ\5\6\4\2Z[\7\4\2\2[\5\3\2\2\2"+
		"\\]\7\16\2\2]b\7&\2\2^_\7\5\2\2_a\7&\2\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2"+
		"bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\17\2\2f\7\3\2\2\2gh\7\20\2\2hi\7&\2"+
		"\2i\t\3\2\2\2jk\7\21\2\2kl\5\b\5\2lm\7\22\2\2mu\5\2\2\2no\7\5\2\2op\5"+
		"\b\5\2pq\7\22\2\2qr\5\2\2\2rt\3\2\2\2sn\3\2\2\2tw\3\2\2\2us\3\2\2\2uv"+
		"\3\2\2\2v\13\3\2\2\2wu\3\2\2\2xy\7\23\2\2yz\5\b\5\2z{\7\24\2\2{\u0083"+
		"\5\2\2\2|}\7\5\2\2}~\5\b\5\2~\177\7\24\2\2\177\u0080\5\2\2\2\u0080\u0082"+
		"\3\2\2\2\u0081|\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\r\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\25\2"+
		"\2\u0087\u0088\5\22\n\2\u0088\17\3\2\2\2\u0089\u008a\b\t\1\2\u008a\u0095"+
		"\5\2\2\2\u008b\u008c\7\b\2\2\u008c\u008d\5\32\16\2\u008d\u008e\7\t\2\2"+
		"\u008e\u008f\5\20\t\2\u008f\u0090\7\b\2\2\u0090\u0091\7\6\2\2\u0091\u0092"+
		"\5\32\16\2\u0092\u0093\7\t\2\2\u0093\u0095\3\2\2\2\u0094\u0089\3\2\2\2"+
		"\u0094\u008b\3\2\2\2\u0095\u009b\3\2\2\2\u0096\u0097\f\4\2\2\u0097\u0098"+
		"\7\5\2\2\u0098\u009a\5\20\t\5\u0099\u0096\3\2\2\2\u009a\u009d\3\2\2\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\21\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u009f\b\n\1\2\u009f\u00a0\5\2\2\2\u00a0\u00a1\7$\2\2\u00a1"+
		"\u00a2\5\2\2\2\u00a2\u00c4\3\2\2\2\u00a3\u00a4\5\2\2\2\u00a4\u00a5\7%"+
		"\2\2\u00a5\u00a6\5\2\2\2\u00a6\u00c4\3\2\2\2\u00a7\u00a8\7\26\2\2\u00a8"+
		"\u00a9\7\3\2\2\u00a9\u00aa\5\2\2\2\u00aa\u00ab\7\4\2\2\u00ab\u00c4\3\2"+
		"\2\2\u00ac\u00ad\7\27\2\2\u00ad\u00ae\5\b\5\2\u00ae\u00af\7\22\2\2\u00af"+
		"\u00b7\5\2\2\2\u00b0\u00b1\7\5\2\2\u00b1\u00b2\5\b\5\2\u00b2\u00b3\7\22"+
		"\2\2\u00b3\u00b4\5\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\30\2\2\u00bb\u00bc\5\22\n\7\u00bc"+
		"\u00c4\3\2\2\2\u00bd\u00be\7\3\2\2\u00be\u00bf\5\22\n\2\u00bf\u00c0\7"+
		"\4\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c2\7\33\2\2\u00c2\u00c4\5\22\n\3\u00c3"+
		"\u009e\3\2\2\2\u00c3\u00a3\3\2\2\2\u00c3\u00a7\3\2\2\2\u00c3\u00ac\3\2"+
		"\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00cd\3\2\2\2\u00c5"+
		"\u00c6\f\5\2\2\u00c6\u00c7\7\31\2\2\u00c7\u00cc\5\22\n\6\u00c8\u00c9\f"+
		"\4\2\2\u00c9\u00ca\7\32\2\2\u00ca\u00cc\5\22\n\5\u00cb\u00c5\3\2\2\2\u00cb"+
		"\u00c8\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\23\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\34\2\2\u00d1\u00d2"+
		"\5\36\20\2\u00d2\u00d3\7\35\2\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\5\26\f"+
		"\2\u00d5\u00dd\3\2\2\2\u00d6\u00d7\7\34\2\2\u00d7\u00d8\5\36\20\2\u00d8"+
		"\u00d9\7\35\2\2\u00d9\u00da\7\7\2\2\u00da\u00db\5\26\f\2\u00db\u00dd\3"+
		"\2\2\2\u00dc\u00d0\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dd\25\3\2\2\2\u00de"+
		"\u00df\b\f\1\2\u00df\u00eb\5\32\16\2\u00e0\u00eb\7\36\2\2\u00e1\u00eb"+
		"\7\37\2\2\u00e2\u00eb\7 \2\2\u00e3\u00eb\7!\2\2\u00e4\u00e5\7\"\2\2\u00e5"+
		"\u00eb\5\34\17\2\u00e6\u00e7\7\3\2\2\u00e7\u00e8\5\26\f\2\u00e8\u00e9"+
		"\7\4\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00de\3\2\2\2\u00ea\u00e0\3\2\2\2\u00ea"+
		"\u00e1\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e3\3\2\2\2\u00ea\u00e4\3\2"+
		"\2\2\u00ea\u00e6\3\2\2\2\u00eb\u00fc\3\2\2\2\u00ec\u00ed\f\7\2\2\u00ed"+
		"\u00ee\7\5\2\2\u00ee\u00fb\5\26\f\b\u00ef\u00f0\f\5\2\2\u00f0\u00f1\7"+
		"\6\2\2\u00f1\u00fb\5\26\f\6\u00f2\u00f3\f\4\2\2\u00f3\u00f4\7\7\2\2\u00f4"+
		"\u00fb\5\26\f\5\u00f5\u00f6\f\3\2\2\u00f6\u00f7\7\16\2\2\u00f7\u00f8\5"+
		"\30\r\2\u00f8\u00f9\7\17\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00ec\3\2\2\2\u00fa"+
		"\u00ef\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\27\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00ff\u0100\b\r\1\2\u0100\u0110\5\26\f\2\u0101\u0102\5\26\f\2"+
		"\u0102\u0103\7$\2\2\u0103\u0104\5\26\f\2\u0104\u0110\3\2\2\2\u0105\u0106"+
		"\5\26\f\2\u0106\u0107\7%\2\2\u0107\u0108\5\26\f\2\u0108\u0110\3\2\2\2"+
		"\u0109\u010a\7\3\2\2\u010a\u010b\5\30\r\2\u010b\u010c\7\4\2\2\u010c\u0110"+
		"\3\2\2\2\u010d\u010e\7\33\2\2\u010e\u0110\5\30\r\3\u010f\u00ff\3\2\2\2"+
		"\u010f\u0101\3\2\2\2\u010f\u0105\3\2\2\2\u010f\u0109\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u0110\u0119\3\2\2\2\u0111\u0112\f\5\2\2\u0112\u0113\7\31\2\2"+
		"\u0113\u0118\5\30\r\6\u0114\u0115\f\4\2\2\u0115\u0116\7\32\2\2\u0116\u0118"+
		"\5\30\r\5\u0117\u0111\3\2\2\2\u0117\u0114\3\2\2\2\u0118\u011b\3\2\2\2"+
		"\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\31\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011c\u011d\7&\2\2\u011d\33\3\2\2\2\u011e\u011f\7&\2\2\u011f"+
		"\35\3\2\2\2\u0120\u0121\7\'\2\2\u0121\37\3\2\2\2\27\658ALNbu\u0083\u0094"+
		"\u009b\u00b7\u00c3\u00cb\u00cd\u00dc\u00ea\u00fa\u00fc\u010f\u0117\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}