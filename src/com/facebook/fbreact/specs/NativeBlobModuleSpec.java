package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
import p078e6.AbstractC6709a;

/* loaded from: classes7.dex */
public abstract class NativeBlobModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeBlobModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void addNetworkingHandler();

    @AbstractC6709a
    @ReactMethod
    public abstract void addWebSocketHandler(double d);

    @AbstractC6709a
    @ReactMethod
    public abstract void createFromParts(ReadableArray readableArray, String str);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @AbstractC6709a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    protected abstract Map<String, Object> getTypedExportedConstants();

    @AbstractC6709a
    @ReactMethod
    public abstract void release(String str);

    @AbstractC6709a
    @ReactMethod
    public abstract void removeWebSocketHandler(double d);

    @AbstractC6709a
    @ReactMethod
    public abstract void sendOverSocket(ReadableMap readableMap, double d);
}
