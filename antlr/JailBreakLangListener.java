// Generated from JailBreakLang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JailBreakLangParser}.
 */
public interface JailBreakLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JailBreakLangParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JailBreakLangParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JailBreakLangParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JailBreakLangParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JailBreakLangParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(JailBreakLangParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JailBreakLangParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(JailBreakLangParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JailBreakLangParser#objects}.
	 * @param ctx the parse tree
	 */
	void enterObjects(JailBreakLangParser.ObjectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JailBreakLangParser#objects}.
	 * @param ctx the parse tree
	 */
	void exitObjects(JailBreakLangParser.ObjectsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JailBreakLangParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(JailBreakLangParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JailBreakLangParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(JailBreakLangParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JailBreakLangParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(JailBreakLangParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JailBreakLangParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(JailBreakLangParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JailBreakLangParser#wyrazenia}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenia(JailBreakLangParser.WyrazeniaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JailBreakLangParser#wyrazenia}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenia(JailBreakLangParser.WyrazeniaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JailBreakLangParser#guard_extra_code}.
	 * @param ctx the parse tree
	 */
	void enterGuard_extra_code(JailBreakLangParser.Guard_extra_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JailBreakLangParser#guard_extra_code}.
	 * @param ctx the parse tree
	 */
	void exitGuard_extra_code(JailBreakLangParser.Guard_extra_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JailBreakLangParser#guard_control}.
	 * @param ctx the parse tree
	 */
	void enterGuard_control(JailBreakLangParser.Guard_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JailBreakLangParser#guard_control}.
	 * @param ctx the parse tree
	 */
	void exitGuard_control(JailBreakLangParser.Guard_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JailBreakLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(JailBreakLangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JailBreakLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(JailBreakLangParser.ConditionContext ctx);
}