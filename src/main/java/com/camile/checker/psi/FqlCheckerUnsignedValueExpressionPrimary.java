// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerUnsignedValueExpressionPrimary extends PsiElement {

  @Nullable
  FqlCheckerCaseExpression getCaseExpression();

  @Nullable
  FqlCheckerEscapedFunction getEscapedFunction();

  @Nullable
  FqlCheckerFunction getFunction();

  @Nullable
  FqlCheckerIdentifier getIdentifier();

  @Nullable
  FqlCheckerNestedExpression getNestedExpression();

  @Nullable
  FqlCheckerNonReservedIdentifier getNonReservedIdentifier();

  @Nullable
  FqlCheckerParameterReference getParameterReference();

  @Nullable
  FqlCheckerQueryWithoutSemiColon getQueryWithoutSemiColon();

  @Nullable
  FqlCheckerSearchedCaseExpression getSearchedCaseExpression();

  @Nullable
  FqlCheckerUnescapedFunction getUnescapedFunction();

}
