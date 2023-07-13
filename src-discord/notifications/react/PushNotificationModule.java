package com.discord.notifications.react;

import com.discord.cache.CacheModule;
import com.discord.notifications.client.NotificationClient;
import com.discord.notifications.fcm.MessagingService;
import com.discord.notifications.react.events.LocalNotificationEvent;
import com.discord.notifications.react.events.NotificationEvent;
import com.discord.notifications.react.events.RegisterEvent;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import ff.x;
import java.util.Map;
import ji.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0007J\b\u0010\r\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\nH\u0007J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0007J\b\u0010\u0019\u001a\u00020\bH\u0007J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0012\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\"H\u0007J\u0010\u0010%\u001a\u00020\b2\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010&\u001a\u00020\b2\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010'\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010(\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/discord/notifications/react/PushNotificationModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "addListener", "", "type", "", "appStateChanged", "appState", "clearAllNotifications", "getInitialNotification", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getLightsEnabled", "getName", "getSoundsEnabled", "getVibrationsEnabled", "handleDirectReplySuccess", "notificationString", "markNotificationAsDirectReply", "channelId", "onRegisterNotificationToken", "registerEventListener", "removeListeners", "count", "", "setCurrentUsername", "username", "setLightsEnabled", ViewProps.ENABLED, "", "setNotifyEveryTime", "notifyEveryTime", "setSoundsEnabled", "setVibrationsEnabled", "shouldNotifyEveryTime", "updateAuthState", "Companion", "notification_react_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class PushNotificationModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    private static final String EVENT_TYPE_NOTIFICATION = "notification";
    private static final String EVENT_TYPE_NOTIFICATION_LOCAL = "localNotification";
    private static final String EVENT_TYPE_REGISTER = "register";
    private final ReactApplicationContext reactContext;
    private final ReactEvents reactEvents = new ReactEvents(x.a(EVENT_TYPE_REGISTER, f0.b(RegisterEvent.class)), x.a(EVENT_TYPE_NOTIFICATION, f0.b(NotificationEvent.class)), x.a(EVENT_TYPE_NOTIFICATION_LOCAL, f0.b(LocalNotificationEvent.class)));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/discord/notifications/react/PushNotificationModule$Companion;", "", "()V", "EVENT_TYPE_NOTIFICATION", "", "EVENT_TYPE_NOTIFICATION_LOCAL", "EVENT_TYPE_REGISTER", "notification_react_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    
    public PushNotificationModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.reactContext = reactContext;
        MessagingService.Companion.init();
    }

    private final void updateAuthState() {
        CacheModule.Companion companion = CacheModule.Companion;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        boolean z10 = false;
        if (CacheModule.getToken$default(companion.get(reactApplicationContext), false, 1, null) != null) {
            z10 = true;
        }
        NotificationClient instance = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        q.f(reactApplicationContext2, "reactApplicationContext");
        instance.setIsAuthed(reactApplicationContext2, z10);
    }

    @ReactMethod
    public final void addListener(String type) {
        q.g(type, "type");
    }

    @ReactMethod
    public final void appStateChanged(String appState) {
        q.g(appState, "appState");
        updateAuthState();
        NotificationClient.Companion.getInstance().setActive(q.b(appState, AppStateModule.APP_STATE_ACTIVE));
    }

    @ReactMethod
    public final void clearAllNotifications() {
        NotificationClient instance = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        instance.clearAllNotifications(reactApplicationContext);
    }

    @ReactMethod
    public final void getInitialNotification(Promise promise) {
        WritableNativeMap writableNativeMap;
        q.g(promise, "promise");
        Map<String, String> pendingNotification = NotificationClient.Companion.getInstance().getPendingNotification();
        if (pendingNotification != null) {
            writableNativeMap = NativeMapExtensionsKt.toNativeMap(pendingNotification);
        } else {
            writableNativeMap = null;
        }
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public final void getLightsEnabled(Promise promise) {
        q.g(promise, "promise");
        NotificationClient instance = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        promise.resolve(Boolean.valueOf(instance.isLightsEnabled(reactApplicationContext)));
    }

    @Override 
    public String getName() {
        return "PushNotificationAndroid";
    }

    @ReactMethod
    public final void getSoundsEnabled(Promise promise) {
        q.g(promise, "promise");
        NotificationClient instance = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        promise.resolve(Boolean.valueOf(instance.isSoundsEnabled(reactApplicationContext)));
    }

    @ReactMethod
    public final void getVibrationsEnabled(Promise promise) {
        q.g(promise, "promise");
        NotificationClient instance = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        promise.resolve(Boolean.valueOf(instance.isVibrationsEnabled(reactApplicationContext)));
    }

    @ReactMethod
    public final void handleDirectReplySuccess(String notificationString) {
        q.g(notificationString, "notificationString");
        NotificationClient instance = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        instance.onDirectReplySuccess(reactApplicationContext, notificationString);
    }

    @ReactMethod
    public final void markNotificationAsDirectReply(String channelId) {
        Long o10;
        q.g(channelId, "channelId");
        o10 = t.o(channelId);
        if (o10 != null) {
            long longValue = o10.longValue();
            NotificationClient instance = NotificationClient.Companion.getInstance();
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            q.f(reactApplicationContext, "reactApplicationContext");
            instance.markNotificationAsDirectReply(reactApplicationContext, longValue);
        }
    }

    @ReactMethod
    public final void onRegisterNotificationToken() {
        updateAuthState();
    }

    @ReactMethod
    public final void registerEventListener(String type) {
        q.g(type, "type");
        int hashCode = type.hashCode();
        if (hashCode != -690213213) {
            if (hashCode != -145165322) {
                if (hashCode == 595233003 && type.equals(EVENT_TYPE_NOTIFICATION)) {
                    NotificationClient.Companion.getInstance().setNotificationListener(new PushNotificationModule$registerEventListener$2(this));
                    return;
                }
            } else if (type.equals(EVENT_TYPE_NOTIFICATION_LOCAL)) {
                NotificationClient.Companion.getInstance().setLocalNotificationListener(new PushNotificationModule$registerEventListener$3(this));
                return;
            }
        } else if (type.equals(EVENT_TYPE_REGISTER)) {
            NotificationClient.Companion.getInstance().setTokenListener(new PushNotificationModule$registerEventListener$1(this));
            return;
        }
        throw new IllegalArgumentException("Unknown event type: " + type);
    }

    @ReactMethod
    public final void removeListeners(int i10) {
    }

    @ReactMethod
    public final void setCurrentUsername(String str) {
        NotificationClient instance = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        instance.setCurrentUsername(reactApplicationContext, str);
    }

    @ReactMethod
    public final void setLightsEnabled(boolean z10) {
        NotificationClient instance = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        instance.setLightsEnabled(reactApplicationContext, z10);
    }

    @ReactMethod
    public final void setNotifyEveryTime(boolean z10) {
        NotificationClient instance = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        instance.setNotifyEveryTime(reactApplicationContext, z10);
    }

    @ReactMethod
    public final void setSoundsEnabled(boolean z10) {
        NotificationClient instance = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        instance.setSoundsEnabled(reactApplicationContext, z10);
    }

    @ReactMethod
    public final void setVibrationsEnabled(boolean z10) {
        NotificationClient instance = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        instance.setVibrationsEnabled(reactApplicationContext, z10);
    }

    @ReactMethod
    public final void shouldNotifyEveryTime(Promise promise) {
        q.g(promise, "promise");
        NotificationClient instance = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        promise.resolve(Boolean.valueOf(instance.shouldNotifyEveryTime(reactApplicationContext)));
    }
}
