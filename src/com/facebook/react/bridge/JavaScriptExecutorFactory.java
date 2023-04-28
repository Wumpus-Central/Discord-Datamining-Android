package com.facebook.react.bridge;

/* loaded from: classes7.dex */
public interface JavaScriptExecutorFactory {
    JavaScriptExecutor create();

    void startSamplingProfiler();

    void stopSamplingProfiler(String str);
}
