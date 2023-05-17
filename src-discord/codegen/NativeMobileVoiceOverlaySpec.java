package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import e6.a;

/* loaded from: classes5.dex */
public abstract class NativeMobileVoiceOverlaySpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeMobileVoiceOverlaySpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void enableOverlay(Promise promise);

    @a
    @ReactMethod
    public abstract void hideOverlay();

    @a
    @ReactMethod
    public abstract void setData(ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void showOverlay(ReadableMap readableMap);
}
