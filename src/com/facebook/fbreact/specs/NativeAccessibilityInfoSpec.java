package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p078e6.AbstractC6709a;

/* loaded from: classes7.dex */
public abstract class NativeAccessibilityInfoSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeAccessibilityInfoSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void announceForAccessibility(String str);

    @AbstractC6709a
    @ReactMethod
    public void getRecommendedTimeoutMillis(double d, Callback callback) {
    }

    @AbstractC6709a
    @ReactMethod
    public void isAccessibilityServiceEnabled(Callback callback) {
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void isReduceMotionEnabled(Callback callback);

    @AbstractC6709a
    @ReactMethod
    public abstract void isTouchExplorationEnabled(Callback callback);

    @AbstractC6709a
    @ReactMethod
    public abstract void setAccessibilityFocus(double d);
}
