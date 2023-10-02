package com.discord.kvstorage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


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

    @Override 
    public String getName() {
        return "KvStorage";
    }
}