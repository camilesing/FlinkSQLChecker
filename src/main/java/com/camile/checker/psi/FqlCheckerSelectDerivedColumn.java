// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerSelectDerivedColumn extends PsiElement {

  @NotNull
  FqlCheckerExpression getExpression();

  @Nullable
  FqlCheckerIdentifier getIdentifier();

  @Nullable
  FqlCheckerStringAs getStringAs();

  @Nullable
  FqlCheckerTableName getTableName();

}
