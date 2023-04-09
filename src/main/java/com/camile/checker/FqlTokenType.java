package com.camile.checker;

import com.intellij.psi.tree.IElementType;

public class FqlTokenType extends IElementType {

    public FqlTokenType(String debugName) {
        super(debugName, FlinkSqlLanguage.INSTANCE);
    }

    public String toString() {
        return "FqlTokenType." + super.toString();
    }

}