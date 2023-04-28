package p074e2;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import p093f2.AbstractC7003b;
import p112g2.AbstractC7407h;
import p112g2.C7397d;

/* renamed from: e2.a1 */
/* loaded from: classes.dex */
public class C6597a1 implements AbstractC6617f0 {

    /* renamed from: a */
    private boolean f13832a;

    /* renamed from: d */
    private List<C6607c> f13835d;

    /* renamed from: f */
    private WeakReference<AbstractC6596a0> f13837f;

    /* renamed from: g */
    private AbstractC7003b f13838g;

    /* renamed from: b */
    private AbstractC6608c0 f13833b = C6639l.m24863j();

    /* renamed from: c */
    private EnumC6687w f13834c = C6639l.m24859n();

    /* renamed from: e */
    private AbstractC7407h f13836e = new C7397d("SdkClickHandler");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a1$a */
    /* loaded from: classes.dex */
    public class RunnableC6598a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6607c f13839k;

        RunnableC6598a(C6607c cVar) {
            this.f13839k = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6597a1.this.f13835d.add(this.f13839k);
            C6597a1.this.f13833b.mo24884c("Added sdk_click %d", Integer.valueOf(C6597a1.this.f13835d.size()));
            C6597a1.this.f13833b.mo24880g("%s", this.f13839k.m25122g());
            C6597a1.this.m25136p();
        }
    }

    /* renamed from: e2.a1$b */
    /* loaded from: classes.dex */
    class RunnableC6599b implements Runnable {
        RunnableC6599b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC6596a0 a0Var = (AbstractC6596a0) C6597a1.this.f13837f.get();
            C6615e1 e1Var = new C6615e1(a0Var.getContext());
            try {
                JSONArray m = e1Var.m25043m();
                boolean z = false;
                for (int i = 0; i < m.length(); i++) {
                    JSONArray jSONArray = m.getJSONArray(i);
                    if (jSONArray.optInt(2, -1) == 0) {
                        String optString = jSONArray.optString(0, null);
                        long optLong = jSONArray.optLong(1, -1L);
                        jSONArray.put(2, 1);
                        C6597a1.this.mo25014g(C6677u0.m24712d(optString, optLong, a0Var.mo25179A(), a0Var.mo25176D(), a0Var.mo25146y(), a0Var.mo25168b()));
                        z = true;
                    }
                }
                if (z) {
                    e1Var.m25062B(m);
                }
            } catch (JSONException e) {
                C6597a1.this.f13833b.mo24885b("Send saved raw referrers error (%s)", e.getMessage());
            }
        }
    }

    /* renamed from: e2.a1$c */
    /* loaded from: classes.dex */
    class RunnableC6600c implements Runnable {

        /* renamed from: k */
        final /* synthetic */ String f13842k;

        /* renamed from: l */
        final /* synthetic */ String f13843l;

        RunnableC6600c(String str, String str2) {
            this.f13842k = str;
            this.f13843l = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC6596a0 a0Var = (AbstractC6596a0) C6597a1.this.f13837f.get();
            if (a0Var != null) {
                C6597a1.this.mo25014g(C6677u0.m24713c(this.f13842k, this.f13843l, a0Var.mo25179A(), a0Var.mo25176D(), a0Var.mo25146y(), a0Var.mo25168b()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a1$d */
    /* loaded from: classes.dex */
    public class RunnableC6601d implements Runnable {
        RunnableC6601d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6597a1.this.m25135q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a1$e */
    /* loaded from: classes.dex */
    public class RunnableC6602e implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C6607c f13846k;

        RunnableC6602e(C6607c cVar) {
            this.f13846k = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6597a1.this.m25134r(this.f13846k);
            C6597a1.this.m25136p();
        }
    }

    public C6597a1(AbstractC6596a0 a0Var, boolean z, AbstractC7003b bVar) {
        mo25017d(a0Var, z, bVar);
    }

    /* renamed from: n */
    private Map<String, String> m25138n() {
        HashMap hashMap = new HashMap();
        C6668t0.m24755l(hashMap, "sent_at", C6629i1.f13989b.format(Long.valueOf(System.currentTimeMillis())));
        int size = this.f13835d.size() - 1;
        if (size > 0) {
            C6668t0.m24757j(hashMap, "queue_size", size);
        }
        return hashMap;
    }

    /* renamed from: o */
    private void m25137o(C6607c cVar) {
        this.f13833b.mo24885b("Retrying sdk_click package for the %d time", Integer.valueOf(cVar.m25111r()));
        mo25014g(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m25136p() {
        this.f13836e.submit(new RunnableC6601d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m25135q() {
        AbstractC6596a0 a0Var = this.f13837f.get();
        if (a0Var.mo25179A() != null && !a0Var.mo25179A().f13894n && !this.f13832a && !this.f13835d.isEmpty()) {
            C6607c remove = this.f13835d.remove(0);
            int p = remove.m25113p();
            RunnableC6602e eVar = new RunnableC6602e(remove);
            if (p <= 0) {
                eVar.run();
                return;
            }
            long H = C6629i1.m24944H(p, this.f13834c);
            this.f13833b.mo24880g("Waiting for %s seconds before retrying sdk_click for the %d time", C6629i1.f13988a.format(H / 1000.0d), Integer.valueOf(p));
            this.f13836e.mo22734b(eVar, H);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m25134r(C6607c cVar) {
        boolean z;
        boolean z2;
        Boolean bool;
        String str;
        String str2;
        long j;
        String str3;
        long j2;
        long j3;
        long j4;
        boolean z3;
        long j5;
        String str4;
        AbstractC6596a0 a0Var = this.f13837f.get();
        String str5 = cVar.m25116m().get("source");
        if (str5 == null || !str5.equals("reftag")) {
            z = false;
        } else {
            z = true;
        }
        String str6 = cVar.m25116m().get("raw_referrer");
        if (!z || new C6615e1(a0Var.getContext()).m25044l(str6, cVar.m25126c()) != null) {
            if (str5 == null || !str5.equals("install_referrer")) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                j3 = cVar.m25125d();
                j2 = cVar.m25119j();
                str3 = cVar.m25116m().get("referrer");
                j = cVar.m25124e();
                long k = cVar.m25118k();
                String l = cVar.m25117l();
                bool = cVar.m25120i();
                str = cVar.m25116m().get("referrer_api");
                j4 = k;
                str2 = l;
            } else {
                str3 = null;
                j3 = -1;
                j4 = -1;
                j2 = -1;
                j = -1;
                str2 = null;
                str = null;
                bool = null;
            }
            if (str5 == null || !str5.equals("preinstall")) {
                z3 = false;
            } else {
                z3 = true;
            }
            C6697z0 a = this.f13838g.mo23676a(cVar, m25138n());
            if (a instanceof C6606b1) {
                C6606b1 b1Var = (C6606b1) a;
                if (b1Var.f14241b) {
                    m25137o(cVar);
                } else if (a0Var != null) {
                    if (b1Var.f14247h == EnumC6618f1.OPTED_OUT) {
                        a0Var.mo25172H();
                        return;
                    }
                    if (z) {
                        j5 = j4;
                        new C6615e1(a0Var.getContext()).m25034v(str6, cVar.m25126c());
                    } else {
                        j5 = j4;
                    }
                    if (z2) {
                        b1Var.f13865p = j3;
                        b1Var.f13866q = j2;
                        b1Var.f13867r = str3;
                        b1Var.f13868s = j;
                        b1Var.f13869t = j5;
                        b1Var.f13870u = str2;
                        b1Var.f13871v = bool;
                        b1Var.f13872w = str;
                        b1Var.f13864o = true;
                    }
                    if (z3 && (str4 = cVar.m25116m().get("found_location")) != null && !str4.isEmpty()) {
                        C6615e1 e1Var = new C6615e1(a0Var.getContext());
                        if ("system_installer_referrer".equalsIgnoreCase(str4)) {
                            e1Var.m25036t();
                        } else {
                            e1Var.m25057G(C6688w0.m24673k(str4, e1Var.m25047i()));
                        }
                    }
                    a0Var.mo25171I(b1Var);
                }
            }
        }
    }

    @Override // p074e2.AbstractC6617f0
    /* renamed from: a */
    public void mo25020a() {
        this.f13833b.mo24880g("SdkClickHandler teardown", new Object[0]);
        AbstractC7407h hVar = this.f13836e;
        if (hVar != null) {
            hVar.mo22735a();
        }
        List<C6607c> list = this.f13835d;
        if (list != null) {
            list.clear();
        }
        WeakReference<AbstractC6596a0> weakReference = this.f13837f;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f13833b = null;
        this.f13835d = null;
        this.f13834c = null;
        this.f13836e = null;
    }

    @Override // p074e2.AbstractC6617f0
    /* renamed from: b */
    public void mo25019b() {
        this.f13832a = true;
    }

    @Override // p074e2.AbstractC6617f0
    /* renamed from: c */
    public void mo25018c() {
        this.f13832a = false;
        m25136p();
    }

    @Override // p074e2.AbstractC6617f0
    /* renamed from: d */
    public void mo25017d(AbstractC6596a0 a0Var, boolean z, AbstractC7003b bVar) {
        this.f13832a = !z;
        this.f13835d = new ArrayList();
        this.f13837f = new WeakReference<>(a0Var);
        this.f13838g = bVar;
    }

    @Override // p074e2.AbstractC6617f0
    /* renamed from: e */
    public void mo25016e() {
        this.f13836e.submit(new RunnableC6599b());
    }

    @Override // p074e2.AbstractC6617f0
    /* renamed from: f */
    public void mo25015f(String str, String str2) {
        this.f13836e.submit(new RunnableC6600c(str, str2));
    }

    @Override // p074e2.AbstractC6617f0
    /* renamed from: g */
    public void mo25014g(C6607c cVar) {
        this.f13836e.submit(new RunnableC6598a(cVar));
    }
}
