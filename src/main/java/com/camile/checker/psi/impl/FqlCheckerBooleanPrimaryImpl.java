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

public class FqlCheckerBooleanPrimaryImpl extends ASTWrapperPsiElement implements FqlCheckerBooleanPrimary {

  public FqlCheckerBooleanPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitBooleanPrimary(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerBetweenPredicate getBetweenPredicate() {
    return findChildByClass(FqlCheckerBetweenPredicate.class);
  }

  @Override
  @Nullable
  public FqlCheckerCommonValueExpression getCommonValueExpression() {
    return findChildByClass(FqlCheckerCommonValueExpression.class);
  }

  @Override
  @Nullable
  public FqlCheckerComparisonPredicate getComparisonPredicate() {
    return findChildByClass(FqlCheckerComparisonPredicate.class);
  }

  @Override
  @Nullable
  public FqlCheckerExistsPredicate getExistsPredicate() {
    return findChildByClass(FqlCheckerExistsPredicate.class);
  }

  @Override
  @Nullable
  public FqlCheckerInPredicate getInPredicate() {
    return findChildByClass(FqlCheckerInPredicate.class);
  }

  @Override
  @Nullable
  public FqlCheckerIsNullPredicate getIsNullPredicate() {
    return findChildByClass(FqlCheckerIsNullPredicate.class);
  }

  @Override
  @Nullable
  public FqlCheckerLikeRegexPredicate getLikeRegexPredicate() {
    return findChildByClass(FqlCheckerLikeRegexPredicate.class);
  }

  @Override
  @Nullable
  public FqlCheckerMatchPredicate getMatchPredicate() {
    return findChildByClass(FqlCheckerMatchPredicate.class);
  }

  @Override
  @Nullable
  public FqlCheckerQuantifiedComparisonPredicate getQuantifiedComparisonPredicate() {
    return findChildByClass(FqlCheckerQuantifiedComparisonPredicate.class);
  }

}
