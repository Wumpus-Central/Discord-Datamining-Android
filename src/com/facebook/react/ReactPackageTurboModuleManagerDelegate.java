package com.facebook.react;

import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p059d6.C6399a;
import p078e6.AbstractC6709a;

/* loaded from: classes7.dex */
public abstract class ReactPackageTurboModuleManagerDelegate extends TurboModuleManagerDelegate {
    private final ReactApplicationContext mReactApplicationContext;
    private final List<TurboReactPackage> mPackages = new ArrayList();
    private final Map<TurboReactPackage, Map<String, ReactModuleInfo>> mPackageModuleInfos = new HashMap();

    /* loaded from: classes7.dex */
    public static abstract class Builder {
        private ReactApplicationContext mContext;
        private List<ReactPackage> mPackages;

        public ReactPackageTurboModuleManagerDelegate build() {
            C6399a.m25621d(this.mContext, "The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            C6399a.m25621d(this.mPackages, "A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
            return build(this.mContext, this.mPackages);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract ReactPackageTurboModuleManagerDelegate build(ReactApplicationContext reactApplicationContext, List<ReactPackage> list);

        public Builder setPackages(List<ReactPackage> list) {
            this.mPackages = new ArrayList(list);
            return this;
        }

        public Builder setReactApplicationContext(ReactApplicationContext reactApplicationContext) {
            this.mContext = reactApplicationContext;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ReactPackageTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List<ReactPackage> list) {
        this.mReactApplicationContext = reactApplicationContext;
        for (ReactPackage reactPackage : list) {
            if (reactPackage instanceof TurboReactPackage) {
                TurboReactPackage turboReactPackage = (TurboReactPackage) reactPackage;
                this.mPackages.add(turboReactPackage);
                this.mPackageModuleInfos.put(turboReactPackage, turboReactPackage.getReactModuleInfoProvider().getReactModuleInfos());
            }
        }
    }

    private TurboModule resolveModule(String str) {
        NativeModule nativeModule = null;
        for (TurboReactPackage turboReactPackage : this.mPackages) {
            try {
                ReactModuleInfo reactModuleInfo = this.mPackageModuleInfos.get(turboReactPackage).get(str);
                if (reactModuleInfo != null && reactModuleInfo.isTurboModule() && (nativeModule == null || reactModuleInfo.canOverrideExistingModule())) {
                    NativeModule module = turboReactPackage.getModule(str, this.mReactApplicationContext);
                    if (module != null) {
                        nativeModule = module;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (nativeModule instanceof TurboModule) {
            return (TurboModule) nativeModule;
        }
        return null;
    }

    @Override // com.facebook.react.turbomodule.core.TurboModuleManagerDelegate
    public List<String> getEagerInitModuleNames() {
        ArrayList arrayList = new ArrayList();
        for (TurboReactPackage turboReactPackage : this.mPackages) {
            for (ReactModuleInfo reactModuleInfo : turboReactPackage.getReactModuleInfoProvider().getReactModuleInfos().values()) {
                if (reactModuleInfo.isTurboModule() && reactModuleInfo.needsEagerInit()) {
                    arrayList.add(reactModuleInfo.name());
                }
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.turbomodule.core.TurboModuleManagerDelegate
    @AbstractC6709a
    public CxxModuleWrapper getLegacyCxxModule(String str) {
        TurboModule resolveModule = resolveModule(str);
        if (resolveModule != null && (resolveModule instanceof CxxModuleWrapper)) {
            return (CxxModuleWrapper) resolveModule;
        }
        return null;
    }

    @Override // com.facebook.react.turbomodule.core.TurboModuleManagerDelegate
    public TurboModule getModule(String str) {
        TurboModule resolveModule = resolveModule(str);
        if (resolveModule != null && !(resolveModule instanceof CxxModuleWrapper)) {
            return resolveModule;
        }
        return null;
    }
}
