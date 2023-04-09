// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerCallStatement extends PsiElement {

  @Nullable
  FqlCheckerExpressionList getExpressionList();

  @NotNull
  FqlCheckerIdentifier getIdentifier();

  @Nullable
  FqlCheckerNamedParameterList getNamedParameterList();

  @NotNull
  PsiElement getLeftBracket();

  @NotNull
  PsiElement getRightBracket();

}
