package com.camile.checker;

import com.intellij.psi.tree.IElementType;

class FqlElementType extends IElementType {

    public FqlElementType(String debugName) {
        super(debugName, FlinkSqlLanguage.INSTANCE);
    }
}