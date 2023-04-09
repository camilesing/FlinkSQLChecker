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

public class FqlCheckerMetadataColumnDefinitionImpl extends ASTWrapperPsiElement implements FqlCheckerMetadataColumnDefinition {

  public FqlCheckerMetadataColumnDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitMetadataColumnDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FqlCheckerColumnName getColumnName() {
    return findNotNullChildByClass(FqlCheckerColumnName.class);
  }

  @Override
  @NotNull
  public FqlCheckerDataType getDataType() {
    return findNotNullChildByClass(FqlCheckerDataType.class);
  }

  @Override
  @Nullable
  public FqlCheckerMetadataKey getMetadataKey() {
    return findChildByClass(FqlCheckerMetadataKey.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringFrom getStringFrom() {
    return findChildByClass(FqlCheckerStringFrom.class);
  }

}
