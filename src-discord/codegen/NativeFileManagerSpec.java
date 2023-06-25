package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import f5.a;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class NativeFileManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeFileManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void fileExists(String str, Promise promise);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @a
    @ReactMethod
    public abstract void getSize(String str, Promise promise);

    protected abstract Map<String, Object> getTypedExportedConstants();

    @a
    @ReactMethod
    public abstract void readAsset(String str, String str2, Promise promise);

    @a
    @ReactMethod
    public abstract void readFile(String str, String str2, Promise promise);

    @a
    @ReactMethod
    public abstract void saveFileToGallery(String str, String str2, String str3, Promise promise);

    @a
    @ReactMethod
    public abstract void writeFile(String str, String str2, String str3, String str4, Promise promise);
}
