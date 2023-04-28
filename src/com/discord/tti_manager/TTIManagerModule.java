package com.discord.tti_manager;

import com.discord.logging.Log;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.tti_manager.TTIMetrics;
import com.discord.tti_manager.react.ReactMarkerListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;
import p267of.C11289v;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u0012"}, m15073d2 = {"Lcom/discord/tti_manager/TTIManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getAllNativeTimestamps", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getConstants", "", "", "", "getJSBundleTimestamps", "getName", "logToDevice", "value", "logToDeviceEnabled", "tti_manager_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class TTIManagerModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTIManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9971q.m14633g(reactContext, "reactContext");
    }

    @ReactMethod
    public final void getAllNativeTimestamps(Promise promise) {
        int t;
        C9971q.m14633g(promise, "promise");
        try {
            ArrayList<TTIMetrics.Timing> timings = TTIMetrics.INSTANCE.getTimings();
            t = C9907k.m14809t(timings, 10);
            ArrayList arrayList = new ArrayList(t);
            for (TTIMetrics.Timing timing : timings) {
                arrayList.add(NativeMapExtensionsKt.nativeMapOf(C11098x.m10921a("label", timing.getLabel()), C11098x.m10921a("timestamp", Long.valueOf(timing.getTimestamp())), C11098x.m10921a("tag", timing.getTag()), C11098x.m10921a("autoGenerated", Boolean.valueOf(timing.getAutoGenerated()))));
            }
            promise.resolve(NativeArrayExtensionsKt.toNativeArray(arrayList));
        } catch (Throwable th2) {
            promise.reject(th2);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Long> getConstants() {
        Map<String, Long> l;
        l = C11289v.m10247l(C11098x.m10921a("AppOpenedTimestamp", Long.valueOf(TTILoggingApplication.Companion.getAppOpenedTimestamp$tti_manager_release())));
        return l;
    }

    @ReactMethod
    public final void getJSBundleTimestamps(Promise promise) {
        C9971q.m14633g(promise, "promise");
        try {
            ReactMarkerListener reactMarkerListener = ReactMarkerListener.INSTANCE;
            promise.resolve(NativeMapExtensionsKt.nativeMapOf(C11098x.m10921a("JSBundleStartedTimestamp", Double.valueOf(reactMarkerListener.getBundleStartedTimestamp())), C11098x.m10921a("JSBundleLoadedTimestamp", Double.valueOf(reactMarkerListener.getBundleLoadedTimestamp())), C11098x.m10921a("JSBundleParsedTimestamp", Double.valueOf(reactMarkerListener.getBundleParsedTimestamp()))));
        } catch (Throwable th2) {
            promise.reject(th2);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "TTIManager";
    }

    @ReactMethod
    public final void logToDevice(String value) {
        C9971q.m14633g(value, "value");
        Log.i$default(Log.INSTANCE, "ttidata", value, (Throwable) null, 4, (Object) null);
    }

    @ReactMethod
    public final void logToDeviceEnabled(Promise promise) {
        C9971q.m14633g(promise, "promise");
        promise.resolve(BuildConfig.logTTIMetrics);
    }
}
