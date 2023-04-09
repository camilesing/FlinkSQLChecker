package com.camile.checker;


import com.intellij.lang.*;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.psi.tree.*;
import org.jetbrains.annotations.NotNull;

public class FlinkSqlParserDefinition  implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(FlinkSqlLanguage.INSTANCE);


    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new FlinkSqlCheckerLexerAdapter();
    }

    @Override
    public @NotNull PsiParser createParser(Project project) {
        return new FlinkSqlCheckerParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return TokenSet.create(FlinkSqlCheckerTypes.COMMENT);
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return FlinkSqlCheckerTypes.Factory.createElement(node);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new FlinkSqlFile(viewProvider);
    }


}
