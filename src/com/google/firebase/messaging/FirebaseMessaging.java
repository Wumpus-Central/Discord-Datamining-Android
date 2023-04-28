package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import cd.AbstractC3987i;
import com.google.android.gms.tasks.C5474b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.C5848o0;
import com.google.firebase.messaging.C5859t0;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p063da.ThreadFactoryC6419b;
import p064db.AbstractC6426f;
import p064db.AbstractC6428h;
import p136hc.C7981a;
import p136hc.C7984d;
import p279p6.AbstractC11577g;
import p300qc.AbstractC12104b;
import p300qc.AbstractC12106d;
import p300qc.C12103a;
import p321rc.AbstractC12564k;
import p367uc.AbstractC13254d;
import p420x9.C14004p;
import sc.AbstractC12861a;
import tc.AbstractC13053b;

/* loaded from: classes3.dex */
public class FirebaseMessaging {

    /* renamed from: n */
    private static final long f11500n = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o */
    private static C5859t0 f11501o;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: p */
    static AbstractC11577g f11502p;

    /* renamed from: q */
    static ScheduledExecutorService f11503q;

    /* renamed from: a */
    private final C7984d f11504a;

    /* renamed from: b */
    private final AbstractC12861a f11505b;

    /* renamed from: c */
    private final AbstractC13254d f11506c;

    /* renamed from: d */
    private final Context f11507d;

    /* renamed from: e */
    private final C5872z f11508e;

    /* renamed from: f */
    private final C5848o0 f11509f;

    /* renamed from: g */
    private final C5806a f11510g;

    /* renamed from: h */
    private final Executor f11511h;

    /* renamed from: i */
    private final Executor f11512i;

    /* renamed from: j */
    private final Task<C5871y0> f11513j;

    /* renamed from: k */
    private final C5825e0 f11514k;

    /* renamed from: l */
    private boolean f11515l;

    /* renamed from: m */
    private final Application.ActivityLifecycleCallbacks f11516m;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    /* loaded from: classes3.dex */
    public class C5806a {

        /* renamed from: a */
        private final AbstractC12106d f11517a;

        /* renamed from: b */
        private boolean f11518b;

        /* renamed from: c */
        private AbstractC12104b<C7981a> f11519c;

        /* renamed from: d */
        private Boolean f11520d;

