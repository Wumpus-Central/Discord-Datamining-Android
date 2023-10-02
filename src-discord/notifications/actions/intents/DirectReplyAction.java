package com.discord.notifications.actions.intents;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.RemoteInput;
import com.discord.notifications.actions.intents.NotificationAction;
import com.discord.primitives.ChannelId;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.text.o;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,B6\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0010\u001a\u00020\u0005HÂ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÂ\u0003JN\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0019\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Lcom/discord/notifications/actions/intents/DirectReplyAction;", "Lcom/discord/notifications/actions/intents/NotificationAction;", "tag", "", "channelId", "Lcom/discord/primitives/ChannelId;", "channelName", "channelType", "", "guildName", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Ljava/lang/Integer;", "getTag", "()Ljava/lang/String;", "component1", "component2", "component2-o4g7jtM", "()J", "component3", "component4", "()Ljava/lang/Integer;", "component5", "copy", "copy-H-xa5aA", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/discord/notifications/actions/intents/DirectReplyAction;", "describeContents", "equals", "", "other", "", "hashCode", "onNotificationAction", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onNotificationActionComplete", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "notification_actions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class DirectReplyAction implements NotificationAction {
    private static final String KEY_REMOTE_INPUT = "remote_input_key";
    private final long channelId;
    private final String channelName;
    private final Integer channelType;
    private final String guildName;
    private final String tag;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DirectReplyAction> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discord/notifications/actions/intents/DirectReplyAction$Companion;", "", "()V", "KEY_REMOTE_INPUT", "", "getReplyText", "intent", "Landroid/content/Intent;", "toRemoteInput", "Landroidx/core/app/RemoteInput;", "label", "notification_actions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        
        public final String getReplyText(Intent intent) {
            CharSequence charSequence;
            boolean w10;
            Bundle k10 = RemoteInput.k(intent);
            if (k10 == null || (charSequence = k10.getCharSequence(DirectReplyAction.KEY_REMOTE_INPUT)) == null) {
                return null;
            }
            w10 = o.w(charSequence);
            if (!(!w10)) {
                charSequence = null;
            }
            if (charSequence != null) {
                return charSequence.toString();
            }
            return null;
        }

        public final RemoteInput toRemoteInput(String label) {
            q.h(label, "label");
            RemoteInput b10 = new RemoteInput.d(DirectReplyAction.KEY_REMOTE_INPUT).g(label).b();
            q.g(b10, "Builder(KEY_REMOTE_INPUT…\n                .build()");
            return b10;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public static final class Creator implements Parcelable.Creator<DirectReplyAction> {
        
        @Override 
        public final DirectReplyAction createFromParcel(Parcel parcel) {
            q.h(parcel, "parcel");
            return new DirectReplyAction(parcel.readString(), ((ChannelId) parcel.readParcelable(DirectReplyAction.class.getClassLoader())).m626unboximpl(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), null);
        }

        
        @Override 
        public final DirectReplyAction[] newArray(int i10) {
            return new DirectReplyAction[i10];
        }
    }

    private DirectReplyAction(String str, long j10, String str2, Integer num, String str3) {
        this.tag = str;
        this.channelId = j10;
        this.channelName = str2;
        this.channelType = num;
        this.guildName = str3;
    }

    public  DirectReplyAction(String str, long j10, String str2, Integer num, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, str2, num, str3);
    }

    
    private final long m540component2o4g7jtM() {
        return this.channelId;
    }

    private final String component3() {
        return this.channelName;
    }

    private final Integer component4() {
        return this.channelType;
    }

    private final String component5() {
        return this.guildName;
    }

    
    public static  DirectReplyAction m541copyHxa5aA$default(DirectReplyAction directReplyAction, String str, long j10, String str2, Integer num, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = directReplyAction.getTag();
        }
        if ((i10 & 2) != 0) {
            j10 = directReplyAction.channelId;
        }
        if ((i10 & 4) != 0) {
            str2 = directReplyAction.channelName;
        }
        if ((i10 & 8) != 0) {
            num = directReplyAction.channelType;
        }
        if ((i10 & 16) != 0) {
            str3 = directReplyAction.guildName;
        }
        return directReplyAction.m542copyHxa5aA(str, j10, str2, num, str3);
    }

    public final String component1() {
        return getTag();
    }

    
    public final DirectReplyAction m542copyHxa5aA(String tag, long j10, String str, Integer num, String str2) {
        q.h(tag, "tag");
        return new DirectReplyAction(tag, j10, str, num, str2, null);
    }

    @Override 
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectReplyAction)) {
            return false;
        }
        DirectReplyAction directReplyAction = (DirectReplyAction) obj;
        return q.c(getTag(), directReplyAction.getTag()) && ChannelId.m621equalsimpl0(this.channelId, directReplyAction.channelId) && q.c(this.channelName, directReplyAction.channelName) && q.c(this.channelType, directReplyAction.channelType) && q.c(this.guildName, directReplyAction.guildName);
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
        int hashCode = ((getTag().hashCode() * 31) + ChannelId.m622hashCodeimpl(this.channelId)) * 31;
        String str = this.channelName;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.channelType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.guildName;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode3 + i10;
    }

    @Override 
    public void onNotificationAction(Context context, Intent intent) {
        q.h(context, "context");
        q.h(intent, "intent");
        String replyText = Companion.getReplyText(intent);
        HeadlessTasks.Companion companion = HeadlessTasks.Companion;
        Bundle bundle = new Bundle();
        bundle.putString("channelId", String.valueOf(this.channelId));
        bundle.putString("channelName", this.channelName);
        bundle.putString("channelReplyText", replyText);
        Integer num = this.channelType;
        if (num != null) {
            bundle.putInt("channelType", num.intValue());
        }
        bundle.putString("guildName", this.guildName);
        companion.startHeadlessTask(context, "DirectReply", (r18 & 4) != 0 ? HeadlessTasks.TASK_TIMEOUT_DEFAULT : 0L, (r18 & 8) != 0, (r18 & 16) != 0 ? new Bundle() : bundle, (r18 & 32) != 0 ? false : true);
    }

    @Override 
    public void onNotificationActionComplete(Context context) {
        q.h(context, "context");
    }

    @Override 
    public PendingIntent toPendingIntent(Context context, int i10, boolean z10) {
        return NotificationAction.DefaultImpls.toPendingIntent(this, context, i10, z10);
    }

    public String toString() {
        String tag = getTag();
        String str = ChannelId.m624toStringimpl(this.channelId);
        String str2 = this.channelName;
        Integer num = this.channelType;
        String str3 = this.guildName;
        return "DirectReplyAction(tag=" + tag + ", channelId=" + str + ", channelName=" + str2 + ", channelType=" + num + ", guildName=" + str3 + ")";
    }

    @Override 
    public void writeToParcel(Parcel out, int i10) {
        int i11;
        q.h(out, "out");
        out.writeString(this.tag);
        out.writeParcelable(ChannelId.m617boximpl(this.channelId), i10);
        out.writeString(this.channelName);
        Integer num = this.channelType;
        if (num == null) {
            i11 = 0;
        } else {
            out.writeInt(1);
            i11 = num.intValue();
        }
        out.writeInt(i11);
        out.writeString(this.guildName);
    }
}
