package p074e2;

import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p093f2.AbstractC7003b;
import p112g2.AbstractC7407h;
import p112g2.C7397d;
import p112g2.C7410j;

/* renamed from: e2.u */
/* loaded from: classes.dex */
public class C6670u implements AbstractC6605b0, AbstractC7003b.AbstractC7004a {

    /* renamed from: a */
    private boolean f14152a;

    /* renamed from: b */
    private String f14153b;

    /* renamed from: c */
    private AbstractC7003b f14154c;

    /* renamed from: g */
    private WeakReference<AbstractC6596a0> f14158g;

    /* renamed from: d */
    private AbstractC6608c0 f14155d = C6639l.m24863j();

    /* renamed from: f */
    private AbstractC7407h f14157f = new C7397d("AttributionHandler");

    /* renamed from: e */
    private C7410j f14156e = new C7410j(new RunnableC6671a(), "Attribution timer");

    /* renamed from: e2.u$a */
    /* loaded from: classes.dex */
    class RunnableC6671a implements Runnable {
        RunnableC6671a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6670u.this.m24717y();
        }
    }

    /* renamed from: e2.u$b */
    /* loaded from: classes.dex */
    class RunnableC6672b implements Runnable {
        RunnableC6672b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6670u.this.f14153b = "sdk";
            C6670u.this.m24718x(0L);
        }
    }

    /* renamed from: e2.u$c */
    /* loaded from: classes.dex */
    class RunnableC6673c implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6612d1 f14161k;

        RunnableC6673c(C6612d1 d1Var) {
            this.f14161k = d1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC6596a0 a0Var = (AbstractC6596a0) C6670u.this.f14158g.get();
            if (a0Var != null) {
                C6670u.this.m24720v(a0Var, this.f14161k);
            }
        }
    }

    /* renamed from: e2.u$d */
    /* loaded from: classes.dex */
    class RunnableC6674d implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6606b1 f14163k;

        RunnableC6674d(C6606b1 b1Var) {
            this.f14163k = b1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC6596a0 a0Var = (AbstractC6596a0) C6670u.this.f14158g.get();
            if (a0Var != null) {
                C6670u.this.m24721u(a0Var, this.f14163k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.u$e */
    /* loaded from: classes.dex */
    public class RunnableC6675e implements Runnable {
        RunnableC6675e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6670u.this.m24716z();
        }
    }

    /* renamed from: e2.u$f */
    /* loaded from: classes.dex */
    class RunnableC6676f implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6697z0 f14166k;

        RunnableC6676f(C6697z0 z0Var) {
            this.f14166k = z0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC6596a0 a0Var = (AbstractC6596a0) C6670u.this.f14158g.get();
            if (a0Var != null) {
                C6697z0 z0Var = this.f14166k;
                if (z0Var.f14247h == EnumC6618f1.OPTED_OUT) {
                    a0Var.mo25172H();
                } else if (z0Var instanceof C6678v) {
                    C6670u.this.m24723s(a0Var, (C6678v) z0Var);
                }
            }
        }
    }

    public C6670u(AbstractC6596a0 a0Var, boolean z, AbstractC7003b bVar) {
        mo24737d(a0Var, z, bVar);
    }

    /* renamed from: q */
    private C6607c m24725q() {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC6596a0 a0Var = this.f14158g.get();
        C6607c o = new C6668t0(a0Var.mo25176D(), a0Var.mo25146y(), a0Var.mo25179A(), a0Var.mo25168b(), currentTimeMillis).m24752o(this.f14153b);
        this.f14153b = null;
        return o;
    }

    /* renamed from: r */
    private void m24724r(AbstractC6596a0 a0Var, C6697z0 z0Var) {
        if (z0Var.f14245f != null) {
            Long l = z0Var.f14249j;
            if (l == null || l.longValue() < 0) {
                a0Var.mo25157n(false);
                return;
            }
            a0Var.mo25157n(true);
            this.f14153b = "backend";
            m24718x(l.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m24723s(AbstractC6596a0 a0Var, C6678v vVar) {
        m24724r(a0Var, vVar);
        m24722t(vVar);
        a0Var.mo25155p(vVar);
    }

    /* renamed from: t */
    private void m24722t(C6678v vVar) {
        JSONObject optJSONObject;
        String optString;
        JSONObject jSONObject = vVar.f14245f;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("attribution")) != null && (optString = optJSONObject.optString("deeplink", null)) != null) {
            vVar.f14168o = Uri.parse(optString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m24721u(AbstractC6596a0 a0Var, C6606b1 b1Var) {
        m24724r(a0Var, b1Var);
        a0Var.mo25159l(b1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m24720v(AbstractC6596a0 a0Var, C6612d1 d1Var) {
        m24724r(a0Var, d1Var);
        a0Var.mo25164g(d1Var);
    }

    /* renamed from: w */
    private Map<String, String> m24719w() {
        HashMap hashMap = new HashMap();
        C6668t0.m24755l(hashMap, "sent_at", C6629i1.f13989b.format(Long.valueOf(System.currentTimeMillis())));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m24718x(long j) {
        if (this.f14156e.m22720g() <= j) {
            if (j != 0) {
                this.f14155d.mo24884c("Waiting to query attribution in %s seconds", C6629i1.f13988a.format(j / 1000.0d));
            }
            this.f14156e.m22719h(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m24717y() {
        this.f14157f.submit(new RunnableC6675e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m24716z() {
        if (!this.f14158g.get().mo25179A().f13894n) {
            if (this.f14152a) {
                this.f14155d.mo24884c("Attribution handler is paused", new Object[0]);
                return;
            }
            C6607c q = m24725q();
            this.f14155d.mo24880g("%s", q.m25122g());
            this.f14154c.mo23675b(q, m24719w(), this);
        }
    }

    @Override // p074e2.AbstractC6605b0
    /* renamed from: a */
    public void mo24740a() {
        this.f14155d.mo24880g("AttributionHandler teardown", new Object[0]);
        C7410j jVar = this.f14156e;
        if (jVar != null) {
            jVar.m22718i();
        }
        AbstractC7407h hVar = this.f14157f;
        if (hVar != null) {
            hVar.mo22735a();
        }
        WeakReference<AbstractC6596a0> weakReference = this.f14158g;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f14156e = null;
        this.f14155d = null;
        this.f14157f = null;
        this.f14158g = null;
    }

    @Override // p074e2.AbstractC6605b0
    /* renamed from: b */
    public void mo24739b() {
        this.f14152a = true;
    }

    @Override // p074e2.AbstractC6605b0
    /* renamed from: c */
    public void mo24738c() {
        this.f14152a = false;
    }

    @Override // p074e2.AbstractC6605b0
    /* renamed from: d */
    public void mo24737d(AbstractC6596a0 a0Var, boolean z, AbstractC7003b bVar) {
        this.f14158g = new WeakReference<>(a0Var);
        this.f14152a = !z;
        this.f14154c = bVar;
    }

    @Override // p074e2.AbstractC6605b0
    /* renamed from: e */
    public void mo24736e() {
        this.f14157f.submit(new RunnableC6672b());
    }

    @Override // p093f2.AbstractC7003b.AbstractC7004a
    /* renamed from: f */
    public void mo23674f(C6697z0 z0Var) {
        this.f14157f.submit(new RunnableC6676f(z0Var));
    }

    @Override // p074e2.AbstractC6605b0
    /* renamed from: g */
    public void mo24735g(C6606b1 b1Var) {
        this.f14157f.submit(new RunnableC6674d(b1Var));
    }

    @Override // p074e2.AbstractC6605b0
    /* renamed from: h */
    public void mo24734h(C6612d1 d1Var) {
        this.f14157f.submit(new RunnableC6673c(d1Var));
    }
}
