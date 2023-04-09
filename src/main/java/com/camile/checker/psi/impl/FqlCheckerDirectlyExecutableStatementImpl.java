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

public class FqlCheckerDirectlyExecutableStatementImpl extends ASTWrapperPsiElement implements FqlCheckerDirectlyExecutableStatement {

  public FqlCheckerDirectlyExecutableStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitDirectlyExecutableStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerCallStatement getCallStatement() {
    return findChildByClass(FqlCheckerCallStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerCompoundStatement getCompoundStatement() {
    return findChildByClass(FqlCheckerCompoundStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerCreateView getCreateView() {
    return findChildByClass(FqlCheckerCreateView.class);
  }

  @Override
  @Nullable
  public FqlCheckerInsertStatement getInsertStatement() {
    return findChildByClass(FqlCheckerInsertStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerQuery getQuery() {
    return findChildByClass(FqlCheckerQuery.class);
  }

}
