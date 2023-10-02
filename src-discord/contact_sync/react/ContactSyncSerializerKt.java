package com.discord.contact_sync.react;

import cj.a2;
import cj.f;
import cj.r0;
import com.discord.contact_sync.ContactSyncBlobEntry;
import com.discord.contact_sync.ContactSyncBlobEntry$$serializer;
import com.discord.contact_sync.ContactSyncPayloadEntry;
import com.discord.contact_sync.ContactSyncPayloadEntry$$serializer;
import com.discord.contact_sync.ContactSyncProvider;
import com.discord.permissions.NativePermissionManagerModule;
import com.discord.permissions.NativePermissionStatus;
import com.discord.react.utilities.PromiseWrapper;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.jvm.internal.q;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001b\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\u000e"}, d2 = {"mapResultToContactSyncPermission", "", "", "serializeGetImageForContactIdResult", "", "Lcom/facebook/react/bridge/ReactContext;", "deviceContactId", "callback", "Lcom/facebook/react/bridge/Callback;", "serializeHasContactPermissionsResult", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/bridge/Promise;)Lkotlin/Unit;", "serializeSyncContactResult", "contact_sync_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class ContactSyncSerializerKt {
    
    public static final int mapResultToContactSyncPermission(String str) {
        String name = NativePermissionStatus.AUTHORIZED.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        q.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (q.c(str, lowerCase)) {
            return 1;
        }
        String lowerCase2 = NativePermissionStatus.DENIED.name().toLowerCase(locale);
        q.g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        q.c(str, lowerCase2);
        return 0;
    }

    public static final void serializeGetImageForContactIdResult(ReactContext reactContext, String deviceContactId, Callback callback) {
        q.h(reactContext, "<this>");
        q.h(deviceContactId, "deviceContactId");
        q.h(callback, "callback");
        try {
            callback.invoke(null, ContactSyncProvider.INSTANCE.getImageForContactId(reactContext, deviceContactId));
        } catch (SecurityException unused) {
            callback.invoke(Integer.valueOf(mapResultToContactSyncPermission(NativePermissionStatus.DENIED.name())), null);
        }
    }

    public static final Unit serializeHasContactPermissionsResult(ReactContext reactContext, Promise promise) {
        q.h(reactContext, "<this>");
        q.h(promise, "promise");
        NativePermissionManagerModule nativePermissionManagerModule = (NativePermissionManagerModule) reactContext.getNativeModule(NativePermissionManagerModule.class);
        if (nativePermissionManagerModule == null) {
            return null;
        }
        nativePermissionManagerModule.hasContactAuthorization(new PromiseWrapper(promise, ContactSyncSerializerKt$serializeHasContactPermissionsResult$1.INSTANCE, null, 4, null));
        return Unit.f21601a;
    }

    public static final void serializeSyncContactResult(ReactContext reactContext, Callback callback) {
        int t10;
        q.h(reactContext, "<this>");
        q.h(callback, "callback");
        try {
            Map<String, ContactSyncBlobEntry> contactsMap = ContactSyncProvider.INSTANCE.getContactsMap(reactContext);
            Object[] objArr = new Object[3];
            objArr[0] = null;
            Json.a aVar = Json.f22129d;
            aVar.a();
            objArr[1] = aVar.c(new r0(a2.f6238a, ContactSyncBlobEntry$$serializer.INSTANCE), contactsMap);
            Collection<ContactSyncBlobEntry> values = contactsMap.values();
            t10 = k.t(values, 10);
            ArrayList arrayList = new ArrayList(t10);
            for (ContactSyncBlobEntry contactSyncBlobEntry : values) {
                arrayList.add(new ContactSyncPayloadEntry(contactSyncBlobEntry.getPhone()));
            }
            aVar.a();
            objArr[2] = aVar.c(new f(ContactSyncPayloadEntry$$serializer.INSTANCE), arrayList);
            callback.invoke(objArr);
        } catch (SecurityException unused) {
            callback.invoke(Integer.valueOf(mapResultToContactSyncPermission(NativePermissionStatus.DENIED.name())), null, null);
        }
    }
}
