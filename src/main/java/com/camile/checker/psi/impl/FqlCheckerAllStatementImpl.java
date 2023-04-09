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

public class FqlCheckerAllStatementImpl extends ASTWrapperPsiElement implements FqlCheckerAllStatement {

  public FqlCheckerAllStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitAllStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerCreateStatement getCreateStatement() {
    return findChildByClass(FqlCheckerCreateStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerInsertStatement getInsertStatement() {
    return findChildByClass(FqlCheckerInsertStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerJarCommand getJarCommand() {
    return findChildByClass(FqlCheckerJarCommand.class);
  }

  @Override
  @Nullable
  public FqlCheckerNote getNote() {
    return findChildByClass(FqlCheckerNote.class);
  }

  @Override
  @Nullable
  public FqlCheckerQueryStatement getQueryStatement() {
    return findChildByClass(FqlCheckerQueryStatement.class);
  }

  @Override
  @Nullable
  public FqlCheckerSelectStatement getSelectStatement() {
    return findChildByClass(FqlCheckerSelectStatement.class);
  }

}
