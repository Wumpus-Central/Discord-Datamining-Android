package p288q;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.arch.core.util.Function;
import androidx.camera.core.C1872j1;
import androidx.camera.core.C1915r1;
import androidx.concurrent.futures.C2114c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p120gc.AbstractFutureC7576b;
import p272p.C11502b;
import p288q.C11901r0;
import p288q.C11935w;
import p308r.C12267f0;
import p355u.C13170j;
import p355u.C13175o;
import p390w.AbstractC13615k;
import p390w.AbstractC13672t;
import p390w.C13600g2;
import p390w.C13632m;
import p390w.C13639n0;
import p390w.EnumC13638n;
import p390w.EnumC13644o;
import p390w.EnumC13650p;
import p390w.EnumC13655q;
import p410x.C13905a;
import p431y.AbstractC14179a;
import p431y.C14183d;
import p431y.C14186f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q.r0 */
/* loaded from: classes.dex */
public class C11901r0 {

    /* renamed from: a */
    private final C11935w f26598a;

    /* renamed from: b */
    private final C13175o f26599b;

    /* renamed from: c */
    private final C13600g2 f26600c;

    /* renamed from: d */
    private final Executor f26601d;

    /* renamed from: e */
    private final boolean f26602e;

    /* renamed from: f */
    private int f26603f = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.r0$a */
    /* loaded from: classes.dex */
    public static class C11902a implements AbstractC11907d {

        /* renamed from: a */
        private final C11935w f26604a;

        /* renamed from: b */
        private final C13170j f26605b;

        /* renamed from: c */
        private final int f26606c;

        /* renamed from: d */
        private boolean f26607d = false;

