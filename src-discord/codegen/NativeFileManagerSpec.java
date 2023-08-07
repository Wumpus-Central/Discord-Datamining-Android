package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import e5.a;
import java.util.Map;


public abstract class NativeFileManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RTNFileManager";

    public NativeFileManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void fileExists(String str, Promise promise);

    @Override 
    @a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @Override 
    public String getName() {
        return "RTNFileManager";
    }

    @ReactMethod
    @a
    public abstract void getSize(String str, Promise promise);

    protected abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @a
    public abstract void readAsset(String str, String str2, Promise promise);

    @ReactMethod
    @a
    public abstract void readFile(String str, String str2, Promise promise);

    @ReactMethod
    @a
    public abstract void saveFileToGallery(String str, String str2, String str3, Promise promise);

    @ReactMethod
    @a
    public abstract void writeFile(String str, String str2, String str3, String str4, Promise promise);
}
