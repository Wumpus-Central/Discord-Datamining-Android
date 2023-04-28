package p350t9;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p063da.ThreadFactoryC6419b;
import p262oa.C11245e;

/* renamed from: t9.w */
/* loaded from: classes5.dex */
public final class C13038w {

    /* renamed from: e */
    private static C13038w f29334e;

    /* renamed from: a */
    private final Context f29335a;

    /* renamed from: b */
    private final ScheduledExecutorService f29336b;

    /* renamed from: c */
    private ServiceConnectionC13032q f29337c = new ServiceConnectionC13032q(this, null);

    /* renamed from: d */
    private int f29338d = 1;

    C13038w(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f29336b = scheduledExecutorService;
        this.f29335a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static synchronized C13038w m4710b(Context context) {
        C13038w wVar;
        synchronized (C13038w.class) {
            if (f29334e == null) {
                C11245e.m10368a();
                f29334e = new C13038w(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC6419b("MessengerIpcClient"))));
            }
            wVar = f29334e;
        }
        return wVar;
    }

    /* renamed from: f */
    private final synchronized int m4706f() {
        int i;
        i = this.f29338d;
        this.f29338d = i + 1;
        return i;
    }

    /* renamed from: g */
    private final synchronized <T> Task<T> m4705g(AbstractC13035t<T> tVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(tVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!this.f29337c.m4717g(tVar)) {
            ServiceConnectionC13032q qVar = new ServiceConnectionC13032q(this, null);
            this.f29337c = qVar;
            qVar.m4717g(tVar);
        }
        return tVar.f29331b.m28902a();
    }

    /* renamed from: c */
    public final Task<Void> m4709c(int i, Bundle bundle) {
        return m4705g(new C13034s(m4706f(), 2, bundle));
    }

    /* renamed from: d */
    public final Task<Bundle> m4708d(int i, Bundle bundle) {
        return m4705g(new C13037v(m4706f(), 1, bundle));
    }
}
