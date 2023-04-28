package androidx.camera.lifecycle;

import androidx.camera.core.AbstractC1948w2;
import androidx.camera.core.C1795c3;
import androidx.core.util.C2517g;
import androidx.lifecycle.AbstractC3040l;
import androidx.lifecycle.AbstractC3047r;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p451z.C14499e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LifecycleCameraRepository {

    /* renamed from: a */
    private final Object f2104a = new Object();

    /* renamed from: b */
    private final Map<AbstractC1973a, LifecycleCamera> f2105b = new HashMap();

    /* renamed from: c */
    private final Map<LifecycleCameraRepositoryObserver, Set<AbstractC1973a>> f2106c = new HashMap();

    /* renamed from: d */
    private final ArrayDeque<LifecycleOwner> f2107d = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class LifecycleCameraRepositoryObserver implements AbstractC3040l {

        /* renamed from: k */
        private final LifecycleCameraRepository f2108k;

        /* renamed from: l */
        private final LifecycleOwner f2109l;

        LifecycleCameraRepositoryObserver(LifecycleOwner lifecycleOwner, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f2109l = lifecycleOwner;
            this.f2108k = lifecycleCameraRepository;
        }

        /* renamed from: a */
        LifecycleOwner m39356a() {
            return this.f2109l;
        }

        @AbstractC3047r(Lifecycle.EnumC3010b.ON_DESTROY)
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            this.f2108k.m39358l(lifecycleOwner);
        }

        @AbstractC3047r(Lifecycle.EnumC3010b.ON_START)
        public void onStart(LifecycleOwner lifecycleOwner) {
            this.f2108k.m39362h(lifecycleOwner);
        }

        @AbstractC3047r(Lifecycle.EnumC3010b.ON_STOP)
        public void onStop(LifecycleOwner lifecycleOwner) {
            this.f2108k.m39361i(lifecycleOwner);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.lifecycle.LifecycleCameraRepository$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1973a {
        /* renamed from: a */
        static AbstractC1973a m39355a(LifecycleOwner lifecycleOwner, C14499e.C14501b bVar) {
            return new C1974a(lifecycleOwner, bVar);
        }

        /* renamed from: b */
        public abstract C14499e.C14501b mo39354b();

        /* renamed from: c */
        public abstract LifecycleOwner mo39353c();
    }

    /* renamed from: d */
    private LifecycleCameraRepositoryObserver m39366d(LifecycleOwner lifecycleOwner) {
        synchronized (this.f2104a) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.f2106c.keySet()) {
                if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.m39356a())) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    /* renamed from: f */
    private boolean m39364f(LifecycleOwner lifecycleOwner) {
        synchronized (this.f2104a) {
            LifecycleCameraRepositoryObserver d = m39366d(lifecycleOwner);
            if (d == null) {
                return false;
            }
            for (AbstractC1973a aVar : this.f2106c.get(d)) {
                if (!((LifecycleCamera) C2517g.m37588g(this.f2105b.get(aVar))).m39374n().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: g */
    private void m39363g(LifecycleCamera lifecycleCamera) {
        Set<AbstractC1973a> set;
        synchronized (this.f2104a) {
            LifecycleOwner m = lifecycleCamera.m39375m();
            AbstractC1973a a = AbstractC1973a.m39355a(m, lifecycleCamera.m39376k().m313w());
            LifecycleCameraRepositoryObserver d = m39366d(m);
            if (d != null) {
                set = this.f2106c.get(d);
            } else {
                set = new HashSet<>();
            }
            set.add(a);
            this.f2105b.put(a, lifecycleCamera);
            if (d == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(m, this);
                this.f2106c.put(lifecycleCameraRepositoryObserver, set);
                m.getLifecycle().mo35844a(lifecycleCameraRepositoryObserver);
            }
        }
    }

    /* renamed from: j */
    private void m39360j(LifecycleOwner lifecycleOwner) {
        synchronized (this.f2104a) {
            for (AbstractC1973a aVar : this.f2106c.get(m39366d(lifecycleOwner))) {
                ((LifecycleCamera) C2517g.m37588g(this.f2105b.get(aVar))).m39372p();
            }
        }
    }

    /* renamed from: m */
    private void m39357m(LifecycleOwner lifecycleOwner) {
        synchronized (this.f2104a) {
            for (AbstractC1973a aVar : this.f2106c.get(m39366d(lifecycleOwner))) {
                LifecycleCamera lifecycleCamera = this.f2105b.get(aVar);
                if (!((LifecycleCamera) C2517g.m37588g(lifecycleCamera)).m39374n().isEmpty()) {
                    lifecycleCamera.m39370r();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m39369a(LifecycleCamera lifecycleCamera, C1795c3 c3Var, Collection<AbstractC1948w2> collection) {
        boolean z;
        synchronized (this.f2104a) {
            if (!collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37594a(z);
            LifecycleOwner m = lifecycleCamera.m39375m();
            for (AbstractC1973a aVar : this.f2106c.get(m39366d(m))) {
                LifecycleCamera lifecycleCamera2 = (LifecycleCamera) C2517g.m37588g(this.f2105b.get(aVar));
                if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.m39374n().isEmpty()) {
                    throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                }
            }
            try {
                lifecycleCamera.m39376k().m332I(c3Var);
                lifecycleCamera.m39377e(collection);
                if (m.getLifecycle().mo35843b().m35851a(Lifecycle.State.STARTED)) {
                    m39362h(m);
                }
            } catch (C14499e.C14500a e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public LifecycleCamera m39368b(LifecycleOwner lifecycleOwner, C14499e eVar) {
        boolean z;
        LifecycleCamera lifecycleCamera;
        synchronized (this.f2104a) {
            if (this.f2105b.get(AbstractC1973a.m39355a(lifecycleOwner, eVar.m313w())) == null) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37593b(z, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            if (lifecycleOwner.getLifecycle().mo35843b() != Lifecycle.State.DESTROYED) {
                lifecycleCamera = new LifecycleCamera(lifecycleOwner, eVar);
                if (eVar.m311y().isEmpty()) {
                    lifecycleCamera.m39372p();
                }
                m39363g(lifecycleCamera);
            } else {
                throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
            }
        }
        return lifecycleCamera;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public LifecycleCamera m39367c(LifecycleOwner lifecycleOwner, C14499e.C14501b bVar) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f2104a) {
            lifecycleCamera = this.f2105b.get(AbstractC1973a.m39355a(lifecycleOwner, bVar));
        }
        return lifecycleCamera;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Collection<LifecycleCamera> m39365e() {
        Collection<LifecycleCamera> unmodifiableCollection;
        synchronized (this.f2104a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.f2105b.values());
        }
        return unmodifiableCollection;
    }

    /* renamed from: h */
    void m39362h(LifecycleOwner lifecycleOwner) {
        synchronized (this.f2104a) {
            if (m39364f(lifecycleOwner)) {
                if (this.f2107d.isEmpty()) {
                    this.f2107d.push(lifecycleOwner);
                } else {
                    LifecycleOwner peek = this.f2107d.peek();
                    if (!lifecycleOwner.equals(peek)) {
                        m39360j(peek);
                        this.f2107d.remove(lifecycleOwner);
                        this.f2107d.push(lifecycleOwner);
                    }
                }
                m39357m(lifecycleOwner);
            }
        }
    }

    /* renamed from: i */
    void m39361i(LifecycleOwner lifecycleOwner) {
        synchronized (this.f2104a) {
            this.f2107d.remove(lifecycleOwner);
            m39360j(lifecycleOwner);
            if (!this.f2107d.isEmpty()) {
                m39357m(this.f2107d.peek());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m39359k() {
        synchronized (this.f2104a) {
            for (AbstractC1973a aVar : this.f2105b.keySet()) {
                LifecycleCamera lifecycleCamera = this.f2105b.get(aVar);
                lifecycleCamera.m39371q();
                m39361i(lifecycleCamera.m39375m());
            }
        }
    }

    /* renamed from: l */
    void m39358l(LifecycleOwner lifecycleOwner) {
        synchronized (this.f2104a) {
            LifecycleCameraRepositoryObserver d = m39366d(lifecycleOwner);
            if (d != null) {
                m39361i(lifecycleOwner);
                for (AbstractC1973a aVar : this.f2106c.get(d)) {
                    this.f2105b.remove(aVar);
                }
                this.f2106c.remove(d);
                d.m39356a().getLifecycle().mo35842c(d);
            }
        }
    }
}
