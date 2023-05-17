package com.discord.notifications.actions.intents;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.discord.notifications.actions.intents.NotificationAction;
import com.discord.primitives.ChannelId;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u0005HÂ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Lcom/discord/notifications/actions/intents/DismissCallAction;", "Lcom/discord/notifications/actions/intents/NotificationAction;", "tag", "", "channelId", "Lcom/discord/primitives/ChannelId;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getTag", "()Ljava/lang/String;", "component1", "component2", "component2-o4g7jtM", "()J", "copy", "copy-mJqaSGE", "(Ljava/lang/String;J)Lcom/discord/notifications/actions/intents/DismissCallAction;", "describeContents", "", "equals", "", "other", "", "hashCode", "onNotificationAction", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "notification_actions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DismissCallAction implements NotificationAction {
    public static final Parcelable.Creator<DismissCallAction> CREATOR = new Creator();
    private final long channelId;
    private final String tag;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DismissCallAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DismissCallAction createFromParcel(Parcel parcel) {
            q.g(parcel, "parcel");
            return new DismissCallAction(parcel.readString(), ((ChannelId) parcel.readParcelable(DismissCallAction.class.getClassLoader())).m546unboximpl(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DismissCallAction[] newArray(int i10) {
            return new DismissCallAction[i10];
        }
    }

    private DismissCallAction(String str, long j10) {
        this.tag = str;
        this.channelId = j10;
    }

    public /* synthetic */ DismissCallAction(String str, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10);
    }

    /* renamed from: component2-o4g7jtM  reason: not valid java name */
    private final long m471component2o4g7jtM() {
        return this.channelId;
    }

    /* renamed from: copy-mJqaSGE$default  reason: not valid java name */
    public static /* synthetic */ DismissCallAction m472copymJqaSGE$default(DismissCallAction dismissCallAction, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dismissCallAction.getTag();
        }
        if ((i10 & 2) != 0) {
            j10 = dismissCallAction.channelId;
        }
        return dismissCallAction.m473copymJqaSGE(str, j10);
    }

    public final String component1() {
        return getTag();
    }

    /* renamed from: copy-mJqaSGE  reason: not valid java name */
    public final DismissCallAction m473copymJqaSGE(String tag, long j10) {
        q.g(tag, "tag");
        return new DismissCallAction(tag, j10, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DismissCallAction)) {
            return false;
        }
        DismissCallAction dismissCallAction = (DismissCallAction) obj;
        return q.b(getTag(), dismissCallAction.getTag()) && ChannelId.m541equalsimpl0(this.channelId, dismissCallAction.channelId);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public int getPendingIntentRequestCode() {
        return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (getTag().hashCode() * 31) + ChannelId.m542hashCodeimpl(this.channelId);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationAction(Context context, Intent intent) {
        q.g(context, "context");
        q.g(intent, "intent");
        HeadlessTasks.Companion companion = HeadlessTasks.Companion;
        Bundle bundle = new Bundle();
        bundle.putString("channelId", String.valueOf(this.channelId));
        HeadlessTasks.Companion.startHeadlessTask$default(companion, context, "DismissCallAction", 0L, false, bundle, true, 12, null);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationActionComplete(Context context) {
        NotificationAction.DefaultImpls.onNotificationActionComplete(this, context);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public PendingIntent toPendingIntent(Context context, int i10, boolean z10) {
        return NotificationAction.DefaultImpls.toPendingIntent(this, context, i10, z10);
    }

    public String toString() {
        String tag = getTag();
        String str = ChannelId.m544toStringimpl(this.channelId);
        return "DismissCallAction(tag=" + tag + ", channelId=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        q.g(out, "out");
        out.writeString(this.tag);
        out.writeParcelable(ChannelId.m537boximpl(this.channelId), i10);
    }
}
