// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerQueryWithoutSemiColon2 extends PsiElement {

  @NotNull
  List<FqlCheckerOrderItem> getOrderItemList();

  @Nullable
  FqlCheckerQueryWithoutSemiColon2 getQueryWithoutSemiColon2();

  @Nullable
  FqlCheckerSelectV2 getSelectV2();

  @Nullable
  FqlCheckerSelectWithoutFrom getSelectWithoutFrom();

  @Nullable
  FqlCheckerValues getValues();

}
