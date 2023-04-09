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

public class FqlCheckerTablePrimaryV2Impl extends ASTWrapperPsiElement implements FqlCheckerTablePrimaryV2 {

  public FqlCheckerTablePrimaryV2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitTablePrimaryV2(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerJoinedTable getJoinedTable() {
    return findChildByClass(FqlCheckerJoinedTable.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerMakeDepOptions> getMakeDepOptionsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerMakeDepOptions.class);
  }

  @Override
  @Nullable
  public FqlCheckerTableNameV2 getTableNameV2() {
    return findChildByClass(FqlCheckerTableNameV2.class);
  }

  @Override
  @Nullable
  public FqlCheckerTableSubQuery getTableSubQuery() {
    return findChildByClass(FqlCheckerTableSubQuery.class);
  }

}
