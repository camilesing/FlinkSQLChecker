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

public class FqlCheckerQueryWithoutSemiColon2Impl extends ASTWrapperPsiElement implements FqlCheckerQueryWithoutSemiColon2 {

  public FqlCheckerQueryWithoutSemiColon2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitQueryWithoutSemiColon2(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FqlCheckerOrderItem> getOrderItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerOrderItem.class);
  }

  @Override
  @Nullable
  public FqlCheckerQueryWithoutSemiColon2 getQueryWithoutSemiColon2() {
    return findChildByClass(FqlCheckerQueryWithoutSemiColon2.class);
  }

  @Override
  @Nullable
  public FqlCheckerSelectV2 getSelectV2() {
    return findChildByClass(FqlCheckerSelectV2.class);
  }

  @Override
  @Nullable
  public FqlCheckerSelectWithoutFrom getSelectWithoutFrom() {
    return findChildByClass(FqlCheckerSelectWithoutFrom.class);
  }

  @Override
  @Nullable
  public FqlCheckerValues getValues() {
    return findChildByClass(FqlCheckerValues.class);
  }

}
