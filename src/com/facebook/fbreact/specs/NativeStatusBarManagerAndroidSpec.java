package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
import p078e6.AbstractC6709a;

/* loaded from: classes7.dex */
public abstract class NativeStatusBarManagerAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeStatusBarManagerAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @AbstractC6709a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    protected abstract Map<String, Object> getTypedExportedConstants();

    @AbstractC6709a
    @ReactMethod
    public abstract void setColor(double d, boolean z);

    @AbstractC6709a
    @ReactMethod
    public abstract void setHidden(boolean z);

    @AbstractC6709a
    @ReactMethod
    public abstract void setStyle(String str);

    @AbstractC6709a
    @ReactMethod
    public abstract void setTranslucent(boolean z);
}
