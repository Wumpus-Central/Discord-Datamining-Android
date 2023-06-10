package com.discord.foreground_service;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import com.discord.foreground_service.service.ServiceNotification;
import com.discord.foreground_service.service.ServiceNotificationConfiguration;
import com.discord.foreground_service.utils.Log;
import com.discord.foreground_service.utils.Wakelocks;
import com.discord.misc.utilities.intent.IntentUtilsKt;
import com.discord.notifications.actions.intents.GenericAction;
import com.discord.notifications.actions.intents.NotificationAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0018J\r\u0010\u0019\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u001aJ#\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0002\b\u001cJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u001eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/discord/foreground_service/ForegroundServiceManager;", "", "()V", "service", "Landroid/app/Service;", "serviceConfigurations", "", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;", "serviceWakelocks", "Lcom/discord/foreground_service/utils/Wakelocks;", "handleIntent", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "(Landroid/content/Context;Landroid/content/Intent;)Lkotlin/Unit;", "isRunning", "", "isRunning$foreground_service_release", "onServiceConnected", "foregroundService", "onServiceConnected$foreground_service_release", "onServiceCreated", "onServiceCreated$foreground_service_release", "onServiceDisconnected", "onServiceDisconnected$foreground_service_release", "startService", "startService$foreground_service_release", "stopService", "stopService$foreground_service_release", "Companion", "foreground_service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ForegroundServiceManager {
    private Service service;
    private List<ServiceNotificationConfiguration> serviceConfigurations;
    private final Wakelocks serviceWakelocks;
    public static final Companion Companion = new Companion(null);
    private static final String tag = ForegroundServiceManager.class.getSimpleName();
    @SuppressLint({"StaticFieldLeak"})
    private static final ForegroundServiceManager instance = new ForegroundServiceManager();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/foreground_service/ForegroundServiceManager$Companion;", "", "()V", "instance", "Lcom/discord/foreground_service/ForegroundServiceManager;", "getInstance", "()Lcom/discord/foreground_service/ForegroundServiceManager;", "tag", "", "kotlin.jvm.PlatformType", "foreground_service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ForegroundServiceManager getInstance() {
            return ForegroundServiceManager.instance;
        }
    }

    public ForegroundServiceManager() {
        List<ServiceNotificationConfiguration> i10;
        i10 = j.i();
        this.serviceConfigurations = i10;
        String tag2 = tag;
        q.f(tag2, "tag");
        this.serviceWakelocks = new Wakelocks(tag2, 0L, 2, null);
    }

    public final Unit handleIntent(Context context, Intent intent) {
        NotificationAction notificationAction;
        q.g(context, "context");
        q.g(intent, "intent");
        NotificationAction.Companion companion = NotificationAction.Companion;
        if (IntentUtilsKt.hasExtra(intent, f0.b(GenericAction.class))) {
            notificationAction = (NotificationAction) IntentUtilsKt.getIntentParcelable(intent);
        } else {
            notificationAction = null;
        }
        GenericAction genericAction = (GenericAction) notificationAction;
        if (genericAction == null) {
            return null;
        }
        genericAction.onNotificationAction(context, false);
        return Unit.f22104a;
    }

    public final synchronized boolean isRunning$foreground_service_release() {
        boolean z10;
        if (this.service != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final synchronized void onServiceConnected$foreground_service_release(Service foregroundService) {
        q.g(foregroundService, "foregroundService");
        Log log = Log.INSTANCE;
        String tag2 = tag;
        q.f(tag2, "tag");
        Log.i$foreground_service_release$default(log, tag2, "On service connected.", null, 4, null);
        this.service = foregroundService;
        if (foregroundService != null) {
            if (!this.serviceConfigurations.isEmpty()) {
                ServiceNotification.INSTANCE.startForegroundCompat(foregroundService, foregroundService, this.serviceConfigurations);
            } else {
                stopService$foreground_service_release(foregroundService);
                q.f(tag2, "tag");
                Log.i$foreground_service_release$default(log, tag2, "No configuration present (process liked died), stopping service.", null, 4, null);
            }
        }
    }

    public final synchronized void onServiceCreated$foreground_service_release(Context context) {
        q.g(context, "context");
        Log log = Log.INSTANCE;
        String tag2 = tag;
        q.f(tag2, "tag");
        Log.i$foreground_service_release$default(log, tag2, "On service created.", null, 4, null);
        this.serviceWakelocks.acquire(context);
    }

    public final synchronized void onServiceDisconnected$foreground_service_release() {
        Log log = Log.INSTANCE;
        String tag2 = tag;
        q.f(tag2, "tag");
        Log.i$foreground_service_release$default(log, tag2, "On service destroyed.", null, 4, null);
        this.serviceWakelocks.release();
        this.service = null;
    }

    public final synchronized void startService$foreground_service_release(Context context, List<ServiceNotificationConfiguration> serviceConfigurations) {
        q.g(context, "context");
        q.g(serviceConfigurations, "serviceConfigurations");
        Log log = Log.INSTANCE;
        String tag2 = tag;
        q.f(tag2, "tag");
        int size = serviceConfigurations.size();
        Log.i$foreground_service_release$default(log, tag2, "Start service with " + size + " configurations.", null, 4, null);
        this.serviceConfigurations = serviceConfigurations;
        ForegroundService.Companion.start(context, ForegroundServiceManager$startService$1.INSTANCE);
    }

    public final synchronized void stopService$foreground_service_release(Context context) {
        q.g(context, "context");
        Log log = Log.INSTANCE;
        String tag2 = tag;
        q.f(tag2, "tag");
        Log.i$foreground_service_release$default(log, tag2, "Stop service.", null, 4, null);
        ForegroundService.Companion.stop(context, this.service);
    }
}
