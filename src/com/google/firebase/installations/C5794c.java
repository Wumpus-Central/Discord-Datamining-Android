package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.tasks.C5474b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.C5794c;
import com.google.firebase.installations.C5797d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p136hc.C7984d;
import p321rc.AbstractC12563j;
import p367uc.AbstractC13254d;
import p367uc.C13256f;
import p403wc.AbstractC13864d;
import p403wc.C13861b;
import p403wc.C13862c;
import p420x9.C14004p;
import p423xc.AbstractC14067d;
import p423xc.AbstractC14071f;
import p423xc.C14066c;
import tc.AbstractC13053b;
import vc.AbstractC13489a;

/* renamed from: com.google.firebase.installations.c */
/* loaded from: classes3.dex */
public class C5794c implements AbstractC13254d {

    /* renamed from: m */
    private static final Object f11470m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f11471n = new ThreadFactoryC5795a();

    /* renamed from: a */
    private final C7984d f11472a;

    /* renamed from: b */
    private final C14066c f11473b;

    /* renamed from: c */
    private final C13862c f11474c;

    /* renamed from: d */
    private final C5804i f11475d;

    /* renamed from: e */
    private final C13861b f11476e;

    /* renamed from: f */
    private final C13256f f11477f;

    /* renamed from: g */
    private final Object f11478g;

    /* renamed from: h */
    private final ExecutorService f11479h;

    /* renamed from: i */
    private final ExecutorService f11480i;

    /* renamed from: j */
    private String f11481j;

    /* renamed from: k */
    private Set<AbstractC13489a> f11482k;

    /* renamed from: l */
    private final List<AbstractC5803h> f11483l;

    /* renamed from: com.google.firebase.installations.c$a */
    /* loaded from: classes3.dex */
    class ThreadFactoryC5795a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f11484a = new AtomicInteger(1);

