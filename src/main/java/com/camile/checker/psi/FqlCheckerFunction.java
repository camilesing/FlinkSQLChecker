// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerFunction extends PsiElement {

  @Nullable
  FqlCheckerBaseString getBaseString();

  @Nullable
  FqlCheckerDataType getDataType();

  @Nullable
  FqlCheckerExpression getExpression();

  @Nullable
  FqlCheckerExpressionList getExpressionList();

  @Nullable
  FqlCheckerFilterClause getFilterClause();

  @Nullable
  FqlCheckerFunctionName getFunctionName();

  @Nullable
  FqlCheckerIdentifier getIdentifier();

  @Nullable
  FqlCheckerOrderByClause getOrderByClause();

  @Nullable
  FqlCheckerQueryStringFunction getQueryStringFunction();

  @Nullable
  FqlCheckerStringAs getStringAs();

  @Nullable
  FqlCheckerStringFrom getStringFrom();

  @Nullable
  FqlCheckerStringInsert getStringInsert();

  @Nullable
  FqlCheckerTimeInterval getTimeInterval();

  @Nullable
  PsiElement getLeftBracket();

  @Nullable
  PsiElement getRightBracket();

}
