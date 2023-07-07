package com.discord.safearea;

import android.app.Activity;
import android.view.View;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.safearea.DCDSafeAreaUtils;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.ViewProps;
import gf.x;
import hf.v;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/discord/safearea/SafeAreaManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getConstants", "", "", "", "getName", "getStableSafeAreaInsets", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "safe_area_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SafeAreaManagerModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeAreaManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        View rootView;
        Map<String, Object> l10;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || (rootView = ActivityExtensionsKt.getRootView(currentActivity)) == null) {
            return new LinkedHashMap();
        }
        DCDSafeAreaUtils.SafeAreaEdgeInsets safeAreaEdgeInsets = DCDSafeAreaUtils.INSTANCE.getSafeAreaEdgeInsets(rootView);
        if (safeAreaEdgeInsets == null) {
            return new LinkedHashMap();
        }
        l10 = v.l(x.a(ViewProps.TOP, Float.valueOf(safeAreaEdgeInsets.getTopDp())), x.a(ViewProps.BOTTOM, Float.valueOf(safeAreaEdgeInsets.getBottomDp())), x.a(ViewProps.LEFT, Float.valueOf(safeAreaEdgeInsets.getLeftDp())), x.a(ViewProps.RIGHT, Float.valueOf(safeAreaEdgeInsets.getRightDp())));
        return l10;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDSafeAreaManager";
    }

    @ReactMethod
    public final void getStableSafeAreaInsets(Promise promise) {
        DCDSafeAreaUtils.SafeAreaEdgeInsets safeAreaEdgeInsets;
        View rootView;
        q.g(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        Unit unit = null;
        if (currentActivity == null || (rootView = ActivityExtensionsKt.getRootView(currentActivity)) == null) {
            safeAreaEdgeInsets = null;
        } else {
            safeAreaEdgeInsets = DCDSafeAreaUtils.INSTANCE.getStableSafeAreaInsets(rootView);
        }
        if (safeAreaEdgeInsets != null) {
            promise.resolve(NativeMapExtensionsKt.nativeMapOf(x.a(ViewProps.TOP, Float.valueOf(safeAreaEdgeInsets.getTopDp())), x.a(ViewProps.BOTTOM, Float.valueOf(safeAreaEdgeInsets.getBottomDp())), x.a(ViewProps.LEFT, Float.valueOf(safeAreaEdgeInsets.getLeftDp())), x.a(ViewProps.RIGHT, Float.valueOf(safeAreaEdgeInsets.getRightDp()))));
            unit = Unit.f20717a;
        }
        if (unit == null) {
            promise.reject(new Exception("Unable to obtain stable safe area insets."));
        }
    }
}
