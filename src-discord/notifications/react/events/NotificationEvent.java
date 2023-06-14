package com.discord.notifications.react.events;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Map;
import kg.x;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0017\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J!\u0010\t\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/discord/notifications/react/events/NotificationEvent;", "Lcom/discord/reactevents/ReactEvent;", "notification", "", "", "(Ljava/util/Map;)V", "getNotification", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableNativeMap;", "toString", "notification_react_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationEvent implements ReactEvent {
    private final Map<String, String> notification;

    public NotificationEvent(Map<String, String> notification) {
        q.g(notification, "notification");
        this.notification = notification;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationEvent copy$default(NotificationEvent notificationEvent, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = notificationEvent.notification;
        }
        return notificationEvent.copy(map);
    }

    public final Map<String, String> component1() {
        return this.notification;
    }

    public final NotificationEvent copy(Map<String, String> notification) {
        q.g(notification, "notification");
        return new NotificationEvent(notification);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationEvent) && q.b(this.notification, ((NotificationEvent) obj).notification);
    }

    public final Map<String, String> getNotification() {
        return this.notification;
    }

    public int hashCode() {
        return this.notification.hashCode();
    }

    public String toString() {
        Map<String, String> map = this.notification;
        return "NotificationEvent(notification=" + map + ")";
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableNativeMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(x.a("notification", NativeMapExtensionsKt.toNativeMap(this.notification)));
    }
}
