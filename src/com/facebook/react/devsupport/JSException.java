package com.facebook.react.devsupport;

import p078e6.AbstractC6709a;

@AbstractC6709a
/* loaded from: classes7.dex */
public class JSException extends Exception {
    private final String mStack;

    @AbstractC6709a
    public JSException(String str, String str2, Throwable th2) {
        super(str, th2);
        this.mStack = str2;
    }

    public String getStack() {
        return this.mStack;
    }

    public JSException(String str, String str2) {
        super(str);
        this.mStack = str2;
    }
}
