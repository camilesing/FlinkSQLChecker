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

public class FqlCheckerOneTableFieldImpl extends ASTWrapperPsiElement implements FqlCheckerOneTableField {

  public FqlCheckerOneTableFieldImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitOneTableField(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerCommentContent getCommentContent() {
    return findChildByClass(FqlCheckerCommentContent.class);
  }

  @Override
  @Nullable
  public FqlCheckerComputedColumnDefinition getComputedColumnDefinition() {
    return findChildByClass(FqlCheckerComputedColumnDefinition.class);
  }

  @Override
  @Nullable
  public FqlCheckerMetadataColumnDefinition getMetadataColumnDefinition() {
    return findChildByClass(FqlCheckerMetadataColumnDefinition.class);
  }

  @Override
  @Nullable
  public FqlCheckerPhysicalColumnDefinition getPhysicalColumnDefinition() {
    return findChildByClass(FqlCheckerPhysicalColumnDefinition.class);
  }

  @Override
  @Nullable
  public FqlCheckerTableConstraint getTableConstraint() {
    return findChildByClass(FqlCheckerTableConstraint.class);
  }

  @Override
  @Nullable
  public FqlCheckerWatermarkDefinition getWatermarkDefinition() {
    return findChildByClass(FqlCheckerWatermarkDefinition.class);
  }

}
