package com.discord.foreground_service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.discord.foreground_service.service.ServiceNotification;
import com.discord.foreground_service.utils.ForegroundServiceUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\"\u0010\n\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/discord/foreground_service/ForegroundService;", "Landroid/app/Service;", "()V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "", "flags", "startId", "Companion", "foreground_service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ForegroundService extends Service {
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u0006J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f¨\u0006\u0011"}, d2 = {"Lcom/discord/foreground_service/ForegroundService$Companion;", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "getServiceIntent", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "onError", ViewProps.START, "Landroid/app/Service;", "service", "stop", "<init>", "()V", "foreground_service_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Intent getServiceIntent(Context context) {
            return new Intent(context, ForegroundService.class);
        }

        public final Object start(Context context, Function1<? super Exception, Unit> onError) {
            q.g(context, "context");
            q.g(onError, "onError");
            try {
                return ForegroundServiceUtilsKt.startForegroundServiceCompat(context, getServiceIntent(context));
            } catch (Exception e10) {
                onError.invoke(e10);
                return Unit.f22104a;
            }
        }

        public final void stop(Context context, Service service) {
            q.g(context, "context");
            if (service != null) {
                service.stopForeground(true);
            }
            if (service != null) {
                service.stopSelf();
            }
            context.stopService(getServiceIntent(context));
            ServiceNotification.INSTANCE.clearNotifications(context);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        ForegroundServiceManager.Companion.getInstance().onServiceCreated$foreground_service_release(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        ForegroundServiceManager.Companion.getInstance().onServiceDisconnected$foreground_service_release();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        ForegroundServiceManager.Companion.getInstance().onServiceConnected$foreground_service_release(this);
        return super.onStartCommand(intent, i10, i11);
    }
}
