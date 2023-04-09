// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerSelectV2 extends PsiElement {

  @Nullable
  FqlCheckerFromClause getFromClause();

  @Nullable
  FqlCheckerGroupByClause getGroupByClause();

  @Nullable
  FqlCheckerHavingClause getHavingClause();

  @Nullable
  FqlCheckerIntoClause getIntoClause();

  @Nullable
  FqlCheckerLimitClause getLimitClause();

  @Nullable
  FqlCheckerOrderByClause getOrderByClause();

  @NotNull
  FqlCheckerSelectClause getSelectClause();

  @Nullable
  FqlCheckerWhereClause getWhereClause();

}
