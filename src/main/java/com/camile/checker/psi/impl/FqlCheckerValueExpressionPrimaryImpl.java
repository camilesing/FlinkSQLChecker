// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.camile.checker.FlinkSqlCheckerTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.camile.checker.psi.*;

public class FqlCheckerValueExpressionPrimaryImpl extends ASTWrapperPsiElement implements FqlCheckerValueExpressionPrimary {

  public FqlCheckerValueExpressionPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitValueExpressionPrimary(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerNonNumericLiteral getNonNumericLiteral() {
    return findChildByClass(FqlCheckerNonNumericLiteral.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerNumericValueExpression> getNumericValueExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerNumericValueExpression.class);
  }

  @Override
  @Nullable
  public FqlCheckerUnsignedNumericLiteral getUnsignedNumericLiteral() {
    return findChildByClass(FqlCheckerUnsignedNumericLiteral.class);
  }

  @Override
  @Nullable
  public FqlCheckerUnsignedValueExpressionPrimary getUnsignedValueExpressionPrimary() {
    return findChildByClass(FqlCheckerUnsignedValueExpressionPrimary.class);
  }

}
