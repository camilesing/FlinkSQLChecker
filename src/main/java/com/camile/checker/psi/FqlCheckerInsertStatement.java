// This is a generated file. Not intended for manual editing.
package com.camile.checker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FqlCheckerInsertStatement extends PsiElement {

  @Nullable
  FqlCheckerInsertFromSelectQueries getInsertFromSelectQueries();

  @Nullable
  FqlCheckerInsertIntoMultipleTables getInsertIntoMultipleTables();

  @Nullable
  FqlCheckerInsertValuesIntoTables getInsertValuesIntoTables();

}
