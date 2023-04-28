package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p078e6.AbstractC6709a;

/* loaded from: classes7.dex */
public abstract class NativeExceptionsManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeExceptionsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @AbstractC6709a
    @ReactMethod
    public void dismissRedbox() {
    }

    @AbstractC6709a
    @ReactMethod
    public void reportException(ReadableMap readableMap) {
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void reportFatalException(String str, ReadableArray readableArray, double d);

    @AbstractC6709a
    @ReactMethod
    public abstract void reportSoftException(String str, ReadableArray readableArray, double d);

    @AbstractC6709a
    @ReactMethod
    public abstract void updateExceptionMessage(String str, ReadableArray readableArray, double d);
}
