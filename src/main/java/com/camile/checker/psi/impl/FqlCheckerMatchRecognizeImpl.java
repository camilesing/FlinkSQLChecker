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

public class FqlCheckerMatchRecognizeImpl extends ASTWrapperPsiElement implements FqlCheckerMatchRecognize {

  public FqlCheckerMatchRecognizeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitMatchRecognize(this);
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
  @Nullable
  public FqlCheckerIntervalLiteral getIntervalLiteral() {
    return findChildByClass(FqlCheckerIntervalLiteral.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerMeasureColumn> getMeasureColumnList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerMeasureColumn.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerOrderItem> getOrderItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerOrderItem.class);
  }

  @Override
  @NotNull
  public FqlCheckerPattern getPattern() {
    return findNotNullChildByClass(FqlCheckerPattern.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerStringAs> getStringAsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerStringAs.class);
  }

}
