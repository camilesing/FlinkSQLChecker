// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerDeclareStatement extends PsiElement {

  @Nullable
  FqlCheckerAssignmentStatementOperand getAssignmentStatementOperand();

  @Nullable
  FqlCheckerDataType getDataType();

  @Nullable
  FqlCheckerEq getEq();

  @NotNull
  FqlCheckerIdentifier getIdentifier();

}
