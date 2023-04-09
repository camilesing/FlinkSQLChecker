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

public class FqlCheckerNamedParameterListImpl extends ASTWrapperPsiElement implements FqlCheckerNamedParameterList {

  public FqlCheckerNamedParameterListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitNamedParameterList(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FqlCheckerEq> getEqList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerEq.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerExpression.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerGt> getGtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerGt.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerIdentifier.class);
  }

}
