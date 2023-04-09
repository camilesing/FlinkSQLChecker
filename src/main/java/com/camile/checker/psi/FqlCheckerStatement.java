// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerStatement extends PsiElement {

  @Nullable
  FqlCheckerCompoundStatement getCompoundStatement();

  @Nullable
  FqlCheckerDelimitedStatement getDelimitedStatement();

  @Nullable
  FqlCheckerIdentifier getIdentifier();

  @Nullable
  FqlCheckerIfStatement getIfStatement();

  @Nullable
  FqlCheckerLoopStatement getLoopStatement();

  @Nullable
  FqlCheckerWhileStatement getWhileStatement();

}
