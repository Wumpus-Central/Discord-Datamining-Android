package com.discord.notifications.actions.intents;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.discord.notifications.actions.intents.NotificationAction;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006HÆ\u0003J5\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0014J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0012HÖ\u0001R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006$"}, m15073d2 = {"Lcom/discord/notifications/actions/intents/GenericAction;", "Lcom/discord/notifications/actions/intents/NotificationAction;", "tag", "", "taskName", "data", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "getTag", "()Ljava/lang/String;", "getTaskName", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "onNotificationAction", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "taskInvokingFromBroadcastReceiver", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "notification_actions_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class GenericAction implements NotificationAction {
    public static final Parcelable.Creator<GenericAction> CREATOR = new Creator();
    private final Map<String, String> data;
    private final String tag;
    private final String taskName;

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<GenericAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GenericAction createFromParcel(Parcel parcel) {
            C9971q.m14633g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new GenericAction(readString, readString2, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GenericAction[] newArray(int i) {
            return new GenericAction[i];
        }
    }

    public GenericAction(String tag, String taskName, Map<String, String> data) {
        C9971q.m14633g(tag, "tag");
        C9971q.m14633g(taskName, "taskName");
        C9971q.m14633g(data, "data");
        this.tag = tag;
        this.taskName = taskName;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericAction copy$default(GenericAction genericAction, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = genericAction.getTag();
        }
        if ((i & 2) != 0) {
            str2 = genericAction.taskName;
        }
        if ((i & 4) != 0) {
            map = genericAction.data;
        }
        return genericAction.copy(str, str2, map);
    }

    public final String component1() {
        return getTag();
    }

    public final String component2() {
        return this.taskName;
    }

    public final Map<String, String> component3() {
        return this.data;
    }

    public final GenericAction copy(String tag, String taskName, Map<String, String> data) {
        C9971q.m14633g(tag, "tag");
        C9971q.m14633g(taskName, "taskName");
        C9971q.m14633g(data, "data");
        return new GenericAction(tag, taskName, data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericAction)) {
            return false;
        }
        GenericAction genericAction = (GenericAction) obj;
        return C9971q.m14638b(getTag(), genericAction.getTag()) && C9971q.m14638b(this.taskName, genericAction.taskName) && C9971q.m14638b(this.data, genericAction.data);
    }

    public final Map<String, String> getData() {
        return this.data;
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public int getPendingIntentRequestCode() {
        return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public String getTag() {
        return this.tag;
    }

    public final String getTaskName() {
        return this.taskName;
    }

    public int hashCode() {
        return (((getTag().hashCode() * 31) + this.taskName.hashCode()) * 31) + this.data.hashCode();
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationAction(Context context, Intent intent) {
        C9971q.m14633g(context, "context");
        C9971q.m14633g(intent, "intent");
        onNotificationAction(context, true);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationActionComplete(Context context) {
        NotificationAction.DefaultImpls.onNotificationActionComplete(this, context);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public PendingIntent toPendingIntent(Context context, int i, boolean z) {
        return NotificationAction.DefaultImpls.toPendingIntent(this, context, i, z);
    }

    public String toString() {
        String tag = getTag();
        String str = this.taskName;
        Map<String, String> map = this.data;
        return "GenericAction(tag=" + tag + ", taskName=" + str + ", data=" + map + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        C9971q.m14633g(out, "out");
        out.writeString(this.tag);
        out.writeString(this.taskName);
        Map<String, String> map = this.data;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public final void onNotificationAction(Context context, boolean z) {
        C9971q.m14633g(context, "context");
        HeadlessTasks.Companion companion = HeadlessTasks.Companion;
        String str = this.taskName;
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : this.data.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        HeadlessTasks.Companion.startHeadlessTask$default(companion, context, str, 0L, false, bundle, z, 12, null);
    }
}
