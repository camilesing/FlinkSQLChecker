// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerQueryStringFunction extends PsiElement {

  @Nullable
  FqlCheckerDerivedColumn getDerivedColumn();

  @NotNull
  FqlCheckerExpression getExpression();

  @NotNull
  PsiElement getLeftBracket();

  @NotNull
  PsiElement getRightBracket();

}
