// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerIfStatement extends PsiElement {

  @Nullable
  FqlCheckerCondition getCondition();

  @NotNull
  List<FqlCheckerIdentifier> getIdentifierList();

  @NotNull
  List<FqlCheckerStatement> getStatementList();

  @Nullable
  FqlCheckerStringFrom getStringFrom();

  @Nullable
  FqlCheckerStringNot getStringNot();

  @NotNull
  PsiElement getLeftBracket();

  @NotNull
  PsiElement getRightBracket();

}
