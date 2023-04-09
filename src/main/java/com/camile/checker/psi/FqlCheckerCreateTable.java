// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerCreateTable extends PsiElement {

  @Nullable
  FqlCheckerCatalogName getCatalogName();

  @NotNull
  List<FqlCheckerColumnName> getColumnNameList();

  @Nullable
  FqlCheckerCommentContent getCommentContent();

  @Nullable
  FqlCheckerDbName getDbName();

  @NotNull
  List<FqlCheckerKey> getKeyList();

  @Nullable
  FqlCheckerLikeOptions getLikeOptions();

  @NotNull
  List<FqlCheckerOneTableField> getOneTableFieldList();

  @Nullable
  FqlCheckerQuery getQuery();

  @Nullable
  FqlCheckerSourceTable getSourceTable();

  @Nullable
  FqlCheckerStringAs getStringAs();

  @NotNull
  FqlCheckerStringCreate getStringCreate();

  @NotNull
  FqlCheckerStringTable getStringTable();

  @NotNull
  FqlCheckerTableName getTableName();

  @NotNull
  List<FqlCheckerVal> getValList();

  @NotNull
  FqlCheckerWithStr getWithStr();

  @NotNull
  PsiElement getLeftBracket();

  @NotNull
  PsiElement getRightBracket();

}
