// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerOneTableField extends PsiElement {

  @Nullable
  FqlCheckerCommentContent getCommentContent();

  @Nullable
  FqlCheckerComputedColumnDefinition getComputedColumnDefinition();

  @Nullable
  FqlCheckerMetadataColumnDefinition getMetadataColumnDefinition();

  @Nullable
  FqlCheckerPhysicalColumnDefinition getPhysicalColumnDefinition();

  @Nullable
  FqlCheckerTableConstraint getTableConstraint();

  @Nullable
  FqlCheckerWatermarkDefinition getWatermarkDefinition();

}
