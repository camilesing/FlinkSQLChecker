// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerAllStatement extends PsiElement {

  @Nullable
  FqlCheckerCreateStatement getCreateStatement();

  @Nullable
  FqlCheckerInsertStatement getInsertStatement();

  @Nullable
  FqlCheckerJarCommand getJarCommand();

  @Nullable
  FqlCheckerNote getNote();

  @Nullable
  FqlCheckerQueryStatement getQueryStatement();

  @Nullable
  FqlCheckerSelectStatement getSelectStatement();

}
