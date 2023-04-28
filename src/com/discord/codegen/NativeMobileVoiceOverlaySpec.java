package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p078e6.AbstractC6709a;

/* loaded from: classes4.dex */
public abstract class NativeMobileVoiceOverlaySpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeMobileVoiceOverlaySpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void enableOverlay(Promise promise);

    @AbstractC6709a
    @ReactMethod
    public abstract void hideOverlay();

    @AbstractC6709a
    @ReactMethod
    public abstract void setData(ReadableMap readableMap);

    @AbstractC6709a
    @ReactMethod
    public abstract void showOverlay(ReadableMap readableMap);
}
