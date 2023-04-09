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

public class FqlCheckerFunctionImpl extends ASTWrapperPsiElement implements FqlCheckerFunction {

  public FqlCheckerFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitFunction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerBaseString getBaseString() {
    return findChildByClass(FqlCheckerBaseString.class);
  }

  @Override
  @Nullable
  public FqlCheckerDataType getDataType() {
    return findChildByClass(FqlCheckerDataType.class);
  }

  @Override
  @Nullable
  public FqlCheckerExpression getExpression() {
    return findChildByClass(FqlCheckerExpression.class);
  }

  @Override
  @Nullable
  public FqlCheckerExpressionList getExpressionList() {
    return findChildByClass(FqlCheckerExpressionList.class);
  }

  @Override
  @Nullable
  public FqlCheckerFilterClause getFilterClause() {
    return findChildByClass(FqlCheckerFilterClause.class);
  }

  @Override
  @Nullable
  public FqlCheckerFunctionName getFunctionName() {
    return findChildByClass(FqlCheckerFunctionName.class);
  }

  @Override
  @Nullable
  public FqlCheckerIdentifier getIdentifier() {
    return findChildByClass(FqlCheckerIdentifier.class);
  }

  @Override
  @Nullable
  public FqlCheckerOrderByClause getOrderByClause() {
    return findChildByClass(FqlCheckerOrderByClause.class);
  }

  @Override
  @Nullable
  public FqlCheckerQueryStringFunction getQueryStringFunction() {
    return findChildByClass(FqlCheckerQueryStringFunction.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringAs getStringAs() {
    return findChildByClass(FqlCheckerStringAs.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringFrom getStringFrom() {
    return findChildByClass(FqlCheckerStringFrom.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringInsert getStringInsert() {
    return findChildByClass(FqlCheckerStringInsert.class);
  }

  @Override
  @Nullable
  public FqlCheckerTimeInterval getTimeInterval() {
    return findChildByClass(FqlCheckerTimeInterval.class);
  }

  @Override
  @Nullable
  public PsiElement getLeftBracket() {
    return findChildByType(LEFT_BRACKET);
  }

  @Override
  @Nullable
  public PsiElement getRightBracket() {
    return findChildByType(RIGHT_BRACKET);
  }

}
