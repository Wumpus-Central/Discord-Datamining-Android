package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p078e6.AbstractC6709a;

/* loaded from: classes7.dex */
public abstract class NativeLinkingManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeLinkingManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void addListener(String str);

    @AbstractC6709a
    @ReactMethod
    public abstract void canOpenURL(String str, Promise promise);

    @AbstractC6709a
    @ReactMethod
    public abstract void getInitialURL(Promise promise);

    @AbstractC6709a
    @ReactMethod
    public abstract void openSettings(Promise promise);

    @AbstractC6709a
    @ReactMethod
    public abstract void openURL(String str, Promise promise);

    @AbstractC6709a
    @ReactMethod
    public abstract void removeListeners(double d);
}
