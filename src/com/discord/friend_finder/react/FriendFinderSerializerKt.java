package com.discord.friend_finder.react;

import bj.C2500a2;
import bj.C2574r0;
import com.discord.friend_finder.ContactsDataEntry;
import com.discord.friend_finder.ContactsDataEntry$$serializer;
import com.discord.friend_finder.FriendFinderProvider;
import com.discord.permissions.NativePermissionManagerModule;
import com.discord.permissions.NativePermissionStatus;
import com.discord.react.utilities.PromiseWrapper;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.json.Json;

@Metadata(m15074d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m15073d2 = {"mapResultToContactsPermission", "", "", "serializeFetchContactsResult", "", "Lcom/facebook/react/bridge/ReactContext;", "callback", "Lcom/facebook/react/bridge/Callback;", "serializeGetImageForContactIdResult", "deviceContactId", "serializeHasContactPermissionsResult", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/bridge/Promise;)Lkotlin/Unit;", "friend_finder_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class FriendFinderSerializerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int mapResultToContactsPermission(String str) {
        String name = NativePermissionStatus.AUTHORIZED.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        C9677q.m14634f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (C9677q.m14638b(str, lowerCase)) {
            return 1;
        }
        String lowerCase2 = NativePermissionStatus.DENIED.name().toLowerCase(locale);
        C9677q.m14634f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        C9677q.m14638b(str, lowerCase2);
        return 0;
    }

    public static final void serializeFetchContactsResult(ReactContext reactContext, Callback callback) {
        C9677q.m14633g(reactContext, "<this>");
        C9677q.m14633g(callback, "callback");
        try {
            Map<String, ContactsDataEntry> fetchContacts = FriendFinderProvider.INSTANCE.fetchContacts(reactContext);
            Json.C9985a aVar = Json.f26281d;
            aVar.mo611a();
            callback.invoke(null, aVar.mo577c(new C2574r0(C2500a2.f6719a, ContactsDataEntry$$serializer.INSTANCE), fetchContacts));
        } catch (SecurityException unused) {
            callback.invoke(Integer.valueOf(mapResultToContactsPermission(NativePermissionStatus.DENIED.name())), null, null);
        }
    }

    public static final void serializeGetImageForContactIdResult(ReactContext reactContext, String deviceContactId, Callback callback) {
        C9677q.m14633g(reactContext, "<this>");
        C9677q.m14633g(deviceContactId, "deviceContactId");
        C9677q.m14633g(callback, "callback");
        try {
            callback.invoke(null, FriendFinderProvider.INSTANCE.getImageForContactId(reactContext, deviceContactId));
        } catch (SecurityException unused) {
            callback.invoke(Integer.valueOf(mapResultToContactsPermission(NativePermissionStatus.DENIED.name())), null);
        }
    }

    public static final Unit serializeHasContactPermissionsResult(ReactContext reactContext, Promise promise) {
        C9677q.m14633g(reactContext, "<this>");
        C9677q.m14633g(promise, "promise");
        NativePermissionManagerModule nativePermissionManagerModule = (NativePermissionManagerModule) reactContext.getNativeModule(NativePermissionManagerModule.class);
        if (nativePermissionManagerModule == null) {
            return null;
        }
        nativePermissionManagerModule.hasContactAuthorization(new PromiseWrapper(promise, FriendFinderSerializerKt$serializeHasContactPermissionsResult$1.INSTANCE, null, 4, null));
        return Unit.f25780a;
    }
}
