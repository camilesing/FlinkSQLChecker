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

public class FqlCheckerInsertFromSelectQueriesImpl extends ASTWrapperPsiElement implements FqlCheckerInsertFromSelectQueries {

  public FqlCheckerInsertFromSelectQueriesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitInsertFromSelectQueries(this);
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
  public FqlCheckerColumnList getColumnList() {
    return findChildByClass(FqlCheckerColumnList.class);
  }

  @Override
  @Nullable
  public FqlCheckerDbName getDbName() {
    return findChildByClass(FqlCheckerDbName.class);
  }

  @Override
  @Nullable
  public FqlCheckerPartSpec getPartSpec() {
    return findChildByClass(FqlCheckerPartSpec.class);
  }

  @Override
  @NotNull
  public FqlCheckerQuery getQuery() {
    return findNotNullChildByClass(FqlCheckerQuery.class);
  }

  @Override
  @NotNull
  public FqlCheckerStringInsert getStringInsert() {
    return findNotNullChildByClass(FqlCheckerStringInsert.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringInto getStringInto() {
    return findChildByClass(FqlCheckerStringInto.class);
  }

  @Override
  @NotNull
  public FqlCheckerTableName getTableName() {
    return findNotNullChildByClass(FqlCheckerTableName.class);
  }

}
