package com.discord.notifications.actions.intents;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.discord.notifications.actions.intents.NotificationAction;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u00020\u0005HÂ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u0007HÂ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\fJ4\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0019\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Lcom/discord/notifications/actions/intents/MarkAsReadAction;", "Lcom/discord/notifications/actions/intents/NotificationAction;", "tag", "", "channelId", "Lcom/discord/primitives/ChannelId;", "messageId", "Lcom/discord/primitives/MessageId;", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "component1", "component2", "component2-o4g7jtM", "()J", "component3", "component3-3Eiw7ao", "copy", "copy-SHRpUJI", "(Ljava/lang/String;JLjava/lang/String;)Lcom/discord/notifications/actions/intents/MarkAsReadAction;", "describeContents", "", "equals", "", "other", "", "hashCode", "onNotificationAction", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "notification_actions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MarkAsReadAction implements NotificationAction {
    public static final Parcelable.Creator<MarkAsReadAction> CREATOR = new Creator();
    private final long channelId;
    private final String messageId;
    private final String tag;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public static final class Creator implements Parcelable.Creator<MarkAsReadAction> {
        
        @Override 
        public final MarkAsReadAction createFromParcel(Parcel parcel) {
            q.h(parcel, "parcel");
            return new MarkAsReadAction(parcel.readString(), ((ChannelId) parcel.readParcelable(MarkAsReadAction.class.getClassLoader())).m590unboximpl(), ((MessageId) parcel.readParcelable(MarkAsReadAction.class.getClassLoader())).m615unboximpl(), null);
        }

        
        @Override 
        public final MarkAsReadAction[] newArray(int i10) {
            return new MarkAsReadAction[i10];
        }
    }

    private MarkAsReadAction(String str, long j10, String str2) {
        this.tag = str;
        this.channelId = j10;
        this.messageId = str2;
    }

    public  MarkAsReadAction(String str, long j10, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, str2);
    }

    
    private final long m510component2o4g7jtM() {
        return this.channelId;
    }

    
    private final String m511component33Eiw7ao() {
        return this.messageId;
    }

    
    public static  MarkAsReadAction m512copySHRpUJI$default(MarkAsReadAction markAsReadAction, String str, long j10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = markAsReadAction.getTag();
        }
        if ((i10 & 2) != 0) {
            j10 = markAsReadAction.channelId;
        }
        if ((i10 & 4) != 0) {
            str2 = markAsReadAction.messageId;
        }
        return markAsReadAction.m513copySHRpUJI(str, j10, str2);
    }

    public final String component1() {
        return getTag();
    }

    
    public final MarkAsReadAction m513copySHRpUJI(String tag, long j10, String messageId) {
        q.h(tag, "tag");
        q.h(messageId, "messageId");
        return new MarkAsReadAction(tag, j10, messageId, null);
    }

    @Override 
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarkAsReadAction)) {
            return false;
        }
        MarkAsReadAction markAsReadAction = (MarkAsReadAction) obj;
        return q.c(getTag(), markAsReadAction.getTag()) && ChannelId.m585equalsimpl0(this.channelId, markAsReadAction.channelId) && MessageId.m611equalsimpl0(this.messageId, markAsReadAction.messageId);
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
        return (((getTag().hashCode() * 31) + ChannelId.m586hashCodeimpl(this.channelId)) * 31) + MessageId.m612hashCodeimpl(this.messageId);
    }

    @Override 
    public void onNotificationAction(Context context, Intent intent) {
        q.h(context, "context");
        q.h(intent, "intent");
        HeadlessTasks.Companion companion = HeadlessTasks.Companion;
        Bundle bundle = new Bundle();
        bundle.putString("channelId", ChannelId.m588toStringimpl(this.channelId));
        bundle.putString("messageId", MessageId.m613toStringimpl(this.messageId));
        HeadlessTasks.Companion.startHeadlessTask$default(companion, context, "MarkAsRead", 0L, false, bundle, true, 12, null);
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
        String str = ChannelId.m588toStringimpl(this.channelId);
        String str2 = MessageId.m613toStringimpl(this.messageId);
        return "MarkAsReadAction(tag=" + tag + ", channelId=" + str + ", messageId=" + str2 + ")";
    }

    @Override 
    public void writeToParcel(Parcel out, int i10) {
        q.h(out, "out");
        out.writeString(this.tag);
        out.writeParcelable(ChannelId.m581boximpl(this.channelId), i10);
        out.writeParcelable(MessageId.m607boximpl(this.messageId), i10);
    }
}
