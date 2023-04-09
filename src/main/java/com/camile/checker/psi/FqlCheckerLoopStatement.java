// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerLoopStatement extends PsiElement {

  @NotNull
  FqlCheckerIdentifier getIdentifier();

  @NotNull
  FqlCheckerQueryExpression getQueryExpression();

  @NotNull
  FqlCheckerStatement getStatement();

  @NotNull
  FqlCheckerStringAs getStringAs();

  @NotNull
  PsiElement getLeftBracket();

  @NotNull
  PsiElement getRightBracket();

}
