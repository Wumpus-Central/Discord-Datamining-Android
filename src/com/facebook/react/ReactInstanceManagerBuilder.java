package com.facebook.react;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.hermes.reactexecutor.C4895a;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.devsupport.DefaultDevSupportManagerFactory;
import com.facebook.react.devsupport.DevSupportManagerFactory;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.jscexecutor.JSCExecutor;
import com.facebook.react.jscexecutor.JSCExecutorFactory;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.uimanager.UIImplementationProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p059d6.C6399a;

/* loaded from: classes7.dex */
public class ReactInstanceManagerBuilder {
    private Application mApplication;
    private NotThreadSafeBridgeIdleDebugListener mBridgeIdleDebugListener;
    private Activity mCurrentActivity;
    private Map<String, RequestHandler> mCustomPackagerCommandHandlers;
    private DefaultHardwareBackBtnHandler mDefaultHardwareBackBtnHandler;
    private DevBundleDownloadListener mDevBundleDownloadListener;
    private DevSupportManagerFactory mDevSupportManagerFactory;
    private LifecycleState mInitialLifecycleState;
    private String mJSBundleAssetUrl;
    private JSBundleLoader mJSBundleLoader;
    private JSExceptionHandler mJSExceptionHandler;
    private JSIModulePackage mJSIModulesPackage;
    private String mJSMainModulePath;
    private JavaScriptExecutorFactory mJavaScriptExecutorFactory;
    private boolean mLazyViewManagersEnabled;
    private RedBoxHandler mRedBoxHandler;
    private boolean mRequireActivity;
    private SurfaceDelegateFactory mSurfaceDelegateFactory;
    private ReactPackageTurboModuleManagerDelegate.Builder mTMMDelegateBuilder;
    private UIImplementationProvider mUIImplementationProvider;
    private boolean mUseDeveloperSupport;
    private final List<ReactPackage> mPackages = new ArrayList();
    private int mMinNumShakes = 1;
    private int mMinTimeLeftInFrameForNonBatchedOperationMs = -1;
    private JSInterpreter jsInterpreter = JSInterpreter.OLD_LOGIC;

    private JavaScriptExecutorFactory getDefaultJSExecutorFactory(String str, String str2, Context context) {
        JSInterpreter jSInterpreter = this.jsInterpreter;
        if (jSInterpreter == JSInterpreter.OLD_LOGIC) {
            try {
                ReactInstanceManager.initializeSoLoaderIfNecessary(context);
                JSCExecutor.loadLibrary();
                return new JSCExecutorFactory(str, str2);
            } catch (UnsatisfiedLinkError e) {
                if (!e.getMessage().contains("__cxa_bad_typeid")) {
                    HermesExecutor.loadLibrary();
                    return new C4895a();
                }
                throw e;
            }
        } else if (jSInterpreter == JSInterpreter.HERMES) {
            HermesExecutor.loadLibrary();
            return new C4895a();
        } else {
            JSCExecutor.loadLibrary();
            return new JSCExecutorFactory(str, str2);
        }
    }

    private void setJSEngine(JSInterpreter jSInterpreter) {
        this.jsInterpreter = jSInterpreter;
    }

    public ReactInstanceManagerBuilder addPackage(ReactPackage reactPackage) {
        this.mPackages.add(reactPackage);
        return this;
    }

    public ReactInstanceManagerBuilder addPackages(List<ReactPackage> list) {
        this.mPackages.addAll(list);
        return this;
    }

    public ReactInstanceManager build() {
        boolean z;
        JavaScriptExecutorFactory javaScriptExecutorFactory;
        String str;
        C6399a.m25621d(this.mApplication, "Application property has not been set with this builder");
        if (this.mInitialLifecycleState == LifecycleState.RESUMED) {
            C6399a.m25621d(this.mCurrentActivity, "Activity needs to be set if initial lifecycle state is resumed");
        }
        boolean z2 = true;
        if (!this.mUseDeveloperSupport && this.mJSBundleAssetUrl == null && this.mJSBundleLoader == null) {
            z = false;
        } else {
            z = true;
        }
        C6399a.m25623b(z, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.mJSMainModulePath == null && this.mJSBundleAssetUrl == null && this.mJSBundleLoader == null) {
            z2 = false;
        }
        C6399a.m25623b(z2, "Either MainModulePath or JS Bundle File needs to be provided");
        if (this.mUIImplementationProvider == null) {
            this.mUIImplementationProvider = new UIImplementationProvider();
        }
        String packageName = this.mApplication.getPackageName();
        String friendlyDeviceName = AndroidInfoHelpers.getFriendlyDeviceName();
        Application application = this.mApplication;
        Activity activity = this.mCurrentActivity;
        DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler = this.mDefaultHardwareBackBtnHandler;
        JavaScriptExecutorFactory javaScriptExecutorFactory2 = this.mJavaScriptExecutorFactory;
        if (javaScriptExecutorFactory2 == null) {
            javaScriptExecutorFactory = getDefaultJSExecutorFactory(packageName, friendlyDeviceName, application.getApplicationContext());
        } else {
            javaScriptExecutorFactory = javaScriptExecutorFactory2;
        }
        JSBundleLoader jSBundleLoader = this.mJSBundleLoader;
        if (jSBundleLoader == null && (str = this.mJSBundleAssetUrl) != null) {
            jSBundleLoader = JSBundleLoader.createAssetLoader(this.mApplication, str, false);
        }
        String str2 = this.mJSMainModulePath;
        List<ReactPackage> list = this.mPackages;
        boolean z3 = this.mUseDeveloperSupport;
        DevSupportManagerFactory devSupportManagerFactory = this.mDevSupportManagerFactory;
        if (devSupportManagerFactory == null) {
            devSupportManagerFactory = new DefaultDevSupportManagerFactory();
        }
        return new ReactInstanceManager(application, activity, defaultHardwareBackBtnHandler, javaScriptExecutorFactory, jSBundleLoader, str2, list, z3, devSupportManagerFactory, this.mRequireActivity, this.mBridgeIdleDebugListener, (LifecycleState) C6399a.m25621d(this.mInitialLifecycleState, "Initial lifecycle state was not set"), this.mUIImplementationProvider, this.mJSExceptionHandler, this.mRedBoxHandler, this.mLazyViewManagersEnabled, this.mDevBundleDownloadListener, this.mMinNumShakes, this.mMinTimeLeftInFrameForNonBatchedOperationMs, this.mJSIModulesPackage, this.mCustomPackagerCommandHandlers, this.mTMMDelegateBuilder, this.mSurfaceDelegateFactory);
    }

