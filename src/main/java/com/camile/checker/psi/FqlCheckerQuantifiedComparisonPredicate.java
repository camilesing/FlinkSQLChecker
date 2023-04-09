// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerQuantifiedComparisonPredicate extends PsiElement {

  @NotNull
  FqlCheckerComparisonOperator getComparisonOperator();

  @Nullable
  FqlCheckerExpression getExpression();

  @Nullable
  FqlCheckerQueryWithoutSemiColon getQueryWithoutSemiColon();

  @Nullable
  PsiElement getLeftBracket();

  @Nullable
  PsiElement getRightBracket();

}
