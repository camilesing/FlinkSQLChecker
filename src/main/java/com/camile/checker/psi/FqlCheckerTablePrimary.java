// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerTablePrimary extends PsiElement {

  @Nullable
  FqlCheckerBaseString getBaseString();

  @Nullable
  FqlCheckerDynamicTableOptions getDynamicTableOptions();

  @NotNull
  List<FqlCheckerExpression> getExpressionList();

  @Nullable
  FqlCheckerQuery getQuery();

  @Nullable
  FqlCheckerStringAs getStringAs();

  @Nullable
  FqlCheckerSystemTimePeriod getSystemTimePeriod();

  @Nullable
  FqlCheckerTablePath getTablePath();

}
