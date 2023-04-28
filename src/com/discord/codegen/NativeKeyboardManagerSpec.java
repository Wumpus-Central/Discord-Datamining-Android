package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p078e6.AbstractC6709a;

/* loaded from: classes4.dex */
public abstract class NativeKeyboardManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeKeyboardManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @AbstractC6709a
    @ReactMethod
    public abstract void clearCurrentFocusAndDismissKeyboard();

    @AbstractC6709a
    @ReactMethod
    public abstract void dismissGlobalKeyboard();

    @AbstractC6709a
    @ReactMethod
    public abstract void onKeyboardChanged(boolean z);

    @AbstractC6709a
    @ReactMethod
    public abstract void showGlobalKeyboard();
}
