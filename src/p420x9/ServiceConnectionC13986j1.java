package p420x9;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import ba.C3429b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x9.j1 */
/* loaded from: classes5.dex */
public final class ServiceConnectionC13986j1 implements ServiceConnection, AbstractC13999n1 {

    /* renamed from: k */
    private final Map<ServiceConnection, ServiceConnection> f31541k = new HashMap();

    /* renamed from: l */
    private int f31542l = 2;

    /* renamed from: m */
    private boolean f31543m;

    /* renamed from: n */
    private IBinder f31544n;

    /* renamed from: o */
    private final C13982i1 f31545o;

    /* renamed from: p */
    private ComponentName f31546p;

    /* renamed from: q */
    final /* synthetic */ C13995m1 f31547q;

    public ServiceConnectionC13986j1(C13995m1 m1Var, C13982i1 i1Var) {
        this.f31547q = m1Var;
        this.f31545o = i1Var;
    }

    /* renamed from: a */
    public final int m2093a() {
        return this.f31542l;
    }

    /* renamed from: b */
    public final ComponentName m2092b() {
        return this.f31546p;
    }

    /* renamed from: c */
    public final IBinder m2091c() {
        return this.f31544n;
    }

    /* renamed from: d */
    public final void m2090d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f31541k.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void m2089e(String str, Executor executor) {
        C3429b bVar;
        Context context;
        Context context2;
        C3429b bVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        this.f31542l = 3;
        C13995m1 m1Var = this.f31547q;
        bVar = m1Var.f31567j;
        context = m1Var.f31564g;
        C13982i1 i1Var = this.f31545o;
        context2 = m1Var.f31564g;
        boolean d = bVar.m34392d(context, str, i1Var.m2096c(context2), this, this.f31545o.m2098a(), executor);
        this.f31543m = d;
        if (d) {
            handler = this.f31547q.f31565h;
            Message obtainMessage = handler.obtainMessage(1, this.f31545o);
            handler2 = this.f31547q.f31565h;
            j = this.f31547q.f31569l;
            handler2.sendMessageDelayed(obtainMessage, j);
            return;
        }
        this.f31542l = 2;
        try {
            C13995m1 m1Var2 = this.f31547q;
            bVar2 = m1Var2.f31567j;
            context3 = m1Var2.f31564g;
            bVar2.m34393c(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: f */
    public final void m2088f(ServiceConnection serviceConnection, String str) {
        this.f31541k.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void m2087g(String str) {
        Handler handler;
        C3429b bVar;
        Context context;
        handler = this.f31547q.f31565h;
        handler.removeMessages(1, this.f31545o);
        C13995m1 m1Var = this.f31547q;
        bVar = m1Var.f31567j;
        context = m1Var.f31564g;
        bVar.m34393c(context, this);
        this.f31543m = false;
        this.f31542l = 2;
    }

    /* renamed from: h */
    public final boolean m2086h(ServiceConnection serviceConnection) {
        return this.f31541k.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean m2085i() {
        return this.f31541k.isEmpty();
    }

    /* renamed from: j */
    public final boolean m2084j() {
        return this.f31543m;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f31547q.f31563f;
        synchronized (hashMap) {
            handler = this.f31547q.f31565h;
            handler.removeMessages(1, this.f31545o);
            this.f31544n = iBinder;
            this.f31546p = componentName;
            for (ServiceConnection serviceConnection : this.f31541k.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f31542l = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f31547q.f31563f;
        synchronized (hashMap) {
            handler = this.f31547q.f31565h;
            handler.removeMessages(1, this.f31545o);
            this.f31544n = null;
            this.f31546p = componentName;
            for (ServiceConnection serviceConnection : this.f31541k.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f31542l = 2;
        }
    }
}
