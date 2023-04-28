package androidx.camera.lifecycle;

import android.os.Build;
import androidx.camera.core.AbstractC1874k;
import androidx.camera.core.AbstractC1883m;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.AbstractC1948w2;
import androidx.lifecycle.AbstractC3040l;
import androidx.lifecycle.AbstractC3047r;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p390w.AbstractC13688w;
import p451z.C14499e;

/* loaded from: classes.dex */
final class LifecycleCamera implements AbstractC3040l, AbstractC1874k {

    /* renamed from: l */
    private final LifecycleOwner f2099l;

    /* renamed from: m */
    private final C14499e f2100m;

    /* renamed from: k */
    private final Object f2098k = new Object();

    /* renamed from: n */
    private volatile boolean f2101n = false;

    /* renamed from: o */
    private boolean f2102o = false;

    /* renamed from: p */
    private boolean f2103p = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleCamera(LifecycleOwner lifecycleOwner, C14499e eVar) {
        this.f2099l = lifecycleOwner;
        this.f2100m = eVar;
        if (lifecycleOwner.getLifecycle().mo35843b().m35851a(Lifecycle.State.STARTED)) {
            eVar.m323m();
        } else {
            eVar.m315u();
        }
        lifecycleOwner.getLifecycle().mo35844a(this);
    }

    @Override // androidx.camera.core.AbstractC1874k
    /* renamed from: a */
    public AbstractC1911r mo330a() {
        return this.f2100m.mo330a();
    }

    @Override // androidx.camera.core.AbstractC1874k
    /* renamed from: b */
    public AbstractC1883m mo329b() {
        return this.f2100m.mo329b();
    }

    /* renamed from: d */
    public void m39378d(AbstractC13688w wVar) {
        this.f2100m.m327d(wVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m39377e(Collection<AbstractC1948w2> collection) {
        synchronized (this.f2098k) {
            this.f2100m.m324k(collection);
        }
    }

    /* renamed from: k */
    public C14499e m39376k() {
        return this.f2100m;
    }

    /* renamed from: m */
    public LifecycleOwner m39375m() {
        LifecycleOwner lifecycleOwner;
        synchronized (this.f2098k) {
            lifecycleOwner = this.f2099l;
        }
        return lifecycleOwner;
    }

    /* renamed from: n */
    public List<AbstractC1948w2> m39374n() {
        List<AbstractC1948w2> unmodifiableList;
        synchronized (this.f2098k) {
            unmodifiableList = Collections.unmodifiableList(this.f2100m.m311y());
        }
        return unmodifiableList;
    }

    /* renamed from: o */
    public boolean m39373o(AbstractC1948w2 w2Var) {
        boolean contains;
        synchronized (this.f2098k) {
            contains = this.f2100m.m311y().contains(w2Var);
        }
        return contains;
    }

    @AbstractC3047r(Lifecycle.EnumC3010b.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        synchronized (this.f2098k) {
            C14499e eVar = this.f2100m;
            eVar.m334G(eVar.m311y());
        }
    }

    @AbstractC3047r(Lifecycle.EnumC3010b.ON_PAUSE)
    public void onPause(LifecycleOwner lifecycleOwner) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2100m.m325g(false);
        }
    }

    @AbstractC3047r(Lifecycle.EnumC3010b.ON_RESUME)
    public void onResume(LifecycleOwner lifecycleOwner) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2100m.m325g(true);
        }
    }

    @AbstractC3047r(Lifecycle.EnumC3010b.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        synchronized (this.f2098k) {
            if (!this.f2102o && !this.f2103p) {
                this.f2100m.m323m();
                this.f2101n = true;
            }
        }
    }

    @AbstractC3047r(Lifecycle.EnumC3010b.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        synchronized (this.f2098k) {
            if (!this.f2102o && !this.f2103p) {
                this.f2100m.m315u();
                this.f2101n = false;
            }
        }
    }

    /* renamed from: p */
    public void m39372p() {
        synchronized (this.f2098k) {
            if (!this.f2102o) {
                onStop(this.f2099l);
                this.f2102o = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m39371q() {
        synchronized (this.f2098k) {
            C14499e eVar = this.f2100m;
            eVar.m334G(eVar.m311y());
        }
    }

    /* renamed from: r */
    public void m39370r() {
        synchronized (this.f2098k) {
            if (this.f2102o) {
                this.f2102o = false;
                if (this.f2099l.getLifecycle().mo35843b().m35851a(Lifecycle.State.STARTED)) {
                    onStart(this.f2099l);
                }
            }
        }
    }
}
