package com.facebook.react.fabric;

/* loaded from: classes7.dex */
public class EmptyReactNativeConfig implements ReactNativeConfig {
    @Override // com.facebook.react.fabric.ReactNativeConfig
    public boolean getBool(String str) {
        return false;
    }

    @Override // com.facebook.react.fabric.ReactNativeConfig
    public double getDouble(String str) {
        return 0.0d;
    }

    @Override // com.facebook.react.fabric.ReactNativeConfig
    public long getInt64(String str) {
        return 0L;
    }

    @Override // com.facebook.react.fabric.ReactNativeConfig
    public String getString(String str) {
        return "";
    }
}
