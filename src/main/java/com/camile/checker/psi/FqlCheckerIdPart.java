// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerIdPart extends PsiElement {

  @NotNull
  List<FqlCheckerDigit> getDigitList();

  @NotNull
  List<FqlCheckerLetter> getLetterList();

}
