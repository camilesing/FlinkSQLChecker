// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerVal extends PsiElement {

  @NotNull
  List<FqlCheckerBaseString> getBaseStringList();

  @NotNull
  List<FqlCheckerEnvVar> getEnvVarList();

  @NotNull
  List<FqlCheckerSelectV2> getSelectV2List();

}
