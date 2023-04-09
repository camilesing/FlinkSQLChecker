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

public class FqlCheckerCaseExpressionImpl extends ASTWrapperPsiElement implements FqlCheckerCaseExpression {

  public FqlCheckerCaseExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitCaseExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FqlCheckerExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerExpression.class);
  }

  @Override
  @NotNull
  public FqlCheckerStringCase getStringCase() {
    return findNotNullChildByClass(FqlCheckerStringCase.class);
  }

  @Override
  @NotNull
  public FqlCheckerStringElse getStringElse() {
    return findNotNullChildByClass(FqlCheckerStringElse.class);
  }

  @Override
  @NotNull
  public FqlCheckerStringEnd getStringEnd() {
    return findNotNullChildByClass(FqlCheckerStringEnd.class);
  }

  @Override
  @NotNull
  public FqlCheckerStringThen getStringThen() {
    return findNotNullChildByClass(FqlCheckerStringThen.class);
  }

  @Override
  @NotNull
  public FqlCheckerStringWhen getStringWhen() {
    return findNotNullChildByClass(FqlCheckerStringWhen.class);
  }

}
