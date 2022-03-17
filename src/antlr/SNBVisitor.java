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
	 * Visit a parse tree produced by the {@code IntegerDeclaration}
	 * labeled alternative in {@link SNBParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerDeclaration(SNBParser.IntegerDeclarationContext ctx);
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
	 * Visit a parse tree produced by the {@code CharacterDeclaration}
	 * labeled alternative in {@link SNBParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterDeclaration(SNBParser.CharacterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanDeclaration}
	 * labeled alternative in {@link SNBParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDeclaration(SNBParser.BooleanDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNBParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SNBParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNBParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SNBParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNBParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(SNBParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNBParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SNBParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNBParser#sumExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpression(SNBParser.SumExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNBParser#multiplyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(SNBParser.MultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNBParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(SNBParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNBParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SNBParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SNBParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(SNBParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(SNBParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Character}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(SNBParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(SNBParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link SNBParser#mutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(SNBParser.StringContext ctx);
}