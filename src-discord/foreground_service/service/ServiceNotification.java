package com.discord.foreground_service.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.discord.foreground_service.R;
import com.discord.foreground_service.service.ServiceNotificationConfiguration;
import com.discord.foreground_service.utils.ForegroundServiceUtilsKt;
import com.discord.notifications.actions.intents.GenericAction;
import com.discord.notifications.actions.intents.NotificationAction;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.q;
import kotlin.ranges.IntRange;
import of.p;
import qf.c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\n\u0010\u0013\u001a\u00020\u0014*\u00020\u000bJ \u0010\u0015\u001a\u00020\u0014*\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/discord/foreground_service/service/ServiceNotification;", "", "()V", "FOREGROUND_NOTIFICATION_CHANNEL", "", "FOREGROUND_NOTIFICATION_ID", "", "FOREGROUND_NOTIFICATION_LIMIT", ServiceNotification.FOREGROUND_NOTIFICATION_TAG, "notificationManagerCompat", "Landroidx/core/app/NotificationManagerCompat;", "Landroid/content/Context;", "getNotificationManagerCompat", "(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;", "buildNotification", "Landroid/app/Notification;", "context", "serviceNotificationConfiguration", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;", "clearNotifications", "", "startForegroundCompat", "Landroid/app/Service;", "serviceNotificationConfigurations", "", "foreground_service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ServiceNotification {
    private static final String FOREGROUND_NOTIFICATION_CHANNEL = "mediaConnections";
    private static final int FOREGROUND_NOTIFICATION_ID = 8761;
    private static final int FOREGROUND_NOTIFICATION_LIMIT = 5;
    private static final String FOREGROUND_NOTIFICATION_TAG = "FOREGROUND_NOTIFICATION_TAG";
    public static final ServiceNotification INSTANCE = new ServiceNotification();

    private ServiceNotification() {
    }

    private final Notification buildNotification(Context context, ServiceNotificationConfiguration serviceNotificationConfiguration) {
        PendingIntent pendingIntent;
        NotificationCompat.Builder D = new NotificationCompat.Builder(context, FOREGROUND_NOTIFICATION_CHANNEL).E(serviceNotificationConfiguration.getTitle()).D(serviceNotificationConfiguration.getContent());
        ServiceNotificationConfiguration.Action contentAction = serviceNotificationConfiguration.getContentAction();
        if (contentAction != null) {
            pendingIntent = NotificationAction.DefaultImpls.toPendingIntent$default(new GenericAction(contentAction.getTag(), contentAction.getTaskName(), contentAction.getData()), context, 0, true, 2, null);
        } else {
            pendingIntent = null;
        }
        NotificationCompat.Builder Y = D.C(pendingIntent).Z(R.drawable.ic_notification_24dp).Q(true).Y(true);
        for (ServiceNotificationConfiguration.Action action : serviceNotificationConfiguration.getAuxiliaryActions()) {
            Y.a(0, action.getTitle(), NotificationAction.DefaultImpls.toPendingIntent$default(new GenericAction(action.getTag(), action.getTaskName(), action.getData()), context, 0, false, 2, null));
        }
        Notification g10 = Y.g();
        q.f(g10, "Builder(context, FOREGRO…   }\n            .build()");
        return g10;
    }

    private final NotificationManagerCompat getNotificationManagerCompat(Context context) {
        NotificationManagerCompat g10 = NotificationManagerCompat.g(context);
        q.f(g10, "from(this)");
        return g10;
    }

    public final void clearNotifications(Context context) {
        q.g(context, "<this>");
        Iterator<Integer> it = new IntRange(0, 5).iterator();
        while (it.hasNext()) {
            INSTANCE.getNotificationManagerCompat(context).b(FOREGROUND_NOTIFICATION_TAG, ((p) it).nextInt());
        }
    }

    public final void startForegroundCompat(Service service, Context context, List<ServiceNotificationConfiguration> serviceNotificationConfigurations) {
        List w02;
        Object U;
        List O;
        Object X;
        q.g(service, "<this>");
        q.g(context, "context");
        q.g(serviceNotificationConfigurations, "serviceNotificationConfigurations");
        w02 = r.w0(serviceNotificationConfigurations, new Comparator() { // from class: com.discord.foreground_service.service.ServiceNotification$startForegroundCompat$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int d10;
                d10 = c.d(((ServiceNotificationConfiguration) t10).getPriority(), ((ServiceNotificationConfiguration) t11).getPriority());
                return d10;
            }
        });
        U = r.U(w02);
        O = r.O(w02, 1);
        ForegroundServiceUtilsKt.startForegroundCompat(service, FOREGROUND_NOTIFICATION_ID, buildNotification(context, (ServiceNotificationConfiguration) U));
        Iterator<Integer> it = new IntRange(0, 5).iterator();
        while (it.hasNext()) {
            int nextInt = ((p) it).nextInt();
            X = r.X(O, nextInt);
            ServiceNotificationConfiguration serviceNotificationConfiguration = (ServiceNotificationConfiguration) X;
            if (serviceNotificationConfiguration != null) {
                ServiceNotification serviceNotification = INSTANCE;
                serviceNotification.getNotificationManagerCompat(service).m(FOREGROUND_NOTIFICATION_TAG, nextInt, serviceNotification.buildNotification(context, serviceNotificationConfiguration));
            } else {
                INSTANCE.getNotificationManagerCompat(service).b(FOREGROUND_NOTIFICATION_TAG, nextInt);
            }
        }
    }
}
