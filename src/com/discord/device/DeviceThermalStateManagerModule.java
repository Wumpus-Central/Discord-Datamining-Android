package com.discord.device;

import android.os.Build;
import android.os.PowerManager;
import com.discord.device.events.DeviceThermalStateChangedEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9656f0;
import kotlin.jvm.internal.C9677q;
import nf.C10853x;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m15073d2 = {"Lcom/discord/device/DeviceThermalStateManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getName", "", "getThermalState", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "initialize", "device_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class DeviceThermalStateManagerModule extends ReactContextBaseJavaModule {
    private final ReactEvents reactEvents = new ReactEvents(C10853x.m10921a("DeviceThermalStateDidChange", C9656f0.m14684b(DeviceThermalStateChangedEvent.class)));

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceThermalStateManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9677q.m14633g(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$0(DeviceThermalStateManagerModule this$0, int i) {
        C9677q.m14633g(this$0, "this$0");
        ReactEvents reactEvents = this$0.reactEvents;
        ReactApplicationContext reactApplicationContext = this$0.getReactApplicationContext();
        C9677q.m14634f(reactApplicationContext, "reactApplicationContext");
        reactEvents.emitModuleEvent(reactApplicationContext, new DeviceThermalStateChangedEvent(i));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDDeviceThermalStateManager";
    }

    @ReactMethod
    public final void getThermalState(Promise promise) {
        int currentThermalStatus;
        C9677q.m14633g(promise, "promise");
        Object systemService = getReactApplicationContext().getSystemService("power");
        C9677q.m14635e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager powerManager = (PowerManager) systemService;
        if (Build.VERSION.SDK_INT >= 29) {
            currentThermalStatus = powerManager.getCurrentThermalStatus();
            promise.resolve(Integer.valueOf(currentThermalStatus));
            return;
        }
        promise.reject(new Exception("getThermalState() requires OS Android 10 or up."));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        Object systemService = getReactApplicationContext().getSystemService("power");
        C9677q.m14635e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager powerManager = (PowerManager) systemService;
        if (Build.VERSION.SDK_INT >= 29) {
            powerManager.addThermalStatusListener(new PowerManager.OnThermalStatusChangedListener() { // from class: com.discord.device.e
                @Override // android.os.PowerManager.OnThermalStatusChangedListener
                public final void onThermalStatusChanged(int i) {
                    DeviceThermalStateManagerModule.initialize$lambda$0(DeviceThermalStateManagerModule.this, i);
                }
            });
        }
    }
}
