// Generated from /Users/wuwenyi/XQueryEngine/src/xquery/autogenerate/XPath.g4 by ANTLR 4.7
package xquery.autogenerate;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XPathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XPathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code single_ap}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_ap(XPathParser.Single_apContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_ap}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_ap(XPathParser.Double_apContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attname_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttname_rp(XPathParser.Attname_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_prs}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_prs(XPathParser.Single_prsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_rp(XPathParser.Filter_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_prs}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_prs(XPathParser.Double_prsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parent_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent_rp(XPathParser.Parent_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code self_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_rp(XPathParser.Self_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brace_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrace_rp(XPathParser.Brace_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagname_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagname_rp(XPathParser.Tagname_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code child_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild_rp(XPathParser.Child_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_rp(XPathParser.Value_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comma_rps}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_rps(XPathParser.Comma_rpsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_f}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_f(XPathParser.Rp_fContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and_fs}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_fs(XPathParser.And_fsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not_f}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_f(XPathParser.Not_fContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or_fs}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_fs(XPathParser.Or_fsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brace_f}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrace_f(XPathParser.Brace_fContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rps_veq_f}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRps_veq_f(XPathParser.Rps_veq_fContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rps_ieq_f}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRps_ieq_f(XPathParser.Rps_ieq_fContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(XPathParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#attName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(XPathParser.AttNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(XPathParser.FilenameContext ctx);
}