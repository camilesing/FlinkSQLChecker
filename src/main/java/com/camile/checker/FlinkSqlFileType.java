package com.camile.checker;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class FlinkSqlFileType extends LanguageFileType {

    public static final FlinkSqlFileType INSTANCE = new FlinkSqlFileType();

    public FlinkSqlFileType() {
        super(FlinkSqlLanguage.INSTANCE);
    }

    @Override
    public @NotNull String getName() {
        return "Flink-SQL";
    }

    @Override
    public @NotNull String getDescription() {
        return "Flink SQL file";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "fql";
    }

    @Override
    public @Nullable Icon getIcon() {
        return FlinkSqlIcons.FILE;
    }
}
