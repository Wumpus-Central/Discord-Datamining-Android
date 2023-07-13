package com.discord.reactevents;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a$\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0014\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b*\u00020\u0002H\u0002\u001a\u0014\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000e0\u000e*\u00020\u0002H\u0002¨\u0006\u000f"}, d2 = {"emitReactNativeEvent", "", "Landroid/content/Context;", "eventName", "", "serializedEvent", "Lcom/facebook/react/bridge/WritableMap;", "emitReactNativeViewEvent", "targetTag", "", "getEventEmitter", "Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "kotlin.jvm.PlatformType", "getViewEventEmitter", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "react_events_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class EventEmitterUtilsKt {
    public static final void emitReactNativeEvent(Context context, String eventName, WritableMap serializedEvent) {
        q.g(context, "<this>");
        q.g(eventName, "eventName");
        q.g(serializedEvent, "serializedEvent");
        getEventEmitter(context).emit(eventName, serializedEvent);
    }

    public static final void emitReactNativeViewEvent(Context context, String eventName, WritableMap serializedEvent, int i10) {
        q.g(context, "<this>");
        q.g(eventName, "eventName");
        q.g(serializedEvent, "serializedEvent");
        getViewEventEmitter(context).receiveEvent(i10, eventName, serializedEvent);
    }

    private static final DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter(Context context) {
        q.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) ((ReactContext) context).getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    private static final RCTEventEmitter getViewEventEmitter(Context context) {
        q.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class);
    }
}
