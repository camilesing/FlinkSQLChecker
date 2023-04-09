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

public class FqlCheckerDynamicDataStatementImpl extends ASTWrapperPsiElement implements FqlCheckerDynamicDataStatement {

  public FqlCheckerDynamicDataStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitDynamicDataStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FqlCheckerExpression getExpression() {
    return findNotNullChildByClass(FqlCheckerExpression.class);
  }

  @Override
  @Nullable
  public FqlCheckerIdentifier getIdentifier() {
    return findChildByClass(FqlCheckerIdentifier.class);
  }

  @Override
  @Nullable
  public FqlCheckerSetClauseList getSetClauseList() {
    return findChildByClass(FqlCheckerSetClauseList.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringAs getStringAs() {
    return findChildByClass(FqlCheckerStringAs.class);
  }

  @Override
  @Nullable
  public FqlCheckerTypedElementList getTypedElementList() {
    return findChildByClass(FqlCheckerTypedElementList.class);
  }

  @Override
  @Nullable
  public FqlCheckerUnsignedInteger getUnsignedInteger() {
    return findChildByClass(FqlCheckerUnsignedInteger.class);
  }

}
