// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerQuery2 extends PsiElement {

  @NotNull
  List<FqlCheckerOrderItem> getOrderItemList();

  @NotNull
  List<FqlCheckerQuery2> getQuery2List();

  @NotNull
  List<FqlCheckerSelectV2> getSelectV2List();

  @NotNull
  List<FqlCheckerSelectWithoutFrom> getSelectWithoutFromList();

  @Nullable
  FqlCheckerValues getValues();

}
