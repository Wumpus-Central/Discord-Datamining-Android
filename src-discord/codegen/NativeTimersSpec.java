package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import e5.a;


public abstract class NativeTimersSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "TimersModule";

    public NativeTimersSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void clearInterval(double d10);

    @ReactMethod
    @a
    public abstract void clearTimeout(double d10);

    @Override 
    public String getName() {
        return "TimersModule";
    }

    @ReactMethod
    @a
    public abstract void setInterval(double d10, double d11);

    @ReactMethod
    @a
    public abstract void setTimeout(double d10, double d11);
}
