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

public class FqlCheckerAssignmentStatementImpl extends ASTWrapperPsiElement implements FqlCheckerAssignmentStatement {

  public FqlCheckerAssignmentStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitAssignmentStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerAssignmentStatementOperand getAssignmentStatementOperand() {
    return findChildByClass(FqlCheckerAssignmentStatementOperand.class);
  }

  @Override
  @Nullable
  public FqlCheckerCallStatement getCallStatement() {
    return findChildByClass(FqlCheckerCallStatement.class);
  }

  @Override
  @NotNull
  public FqlCheckerEq getEq() {
    return findNotNullChildByClass(FqlCheckerEq.class);
  }

  @Override
  @NotNull
  public FqlCheckerIdentifier getIdentifier() {
    return findNotNullChildByClass(FqlCheckerIdentifier.class);
  }

}
