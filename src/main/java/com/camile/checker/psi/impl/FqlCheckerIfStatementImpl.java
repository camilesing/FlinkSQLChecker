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

public class FqlCheckerIfStatementImpl extends ASTWrapperPsiElement implements FqlCheckerIfStatement {

  public FqlCheckerIfStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitIfStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerCondition getCondition() {
    return findChildByClass(FqlCheckerCondition.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerIdentifier.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringFrom getStringFrom() {
    return findChildByClass(FqlCheckerStringFrom.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringNot getStringNot() {
    return findChildByClass(FqlCheckerStringNot.class);
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
