package com.facebook.react.fabric;

import com.facebook.react.bridge.JSIModuleProvider;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.common.mapbuffer.MapBufferSoLoader;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import p130h6.C7927a;

/* loaded from: classes7.dex */
public class FabricJSIModuleProvider implements JSIModuleProvider<UIManager> {
    private final ComponentFactory mComponentFactory;
    private final ReactNativeConfig mConfig;
    private final ReactApplicationContext mReactApplicationContext;
    private final ViewManagerRegistry mViewManagerRegistry;

    public FabricJSIModuleProvider(ReactApplicationContext reactApplicationContext, ComponentFactory componentFactory, ReactNativeConfig reactNativeConfig, ViewManagerRegistry viewManagerRegistry) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mComponentFactory = componentFactory;
        this.mConfig = reactNativeConfig;
        this.mViewManagerRegistry = viewManagerRegistry;
    }

    private FabricUIManager createUIManager(EventBeatManager eventBeatManager) {
        C7927a.m21142c(0L, "FabricJSIModuleProvider.createUIManager");
        FabricUIManager fabricUIManager = new FabricUIManager(this.mReactApplicationContext, this.mViewManagerRegistry, eventBeatManager);
        C7927a.m21138g(0L);
        return fabricUIManager;
    }

    @Override // com.facebook.react.bridge.JSIModuleProvider
    public UIManager get() {
        C7927a.m21142c(0L, "FabricJSIModuleProvider.get");
        EventBeatManager eventBeatManager = new EventBeatManager(this.mReactApplicationContext);
        FabricUIManager createUIManager = createUIManager(eventBeatManager);
        C7927a.m21142c(0L, "FabricJSIModuleProvider.registerBinding");
        Binding binding = new Binding();
        if (ReactFeatureFlags.mapBufferSerializationEnabled) {
            MapBufferSoLoader.staticInit();
        }
        binding.register(this.mReactApplicationContext.getCatalystInstance().getRuntimeExecutor(), this.mReactApplicationContext.getCatalystInstance().getRuntimeScheduler(), createUIManager, eventBeatManager, this.mComponentFactory, this.mConfig);
        C7927a.m21138g(0L);
        C7927a.m21138g(0L);
        return createUIManager;
    }
}
