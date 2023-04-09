// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerInsertFromSelectQueries extends PsiElement {

  @Nullable
  FqlCheckerCatalogName getCatalogName();

  @Nullable
  FqlCheckerColumnList getColumnList();

  @Nullable
  FqlCheckerDbName getDbName();

  @Nullable
  FqlCheckerPartSpec getPartSpec();

  @NotNull
  FqlCheckerQuery getQuery();

  @NotNull
  FqlCheckerStringInsert getStringInsert();

  @Nullable
  FqlCheckerStringInto getStringInto();

  @NotNull
  FqlCheckerTableName getTableName();

}
