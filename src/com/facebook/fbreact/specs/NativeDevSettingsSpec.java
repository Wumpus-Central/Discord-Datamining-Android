package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p078e6.AbstractC6709a;

/* loaded from: classes7.dex */
public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeDevSettingsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void addListener(String str);

    @AbstractC6709a
    @ReactMethod
    public abstract void addMenuItem(String str);

    @AbstractC6709a
    @ReactMethod
    public void onFastRefresh() {
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void reload();

    @AbstractC6709a
    @ReactMethod
    public void reloadWithReason(String str) {
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void removeListeners(double d);

    @AbstractC6709a
    @ReactMethod
    public abstract void setHotLoadingEnabled(boolean z);

    @AbstractC6709a
    @ReactMethod
    public abstract void setIsDebuggingRemotely(boolean z);

    @AbstractC6709a
    @ReactMethod
    public abstract void setIsShakeToShowDevMenuEnabled(boolean z);

    @AbstractC6709a
    @ReactMethod
    public abstract void setProfilingEnabled(boolean z);

    @AbstractC6709a
    @ReactMethod
    public abstract void toggleElementInspector();
}
