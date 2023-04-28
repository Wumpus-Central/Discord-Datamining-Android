package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
import p078e6.AbstractC6709a;

/* loaded from: classes7.dex */
public abstract class NativeI18nManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeI18nManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void allowRTL(boolean z);

    @AbstractC6709a
    @ReactMethod
    public abstract void forceRTL(boolean z);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @AbstractC6709a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    protected abstract Map<String, Object> getTypedExportedConstants();

    @AbstractC6709a
    @ReactMethod
    public abstract void swapLeftAndRightInRTL(boolean z);
}
