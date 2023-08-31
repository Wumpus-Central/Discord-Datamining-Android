package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import e5.a;


public abstract class NativeDevicePerformanceManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RTNDevicePerformanceManager";

    public NativeDevicePerformanceManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @a
    public abstract double getMediaPerformanceClass();

    @Override 
    public String getName() {
        return "RTNDevicePerformanceManager";
    }
}
