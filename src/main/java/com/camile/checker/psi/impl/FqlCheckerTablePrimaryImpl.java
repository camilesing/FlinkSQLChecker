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

public class FqlCheckerTablePrimaryImpl extends ASTWrapperPsiElement implements FqlCheckerTablePrimary {

  public FqlCheckerTablePrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitTablePrimary(this);
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
  public FqlCheckerDynamicTableOptions getDynamicTableOptions() {
    return findChildByClass(FqlCheckerDynamicTableOptions.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerExpression.class);
  }

  @Override
  @Nullable
  public FqlCheckerQuery getQuery() {
    return findChildByClass(FqlCheckerQuery.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringAs getStringAs() {
    return findChildByClass(FqlCheckerStringAs.class);
  }

  @Override
  @Nullable
  public FqlCheckerSystemTimePeriod getSystemTimePeriod() {
    return findChildByClass(FqlCheckerSystemTimePeriod.class);
  }

  @Override
  @Nullable
  public FqlCheckerTablePath getTablePath() {
    return findChildByClass(FqlCheckerTablePath.class);
  }

}
