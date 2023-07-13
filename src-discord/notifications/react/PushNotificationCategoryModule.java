package com.discord.notifications.react;

import com.discord.notifications.client.NotificationClient;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import gf.v;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007J(\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0013"}, d2 = {"Lcom/discord/notifications/react/PushNotificationCategoryModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "registerNotificationCategories", "", "localizedCategoryNames", "Lcom/facebook/react/bridge/ReadableMap;", "registerNotificationCategoriesAndGroups", "localizedGroupNames", "registerNotificationReplyCategories", "title", "buttonTitle", "inputPlaceholder", "callback", "Lcom/facebook/react/bridge/Callback;", "notification_react_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class PushNotificationCategoryModule extends ReactContextBaseJavaModule {
    
    public PushNotificationCategoryModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
    }

    @Override 
    public String getName() {
        return "DCDNotificationCategoryUtils";
    }

    @ReactMethod
    public final void registerNotificationCategories(ReadableMap localizedCategoryNames) {
        Map<String, String> h10;
        q.g(localizedCategoryNames, "localizedCategoryNames");
        NotificationClient instance = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        Map<String, String> stringMap = NativeMapExtensionsKt.toStringMap(localizedCategoryNames);
        h10 = v.h();
        instance.initNotificationCategories(reactApplicationContext, stringMap, h10);
    }

    @ReactMethod
    public final void registerNotificationCategoriesAndGroups(ReadableMap localizedCategoryNames, ReadableMap localizedGroupNames) {
        q.g(localizedCategoryNames, "localizedCategoryNames");
        q.g(localizedGroupNames, "localizedGroupNames");
        NotificationClient instance = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        instance.initNotificationCategories(reactApplicationContext, NativeMapExtensionsKt.toStringMap(localizedCategoryNames), NativeMapExtensionsKt.toStringMap(localizedGroupNames));
    }

    @ReactMethod
    public final void registerNotificationReplyCategories(String title, String buttonTitle, String inputPlaceholder, Callback callback) {
        q.g(title, "title");
        q.g(buttonTitle, "buttonTitle");
        q.g(inputPlaceholder, "inputPlaceholder");
        q.g(callback, "callback");
    }
}