        C5806a(AbstractC12106d dVar) {
            this.f11517a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m27248d(C12103a aVar) {
            if (m27249c()) {
                FirebaseMessaging.this.m27280C();
            }
        }

        /* renamed from: e */
        private Boolean m27247e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context j = FirebaseMessaging.this.f11504a.m20967j();
            SharedPreferences sharedPreferences = j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = j.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(j.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: b */
        synchronized void m27250b() {
            if (!this.f11518b) {
                Boolean e = m27247e();
                this.f11520d = e;
                if (e == null) {
                    AbstractC12104b<C7981a> wVar = new AbstractC12104b() { // from class: com.google.firebase.messaging.w
                        @Override // p300qc.AbstractC12104b
                        /* renamed from: a */
                        public final void mo7833a(C12103a aVar) {
                            FirebaseMessaging.C5806a.this.m27248d(aVar);
                        }
                    };
                    this.f11519c = wVar;
                    this.f11517a.mo7832a(C7981a.class, wVar);
                }
                this.f11518b = true;
            }
        }

        /* renamed from: c */
        synchronized boolean m27249c() {
            boolean z;
            m27250b();
            Boolean bool = this.f11520d;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = FirebaseMessaging.this.f11504a.m20958s();
            }
            return z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(C7984d dVar, AbstractC12861a aVar, AbstractC13053b<AbstractC3987i> bVar, AbstractC13053b<AbstractC12564k> bVar2, AbstractC13254d dVar2, AbstractC11577g gVar, AbstractC12106d dVar3) {
        this(dVar, aVar, bVar, bVar2, dVar2, gVar, dVar3, new C5825e0(dVar.m20967j()));
    }

    /* renamed from: B */
    private synchronized void m27281B() {
        if (!this.f11515l) {
            m27279D(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m27280C() {
        AbstractC12861a aVar = this.f11505b;
        if (aVar != null) {
            aVar.m5248a();
        } else if (m27278E(m27262p())) {
            m27281B();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(C7984d dVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) dVar.m20968i(FirebaseMessaging.class);
            C14004p.m2050k(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* renamed from: l */
    public static synchronized FirebaseMessaging m27266l() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(C7984d.m20966k());
        }
        return instance;
    }

    /* renamed from: m */
    private static synchronized C5859t0 m27265m(Context context) {
        C5859t0 t0Var;
        synchronized (FirebaseMessaging.class) {
            if (f11501o == null) {
                f11501o = new C5859t0(context);
            }
            t0Var = f11501o;
        }
        return t0Var;
    }

    /* renamed from: n */
    private String m27264n() {
        if ("[DEFAULT]".equals(this.f11504a.m20965l())) {
            return "";
        }
        return this.f11504a.m20963n();
    }

    /* renamed from: q */
    public static AbstractC11577g m27261q() {
        return f11502p;
    }

    /* renamed from: r */
    private void m27260r(String str) {
        if ("[DEFAULT]".equals(this.f11504a.m20965l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f11504a.m20965l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C5841l(this.f11507d).m27109k(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ Task m27257u(final String str, final C5859t0.C5860a aVar) {
        return this.f11508e.m27028e().mo28857p(new ExecutorC5827f(), new AbstractC6428h() { // from class: com.google.firebase.messaging.v
            @Override // p064db.AbstractC6428h
            /* renamed from: a */
            public final Task mo4736a(Object obj) {
                Task v;
                v = FirebaseMessaging.this.m27256v(str, aVar, (String) obj);
                return v;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ Task m27256v(String str, C5859t0.C5860a aVar, String str2) {
        m27265m(this.f11507d).m27068f(m27264n(), str, str2, this.f11514k.m27174a());
        if (aVar == null || !str2.equals(aVar.f11625a)) {
            m27260r(str2);
        }
        return C5474b.m28893e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m27255w(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.m28900c(m27269i());
        } catch (Exception e) {
            taskCompletionSource.m28901b(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m27254x() {
        if (m27259s()) {
            m27280C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m27253y(C5871y0 y0Var) {
        if (m27259s()) {
            y0Var.m27035o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m27252z() {
        C5840k0.m27123c(this.f11507d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public synchronized void m27282A(boolean z) {
        this.f11515l = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public synchronized void m27279D(long j) {
        m27268j(new RunnableC5862u0(this, Math.min(Math.max(30L, 2 * j), f11500n)), j);
        this.f11515l = true;
    }

    /* renamed from: E */
    boolean m27278E(C5859t0.C5860a aVar) {
        return aVar == null || aVar.m27066b(this.f11514k.m27174a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public String m27269i() {
        AbstractC12861a aVar = this.f11505b;
        if (aVar != null) {
            try {
                return (String) C5474b.m28897a(aVar.m5247b());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        } else {
            final C5859t0.C5860a p = m27262p();
            if (!m27278E(p)) {
                return p.f11625a;
            }
            final String c = C5825e0.m27172c(this.f11504a);
            try {
                return (String) C5474b.m28897a(this.f11509f.m27092b(c, new C5848o0.AbstractC5849a() { // from class: com.google.firebase.messaging.t
                    @Override // com.google.firebase.messaging.C5848o0.AbstractC5849a
                    public final Task start() {
                        Task u;
                        u = FirebaseMessaging.this.m27257u(c, p);
                        return u;
                    }
                }));
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m27268j(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (f11503q == null) {
                f11503q = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC6419b("TAG"));
            }
            f11503q.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Context m27267k() {
        return this.f11507d;
    }

    /* renamed from: o */
    public Task<String> m27263o() {
        AbstractC12861a aVar = this.f11505b;
        if (aVar != null) {
            return aVar.m5247b();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11511h.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m27255w(taskCompletionSource);
            }
        });
        return taskCompletionSource.m28902a();
    }

    /* renamed from: p */
    C5859t0.C5860a m27262p() {
        return m27265m(this.f11507d).m27070d(m27264n(), C5825e0.m27172c(this.f11504a));
    }

    /* renamed from: s */
    public boolean m27259s() {
        return this.f11510g.m27249c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m27258t() {
        return this.f11514k.m27168g();
    }

    FirebaseMessaging(C7984d dVar, AbstractC12861a aVar, AbstractC13053b<AbstractC3987i> bVar, AbstractC13053b<AbstractC12564k> bVar2, AbstractC13254d dVar2, AbstractC11577g gVar, AbstractC12106d dVar3, C5825e0 e0Var) {
        this(dVar, aVar, dVar2, gVar, dVar3, e0Var, new C5872z(dVar, e0Var, bVar, bVar2, dVar2), C5843m.m27101d(), C5843m.m27104a());
    }

    FirebaseMessaging(C7984d dVar, AbstractC12861a aVar, AbstractC13254d dVar2, AbstractC11577g gVar, AbstractC12106d dVar3, C5825e0 e0Var, C5872z zVar, Executor executor, Executor executor2) {
        this.f11515l = false;
        f11502p = gVar;
        this.f11504a = dVar;
        this.f11505b = aVar;
        this.f11506c = dVar2;
        this.f11510g = new C5806a(dVar3);
        Context j = dVar.m20967j();
        this.f11507d = j;
        C5847o oVar = new C5847o();
        this.f11516m = oVar;
        this.f11514k = e0Var;
        this.f11512i = executor;
        this.f11508e = zVar;
        this.f11509f = new C5848o0(executor);
        this.f11511h = executor2;
        Context j2 = dVar.m20967j();
        if (j2 instanceof Application) {
            ((Application) j2).registerActivityLifecycleCallbacks(oVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + j2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.m5246c(new AbstractC12861a.AbstractC0414a() { // from class: com.google.firebase.messaging.p
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.q
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m27254x();
            }
        });
        Task<C5871y0> e = C5871y0.m27045e(this, e0Var, zVar, j, C5843m.m27100e());
        this.f11513j = e;
        e.mo28866g(executor2, new AbstractC6426f() { // from class: com.google.firebase.messaging.r
            @Override // p064db.AbstractC6426f
            /* renamed from: a */
            public final void mo25576a(Object obj) {
                FirebaseMessaging.this.m27253y((C5871y0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.s
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m27252z();
            }
        });
    }
}
