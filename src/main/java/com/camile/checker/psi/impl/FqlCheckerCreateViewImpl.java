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

public class FqlCheckerCreateViewImpl extends ASTWrapperPsiElement implements FqlCheckerCreateView {

  public FqlCheckerCreateViewImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitCreateView(this);
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
  public FqlCheckerQueryWithoutSemiColon getQueryWithoutSemiColon() {
    return findNotNullChildByClass(FqlCheckerQueryWithoutSemiColon.class);
  }

  @Override
  @NotNull
  public FqlCheckerStringAs getStringAs() {
    return findNotNullChildByClass(FqlCheckerStringAs.class);
  }

  @Override
  @NotNull
  public FqlCheckerStringCreate getStringCreate() {
    return findNotNullChildByClass(FqlCheckerStringCreate.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringNot getStringNot() {
    return findChildByClass(FqlCheckerStringNot.class);
  }

  @Override
  @NotNull
  public FqlCheckerTableName getTableName() {
    return findNotNullChildByClass(FqlCheckerTableName.class);
  }

}
