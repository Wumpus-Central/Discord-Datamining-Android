package io.sentry;

import io.sentry.Scope;
import io.sentry.protocol.C8973c;
import io.sentry.protocol.C8983g;
import io.sentry.protocol.C9001p;
import io.sentry.protocol.C9015w;
import io.sentry.protocol.C9020z;
import io.sentry.protocol.EnumC9019y;
import io.sentry.util.C9111k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.w3 */
/* loaded from: classes8.dex */
public final class C9141w3 implements AbstractC8932m0 {

    /* renamed from: b */
    private final C8809b4 f20054b;

    /* renamed from: d */
    private final AbstractC8861f0 f20056d;

    /* renamed from: e */
    private String f20057e;

    /* renamed from: f */
    private final boolean f20058f;

    /* renamed from: h */
    private final AbstractC8959o4 f20060h;

    /* renamed from: i */
    private final boolean f20061i;

    /* renamed from: j */
    private final Long f20062j;

    /* renamed from: k */
    private volatile TimerTask f20063k;

    /* renamed from: l */
    private volatile Timer f20064l;

    /* renamed from: p */
    private final C8810c f20068p;

    /* renamed from: q */
    private EnumC9019y f20069q;

    /* renamed from: s */
    private final EnumC8961p0 f20071s;

    /* renamed from: a */
    private final C9001p f20053a = new C9001p();

    /* renamed from: c */
    private final List<C8809b4> f20055c = new CopyOnWriteArrayList();

    /* renamed from: g */
    private C9143b f20059g = C9143b.f20074c;

    /* renamed from: m */
    private final Object f20065m = new Object();

    /* renamed from: n */
    private final C9144c f20066n = new C9144c(null);

    /* renamed from: o */
    private final AtomicBoolean f20067o = new AtomicBoolean(false);

    /* renamed from: t */
    private final C8973c f20072t = new C8973c();

    /* renamed from: r */
    private final Map<String, C8983g> f20070r = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.w3$a */
    /* loaded from: classes8.dex */
    public class C9142a extends TimerTask {
        C9142a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            EnumC8866f4 b = C9141w3.this.mo16842b();
            C9141w3 w3Var = C9141w3.this;
            if (b == null) {
                b = EnumC8866f4.OK;
            }
            w3Var.mo16834j(b);
            C9141w3.this.f20067o.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.w3$b */
    /* loaded from: classes8.dex */
    public static final class C9143b {

        /* renamed from: c */
        static final C9143b f20074c = m16814d();

        /* renamed from: a */
        private final boolean f20075a;

        /* renamed from: b */
        private final EnumC8866f4 f20076b;

        private C9143b(boolean z, EnumC8866f4 f4Var) {
            this.f20075a = z;
            this.f20076b = f4Var;
        }

        /* renamed from: c */
        static C9143b m16815c(EnumC8866f4 f4Var) {
            return new C9143b(true, f4Var);
        }

