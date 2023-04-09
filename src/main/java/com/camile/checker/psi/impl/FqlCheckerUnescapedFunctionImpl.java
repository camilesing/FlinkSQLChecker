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

public class FqlCheckerUnescapedFunctionImpl extends ASTWrapperPsiElement implements FqlCheckerUnescapedFunction {

  public FqlCheckerUnescapedFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitUnescapedFunction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerAnalyticAggregateFunction getAnalyticAggregateFunction() {
    return findChildByClass(FqlCheckerAnalyticAggregateFunction.class);
  }

  @Override
  @Nullable
  public FqlCheckerFilterClause getFilterClause() {
    return findChildByClass(FqlCheckerFilterClause.class);
  }

  @Override
  @Nullable
  public FqlCheckerFunction getFunction() {
    return findChildByClass(FqlCheckerFunction.class);
  }

  @Override
  @Nullable
  public FqlCheckerOrderedAggregateFunction getOrderedAggregateFunction() {
    return findChildByClass(FqlCheckerOrderedAggregateFunction.class);
  }

  @Override
  @Nullable
  public FqlCheckerStandardAggregateFunction getStandardAggregateFunction() {
    return findChildByClass(FqlCheckerStandardAggregateFunction.class);
  }

  @Override
  @Nullable
  public FqlCheckerTextAggregateFunction getTextAggregateFunction() {
    return findChildByClass(FqlCheckerTextAggregateFunction.class);
  }

  @Override
  @Nullable
  public FqlCheckerWindowSpecification getWindowSpecification() {
    return findChildByClass(FqlCheckerWindowSpecification.class);
  }

}
