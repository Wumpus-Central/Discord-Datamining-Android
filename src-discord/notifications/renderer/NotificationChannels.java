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
import ff.x;
import gf.u;
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
import wf.j;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u001f B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002JT\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002J\"\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0012H\u0002J\u001a\u0010\u0019\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0012H\u0002J6\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007J\n\u0010\u001c\u001a\u00020\b*\u00020\u001b¨\u0006!"}, d2 = {"Lcom/discord/notifications/renderer/NotificationChannels;", "", "Lcom/discord/notifications/renderer/NotificationChannels$Category;", "Landroid/content/Context;", "context", "Landroidx/core/app/NotificationChannelCompat;", "getLegacyNotificationChannel", "", "", "localizedGroupNames", "", "Landroidx/core/app/p0;", "createNotificationChannelGroups", "category", "", "brandColor", "localizedCategoryNames", "Lkotlin/Function2;", "Landroidx/core/app/NotificationChannelCompat$Builder;", "", "onConfigure", "migrateOrCreateNotificationChannel", "legacyChannel", "builder", "configureCallChannel", "configureMediaChannel", "init", "Lcom/discord/notifications/api/NotificationData;", "getNotificationChannelId", "<init>", "()V", "Category", "ChannelGroup", "notification_renderer_release"}, k = 1, mv = {1, 8, 0})

public final class NotificationChannels {
    public static final NotificationChannels INSTANCE = new NotificationChannels();

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0082\u0001\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006 "}, d2 = {"Lcom/discord/notifications/renderer/NotificationChannels$Category;", "", "id", "", "importance", "", "group", "Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;", "legacyId", "(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V", "getGroup", "()Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;", "getId", "()Ljava/lang/String;", "getImportance", "()I", "getLegacyId", "Calls", "MediaConnections", "Messages", "MessagesDirect", "FriendRequests", "Social", "GameDetection", "StageStart", "SystemMessages", "ForumThreadCreated", "GuildEventStart", "OtherServerNotifications", "OtherHighPriority", "Other", "Companion", "notification_renderer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
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

        
        private final String f7194id;
        private final int importance;
        private final String legacyId;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004¨\u0006\t"}, d2 = {"Lcom/discord/notifications/renderer/NotificationChannels$Category$Companion;", "", "()V", "defaultLabel", "", "category", "Lcom/discord/notifications/renderer/NotificationChannels$Category;", "fromTrackingType", "trackingType", "notification_renderer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
        public static final class Companion {

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            
            public  class WhenMappings {
                public static final  int[] $EnumSwitchMapping$0;

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

            public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
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

            
            
            
            
            
            
            
            
            
            
            public final com.discord.notifications.renderer.NotificationChannels.Category fromTrackingType(java.lang.String r2) {
                
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
            this.f7194id = str;
            this.importance = i10;
            this.group = channelGroup;
            this.legacyId = str2;
        }

        public final ChannelGroup getGroup() {
            return this.group;
        }

        public final String getId() {
            return this.f7194id;
        }

        public final int getImportance() {
            return this.importance;
        }

        public final String getLegacyId() {
            return this.legacyId;
        }

         Category(String str, int i10, ChannelGroup channelGroup, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, channelGroup, (i11 & 8) != 0 ? null : str2);
        }
    }

    
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;", "", "id", "", "groupId", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "getId", "Realtime", "Social", "Server", "Other", "Companion", "notification_renderer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public enum ChannelGroup {
        Realtime("realtime", "111_realtime"),
        Social("social", "222_social"),
        Server("server", "333_server"),
        Other("other", "444_other");
        
        public static final Companion Companion = new Companion(null);
        private final String groupId;

        
        private final String f7195id;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup$Companion;", "", "()V", "defaultLabel", "", "id", "notification_renderer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
        public static final class Companion {
            private Companion() {
            }

            public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
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
            this.f7195id = str;
            this.groupId = str2;
        }

        public final String getGroupId() {
            return this.groupId;
        }

        public final String getId() {
            return this.f7195id;
        }
    }

    private NotificationChannels() {
    }

    
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
        sb2.append("android.resource:
        String packageName = context.getPackageName();
        int i10 = R.raw.call_ringing;
        sb2.append(packageName + "/" + i10);
        g10.h(Uri.parse(sb2.toString()), new AudioAttributes.Builder().setUsage(7).setContentType(2).build());
    }

    
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

    
    
    private final java.util.List<androidx.core.app.p0> createNotificationChannelGroups(android.content.Context r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        
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

    
    
    
    
    
    
    
    
    private final androidx.core.app.NotificationChannelCompat migrateOrCreateNotificationChannel(android.content.Context r5, com.discord.notifications.renderer.NotificationChannels.Category r6, int r7, java.util.Map<java.lang.String, java.lang.String> r8, kotlin.jvm.functions.Function2<? super androidx.core.app.NotificationChannelCompat, ? super androidx.core.app.NotificationChannelCompat.Builder, kotlin.Unit> r9) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.renderer.NotificationChannels.migrateOrCreateNotificationChannel(android.content.Context, com.discord.notifications.renderer.NotificationChannels$Category, int, java.util.Map, kotlin.jvm.functions.Function2):androidx.core.app.NotificationChannelCompat");
    }

    
    static  NotificationChannelCompat migrateOrCreateNotificationChannel$default(NotificationChannels notificationChannels, Context context, Category category, int i10, Map map, Function2 function2, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            function2 = NotificationChannels$migrateOrCreateNotificationChannel$1.INSTANCE;
        }
        return notificationChannels.migrateOrCreateNotificationChannel(context, category, i10, map, function2);
    }

    
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
        int s10;
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
            s10 = k.s(createNotificationChannelGroups, 10);
            d10 = u.d(s10);
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
