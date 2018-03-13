// Generated from /Users/wuwenyi/XQueryEngine/src/xquery/autogenerate/XPath.g4 by ANTLR 4.7
package xquery.autogenerate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XPathParser}.
 */
public interface XPathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code single_ap}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterSingle_ap(XPathParser.Single_apContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_ap}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitSingle_ap(XPathParser.Single_apContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_ap}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterDouble_ap(XPathParser.Double_apContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_ap}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitDouble_ap(XPathParser.Double_apContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attname_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttname_rp(XPathParser.Attname_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attname_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttname_rp(XPathParser.Attname_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_prs}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSingle_prs(XPathParser.Single_prsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_prs}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSingle_prs(XPathParser.Single_prsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterFilter_rp(XPathParser.Filter_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitFilter_rp(XPathParser.Filter_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_prs}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterDouble_prs(XPathParser.Double_prsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_prs}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitDouble_prs(XPathParser.Double_prsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parent_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParent_rp(XPathParser.Parent_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parent_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParent_rp(XPathParser.Parent_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code self_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSelf_rp(XPathParser.Self_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code self_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSelf_rp(XPathParser.Self_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brace_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterBrace_rp(XPathParser.Brace_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brace_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitBrace_rp(XPathParser.Brace_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagname_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagname_rp(XPathParser.Tagname_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagname_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagname_rp(XPathParser.Tagname_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code child_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterChild_rp(XPathParser.Child_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code child_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitChild_rp(XPathParser.Child_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterValue_rp(XPathParser.Value_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_rp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitValue_rp(XPathParser.Value_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comma_rps}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterComma_rps(XPathParser.Comma_rpsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comma_rps}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitComma_rps(XPathParser.Comma_rpsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_f}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterRp_f(XPathParser.Rp_fContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_f}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitRp_f(XPathParser.Rp_fContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and_fs}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterAnd_fs(XPathParser.And_fsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and_fs}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitAnd_fs(XPathParser.And_fsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not_f}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterNot_f(XPathParser.Not_fContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not_f}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitNot_f(XPathParser.Not_fContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or_fs}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterOr_fs(XPathParser.Or_fsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or_fs}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitOr_fs(XPathParser.Or_fsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brace_f}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterBrace_f(XPathParser.Brace_fContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brace_f}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitBrace_f(XPathParser.Brace_fContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rps_veq_f}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterRps_veq_f(XPathParser.Rps_veq_fContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rps_veq_f}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitRps_veq_f(XPathParser.Rps_veq_fContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rps_ieq_f}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterRps_ieq_f(XPathParser.Rps_ieq_fContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rps_ieq_f}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitRps_ieq_f(XPathParser.Rps_ieq_fContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XPathParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XPathParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(XPathParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(XPathParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(XPathParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(XPathParser.FilenameContext ctx);
}