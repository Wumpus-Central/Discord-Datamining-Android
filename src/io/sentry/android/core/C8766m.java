package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.AbstractC8807b2;
import io.sentry.AbstractC8861f0;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC8932m0;
import io.sentry.AbstractC8959o4;
import io.sentry.AbstractC9023q0;
import io.sentry.C8843d;
import io.sentry.C8944n4;
import io.sentry.C8951o3;
import io.sentry.C8965p4;
import io.sentry.C9116v;
import io.sentry.EnumC8866f4;
import io.sentry.EnumC8942n3;
import io.sentry.EnumC8961p0;
import io.sentry.ISpan;
import io.sentry.Scope;
import io.sentry.protocol.EnumC9019y;
import io.sentry.util.C9111k;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;

/*  JADX ERROR: NullPointerException in pass: ProcessKotlinInternals
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.processMth(ProcessKotlinInternals.java:92)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.visit(ProcessKotlinInternals.java:83)
    */
/* renamed from: io.sentry.android.core.m */
/* loaded from: classes8.dex */
public final class C8766m implements AbstractC9023q0, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: k */
    private final Application f19371k;

    /* renamed from: l */
    private AbstractC8861f0 f19372l;

    /* renamed from: m */
    private SentryAndroidOptions f19373m;

    /* renamed from: o */
    private boolean f19375o;

    /* renamed from: r */
    private boolean f19378r;

    /* renamed from: s */
    private ISpan f19379s;

    /* renamed from: u */
    private final C8716g f19381u;

    /* renamed from: n */
    private boolean f19374n = false;

    /* renamed from: p */
    private boolean f19376p = false;

    /* renamed from: q */
    private boolean f19377q = false;

    /* renamed from: t */
    private final WeakHashMap<Activity, AbstractC8932m0> f19380t = new WeakHashMap<>();

    public C8766m(Application application, C8715f0 f0Var, C8716g gVar) {
        this.f19378r = false;
        Application application2 = (Application) C9111k.m16995a(application, "Application is required");
        this.f19371k = application2;
        C9111k.m16995a(f0Var, "BuildInfoProvider is required");
        this.f19381u = (C8716g) C9111k.m16995a(gVar, "ActivityFramesTracker is required");
        if (f0Var.m18303d() >= 29) {
            this.f19375o = true;
        }
        this.f19378r = m18140Q(application2);
    }

    /* renamed from: C */
    private String m18144C(boolean z) {
        return z ? "Cold Start" : "Warm Start";
    }

    /* renamed from: F0 */
    private void m18143F0() {
        for (Map.Entry<Activity, AbstractC8932m0> entry : this.f19380t.entrySet()) {
            m18124t(entry.getValue());
        }
    }

    /* renamed from: G0 */
    private void m18142G0(Activity activity, boolean z) {
        if (this.f19374n && z) {
            m18124t(this.f19380t.get(activity));
        }
    }

    /* renamed from: H */
    private String m18141H(boolean z) {
        return z ? "app.start.cold" : "app.start.warm";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: SecurityException -> 0x0032
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:130)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.attachHandlers(AttachTryCatchVisitor.java:118)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:42)
        */
    /* renamed from: Q */
    private boolean m18140Q(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "activity"
            r4.getSystemService(r0)
            r4 = move-result
            boolean r0 = r4 instanceof android.app.ActivityManager
            if (r0 == 0) goto L_0x0032
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            r4.getRunningAppProcesses()
            r4 = move-result
            if (r4 == 0) goto L_0x0032
            android.os.Process.myPid()
            r0 = move-result
            r4.iterator()
            r4 = move-result
            r4.hasNext()
            r1 = move-result
            if (r1 == 0) goto L_0x0032
            r4.next()
            r1 = move-result
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r2 = r1.pid
            if (r2 != r0) goto L_0x001a
            int r4 = r1.importance
            r0 = 100
            if (r4 != r0) goto L_0x0032
            r4 = 1
            return r4
        L_0x0032:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C8766m.m18140Q(android.content.Context):boolean");
    }

    /* renamed from: R */
    private boolean m18139R(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    /* renamed from: S */
    private boolean m18138S(Activity activity) {
        return this.f19380t.containsKey(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m18137U(Scope scope, AbstractC8932m0 m0Var, AbstractC8932m0 m0Var2) {
        if (m0Var2 == null) {
            scope.m18370x(m0Var);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f19373m;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo17722c(EnumC8942n3.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", m0Var.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static /* synthetic */ void m18136Y(AbstractC8932m0 m0Var, Scope scope, AbstractC8932m0 m0Var2) {
        if (m0Var2 == m0Var) {
            scope.m18390d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m18134f0(WeakReference weakReference, String str, AbstractC8932m0 m0Var) {
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            this.f19381u.m18287n(activity, m0Var.mo16838f());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f19373m;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo17722c(EnumC8942n3.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    /* renamed from: p */
    private void m18127p(Activity activity, String str) {
        SentryAndroidOptions sentryAndroidOptions = this.f19373m;
        if (sentryAndroidOptions != null && this.f19372l != null && sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()) {
            C8843d dVar = new C8843d();
            dVar.m17905p("navigation");
            dVar.m17908m("state", str);
            dVar.m17908m("screen", m18122z(activity));
            dVar.m17909l("ui.lifecycle");
            dVar.m17907n(EnumC8942n3.INFO);
            C9116v vVar = new C9116v();
            vVar.m16973h("android:activity", activity);
            this.f19372l.mo17830h(dVar, vVar);
        }
    }

    /* renamed from: t */
    private void m18124t(final AbstractC8932m0 m0Var) {
        if (m0Var != null && !m0Var.mo16843a()) {
            EnumC8866f4 b = m0Var.mo16842b();
            if (b == null) {
                b = EnumC8866f4.OK;
            }
            m0Var.mo16834j(b);
            AbstractC8861f0 f0Var = this.f19372l;
            if (f0Var != null) {
                f0Var.mo17829i(new AbstractC8807b2() { // from class: io.sentry.android.core.j
                    @Override // io.sentry.AbstractC8807b2
                    /* renamed from: a */
                    public final void mo16755a(Scope scope) {
                        C8766m.this.m18135b0(m0Var, scope);
                    }
                });
            }
        }
    }

    /* renamed from: w0 */
    private void m18123w0(Bundle bundle) {
        boolean z;
        if (!this.f19376p) {
            C8709d0 d = C8709d0.m18315d();
            if (bundle == null) {
                z = true;
            } else {
                z = false;
            }
            d.m18310i(z);
        }
    }

    /* renamed from: z */
    private String m18122z(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    /* renamed from: z0 */
    private void m18121z0(Activity activity) {
        Date date;
        final WeakReference weakReference = new WeakReference(activity);
        if (this.f19374n && !m18138S(activity) && this.f19372l != null) {
            m18143F0();
            final String z = m18122z(activity);
            if (this.f19378r) {
                date = C8709d0.m18315d().m18316c();
            } else {
                date = null;
            }
            Boolean e = C8709d0.m18315d().m18314e();
            C8965p4 p4Var = new C8965p4();
            p4Var.m17535l(true);
            p4Var.m17537j(new AbstractC8959o4() { // from class: io.sentry.android.core.h
                @Override // io.sentry.AbstractC8959o4
                /* renamed from: a */
                public final void mo17554a(AbstractC8932m0 m0Var) {
                    C8766m.this.m18134f0(weakReference, z, m0Var);
                }
            });
            if (!(this.f19376p || date == null || e == null)) {
                p4Var.m17538i(date);
            }
            final AbstractC8932m0 s = this.f19372l.mo17819s(new C8944n4(z, EnumC9019y.COMPONENT, "ui.load"), p4Var);
            if (!(this.f19376p || date == null || e == null)) {
                this.f19379s = s.mo16841c(m18141H(e.booleanValue()), m18144C(e.booleanValue()), date, EnumC8961p0.SENTRY);
            }
            this.f19372l.mo17829i(new AbstractC8807b2() { // from class: io.sentry.android.core.i
                @Override // io.sentry.AbstractC8807b2
                /* renamed from: a */
                public final void mo16755a(Scope scope) {
                    C8766m.this.m18130j0(s, scope);
                }
            });
            this.f19380t.put(activity, s);
        }
    }

    @Override // io.sentry.AbstractC9023q0
    /* renamed from: b */
    public void mo17181b(AbstractC8861f0 f0Var, C8951o3 o3Var) {
        SentryAndroidOptions sentryAndroidOptions;
        if (o3Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) o3Var;
        } else {
            sentryAndroidOptions = null;
        }
        this.f19373m = (SentryAndroidOptions) C9111k.m16995a(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f19372l = (AbstractC8861f0) C9111k.m16995a(f0Var, "Hub is required");
        AbstractC8869g0 logger = this.f19373m.getLogger();
        EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
        logger.mo17722c(n3Var, "ActivityLifecycleIntegration enabled: %s", Boolean.valueOf(this.f19373m.isEnableActivityLifecycleBreadcrumbs()));
        this.f19374n = m18139R(this.f19373m);
        if (this.f19373m.isEnableActivityLifecycleBreadcrumbs() || this.f19374n) {
            this.f19371k.registerActivityLifecycleCallbacks(this);
            this.f19373m.getLogger().mo17722c(n3Var, "ActivityLifecycleIntegration installed.", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19371k.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f19373m;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo17722c(EnumC8942n3.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.f19381u.m18285p();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        m18123w0(bundle);
        m18127p(activity, "created");
        m18121z0(activity);
        this.f19376p = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityDestroyed(Activity activity) {
        m18127p(activity, "destroyed");
        ISpan iSpan = this.f19379s;
        if (iSpan != null && !iSpan.mo16843a()) {
            this.f19379s.mo16834j(EnumC8866f4.CANCELLED);
        }
        m18142G0(activity, true);
        this.f19379s = null;
        if (this.f19374n) {
            this.f19380t.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(Activity activity) {
        m18127p(activity, "paused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPostResumed(Activity activity) {
        SentryAndroidOptions sentryAndroidOptions;
        if (this.f19375o && (sentryAndroidOptions = this.f19373m) != null) {
            m18142G0(activity, sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        SentryAndroidOptions sentryAndroidOptions;
        ISpan iSpan;
        if (!this.f19377q) {
            if (this.f19378r) {
                C8709d0.m18315d().m18313f();
            } else {
                SentryAndroidOptions sentryAndroidOptions2 = this.f19373m;
                if (sentryAndroidOptions2 != null) {
                    sentryAndroidOptions2.getLogger().mo17722c(EnumC8942n3.DEBUG, "App Start won't be reported because Process wasn't of foregroundImportance.", new Object[0]);
                }
            }
            if (this.f19374n && (iSpan = this.f19379s) != null) {
                iSpan.mo16840d();
            }
            this.f19377q = true;
        }
        m18127p(activity, "resumed");
        if (!this.f19375o && (sentryAndroidOptions = this.f19373m) != null) {
            m18142G0(activity, sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m18127p(activity, "saveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        this.f19381u.m18296e(activity);
        m18127p(activity, "started");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        m18127p(activity, "stopped");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m18130j0(final Scope scope, final AbstractC8932m0 m0Var) {
        scope.m18394B(new Scope.AbstractC8687b() { // from class: io.sentry.android.core.l
            @Override // io.sentry.Scope.AbstractC8687b
            /* renamed from: a */
            public final void mo16971a(AbstractC8932m0 m0Var2) {
                C8766m.this.m18137U(scope, m0Var, m0Var2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m18135b0(final Scope scope, final AbstractC8932m0 m0Var) {
        scope.m18394B(new Scope.AbstractC8687b() { // from class: io.sentry.android.core.k
            @Override // io.sentry.Scope.AbstractC8687b
            /* renamed from: a */
            public final void mo16971a(AbstractC8932m0 m0Var2) {
                C8766m.m18136Y(AbstractC8932m0.this, scope, m0Var2);
            }
        });
    }
}
