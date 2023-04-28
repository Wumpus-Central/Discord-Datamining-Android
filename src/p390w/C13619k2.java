package p390w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.camera.core.C1915r1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p033c0.C3751c;
import p390w.C13639n0;

/* renamed from: w.k2 */
/* loaded from: classes.dex */
public final class C13619k2 {

    /* renamed from: a */
    private final List<AbstractC13689w0> f30426a;

    /* renamed from: b */
    private final List<CameraDevice.StateCallback> f30427b;

    /* renamed from: c */
    private final List<CameraCaptureSession.StateCallback> f30428c;

    /* renamed from: d */
    private final List<AbstractC13615k> f30429d;

    /* renamed from: e */
    private final List<AbstractC13622c> f30430e;

    /* renamed from: f */
    private final C13639n0 f30431f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w.k2$a */
    /* loaded from: classes.dex */
    public static class C13620a {

        /* renamed from: a */
        final Set<AbstractC13689w0> f30432a = new LinkedHashSet();

        /* renamed from: b */
        final C13639n0.C13640a f30433b = new C13639n0.C13640a();

        /* renamed from: c */
        final List<CameraDevice.StateCallback> f30434c = new ArrayList();

        /* renamed from: d */
        final List<CameraCaptureSession.StateCallback> f30435d = new ArrayList();

        /* renamed from: e */
        final List<AbstractC13622c> f30436e = new ArrayList();

        /* renamed from: f */
        final List<AbstractC13615k> f30437f = new ArrayList();

        C13620a() {
        }
    }

    /* renamed from: w.k2$b */
    /* loaded from: classes.dex */
    public static class C13621b extends C13620a {
        /* renamed from: o */
        public static C13621b m3183o(AbstractC13697x2<?> x2Var) {
            AbstractC13623d k = x2Var.mo2968k(null);
            if (k != null) {
                C13621b bVar = new C13621b();
                k.mo3178a(x2Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + x2Var.mo303m(x2Var.toString()));
        }

        /* renamed from: a */
        public void m3197a(Collection<CameraDevice.StateCallback> collection) {
            for (CameraDevice.StateCallback stateCallback : collection) {
                m3193e(stateCallback);
            }
        }

        /* renamed from: b */
        public void m3196b(Collection<AbstractC13615k> collection) {
            this.f30433b.m3144a(collection);
        }

        /* renamed from: c */
        public void m3195c(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                m3188j(stateCallback);
            }
        }

        /* renamed from: d */
        public void m3194d(AbstractC13615k kVar) {
            this.f30433b.m3142c(kVar);
            if (!this.f30437f.contains(kVar)) {
                this.f30437f.add(kVar);
            }
        }

        /* renamed from: e */
        public void m3193e(CameraDevice.StateCallback stateCallback) {
            if (!this.f30434c.contains(stateCallback)) {
                this.f30434c.add(stateCallback);
            }
        }

        /* renamed from: f */
        public void m3192f(AbstractC13622c cVar) {
            this.f30436e.add(cVar);
        }

        /* renamed from: g */
        public void m3191g(AbstractC13662r0 r0Var) {
            this.f30433b.m3140e(r0Var);
        }

        /* renamed from: h */
        public void m3190h(AbstractC13689w0 w0Var) {
            this.f30432a.add(w0Var);
        }

        /* renamed from: i */
        public void m3189i(AbstractC13615k kVar) {
            this.f30433b.m3142c(kVar);
        }

        /* renamed from: j */
        public void m3188j(CameraCaptureSession.StateCallback stateCallback) {
            if (!this.f30435d.contains(stateCallback)) {
                this.f30435d.add(stateCallback);
            }
        }

        /* renamed from: k */
        public void m3187k(AbstractC13689w0 w0Var) {
            this.f30432a.add(w0Var);
            this.f30433b.m3139f(w0Var);
        }

        /* renamed from: l */
        public void m3186l(String str, Object obj) {
            this.f30433b.m3138g(str, obj);
        }

        /* renamed from: m */
        public C13619k2 m3185m() {
            return new C13619k2(new ArrayList(this.f30432a), this.f30434c, this.f30435d, this.f30437f, this.f30436e, this.f30433b.m3137h());
        }

        /* renamed from: n */
        public void m3184n() {
            this.f30432a.clear();
            this.f30433b.m3136i();
        }

        /* renamed from: p */
        public List<AbstractC13615k> m3182p() {
            return Collections.unmodifiableList(this.f30437f);
        }

        /* renamed from: q */
        public void m3181q(AbstractC13662r0 r0Var) {
            this.f30433b.m3131n(r0Var);
        }

