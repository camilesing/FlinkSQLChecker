// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerTableExpression2 extends PsiElement {

  @Nullable
  FqlCheckerBaseString getBaseString();

  @Nullable
  FqlCheckerJoinCondition getJoinCondition();

  @Nullable
  FqlCheckerTableExpression2 getTableExpression2();

  @Nullable
  FqlCheckerTableName getTableName();

  @NotNull
  List<FqlCheckerTableReference> getTableReferenceList();

}
