// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerDirectlyExecutableStatement extends PsiElement {

  @Nullable
  FqlCheckerCallStatement getCallStatement();

  @Nullable
  FqlCheckerCompoundStatement getCompoundStatement();

  @Nullable
  FqlCheckerCreateView getCreateView();

  @Nullable
  FqlCheckerInsertStatement getInsertStatement();

  @Nullable
  FqlCheckerQuery getQuery();

}
