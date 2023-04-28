package p296q7;

import p079e7.C6722k;
import p099f8.C7080b;
import p119g9.C7510a;
import p119g9.C7570y;
import p163j$.util.Spliterator;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10534y;
import p228m7.C10533x;
import p348t7.C12991k;
import p459z7.C14576a;

/* renamed from: q7.a */
/* loaded from: classes7.dex */
public final class C12034a implements AbstractC10514i {

    /* renamed from: b */
    private AbstractC10516k f27000b;

    /* renamed from: c */
    private int f27001c;

    /* renamed from: d */
    private int f27002d;

    /* renamed from: e */
    private int f27003e;

    /* renamed from: g */
    private C7080b f27005g;

    /* renamed from: h */
    private AbstractC10515j f27006h;

    /* renamed from: i */
    private C12037c f27007i;

    /* renamed from: j */
    private C12991k f27008j;

    /* renamed from: a */
    private final C7570y f26999a = new C7570y(6);

    /* renamed from: f */
    private long f27004f = -1;

    /* renamed from: c */
    private void m7950c(AbstractC10515j jVar) {
        this.f26999a.m22021L(2);
        jVar.mo12930n(this.f26999a.m22012d(), 0, 2);
        jVar.mo12934i(this.f26999a.m22023J() - 2);
    }

    /* renamed from: f */
    private void m7949f() {
        m7947h(new C14576a.AbstractC14577b[0]);
        ((AbstractC10516k) C7510a.m22367e(this.f27000b)).mo7935s();
        this.f27000b.mo7936j(new AbstractC10534y.C10536b(-9223372036854775807L));
        this.f27001c = 6;
    }

    /* renamed from: g */
    private static C7080b m7948g(String str, long j) {
        C12035b a;
        if (j == -1 || (a = C12040e.m7934a(str)) == null) {
            return null;
        }
        return a.m7940a(j);
    }

    /* renamed from: h */
    private void m7947h(C14576a.AbstractC14577b... bVarArr) {
        ((AbstractC10516k) C7510a.m22367e(this.f27000b)).mo7937e(Spliterator.IMMUTABLE, 4).mo12388d(new C6722k.C6724b().m24500X(new C14576a(bVarArr)).m24519E());
    }

    /* renamed from: i */
    private int m7946i(AbstractC10515j jVar) {
        this.f26999a.m22021L(2);
        jVar.mo12930n(this.f26999a.m22012d(), 0, 2);
        return this.f26999a.m22023J();
    }

    /* renamed from: j */
    private void m7945j(AbstractC10515j jVar) {
        this.f26999a.m22021L(2);
        jVar.readFully(this.f26999a.m22012d(), 0, 2);
        int J = this.f26999a.m22023J();
        this.f27002d = J;
        if (J == 65498) {
            if (this.f27004f != -1) {
                this.f27001c = 4;
            } else {
                m7949f();
            }
        } else if ((J < 65488 || J > 65497) && J != 65281) {
            this.f27001c = 1;
        }
    }

    /* renamed from: k */
    private void m7944k(AbstractC10515j jVar) {
        String x;
        if (this.f27002d == 65505) {
            C7570y yVar = new C7570y(this.f27003e);
            jVar.readFully(yVar.m22012d(), 0, this.f27003e);
            if (this.f27005g == null && "http://ns.adobe.com/xap/1.0/".equals(yVar.m21992x()) && (x = yVar.m21992x()) != null) {
                C7080b g = m7948g(x, jVar.getLength());
                this.f27005g = g;
                if (g != null) {
                    this.f27004f = g.f15461n;
                }
            }
        } else {
            jVar.mo12932k(this.f27003e);
        }
        this.f27001c = 0;
    }

    /* renamed from: l */
    private void m7943l(AbstractC10515j jVar) {
        this.f26999a.m22021L(2);
        jVar.readFully(this.f26999a.m22012d(), 0, 2);
        this.f27003e = this.f26999a.m22023J() - 2;
        this.f27001c = 2;
    }

    /* renamed from: m */
    private void m7942m(AbstractC10515j jVar) {
        if (!jVar.mo12937d(this.f26999a.m22012d(), 0, 1, true)) {
            m7949f();
            return;
        }
        jVar.mo12936f();
        if (this.f27008j == null) {
            this.f27008j = new C12991k();
        }
        C12037c cVar = new C12037c(jVar, this.f27004f);
        this.f27007i = cVar;
        if (this.f27008j.mo2225d(cVar)) {
            this.f27008j.mo2227b(new C12038d(this.f27004f, (AbstractC10516k) C7510a.m22367e(this.f27000b)));
            m7941n();
            return;
        }
        m7949f();
    }

    /* renamed from: n */
    private void m7941n() {
        m7947h((C14576a.AbstractC14577b) C7510a.m22367e(this.f27005g));
        this.f27001c = 5;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        if (j == 0) {
            this.f27001c = 0;
            this.f27008j = null;
        } else if (this.f27001c == 5) {
            ((C12991k) C7510a.m22367e(this.f27008j)).mo2228a(j, j2);
        }
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public void mo2227b(AbstractC10516k kVar) {
        this.f27000b = kVar;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    public boolean mo2225d(AbstractC10515j jVar) {
        if (m7946i(jVar) != 65496) {
            return false;
        }
        int i = m7946i(jVar);
        this.f27002d = i;
        if (i == 65504) {
            m7950c(jVar);
            this.f27002d = m7946i(jVar);
        }
        if (this.f27002d != 65505) {
            return false;
        }
        jVar.mo12934i(2);
        this.f26999a.m22021L(6);
        jVar.mo12930n(this.f26999a.m22012d(), 0, 6);
        if (this.f26999a.m22027F() == 1165519206 && this.f26999a.m22023J() == 0) {
            return true;
        }
        return false;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        int i = this.f27001c;
        if (i == 0) {
            m7945j(jVar);
            return 0;
        } else if (i == 1) {
            m7943l(jVar);
            return 0;
        } else if (i == 2) {
            m7944k(jVar);
            return 0;
        } else if (i == 4) {
            long position = jVar.getPosition();
            long j = this.f27004f;
            if (position != j) {
                xVar.f23290a = j;
                return 1;
            }
            m7942m(jVar);
            return 0;
        } else if (i == 5) {
            if (this.f27007i == null || jVar != this.f27006h) {
                this.f27006h = jVar;
                this.f27007i = new C12037c(jVar, this.f27004f);
            }
            int e = ((C12991k) C7510a.m22367e(this.f27008j)).mo2224e(this.f27007i, xVar);
            if (e == 1) {
                xVar.f23290a += this.f27004f;
            }
            return e;
        } else if (i == 6) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // p228m7.AbstractC10514i
    public void release() {
        C12991k kVar = this.f27008j;
        if (kVar != null) {
            kVar.release();
        }
    }
}
