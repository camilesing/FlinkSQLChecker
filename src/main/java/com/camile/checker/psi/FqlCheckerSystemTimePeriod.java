// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerSystemTimePeriod extends PsiElement {

  @Nullable
  FqlCheckerBaseString getBaseString();

  @NotNull
  FqlCheckerCatalogName getCatalogName();

  @NotNull
  FqlCheckerCondition getCondition();

  @NotNull
  List<FqlCheckerStringAs> getStringAsList();

  @NotNull
  FqlCheckerTableNameV2 getTableNameV2();

}
