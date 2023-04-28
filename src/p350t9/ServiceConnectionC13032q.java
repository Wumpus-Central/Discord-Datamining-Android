package p350t9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import ba.C3429b;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p262oa.HandlerC11246f;
import p420x9.C14004p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t9.q */
/* loaded from: classes5.dex */
public final class ServiceConnectionC13032q implements ServiceConnection {

    /* renamed from: m */
    C13033r f29324m;

    /* renamed from: p */
    final /* synthetic */ C13038w f29327p;

    /* renamed from: k */
    int f29322k = 0;

    /* renamed from: l */
    final Messenger f29323l = new Messenger(new HandlerC11246f(Looper.getMainLooper(), new Handler.Callback() { // from class: t9.j
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ServiceConnectionC13032q qVar = ServiceConnectionC13032q.this;
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Received response to request: ");
                sb2.append(i);
                Log.d("MessengerIpcClient", sb2.toString());
            }
            synchronized (qVar) {
                AbstractC13035t<?> tVar = qVar.f29326o.get(i);
                if (tVar == null) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("Received response for unknown request: ");
                    sb3.append(i);
                    Log.w("MessengerIpcClient", sb3.toString());
                    return true;
                }
                qVar.f29326o.remove(i);
                qVar.m4718f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    tVar.m4715c(new C13036u(4, "Not supported by GmsCore", null));
                    return true;
                }
                tVar.mo4713a(data);
                return true;
            }
        }
    }));

    /* renamed from: n */
    final Queue<AbstractC13035t<?>> f29325n = new ArrayDeque();

    /* renamed from: o */
    final SparseArray<AbstractC13035t<?>> f29326o = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ServiceConnectionC13032q(C13038w wVar, C13031p pVar) {
        this.f29327p = wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m4723a(int i, String str) {
        m4722b(i, str, null);
    }

    /* renamed from: b */
    final synchronized void m4722b(int i, String str, Throwable th2) {
        Context context;
        String str2;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Disconnected: ".concat(valueOf);
            } else {
                str2 = new String("Disconnected: ");
            }
            Log.d("MessengerIpcClient", str2);
        }
        int i2 = this.f29322k;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f29322k = 4;
            C3429b b = C3429b.m34394b();
            context = this.f29327p.f29335a;
            b.m34393c(context, this);
            C13036u uVar = new C13036u(i, str, th2);
            for (AbstractC13035t<?> tVar : this.f29325n) {
                tVar.m4715c(uVar);
            }
            this.f29325n.clear();
            for (int i3 = 0; i3 < this.f29326o.size(); i3++) {
                this.f29326o.valueAt(i3).m4715c(uVar);
            }
            this.f29326o.clear();
        } else if (i2 == 3) {
            this.f29322k = 4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m4721c() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f29327p.f29336b;
        scheduledExecutorService.execute(new Runnable() { // from class: t9.l
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC13035t<?> poll;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final ServiceConnectionC13032q qVar = ServiceConnectionC13032q.this;
                while (true) {
                    synchronized (qVar) {
                        if (qVar.f29322k == 2) {
                            if (qVar.f29325n.isEmpty()) {
                                qVar.m4718f();
                                return;
                            }
                            poll = qVar.f29325n.poll();
                            qVar.f29326o.put(poll.f29330a, poll);
                            scheduledExecutorService2 = qVar.f29327p.f29336b;
                            scheduledExecutorService2.schedule(new Runnable() { // from class: t9.o
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ServiceConnectionC13032q.this.m4719e(poll.f29330a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        } else {
                            return;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
                        sb2.append("Sending ");
                        sb2.append(valueOf);
                        Log.d("MessengerIpcClient", sb2.toString());
                    }
                    context = qVar.f29327p.f29335a;
                    Messenger messenger = qVar.f29323l;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f29332c;
                    obtain.arg1 = poll.f29330a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.mo4712b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", poll.f29333d);
                    obtain.setData(bundle);
                    try {
                        qVar.f29324m.m4716a(obtain);
                    } catch (RemoteException e) {
                        qVar.m4723a(2, e.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void m4720d() {
        if (this.f29322k == 1) {
            m4723a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void m4719e(int i) {
        AbstractC13035t<?> tVar = this.f29326o.get(i);
        if (tVar != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i);
            Log.w("MessengerIpcClient", sb2.toString());
            this.f29326o.remove(i);
            tVar.m4715c(new C13036u(3, "Timed out waiting for response", null));
            m4718f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void m4718f() {
        Context context;
        if (this.f29322k == 2 && this.f29325n.isEmpty() && this.f29326o.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f29322k = 3;
            C3429b b = C3429b.m34394b();
            context = this.f29327p.f29335a;
            b.m34393c(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized boolean m4717g(AbstractC13035t<?> tVar) {
        boolean z;
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i = this.f29322k;
        if (i == 0) {
            this.f29325n.add(tVar);
            if (this.f29322k == 0) {
                z = true;
            } else {
                z = false;
            }
            C14004p.m2049l(z);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f29322k = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                C3429b b = C3429b.m34394b();
                context = this.f29327p.f29335a;
                if (!b.m34395a(context, intent, this, 1)) {
                    m4723a(0, "Unable to bind to service");
                } else {
                    scheduledExecutorService = this.f29327p.f29336b;
                    scheduledExecutorService.schedule(new Runnable() { // from class: t9.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            ServiceConnectionC13032q.this.m4720d();
                        }
                    }, 30L, TimeUnit.SECONDS);
                }
            } catch (SecurityException e) {
                m4722b(0, "Unable to bind to service", e);
            }
            return true;
        } else if (i == 1) {
            this.f29325n.add(tVar);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f29325n.add(tVar);
            m4721c();
            return true;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        scheduledExecutorService = this.f29327p.f29336b;
        scheduledExecutorService.execute(new Runnable() { // from class: t9.n
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC13032q qVar = ServiceConnectionC13032q.this;
                IBinder iBinder2 = iBinder;
                synchronized (qVar) {
                    try {
                        if (iBinder2 == null) {
                            qVar.m4723a(0, "Null service connection");
                            return;
                        }
                        try {
                            qVar.f29324m = new C13033r(iBinder2);
                            qVar.f29322k = 2;
                            qVar.m4721c();
                        } catch (RemoteException e) {
                            qVar.m4723a(0, e.getMessage());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        scheduledExecutorService = this.f29327p.f29336b;
        scheduledExecutorService.execute(new Runnable() { // from class: t9.k
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC13032q.this.m4723a(2, "Service disconnected");
            }
        });
    }
}
