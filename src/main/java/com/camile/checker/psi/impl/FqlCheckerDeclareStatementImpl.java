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

public class FqlCheckerDeclareStatementImpl extends ASTWrapperPsiElement implements FqlCheckerDeclareStatement {

  public FqlCheckerDeclareStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitDeclareStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerAssignmentStatementOperand getAssignmentStatementOperand() {
    return findChildByClass(FqlCheckerAssignmentStatementOperand.class);
  }

  @Override
  @Nullable
  public FqlCheckerDataType getDataType() {
    return findChildByClass(FqlCheckerDataType.class);
  }

  @Override
  @Nullable
  public FqlCheckerEq getEq() {
    return findChildByClass(FqlCheckerEq.class);
  }

  @Override
  @NotNull
  public FqlCheckerIdentifier getIdentifier() {
    return findNotNullChildByClass(FqlCheckerIdentifier.class);
  }

}
