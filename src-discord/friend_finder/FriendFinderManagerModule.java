package com.discord.friend_finder;

import com.discord.friend_finder.react.FriendFinderSerializerKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u0011"}, d2 = {"Lcom/discord/friend_finder/FriendFinderManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "fetchContacts", "", "callback", "Lcom/facebook/react/bridge/Callback;", "getImageForContactId", "deviceContactId", "", "getName", "hasContactsPermissions", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "isComposeSupported", "friend_finder_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class FriendFinderManagerModule extends ReactContextBaseJavaModule {
    
    public FriendFinderManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
    }

    @ReactMethod
    public final void fetchContacts(Callback callback) {
        q.h(callback, "callback");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        FriendFinderSerializerKt.serializeFetchContactsResult(reactApplicationContext, callback);
    }

    @ReactMethod
    public final void getImageForContactId(String deviceContactId, Callback callback) {
        q.h(deviceContactId, "deviceContactId");
        q.h(callback, "callback");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        FriendFinderSerializerKt.serializeGetImageForContactIdResult(reactApplicationContext, deviceContactId, callback);
    }

    @Override 
    public String getName() {
        return "DCDFriendFinderManager";
    }

    @ReactMethod
    public final void hasContactsPermissions(Promise promise) {
        q.h(promise, "promise");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        FriendFinderSerializerKt.serializeHasContactPermissionsResult(reactApplicationContext, promise);
    }

    @ReactMethod
    public final void isComposeSupported(Callback callback) {
        q.h(callback, "callback");
        callback.invoke(Boolean.FALSE);
    }
}
