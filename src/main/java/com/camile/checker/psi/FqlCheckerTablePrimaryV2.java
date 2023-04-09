// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerTablePrimaryV2 extends PsiElement {

  @Nullable
  FqlCheckerJoinedTable getJoinedTable();

  @NotNull
  List<FqlCheckerMakeDepOptions> getMakeDepOptionsList();

  @Nullable
  FqlCheckerTableNameV2 getTableNameV2();

  @Nullable
  FqlCheckerTableSubQuery getTableSubQuery();

}