        /* renamed from: d */
        private static C9143b m16814d() {
            return new C9143b(false, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.w3$c */
    /* loaded from: classes8.dex */
    public static final class C9144c implements Comparator<C8809b4> {
        private C9144c() {
        }

        /* synthetic */ C9144c(C9142a aVar) {
            this();
        }

        /* renamed from: b */
        public int compare(C8809b4 b4Var, C8809b4 b4Var2) {
            Double s = b4Var.m18030s();
            Double s2 = b4Var2.m18030s();
            if (s == null) {
                return -1;
            }
            if (s2 == null) {
                return 1;
            }
            return s.compareTo(s2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9141w3(C8944n4 n4Var, AbstractC8861f0 f0Var, Date date, boolean z, Long l, boolean z2, AbstractC8959o4 o4Var) {
        this.f20064l = null;
        C9111k.m16995a(n4Var, "context is required");
        C9111k.m16995a(f0Var, "hub is required");
        this.f20054b = new C8809b4(n4Var, this, f0Var, date);
        this.f20057e = n4Var.m17589q();
        this.f20071s = n4Var.m17590p();
        this.f20056d = f0Var;
        this.f20058f = z;
        this.f20062j = l;
        this.f20061i = z2;
        this.f20060h = o4Var;
        this.f20069q = n4Var.m17587s();
        if (n4Var.m17591o() != null) {
            this.f20068p = n4Var.m17591o();
        } else {
            this.f20068p = new C8810c(f0Var.mo17826l().getLogger());
        }
        if (l != null) {
            this.f20064l = new Timer(true);
            mo16832l();
        }
    }

    /* renamed from: D */
    private boolean m16854D() {
        ArrayList<C8809b4> arrayList = new ArrayList(this.f20055c);
        if (arrayList.isEmpty()) {
            return true;
        }
        for (C8809b4 b4Var : arrayList) {
            if (!b4Var.mo16843a()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m16851G(C8809b4 b4Var) {
        C9143b bVar = this.f20059g;
        if (this.f20062j != null) {
            if (!this.f20058f || m16854D()) {
                mo16832l();
            }
        } else if (bVar.f20075a) {
            mo16834j(bVar.f20076b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m16850H(Scope scope, AbstractC8932m0 m0Var) {
        if (m0Var == this) {
            scope.m18390d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m16849I(final Scope scope) {
        scope.m18394B(new Scope.AbstractC8687b() { // from class: io.sentry.v3
            @Override // io.sentry.Scope.AbstractC8687b
            /* renamed from: a */
            public final void mo16971a(AbstractC8932m0 m0Var) {
                C9141w3.this.m16850H(scope, m0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static /* synthetic */ void m16848J(AtomicReference atomicReference, Scope scope) {
        atomicReference.set(scope.m18375s());
    }

    /* renamed from: N */
    private void m16844N() {
        synchronized (this) {
            if (this.f20068p.m18010m()) {
                final AtomicReference atomicReference = new AtomicReference();
                this.f20056d.mo17829i(new AbstractC8807b2() { // from class: io.sentry.u3
                    @Override // io.sentry.AbstractC8807b2
                    /* renamed from: a */
                    public final void mo16755a(Scope scope) {
                        C9141w3.m16848J(atomicReference, scope);
                    }
                });
                this.f20068p.m17999x(this, (C9020z) atomicReference.get(), this.f20056d.mo17826l(), m16856B());
                this.f20068p.m18022a();
            }
        }
    }

    /* renamed from: s */
    private void m16825s() {
        synchronized (this.f20065m) {
            if (this.f20063k != null) {
                this.f20063k.cancel();
                this.f20067o.set(false);
                this.f20063k = null;
            }
        }
    }

    /* renamed from: t */
    private ISpan m16824t(C8856e4 e4Var, String str) {
        return m16823u(e4Var, str, null, null, EnumC8961p0.SENTRY);
    }

    /* renamed from: u */
    private ISpan m16823u(C8856e4 e4Var, String str, String str2, Date date, EnumC8961p0 p0Var) {
        if (this.f20054b.mo16843a()) {
            return C8940n1.m17594n();
        }
        if (!this.f20071s.equals(p0Var)) {
            return C8940n1.m17594n();
        }
        C9111k.m16995a(e4Var, "parentSpanId is required");
        C9111k.m16995a(str, "operation is required");
        m16825s();
        C8809b4 b4Var = new C8809b4(this.f20054b.m18040B(), e4Var, this, str, this.f20056d, date, new AbstractC8849d4() { // from class: io.sentry.t3
            @Override // io.sentry.AbstractC8849d4
            /* renamed from: a */
            public final void mo17162a(C8809b4 b4Var2) {
                C9141w3.this.m16851G(b4Var2);
            }
        });
        b4Var.mo16839e(str2);
        this.f20055c.add(b4Var);
        return b4Var;
    }

    /* renamed from: v */
    private ISpan m16822v(String str, String str2, Date date, EnumC8961p0 p0Var) {
        if (this.f20054b.mo16843a()) {
            return C8940n1.m17594n();
        }
        if (!this.f20071s.equals(p0Var)) {
            return C8940n1.m17594n();
        }
        if (this.f20055c.size() < this.f20056d.mo17826l().getMaxSpans()) {
            return this.f20054b.mo16841c(str, str2, date, p0Var);
        }
        this.f20056d.mo17826l().getLogger().mo17722c(EnumC8942n3.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return C8940n1.m17594n();
    }

    /* renamed from: A */
    public Double m16857A() {
        return this.f20054b.m18030s();
    }

    /* renamed from: B */
    public C8937m4 m16856B() {
        return this.f20054b.m18026w();
    }

    /* renamed from: C */
    public Date m16855C() {
        return this.f20054b.m18024y();
    }

    /* renamed from: E */
    public Boolean m16853E() {
        return this.f20054b.m18039C();
    }

    /* renamed from: F */
    public Boolean m16852F() {
        return this.f20054b.m18038D();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public ISpan m16847K(C8856e4 e4Var, String str, String str2) {
        ISpan t = m16824t(e4Var, str);
        t.mo16839e(str2);
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public ISpan m16846L(C8856e4 e4Var, String str, String str2, Date date, EnumC8961p0 p0Var) {
        return m16823u(e4Var, str, str2, date, p0Var);
    }

    /* renamed from: M */
    public ISpan m16845M(String str, String str2) {
        return m16822v(str, str2, null, EnumC8961p0.SENTRY);
    }

    @Override // io.sentry.ISpan
    /* renamed from: a */
    public boolean mo16843a() {
        return this.f20054b.mo16843a();
    }

    @Override // io.sentry.ISpan
    /* renamed from: b */
    public EnumC8866f4 mo16842b() {
        return this.f20054b.mo16842b();
    }

    @Override // io.sentry.ISpan
    /* renamed from: c */
    public ISpan mo16841c(String str, String str2, Date date, EnumC8961p0 p0Var) {
        return m16822v(str, str2, date, p0Var);
    }

    @Override // io.sentry.ISpan
    /* renamed from: d */
    public void mo16840d() {
        mo16834j(mo16842b());
    }

    @Override // io.sentry.ISpan
    /* renamed from: e */
    public void mo16839e(String str) {
        if (!this.f20054b.mo16843a()) {
            this.f20054b.mo16839e(str);
        }
    }

    @Override // io.sentry.AbstractC8932m0
    /* renamed from: f */
    public C9001p mo16838f() {
        return this.f20053a;
    }

    @Override // io.sentry.ISpan
    /* renamed from: g */
    public ISpan mo16837g(String str) {
        return m16845M(str, null);
    }

    @Override // io.sentry.AbstractC8932m0
    public String getName() {
        return this.f20057e;
    }

    @Override // io.sentry.AbstractC8932m0
    /* renamed from: h */
    public EnumC9019y mo16836h() {
        return this.f20069q;
    }

    @Override // io.sentry.ISpan
    /* renamed from: i */
    public C8918k4 mo16835i() {
        if (!this.f20056d.mo17826l().isTraceSampling()) {
            return null;
        }
        m16844N();
        return this.f20068p.m17998y();
    }

    @Override // io.sentry.ISpan
    /* renamed from: j */
    public void mo16834j(EnumC8866f4 f4Var) {
        m16821w(f4Var, null);
    }

    @Override // io.sentry.AbstractC8932m0
    /* renamed from: k */
    public C8809b4 mo16833k() {
        ArrayList arrayList = new ArrayList(this.f20055c);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((C8809b4) arrayList.get(size)).mo16843a()) {
                return (C8809b4) arrayList.get(size);
            }
        }
        return null;
    }

    @Override // io.sentry.AbstractC8932m0
    /* renamed from: l */
    public void mo16832l() {
        synchronized (this.f20065m) {
            m16825s();
            if (this.f20064l != null) {
                this.f20067o.set(true);
                this.f20063k = new C9142a();
                this.f20064l.schedule(this.f20063k, this.f20062j.longValue());
            }
        }
    }

    @Override // io.sentry.ISpan
    /* renamed from: m */
    public C8815c4 mo16831m() {
        return this.f20054b.mo16831m();
    }

    /* renamed from: w */
    public void m16821w(EnumC8866f4 f4Var, Date date) {
        C8809b4 b4Var;
        Double A;
        this.f20059g = C9143b.m16815c(f4Var);
        if (this.f20054b.mo16843a()) {
            return;
        }
        if (!this.f20058f || m16854D()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(m16852F()) && bool.equals(m16853E())) {
                this.f20056d.mo17826l().getTransactionProfiler().mo17552b(this);
            }
            Long valueOf = Long.valueOf(System.nanoTime());
            Double t = this.f20054b.m18029t(valueOf);
            if (date != null) {
                t = Double.valueOf(C8875h.m17847a(date));
                valueOf = null;
            }
            if (t == null) {
                t = Double.valueOf(C8875h.m17847a(C8875h.m17846b()));
                valueOf = null;
            }
            for (C8809b4 b4Var2 : this.f20055c) {
                if (!b4Var2.mo16843a()) {
                    b4Var2.m18037E(null);
                    b4Var2.m18035n(EnumC8866f4.DEADLINE_EXCEEDED, t, valueOf);
                }
            }
            if (!this.f20055c.isEmpty() && this.f20061i && (A = (b4Var = (C8809b4) Collections.max(this.f20055c, this.f20066n)).m18041A()) != null && t.doubleValue() > A.doubleValue()) {
                valueOf = b4Var.m18031r();
                t = A;
            }
            this.f20054b.m18035n(this.f20059g.f20076b, t, valueOf);
            this.f20056d.mo17829i(new AbstractC8807b2() { // from class: io.sentry.s3
                @Override // io.sentry.AbstractC8807b2
                /* renamed from: a */
                public final void mo16755a(Scope scope) {
                    C9141w3.this.m16849I(scope);
                }
            });
            C9015w wVar = new C9015w(this);
            AbstractC8959o4 o4Var = this.f20060h;
            if (o4Var != null) {
                o4Var.mo17554a(this);
            }
            if (this.f20064l != null) {
                synchronized (this.f20065m) {
                    if (this.f20064l != null) {
                        this.f20064l.cancel();
                        this.f20064l = null;
                    }
                }
            }
            if (!this.f20055c.isEmpty() || this.f20062j == null) {
                wVar.m17240j0().putAll(this.f20070r);
                this.f20056d.mo17831g(wVar, mo16835i(), null);
            }
        }
    }

    /* renamed from: x */
    public List<C8809b4> m16820x() {
        return this.f20055c;
    }

    /* renamed from: y */
    public C8973c m16819y() {
        return this.f20072t;
    }

    /* renamed from: z */
    public Map<String, Object> m16818z() {
        return this.f20054b.m18034o();
    }
}
