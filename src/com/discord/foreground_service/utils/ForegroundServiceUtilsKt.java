package com.discord.foreground_service.utils;

import android.app.Notification;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¨\u0006\f"}, m15073d2 = {"startForegroundCompat", "", "Landroid/app/Service;", "notificationId", "", "notification", "Landroid/app/Notification;", "startForegroundServiceCompat", "Landroid/content/ComponentName;", "Landroid/content/Context;", "serviceIntent", "Landroid/content/Intent;", "foreground_service_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ForegroundServiceUtilsKt {
    public static final void startForegroundCompat(Service service, int i, Notification notification) {
        C9971q.m14633g(service, "<this>");
        C9971q.m14633g(notification, "notification");
        if (Build.VERSION.SDK_INT >= 29) {
            service.startForeground(i, notification, 32);
        } else {
            service.startForeground(i, notification);
        }
    }

    public static final ComponentName startForegroundServiceCompat(Context context, Intent serviceIntent) {
        ComponentName startForegroundService;
        C9971q.m14633g(context, "<this>");
        C9971q.m14633g(serviceIntent, "serviceIntent");
        if (Build.VERSION.SDK_INT < 26) {
            return context.startService(serviceIntent);
        }
        startForegroundService = context.startForegroundService(serviceIntent);
        return startForegroundService;
    }
}
