package com.discord.notifications.actions.intents;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.discord.notifications.actions.intents.NotificationAction;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0003J+\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/discord/notifications/actions/intents/ContentAction;", "Lcom/discord/notifications/actions/intents/NotificationAction;", "tag", "", "data", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "getTag", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "notification_actions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ContentAction implements NotificationAction {
    public static final Parcelable.Creator<ContentAction> CREATOR = new Creator();
    private final Map<String, String> data;
    private final String tag;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public static final class Creator implements Parcelable.Creator<ContentAction> {
        
        @Override 
        public final ContentAction createFromParcel(Parcel parcel) {
            q.h(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new ContentAction(readString, linkedHashMap);
        }

        
        @Override 
        public final ContentAction[] newArray(int i10) {
            return new ContentAction[i10];
        }
    }

    public ContentAction(String tag, Map<String, String> data) {
        q.h(tag, "tag");
        q.h(data, "data");
        this.tag = tag;
        this.data = data;
    }

    
    public static  ContentAction copy$default(ContentAction contentAction, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = contentAction.getTag();
        }
        if ((i10 & 2) != 0) {
            map = contentAction.data;
        }
        return contentAction.copy(str, map);
    }

    public final String component1() {
        return getTag();
    }

    public final Map<String, String> component2() {
        return this.data;
    }

    public final ContentAction copy(String tag, Map<String, String> data) {
        q.h(tag, "tag");
        q.h(data, "data");
        return new ContentAction(tag, data);
    }

    @Override 
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentAction)) {
            return false;
        }
        ContentAction contentAction = (ContentAction) obj;
        return q.c(getTag(), contentAction.getTag()) && q.c(this.data, contentAction.data);
    }

    public final Map<String, String> getData() {
        return this.data;
    }

    @Override 
    public int getPendingIntentRequestCode() {
        return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
    }

    @Override 
    public String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (getTag().hashCode() * 31) + this.data.hashCode();
    }

    @Override 
    public void onNotificationAction(Context context, Intent intent) {
        NotificationAction.DefaultImpls.onNotificationAction(this, context, intent);
    }

    @Override 
    public void onNotificationActionComplete(Context context) {
        NotificationAction.DefaultImpls.onNotificationActionComplete(this, context);
    }

    @Override 
    public PendingIntent toPendingIntent(Context context, int i10, boolean z10) {
        return NotificationAction.DefaultImpls.toPendingIntent(this, context, i10, z10);
    }

    public String toString() {
        String tag = getTag();
        Map<String, String> map = this.data;
        return "ContentAction(tag=" + tag + ", data=" + map + ")";
    }

    @Override 
    public void writeToParcel(Parcel out, int i10) {
        q.h(out, "out");
        out.writeString(this.tag);
        Map<String, String> map = this.data;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }
}
