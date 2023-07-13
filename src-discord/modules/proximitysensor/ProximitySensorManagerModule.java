package com.discord.modules.proximitysensor;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/discord/modules/proximitysensor/ProximitySensorManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "setProximityMonitoringEnabled", "", ViewProps.ENABLED, "", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ProximitySensorManagerModule extends ReactContextBaseJavaModule {
    
    public ProximitySensorManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
    }

    @Override 
    public String getName() {
        return "ProximitySensorManager";
    }

    @ReactMethod
    public final void setProximityMonitoringEnabled(boolean z10) {
    }
}
