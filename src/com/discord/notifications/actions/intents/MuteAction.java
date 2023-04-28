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
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0019\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001R\u0019\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, m15073d2 = {"Lcom/discord/notifications/actions/intents/MuteAction;", "Lcom/discord/notifications/actions/intents/NotificationAction;", "tag", "", "guildId", "Lcom/discord/primitives/GuildId;", "channelId", "Lcom/discord/primitives/ChannelId;", "(Ljava/lang/String;Lcom/discord/primitives/GuildId;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getTag", "()Ljava/lang/String;", "describeContents", "", "onNotificationAction", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "notification_actions_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class MuteAction implements NotificationAction {
    public static final Parcelable.Creator<MuteAction> CREATOR = new Creator();
    private final long channelId;
    private final GuildId guildId;
    private final String tag;

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<MuteAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MuteAction createFromParcel(Parcel parcel) {
            C9677q.m14633g(parcel, "parcel");
            return new MuteAction(parcel.readString(), (GuildId) parcel.readParcelable(MuteAction.class.getClassLoader()), ((ChannelId) parcel.readParcelable(MuteAction.class.getClassLoader())).m42098unboximpl(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MuteAction[] newArray(int i) {
            return new MuteAction[i];
        }
    }

    private MuteAction(String str, GuildId guildId, long j) {
        this.tag = str;
        this.guildId = guildId;
        this.channelId = j;
    }

    public /* synthetic */ MuteAction(String str, GuildId guildId, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, guildId, j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public int getPendingIntentRequestCode() {
        return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public String getTag() {
        return this.tag;
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationAction(Context context, Intent intent) {
        C9677q.m14633g(context, "context");
        C9677q.m14633g(intent, "intent");
        HeadlessTasks.Companion companion = HeadlessTasks.Companion;
        Bundle bundle = new Bundle();
        GuildId guildId = this.guildId;
        if (guildId != null) {
            bundle.putString("guildId", String.valueOf(guildId.m42111unboximpl()));
        }
        bundle.putString("channelId", String.valueOf(this.channelId));
        HeadlessTasks.Companion.startHeadlessTask$default(companion, context, "MuteAction", 0L, false, bundle, true, 12, null);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationActionComplete(Context context) {
        NotificationAction.DefaultImpls.onNotificationActionComplete(this, context);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public PendingIntent toPendingIntent(Context context, int i, boolean z) {
        return NotificationAction.DefaultImpls.toPendingIntent(this, context, i, z);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        C9677q.m14633g(out, "out");
        out.writeString(this.tag);
        out.writeParcelable(this.guildId, i);
        out.writeParcelable(ChannelId.m42089boximpl(this.channelId), i);
    }
}
