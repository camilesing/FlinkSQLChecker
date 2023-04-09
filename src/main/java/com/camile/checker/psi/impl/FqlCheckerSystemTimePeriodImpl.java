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

public class FqlCheckerSystemTimePeriodImpl extends ASTWrapperPsiElement implements FqlCheckerSystemTimePeriod {

  public FqlCheckerSystemTimePeriodImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitSystemTimePeriod(this);
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
  @NotNull
  public FqlCheckerCatalogName getCatalogName() {
    return findNotNullChildByClass(FqlCheckerCatalogName.class);
  }

  @Override
  @NotNull
  public FqlCheckerCondition getCondition() {
    return findNotNullChildByClass(FqlCheckerCondition.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerStringAs> getStringAsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerStringAs.class);
  }

  @Override
  @NotNull
  public FqlCheckerTableNameV2 getTableNameV2() {
    return findNotNullChildByClass(FqlCheckerTableNameV2.class);
  }

}
