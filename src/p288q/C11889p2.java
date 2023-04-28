package p288q;

import android.hardware.camera2.CameraDevice;
import android.util.Size;
import androidx.arch.core.util.Function;
import androidx.camera.core.C1770a2;
import androidx.camera.core.C1813g1;
import androidx.camera.core.C1885m0;
import androidx.camera.core.C1915r1;
import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p120gc.AbstractFutureC7576b;
import p272p.C11502b;
import p374v.C13385k;
import p390w.AbstractC13587d2;
import p390w.AbstractC13615k;
import p390w.AbstractC13630l2;
import p390w.AbstractC13689w0;
import p390w.C13575b1;
import p390w.C13619k2;
import p390w.C13637m2;
import p390w.C13639n0;
import p410x.C13905a;
import p431y.AbstractC14179a;
import p431y.AbstractC14182c;
import p431y.C14183d;
import p431y.C14186f;

/* renamed from: q.p2 */
/* loaded from: classes.dex */
final class C11889p2 implements AbstractC11929u1 {

    /* renamed from: r */
    private static List<AbstractC13689w0> f26539r = new ArrayList();

    /* renamed from: s */
    private static int f26540s = 0;

    /* renamed from: a */
    private final AbstractC13630l2 f26541a;

    /* renamed from: b */
    private final C11872m0 f26542b;

    /* renamed from: c */
    final Executor f26543c;

    /* renamed from: d */
    private final ScheduledExecutorService f26544d;

    /* renamed from: g */
    private C13619k2 f26547g;

    /* renamed from: h */
    private C11810e1 f26548h;

    /* renamed from: i */
    private C13619k2 f26549i;

    /* renamed from: n */
    private final C11894e f26554n;

    /* renamed from: q */
    private int f26557q;

    /* renamed from: f */
    private List<AbstractC13689w0> f26546f = new ArrayList();

    /* renamed from: j */
    private boolean f26550j = false;

    /* renamed from: l */
    private volatile C13639n0 f26552l = null;

    /* renamed from: m */
    volatile boolean f26553m = false;

    /* renamed from: o */
    private C13385k f26555o = new C13385k.C13386a().m3779c();

    /* renamed from: p */
    private C13385k f26556p = new C13385k.C13386a().m3779c();

    /* renamed from: e */
    private final C11920t1 f26545e = new C11920t1();

    /* renamed from: k */
    private EnumC11893d f26551k = EnumC11893d.UNINITIALIZED;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.p2$a */
    /* loaded from: classes.dex */
    public class C11890a implements AbstractC14182c<Void> {
        C11890a() {
        }

