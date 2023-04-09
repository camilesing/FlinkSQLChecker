// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerTableReference extends PsiElement {

  @NotNull
  List<FqlCheckerBaseString> getBaseStringList();

  @Nullable
  FqlCheckerMatchRecognize getMatchRecognize();

  @Nullable
  FqlCheckerStringAs getStringAs();

  @NotNull
  FqlCheckerTablePrimary getTablePrimary();

}