        ThreadFactoryC5795a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f11484a.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.c$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C5796b {

        /* renamed from: a */
        static final /* synthetic */ int[] f11485a;

        /* renamed from: b */
        static final /* synthetic */ int[] f11486b;

        static {
            int[] iArr = new int[AbstractC14071f.EnumC14073b.values().length];
            f11486b = iArr;
            try {
                iArr[AbstractC14071f.EnumC14073b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11486b[AbstractC14071f.EnumC14073b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11486b[AbstractC14071f.EnumC14073b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC14067d.EnumC14069b.values().length];
            f11485a = iArr2;
            try {
                iArr2[AbstractC14067d.EnumC14069b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11485a[AbstractC14067d.EnumC14069b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5794c(C7984d dVar, AbstractC13053b<AbstractC12563j> bVar) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f11471n), dVar, new C14066c(dVar.m20967j(), bVar), new C13862c(dVar), C5804i.m27290c(), new C13861b(dVar), new C13256f());
    }

    /* renamed from: A */
    private synchronized void m27329A(String str) {
        this.f11481j = str;
    }

    /* renamed from: B */
    private synchronized void m27328B(AbstractC13864d dVar, AbstractC13864d dVar2) {
        if (this.f11482k.size() != 0 && !dVar.mo2509d().equals(dVar2.mo2509d())) {
            for (AbstractC13489a aVar : this.f11482k) {
                aVar.m3599a(dVar2.mo2509d());
            }
        }
    }

    /* renamed from: e */
    private Task<AbstractC5801g> m27324e() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m27322g(new C5799e(this.f11475d, taskCompletionSource));
        return taskCompletionSource.m28902a();
    }

    /* renamed from: f */
    private Task<String> m27323f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m27322g(new C5800f(taskCompletionSource));
        return taskCompletionSource.m28902a();
    }

    /* renamed from: g */
    private void m27322g(AbstractC5803h hVar) {
        synchronized (this.f11478g) {
            this.f11483l.add(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m27310s(boolean r3) {
        /*
            r2 = this;
            wc.d r0 = r2.m27314o()
            boolean r1 = r0.m2504i()     // Catch: d -> 0x005f
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.m2501l()     // Catch: d -> 0x005f
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.i r3 = r2.f11475d     // Catch: d -> 0x005f
            boolean r3 = r3.m27287f(r0)     // Catch: d -> 0x005f
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            wc.d r3 = r2.m27319j(r0)     // Catch: d -> 0x005f
            goto L_0x0026
        L_0x0022:
            wc.d r3 = r2.m27305x(r0)     // Catch: d -> 0x005f
        L_0x0026:
            r2.m27311r(r3)
            r2.m27328B(r0, r3)
            boolean r0 = r3.m2502k()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.mo2509d()
            r2.m27329A(r0)
        L_0x0039:
            boolean r0 = r3.m2504i()
            if (r0 == 0) goto L_0x004a
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.C5797d.EnumC5798a.BAD_CONFIG
            r3.<init>(r0)
            r2.m27304y(r3)
            goto L_0x005e
        L_0x004a:
            boolean r0 = r3.m2503j()
            if (r0 == 0) goto L_0x005b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.m27304y(r3)
            goto L_0x005e
        L_0x005b:
            r2.m27303z(r3)
        L_0x005e:
            return
        L_0x005f:
            r3 = move-exception
            r2.m27304y(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C5794c.m27310s(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m27308u(final boolean z) {
        AbstractC13864d p = m27313p();
        if (z) {
            p = p.m2497p();
        }
        m27303z(p);
        this.f11480i.execute(new Runnable() { // from class: uc.c
            @Override // java.lang.Runnable
            public final void run() {
                C5794c.this.m27310s(z);
            }
        });
    }

    /* renamed from: j */
    private AbstractC13864d m27319j(AbstractC13864d dVar) {
        AbstractC14071f e = this.f11473b.m1808e(m27318k(), dVar.mo2509d(), m27312q(), dVar.mo2507f());
        int i = C5796b.f11486b[e.mo1774b().ordinal()];
        if (i == 1) {
            return dVar.m2498o(e.mo1773c(), e.mo1772d(), this.f11475d.m27291b());
        }
        if (i == 2) {
            return dVar.m2496q("BAD CONFIG");
        }
        if (i == 3) {
            m27329A(null);
            return dVar.m2495r();
        }
        throw new C5797d("Firebase Installations Service is unavailable. Please try again later.", C5797d.EnumC5798a.UNAVAILABLE);
    }

    /* renamed from: m */
    private synchronized String m27316m() {
        return this.f11481j;
    }

    /* renamed from: n */
    public static C5794c m27315n(C7984d dVar) {
        boolean z;
        if (dVar != null) {
            z = true;
        } else {
            z = false;
        }
        C14004p.m2059b(z, "Null is not a valid value of FirebaseApp.");
        return (C5794c) dVar.m20968i(AbstractC13254d.class);
    }

    /* renamed from: o */
    private AbstractC13864d m27314o() {
        AbstractC13864d d;
        synchronized (f11470m) {
            C5793b a = C5793b.m27331a(this.f11472a.m20967j(), "generatefid.lock");
            d = this.f11474c.m2513d();
            if (a != null) {
                a.m27330b();
            }
        }
        return d;
    }

    /* renamed from: p */
    private AbstractC13864d m27313p() {
        AbstractC13864d d;
        synchronized (f11470m) {
            C5793b a = C5793b.m27331a(this.f11472a.m20967j(), "generatefid.lock");
            d = this.f11474c.m2513d();
            if (d.m2503j()) {
                d = this.f11474c.m2515b(d.m2493t(m27306w(d)));
            }
            if (a != null) {
                a.m27330b();
            }
        }
        return d;
    }

    /* renamed from: r */
    private void m27311r(AbstractC13864d dVar) {
        synchronized (f11470m) {
            C5793b a = C5793b.m27331a(this.f11472a.m20967j(), "generatefid.lock");
            this.f11474c.m2515b(dVar);
            if (a != null) {
                a.m27330b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m27309t() {
        m27308u(false);
    }

    /* renamed from: v */
    private void m27307v() {
        C14004p.m2054g(m27317l(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C14004p.m2054g(m27312q(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C14004p.m2054g(m27318k(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C14004p.m2059b(C5804i.m27285h(m27317l()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C14004p.m2059b(C5804i.m27286g(m27318k()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: w */
    private String m27306w(AbstractC13864d dVar) {
        if ((!this.f11472a.m20965l().equals("CHIME_ANDROID_SDK") && !this.f11472a.m20957t()) || !dVar.m2500m()) {
            return this.f11477f.m4206a();
        }
        String f = this.f11476e.m2520f();
        if (TextUtils.isEmpty(f)) {
            return this.f11477f.m4206a();
        }
        return f;
    }

    /* renamed from: x */
    private AbstractC13864d m27305x(AbstractC13864d dVar) {
        String str;
        if (dVar.mo2509d() == null || dVar.mo2509d().length() != 11) {
            str = null;
        } else {
            str = this.f11476e.m2517i();
        }
        AbstractC14067d d = this.f11473b.m1809d(m27318k(), dVar.mo2509d(), m27312q(), m27317l(), str);
        int i = C5796b.f11485a[d.mo1789e().ordinal()];
        if (i == 1) {
            return dVar.m2494s(d.mo1791c(), d.mo1790d(), this.f11475d.m27291b(), d.mo1792b().mo1773c(), d.mo1792b().mo1772d());
        }
        if (i == 2) {
            return dVar.m2496q("BAD CONFIG");
        }
        throw new C5797d("Firebase Installations Service is unavailable. Please try again later.", C5797d.EnumC5798a.UNAVAILABLE);
    }

    /* renamed from: y */
    private void m27304y(Exception exc) {
        synchronized (this.f11478g) {
            Iterator<AbstractC5803h> it = this.f11483l.iterator();
            while (it.hasNext()) {
                if (it.next().mo27294a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: z */
    private void m27303z(AbstractC13864d dVar) {
        synchronized (this.f11478g) {
            Iterator<AbstractC5803h> it = this.f11483l.iterator();
            while (it.hasNext()) {
                if (it.next().mo27293b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    @Override // p367uc.AbstractC13254d
    /* renamed from: a */
    public Task<AbstractC5801g> mo4208a(final boolean z) {
        m27307v();
        Task<AbstractC5801g> e = m27324e();
        this.f11479h.execute(new Runnable() { // from class: uc.a
            @Override // java.lang.Runnable
            public final void run() {
                C5794c.this.m27308u(z);
            }
        });
        return e;
    }

    @Override // p367uc.AbstractC13254d
    public Task<String> getId() {
        m27307v();
        String m = m27316m();
        if (m != null) {
            return C5474b.m28893e(m);
        }
        Task<String> f = m27323f();
        this.f11479h.execute(new Runnable() { // from class: uc.b
            @Override // java.lang.Runnable
            public final void run() {
                C5794c.this.m27309t();
            }
        });
        return f;
    }

    /* renamed from: k */
    String m27318k() {
        return this.f11472a.m20964m().m20942b();
    }

    /* renamed from: l */
    String m27317l() {
        return this.f11472a.m20964m().m20941c();
    }

    /* renamed from: q */
    String m27312q() {
        return this.f11472a.m20964m().m20939e();
    }

    C5794c(ExecutorService executorService, C7984d dVar, C14066c cVar, C13862c cVar2, C5804i iVar, C13861b bVar, C13256f fVar) {
        this.f11478g = new Object();
        this.f11482k = new HashSet();
        this.f11483l = new ArrayList();
        this.f11472a = dVar;
        this.f11473b = cVar;
        this.f11474c = cVar2;
        this.f11475d = iVar;
        this.f11476e = bVar;
        this.f11477f = fVar;
        this.f11479h = executorService;
        this.f11480i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f11471n);
    }
}
