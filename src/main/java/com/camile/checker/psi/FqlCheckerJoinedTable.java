// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerJoinedTable extends PsiElement {

  @NotNull
  List<FqlCheckerCrossJoin> getCrossJoinList();

  @NotNull
  List<FqlCheckerQualifiedTable> getQualifiedTableList();

  @NotNull
  FqlCheckerTablePrimaryV2 getTablePrimaryV2();

}