    public ReactInstanceManagerBuilder setApplication(Application application) {
        this.mApplication = application;
        return this;
    }

    public ReactInstanceManagerBuilder setBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleDebugListener = notThreadSafeBridgeIdleDebugListener;
        return this;
    }

    public ReactInstanceManagerBuilder setBundleAssetName(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.mJSBundleAssetUrl = str2;
        this.mJSBundleLoader = null;
        return this;
    }

    public ReactInstanceManagerBuilder setCurrentActivity(Activity activity) {
        this.mCurrentActivity = activity;
        return this;
    }

    public ReactInstanceManagerBuilder setCustomPackagerCommandHandlers(Map<String, RequestHandler> map) {
        this.mCustomPackagerCommandHandlers = map;
        return this;
    }

    public ReactInstanceManagerBuilder setDefaultHardwareBackBtnHandler(DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler) {
        this.mDefaultHardwareBackBtnHandler = defaultHardwareBackBtnHandler;
        return this;
    }

    public ReactInstanceManagerBuilder setDevBundleDownloadListener(DevBundleDownloadListener devBundleDownloadListener) {
        this.mDevBundleDownloadListener = devBundleDownloadListener;
        return this;
    }

    public ReactInstanceManagerBuilder setDevSupportManagerFactory(DevSupportManagerFactory devSupportManagerFactory) {
        this.mDevSupportManagerFactory = devSupportManagerFactory;
        return this;
    }

    public ReactInstanceManagerBuilder setInitialLifecycleState(LifecycleState lifecycleState) {
        this.mInitialLifecycleState = lifecycleState;
        return this;
    }

    public ReactInstanceManagerBuilder setJSBundleFile(String str) {
        if (!str.startsWith("assets://")) {
            return setJSBundleLoader(JSBundleLoader.createFileLoader(str));
        }
        this.mJSBundleAssetUrl = str;
        this.mJSBundleLoader = null;
        return this;
    }

    public ReactInstanceManagerBuilder setJSBundleLoader(JSBundleLoader jSBundleLoader) {
        this.mJSBundleLoader = jSBundleLoader;
        this.mJSBundleAssetUrl = null;
        return this;
    }

    public ReactInstanceManagerBuilder setJSExceptionHandler(JSExceptionHandler jSExceptionHandler) {
        this.mJSExceptionHandler = jSExceptionHandler;
        return this;
    }

    public ReactInstanceManagerBuilder setJSIModulesPackage(JSIModulePackage jSIModulePackage) {
        this.mJSIModulesPackage = jSIModulePackage;
        return this;
    }

    public ReactInstanceManagerBuilder setJSMainModulePath(String str) {
        this.mJSMainModulePath = str;
        return this;
    }

    public ReactInstanceManagerBuilder setJavaScriptExecutorFactory(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.mJavaScriptExecutorFactory = javaScriptExecutorFactory;
        return this;
    }

    public ReactInstanceManagerBuilder setJsEngineAsHermes(boolean z) {
        if (z) {
            setJSEngine(JSInterpreter.HERMES);
        } else {
            setJSEngine(JSInterpreter.JSC);
        }
        return this;
    }

    public ReactInstanceManagerBuilder setLazyViewManagersEnabled(boolean z) {
        this.mLazyViewManagersEnabled = z;
        return this;
    }

    public ReactInstanceManagerBuilder setMinNumShakes(int i) {
        this.mMinNumShakes = i;
        return this;
    }

    public ReactInstanceManagerBuilder setMinTimeLeftInFrameForNonBatchedOperationMs(int i) {
        this.mMinTimeLeftInFrameForNonBatchedOperationMs = i;
        return this;
    }

    public ReactInstanceManagerBuilder setReactPackageTurboModuleManagerDelegateBuilder(ReactPackageTurboModuleManagerDelegate.Builder builder) {
        this.mTMMDelegateBuilder = builder;
        return this;
    }

    public ReactInstanceManagerBuilder setRedBoxHandler(RedBoxHandler redBoxHandler) {
        this.mRedBoxHandler = redBoxHandler;
        return this;
    }

    public ReactInstanceManagerBuilder setRequireActivity(boolean z) {
        this.mRequireActivity = z;
        return this;
    }

    public ReactInstanceManagerBuilder setSurfaceDelegateFactory(SurfaceDelegateFactory surfaceDelegateFactory) {
        this.mSurfaceDelegateFactory = surfaceDelegateFactory;
        return this;
    }

    public ReactInstanceManagerBuilder setUIImplementationProvider(UIImplementationProvider uIImplementationProvider) {
        this.mUIImplementationProvider = uIImplementationProvider;
        return this;
    }

    public ReactInstanceManagerBuilder setUseDeveloperSupport(boolean z) {
        this.mUseDeveloperSupport = z;
        return this;
    }
}
