package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import e5.a;


public abstract class NativeHeartbeatKeyProviderSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RTNHeartbeatKeyProvider";

    public NativeHeartbeatKeyProviderSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @a
    public abstract String getHeartbeatInitializedTimestamp();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @a
    public abstract String getHeartbeatRefreshedTimestamp();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @a
    public abstract String getHeartbeatUUID();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @a
    public abstract String getLatestHeartbeatEventTimestamp();

    @Override 
    public String getName() {
        return "RTNHeartbeatKeyProvider";
    }

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
