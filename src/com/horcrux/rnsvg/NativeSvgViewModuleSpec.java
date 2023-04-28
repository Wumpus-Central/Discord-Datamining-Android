package com.horcrux.rnsvg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import p078e6.AbstractC6709a;

/* loaded from: classes6.dex */
public abstract class NativeSvgViewModuleSpec extends ReactContextBaseJavaModule {
    public NativeSvgViewModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void toDataURL(Double d, ReadableMap readableMap, Callback callback);
}
