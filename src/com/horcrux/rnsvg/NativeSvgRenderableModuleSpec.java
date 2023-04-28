package com.horcrux.rnsvg;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import p078e6.AbstractC6709a;

/* loaded from: classes6.dex */
public abstract class NativeSvgRenderableModuleSpec extends ReactContextBaseJavaModule {
    public NativeSvgRenderableModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @AbstractC6709a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getBBox(Double d, ReadableMap readableMap);

    @AbstractC6709a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getCTM(Double d);

    @AbstractC6709a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getPointAtLength(Double d, ReadableMap readableMap);

    @AbstractC6709a
    @ReactMethod
    public abstract void getRawResource(String str, Promise promise);

    @AbstractC6709a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getScreenCTM(Double d);

    @AbstractC6709a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract double getTotalLength(Double d);

    @AbstractC6709a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean isPointInFill(Double d, ReadableMap readableMap);

    @AbstractC6709a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean isPointInStroke(Double d, ReadableMap readableMap);
}
