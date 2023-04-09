// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerValueExpressionPrimary extends PsiElement {

  @Nullable
  FqlCheckerNonNumericLiteral getNonNumericLiteral();

  @NotNull
  List<FqlCheckerNumericValueExpression> getNumericValueExpressionList();

  @Nullable
  FqlCheckerUnsignedNumericLiteral getUnsignedNumericLiteral();

  @Nullable
  FqlCheckerUnsignedValueExpressionPrimary getUnsignedValueExpressionPrimary();

}