        C11902a(C11935w wVar, int i, C13170j jVar) {
            this.f26604a = wVar;
            this.f26606c = i;
            this.f26605b = jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ Object m8337f(C2114c.C2115a aVar) {
            this.f26604a.m8229z().m8574K(aVar);
            this.f26605b.m4426b();
            return "AePreCapture";
        }

        @Override // p288q.C11901r0.AbstractC11907d
        /* renamed from: a */
        public AbstractFutureC7576b<Boolean> mo8311a(TotalCaptureResult totalCaptureResult) {
            if (!C11901r0.m8343a(this.f26606c, totalCaptureResult)) {
                return C14186f.m1421h(Boolean.FALSE);
            }
            C1915r1.m39527a("Camera2CapturePipeline", "Trigger AE");
            this.f26607d = true;
            return C14183d.m1433b(C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: q.p0
                @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                /* renamed from: a */
                public final Object mo1403a(C2114c.C2115a aVar) {
                    Object f;
                    f = C11901r0.C11902a.this.m8337f(aVar);
                    return f;
                }
            })).m1430e(new Function() { // from class: q.q0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    Boolean bool;
                    Void r1 = (Void) obj;
                    bool = Boolean.TRUE;
                    return bool;
                }
            }, C13905a.m2339a());
        }

        @Override // p288q.C11901r0.AbstractC11907d
        /* renamed from: b */
        public boolean mo8310b() {
            return this.f26606c == 0;
        }

        @Override // p288q.C11901r0.AbstractC11907d
        /* renamed from: c */
        public void mo8309c() {
            if (this.f26607d) {
                C1915r1.m39527a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f26604a.m8229z().m8565h(false, true);
                this.f26605b.m4427a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.r0$b */
    /* loaded from: classes.dex */
    public static class C11903b implements AbstractC11907d {

        /* renamed from: a */
        private final C11935w f26608a;

        /* renamed from: b */
        private boolean f26609b = false;

        C11903b(C11935w wVar) {
            this.f26608a = wVar;
        }

        @Override // p288q.C11901r0.AbstractC11907d
        /* renamed from: a */
        public AbstractFutureC7576b<Boolean> mo8311a(TotalCaptureResult totalCaptureResult) {
            AbstractFutureC7576b<Boolean> h = C14186f.m1421h(Boolean.TRUE);
            if (totalCaptureResult == null) {
                return h;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
            if (num == null) {
                return h;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                C1915r1.m39527a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C1915r1.m39527a("Camera2CapturePipeline", "Trigger AF");
                    this.f26609b = true;
                    this.f26608a.m8229z().m8573L(null, false);
                }
            }
            return h;
        }

        @Override // p288q.C11901r0.AbstractC11907d
        /* renamed from: b */
        public boolean mo8310b() {
            return true;
        }

        @Override // p288q.C11901r0.AbstractC11907d
        /* renamed from: c */
        public void mo8309c() {
            if (this.f26609b) {
                C1915r1.m39527a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f26608a.m8229z().m8565h(true, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.r0$c */
    /* loaded from: classes.dex */
    public static class C11904c {

        /* renamed from: i */
        private static final long f26610i;

        /* renamed from: j */
        private static final long f26611j;

        /* renamed from: a */
        private final int f26612a;

        /* renamed from: b */
        private final Executor f26613b;

        /* renamed from: c */
        private final C11935w f26614c;

        /* renamed from: d */
        private final C13170j f26615d;

        /* renamed from: e */
        private final boolean f26616e;

        /* renamed from: f */
        private long f26617f = f26610i;

        /* renamed from: g */
        final List<AbstractC11907d> f26618g = new ArrayList();

        /* renamed from: h */
        private final AbstractC11907d f26619h = new C11905a();

        /* renamed from: q.r0$c$a */
        /* loaded from: classes.dex */
        class C11905a implements AbstractC11907d {
            C11905a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public static /* synthetic */ Boolean m8315e(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override // p288q.C11901r0.AbstractC11907d
            /* renamed from: a */
            public AbstractFutureC7576b<Boolean> mo8311a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                for (AbstractC11907d dVar : C11904c.this.f26618g) {
                    arrayList.add(dVar.mo8311a(totalCaptureResult));
                }
                return C14186f.m1414o(C14186f.m1426c(arrayList), new Function() { // from class: q.y0
                    @Override // androidx.arch.core.util.Function
                    public final Object apply(Object obj) {
                        Boolean e;
                        e = C11901r0.C11904c.C11905a.m8315e((List) obj);
                        return e;
                    }
                }, C13905a.m2339a());
            }

            @Override // p288q.C11901r0.AbstractC11907d
            /* renamed from: b */
            public boolean mo8310b() {
                for (AbstractC11907d dVar : C11904c.this.f26618g) {
                    if (dVar.mo8310b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // p288q.C11901r0.AbstractC11907d
            /* renamed from: c */
            public void mo8309c() {
                for (AbstractC11907d dVar : C11904c.this.f26618g) {
                    dVar.mo8309c();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q.r0$c$b */
        /* loaded from: classes.dex */
        public class C11906b extends AbstractC13615k {

            /* renamed from: a */
            final /* synthetic */ C2114c.C2115a f26621a;

            C11906b(C2114c.C2115a aVar) {
                this.f26621a = aVar;
            }

            @Override // p390w.AbstractC13615k
            /* renamed from: a */
            public void mo3172a() {
                this.f26621a.m38958f(new C1872j1(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // p390w.AbstractC13615k
            /* renamed from: b */
            public void mo3171b(AbstractC13672t tVar) {
                this.f26621a.m38961c(null);
            }

            @Override // p390w.AbstractC13615k
            /* renamed from: c */
            public void mo3170c(C13632m mVar) {
                this.f26621a.m38958f(new C1872j1(2, "Capture request failed with reason " + mVar.m3160a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f26610i = timeUnit.toNanos(1L);
            f26611j = timeUnit.toNanos(5L);
        }

        C11904c(int i, Executor executor, C11935w wVar, boolean z, C13170j jVar) {
            this.f26612a = i;
            this.f26613b = executor;
            this.f26614c = wVar;
            this.f26616e = z;
            this.f26615d = jVar;
        }

        /* renamed from: h */
        private void m8328h(C13639n0.C13640a aVar) {
            C11502b.C11503a aVar2 = new C11502b.C11503a();
            aVar2.m9553e(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.m3140e(aVar2.m9555b());
        }

        /* renamed from: i */
        private void m8327i(C13639n0.C13640a aVar, C13639n0 n0Var) {
            int i;
            if (this.f26612a == 3 && !this.f26616e) {
                i = 4;
            } else if (n0Var.m3146f() == -1) {
                i = 2;
            } else {
                i = -1;
            }
            if (i != -1) {
                aVar.m3130o(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public boolean m8325k(TotalCaptureResult totalCaptureResult) {
            boolean z;
            boolean z2;
            boolean z3;
            if (totalCaptureResult == null) {
                return false;
            }
            C11824h hVar = new C11824h(totalCaptureResult);
            if (hVar.m8591f() == EnumC13644o.OFF || hVar.m8591f() == EnumC13644o.UNKNOWN || hVar.m8590g() == EnumC13650p.PASSIVE_FOCUSED || hVar.m8590g() == EnumC13650p.PASSIVE_NOT_FOCUSED || hVar.m8590g() == EnumC13650p.LOCKED_FOCUSED || hVar.m8590g() == EnumC13650p.LOCKED_NOT_FOCUSED) {
                z = true;
            } else {
                z = false;
            }
            if (hVar.m8592e() == EnumC13638n.CONVERGED || hVar.m8592e() == EnumC13638n.FLASH_REQUIRED || hVar.m8592e() == EnumC13638n.UNKNOWN) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (hVar.m8589h() == EnumC13655q.CONVERGED || hVar.m8589h() == EnumC13655q.UNKNOWN) {
                z3 = true;
            } else {
                z3 = false;
            }
            C1915r1.m39527a("Camera2CapturePipeline", "checkCaptureResult, AE=" + hVar.m8592e() + " AF =" + hVar.m8590g() + " AWB=" + hVar.m8589h());
            if (!z || !z2 || !z3) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ AbstractFutureC7576b m8324l(int i, TotalCaptureResult totalCaptureResult) {
            if (C11901r0.m8343a(i, totalCaptureResult)) {
                m8319q(f26611j);
            }
            return this.f26619h.mo8311a(totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ AbstractFutureC7576b m8323m(Boolean bool) {
            if (bool.booleanValue()) {
                return m8317s(this.f26617f, new C11908e.AbstractC11909a() { // from class: q.x0
                    @Override // p288q.C11901r0.C11908e.AbstractC11909a
                    /* renamed from: a */
                    public final boolean mo8200a(TotalCaptureResult totalCaptureResult) {
                        boolean k;
                        k = C11901r0.C11904c.this.m8325k(totalCaptureResult);
                        return k;
                    }
                });
            }
            return C14186f.m1421h(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ AbstractFutureC7576b m8322n(List list, int i, TotalCaptureResult totalCaptureResult) {
            return m8318r(list, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m8321o() {
            this.f26619h.mo8309c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ Object m8320p(C13639n0.C13640a aVar, C2114c.C2115a aVar2) {
            aVar.m3142c(new C11906b(aVar2));
            return "submitStillCapture";
        }

        /* renamed from: q */
        private void m8319q(long j) {
            this.f26617f = j;
        }

        /* renamed from: s */
        private AbstractFutureC7576b<TotalCaptureResult> m8317s(long j, C11908e.AbstractC11909a aVar) {
            C11908e eVar = new C11908e(j, aVar);
            this.f26614c.m8235t(eVar);
            return eVar.m8313c();
        }

        /* renamed from: g */
        void m8329g(AbstractC11907d dVar) {
            this.f26618g.add(dVar);
        }

        /* renamed from: j */
        AbstractFutureC7576b<List<Void>> m8326j(final List<C13639n0> list, final int i) {
            AbstractFutureC7576b<TotalCaptureResult> bVar;
            AbstractFutureC7576b h = C14186f.m1421h(null);
            if (!this.f26618g.isEmpty()) {
                if (this.f26619h.mo8310b()) {
                    bVar = m8317s(0L, null);
                } else {
                    bVar = C14186f.m1421h(null);
                }
                h = C14183d.m1433b(bVar).m1429f(new AbstractC14179a() { // from class: q.s0
                    @Override // p431y.AbstractC14179a
                    public final AbstractFutureC7576b apply(Object obj) {
                        AbstractFutureC7576b l;
                        l = C11901r0.C11904c.this.m8324l(i, (TotalCaptureResult) obj);
                        return l;
                    }
                }, this.f26613b).m1429f(new AbstractC14179a() { // from class: q.t0
                    @Override // p431y.AbstractC14179a
                    public final AbstractFutureC7576b apply(Object obj) {
                        AbstractFutureC7576b m;
                        m = C11901r0.C11904c.this.m8323m((Boolean) obj);
                        return m;
                    }
                }, this.f26613b);
            }
            C14183d f = C14183d.m1433b(h).m1429f(new AbstractC14179a() { // from class: q.u0
                @Override // p431y.AbstractC14179a
                public final AbstractFutureC7576b apply(Object obj) {
                    AbstractFutureC7576b n;
                    n = C11901r0.C11904c.this.m8322n(list, i, (TotalCaptureResult) obj);
                    return n;
                }
            }, this.f26613b);
            f.mo1409a(new Runnable() { // from class: q.v0
                @Override // java.lang.Runnable
                public final void run() {
                    C11901r0.C11904c.this.m8321o();
                }
            }, this.f26613b);
            return f;
        }

        /* renamed from: r */
        AbstractFutureC7576b<List<Void>> m8318r(List<C13639n0> list, int i) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C13639n0 n0Var : list) {
                final C13639n0.C13640a k = C13639n0.C13640a.m3134k(n0Var);
                m8327i(k, n0Var);
                if (this.f26615d.m4425c(i)) {
                    m8328h(k);
                }
                arrayList.add(C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: q.w0
                    @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                    /* renamed from: a */
                    public final Object mo1403a(C2114c.C2115a aVar) {
                        Object p;
                        p = C11901r0.C11904c.this.m8320p(k, aVar);
                        return p;
                    }
                }));
                arrayList2.add(k.m3137h());
            }
            this.f26614c.m8250g0(arrayList2);
            return C14186f.m1426c(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.r0$d */
    /* loaded from: classes.dex */
    public interface AbstractC11907d {
        /* renamed from: a */
        AbstractFutureC7576b<Boolean> mo8311a(TotalCaptureResult totalCaptureResult);

        /* renamed from: b */
        boolean mo8310b();

        /* renamed from: c */
        void mo8309c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.r0$e */
    /* loaded from: classes.dex */
    public static class C11908e implements C11935w.AbstractC11938c {

        /* renamed from: a */
        private C2114c.C2115a<TotalCaptureResult> f26623a;

        /* renamed from: c */
        private final long f26625c;

        /* renamed from: d */
        private final AbstractC11909a f26626d;

        /* renamed from: b */
        private final AbstractFutureC7576b<TotalCaptureResult> f26624b = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: q.z0
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object d;
                d = C11901r0.C11908e.this.m8312d(aVar);
                return d;
            }
        });

        /* renamed from: e */
        private volatile Long f26627e = null;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q.r0$e$a */
        /* loaded from: classes.dex */
        public interface AbstractC11909a {
            /* renamed from: a */
            boolean mo8200a(TotalCaptureResult totalCaptureResult);
        }

        C11908e(long j, AbstractC11909a aVar) {
            this.f26625c = j;
            this.f26626d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ Object m8312d(C2114c.C2115a aVar) {
            this.f26623a = aVar;
            return "waitFor3AResult";
        }

        @Override // p288q.C11935w.AbstractC11938c
        /* renamed from: a */
        public boolean mo3810a(TotalCaptureResult totalCaptureResult) {
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && this.f26627e == null) {
                this.f26627e = l;
            }
            Long l2 = this.f26627e;
            if (0 == this.f26625c || l2 == null || l == null || l.longValue() - l2.longValue() <= this.f26625c) {
                AbstractC11909a aVar = this.f26626d;
                if (aVar != null && !aVar.mo8200a(totalCaptureResult)) {
                    return false;
                }
                this.f26623a.m38961c(totalCaptureResult);
                return true;
            }
            this.f26623a.m38961c(null);
            C1915r1.m39527a("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l + " first: " + l2);
            return true;
        }

        /* renamed from: c */
        public AbstractFutureC7576b<TotalCaptureResult> m8313c() {
            return this.f26624b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.r0$f */
    /* loaded from: classes.dex */
    public static class C11910f implements AbstractC11907d {

        /* renamed from: a */
        private final C11935w f26628a;

        /* renamed from: b */
        private final int f26629b;

        /* renamed from: c */
        private boolean f26630c = false;

        C11910f(C11935w wVar, int i) {
            this.f26628a = wVar;
            this.f26629b = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ Object m8306f(C2114c.C2115a aVar) {
            this.f26628a.m8274I().m8540g(aVar, true);
            return "TorchOn";
        }

        @Override // p288q.C11901r0.AbstractC11907d
        /* renamed from: a */
        public AbstractFutureC7576b<Boolean> mo8311a(TotalCaptureResult totalCaptureResult) {
            if (C11901r0.m8343a(this.f26629b, totalCaptureResult)) {
                if (this.f26628a.m8267P()) {
                    C1915r1.m39527a("Camera2CapturePipeline", "Torch already on, not turn on");
                } else {
                    C1915r1.m39527a("Camera2CapturePipeline", "Turn on torch");
                    this.f26630c = true;
                    return C14183d.m1433b(C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: q.a1
                        @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                        /* renamed from: a */
                        public final Object mo1403a(C2114c.C2115a aVar) {
                            Object f;
                            f = C11901r0.C11910f.this.m8306f(aVar);
                            return f;
                        }
                    })).m1430e(new Function() { // from class: q.b1
                        @Override // androidx.arch.core.util.Function
                        public final Object apply(Object obj) {
                            Boolean bool;
                            Void r1 = (Void) obj;
                            bool = Boolean.TRUE;
                            return bool;
                        }
                    }, C13905a.m2339a());
                }
            }
            return C14186f.m1421h(Boolean.FALSE);
        }

        @Override // p288q.C11901r0.AbstractC11907d
        /* renamed from: b */
        public boolean mo8310b() {
            return this.f26629b == 0;
        }

        @Override // p288q.C11901r0.AbstractC11907d
        /* renamed from: c */
        public void mo8309c() {
            if (this.f26630c) {
                this.f26628a.m8274I().m8540g(null, false);
                C1915r1.m39527a("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11901r0(C11935w wVar, C12267f0 f0Var, C13600g2 g2Var, Executor executor) {
        boolean z = true;
        this.f26598a = wVar;
        Integer num = (Integer) f0Var.m7252a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f26602e = (num == null || num.intValue() != 2) ? false : z;
        this.f26601d = executor;
        this.f26600c = g2Var;
        this.f26599b = new C13175o(g2Var);
    }

    /* renamed from: a */
    static boolean m8343a(int i, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (i == 0) {
            if (totalCaptureResult != null) {
                num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            } else {
                num = null;
            }
            if (num == null || num.intValue() != 4) {
                return false;
            }
            return true;
        } else if (i == 1) {
            return true;
        } else {
            if (i == 2) {
                return false;
            }
            throw new AssertionError(i);
        }
    }

    /* renamed from: b */
    private boolean m8342b(int i) {
        return this.f26599b.m4420a() || this.f26603f == 3 || i == 1;
    }

    /* renamed from: c */
    public void m8341c(int i) {
        this.f26603f = i;
    }

    /* renamed from: d */
    public AbstractFutureC7576b<List<Void>> m8340d(List<C13639n0> list, int i, int i2, int i3) {
        C13170j jVar = new C13170j(this.f26600c);
        C11904c cVar = new C11904c(this.f26603f, this.f26601d, this.f26598a, this.f26602e, jVar);
        if (i == 0) {
            cVar.m8329g(new C11903b(this.f26598a));
        }
        if (m8342b(i3)) {
            cVar.m8329g(new C11910f(this.f26598a, i2));
        } else {
            cVar.m8329g(new C11902a(this.f26598a, i2, jVar));
        }
        return C14186f.m1419j(cVar.m8326j(list, i2));
    }
}
