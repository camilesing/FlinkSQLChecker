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

public class FqlCheckerInsertStatementImpl extends ASTWrapperPsiElement implements FqlCheckerInsertStatement {

  public FqlCheckerInsertStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitInsertStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerInsertFromSelectQueries getInsertFromSelectQueries() {
    return findChildByClass(FqlCheckerInsertFromSelectQueries.class);
  }

  @Override
  @Nullable
  public FqlCheckerInsertIntoMultipleTables getInsertIntoMultipleTables() {
    return findChildByClass(FqlCheckerInsertIntoMultipleTables.class);
  }

  @Override
  @Nullable
  public FqlCheckerInsertValuesIntoTables getInsertValuesIntoTables() {
    return findChildByClass(FqlCheckerInsertValuesIntoTables.class);
  }

}
