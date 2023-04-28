package com.discord.notifications.renderer;

import android.app.Notification;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.core.p018os.C2436d;
import com.discord.icons.IconUrlUtils;
import com.discord.image.fresco.FrescoModuleDiscord;
import com.discord.notifications.api.NotificationData;
import com.discord.notifications.renderer.utils.NotificationManagerUtilsKt;
import com.discord.primitives.ChannelId;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C10134k;
import nf.C11098x;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006JN\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J6\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000fJ&\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0013¨\u0006 "}, m15073d2 = {"Lcom/discord/notifications/renderer/NotificationRenderer;", "", "()V", "clear", "", "context", "Landroid/content/Context;", "notificationTag", "", "clearAllNotifications", ViewProps.DISPLAY, "notification", "Lcom/discord/notifications/api/NotificationData;", "currentUsername", "notificationDataMap", "", "behaviors", "Lcom/discord/notifications/renderer/NotificationBehaviors;", "makeOrUpdateShortcut", "", "notifyEveryTime", "handleAcks", "initFresco", "initIconUrlUtils", "initNotificationCategories", "localizedCategoryNames", "localizedGroupNames", "markNotificationAsDirectReply", "tag", "channelId", "shouldIgnoreAck", "Companion", "notification_renderer_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
public final class NotificationRenderer {
    public static final Companion Companion = new Companion(null);
    public static final String IGNORE_ACK_KEY = "ignoreAck";

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m15073d2 = {"Lcom/discord/notifications/renderer/NotificationRenderer$Companion;", "", "()V", "IGNORE_ACK_KEY", "", "notification_renderer_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void clear(Context context, String notificationTag) {
        C9971q.m14633g(context, "context");
        C9971q.m14633g(notificationTag, "notificationTag");
        NotificationManagerUtilsKt.getNotificationManagerCompat(context).m38431b(notificationTag, 0);
    }

    public final void clearAllNotifications(Context context) {
        C9971q.m14633g(context, "context");
        NotificationManagerUtilsKt.getNotificationManagerCompat(context).m38430c();
    }

    public final void display(Context context, NotificationData notification, String str, Map<String, String> notificationDataMap, NotificationBehaviors notificationBehaviors, boolean z, boolean z2) {
        C9971q.m14633g(context, "context");
        C9971q.m14633g(notification, "notification");
        C9971q.m14633g(notificationDataMap, "notificationDataMap");
        C10134k.m14188b(null, new NotificationRenderer$display$1(notification, context, z2, notificationDataMap, notificationBehaviors, str, z, null), 1, null);
    }

    public final void handleAcks(Context context, NotificationData notification) {
        C9971q.m14633g(context, "context");
        C9971q.m14633g(notification, "notification");
        for (ChannelId channelId : notification.getAckChannelIds()) {
            String str = NotificationData.TYPE_MESSAGE_CREATE + ChannelId.m42096toStringimpl(channelId.m42098unboximpl());
            NotificationChannels notificationChannels = NotificationChannels.INSTANCE;
            if (!NotificationManagerUtilsKt.getNotificationBuilderOrCreate(context, notificationChannels.getNotificationChannelId(notification), NotificationManagerUtilsKt.getActiveNotification(context, str)).m38528l().getBoolean(IGNORE_ACK_KEY, false)) {
                clear(context, str);
            } else {
                markNotificationAsDirectReply(context, str, notificationChannels.getNotificationChannelId(notification), false);
            }
        }
    }

    public final void initFresco(Context context) {
        C9971q.m14633g(context, "context");
        FrescoModuleDiscord.Companion.initializeFresco(context);
    }

    public final void initIconUrlUtils(Context context) {
        C9971q.m14633g(context, "context");
        IconUrlUtils.init$default(IconUrlUtils.INSTANCE, context, null, null, 6, null);
    }

    public final void initNotificationCategories(Context context, Map<String, String> localizedCategoryNames, Map<String, String> localizedGroupNames) {
        C9971q.m14633g(context, "context");
        C9971q.m14633g(localizedCategoryNames, "localizedCategoryNames");
        C9971q.m14633g(localizedGroupNames, "localizedGroupNames");
        NotificationChannels.INSTANCE.init(context, localizedCategoryNames, localizedGroupNames);
    }

    public final void markNotificationAsDirectReply(Context context, String tag, String channelId, boolean z) {
        C9971q.m14633g(context, "context");
        C9971q.m14633g(tag, "tag");
        C9971q.m14633g(channelId, "channelId");
        Notification activeNotification = NotificationManagerUtilsKt.getActiveNotification(context, tag);
        if (activeNotification != null) {
            NotificationCompat.Builder c = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(context, channelId, activeNotification).m38546c(C2436d.m37746a(C11098x.m10921a(IGNORE_ACK_KEY, Boolean.valueOf(z))));
            C9971q.m14634f(c, "context.getNotificationB…_KEY to shouldIgnoreAck))");
            NotificationManagerUtilsKt.notify(NotificationManagerUtilsKt.getNotificationManagerCompat(context), tag, c);
        }
    }
}
