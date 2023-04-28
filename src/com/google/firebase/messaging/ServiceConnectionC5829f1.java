package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import ba.C3429b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.ServiceConnectionC5829f1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p063da.ThreadFactoryC6419b;
import p064db.AbstractC6424d;

/* renamed from: com.google.firebase.messaging.f1 */
/* loaded from: classes3.dex */
class ServiceConnectionC5829f1 implements ServiceConnection {

    /* renamed from: k */
    private final Context f11574k;

    /* renamed from: l */
    private final Intent f11575l;

    /* renamed from: m */
    private final ScheduledExecutorService f11576m;

    /* renamed from: n */
    private final Queue<C5830a> f11577n;

    /* renamed from: o */
    private BinderC5819c1 f11578o;

    /* renamed from: p */
    private boolean f11579p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.messaging.f1$a */
    /* loaded from: classes3.dex */
    public static class C5830a {

        /* renamed from: a */
        final Intent f11580a;

        /* renamed from: b */
        private final TaskCompletionSource<Void> f11581b = new TaskCompletionSource<>();

        C5830a(Intent intent) {
            this.f11580a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m27131f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f11580a.getAction() + " App may get closed.");
            m27133d();
        }

        /* renamed from: c */
        void m27134c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.d1
                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC5829f1.C5830a.this.m27131f();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            m27132e().mo28870c(scheduledExecutorService, new AbstractC6424d() { // from class: com.google.firebase.messaging.e1
                @Override // p064db.AbstractC6424d
                /* renamed from: a */
                public final void mo4743a(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public void m27133d() {
            this.f11581b.m28898e(null);
        }

        /* renamed from: e */
        Task<Void> m27132e() {
            return this.f11581b.m28902a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC5829f1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new ThreadFactoryC6419b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    /* renamed from: a */
    private void m27140a() {
        while (!this.f11577n.isEmpty()) {
            this.f11577n.poll().m27133d();
        }
    }

    /* renamed from: b */
    private synchronized void m27139b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f11577n.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            BinderC5819c1 c1Var = this.f11578o;
            if (c1Var == null || !c1Var.isBinderAlive()) {
                m27137d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f11578o.m27209c(this.f11577n.poll());
        }
    }

    /* renamed from: d */
    private void m27137d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f11579p);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (!this.f11579p) {
            this.f11579p = true;
            try {
            } catch (SecurityException e) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
            }
            if (!C3429b.m34394b().m34395a(this.f11574k, this.f11575l, this, 65)) {
                Log.e("FirebaseMessaging", "binding to the service failed");
                this.f11579p = false;
                m27140a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized Task<Void> m27138c(Intent intent) {
        C5830a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new C5830a(intent);
        aVar.m27134c(this.f11576m);
        this.f11577n.add(aVar);
        m27139b();
        return aVar.m27132e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f11579p = false;
        if (!(iBinder instanceof BinderC5819c1)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            m27140a();
            return;
        }
        this.f11578o = (BinderC5819c1) iBinder;
        m27139b();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m27139b();
    }

    ServiceConnectionC5829f1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f11577n = new ArrayDeque();
        this.f11579p = false;
        Context applicationContext = context.getApplicationContext();
        this.f11574k = applicationContext;
        this.f11575l = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f11576m = scheduledExecutorService;
    }
}
