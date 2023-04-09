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

public class FqlCheckerBetweenPredicateImpl extends ASTWrapperPsiElement implements FqlCheckerBetweenPredicate {

  public FqlCheckerBetweenPredicateImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitBetweenPredicate(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FqlCheckerCommonValueExpression> getCommonValueExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerCommonValueExpression.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringNot getStringNot() {
    return findChildByClass(FqlCheckerStringNot.class);
  }

}
