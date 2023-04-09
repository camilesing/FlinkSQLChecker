// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerCreateView extends PsiElement {

  @Nullable
  FqlCheckerCatalogName getCatalogName();

  @NotNull
  List<FqlCheckerColumnName> getColumnNameList();

  @Nullable
  FqlCheckerCommentContent getCommentContent();

  @Nullable
  FqlCheckerDbName getDbName();

  @NotNull
  FqlCheckerQueryWithoutSemiColon getQueryWithoutSemiColon();

  @NotNull
  FqlCheckerStringAs getStringAs();

  @NotNull
  FqlCheckerStringCreate getStringCreate();

  @Nullable
  FqlCheckerStringNot getStringNot();

  @NotNull
  FqlCheckerTableName getTableName();

}
