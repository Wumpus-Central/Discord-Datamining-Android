package com.discord.notifications.client;

import android.content.Context;
import android.content.SharedPreferences;
import com.discord.notifications.api.NotificationData;
import com.discord.primitives.ChannelId;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J%\u0010\u0017\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J%\u0010\u001c\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0015J\u001d\u0010\"\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020&*\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/discord/notifications/client/SilentNotificationManager;", "", "reactContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPrefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getNumAccumulatedMessagesForChannel", "", "channelId", "Lcom/discord/primitives/ChannelId;", "getNumAccumulatedMessagesForChannel-R7gqayM", "(J)I", "lastMessagedReceivedAgoInMins", "", "lastMessagedReceivedAgoInMins-R7gqayM", "(J)J", "onDisplayNotification", "", "notificationData", "Lcom/discord/notifications/api/NotificationData;", "onSilentNotification", "setLastMessageReceivedForChannel", "timestamp", "setLastMessageReceivedForChannel-LJLSWy8", "(JJ)V", "setMessageReceivedForChannel", "setNumAccumulatedMessagesForChannel", "number", "setNumAccumulatedMessagesForChannel-LJLSWy8", "(JI)V", "shouldDisplayNotification", "", "updateLastMessageReceivedForChannel", "updateLastMessageReceivedForChannel-R7gqayM", "(J)V", "toMessageCountKey", "", "toMessageCountKey-R7gqayM", "(J)Ljava/lang/String;", "Companion", "notification_client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SilentNotificationManager {
    public static final Companion Companion = new Companion(null);
    public static final int IDLE_TIME_TO_RECEIVE_PUSH_FROM_GDM_OR_SMALL_GUILD_MINS = 15;
    public static final int MAX_MESSAGES_BEFORE_THROTTLE = 3;
    public static final String SILENT_NOTIFICATION_CACHE_STORE_NAME = "silent_notifications";
    private static SilentNotificationManager instance;
    private final SharedPreferences sharedPrefs;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/notifications/client/SilentNotificationManager$Companion;", "", "()V", "IDLE_TIME_TO_RECEIVE_PUSH_FROM_GDM_OR_SMALL_GUILD_MINS", "", "MAX_MESSAGES_BEFORE_THROTTLE", "SILENT_NOTIFICATION_CACHE_STORE_NAME", "", "instance", "Lcom/discord/notifications/client/SilentNotificationManager;", "get", "context", "Landroid/content/Context;", "notification_client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SilentNotificationManager get(Context context) {
            q.g(context, "context");
            SilentNotificationManager silentNotificationManager = SilentNotificationManager.instance;
            if (silentNotificationManager != null) {
                return silentNotificationManager;
            }
            SilentNotificationManager silentNotificationManager2 = new SilentNotificationManager(context);
            SilentNotificationManager.instance = silentNotificationManager2;
            return silentNotificationManager2;
        }
    }

    public SilentNotificationManager(Context reactContext) {
        q.g(reactContext, "reactContext");
        this.sharedPrefs = reactContext.getSharedPreferences(SILENT_NOTIFICATION_CACHE_STORE_NAME, 0);
    }

    /* renamed from: getNumAccumulatedMessagesForChannel-R7gqayM  reason: not valid java name */
    private final int m517getNumAccumulatedMessagesForChannelR7gqayM(long j10) {
        return this.sharedPrefs.getInt(m521toMessageCountKeyR7gqayM(j10), 0);
    }

    /* renamed from: lastMessagedReceivedAgoInMins-R7gqayM  reason: not valid java name */
    private final long m518lastMessagedReceivedAgoInMinsR7gqayM(long j10) {
        long j11 = this.sharedPrefs.getLong(ChannelId.m544toStringimpl(j10), 0L);
        return TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - j11);
    }

    /* renamed from: setLastMessageReceivedForChannel-LJLSWy8  reason: not valid java name */
    private final void m519setLastMessageReceivedForChannelLJLSWy8(long j10, long j11) {
        SharedPreferences sharedPrefs = this.sharedPrefs;
        q.f(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        q.f(editor, "editor");
        editor.putLong(ChannelId.m544toStringimpl(j10), j11);
        editor.apply();
    }

    private final void setMessageReceivedForChannel(NotificationData notificationData) {
        ChannelId channelId = notificationData.m504getChannelIdqMVnFVQ();
        if (channelId != null) {
            long j10 = channelId.m546unboximpl();
            m520setNumAccumulatedMessagesForChannelLJLSWy8(j10, m517getNumAccumulatedMessagesForChannelR7gqayM(j10) + 1);
            m522updateLastMessageReceivedForChannelR7gqayM(j10);
        }
    }

    /* renamed from: setNumAccumulatedMessagesForChannel-LJLSWy8  reason: not valid java name */
    private final void m520setNumAccumulatedMessagesForChannelLJLSWy8(long j10, int i10) {
        SharedPreferences sharedPrefs = this.sharedPrefs;
        q.f(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        q.f(editor, "editor");
        editor.putInt(m521toMessageCountKeyR7gqayM(j10), i10);
        editor.apply();
    }

    /* renamed from: toMessageCountKey-R7gqayM  reason: not valid java name */
    private final String m521toMessageCountKeyR7gqayM(long j10) {
        String str = ChannelId.m544toStringimpl(j10);
        return str + "_num";
    }

    /* renamed from: updateLastMessageReceivedForChannel-R7gqayM  reason: not valid java name */
    private final void m522updateLastMessageReceivedForChannelR7gqayM(long j10) {
        m519setLastMessageReceivedForChannelLJLSWy8(j10, System.currentTimeMillis());
    }

    public final void onDisplayNotification(NotificationData notificationData) {
        q.g(notificationData, "notificationData");
        Integer channelType = notificationData.getChannelType();
        if (channelType == null || channelType.intValue() != 1) {
            setMessageReceivedForChannel(notificationData);
        }
    }

    public final void onSilentNotification(NotificationData notificationData) {
        q.g(notificationData, "notificationData");
        setMessageReceivedForChannel(notificationData);
    }

    public final boolean shouldDisplayNotification(NotificationData notificationData) {
        q.g(notificationData, "notificationData");
        Integer channelType = notificationData.getChannelType();
        if (channelType != null && channelType.intValue() == 1) {
            return true;
        }
        ChannelId channelId = notificationData.m504getChannelIdqMVnFVQ();
        if (channelId != null) {
            long j10 = channelId.m546unboximpl();
            if (m517getNumAccumulatedMessagesForChannelR7gqayM(j10) < 3) {
                return true;
            }
            if (m518lastMessagedReceivedAgoInMinsR7gqayM(j10) >= 15) {
                m520setNumAccumulatedMessagesForChannelLJLSWy8(j10, 0);
                return true;
            }
        }
        return false;
    }
}
