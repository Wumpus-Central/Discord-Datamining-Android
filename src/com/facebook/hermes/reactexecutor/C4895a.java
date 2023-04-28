package com.facebook.hermes.reactexecutor;

import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import p150i5.C8213a;

/* renamed from: com.facebook.hermes.reactexecutor.a */
/* loaded from: classes7.dex */
public class C4895a implements JavaScriptExecutorFactory {

    /* renamed from: a */
    private boolean f8105a;

    /* renamed from: b */
    private String f8106b;

    public C4895a() {
        this(null);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        return new HermesExecutor(null, this.f8105a, this.f8106b);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        HermesSamplingProfiler.enable();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String str) {
        HermesSamplingProfiler.dumpSampledTraceToFile(str);
        HermesSamplingProfiler.disable();
    }

    public String toString() {
        return "JSIExecutor+HermesRuntime";
    }

    public C4895a(C8213a aVar) {
        this.f8105a = true;
        this.f8106b = "";
    }
}
