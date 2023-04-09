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

public class FqlCheckerSelectV2Impl extends ASTWrapperPsiElement implements FqlCheckerSelectV2 {

  public FqlCheckerSelectV2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitSelectV2(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerFromClause getFromClause() {
    return findChildByClass(FqlCheckerFromClause.class);
  }

  @Override
  @Nullable
  public FqlCheckerGroupByClause getGroupByClause() {
    return findChildByClass(FqlCheckerGroupByClause.class);
  }

  @Override
  @Nullable
  public FqlCheckerHavingClause getHavingClause() {
    return findChildByClass(FqlCheckerHavingClause.class);
  }

  @Override
  @Nullable
  public FqlCheckerIntoClause getIntoClause() {
    return findChildByClass(FqlCheckerIntoClause.class);
  }

  @Override
  @Nullable
  public FqlCheckerLimitClause getLimitClause() {
    return findChildByClass(FqlCheckerLimitClause.class);
  }

  @Override
  @Nullable
  public FqlCheckerOrderByClause getOrderByClause() {
    return findChildByClass(FqlCheckerOrderByClause.class);
  }

  @Override
  @NotNull
  public FqlCheckerSelectClause getSelectClause() {
    return findNotNullChildByClass(FqlCheckerSelectClause.class);
  }

  @Override
  @Nullable
  public FqlCheckerWhereClause getWhereClause() {
    return findChildByClass(FqlCheckerWhereClause.class);
  }

}
