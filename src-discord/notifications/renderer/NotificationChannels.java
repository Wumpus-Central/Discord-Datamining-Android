package com.discord.notifications.renderer;

import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.p0;
import com.discord.crash_reporting.CrashReporting;
import com.discord.notifications.api.NotificationData;
import com.discord.notifications.renderer.utils.NotificationManagerUtilsKt;
import com.discord.theme.utils.ColorUtilsKt;
import eg.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import nf.x;
import of.u;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u001f B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002JT\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002J\"\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0012H\u0002J\u001a\u0010\u0019\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0012H\u0002J6\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007J\n\u0010\u001c\u001a\u00020\b*\u00020\u001b¨\u0006!"}, d2 = {"Lcom/discord/notifications/renderer/NotificationChannels;", "", "Lcom/discord/notifications/renderer/NotificationChannels$Category;", "Landroid/content/Context;", "context", "Landroidx/core/app/NotificationChannelCompat;", "getLegacyNotificationChannel", "", "", "localizedGroupNames", "", "Landroidx/core/app/p0;", "createNotificationChannelGroups", "category", "", "brandColor", "localizedCategoryNames", "Lkotlin/Function2;", "Landroidx/core/app/NotificationChannelCompat$Builder;", "", "onConfigure", "migrateOrCreateNotificationChannel", "legacyChannel", "builder", "configureCallChannel", "configureMediaChannel", "init", "Lcom/discord/notifications/api/NotificationData;", "getNotificationChannelId", "<init>", "()V", "Category", "ChannelGroup", "notification_renderer_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NotificationChannels {
    public static final NotificationChannels INSTANCE = new NotificationChannels();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Init of enum Calls can be incorrect */
    /* JADX WARN: Init of enum ForumThreadCreated can be incorrect */
    /* JADX WARN: Init of enum FriendRequests can be incorrect */
    /* JADX WARN: Init of enum GameDetection can be incorrect */
    /* JADX WARN: Init of enum GuildEventStart can be incorrect */
    /* JADX WARN: Init of enum MediaConnections can be incorrect */
    /* JADX WARN: Init of enum Messages can be incorrect */
    /* JADX WARN: Init of enum MessagesDirect can be incorrect */
    /* JADX WARN: Init of enum Other can be incorrect */
    /* JADX WARN: Init of enum OtherHighPriority can be incorrect */
    /* JADX WARN: Init of enum OtherServerNotifications can be incorrect */
    /* JADX WARN: Init of enum Social can be incorrect */
    /* JADX WARN: Init of enum StageStart can be incorrect */
    /* JADX WARN: Init of enum SystemMessages can be incorrect */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0082\u0001\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006 "}, d2 = {"Lcom/discord/notifications/renderer/NotificationChannels$Category;", "", "id", "", "importance", "", "group", "Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;", "legacyId", "(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V", "getGroup", "()Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;", "getId", "()Ljava/lang/String;", "getImportance", "()I", "getLegacyId", "Calls", "MediaConnections", "Messages", "MessagesDirect", "FriendRequests", "Social", "GameDetection", "StageStart", "SystemMessages", "ForumThreadCreated", "GuildEventStart", "OtherServerNotifications", "OtherHighPriority", "Other", "Companion", "notification_renderer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public enum Category {
        Calls("calls", 4, r15, "Calls"),
        MediaConnections("mediaConnections", 3, r15, "Media Connections"),
        Messages("messages", 4, r16, "Messages"),
        MessagesDirect("directMessages", 4, r17, "DirectMessages"),
        FriendRequests("friendRequests", 4, r17, null),
        Social("social", 2, r17, "Social"),
        GameDetection("gameDetection", 1, r15, "Game Detection"),
        StageStart("stageLive", 4, r16, "Stage Live"),
        SystemMessages("systemMessages", 4, r13, null),
        ForumThreadCreated("forumThreadCreated", 4, r16, "Forum Post Create"),
        GuildEventStart("guildEventLive", 4, r16, "Guild Event Live"),
        OtherServerNotifications("other", 2, r16, "General"),
        OtherHighPriority("otherHighPriority", 4, r13, "GeneralHigh"),
        Other("default", 1, r13, null);
        
        public static final Companion Companion = new Companion(null);
        private final ChannelGroup group;

        /* renamed from: id  reason: collision with root package name */
        private final String f7497id;
        private final int importance;
        private final String legacyId;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004¨\u0006\t"}, d2 = {"Lcom/discord/notifications/renderer/NotificationChannels$Category$Companion;", "", "()V", "defaultLabel", "", "category", "Lcom/discord/notifications/renderer/NotificationChannels$Category;", "fromTrackingType", "trackingType", "notification_renderer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Category.values().length];
                    try {
                        iArr[Category.Calls.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Category.MediaConnections.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Category.Messages.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Category.MessagesDirect.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[Category.FriendRequests.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[Category.Social.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[Category.GameDetection.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[Category.StageStart.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[Category.SystemMessages.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[Category.ForumThreadCreated.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[Category.GuildEventStart.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[Category.OtherServerNotifications.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String defaultLabel(Category category) {
                q.g(category, "category");
                switch (WhenMappings.$EnumSwitchMapping$0[category.ordinal()]) {
                    case 1:
                        return "Incoming calls";
                    case 2:
                        return "Voice connected";
                    case 3:
                        return "Messages";
                    case 4:
                        return "Direct messages";
                    case 5:
                        return "Friend requests";
                    case 6:
                        return "Social";
                    case 7:
                        return "Game detection";
                    case 8:
                        return "Stage notifications";
                    case 9:
                        return "Discord system messages";
                    case 10:
                        return "Forum notifications";
                    case 11:
                        return "Event notifications";
                    case 12:
                        return "Other server notifications";
                    default:
                        return "Other";
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
                if (r2.equals(com.discord.notifications.api.NotificationData.TRACKING_TYPE_MODERATOR_FEATURED_MESSAGE) == false) goto L_0x005b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
                if (r2.equals(com.discord.notifications.api.NotificationData.TRACKING_TYPE_GUILD_STREAM_START) == false) goto L_0x005b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
                if (r2.equals(com.discord.notifications.api.NotificationData.TRACKING_TYPE_HOME_LIFECYCLE_PUSH) == false) goto L_0x005b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
                if (r2.equals(com.discord.notifications.api.NotificationData.TRACKING_TYPE_NUDGE_NEW_FRIEND_DM_PUSH) == false) goto L_0x005b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
                if (r2.equals(com.discord.notifications.api.NotificationData.TRACKING_TYPE_FRIEND_REQUEST_REMINDER) == false) goto L_0x005b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
                return com.discord.notifications.renderer.NotificationChannels.Category.OtherServerNotifications;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
                return com.discord.notifications.renderer.NotificationChannels.Category.Social;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
                if (r2.equals(com.discord.notifications.api.NotificationData.TRACKING_TYPE_MISSED_MESSAGE) == false) goto L_0x005b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
                if (r2.equals(com.discord.notifications.api.NotificationData.TRACKING_TYPE_TOP_MESSAGES_PUSH) == false) goto L_0x005b;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final com.discord.notifications.renderer.NotificationChannels.Category fromTrackingType(java.lang.String r2) {
                /*
                    r1 = this;
                    if (r2 == 0) goto L_0x005b
                    int r0 = r2.hashCode()
                    switch(r0) {
                        case -1760014021: goto L_0x004f;
                        case -1433897036: goto L_0x0043;
                        case -198753646: goto L_0x003a;
                        case 533975599: goto L_0x002e;
                        case 1308493743: goto L_0x0025;
                        case 1323738094: goto L_0x001c;
                        case 1428648131: goto L_0x0013;
                        case 1581734347: goto L_0x000a;
                        default: goto L_0x0009;
                    }
                L_0x0009:
                    goto L_0x005b
                L_0x000a:
                    java.lang.String r0 = "generic_missed_message"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L_0x0037
                    goto L_0x005b
                L_0x0013:
                    java.lang.String r0 = "top_messages_push"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L_0x0037
                    goto L_0x005b
                L_0x001c:
                    java.lang.String r0 = "generic_home_featured_message"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L_0x0037
                    goto L_0x005b
                L_0x0025:
                    java.lang.String r0 = "GUILD_STREAM_START"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L_0x0058
                    goto L_0x005b
                L_0x002e:
                    java.lang.String r0 = "home_lifecycle_push"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L_0x0037
                    goto L_0x005b
                L_0x0037:
                    com.discord.notifications.renderer.NotificationChannels$Category r2 = com.discord.notifications.renderer.NotificationChannels.Category.OtherServerNotifications
                    goto L_0x005d
                L_0x003a:
                    java.lang.String r0 = "nudge_new_friend_dm_push"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L_0x0058
                    goto L_0x005b
                L_0x0043:
                    java.lang.String r0 = "suspicious_session"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L_0x004c
                    goto L_0x005b
                L_0x004c:
                    com.discord.notifications.renderer.NotificationChannels$Category r2 = com.discord.notifications.renderer.NotificationChannels.Category.SystemMessages
                    goto L_0x005d
                L_0x004f:
                    java.lang.String r0 = "generic_friend_request_reminder"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L_0x0058
                    goto L_0x005b
                L_0x0058:
                    com.discord.notifications.renderer.NotificationChannels$Category r2 = com.discord.notifications.renderer.NotificationChannels.Category.Social
                    goto L_0x005d
                L_0x005b:
                    com.discord.notifications.renderer.NotificationChannels$Category r2 = com.discord.notifications.renderer.NotificationChannels.Category.Other
                L_0x005d:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.renderer.NotificationChannels.Category.Companion.fromTrackingType(java.lang.String):com.discord.notifications.renderer.NotificationChannels$Category");
            }
        }

        static {
            ChannelGroup channelGroup = ChannelGroup.Realtime;
            ChannelGroup channelGroup2 = ChannelGroup.Server;
            ChannelGroup channelGroup3 = ChannelGroup.Social;
            ChannelGroup channelGroup4 = ChannelGroup.Other;
        }

        Category(String str, int i10, ChannelGroup channelGroup, String str2) {
            this.f7497id = str;
            this.importance = i10;
            this.group = channelGroup;
            this.legacyId = str2;
        }

        public final ChannelGroup getGroup() {
            return this.group;
        }

        public final String getId() {
            return this.f7497id;
        }

        public final int getImportance() {
            return this.importance;
        }

        public final String getLegacyId() {
            return this.legacyId;
        }

        /* synthetic */ Category(String str, int i10, ChannelGroup channelGroup, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, channelGroup, (i11 & 8) != 0 ? null : str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;", "", "id", "", "groupId", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "getId", "Realtime", "Social", "Server", "Other", "Companion", "notification_renderer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public enum ChannelGroup {
        Realtime("realtime", "111_realtime"),
        Social("social", "222_social"),
        Server("server", "333_server"),
        Other("other", "444_other");
        
        public static final Companion Companion = new Companion(null);
        private final String groupId;

        /* renamed from: id  reason: collision with root package name */
        private final String f7498id;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup$Companion;", "", "()V", "defaultLabel", "", "id", "notification_renderer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String defaultLabel(String id2) {
                q.g(id2, "id");
                int hashCode = id2.hashCode();
                if (hashCode != -905826493) {
                    if (hashCode != -897050771) {
                        if (hashCode == -859198101 && id2.equals("realtime")) {
                            return "Real-time";
                        }
                    } else if (id2.equals("social")) {
                        return "Social";
                    }
                } else if (id2.equals("server")) {
                    return "Server";
                }
                return "Other";
            }
        }

        ChannelGroup(String str, String str2) {
            this.f7498id = str;
            this.groupId = str2;
        }

        public final String getGroupId() {
            return this.groupId;
        }

        public final String getId() {
            return this.f7498id;
        }
    }

    private NotificationChannels() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureCallChannel(Context context, NotificationChannelCompat notificationChannelCompat, NotificationChannelCompat.Builder builder) {
        boolean z10;
        NotificationChannelCompat.Builder j10 = builder.j(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
        if (notificationChannelCompat != null) {
            z10 = notificationChannelCompat.a();
        } else {
            z10 = false;
        }
        NotificationChannelCompat.Builder g10 = j10.g(z10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("android.resource://");
        String packageName = context.getPackageName();
        int i10 = R.raw.call_ringing;
        sb2.append(packageName + "/" + i10);
        g10.h(Uri.parse(sb2.toString()), new AudioAttributes.Builder().setUsage(7).setContentType(2).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureMediaChannel(NotificationChannelCompat notificationChannelCompat, NotificationChannelCompat.Builder builder) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (notificationChannelCompat != null) {
            z10 = notificationChannelCompat.a();
        } else {
            z10 = false;
        }
        NotificationChannelCompat.Builder g10 = builder.g(z10);
        if (notificationChannelCompat != null) {
            z11 = notificationChannelCompat.d();
        } else {
            z11 = false;
        }
        NotificationChannelCompat.Builder i10 = g10.i(z11);
        if (notificationChannelCompat != null) {
            z12 = notificationChannelCompat.c();
        }
        i10.e(z12);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<androidx.core.app.p0> createNotificationChannelGroups(android.content.Context r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r9 = this;
            com.discord.notifications.renderer.NotificationChannels$ChannelGroup[] r0 = com.discord.notifications.renderer.NotificationChannels.ChannelGroup.values()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L_0x000d:
            if (r4 >= r2) goto L_0x008b
            r5 = r0[r4]
            java.lang.String r6 = r5.getId()
            boolean r6 = r11.containsKey(r6)
            if (r6 == 0) goto L_0x005e
            java.lang.String r6 = r5.getId()
            java.lang.Object r6 = r11.get(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x0030
            boolean r6 = ri.l.w(r6)
            if (r6 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r6 = r3
            goto L_0x0031
        L_0x0030:
            r6 = 1
        L_0x0031:
            if (r6 == 0) goto L_0x0034
            goto L_0x005e
        L_0x0034:
            androidx.core.app.p0$a r6 = new androidx.core.app.p0$a
            java.lang.String r7 = r5.getGroupId()
            r6.<init>(r7)
            java.lang.String r7 = r5.getId()
            java.lang.Object r7 = r11.get(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            androidx.core.app.p0$a r6 = r6.c(r7)
            java.lang.String r5 = r5.getId()
            java.lang.Object r5 = r11.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            androidx.core.app.p0$a r5 = r6.b(r5)
            androidx.core.app.p0 r5 = r5.a()
            goto L_0x0085
        L_0x005e:
            androidx.core.app.p0$a r6 = new androidx.core.app.p0$a
            java.lang.String r7 = r5.getGroupId()
            r6.<init>(r7)
            com.discord.notifications.renderer.NotificationChannels$ChannelGroup$Companion r7 = com.discord.notifications.renderer.NotificationChannels.ChannelGroup.Companion
            java.lang.String r8 = r5.getId()
            java.lang.String r8 = r7.defaultLabel(r8)
            androidx.core.app.p0$a r6 = r6.c(r8)
            java.lang.String r5 = r5.getId()
            java.lang.String r5 = r7.defaultLabel(r5)
            androidx.core.app.p0$a r5 = r6.b(r5)
            androidx.core.app.p0 r5 = r5.a()
        L_0x0085:
            r1.add(r5)
            int r4 = r4 + 1
            goto L_0x000d
        L_0x008b:
            androidx.core.app.NotificationManagerCompat r10 = com.discord.notifications.renderer.utils.NotificationManagerUtilsKt.getNotificationManagerCompat(r10)
            r10.d(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.renderer.NotificationChannels.createNotificationChannelGroups(android.content.Context, java.util.Map):java.util.List");
    }

    private final NotificationChannelCompat getLegacyNotificationChannel(Category category, Context context) {
        NotificationChannelCompat j10;
        try {
            if (category.getLegacyId() == null || (j10 = NotificationManagerUtilsKt.getNotificationManagerCompat(context).j(category.getLegacyId())) == null) {
                return null;
            }
            NotificationManagerUtilsKt.getNotificationManagerCompat(context).f(category.getLegacyId());
            return j10;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final androidx.core.app.NotificationChannelCompat migrateOrCreateNotificationChannel(android.content.Context r5, com.discord.notifications.renderer.NotificationChannels.Category r6, int r7, java.util.Map<java.lang.String, java.lang.String> r8, kotlin.jvm.functions.Function2<? super androidx.core.app.NotificationChannelCompat, ? super androidx.core.app.NotificationChannelCompat.Builder, kotlin.Unit> r9) {
        /*
            r4 = this;
            androidx.core.app.NotificationChannelCompat r0 = r4.getLegacyNotificationChannel(r6, r5)
            java.lang.String r1 = r6.getId()
            boolean r1 = r8.containsKey(r1)
            if (r1 != 0) goto L_0x001b
            androidx.core.app.NotificationManagerCompat r5 = com.discord.notifications.renderer.utils.NotificationManagerUtilsKt.getNotificationManagerCompat(r5)
            java.lang.String r6 = r6.getId()
            r5.f(r6)
            r5 = 0
            return r5
        L_0x001b:
            java.lang.String r5 = r6.getId()
            java.lang.Object r5 = r8.get(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r1 = 1
            if (r5 == 0) goto L_0x0031
            boolean r5 = ri.l.w(r5)
            if (r5 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r5 = 0
            goto L_0x0032
        L_0x0031:
            r5 = r1
        L_0x0032:
            if (r5 == 0) goto L_0x003b
            com.discord.notifications.renderer.NotificationChannels$Category$Companion r5 = com.discord.notifications.renderer.NotificationChannels.Category.Companion
            java.lang.String r5 = r5.defaultLabel(r6)
            goto L_0x0045
        L_0x003b:
            java.lang.String r5 = r6.getId()
            java.lang.Object r5 = r8.get(r5)
            java.lang.String r5 = (java.lang.String) r5
        L_0x0045:
            androidx.core.app.NotificationChannelCompat$Builder r8 = new androidx.core.app.NotificationChannelCompat$Builder
            java.lang.String r2 = r6.getId()
            int r3 = r6.getImportance()
            r8.<init>(r2, r3)
            androidx.core.app.NotificationChannelCompat$Builder r8 = r8.f(r5)
            androidx.core.app.NotificationChannelCompat$Builder r5 = r8.b(r5)
            com.discord.notifications.renderer.NotificationChannels$ChannelGroup r6 = r6.getGroup()
            java.lang.String r6 = r6.getGroupId()
            androidx.core.app.NotificationChannelCompat$Builder r5 = r5.c(r6)
            if (r0 == 0) goto L_0x006d
            boolean r6 = r0.a()
            goto L_0x006e
        L_0x006d:
            r6 = r1
        L_0x006e:
            androidx.core.app.NotificationChannelCompat$Builder r5 = r5.g(r6)
            if (r0 == 0) goto L_0x0079
            boolean r6 = r0.d()
            goto L_0x007a
        L_0x0079:
            r6 = r1
        L_0x007a:
            androidx.core.app.NotificationChannelCompat$Builder r5 = r5.i(r6)
            if (r0 == 0) goto L_0x0084
            boolean r1 = r0.c()
        L_0x0084:
            androidx.core.app.NotificationChannelCompat$Builder r5 = r5.e(r1)
            androidx.core.app.NotificationChannelCompat$Builder r5 = r5.d(r7)
            java.lang.String r6 = "builder"
            kotlin.jvm.internal.q.f(r5, r6)
            r9.invoke(r0, r5)
            androidx.core.app.NotificationChannelCompat r5 = r5.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.renderer.NotificationChannels.migrateOrCreateNotificationChannel(android.content.Context, com.discord.notifications.renderer.NotificationChannels$Category, int, java.util.Map, kotlin.jvm.functions.Function2):androidx.core.app.NotificationChannelCompat");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ NotificationChannelCompat migrateOrCreateNotificationChannel$default(NotificationChannels notificationChannels, Context context, Category category, int i10, Map map, Function2 function2, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            function2 = NotificationChannels$migrateOrCreateNotificationChannel$1.INSTANCE;
        }
        return notificationChannels.migrateOrCreateNotificationChannel(context, category, i10, map, function2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String getNotificationChannelId(NotificationData notificationData) {
        Category category;
        q.g(notificationData, "<this>");
        String type = notificationData.getType();
        switch (type.hashCode()) {
            case -1502317553:
                if (type.equals(NotificationData.TYPE_GENERIC_PUSH_NOTIFICATION_SENT)) {
                    category = Category.Companion.fromTrackingType(notificationData.getTrackingType());
                    break;
                }
                category = Category.Other;
                break;
            case -1489275252:
                if (type.equals(NotificationData.TYPE_GUILD_SCHEDULED_EVENT_UPDATE)) {
                    category = Category.GuildEventStart;
                    break;
                }
                category = Category.Other;
                break;
            case -1327124998:
                if (type.equals(NotificationData.TYPE_RELATIONSHIP_ADD)) {
                    category = Category.FriendRequests;
                    break;
                }
                category = Category.Other;
                break;
            case -1263316859:
                if (type.equals(NotificationData.TYPE_STAGE_INSTANCE_CREATE)) {
                    category = Category.StageStart;
                    break;
                }
                category = Category.Other;
                break;
            case -437641071:
                if (type.equals(NotificationData.TYPE_FORUM_THREAD_CREATED)) {
                    category = Category.ForumThreadCreated;
                    break;
                }
                category = Category.Other;
                break;
            case -45642698:
                if (type.equals(NotificationData.TYPE_FRIEND_SUGGESTION_CREATE)) {
                    category = Category.Social;
                    break;
                }
                category = Category.Other;
                break;
            case 998188116:
                if (type.equals(NotificationData.TYPE_MESSAGE_CREATE)) {
                    Integer channelType = notificationData.getChannelType();
                    boolean z10 = true;
                    if ((channelType == null || channelType.intValue() != 3) && (channelType == null || channelType.intValue() != 1)) {
                        z10 = false;
                    }
                    if (!z10) {
                        category = Category.Messages;
                        break;
                    } else {
                        category = Category.MessagesDirect;
                        break;
                    }
                }
                category = Category.Other;
                break;
            case 1770025841:
                if (type.equals(NotificationData.TYPE_CALL_RING)) {
                    category = Category.Calls;
                    break;
                }
                category = Category.Other;
                break;
            default:
                category = Category.Other;
                break;
        }
        return category.getId();
    }

    public final void init(Context context, Map<String, String> localizedCategoryNames, Map<String, String> localizedGroupNames) {
        int t10;
        int d10;
        int c10;
        boolean z10;
        q.g(context, "context");
        q.g(localizedCategoryNames, "localizedCategoryNames");
        q.g(localizedGroupNames, "localizedGroupNames");
        int colorCompat = ColorUtilsKt.getColorCompat(context, R.color.brand);
        List<p0> createNotificationChannelGroups = createNotificationChannelGroups(context, localizedGroupNames);
        Category[] values = Category.values();
        ArrayList arrayList = new ArrayList();
        for (Category category : values) {
            NotificationChannelCompat migrateOrCreateNotificationChannel = INSTANCE.migrateOrCreateNotificationChannel(context, category, colorCompat, localizedCategoryNames, new NotificationChannels$init$notificationChannels$1$1(category, context));
            if (migrateOrCreateNotificationChannel != null) {
                arrayList.add(migrateOrCreateNotificationChannel);
            }
        }
        try {
            NotificationManagerUtilsKt.getNotificationManagerCompat(context).e(arrayList);
        } catch (Exception e10) {
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            t10 = k.t(createNotificationChannelGroups, 10);
            d10 = u.d(t10);
            c10 = j.c(d10, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(c10);
            for (p0 p0Var : createNotificationChannelGroups) {
                String valueOf = String.valueOf(p0Var.b());
                if (NotificationManagerUtilsKt.getNotificationManagerCompat(context).k(p0Var.a()) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Pair a10 = x.a(valueOf, String.valueOf(z10));
                linkedHashMap.put(a10.c(), a10.d());
            }
            CrashReporting.addBreadcrumb$default(crashReporting, "Failed to create notification group or channel", linkedHashMap, null, 4, null);
            CrashReporting.INSTANCE.captureException(e10);
        }
    }
}
