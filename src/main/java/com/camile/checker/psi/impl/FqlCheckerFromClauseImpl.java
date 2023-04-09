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

public class FqlCheckerFromClauseImpl extends ASTWrapperPsiElement implements FqlCheckerFromClause {

  public FqlCheckerFromClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitFromClause(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FqlCheckerStringFrom getStringFrom() {
    return findNotNullChildByClass(FqlCheckerStringFrom.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerTableReferenceV2> getTableReferenceV2List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerTableReferenceV2.class);
  }

}
