package com.discord.safearea;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kf.x;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import lf.v;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/discord/safearea/SafeAreaManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getConstants", "", "", "", "getName", "getStableSafeAreaInsets", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "safe_area_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SafeAreaManagerModule extends ReactContextBaseJavaModule {
    
    public SafeAreaManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
    }

    @Override 
    public Map<String, Object> getConstants() {
        Map<String, Object> l10;
        SafeAreaEdgeInsets fromRootView = SafeAreaEdgeInsets.Companion.fromRootView(getCurrentActivity());
        l10 = v.l(x.a(ViewProps.TOP, Float.valueOf(fromRootView.getTopDp())), x.a(ViewProps.BOTTOM, Float.valueOf(fromRootView.getBottomDp())), x.a(ViewProps.LEFT, Float.valueOf(fromRootView.getLeftDp())), x.a(ViewProps.RIGHT, Float.valueOf(fromRootView.getRightDp())));
        return l10;
    }

    @Override 
    public String getName() {
        return "DCDSafeAreaManager";
    }

    @ReactMethod
    public final void getStableSafeAreaInsets(Promise promise) {
        q.h(promise, "promise");
        SafeAreaEdgeInsets fromRootViewAsStableInsets = SafeAreaEdgeInsets.Companion.fromRootViewAsStableInsets(getCurrentActivity());
        promise.resolve(NativeMapExtensionsKt.nativeMapOf(x.a(ViewProps.TOP, Float.valueOf(fromRootViewAsStableInsets.getTopDp())), x.a(ViewProps.BOTTOM, Float.valueOf(fromRootViewAsStableInsets.getBottomDp())), x.a(ViewProps.LEFT, Float.valueOf(fromRootViewAsStableInsets.getLeftDp())), x.a(ViewProps.RIGHT, Float.valueOf(fromRootViewAsStableInsets.getRightDp()))));
    }
}
