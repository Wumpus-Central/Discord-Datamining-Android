package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import e5.a;


public abstract class NativeMobileVoiceOverlaySpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeMobileVoiceOverlaySpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void enableOverlay(Promise promise);

    @ReactMethod
    @a
    public abstract void hideOverlay();

    @ReactMethod
    @a
    public abstract void setData(ReadableMap readableMap);

    @ReactMethod
    @a
    public abstract void showOverlay(ReadableMap readableMap);
}
