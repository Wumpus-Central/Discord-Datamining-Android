package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import e5.a;

/* loaded from: classes3.dex */
public abstract class NativeKeyboardManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeKeyboardManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void clearCurrentFocusAndDismissKeyboard();

    @ReactMethod
    @a
    public abstract void dismissGlobalKeyboard();

    @ReactMethod
    @a
    public abstract void onKeyboardChanged(boolean z10);

    @ReactMethod
    @a
    public abstract void showGlobalKeyboard();
}
