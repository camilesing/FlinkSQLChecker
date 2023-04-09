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

public class FqlCheckerDelimitedStatementImpl extends ASTWrapperPsiElement implements FqlCheckerDelimitedStatement {

  public FqlCheckerDelimitedStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitDelimitedStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerAssignmentStatement getAssignmentStatement() {
    return findChildByClass(FqlCheckerAssignmentStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerBranchingStatement getBranchingStatement() {
    return findChildByClass(FqlCheckerBranchingStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerDataStatement getDataStatement() {
    return findChildByClass(FqlCheckerDataStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerDeclareStatement getDeclareStatement() {
    return findChildByClass(FqlCheckerDeclareStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerRaiseErrorStatement getRaiseErrorStatement() {
    return findChildByClass(FqlCheckerRaiseErrorStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerRaiseStatement getRaiseStatement() {
    return findChildByClass(FqlCheckerRaiseStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerReturnStatement getReturnStatement() {
    return findChildByClass(FqlCheckerReturnStatement.class);
  }

  @Override
  @NotNull
  public FqlCheckerSemicolon getSemicolon() {
    return findNotNullChildByClass(FqlCheckerSemicolon.class);
  }

}
