package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import e5.a;


public abstract class NativeThemeManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeThemeManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void updateTheme(String str);
}
