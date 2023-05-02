package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import e6.a;

/* loaded from: classes4.dex */
public abstract class NativeKeyboardManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeKeyboardManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void clearCurrentFocusAndDismissKeyboard();

    @a
    @ReactMethod
    public abstract void dismissGlobalKeyboard();

    @a
    @ReactMethod
    public abstract void onKeyboardChanged(boolean z10);

    @a
    @ReactMethod
    public abstract void showGlobalKeyboard();
}
