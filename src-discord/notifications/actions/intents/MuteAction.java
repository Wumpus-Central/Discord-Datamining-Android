package com.discord.notifications.actions.intents;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.discord.notifications.actions.intents.NotificationAction;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0019\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001R\u0019\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lcom/discord/notifications/actions/intents/MuteAction;", "Lcom/discord/notifications/actions/intents/NotificationAction;", "tag", "", "guildId", "Lcom/discord/primitives/GuildId;", "channelId", "Lcom/discord/primitives/ChannelId;", "(Ljava/lang/String;Lcom/discord/primitives/GuildId;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getTag", "()Ljava/lang/String;", "describeContents", "", "onNotificationAction", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "notification_actions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MuteAction implements NotificationAction {
    public static final Parcelable.Creator<MuteAction> CREATOR = new Creator();
    private final long channelId;
    private final GuildId guildId;
    private final String tag;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public static final class Creator implements Parcelable.Creator<MuteAction> {
        
        @Override 
        public final MuteAction createFromParcel(Parcel parcel) {
            q.h(parcel, "parcel");
            return new MuteAction(parcel.readString(), (GuildId) parcel.readParcelable(MuteAction.class.getClassLoader()), ((ChannelId) parcel.readParcelable(MuteAction.class.getClassLoader())).m614unboximpl(), null);
        }

        
        @Override 
        public final MuteAction[] newArray(int i10) {
            return new MuteAction[i10];
        }
    }

    private MuteAction(String str, GuildId guildId, long j10) {
        this.tag = str;
        this.guildId = guildId;
        this.channelId = j10;
    }

    public  MuteAction(String str, GuildId guildId, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, guildId, j10);
    }

    @Override 
    public int describeContents() {
        return 0;
    }

    @Override 
    public int getPendingIntentRequestCode() {
        return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
    }

    @Override 
    public String getTag() {
        return this.tag;
    }

    @Override 
    public void onNotificationAction(Context context, Intent intent) {
        q.h(context, "context");
        q.h(intent, "intent");
        HeadlessTasks.Companion companion = HeadlessTasks.Companion;
        Bundle bundle = new Bundle();
        GuildId guildId = this.guildId;
        if (guildId != null) {
            bundle.putString("guildId", String.valueOf(guildId.m627unboximpl()));
        }
        bundle.putString("channelId", String.valueOf(this.channelId));
        companion.startHeadlessTask(context, "MuteAction", (r18 & 4) != 0 ? HeadlessTasks.TASK_TIMEOUT_DEFAULT : 0L, (r18 & 8) != 0, (r18 & 16) != 0 ? new Bundle() : bundle, (r18 & 32) != 0 ? false : true);
    }

    @Override 
    public void onNotificationActionComplete(Context context) {
        NotificationAction.DefaultImpls.onNotificationActionComplete(this, context);
    }

    @Override 
    public PendingIntent toPendingIntent(Context context, int i10, boolean z10) {
        return NotificationAction.DefaultImpls.toPendingIntent(this, context, i10, z10);
    }

    @Override 
    public void writeToParcel(Parcel out, int i10) {
        q.h(out, "out");
        out.writeString(this.tag);
        out.writeParcelable(this.guildId, i10);
        out.writeParcelable(ChannelId.m605boximpl(this.channelId), i10);
    }
}