        /* renamed from: b */
        public void mo1412a(Void r1) {
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            C1915r1.m39524d("ProcessingCaptureSession", "open session failed ", th2);
            C11889p2.this.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.p2$b */
    /* loaded from: classes.dex */
    public class C11891b implements AbstractC13630l2.AbstractC13631a {

        /* renamed from: a */
        final /* synthetic */ C13639n0 f26559a;

        C11891b(C13639n0 n0Var) {
            this.f26559a = n0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.p2$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11892c {

        /* renamed from: a */
        static final /* synthetic */ int[] f26561a;

        static {
            int[] iArr = new int[EnumC11893d.values().length];
            f26561a = iArr;
            try {
                iArr[EnumC11893d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26561a[EnumC11893d.SESSION_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26561a[EnumC11893d.ON_CAPTURE_SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26561a[EnumC11893d.ON_CAPTURE_SESSION_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26561a[EnumC11893d.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q.p2$d */
    /* loaded from: classes.dex */
    public enum EnumC11893d {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        CLOSED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q.p2$e */
    /* loaded from: classes.dex */
    public static class C11894e implements AbstractC13630l2.AbstractC13631a {

        /* renamed from: a */
        private List<AbstractC13615k> f26568a = Collections.emptyList();

        /* renamed from: b */
        private final Executor f26569b;

        C11894e(Executor executor) {
            this.f26569b = executor;
        }

        /* renamed from: a */
        public void m8384a(List<AbstractC13615k> list) {
            this.f26568a = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11889p2(AbstractC13630l2 l2Var, C11872m0 m0Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f26557q = 0;
        this.f26541a = l2Var;
        this.f26542b = m0Var;
        this.f26543c = executor;
        this.f26544d = scheduledExecutorService;
        this.f26554n = new C11894e(executor);
        int i = f26540s;
        f26540s = i + 1;
        this.f26557q = i;
        C1915r1.m39527a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f26557q + ")");
    }

    /* renamed from: l */
    private static void m8394l(List<C13639n0> list) {
        for (C13639n0 n0Var : list) {
            for (AbstractC13615k kVar : n0Var.m3150b()) {
                kVar.mo3172a();
            }
        }
    }

    /* renamed from: m */
    private static List<C13637m2> m8393m(List<AbstractC13689w0> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC13689w0 w0Var : list) {
            C2517g.m37593b(w0Var instanceof C13637m2, "Surface must be SessionProcessorSurface");
            arrayList.add((C13637m2) w0Var);
        }
        return arrayList;
    }

    /* renamed from: n */
    private boolean m8392n(List<C13639n0> list) {
        if (list.isEmpty()) {
            return false;
        }
        for (C13639n0 n0Var : list) {
            if (n0Var.m3146f() != 2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m8391o() {
        C13575b1.m3325e(this.f26546f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ void m8390p(AbstractC13689w0 w0Var) {
        f26539r.remove(w0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ AbstractFutureC7576b m8389q(C13619k2 k2Var, CameraDevice cameraDevice, C11798c3 c3Var, List list) {
        C1915r1.m39527a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f26557q + ")");
        if (this.f26551k == EnumC11893d.CLOSED) {
            return C14186f.m1423f(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        AbstractC13587d2 d2Var = null;
        if (list.contains(null)) {
            return C14186f.m1423f(new AbstractC13689w0.C13690a("Surface closed", k2Var.m3199i().get(list.indexOf(null))));
        }
        try {
            C13575b1.m3324f(this.f26546f);
            AbstractC13587d2 d2Var2 = null;
            AbstractC13587d2 d2Var3 = null;
            for (int i = 0; i < k2Var.m3199i().size(); i++) {
                AbstractC13689w0 w0Var = k2Var.m3199i().get(i);
                if (Objects.equals(w0Var.m3021e(), C1770a2.class)) {
                    d2Var = AbstractC13587d2.m3302a(w0Var.m3018h().get(), new Size(w0Var.m3020f().getWidth(), w0Var.m3020f().getHeight()), w0Var.m3019g());
                } else if (Objects.equals(w0Var.m3021e(), C1813g1.class)) {
                    d2Var2 = AbstractC13587d2.m3302a(w0Var.m3018h().get(), new Size(w0Var.m3020f().getWidth(), w0Var.m3020f().getHeight()), w0Var.m3019g());
                } else if (Objects.equals(w0Var.m3021e(), C1885m0.class)) {
                    d2Var3 = AbstractC13587d2.m3302a(w0Var.m3018h().get(), new Size(w0Var.m3020f().getWidth(), w0Var.m3020f().getHeight()), w0Var.m3019g());
                }
            }
            this.f26551k = EnumC11893d.SESSION_INITIALIZED;
            C1915r1.m39517k("ProcessingCaptureSession", "== initSession (id=" + this.f26557q + ")");
            C13619k2 e = this.f26541a.mo3163e(this.f26542b, d2Var, d2Var2, d2Var3);
            this.f26549i = e;
            e.m3199i().get(0).m3017i().mo1409a(new Runnable() { // from class: q.n2
                @Override // java.lang.Runnable
                public final void run() {
                    C11889p2.this.m8391o();
                }
            }, C13905a.m2339a());
            for (final AbstractC13689w0 w0Var2 : this.f26549i.m3199i()) {
                f26539r.add(w0Var2);
                w0Var2.m3017i().mo1409a(new Runnable() { // from class: q.o2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11889p2.m8390p(AbstractC13689w0.this);
                    }
                }, this.f26543c);
            }
            C13619k2.C13625f fVar = new C13619k2.C13625f();
            fVar.m3177a(k2Var);
            fVar.m3175c();
            fVar.m3177a(this.f26549i);
            C2517g.m37593b(fVar.m3174d(), "Cannot transform the SessionConfig");
            AbstractFutureC7576b<Void> b = this.f26545e.mo8288b(fVar.m3176b(), (CameraDevice) C2517g.m37588g(cameraDevice), c3Var);
            C14186f.m1427b(b, new C11890a(), this.f26543c);
            return b;
        } catch (AbstractC13689w0.C13690a e2) {
            return C14186f.m1423f(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Void m8388r(Void r1) {
        m8387s(this.f26545e);
        return null;
    }

    /* renamed from: t */
    private void m8386t(C13385k kVar, C13385k kVar2) {
        C11502b.C11503a aVar = new C11502b.C11503a();
        aVar.m9554c(kVar);
        aVar.m9554c(kVar2);
        this.f26541a.mo3161g(aVar.m9555b());
    }

    @Override // p288q.AbstractC11929u1
    /* renamed from: a */
    public void mo8289a(List<C13639n0> list) {
        if (!list.isEmpty()) {
            if (list.size() > 1 || !m8392n(list)) {
                m8394l(list);
            } else if (this.f26552l != null || this.f26553m) {
                m8394l(list);
            } else {
                C13639n0 n0Var = list.get(0);
                C1915r1.m39527a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f26557q + ") + state =" + this.f26551k);
                int i = C11892c.f26561a[this.f26551k.ordinal()];
                if (i == 1 || i == 2) {
                    this.f26552l = n0Var;
                } else if (i == 3) {
                    this.f26553m = true;
                    C13385k c = C13385k.C13386a.m3778e(n0Var.m3149c()).m3779c();
                    this.f26556p = c;
                    m8386t(this.f26555o, c);
                    this.f26541a.mo3164d(new C11891b(n0Var));
                } else if (i == 4 || i == 5) {
                    C1915r1.m39527a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f26551k);
                    m8394l(list);
                }
            }
        }
    }

    @Override // p288q.AbstractC11929u1
    /* renamed from: b */
    public AbstractFutureC7576b<Void> mo8288b(final C13619k2 k2Var, final CameraDevice cameraDevice, final C11798c3 c3Var) {
        boolean z;
        if (this.f26551k == EnumC11893d.UNINITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37593b(z, "Invalid state state:" + this.f26551k);
        C2517g.m37593b(k2Var.m3199i().isEmpty() ^ true, "SessionConfig contains no surfaces");
        C1915r1.m39527a("ProcessingCaptureSession", "open (id=" + this.f26557q + ")");
        List<AbstractC13689w0> i = k2Var.m3199i();
        this.f26546f = i;
        return C14183d.m1433b(C13575b1.m3319k(i, false, 5000L, this.f26543c, this.f26544d)).m1429f(new AbstractC14179a() { // from class: q.l2
            @Override // p431y.AbstractC14179a
            public final AbstractFutureC7576b apply(Object obj) {
                AbstractFutureC7576b q;
                q = C11889p2.this.m8389q(k2Var, cameraDevice, c3Var, (List) obj);
                return q;
            }
        }, this.f26543c).m1430e(new Function() { // from class: q.m2
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                Void r;
                r = C11889p2.this.m8388r((Void) obj);
                return r;
            }
        }, this.f26543c);
    }

    @Override // p288q.AbstractC11929u1
    /* renamed from: c */
    public void mo8287c() {
        C1915r1.m39527a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f26557q + ")");
        if (this.f26552l != null) {
            for (AbstractC13615k kVar : this.f26552l.m3150b()) {
                kVar.mo3172a();
            }
            this.f26552l = null;
        }
    }

    @Override // p288q.AbstractC11929u1
    public void close() {
        C1915r1.m39527a("ProcessingCaptureSession", "close (id=" + this.f26557q + ") state=" + this.f26551k);
        int i = C11892c.f26561a[this.f26551k.ordinal()];
        if (i != 2) {
            if (i == 3) {
                this.f26541a.mo3167a();
                C11810e1 e1Var = this.f26548h;
                if (e1Var != null) {
                    e1Var.m8595a();
                }
                this.f26551k = EnumC11893d.ON_CAPTURE_SESSION_ENDED;
            } else if (i != 4) {
                if (i == 5) {
                    return;
                }
                this.f26551k = EnumC11893d.CLOSED;
                this.f26545e.close();
            }
        }
        this.f26541a.mo3166b();
        this.f26551k = EnumC11893d.CLOSED;
        this.f26545e.close();
    }

    @Override // p288q.AbstractC11929u1
    /* renamed from: d */
    public void mo8286d(C13619k2 k2Var) {
        C1915r1.m39527a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f26557q + ")");
        this.f26547g = k2Var;
        if (k2Var != null) {
            this.f26554n.m8384a(k2Var.m3203e());
            if (this.f26551k == EnumC11893d.ON_CAPTURE_SESSION_STARTED) {
                C13385k c = C13385k.C13386a.m3778e(k2Var.m3204d()).m3779c();
                this.f26555o = c;
                m8386t(c, this.f26556p);
                if (!this.f26550j) {
                    this.f26541a.mo3162f(this.f26554n);
                    this.f26550j = true;
                }
            }
        }
    }

    @Override // p288q.AbstractC11929u1
    /* renamed from: e */
    public AbstractFutureC7576b<Void> mo8285e(boolean z) {
        boolean z2;
        if (this.f26551k == EnumC11893d.CLOSED) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2517g.m37585j(z2, "release() can only be called in CLOSED state");
        C1915r1.m39527a("ProcessingCaptureSession", "release (id=" + this.f26557q + ")");
        return this.f26545e.mo8285e(z);
    }

    @Override // p288q.AbstractC11929u1
    /* renamed from: f */
    public List<C13639n0> mo8284f() {
        if (this.f26552l != null) {
            return Arrays.asList(this.f26552l);
        }
        return Collections.emptyList();
    }

    @Override // p288q.AbstractC11929u1
    /* renamed from: g */
    public C13619k2 mo8283g() {
        return this.f26547g;
    }

    /* renamed from: s */
    void m8387s(C11920t1 t1Var) {
        boolean z;
        if (this.f26551k == EnumC11893d.SESSION_INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37593b(z, "Invalid state state:" + this.f26551k);
        C11810e1 e1Var = new C11810e1(t1Var, m8393m(this.f26549i.m3199i()));
        this.f26548h = e1Var;
        this.f26541a.mo3165c(e1Var);
        this.f26551k = EnumC11893d.ON_CAPTURE_SESSION_STARTED;
        C13619k2 k2Var = this.f26547g;
        if (k2Var != null) {
            mo8286d(k2Var);
        }
        if (this.f26552l != null) {
            List<C13639n0> asList = Arrays.asList(this.f26552l);
            this.f26552l = null;
            mo8289a(asList);
        }
    }
}
