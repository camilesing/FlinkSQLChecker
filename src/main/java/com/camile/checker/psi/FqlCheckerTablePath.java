// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerTablePath extends PsiElement {

  @Nullable
  FqlCheckerCatalogName getCatalogName();

  @Nullable
  FqlCheckerDbName getDbName();

  @NotNull
  FqlCheckerTableName getTableName();

}
