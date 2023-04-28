package ba;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import ca.C3803j;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import p082ea.C6801d;
import p163j$.util.concurrent.ConcurrentHashMap;
import p420x9.AbstractC13999n1;
import p420x9.C14004p;

/* renamed from: ba.b */
/* loaded from: classes5.dex */
public class C3429b {

    /* renamed from: b */
    private static final Object f5567b = new Object();

    /* renamed from: c */
    private static volatile C3429b f5568c;

    /* renamed from: a */
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f5569a = new ConcurrentHashMap<>();

    private C3429b() {
    }

    /* renamed from: b */
    public static C3429b m34394b() {
        if (f5568c == null) {
            synchronized (f5567b) {
                if (f5568c == null) {
                    f5568c = new C3429b();
                }
            }
        }
        C3429b bVar = f5568c;
        C14004p.m2051j(bVar);
        return bVar;
    }

    /* renamed from: e */
    private static void m34391e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m34390f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C6801d.m24304a(context).m24308c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m34389g(serviceConnection)) {
            return m34388h(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection putIfAbsent = this.f5569a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(putIfAbsent == null || serviceConnection == putIfAbsent)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean h = m34388h(context, intent, serviceConnection, i, executor);
            if (h) {
                return h;
            }
            return false;
        } finally {
            this.f5569a.remove(serviceConnection, serviceConnection);
        }
    }

    /* renamed from: g */
    private static boolean m34389g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof AbstractC13999n1);
    }

    /* renamed from: h */
    private static final boolean m34388h(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        boolean bindService;
        if (!C3803j.m33557j() || executor == null) {
            return context.bindService(intent, serviceConnection, i);
        }
        bindService = context.bindService(intent, i, executor, serviceConnection);
        return bindService;
    }

    /* renamed from: a */
    public boolean m34395a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m34390f(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    /* renamed from: c */
    public void m34393c(Context context, ServiceConnection serviceConnection) {
        if (!m34389g(serviceConnection) || !this.f5569a.containsKey(serviceConnection)) {
            m34391e(context, serviceConnection);
            return;
        }
        try {
            m34391e(context, this.f5569a.get(serviceConnection));
        } finally {
            this.f5569a.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean m34392d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        return m34390f(context, str, intent, serviceConnection, i, true, executor);
    }
}
