package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import e5.a;

/* loaded from: classes3.dex */
public abstract class NativeHeartbeatKeyProviderSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeHeartbeatKeyProviderSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract String getHeartbeatInitializedTimestamp();

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract String getHeartbeatRefreshedTimestamp();

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract String getHeartbeatUUID();

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract String getLatestHeartbeatEventTimestamp();

    @ReactMethod
    @a
    public abstract void setHeartbeatInitializedTimestamp(String str);

    @ReactMethod
    @a
    public abstract void setHeartbeatRefreshedTimestamp(String str);

    @ReactMethod
    @a
    public abstract void setHeartbeatUUID(String str);

    @ReactMethod
    @a
    public abstract void setLatestHeartbeatEventTimestamp(String str);
}
