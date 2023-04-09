package com.camile.checker;

import com.camile.checker.language._FlinkSqlCheckerLexer;
import com.intellij.lexer.FlexAdapter;

public class FlinkSqlCheckerLexerAdapter extends FlexAdapter {

    public FlinkSqlCheckerLexerAdapter() {
        super(new _FlinkSqlCheckerLexer(null));
    }
}
