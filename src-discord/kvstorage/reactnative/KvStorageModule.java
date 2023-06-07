package com.discord.kvstorage.reactnative;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* loaded from: classes4.dex */
class KvStorageModule extends ReactContextBaseJavaModule {
    public KvStorageModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean activate() {
        try {
            System.loadLibrary("kv_storage");
            KvStorageBridge.instance.activate(getReactApplicationContext());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KvStorage";
    }
}
