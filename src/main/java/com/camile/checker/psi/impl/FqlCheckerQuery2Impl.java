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

public class FqlCheckerQuery2Impl extends ASTWrapperPsiElement implements FqlCheckerQuery2 {

  public FqlCheckerQuery2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitQuery2(this);
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
  @NotNull
  public List<FqlCheckerQuery2> getQuery2List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerQuery2.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerSelectV2> getSelectV2List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerSelectV2.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerSelectWithoutFrom> getSelectWithoutFromList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerSelectWithoutFrom.class);
  }

  @Override
  @Nullable
  public FqlCheckerValues getValues() {
    return findChildByClass(FqlCheckerValues.class);
  }

}
