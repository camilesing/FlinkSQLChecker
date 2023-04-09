// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.camile.checker.FlinkSqlCheckerTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.camile.checker.psi.*;

public class FqlCheckerStatementImpl extends ASTWrapperPsiElement implements FqlCheckerStatement {

  public FqlCheckerStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerCompoundStatement getCompoundStatement() {
    return findChildByClass(FqlCheckerCompoundStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerDelimitedStatement getDelimitedStatement() {
    return findChildByClass(FqlCheckerDelimitedStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerIdentifier getIdentifier() {
    return findChildByClass(FqlCheckerIdentifier.class);
  }

  @Override
  @Nullable
  public FqlCheckerIfStatement getIfStatement() {
    return findChildByClass(FqlCheckerIfStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerLoopStatement getLoopStatement() {
    return findChildByClass(FqlCheckerLoopStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerWhileStatement getWhileStatement() {
    return findChildByClass(FqlCheckerWhileStatement.class);
  }

}
