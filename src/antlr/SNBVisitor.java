// Generated from /Users/shae/IdeaProjects/SNBLanguage/src/antlr/SNB.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SNBParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SNBVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SNBParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SNBParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatDeclaration}
	 * labeled alternative in {@link SNBParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatDeclaration(SNBParser.FloatDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringDeclaration}
	 * labeled alternative in {@link SNBParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDeclaration(SNBParser.StringDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNBParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SNBParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNBParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(SNBParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SNBParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(SNBParser.BracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(SNBParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(SNBParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(SNBParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SNBParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(SNBParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(SNBParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exponential}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponential(SNBParser.ExponentialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link SNBParser#//expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(SNBParser.StringContext ctx);
}