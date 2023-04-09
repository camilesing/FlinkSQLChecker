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

public class FqlCheckerUnsignedValueExpressionPrimaryImpl extends ASTWrapperPsiElement implements FqlCheckerUnsignedValueExpressionPrimary {

  public FqlCheckerUnsignedValueExpressionPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitUnsignedValueExpressionPrimary(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerCaseExpression getCaseExpression() {
    return findChildByClass(FqlCheckerCaseExpression.class);
  }

  @Override
  @Nullable
  public FqlCheckerEscapedFunction getEscapedFunction() {
    return findChildByClass(FqlCheckerEscapedFunction.class);
  }

  @Override
  @Nullable
  public FqlCheckerFunction getFunction() {
    return findChildByClass(FqlCheckerFunction.class);
  }

  @Override
  @Nullable
  public FqlCheckerIdentifier getIdentifier() {
    return findChildByClass(FqlCheckerIdentifier.class);
  }

  @Override
  @Nullable
  public FqlCheckerNestedExpression getNestedExpression() {
    return findChildByClass(FqlCheckerNestedExpression.class);
  }

  @Override
  @Nullable
  public FqlCheckerNonReservedIdentifier getNonReservedIdentifier() {
    return findChildByClass(FqlCheckerNonReservedIdentifier.class);
  }

  @Override
  @Nullable
  public FqlCheckerParameterReference getParameterReference() {
    return findChildByClass(FqlCheckerParameterReference.class);
  }

  @Override
  @Nullable
  public FqlCheckerQueryWithoutSemiColon getQueryWithoutSemiColon() {
    return findChildByClass(FqlCheckerQueryWithoutSemiColon.class);
  }

  @Override
  @Nullable
  public FqlCheckerSearchedCaseExpression getSearchedCaseExpression() {
    return findChildByClass(FqlCheckerSearchedCaseExpression.class);
  }

  @Override
  @Nullable
  public FqlCheckerUnescapedFunction getUnescapedFunction() {
    return findChildByClass(FqlCheckerUnescapedFunction.class);
  }

}
