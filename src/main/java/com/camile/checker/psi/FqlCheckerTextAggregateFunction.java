// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerTextAggregateFunction extends PsiElement {

  @NotNull
  List<FqlCheckerBaseString> getBaseStringList();

  @NotNull
  List<FqlCheckerDerivedColumn> getDerivedColumnList();

  @Nullable
  FqlCheckerFor getFor();

  @Nullable
  FqlCheckerIdentifier getIdentifier();

  @Nullable
  FqlCheckerOrderByClause getOrderByClause();

  @Nullable
  PsiElement getLeftBracket();

  @Nullable
  PsiElement getRightBracket();

}
