package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import e5.a;


public abstract class NativeSavedAppConstantsSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RTNSavedAppConstants";

    public NativeSavedAppConstantsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override 
    public String getName() {
        return "RTNSavedAppConstants";
    }

    @ReactMethod
    @a
    public abstract void setMaxMessagesExperimentId(double d10);
}
