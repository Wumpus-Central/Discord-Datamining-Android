package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p078e6.AbstractC6709a;

/* loaded from: classes7.dex */
public abstract class NativeAnimatedModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeAnimatedModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void addAnimatedEventToView(double d, String str, ReadableMap readableMap);

    @AbstractC6709a
    @ReactMethod
    public abstract void addListener(String str);

    @AbstractC6709a
    @ReactMethod
    public abstract void connectAnimatedNodeToView(double d, double d2);

    @AbstractC6709a
    @ReactMethod
    public abstract void connectAnimatedNodes(double d, double d2);

    @AbstractC6709a
    @ReactMethod
    public abstract void createAnimatedNode(double d, ReadableMap readableMap);

    @AbstractC6709a
    @ReactMethod
    public abstract void disconnectAnimatedNodeFromView(double d, double d2);

    @AbstractC6709a
    @ReactMethod
    public abstract void disconnectAnimatedNodes(double d, double d2);

    @AbstractC6709a
    @ReactMethod
    public abstract void dropAnimatedNode(double d);

    @AbstractC6709a
    @ReactMethod
    public abstract void extractAnimatedNodeOffset(double d);

    @AbstractC6709a
    @ReactMethod
    public abstract void finishOperationBatch();

    @AbstractC6709a
    @ReactMethod
    public abstract void flattenAnimatedNodeOffset(double d);

    @AbstractC6709a
    @ReactMethod
    public abstract void getValue(double d, Callback callback);

    @AbstractC6709a
    @ReactMethod
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void removeAnimatedEventFromView(double d, String str, double d2);

    @AbstractC6709a
    @ReactMethod
    public abstract void removeListeners(double d);

    @AbstractC6709a
    @ReactMethod
    public abstract void restoreDefaultValues(double d);

    @AbstractC6709a
    @ReactMethod
    public abstract void setAnimatedNodeOffset(double d, double d2);

    @AbstractC6709a
    @ReactMethod
    public abstract void setAnimatedNodeValue(double d, double d2);

    @AbstractC6709a
    @ReactMethod
    public abstract void startAnimatingNode(double d, double d2, ReadableMap readableMap, Callback callback);

    @AbstractC6709a
    @ReactMethod
    public abstract void startListeningToAnimatedNodeValue(double d);

    @AbstractC6709a
    @ReactMethod
    public abstract void startOperationBatch();

    @AbstractC6709a
    @ReactMethod
    public abstract void stopAnimation(double d);

    @AbstractC6709a
    @ReactMethod
    public abstract void stopListeningToAnimatedNodeValue(double d);

    @AbstractC6709a
    @ReactMethod
    public void updateAnimatedNodeConfig(double d, ReadableMap readableMap) {
    }
}
