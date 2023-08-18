package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import e5.a;


public abstract class NativeAppIconManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RTNAppIconManager";

    public NativeAppIconManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void getAvailableIcons(Promise promise);

    @ReactMethod
    @a
    public abstract void getCurrentIcon(Promise promise);

    @Override 
    public String getName() {
        return "RTNAppIconManager";
    }

    @ReactMethod
    @a
    public abstract void setIcon(String str, Promise promise);
}
