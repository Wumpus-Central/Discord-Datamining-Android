package com.facebook.react.turbomodule.core;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p059d6.C6399a;
import p078e6.AbstractC6709a;

/* loaded from: classes7.dex */
public class TurboModuleManager implements JSIModule, TurboModuleRegistry {
    private static volatile boolean sIsSoLibraryLoaded;
    private final TurboModuleProvider mCxxModuleProvider;
    private final List<String> mEagerInitModuleNames;
    @AbstractC6709a
    private final HybridData mHybridData;
    private final TurboModuleProvider mJavaModuleProvider;
    private final Object mTurboModuleCleanupLock = new Object();
    private boolean mTurboModuleCleanupStarted = false;
    private final Map<String, TurboModuleHolder> mTurboModuleHolders = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class TurboModuleHolder {
        private static volatile int sHolderCount;
        private volatile TurboModule mModule = null;
        private volatile boolean mIsTryingToCreate = false;
        private volatile boolean mIsDoneCreatingModule = false;
        private volatile int mModuleId = sHolderCount;

        public TurboModuleHolder() {
            sHolderCount++;
        }

        void endCreatingModule() {
            this.mIsTryingToCreate = false;
            this.mIsDoneCreatingModule = true;
        }

        TurboModule getModule() {
            return this.mModule;
        }

        int getModuleId() {
            return this.mModuleId;
        }

        boolean isCreatingModule() {
            return this.mIsTryingToCreate;
        }

        boolean isDoneCreatingModule() {
            return this.mIsDoneCreatingModule;
        }

        void setModule(TurboModule turboModule) {
            this.mModule = turboModule;
        }

        void startCreatingModule() {
            this.mIsTryingToCreate = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public interface TurboModuleProvider {
        TurboModule getModule(String str);
    }

    public TurboModuleManager(RuntimeExecutor runtimeExecutor, final TurboModuleManagerDelegate turboModuleManagerDelegate, CallInvokerHolder callInvokerHolder, CallInvokerHolder callInvokerHolder2) {
        List<String> list;
        maybeLoadSoLibrary();
        this.mHybridData = initHybrid(runtimeExecutor, (CallInvokerHolderImpl) callInvokerHolder, (CallInvokerHolderImpl) callInvokerHolder2, turboModuleManagerDelegate, ReactFeatureFlags.useGlobalCallbackCleanupScopeUsingRetainJSCallback, ReactFeatureFlags.useTurboModuleManagerCallbackCleanupScope);
        installJSIBindings();
        if (turboModuleManagerDelegate == null) {
            list = new ArrayList<>();
        } else {
            list = turboModuleManagerDelegate.getEagerInitModuleNames();
        }
        this.mEagerInitModuleNames = list;
        this.mJavaModuleProvider = new TurboModuleProvider() { // from class: com.facebook.react.turbomodule.core.TurboModuleManager.1
            @Override // com.facebook.react.turbomodule.core.TurboModuleManager.TurboModuleProvider
            public TurboModule getModule(String str) {
                TurboModuleManagerDelegate turboModuleManagerDelegate2 = turboModuleManagerDelegate;
                if (turboModuleManagerDelegate2 == null) {
                    return null;
                }
                return turboModuleManagerDelegate2.getModule(str);
            }
        };
        this.mCxxModuleProvider = new TurboModuleProvider() { // from class: com.facebook.react.turbomodule.core.TurboModuleManager.2
            @Override // com.facebook.react.turbomodule.core.TurboModuleManager.TurboModuleProvider
            public TurboModule getModule(String str) {
                CxxModuleWrapper legacyCxxModule;
                TurboModuleManagerDelegate turboModuleManagerDelegate2 = turboModuleManagerDelegate;
                if (turboModuleManagerDelegate2 == null || (legacyCxxModule = turboModuleManagerDelegate2.getLegacyCxxModule(str)) == null) {
                    return null;
                }
                C6399a.m25623b(legacyCxxModule instanceof TurboModule, "CxxModuleWrapper \"" + str + "\" is not a TurboModule");
                return (TurboModule) legacyCxxModule;
            }
        };
    }

    @AbstractC6709a
    private TurboModule getJavaModule(String str) {
        TurboModule module = getModule(str);
        if (module instanceof CxxModuleWrapper) {
            return null;
        }
        return module;
    }

    @AbstractC6709a
    private CxxModuleWrapper getLegacyCxxModule(String str) {
        TurboModule module = getModule(str);
        if (!(module instanceof CxxModuleWrapper)) {
            return null;
        }
        return (CxxModuleWrapper) module;
    }

    private native HybridData initHybrid(RuntimeExecutor runtimeExecutor, CallInvokerHolderImpl callInvokerHolderImpl, CallInvokerHolderImpl callInvokerHolderImpl2, TurboModuleManagerDelegate turboModuleManagerDelegate, boolean z, boolean z2);

    private native void installJSIBindings();

    private static synchronized void maybeLoadSoLibrary() {
        synchronized (TurboModuleManager.class) {
            if (!sIsSoLibraryLoaded) {
                SoLoader.m30787r("turbomodulejsijni");
                sIsSoLibraryLoaded = true;
            }
        }
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry
    public List<String> getEagerInitModuleNames() {
        return this.mEagerInitModuleNames;
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry
    public TurboModule getModule(String str) {
        synchronized (this.mTurboModuleCleanupLock) {
            if (this.mTurboModuleCleanupStarted) {
                return null;
            }
            if (!this.mTurboModuleHolders.containsKey(str)) {
                this.mTurboModuleHolders.put(str, new TurboModuleHolder());
            }
            TurboModuleHolder turboModuleHolder = this.mTurboModuleHolders.get(str);
            TurboModulePerfLogger.moduleCreateStart(str, turboModuleHolder.getModuleId());
            TurboModule module = getModule(str, turboModuleHolder, true);
            if (module != null) {
                TurboModulePerfLogger.moduleCreateEnd(str, turboModuleHolder.getModuleId());
            } else {
                TurboModulePerfLogger.moduleCreateFail(str, turboModuleHolder.getModuleId());
            }
            return module;
        }
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry
    public Collection<TurboModule> getModules() {
        ArrayList<TurboModuleHolder> arrayList = new ArrayList();
        synchronized (this.mTurboModuleCleanupLock) {
            arrayList.addAll(this.mTurboModuleHolders.values());
        }
        ArrayList arrayList2 = new ArrayList();
        for (TurboModuleHolder turboModuleHolder : arrayList) {
            synchronized (turboModuleHolder) {
                if (turboModuleHolder.getModule() != null) {
                    arrayList2.add(turboModuleHolder.getModule());
                }
            }
        }
        return arrayList2;
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry
    public boolean hasModule(String str) {
        TurboModuleHolder turboModuleHolder;
        synchronized (this.mTurboModuleCleanupLock) {
            turboModuleHolder = this.mTurboModuleHolders.get(str);
        }
        if (turboModuleHolder == null) {
            return false;
        }
        synchronized (turboModuleHolder) {
            if (turboModuleHolder.getModule() != null) {
                return true;
            }
            return false;
        }
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void initialize() {
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void onCatalystInstanceDestroy() {
        synchronized (this.mTurboModuleCleanupLock) {
            this.mTurboModuleCleanupStarted = true;
        }
        for (Map.Entry<String, TurboModuleHolder> entry : this.mTurboModuleHolders.entrySet()) {
            TurboModule module = getModule(entry.getKey(), entry.getValue(), false);
            if (module != null) {
                module.invalidate();
            }
        }
        this.mTurboModuleHolders.clear();
        this.mHybridData.resetNative();
    }

    private TurboModule getModule(String str, TurboModuleHolder turboModuleHolder, boolean z) {
        boolean z2;
        TurboModule module;
        synchronized (turboModuleHolder) {
            if (turboModuleHolder.isDoneCreatingModule()) {
                if (z) {
                    TurboModulePerfLogger.moduleCreateCacheHit(str, turboModuleHolder.getModuleId());
                }
                return turboModuleHolder.getModule();
            }
            boolean z3 = false;
            if (!turboModuleHolder.isCreatingModule()) {
                turboModuleHolder.startCreatingModule();
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                TurboModulePerfLogger.moduleCreateConstructStart(str, turboModuleHolder.getModuleId());
                TurboModule module2 = this.mJavaModuleProvider.getModule(str);
                if (module2 == null) {
                    module2 = this.mCxxModuleProvider.getModule(str);
                }
                TurboModulePerfLogger.moduleCreateConstructEnd(str, turboModuleHolder.getModuleId());
                TurboModulePerfLogger.moduleCreateSetUpStart(str, turboModuleHolder.getModuleId());
                if (module2 != null) {
                    synchronized (turboModuleHolder) {
                        turboModuleHolder.setModule(module2);
                    }
                    module2.initialize();
                }
                TurboModulePerfLogger.moduleCreateSetUpEnd(str, turboModuleHolder.getModuleId());
                synchronized (turboModuleHolder) {
                    turboModuleHolder.endCreatingModule();
                    turboModuleHolder.notifyAll();
                }
                return module2;
            }
            synchronized (turboModuleHolder) {
                while (turboModuleHolder.isCreatingModule()) {
                    try {
                        turboModuleHolder.wait();
                    } catch (InterruptedException unused) {
                        z3 = true;
                    }
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                module = turboModuleHolder.getModule();
            }
            return module;
        }
    }
}
