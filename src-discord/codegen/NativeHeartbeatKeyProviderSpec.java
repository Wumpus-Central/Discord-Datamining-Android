package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h6.a;

/* loaded from: classes8.dex */
public abstract class NativeHeartbeatKeyProviderSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeHeartbeatKeyProviderSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getHeartbeatInitializedTimestamp();

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getHeartbeatRefreshedTimestamp();

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getHeartbeatUUID();

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getLatestHeartbeatEventTimestamp();

    @a
    @ReactMethod
    public abstract void setHeartbeatInitializedTimestamp(String str);

    @a
    @ReactMethod
    public abstract void setHeartbeatRefreshedTimestamp(String str);

    @a
    @ReactMethod
    public abstract void setHeartbeatUUID(String str);

    @a
    @ReactMethod
    public abstract void setLatestHeartbeatEventTimestamp(String str);
}
