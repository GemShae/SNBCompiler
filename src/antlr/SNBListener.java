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
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SNBParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SNBParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(SNBParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(SNBParser.BracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterInteger(SNBParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link SNBParser#/expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitInteger(SNBParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFloat(SNBParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFloat(SNBParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(SNBParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(SNBParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterAddition(SNBParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitAddition(SNBParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SNBParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SNBParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(SNBParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(SNBParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterDivision(SNBParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitDivision(SNBParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exponential}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExponential(SNBParser.ExponentialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exponential}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExponential(SNBParser.ExponentialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterString(SNBParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitString(SNBParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(SNBParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(SNBParser.BooleanContext ctx);
}