package io.sentry;

import io.sentry.protocol.C9001p;
import io.sentry.util.C9111k;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.b4 */
/* loaded from: classes8.dex */
public final class C8809b4 implements ISpan {

    /* renamed from: a */
    private final Date f19465a;

    /* renamed from: b */
    private final Long f19466b;

    /* renamed from: c */
    private Long f19467c;

    /* renamed from: d */
    private Double f19468d;

    /* renamed from: e */
    private final C8815c4 f19469e;

    /* renamed from: f */
    private final C9141w3 f19470f;

    /* renamed from: g */
    private Throwable f19471g;

    /* renamed from: h */
    private final AbstractC8861f0 f19472h;

    /* renamed from: i */
    private final AtomicBoolean f19473i;

    /* renamed from: j */
    private AbstractC8849d4 f19474j;

    /* renamed from: k */
    private final Map<String, Object> f19475k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8809b4(C9001p pVar, C8856e4 e4Var, C9141w3 w3Var, String str, AbstractC8861f0 f0Var, Date date, AbstractC8849d4 d4Var) {
        this.f19473i = new AtomicBoolean(false);
        this.f19475k = new ConcurrentHashMap();
        this.f19469e = new C8815c4(pVar, new C8856e4(), str, e4Var, w3Var.m16856B());
        this.f19470f = (C9141w3) C9111k.m16995a(w3Var, "transaction is required");
        this.f19472h = (AbstractC8861f0) C9111k.m16995a(f0Var, "hub is required");
        this.f19474j = d4Var;
        if (date != null) {
            this.f19465a = date;
            this.f19466b = null;
            return;
        }
        this.f19465a = C8875h.m17846b();
        this.f19466b = Long.valueOf(System.nanoTime());
    }

    /* renamed from: q */
    private Double m18032q(Long l) {
        if (this.f19466b == null || l == null) {
            return null;
        }
        return Double.valueOf(C8875h.m17840h(l.longValue() - this.f19466b.longValue()));
    }

    /* renamed from: A */
    public Double m18041A() {
        return this.f19468d;
    }

    /* renamed from: B */
    public C9001p m18040B() {
        return this.f19469e.m17987j();
    }

    /* renamed from: C */
    public Boolean m18039C() {
        return this.f19469e.m17993d();
    }

    /* renamed from: D */
    public Boolean m18038D() {
        return this.f19469e.m17992e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m18037E(AbstractC8849d4 d4Var) {
        this.f19474j = d4Var;
    }

    /* renamed from: F */
    public ISpan m18036F(String str, String str2) {
        if (this.f19473i.get()) {
            return C8940n1.m17594n();
        }
        return this.f19470f.m16847K(this.f19469e.m17990g(), str, str2);
    }

    @Override // io.sentry.ISpan
    /* renamed from: a */
    public boolean mo16843a() {
        return this.f19473i.get();
    }

    @Override // io.sentry.ISpan
    /* renamed from: b */
    public EnumC8866f4 mo16842b() {
        return this.f19469e.m17989h();
    }

    @Override // io.sentry.ISpan
    /* renamed from: c */
    public ISpan mo16841c(String str, String str2, Date date, EnumC8961p0 p0Var) {
        if (this.f19473i.get()) {
            return C8940n1.m17594n();
        }
        return this.f19470f.m16846L(this.f19469e.m17990g(), str, str2, date, p0Var);
    }

    @Override // io.sentry.ISpan
    /* renamed from: d */
    public void mo16840d() {
        mo16834j(this.f19469e.m17989h());
    }

    @Override // io.sentry.ISpan
    /* renamed from: e */
    public void mo16839e(String str) {
        if (!this.f19473i.get()) {
            this.f19469e.m17986k(str);
        }
    }

    @Override // io.sentry.ISpan
    /* renamed from: g */
    public ISpan mo16837g(String str) {
        return m18036F(str, null);
    }

    @Override // io.sentry.ISpan
    /* renamed from: j */
    public void mo16834j(EnumC8866f4 f4Var) {
        m18035n(f4Var, Double.valueOf(C8875h.m17847a(C8875h.m17846b())), null);
    }

    @Override // io.sentry.ISpan
    /* renamed from: m */
    public C8815c4 mo16831m() {
        return this.f19469e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m18035n(EnumC8866f4 f4Var, Double d, Long l) {
        long j;
        if (this.f19473i.compareAndSet(false, true)) {
            this.f19469e.m17984m(f4Var);
            this.f19468d = d;
            Throwable th2 = this.f19471g;
            if (th2 != null) {
                this.f19472h.mo17827k(th2, this, this.f19470f.getName());
            }
            AbstractC8849d4 d4Var = this.f19474j;
            if (d4Var != null) {
                d4Var.mo17162a(this);
            }
            if (l == null) {
                j = System.nanoTime();
            } else {
                j = l.longValue();
            }
            this.f19467c = Long.valueOf(j);
        }
    }

    /* renamed from: o */
    public Map<String, Object> m18034o() {
        return this.f19475k;
    }

    /* renamed from: p */
    public String m18033p() {
        return this.f19469e.m17996a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Long m18031r() {
        return this.f19467c;
    }

    /* renamed from: s */
    public Double m18030s() {
        return m18029t(this.f19467c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public Double m18029t(Long l) {
        Double q = m18032q(l);
        if (q != null) {
            return Double.valueOf(C8875h.m17841g(this.f19465a.getTime() + q.doubleValue()));
        }
        Double d = this.f19468d;
        if (d != null) {
            return d;
        }
        return null;
    }

    /* renamed from: u */
    public String m18028u() {
        return this.f19469e.m17995b();
    }

    /* renamed from: v */
    public C8856e4 m18027v() {
        return this.f19469e.m17994c();
    }

    /* renamed from: w */
    public C8937m4 m18026w() {
        return this.f19469e.m17991f();
    }

    /* renamed from: x */
    public C8856e4 m18025x() {
        return this.f19469e.m17990g();
    }

    /* renamed from: y */
    public Date m18024y() {
        return this.f19465a;
    }

    /* renamed from: z */
    public Map<String, String> m18023z() {
        return this.f19469e.m17988i();
    }

    public C8809b4(C8944n4 n4Var, C9141w3 w3Var, AbstractC8861f0 f0Var, Date date) {
        this.f19473i = new AtomicBoolean(false);
        this.f19475k = new ConcurrentHashMap();
        this.f19469e = (C8815c4) C9111k.m16995a(n4Var, "context is required");
        this.f19470f = (C9141w3) C9111k.m16995a(w3Var, "sentryTracer is required");
        this.f19472h = (AbstractC8861f0) C9111k.m16995a(f0Var, "hub is required");
        this.f19474j = null;
        if (date != null) {
            this.f19465a = date;
            this.f19466b = null;
            return;
        }
        this.f19465a = C8875h.m17846b();
        this.f19466b = Long.valueOf(System.nanoTime());
    }
}
