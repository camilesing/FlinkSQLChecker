// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerTableExpression extends PsiElement {

  @Nullable
  FqlCheckerBaseString getBaseString();

  @Nullable
  FqlCheckerJoinCondition getJoinCondition();

  @NotNull
  List<FqlCheckerTableExpression2> getTableExpression2List();

  @Nullable
  FqlCheckerTableName getTableName();

  @NotNull
  List<FqlCheckerTableReference> getTableReferenceList();

}
