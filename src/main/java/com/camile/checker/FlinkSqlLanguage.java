package com.camile.checker;

import com.intellij.lang.Language;

public class FlinkSqlLanguage extends Language {

    public static final FlinkSqlLanguage INSTANCE = new FlinkSqlLanguage();

    private FlinkSqlLanguage() {
        super("Flink-SQL");
    }
}
