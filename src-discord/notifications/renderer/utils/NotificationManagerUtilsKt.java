package com.discord.notifications.renderer.utils;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.discord.notifications.renderer.NotificationBehaviors;
import com.discord.notifications.renderer.R;
import com.discord.theme.utils.ColorUtilsKt;
import ff.s;
import ff.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0004*\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u001e\u0010\u0014\u001a\u00020\u0015*\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u001c\u0010\u0018\u001a\u00020\u0019*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0015H\u0000\u001a(\u0010\u001b\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\f\u001a\u00020\r*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"NOTIFICATION_LIGHT_PERIOD", "", "messagingStyle", "Landroidx/core/app/NotificationCompat$MessagingStyle;", "Landroid/app/Notification;", "getMessagingStyle", "(Landroid/app/Notification;)Landroidx/core/app/NotificationCompat$MessagingStyle;", "notificationManager", "Landroid/app/NotificationManager;", "Landroid/content/Context;", "getNotificationManager", "(Landroid/content/Context;)Landroid/app/NotificationManager;", "notificationManagerCompat", "Landroidx/core/app/NotificationManagerCompat;", "getNotificationManagerCompat", "(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;", "getActiveNotification", "tag", "", "getActiveNotificationMessageCount", "getNotificationBuilderOrCreate", "Landroidx/core/app/NotificationCompat$Builder;", "notificationChannelId", "notificationExisting", "notify", "", "notificationBuilder", "setLegacyNotificationBehaviors", "context", "behaviors", "Lcom/discord/notifications/renderer/NotificationBehaviors;", "sound", "Landroid/net/Uri;", "notification_renderer_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationManagerUtilsKt {
    private static final int NOTIFICATION_LIGHT_PERIOD = 1500;

    public static final Notification getActiveNotification(Context context, String tag) {
        Object obj;
        StatusBarNotification statusBarNotification;
        q.g(context, "<this>");
        q.g(tag, "tag");
        NotificationManager notificationManager = getNotificationManager(context);
        if (notificationManager == null) {
            return null;
        }
        try {
            s.a aVar = s.f14771l;
            obj = s.b(notificationManager.getActiveNotifications());
        } catch (Throwable th2) {
            s.a aVar2 = s.f14771l;
            obj = s.b(t.a(th2));
        }
        if (s.g(obj)) {
            obj = null;
        }
        StatusBarNotification[] statusBarNotificationArr = (StatusBarNotification[]) obj;
        if (statusBarNotificationArr == null) {
            return null;
        }
        int length = statusBarNotificationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                statusBarNotification = null;
                break;
            }
            statusBarNotification = statusBarNotificationArr[i10];
            if (q.b(statusBarNotification.getTag(), tag)) {
                break;
            }
            i10++;
        }
        if (statusBarNotification != null) {
            return statusBarNotification.getNotification();
        }
        return null;
    }

    public static final int getActiveNotificationMessageCount(Context context, String tag) {
        NotificationCompat.MessagingStyle messagingStyle;
        List<NotificationCompat.MessagingStyle.a> B;
        q.g(context, "<this>");
        q.g(tag, "tag");
        Notification activeNotification = getActiveNotification(context, tag);
        if (activeNotification == null || (messagingStyle = getMessagingStyle(activeNotification)) == null || (B = messagingStyle.B()) == null) {
            return 0;
        }
        return B.size();
    }

    public static final NotificationCompat.MessagingStyle getMessagingStyle(Notification notification) {
        q.g(notification, "<this>");
        return NotificationCompat.MessagingStyle.z(notification);
    }

    public static final NotificationCompat.Builder getNotificationBuilderOrCreate(Context context, String notificationChannelId, Notification notification) {
        q.g(context, "<this>");
        q.g(notificationChannelId, "notificationChannelId");
        if (notification != null) {
            return new NotificationCompat.Builder(context, notification);
        }
        return new NotificationCompat.Builder(context, notificationChannelId);
    }

    public static final NotificationManager getNotificationManager(Context context) {
        q.g(context, "<this>");
        return (NotificationManager) context.getSystemService("notification");
    }

    public static final NotificationManagerCompat getNotificationManagerCompat(Context context) {
        q.g(context, "<this>");
        NotificationManagerCompat g10 = NotificationManagerCompat.g(context);
        q.f(g10, "from(this)");
        return g10;
    }

    public static final void notify(NotificationManagerCompat notificationManagerCompat, String tag, NotificationCompat.Builder notificationBuilder) {
        q.g(notificationManagerCompat, "<this>");
        q.g(tag, "tag");
        q.g(notificationBuilder, "notificationBuilder");
        notificationManagerCompat.m(tag, 0, notificationBuilder.g());
    }

    public static final NotificationCompat.Builder setLegacyNotificationBehaviors(NotificationCompat.Builder builder, Context context, NotificationBehaviors notificationBehaviors, Uri uri) {
        q.g(builder, "<this>");
        q.g(context, "context");
        if (notificationBehaviors == null) {
            return builder;
        }
        boolean soundsEnabled = notificationBehaviors.getSoundsEnabled();
        if (notificationBehaviors.getVibrationsEnabled()) {
            soundsEnabled = (soundsEnabled ? 1 : 0) | true;
        }
        if (notificationBehaviors.getLightsEnabled()) {
            builder.M(ColorUtilsKt.getColorCompat(context, R.color.brand_500), NOTIFICATION_LIGHT_PERIOD, NOTIFICATION_LIGHT_PERIOD);
        }
        if (!notificationBehaviors.getSoundsEnabled() || uri == null) {
            int i10 = soundsEnabled ? 1 : 0;
            int i11 = soundsEnabled ? 1 : 0;
            int i12 = soundsEnabled ? 1 : 0;
            NotificationCompat.Builder F = builder.F(i10);
            q.f(F, "{\n        setDefaults(defaults)\n    }");
            return F;
        }
        NotificationCompat.Builder c02 = builder.c0(uri);
        int i13 = soundsEnabled ? 1 : 0;
        char c10 = soundsEnabled ? 1 : 0;
        NotificationCompat.Builder F2 = c02.F(i13 & (-2));
        q.f(F2, "{\n        // remove the …EFAULT_SOUND.inv())\n    }");
        return F2;
    }
}