        /* renamed from: r */
        public void m3180r(int i) {
            this.f30433b.m3130o(i);
        }
    }

    /* renamed from: w.k2$c */
    /* loaded from: classes.dex */
    public interface AbstractC13622c {
        /* renamed from: a */
        void mo3179a(C13619k2 k2Var, EnumC13624e eVar);
    }

    /* renamed from: w.k2$d */
    /* loaded from: classes.dex */
    public interface AbstractC13623d {
        /* renamed from: a */
        void mo3178a(AbstractC13697x2<?> x2Var, C13621b bVar);
    }

    /* renamed from: w.k2$e */
    /* loaded from: classes.dex */
    public enum EnumC13624e {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* renamed from: w.k2$f */
    /* loaded from: classes.dex */
    public static final class C13625f extends C13620a {

        /* renamed from: j */
        private static final List<Integer> f30441j = Arrays.asList(1, 3);

        /* renamed from: g */
        private final C3751c f30442g = new C3751c();

        /* renamed from: h */
        private boolean f30443h = true;

        /* renamed from: i */
        private boolean f30444i = false;

        /* renamed from: e */
        private int m3173e(int i, int i2) {
            List<Integer> list = f30441j;
            if (list.indexOf(Integer.valueOf(i)) >= list.indexOf(Integer.valueOf(i2))) {
                return i;
            }
            return i2;
        }

        /* renamed from: a */
        public void m3177a(C13619k2 k2Var) {
            C13639n0 f = k2Var.m3202f();
            if (f.m3146f() != -1) {
                this.f30444i = true;
                this.f30433b.m3130o(m3173e(f.m3146f(), this.f30433b.m3132m()));
            }
            this.f30433b.m3143b(k2Var.m3202f().m3147e());
            this.f30434c.addAll(k2Var.m3206b());
            this.f30435d.addAll(k2Var.m3201g());
            this.f30433b.m3144a(k2Var.m3203e());
            this.f30437f.addAll(k2Var.m3200h());
            this.f30436e.addAll(k2Var.m3205c());
            this.f30432a.addAll(k2Var.m3199i());
            this.f30433b.m3133l().addAll(f.m3148d());
            if (!this.f30432a.containsAll(this.f30433b.m3133l())) {
                C1915r1.m39527a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f30443h = false;
            }
            this.f30433b.m3140e(f.m3149c());
        }

        /* renamed from: b */
        public C13619k2 m3176b() {
            if (this.f30443h) {
                ArrayList arrayList = new ArrayList(this.f30432a);
                this.f30442g.m33691d(arrayList);
                return new C13619k2(arrayList, this.f30434c, this.f30435d, this.f30437f, this.f30436e, this.f30433b.m3137h());
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }

        /* renamed from: c */
        public void m3175c() {
            this.f30432a.clear();
            this.f30433b.m3136i();
        }

        /* renamed from: d */
        public boolean m3174d() {
            return this.f30444i && this.f30443h;
        }
    }

    C13619k2(List<AbstractC13689w0> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<AbstractC13615k> list4, List<AbstractC13622c> list5, C13639n0 n0Var) {
        this.f30426a = list;
        this.f30427b = Collections.unmodifiableList(list2);
        this.f30428c = Collections.unmodifiableList(list3);
        this.f30429d = Collections.unmodifiableList(list4);
        this.f30430e = Collections.unmodifiableList(list5);
        this.f30431f = n0Var;
    }

    /* renamed from: a */
    public static C13619k2 m3207a() {
        return new C13619k2(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new C13639n0.C13640a().m3137h());
    }

    /* renamed from: b */
    public List<CameraDevice.StateCallback> m3206b() {
        return this.f30427b;
    }

    /* renamed from: c */
    public List<AbstractC13622c> m3205c() {
        return this.f30430e;
    }

    /* renamed from: d */
    public AbstractC13662r0 m3204d() {
        return this.f30431f.m3149c();
    }

    /* renamed from: e */
    public List<AbstractC13615k> m3203e() {
        return this.f30431f.m3150b();
    }

    /* renamed from: f */
    public C13639n0 m3202f() {
        return this.f30431f;
    }

    /* renamed from: g */
    public List<CameraCaptureSession.StateCallback> m3201g() {
        return this.f30428c;
    }

    /* renamed from: h */
    public List<AbstractC13615k> m3200h() {
        return this.f30429d;
    }

    /* renamed from: i */
    public List<AbstractC13689w0> m3199i() {
        return Collections.unmodifiableList(this.f30426a);
    }

    /* renamed from: j */
    public int m3198j() {
        return this.f30431f.m3146f();
    }
}
