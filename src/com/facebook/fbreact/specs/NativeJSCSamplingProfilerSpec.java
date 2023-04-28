package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p078e6.AbstractC6709a;

/* loaded from: classes7.dex */
public abstract class NativeJSCSamplingProfilerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeJSCSamplingProfilerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void operationComplete(double d, String str, String str2);
}
