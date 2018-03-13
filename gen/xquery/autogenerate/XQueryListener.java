// Generated from /Users/wuwenyi/XQueryEngine/src/xquery/autogenerate/XQuery.g4 by ANTLR 4.7
package xquery.autogenerate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code xq_StringConstant}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_StringConstant(XQueryParser.Xq_StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_StringConstant}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_StringConstant(XQueryParser.Xq_StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_IDxqID}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_IDxqID(XQueryParser.Xq_IDxqIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_IDxqID}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_IDxqID(XQueryParser.Xq_IDxqIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_xqCxq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_xqCxq(XQueryParser.Xq_xqCxqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_xqCxq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_xqCxq(XQueryParser.Xq_xqCxqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_xqSxq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_xqSxq(XQueryParser.Xq_xqSxqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_xqSxq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_xqSxq(XQueryParser.Xq_xqSxqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_xqSSxq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_xqSSxq(XQueryParser.Xq_xqSSxqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_xqSSxq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_xqSSxq(XQueryParser.Xq_xqSSxqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_LETxq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_LETxq(XQueryParser.Xq_LETxqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_LETxq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_LETxq(XQueryParser.Xq_LETxqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_ap}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_ap(XQueryParser.Xq_apContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_ap}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_ap(XQueryParser.Xq_apContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_var}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_var(XQueryParser.Xq_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_var}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_var(XQueryParser.Xq_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_PxqP}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_PxqP(XQueryParser.Xq_PxqPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_PxqP}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_PxqP(XQueryParser.Xq_PxqPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_ForLetWhereReturn}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_ForLetWhereReturn(XQueryParser.Xq_ForLetWhereReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_ForLetWhereReturn}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_ForLetWhereReturn(XQueryParser.Xq_ForLetWhereReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(XQueryParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(XQueryParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_EMPTYxq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_EMPTYxq(XQueryParser.Cond_EMPTYxqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_EMPTYxq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_EMPTYxq(XQueryParser.Cond_EMPTYxqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_NOTcond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_NOTcond(XQueryParser.Cond_NOTcondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_NOTcond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_NOTcond(XQueryParser.Cond_NOTcondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_xqIEQxq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_xqIEQxq(XQueryParser.Cond_xqIEQxqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_xqIEQxq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_xqIEQxq(XQueryParser.Cond_xqIEQxqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_xqVEQxq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_xqVEQxq(XQueryParser.Cond_xqVEQxqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_xqVEQxq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_xqVEQxq(XQueryParser.Cond_xqVEQxqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_PcondP}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_PcondP(XQueryParser.Cond_PcondPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_PcondP}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_PcondP(XQueryParser.Cond_PcondPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_Some}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_Some(XQueryParser.Cond_SomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_Some}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_Some(XQueryParser.Cond_SomeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_condORcond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_condORcond(XQueryParser.Cond_condORcondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_condORcond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_condORcond(XQueryParser.Cond_condORcondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_condANDcond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_condANDcond(XQueryParser.Cond_condANDcondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_condANDcond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_condANDcond(XQueryParser.Cond_condANDcondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_ap}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterSingle_ap(XQueryParser.Single_apContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_ap}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitSingle_ap(XQueryParser.Single_apContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_ap}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterDouble_ap(XQueryParser.Double_apContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_ap}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitDouble_ap(XQueryParser.Double_apContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attname_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttname_rp(XQueryParser.Attname_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attname_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttname_rp(XQueryParser.Attname_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_prs}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSingle_prs(XQueryParser.Single_prsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_prs}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSingle_prs(XQueryParser.Single_prsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterFilter_rp(XQueryParser.Filter_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitFilter_rp(XQueryParser.Filter_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_prs}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterDouble_prs(XQueryParser.Double_prsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_prs}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitDouble_prs(XQueryParser.Double_prsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parent_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParent_rp(XQueryParser.Parent_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parent_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParent_rp(XQueryParser.Parent_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code self_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSelf_rp(XQueryParser.Self_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code self_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSelf_rp(XQueryParser.Self_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brace_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterBrace_rp(XQueryParser.Brace_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brace_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitBrace_rp(XQueryParser.Brace_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagname_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagname_rp(XQueryParser.Tagname_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagname_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagname_rp(XQueryParser.Tagname_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code child_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterChild_rp(XQueryParser.Child_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code child_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitChild_rp(XQueryParser.Child_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterValue_rp(XQueryParser.Value_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitValue_rp(XQueryParser.Value_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comma_rps}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterComma_rps(XQueryParser.Comma_rpsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comma_rps}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitComma_rps(XQueryParser.Comma_rpsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_f}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterRp_f(XQueryParser.Rp_fContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_f}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitRp_f(XQueryParser.Rp_fContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and_fs}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterAnd_fs(XQueryParser.And_fsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and_fs}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitAnd_fs(XQueryParser.And_fsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not_f}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterNot_f(XQueryParser.Not_fContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not_f}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitNot_f(XQueryParser.Not_fContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or_fs}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterOr_fs(XQueryParser.Or_fsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or_fs}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitOr_fs(XQueryParser.Or_fsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brace_f}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterBrace_f(XQueryParser.Brace_fContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brace_f}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitBrace_f(XQueryParser.Brace_fContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rps_veq_f}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterRps_veq_f(XQueryParser.Rps_veq_fContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rps_veq_f}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitRps_veq_f(XQueryParser.Rps_veq_fContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rps_ieq_f}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterRps_ieq_f(XQueryParser.Rps_ieq_fContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rps_ieq_f}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitRps_ieq_f(XQueryParser.Rps_ieq_fContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(XQueryParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(XQueryParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(XQueryParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(XQueryParser.FilenameContext ctx);
}