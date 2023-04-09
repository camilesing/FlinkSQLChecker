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

public class FqlCheckerInsertValuesIntoTablesImpl extends ASTWrapperPsiElement implements FqlCheckerInsertValuesIntoTables {

  public FqlCheckerInsertValuesIntoTablesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitInsertValuesIntoTables(this);
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
  public FqlCheckerStringInsert getStringInsert() {
    return findNotNullChildByClass(FqlCheckerStringInsert.class);
  }

  @Override
  @NotNull
  public FqlCheckerTableName getTableName() {
    return findNotNullChildByClass(FqlCheckerTableName.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerValuesRow> getValuesRowList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerValuesRow.class);
  }

}
