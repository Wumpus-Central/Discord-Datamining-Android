package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;
import p150i5.C8213a;

/* loaded from: classes7.dex */
public class HermesExecutor extends JavaScriptExecutor {

    /* renamed from: a */
    private static String f8104a;

    static {
        loadLibrary();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HermesExecutor(C8213a aVar, boolean z, String str) {
        super(initHybridDefaultConfig(z, str));
    }

    public static native boolean canLoadFile(String str);

    private static native HybridData initHybrid(boolean z, String str, long j);

    private static native HybridData initHybridDefaultConfig(boolean z, String str);

    public static void loadLibrary() {
        if (f8104a == null) {
            SoLoader.m30787r("hermes");
            try {
                SoLoader.m30787r("hermes-executor-debug");
                f8104a = "Debug";
            } catch (UnsatisfiedLinkError unused) {
                SoLoader.m30787r("hermes-executor-release");
                f8104a = "Release";
            }
        }
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "HermesExecutor" + f8104a;
    }
}
