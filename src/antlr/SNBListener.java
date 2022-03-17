// Generated from /Users/shae/IdeaProjects/SNBLanguage/src/antlr/SNB.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SNBParser}.
 */
public interface SNBListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SNBParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SNBParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SNBParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SNBParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerDeclaration}
	 * labeled alternative in {@link SNBParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIntegerDeclaration(SNBParser.IntegerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerDeclaration}
	 * labeled alternative in {@link SNBParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIntegerDeclaration(SNBParser.IntegerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatDeclaration}
	 * labeled alternative in {@link SNBParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFloatDeclaration(SNBParser.FloatDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatDeclaration}
	 * labeled alternative in {@link SNBParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFloatDeclaration(SNBParser.FloatDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringDeclaration}
	 * labeled alternative in {@link SNBParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStringDeclaration(SNBParser.StringDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringDeclaration}
	 * labeled alternative in {@link SNBParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStringDeclaration(SNBParser.StringDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacterDeclaration}
	 * labeled alternative in {@link SNBParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCharacterDeclaration(SNBParser.CharacterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacterDeclaration}
	 * labeled alternative in {@link SNBParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCharacterDeclaration(SNBParser.CharacterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanDeclaration}
	 * labeled alternative in {@link SNBParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDeclaration(SNBParser.BooleanDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanDeclaration}
	 * labeled alternative in {@link SNBParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDeclaration(SNBParser.BooleanDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SNBParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SNBParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SNBParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SNBParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SNBParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SNBParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SNBParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SNBParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SNBParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(SNBParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SNBParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(SNBParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SNBParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SNBParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SNBParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SNBParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SNBParser#sumExpression}.
	 * @param ctx the parse tree
	 */
	void enterSumExpression(SNBParser.SumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SNBParser#sumExpression}.
	 * @param ctx the parse tree
	 */
	void exitSumExpression(SNBParser.SumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SNBParser#multiplyExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(SNBParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SNBParser#multiplyExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(SNBParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SNBParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SNBParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SNBParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SNBParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SNBParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SNBParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SNBParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SNBParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SNBParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SNBParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 */
	void enterInteger(SNBParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 */
	void exitInteger(SNBParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 */
	void enterFloat(SNBParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 */
	void exitFloat(SNBParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Character}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(SNBParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Character}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(SNBParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(SNBParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(SNBParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 */
	void enterString(SNBParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 */
	void exitString(SNBParser.StringContext ctx);
}