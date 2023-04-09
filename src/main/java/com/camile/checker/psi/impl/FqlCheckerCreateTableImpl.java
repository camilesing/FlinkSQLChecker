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

public class FqlCheckerCreateTableImpl extends ASTWrapperPsiElement implements FqlCheckerCreateTable {

  public FqlCheckerCreateTableImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitCreateTable(this);
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
  @NotNull
  public List<FqlCheckerColumnName> getColumnNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerColumnName.class);
  }

  @Override
  @Nullable
  public FqlCheckerCommentContent getCommentContent() {
    return findChildByClass(FqlCheckerCommentContent.class);
  }

  @Override
  @Nullable
  public FqlCheckerDbName getDbName() {
    return findChildByClass(FqlCheckerDbName.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerKey> getKeyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerKey.class);
  }

  @Override
  @Nullable
  public FqlCheckerLikeOptions getLikeOptions() {
    return findChildByClass(FqlCheckerLikeOptions.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerOneTableField> getOneTableFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerOneTableField.class);
  }

  @Override
  @Nullable
  public FqlCheckerQuery getQuery() {
    return findChildByClass(FqlCheckerQuery.class);
  }

  @Override
  @Nullable
  public FqlCheckerSourceTable getSourceTable() {
    return findChildByClass(FqlCheckerSourceTable.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringAs getStringAs() {
    return findChildByClass(FqlCheckerStringAs.class);
  }

  @Override
  @NotNull
  public FqlCheckerStringCreate getStringCreate() {
    return findNotNullChildByClass(FqlCheckerStringCreate.class);
  }

  @Override
  @NotNull
  public FqlCheckerStringTable getStringTable() {
    return findNotNullChildByClass(FqlCheckerStringTable.class);
  }

  @Override
  @NotNull
  public FqlCheckerTableName getTableName() {
    return findNotNullChildByClass(FqlCheckerTableName.class);
  }

  @Override
  @NotNull
  public List<FqlCheckerVal> getValList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FqlCheckerVal.class);
  }

  @Override
  @NotNull
  public FqlCheckerWithStr getWithStr() {
    return findNotNullChildByClass(FqlCheckerWithStr.class);
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
