// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerBooleanPrimary extends PsiElement {

  @Nullable
  FqlCheckerBetweenPredicate getBetweenPredicate();

  @Nullable
  FqlCheckerCommonValueExpression getCommonValueExpression();

  @Nullable
  FqlCheckerComparisonPredicate getComparisonPredicate();

  @Nullable
  FqlCheckerExistsPredicate getExistsPredicate();

  @Nullable
  FqlCheckerInPredicate getInPredicate();

  @Nullable
  FqlCheckerIsNullPredicate getIsNullPredicate();

  @Nullable
  FqlCheckerLikeRegexPredicate getLikeRegexPredicate();

  @Nullable
  FqlCheckerMatchPredicate getMatchPredicate();

  @Nullable
  FqlCheckerQuantifiedComparisonPredicate getQuantifiedComparisonPredicate();

}
