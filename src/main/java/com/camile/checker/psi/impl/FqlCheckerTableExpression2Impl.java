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

public class FqlCheckerTableExpression2Impl extends ASTWrapperPsiElement implements FqlCheckerTableExpression2 {

  public FqlCheckerTableExpression2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitTableExpression2(this);
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
  public FqlCheckerJoinCondition getJoinCondition() {
    return findChildByClass(FqlCheckerJoinCondition.class);
  }

  @Override
  @Nullable
  public FqlCheckerTableExpression2 getTableExpression2() {
    return findChildByClass(FqlCheckerTableExpression2.class);
  }

  @Override
  @Nullable
  public FqlCheckerTableName getTableName() {
    return findChildByClass(FqlCheckerTableName.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerTableReference> getTableReferenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerTableReference.class);
  }

}
