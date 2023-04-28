package com.facebook.react.fabric;

import p078e6.AbstractC6709a;

@AbstractC6709a
/* loaded from: classes7.dex */
public interface ReactNativeConfig {
    public static final ReactNativeConfig DEFAULT_CONFIG = new EmptyReactNativeConfig();

    @AbstractC6709a
    boolean getBool(String str);

    @AbstractC6709a
    double getDouble(String str);

    @AbstractC6709a
    long getInt64(String str);

    @AbstractC6709a
    String getString(String str);
}
