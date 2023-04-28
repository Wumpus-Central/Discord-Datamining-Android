package io.sentry.android.core;

import androidx.lifecycle.C3030c;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.AbstractC8861f0;
import io.sentry.C8843d;
import io.sentry.EnumC8942n3;
import io.sentry.transport.AbstractC9079o;
import io.sentry.transport.C9077m;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes8.dex */
final class LifecycleWatcher implements DefaultLifecycleObserver {

    /* renamed from: k */
    private final AtomicLong f19216k;

    /* renamed from: l */
    private final long f19217l;

    /* renamed from: m */
    private TimerTask f19218m;

    /* renamed from: n */
    private final Timer f19219n;

    /* renamed from: o */
    private final Object f19220o;

    /* renamed from: p */
    private final AbstractC8861f0 f19221p;

    /* renamed from: q */
    private final boolean f19222q;

    /* renamed from: r */
    private final boolean f19223r;

    /* renamed from: s */
    private final AtomicBoolean f19224s;

    /* renamed from: t */
    private final AbstractC9079o f19225t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.android.core.LifecycleWatcher$a */
    /* loaded from: classes8.dex */
    public class C8695a extends TimerTask {
        C8695a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            LifecycleWatcher.this.m18341f(ViewProps.END);
            LifecycleWatcher.this.f19221p.mo17823o();
            LifecycleWatcher.this.f19224s.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleWatcher(AbstractC8861f0 f0Var, long j, boolean z, boolean z2) {
        this(f0Var, j, z, z2, C9077m.m17126b());
    }

    /* renamed from: e */
    private void m18342e(String str) {
        if (this.f19223r) {
            C8843d dVar = new C8843d();
            dVar.m17905p("navigation");
            dVar.m17908m("state", str);
            dVar.m17909l("app.lifecycle");
            dVar.m17907n(EnumC8942n3.INFO);
            this.f19221p.mo17833e(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m18341f(String str) {
        C8843d dVar = new C8843d();
        dVar.m17905p("session");
        dVar.m17908m("state", str);
        dVar.m17909l("app.lifecycle");
        dVar.m17907n(EnumC8942n3.INFO);
        this.f19221p.mo17833e(dVar);
    }

    /* renamed from: g */
    private void m18340g() {
        synchronized (this.f19220o) {
            TimerTask timerTask = this.f19218m;
            if (timerTask != null) {
                timerTask.cancel();
                this.f19218m = null;
            }
        }
    }

    /* renamed from: h */
    private void m18339h() {
        synchronized (this.f19220o) {
            m18340g();
            if (this.f19219n != null) {
                C8695a aVar = new C8695a();
                this.f19218m = aVar;
                this.f19219n.schedule(aVar, this.f19217l);
            }
        }
    }

    /* renamed from: i */
    private void m18338i() {
        if (this.f19222q) {
            m18340g();
            long a = this.f19225t.mo17116a();
            long j = this.f19216k.get();
            if (j == 0 || j + this.f19217l <= a) {
                m18341f(ViewProps.START);
                this.f19221p.mo17813y();
                this.f19224s.set(true);
            }
            this.f19216k.set(a);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.AbstractC3032e
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C3030c.m35780a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.AbstractC3032e
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C3030c.m35779b(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.AbstractC3032e
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C3030c.m35778c(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.AbstractC3032e
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C3030c.m35777d(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.AbstractC3032e
    public void onStart(LifecycleOwner lifecycleOwner) {
        m18338i();
        m18342e("foreground");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.AbstractC3032e
    public void onStop(LifecycleOwner lifecycleOwner) {
        if (this.f19222q) {
            this.f19216k.set(this.f19225t.mo17116a());
            m18339h();
        }
        m18342e(AppStateModule.APP_STATE_BACKGROUND);
    }

    LifecycleWatcher(AbstractC8861f0 f0Var, long j, boolean z, boolean z2, AbstractC9079o oVar) {
        this.f19216k = new AtomicLong(0L);
        this.f19220o = new Object();
        this.f19224s = new AtomicBoolean();
        this.f19217l = j;
        this.f19222q = z;
        this.f19223r = z2;
        this.f19221p = f0Var;
        this.f19225t = oVar;
        if (z) {
            this.f19219n = new Timer(true);
        } else {
            this.f19219n = null;
        }
    }
}
