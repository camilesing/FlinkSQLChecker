package com.camile.checker;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class FlinkSqlFile extends PsiFileBase {


    protected FlinkSqlFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, FlinkSqlLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return FlinkSqlFileType.INSTANCE;
    }
}
