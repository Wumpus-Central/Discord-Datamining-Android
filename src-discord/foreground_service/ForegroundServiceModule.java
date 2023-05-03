package com.discord.foreground_service;

import com.discord.foreground_service.react.ForegroudServiceConfigurationParserKt;
import com.discord.foreground_service.service.ServiceNotificationConfiguration;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/foreground_service/ForegroundServiceModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "isServiceRunning", "", "callback", "Lcom/facebook/react/bridge/Callback;", "startService", "parameters", "Lcom/facebook/react/bridge/ReadableArray;", "stopService", "foreground_service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ForegroundServiceModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForegroundServiceModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ForegroundServiceModule";
    }

    @ReactMethod
    public final void isServiceRunning(Callback callback) {
        q.g(callback, "callback");
        callback.invoke(Boolean.valueOf(ForegroundServiceManager.Companion.getInstance().isRunning$foreground_service_release()));
    }

    @ReactMethod
    public final void startService(ReadableArray parameters) {
        q.g(parameters, "parameters");
        ForegroundServiceManager.Companion.getInstance().startService$foreground_service_release(this.reactContext, ForegroudServiceConfigurationParserKt.parseList(ServiceNotificationConfiguration.Companion, parameters));
    }

    @ReactMethod
    public final void stopService() {
        ForegroundServiceManager.Companion.getInstance().stopService$foreground_service_release(this.reactContext);
    }
}
