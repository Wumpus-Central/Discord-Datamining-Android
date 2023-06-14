package com.discord.react_asset_fetcher;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\bK\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bP¨\u0006Q"}, d2 = {"Lcom/discord/react_asset_fetcher/ReactAsset;", "", "(Ljava/lang/String;I)V", "getUri", "", "context", "Landroid/content/Context;", "Activity", "AddReaction", "AddBurstReaction", "Alert", "AnnouncementThread", "ArrowBack", "ArrowForward", "ArrowRight", "BellSnooze", "CallConnect", "CallDisconnect", "CallStatusGreen", "CallStatusRed", "CallStatusUnknown", "CallStatusYellow", "Caret", "Cancel", "ChannelBrowse", "Check", "Checkmark", "ClockTimeout", "Close", "DefaultAvatar0", "DefaultAvatar1", "DefaultAvatar2", "DefaultAvatar3", "DefaultAvatar4", "DefaultGroup0", "DefaultGroup1", "DefaultGroup2", "DefaultGroup3", "DefaultGroup4", "DefaultGroup5", "DefaultGroup6", "DefaultGroup7", "Disconnect", "Download", "File", "Gif", "Help", "Highlight", "Home", "InvitesDisabled", "Launch", "LockClosed", "LockOpen", "Members", "MemberListBadge", "Mic", "MicMutedDark", "MoveToSpeaker", "Pencil", "PersonShield", "Pin", "Play", "Pause", "PoopDark", "PoopLight", "RaisedHand", "Reactions", "Reply", "RoleSubscriptionBadge", "RoleSubscriptionLanyard", "RoleSubscriptionPurchaseCardBg", "ShowPassword", "Speaker", "StageChannel", "TextChannel", "Thread", "Ticket", "Upload", "Volume", "VolumeMute", "Warning", "react_asset_fetcher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public enum ReactAsset {
    Activity,
    AddReaction,
    AddBurstReaction,
    Alert,
    AnnouncementThread,
    ArrowBack,
    ArrowForward,
    ArrowRight,
    BellSnooze,
    CallConnect,
    CallDisconnect,
    CallStatusGreen,
    CallStatusRed,
    CallStatusUnknown,
    CallStatusYellow,
    Caret,
    Cancel,
    ChannelBrowse,
    Check,
    Checkmark,
    ClockTimeout,
    Close,
    DefaultAvatar0,
    DefaultAvatar1,
    DefaultAvatar2,
    DefaultAvatar3,
    DefaultAvatar4,
    DefaultGroup0,
    DefaultGroup1,
    DefaultGroup2,
    DefaultGroup3,
    DefaultGroup4,
    DefaultGroup5,
    DefaultGroup6,
    DefaultGroup7,
    Disconnect,
    Download,
    File,
    Gif,
    Help,
    Highlight,
    Home,
    InvitesDisabled,
    Launch,
    LockClosed,
    LockOpen,
    Members,
    MemberListBadge,
    Mic,
    MicMutedDark,
    MoveToSpeaker,
    Pencil,
    PersonShield,
    Pin,
    Play,
    Pause,
    PoopDark,
    PoopLight,
    RaisedHand,
    Reactions,
    Reply,
    RoleSubscriptionBadge,
    RoleSubscriptionLanyard,
    RoleSubscriptionPurchaseCardBg,
    ShowPassword,
    Speaker,
    StageChannel,
    TextChannel,
    Thread,
    Ticket,
    Upload,
    Volume,
    VolumeMute,
    Warning;

    public final String getUri(Context context) {
        q.g(context, "context");
        return ReactAssetCache.INSTANCE.get(context, this);
    }
}
