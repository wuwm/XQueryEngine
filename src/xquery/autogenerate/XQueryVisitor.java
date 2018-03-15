// Generated from /Users/wuwenyi/XQueryEngine/src/xquery/autogenerate/XQuery.g4 by ANTLR 4.7
package xquery.autogenerate;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code xq_StringConstant}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_StringConstant(XQueryParser.Xq_StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_IDxqID}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_IDxqID(XQueryParser.Xq_IDxqIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_xqCxq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_xqCxq(XQueryParser.Xq_xqCxqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_xqSxq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_xqSxq(XQueryParser.Xq_xqSxqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_xqSSxq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_xqSSxq(XQueryParser.Xq_xqSSxqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_LETxq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_LETxq(XQueryParser.Xq_LETxqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_ap}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_ap(XQueryParser.Xq_apContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_var}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_var(XQueryParser.Xq_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_PxqP}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_PxqP(XQueryParser.Xq_PxqPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_Join}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_Join(XQueryParser.Xq_JoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_ForLetWhereReturn}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_ForLetWhereReturn(XQueryParser.Xq_ForLetWhereReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(XQueryParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(XQueryParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(XQueryParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return_tag}
	 * labeled alternative in {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_tag(XQueryParser.Return_tagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return_xq}
	 * labeled alternative in {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_xq(XQueryParser.Return_xqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return_Comma}
	 * labeled alternative in {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_Comma(XQueryParser.Return_CommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_EMPTYxq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_EMPTYxq(XQueryParser.Cond_EMPTYxqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_NOTcond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_NOTcond(XQueryParser.Cond_NOTcondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_xqIEQxq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_xqIEQxq(XQueryParser.Cond_xqIEQxqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_xqVEQxq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_xqVEQxq(XQueryParser.Cond_xqVEQxqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_PcondP}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_PcondP(XQueryParser.Cond_PcondPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_Some}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_Some(XQueryParser.Cond_SomeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_condORcond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_condORcond(XQueryParser.Cond_condORcondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_condANDcond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_condANDcond(XQueryParser.Cond_condANDcondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_ap}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_ap(XQueryParser.Single_apContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_ap}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_ap(XQueryParser.Double_apContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attname_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttname_rp(XQueryParser.Attname_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_prs}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_prs(XQueryParser.Single_prsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_rp(XQueryParser.Filter_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_prs}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_prs(XQueryParser.Double_prsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parent_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent_rp(XQueryParser.Parent_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code self_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_rp(XQueryParser.Self_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brace_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrace_rp(XQueryParser.Brace_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagname_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagname_rp(XQueryParser.Tagname_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code child_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild_rp(XQueryParser.Child_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value_rp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_rp(XQueryParser.Value_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comma_rps}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_rps(XQueryParser.Comma_rpsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_f}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_f(XQueryParser.Rp_fContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and_fs}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_fs(XQueryParser.And_fsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not_f}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_f(XQueryParser.Not_fContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or_fs}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_fs(XQueryParser.Or_fsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brace_f}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrace_f(XQueryParser.Brace_fContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rps_veq_f}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRps_veq_f(XQueryParser.Rps_veq_fContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rps_ieq_f}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRps_ieq_f(XQueryParser.Rps_ieq_fContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#attName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(XQueryParser.AttNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(XQueryParser.FilenameContext ctx);
}