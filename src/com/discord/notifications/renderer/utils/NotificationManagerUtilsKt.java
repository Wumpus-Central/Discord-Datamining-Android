package com.discord.notifications.renderer.utils;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.discord.notifications.renderer.C4605R;
import com.discord.notifications.renderer.NotificationBehaviors;
import com.discord.theme.utils.ColorUtilsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0004*\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u001e\u0010\u0014\u001a\u00020\u0015*\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u001c\u0010\u0018\u001a\u00020\u0019*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0015H\u0000\u001a(\u0010\u001b\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\f\u001a\u00020\r*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m15073d2 = {"NOTIFICATION_LIGHT_PERIOD", "", "messagingStyle", "Landroidx/core/app/NotificationCompat$MessagingStyle;", "Landroid/app/Notification;", "getMessagingStyle", "(Landroid/app/Notification;)Landroidx/core/app/NotificationCompat$MessagingStyle;", "notificationManager", "Landroid/app/NotificationManager;", "Landroid/content/Context;", "getNotificationManager", "(Landroid/content/Context;)Landroid/app/NotificationManager;", "notificationManagerCompat", "Landroidx/core/app/NotificationManagerCompat;", "getNotificationManagerCompat", "(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;", "getActiveNotification", "tag", "", "getActiveNotificationMessageCount", "getNotificationBuilderOrCreate", "Landroidx/core/app/NotificationCompat$Builder;", "notificationChannelId", "notificationExisting", "notify", "", "notificationBuilder", "setLegacyNotificationBehaviors", "context", "behaviors", "Lcom/discord/notifications/renderer/NotificationBehaviors;", "sound", "Landroid/net/Uri;", "notification_renderer_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
public final class NotificationManagerUtilsKt {
    private static final int NOTIFICATION_LIGHT_PERIOD = 1500;

    public static final Notification getActiveNotification(Context context, String tag) {
        Object obj;
        StatusBarNotification statusBarNotification;
        C9971q.m14633g(context, "<this>");
        C9971q.m14633g(tag, "tag");
        NotificationManager notificationManager = getNotificationManager(context);
        if (notificationManager == null) {
            return null;
        }
        try {
            C11090s.C11091a aVar = C11090s.f24606l;
            obj = C11090s.m10940b(notificationManager.getActiveNotifications());
        } catch (Throwable th2) {
            C11090s.C11091a aVar2 = C11090s.f24606l;
            obj = C11090s.m10940b(C11093t.m10931a(th2));
        }
        if (C11090s.m10935g(obj)) {
            obj = null;
        }
        StatusBarNotification[] statusBarNotificationArr = (StatusBarNotification[]) obj;
        if (statusBarNotificationArr == null) {
            return null;
        }
        int length = statusBarNotificationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                statusBarNotification = null;
                break;
            }
            statusBarNotification = statusBarNotificationArr[i];
            if (C9971q.m14638b(statusBarNotification.getTag(), tag)) {
                break;
            }
            i++;
        }
        if (statusBarNotification != null) {
            return statusBarNotification.getNotification();
        }
        return null;
    }

    public static final int getActiveNotificationMessageCount(Context context, String tag) {
        NotificationCompat.MessagingStyle messagingStyle;
        List<NotificationCompat.MessagingStyle.C2166a> B;
        C9971q.m14633g(context, "<this>");
        C9971q.m14633g(tag, "tag");
        Notification activeNotification = getActiveNotification(context, tag);
        if (activeNotification == null || (messagingStyle = getMessagingStyle(activeNotification)) == null || (B = messagingStyle.m38511B()) == null) {
            return 0;
        }
        return B.size();
    }

    public static final NotificationCompat.MessagingStyle getMessagingStyle(Notification notification) {
        C9971q.m14633g(notification, "<this>");
        return NotificationCompat.MessagingStyle.m38502z(notification);
    }

    public static final NotificationCompat.Builder getNotificationBuilderOrCreate(Context context, String notificationChannelId, Notification notification) {
        C9971q.m14633g(context, "<this>");
        C9971q.m14633g(notificationChannelId, "notificationChannelId");
        if (notification != null) {
            return new NotificationCompat.Builder(context, notification);
        }
        return new NotificationCompat.Builder(context, notificationChannelId);
    }

    public static final NotificationManager getNotificationManager(Context context) {
        C9971q.m14633g(context, "<this>");
        return (NotificationManager) context.getSystemService("notification");
    }

    public static final NotificationManagerCompat getNotificationManagerCompat(Context context) {
        C9971q.m14633g(context, "<this>");
        NotificationManagerCompat g = NotificationManagerCompat.m38426g(context);
        C9971q.m14634f(g, "from(this)");
        return g;
    }

    public static final void notify(NotificationManagerCompat notificationManagerCompat, String tag, NotificationCompat.Builder notificationBuilder) {
        C9971q.m14633g(notificationManagerCompat, "<this>");
        C9971q.m14633g(tag, "tag");
        C9971q.m14633g(notificationBuilder, "notificationBuilder");
        notificationManagerCompat.m38420m(tag, 0, notificationBuilder.m38538g());
    }

    public static final NotificationCompat.Builder setLegacyNotificationBehaviors(NotificationCompat.Builder builder, Context context, NotificationBehaviors notificationBehaviors, Uri uri) {
        C9971q.m14633g(builder, "<this>");
        C9971q.m14633g(context, "context");
        if (notificationBehaviors == null) {
            return builder;
        }
        boolean soundsEnabled = notificationBehaviors.getSoundsEnabled();
        if (notificationBehaviors.getVibrationsEnabled()) {
            soundsEnabled = (soundsEnabled ? 1 : 0) | true;
        }
        if (notificationBehaviors.getLightsEnabled()) {
            builder.m38564M(ColorUtilsKt.getColorCompat(context, C4605R.color.brand_500), NOTIFICATION_LIGHT_PERIOD, NOTIFICATION_LIGHT_PERIOD);
        }
        if (!notificationBehaviors.getSoundsEnabled() || uri == null) {
            int i = soundsEnabled ? 1 : 0;
            int i2 = soundsEnabled ? 1 : 0;
            int i3 = soundsEnabled ? 1 : 0;
            NotificationCompat.Builder F = builder.m38571F(i);
            C9971q.m14634f(F, "{\n        setDefaults(defaults)\n    }");
            return F;
        }
        NotificationCompat.Builder c0 = builder.m38545c0(uri);
        int i4 = soundsEnabled ? 1 : 0;
        char c = soundsEnabled ? 1 : 0;
        NotificationCompat.Builder F2 = c0.m38571F(i4 & (-2));
        C9971q.m14634f(F2, "{\n        // remove the …EFAULT_SOUND.inv())\n    }");
        return F2;
    }
}
