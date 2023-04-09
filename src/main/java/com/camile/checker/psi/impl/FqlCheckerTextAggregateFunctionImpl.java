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

public class FqlCheckerTextAggregateFunctionImpl extends ASTWrapperPsiElement implements FqlCheckerTextAggregateFunction {

  public FqlCheckerTextAggregateFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitTextAggregateFunction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FqlCheckerBaseString> getBaseStringList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerBaseString.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerDerivedColumn> getDerivedColumnList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerDerivedColumn.class);
  }

  @Override
  @Nullable
  public FqlCheckerFor getFor() {
    return findChildByClass(FqlCheckerFor.class);
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
  public PsiElement getLeftBracket() {
    return findChildByType(LEFT_BRACKET);
  }

  @Override
  @Nullable
  public PsiElement getRightBracket() {
    return findChildByType(RIGHT_BRACKET);
  }

}
