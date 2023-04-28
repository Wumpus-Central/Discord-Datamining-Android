package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p078e6.AbstractC6709a;

/* loaded from: classes7.dex */
public abstract class NativeAsyncLocalStorageSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeAsyncLocalStorageSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void clear(Callback callback);

    @AbstractC6709a
    @ReactMethod
    public abstract void getAllKeys(Callback callback);

    @AbstractC6709a
    @ReactMethod
    public abstract void multiGet(ReadableArray readableArray, Callback callback);

    @AbstractC6709a
    @ReactMethod
    public abstract void multiMerge(ReadableArray readableArray, Callback callback);

    @AbstractC6709a
    @ReactMethod
    public abstract void multiRemove(ReadableArray readableArray, Callback callback);

    @AbstractC6709a
    @ReactMethod
    public abstract void multiSet(ReadableArray readableArray, Callback callback);
}
