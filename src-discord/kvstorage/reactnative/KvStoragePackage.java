package com.discord.kvstorage.reactnative;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;


public class KvStoragePackage implements ReactPackage {
    @Override 
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new KvStorageModule(reactApplicationContext));
    }

    @Override 
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
