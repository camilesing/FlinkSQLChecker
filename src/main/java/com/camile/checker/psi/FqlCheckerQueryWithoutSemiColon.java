// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerQueryWithoutSemiColon extends PsiElement {

  @NotNull
  List<FqlCheckerOrderItem> getOrderItemList();

  @NotNull
  List<FqlCheckerQueryWithoutSemiColon2> getQueryWithoutSemiColon2List();

  @Nullable
  FqlCheckerSelectV2 getSelectV2();

  @Nullable
  FqlCheckerSelectWithoutFrom getSelectWithoutFrom();

  @Nullable
  FqlCheckerValues getValues();

}
