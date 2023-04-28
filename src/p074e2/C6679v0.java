package p074e2;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p093f2.AbstractC7003b;
import p112g2.AbstractC7407h;
import p112g2.C7397d;

/* renamed from: e2.v0 */
/* loaded from: classes.dex */
public class C6679v0 implements AbstractC6611d0, AbstractC7003b.AbstractC7004a {

    /* renamed from: b */
    private AbstractC7003b f14170b;

    /* renamed from: c */
    private WeakReference<AbstractC6596a0> f14171c;

    /* renamed from: d */
    private List<C6607c> f14172d;

    /* renamed from: e */
    private AtomicBoolean f14173e;

    /* renamed from: f */
    private boolean f14174f;

    /* renamed from: g */
    private Context f14175g;

    /* renamed from: a */
    private AbstractC7407h f14169a = new C7397d("PackageHandler");

    /* renamed from: h */
    private AbstractC6608c0 f14176h = C6639l.m24863j();

    /* renamed from: i */
    private EnumC6687w f14177i = C6639l.m24860m();

    /* renamed from: j */
    private EnumC6687w f14178j = C6639l.m24864i();

    /* renamed from: e2.v0$a */
    /* loaded from: classes.dex */
    class RunnableC6680a implements Runnable {
        RunnableC6680a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6679v0.this.m24689u();
        }
    }

    /* renamed from: e2.v0$b */
    /* loaded from: classes.dex */
    class RunnableC6681b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6607c f14180k;

        RunnableC6681b(C6607c cVar) {
            this.f14180k = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6679v0.this.m24694p(this.f14180k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.v0$c */
    /* loaded from: classes.dex */
    public class RunnableC6682c implements Runnable {
        RunnableC6682c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6679v0.this.m24687w();
        }
    }

    /* renamed from: e2.v0$d */
    /* loaded from: classes.dex */
    class RunnableC6683d implements Runnable {
        RunnableC6683d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6679v0.this.m24686x();
        }
    }

    /* renamed from: e2.v0$e */
    /* loaded from: classes.dex */
    class RunnableC6684e implements Runnable {
        RunnableC6684e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6679v0.this.f14176h.mo24880g("Package handler can send", new Object[0]);
            C6679v0.this.f14173e.set(false);
            C6679v0.this.mo24703g();
        }
    }

    /* renamed from: e2.v0$f */
    /* loaded from: classes.dex */
    class RunnableC6685f implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6609c1 f14185k;

        RunnableC6685f(C6609c1 c1Var) {
            this.f14185k = c1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6679v0.this.m24685y(this.f14185k);
        }
    }

    /* renamed from: e2.v0$g */
    /* loaded from: classes.dex */
    class RunnableC6686g implements Runnable {
        RunnableC6686g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6679v0.this.m24691s();
        }
    }

    public C6679v0(AbstractC6596a0 a0Var, Context context, boolean z, AbstractC7003b bVar) {
        mo24705d(a0Var, context, z, bVar);
        this.f14169a.submit(new RunnableC6680a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m24694p(C6607c cVar) {
        this.f14172d.add(cVar);
        this.f14176h.mo24884c("Added package %d (%s)", Integer.valueOf(this.f14172d.size()), cVar);
        this.f14176h.mo24880g("%s", cVar.m25122g());
        m24684z();
    }

    /* renamed from: q */
    public static Boolean m24693q(Context context) {
        return Boolean.valueOf(context.deleteFile("AdjustIoPackageQueue"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static void m24692r(Context context) {
        m24693q(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m24691s() {
        this.f14172d.clear();
        m24684z();
    }

    /* renamed from: t */
    private Map<String, String> m24690t() {
        HashMap hashMap = new HashMap();
        C6668t0.m24755l(hashMap, "sent_at", C6629i1.f13989b.format(Long.valueOf(System.currentTimeMillis())));
        int size = this.f14172d.size() - 1;
        if (size > 0) {
            C6668t0.m24757j(hashMap, "queue_size", size);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m24689u() {
        this.f14173e = new AtomicBoolean();
        m24688v();
    }

    /* renamed from: v */
    private void m24688v() {
        try {
            this.f14172d = (List) C6629i1.m24922b0(this.f14175g, "AdjustIoPackageQueue", "Package queue", List.class);
        } catch (Exception e) {
            this.f14176h.mo24885b("Failed to read %s file (%s)", "Package queue", e.getMessage());
            this.f14172d = null;
        }
        List<C6607c> list = this.f14172d;
        if (list != null) {
            this.f14176h.mo24884c("Package handler read %d packages", Integer.valueOf(list.size()));
        } else {
            this.f14172d = new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m24687w() {
        if (!this.f14172d.isEmpty()) {
            if (this.f14174f) {
                this.f14176h.mo24884c("Package handler is paused", new Object[0]);
            } else if (this.f14173e.getAndSet(true)) {
                this.f14176h.mo24880g("Package handler is already sending", new Object[0]);
            } else {
                Map<String, String> t = m24690t();
                this.f14170b.mo23675b(this.f14172d.get(0), t, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m24686x() {
        if (!this.f14172d.isEmpty()) {
            this.f14172d.remove(0);
            m24684z();
            this.f14173e.set(false);
            this.f14176h.mo24880g("Package handler can send", new Object[0]);
            m24687w();
        }
    }

    /* renamed from: z */
    private void m24684z() {
        C6629i1.m24910h0(this.f14172d, this.f14175g, "AdjustIoPackageQueue", "Package queue");
        this.f14176h.mo24884c("Package handler wrote %d packages", Integer.valueOf(this.f14172d.size()));
    }

    @Override // p074e2.AbstractC6611d0
    /* renamed from: a */
    public void mo24708a() {
        this.f14176h.mo24880g("PackageHandler teardown", new Object[0]);
        AbstractC7407h hVar = this.f14169a;
        if (hVar != null) {
            hVar.mo22735a();
        }
        WeakReference<AbstractC6596a0> weakReference = this.f14171c;
        if (weakReference != null) {
            weakReference.clear();
        }
        List<C6607c> list = this.f14172d;
        if (list != null) {
            list.clear();
        }
        this.f14169a = null;
        this.f14171c = null;
        this.f14172d = null;
        this.f14173e = null;
        this.f14175g = null;
        this.f14176h = null;
        this.f14177i = null;
    }

    @Override // p074e2.AbstractC6611d0
    /* renamed from: b */
    public void mo24707b() {
        this.f14174f = true;
    }

    @Override // p074e2.AbstractC6611d0
    /* renamed from: c */
    public void mo24706c() {
        this.f14174f = false;
    }

    @Override // p074e2.AbstractC6611d0
    /* renamed from: d */
    public void mo24705d(AbstractC6596a0 a0Var, Context context, boolean z, AbstractC7003b bVar) {
        this.f14171c = new WeakReference<>(a0Var);
        this.f14175g = context;
        this.f14174f = !z;
        this.f14170b = bVar;
    }

    @Override // p074e2.AbstractC6611d0
    /* renamed from: e */
    public void mo24704e(C6609c1 c1Var) {
        C6609c1 c1Var2;
        if (c1Var != null) {
            c1Var2 = c1Var.m25102a();
        } else {
            c1Var2 = null;
        }
        this.f14169a.submit(new RunnableC6685f(c1Var2));
    }

    @Override // p093f2.AbstractC7003b.AbstractC7004a
    /* renamed from: f */
    public void mo23674f(C6697z0 z0Var) {
        long j;
        this.f14176h.mo24884c("Got response in PackageHandler", new Object[0]);
        AbstractC6596a0 a0Var = this.f14171c.get();
        if (a0Var != null && z0Var.f14247h == EnumC6618f1.OPTED_OUT) {
            a0Var.mo25172H();
        }
        if (!z0Var.f14241b) {
            this.f14169a.submit(new RunnableC6683d());
            if (a0Var != null) {
                a0Var.mo25171I(z0Var);
                return;
            }
            return;
        }
        if (a0Var != null) {
            a0Var.mo25171I(z0Var);
        }
        RunnableC6684e eVar = new RunnableC6684e();
        C6607c cVar = z0Var.f14252m;
        if (cVar == null) {
            eVar.run();
            return;
        }
        int r = cVar.m25111r();
        C6615e1 e1Var = new C6615e1(this.f14175g);
        if (z0Var.f14252m.m25128a() != EnumC6603b.SESSION || e1Var.m25049g()) {
            j = C6629i1.m24944H(r, this.f14177i);
        } else {
            j = C6629i1.m24944H(r, this.f14178j);
        }
        this.f14176h.mo24880g("Waiting for %s seconds before retrying the %d time", C6629i1.f13988a.format(j / 1000.0d), Integer.valueOf(r));
        this.f14169a.mo22734b(eVar, j);
    }

    @Override // p074e2.AbstractC6611d0
    public void flush() {
        this.f14169a.submit(new RunnableC6686g());
    }

    @Override // p074e2.AbstractC6611d0
    /* renamed from: g */
    public void mo24703g() {
        this.f14169a.submit(new RunnableC6682c());
    }

    @Override // p074e2.AbstractC6611d0
    /* renamed from: h */
    public void mo24702h(C6607c cVar) {
        this.f14169a.submit(new RunnableC6681b(cVar));
    }

    /* renamed from: y */
    public void m24685y(C6609c1 c1Var) {
        if (c1Var != null) {
            this.f14176h.mo24884c("Updating package handler queue", new Object[0]);
            this.f14176h.mo24880g("Session callback parameters: %s", c1Var.f13889a);
            this.f14176h.mo24880g("Session partner parameters: %s", c1Var.f13890b);
            for (C6607c cVar : this.f14172d) {
                Map<String, String> m = cVar.m25116m();
                C6668t0.m24756k(m, "callback_params", C6629i1.m24927Y(c1Var.f13889a, cVar.m25127b(), "Callback"));
                C6668t0.m24756k(m, "partner_params", C6629i1.m24927Y(c1Var.f13890b, cVar.m25115n(), "Partner"));
            }
            m24684z();
        }
    }
}
