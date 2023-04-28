package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p078e6.AbstractC6709a;

/* loaded from: classes4.dex */
public abstract class NativeHeartbeatKeyProviderSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeHeartbeatKeyProviderSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @AbstractC6709a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getHeartbeatInitializedTimestamp();

    @AbstractC6709a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getHeartbeatRefreshedTimestamp();

    @AbstractC6709a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getHeartbeatUUID();

    @AbstractC6709a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getLatestHeartbeatEventTimestamp();

    @AbstractC6709a
    @ReactMethod
    public abstract void setHeartbeatInitializedTimestamp(String str);

    @AbstractC6709a
    @ReactMethod
    public abstract void setHeartbeatRefreshedTimestamp(String str);

    @AbstractC6709a
    @ReactMethod
    public abstract void setHeartbeatUUID(String str);

    @AbstractC6709a
    @ReactMethod
    public abstract void setLatestHeartbeatEventTimestamp(String str);
}
