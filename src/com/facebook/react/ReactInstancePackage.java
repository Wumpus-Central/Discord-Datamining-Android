package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;

@Deprecated
/* loaded from: classes7.dex */
public abstract class ReactInstancePackage implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new RuntimeException("ReactInstancePackage must be passed in the ReactInstanceManager.");
    }

    public abstract List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager);
}
