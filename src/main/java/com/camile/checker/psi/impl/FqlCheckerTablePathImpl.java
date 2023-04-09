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

public class FqlCheckerTablePathImpl extends ASTWrapperPsiElement implements FqlCheckerTablePath {

  public FqlCheckerTablePathImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitTablePath(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerCatalogName getCatalogName() {
    return findChildByClass(FqlCheckerCatalogName.class);
  }

  @Override
  @Nullable
  public FqlCheckerDbName getDbName() {
    return findChildByClass(FqlCheckerDbName.class);
  }

  @Override
  @NotNull
  public FqlCheckerTableName getTableName() {
    return findNotNullChildByClass(FqlCheckerTableName.class);
  }

}
