package com.facebook.react.bridge;

import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p059d6.C6399a;
import p130h6.C7927a;

/* loaded from: classes7.dex */
public class NativeModuleRegistry {
    private final String TAG = NativeModuleRegistry.class.getSimpleName();
    private final Map<String, ModuleHolder> mModules;
    private final ReactApplicationContext mReactApplicationContext;

    public NativeModuleRegistry(ReactApplicationContext reactApplicationContext, Map<String, ModuleHolder> map) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mModules = map;
    }

    private Map<String, ModuleHolder> getModuleMap() {
        return this.mModules;
    }

    private ReactApplicationContext getReactApplicationContext() {
        return this.mReactApplicationContext;
    }

    public List<NativeModule> getAllModules() {
        ArrayList arrayList = new ArrayList();
        for (ModuleHolder moduleHolder : this.mModules.values()) {
            arrayList.add(moduleHolder.getModule());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<ModuleHolder> getCxxModules() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ModuleHolder> entry : this.mModules.entrySet()) {
            if (entry.getValue().isCxxModule()) {
                if (ReactFeatureFlags.warnOnLegacyNativeModuleSystemUse) {
                    String str = this.TAG;
                    ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Registering legacy NativeModule: Cxx NativeModule (name = \"" + entry.getValue().getName() + "\", className = " + entry.getValue().getClassName() + ")."));
                }
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<JavaModuleWrapper> getJavaModules(JSInstance jSInstance) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ModuleHolder> entry : this.mModules.entrySet()) {
            if (!entry.getValue().isCxxModule()) {
                if (ReactFeatureFlags.warnOnLegacyNativeModuleSystemUse) {
                    String str = this.TAG;
                    ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Registering legacy NativeModule: Java NativeModule (name = \"" + entry.getValue().getName() + "\", className = " + entry.getValue().getClassName() + ")."));
                }
                arrayList.add(new JavaModuleWrapper(jSInstance, entry.getValue()));
            }
        }
        return arrayList;
    }

    public <T extends NativeModule> T getModule(Class<T> cls) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            return (T) ((ModuleHolder) C6399a.m25621d(this.mModules.get(reactModule.name()), reactModule.name() + " could not be found. Is it defined in " + cls.getName())).getModule();
        }
        throw new IllegalArgumentException("Could not find @ReactModule annotation in class " + cls.getName());
    }

    public <T extends NativeModule> boolean hasModule(Class<T> cls) {
        return this.mModules.containsKey(((ReactModule) cls.getAnnotation(ReactModule.class)).name());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyJSInstanceDestroy() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread();
        C7927a.m21142c(0L, "NativeModuleRegistry_notifyJSInstanceDestroy");
        try {
            for (ModuleHolder moduleHolder : this.mModules.values()) {
                moduleHolder.destroy();
            }
        } finally {
            C7927a.m21138g(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyJSInstanceInitialized() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread.");
        ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START);
        C7927a.m21142c(0L, "NativeModuleRegistry_notifyJSInstanceInitialized");
        try {
            for (ModuleHolder moduleHolder : this.mModules.values()) {
                moduleHolder.markInitializable();
            }
        } finally {
            C7927a.m21138g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END);
        }
    }

    public void onBatchComplete() {
        ModuleHolder moduleHolder = this.mModules.get(UIManagerModule.NAME);
        if (moduleHolder != null && moduleHolder.hasInstance()) {
            ((OnBatchCompleteListener) moduleHolder.getModule()).onBatchComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void registerModules(NativeModuleRegistry nativeModuleRegistry) {
        C6399a.m25623b(this.mReactApplicationContext.equals(nativeModuleRegistry.getReactApplicationContext()), "Extending native modules with non-matching application contexts.");
        for (Map.Entry<String, ModuleHolder> entry : nativeModuleRegistry.getModuleMap().entrySet()) {
            String key = entry.getKey();
            if (!this.mModules.containsKey(key)) {
                this.mModules.put(key, entry.getValue());
            }
        }
    }

    public boolean hasModule(String str) {
        return this.mModules.containsKey(str);
    }

    public NativeModule getModule(String str) {
        return ((ModuleHolder) C6399a.m25621d(this.mModules.get(str), "Could not find module with name " + str)).getModule();
    }
}
