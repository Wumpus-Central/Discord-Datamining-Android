package com.discord.nearby;

import android.app.Activity;
import com.discord.nearby.reactevents.OnNearbyErrorEvent;
import com.discord.nearby.reactevents.OnNearbyMessageLostEvent;
import com.discord.nearby.reactevents.OnNearbyMessageReceivedEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0007J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\fH\u0007J\b\u0010\u0016\u001a\u00020\nH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m15073d2 = {"Lcom/discord/nearby/NearbyHelperModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "manager", "Lcom/discord/nearby/NearbyManager;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "addListener", "", "type", "", "getName", "listenForNearbyMessages", "publishNearbyMessage", "message", "removeListeners", "count", "", "setupNearbyPermission", "apiKey", "stopNearby", "nearby_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class NearbyHelperModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private final ReactEvents reactEvents = new ReactEvents(C11098x.m10921a("nearbyMessageReceived", C9951f0.m14684b(OnNearbyMessageReceivedEvent.class)), C11098x.m10921a("nearbyMessageLost", C9951f0.m14684b(OnNearbyMessageLostEvent.class)), C11098x.m10921a("nearbyError", C9951f0.m14684b(OnNearbyErrorEvent.class)));
    private final NearbyManager manager = new NearbyManager(new NearbyHelperModule$manager$1(this), new NearbyHelperModule$manager$2(this), new NearbyHelperModule$manager$3(this));

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyHelperModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9971q.m14633g(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @ReactMethod
    public final void addListener(String type) {
        C9971q.m14633g(type, "type");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NearbyHelper";
    }

    @ReactMethod
    public final void listenForNearbyMessages() {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            this.manager.enableNearby(currentActivity);
        }
    }

    @ReactMethod
    public final void publishNearbyMessage(String message) {
        C9971q.m14633g(message, "message");
        this.manager.setOutboundMessage(message);
    }

    @ReactMethod
    public final void removeListeners(int i) {
    }

    @ReactMethod
    public final void setupNearbyPermission(String apiKey) {
        C9971q.m14633g(apiKey, "apiKey");
    }

    @ReactMethod
    public final void stopNearby() {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            this.manager.disableNearby(currentActivity);
        }
    }
}
