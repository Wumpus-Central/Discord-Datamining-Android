package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p078e6.AbstractC6709a;

/* loaded from: classes7.dex */
public abstract class NativeImageLoaderAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeImageLoaderAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void abortRequest(double d);

    @AbstractC6709a
    @ReactMethod
    public abstract void getSize(String str, Promise promise);

    @AbstractC6709a
    @ReactMethod
    public abstract void getSizeWithHeaders(String str, ReadableMap readableMap, Promise promise);

    @AbstractC6709a
    @ReactMethod
    public abstract void prefetchImage(String str, double d, Promise promise);

    @AbstractC6709a
    @ReactMethod
    public abstract void queryCache(ReadableArray readableArray, Promise promise);
}
