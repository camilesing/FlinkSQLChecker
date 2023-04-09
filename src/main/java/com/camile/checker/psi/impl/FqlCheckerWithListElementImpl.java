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

public class FqlCheckerWithListElementImpl extends ASTWrapperPsiElement implements FqlCheckerWithListElement {

  public FqlCheckerWithListElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitWithListElement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerColumnList getColumnList() {
    return findChildByClass(FqlCheckerColumnList.class);
  }

  @Override
  @NotNull
  public FqlCheckerIdentifier getIdentifier() {
    return findNotNullChildByClass(FqlCheckerIdentifier.class);
  }

  @Override
  @NotNull
  public FqlCheckerQueryExpression getQueryExpression() {
    return findNotNullChildByClass(FqlCheckerQueryExpression.class);
  }

  @Override
  @NotNull
  public FqlCheckerStringAs getStringAs() {
    return findNotNullChildByClass(FqlCheckerStringAs.class);
  }

  @Override
  @NotNull
  public PsiElement getLeftBracket() {
    return findNotNullChildByType(LEFT_BRACKET);
  }

  @Override
  @NotNull
  public PsiElement getRightBracket() {
    return findNotNullChildByType(RIGHT_BRACKET);
  }

}
