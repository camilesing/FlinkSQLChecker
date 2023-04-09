// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerCaseExpression extends PsiElement {

  @NotNull
  List<FqlCheckerExpression> getExpressionList();

  @NotNull
  FqlCheckerStringCase getStringCase();

  @NotNull
  FqlCheckerStringElse getStringElse();

  @NotNull
  FqlCheckerStringEnd getStringEnd();

  @NotNull
  FqlCheckerStringThen getStringThen();

  @NotNull
  FqlCheckerStringWhen getStringWhen();

}
