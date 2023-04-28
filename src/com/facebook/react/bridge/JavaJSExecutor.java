package com.facebook.react.bridge;

import p078e6.AbstractC6709a;

@AbstractC6709a
/* loaded from: classes7.dex */
public interface JavaJSExecutor {

    /* loaded from: classes7.dex */
    public interface Factory {
        JavaJSExecutor create();
    }

    /* loaded from: classes7.dex */
    public static class ProxyExecutorException extends Exception {
        public ProxyExecutorException(Throwable th2) {
            super(th2);
        }
    }

    void close();

    @AbstractC6709a
    String executeJSCall(String str, String str2);

    @AbstractC6709a
    void loadBundle(String str);

    @AbstractC6709a
    void setGlobalVariable(String str, String str2);
}
