package com.swmansion.gesturehandler.react;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m15073d2 = {"Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "a", "(Lcom/facebook/react/bridge/ReactContext;)Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "deviceEventEmitter", "Lcom/facebook/react/uimanager/UIManagerModule;", "b", "(Lcom/facebook/react/bridge/ReactContext;)Lcom/facebook/react/uimanager/UIManagerModule;", UIManagerModule.NAME, "react-native-gesture-handler_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.gesturehandler.react.a */
/* loaded from: classes8.dex */
public final class C6248a {
    /* renamed from: a */
    public static final DeviceEventManagerModule.RCTDeviceEventEmitter m26015a(ReactContext reactContext) {
        C9971q.m14633g(reactContext, "<this>");
        JavaScriptModule jSModule = reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        C9971q.m14634f(jSModule, "this.getJSModule(DeviceE…EventEmitter::class.java)");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) jSModule;
    }

    /* renamed from: b */
    public static final UIManagerModule m26014b(ReactContext reactContext) {
        C9971q.m14633g(reactContext, "<this>");
        NativeModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
        C9971q.m14636d(nativeModule);
        return (UIManagerModule) nativeModule;
    }
}
