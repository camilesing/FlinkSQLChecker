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

public class FqlCheckerKeyWordsImpl extends ASTWrapperPsiElement implements FqlCheckerKeyWords {

  public FqlCheckerKeyWordsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FqlCheckerVisitor visitor) {
    visitor.visitKeyWords(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FqlCheckerVisitor) accept((FqlCheckerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FqlCheckerDataType getDataType() {
    return findChildByClass(FqlCheckerDataType.class);
  }

  @Override
  @Nullable
  public FqlCheckerFunctionName getFunctionName() {
    return findChildByClass(FqlCheckerFunctionName.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringAs getStringAs() {
    return findChildByClass(FqlCheckerStringAs.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringBy getStringBy() {
    return findChildByClass(FqlCheckerStringBy.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringCase getStringCase() {
    return findChildByClass(FqlCheckerStringCase.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringCreate getStringCreate() {
    return findChildByClass(FqlCheckerStringCreate.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringElse getStringElse() {
    return findChildByClass(FqlCheckerStringElse.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringEnd getStringEnd() {
    return findChildByClass(FqlCheckerStringEnd.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringFrom getStringFrom() {
    return findChildByClass(FqlCheckerStringFrom.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringInsert getStringInsert() {
    return findChildByClass(FqlCheckerStringInsert.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringLike getStringLike() {
    return findChildByClass(FqlCheckerStringLike.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringLimit getStringLimit() {
    return findChildByClass(FqlCheckerStringLimit.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringNot getStringNot() {
    return findChildByClass(FqlCheckerStringNot.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringOrder getStringOrder() {
    return findChildByClass(FqlCheckerStringOrder.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringSelect getStringSelect() {
    return findChildByClass(FqlCheckerStringSelect.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringTable getStringTable() {
    return findChildByClass(FqlCheckerStringTable.class);
  }

  @Override
  @Nullable
  public FqlCheckerStringWhen getStringWhen() {
    return findChildByClass(FqlCheckerStringWhen.class);
  }

}
