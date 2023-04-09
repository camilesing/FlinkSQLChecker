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

public class FqlCheckerQuantifiedComparisonPredicateImpl extends ASTWrapperPsiElement implements FqlCheckerQuantifiedComparisonPredicate {

  public FqlCheckerQuantifiedComparisonPredicateImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitQuantifiedComparisonPredicate(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FqlCheckerComparisonOperator getComparisonOperator() {
    return findNotNullChildByClass(FqlCheckerComparisonOperator.class);
  }

  @Override
  @Nullable
  public FqlCheckerExpression getExpression() {
    return findChildByClass(FqlCheckerExpression.class);
  }

  @Override
  @Nullable
  public FqlCheckerQueryWithoutSemiColon getQueryWithoutSemiColon() {
    return findChildByClass(FqlCheckerQueryWithoutSemiColon.class);
  }

  @Override
  @Nullable
  public PsiElement getLeftBracket() {
    return findChildByType(LEFT_BRACKET);
  }

  @Override
  @Nullable
  public PsiElement getRightBracket() {
    return findChildByType(RIGHT_BRACKET);
  }

}
