package p153i8;

import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import p029b9.AbstractC3415h;
import p079e7.C6736w;
import p081e9.AbstractC6765b;
import p119g9.C7510a;
import p119g9.C7557q0;
import p153i8.AbstractC8287r;
import p153i8.AbstractC8299u;

/* renamed from: i8.o */
/* loaded from: classes7.dex */
public final class C8277o implements AbstractC8287r, AbstractC8287r.AbstractC8288a {

    /* renamed from: k */
    public final AbstractC8299u.C8300a f18017k;

    /* renamed from: l */
    private final long f18018l;

    /* renamed from: m */
    private final AbstractC6765b f18019m;

    /* renamed from: n */
    private AbstractC8299u f18020n;

    /* renamed from: o */
    private AbstractC8287r f18021o;

    /* renamed from: p */
    private AbstractC8287r.AbstractC8288a f18022p;

    /* renamed from: q */
    private long f18023q = -9223372036854775807L;

    public C8277o(AbstractC8299u.C8300a aVar, AbstractC6765b bVar, long j) {
        this.f18017k = aVar;
        this.f18019m = bVar;
        this.f18018l = j;
    }

    /* renamed from: s */
    private long m20054s(long j) {
        long j2 = this.f18023q;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: b */
    public long mo12421b() {
        return ((AbstractC8287r) C7557q0.m22145j(this.f18021o)).mo12421b();
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: c */
    public boolean mo12419c() {
        AbstractC8287r rVar = this.f18021o;
        return rVar != null && rVar.mo12419c();
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: d */
    public long mo12472d(long j, C6736w wVar) {
        return ((AbstractC8287r) C7557q0.m22145j(this.f18021o)).mo12472d(j, wVar);
    }

    /* renamed from: e */
    public void m20057e(AbstractC8299u.C8300a aVar) {
        long s = m20054s(this.f18018l);
        AbstractC8287r m = ((AbstractC8299u) C7510a.m22367e(this.f18020n)).mo19997m(aVar, this.f18019m, s);
        this.f18021o = m;
        if (this.f18022p != null) {
            m.mo12469m(this, s);
        }
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: f */
    public boolean mo12415f(long j) {
        AbstractC8287r rVar = this.f18021o;
        return rVar != null && rVar.mo12415f(j);
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: g */
    public long mo12413g() {
        return ((AbstractC8287r) C7557q0.m22145j(this.f18021o)).mo12413g();
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: h */
    public void mo12411h(long j) {
        ((AbstractC8287r) C7557q0.m22145j(this.f18021o)).mo12411h(j);
    }

    @Override // p153i8.AbstractC8287r.AbstractC8288a
    /* renamed from: j */
    public void mo20028j(AbstractC8287r rVar) {
        ((AbstractC8287r.AbstractC8288a) C7557q0.m22145j(this.f18022p)).mo20028j(this);
    }

    /* renamed from: k */
    public long m20056k() {
        return this.f18023q;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: l */
    public long mo12470l(long j) {
        return ((AbstractC8287r) C7557q0.m22145j(this.f18021o)).mo12470l(j);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: m */
    public void mo12469m(AbstractC8287r.AbstractC8288a aVar, long j) {
        this.f18022p = aVar;
        AbstractC8287r rVar = this.f18021o;
        if (rVar != null) {
            rVar.mo12469m(this, m20054s(this.f18018l));
        }
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: n */
    public long mo12468n() {
        return ((AbstractC8287r) C7557q0.m22145j(this.f18021o)).mo12468n();
    }

    /* renamed from: p */
    public long m20055p() {
        return this.f18018l;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: q */
    public long mo12466q(AbstractC3415h[] hVarArr, boolean[] zArr, AbstractC8278o0[] o0VarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f18023q;
        if (j3 == -9223372036854775807L || j != this.f18018l) {
            j2 = j;
        } else {
            this.f18023q = -9223372036854775807L;
            j2 = j3;
        }
        return ((AbstractC8287r) C7557q0.m22145j(this.f18021o)).mo12466q(hVarArr, zArr, o0VarArr, zArr2, j2);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: r */
    public void mo12465r() {
        try {
            AbstractC8287r rVar = this.f18021o;
            if (rVar != null) {
                rVar.mo12465r();
                return;
            }
            AbstractC8299u uVar = this.f18020n;
            if (uVar != null) {
                uVar.mo19996n();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: t */
    public TrackGroupArray mo12463t() {
        return ((AbstractC8287r) C7557q0.m22145j(this.f18021o)).mo12463t();
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: u */
    public void mo12462u(long j, boolean z) {
        ((AbstractC8287r) C7557q0.m22145j(this.f18021o)).mo12462u(j, z);
    }

    /* renamed from: v */
    public void mo12471i(AbstractC8287r rVar) {
        ((AbstractC8287r.AbstractC8288a) C7557q0.m22145j(this.f18022p)).mo12471i(this);
    }

    /* renamed from: w */
    public void m20052w(long j) {
        this.f18023q = j;
    }

    /* renamed from: x */
    public void m20051x() {
        if (this.f18021o != null) {
            ((AbstractC8299u) C7510a.m22367e(this.f18020n)).mo19998l(this.f18021o);
        }
    }

    /* renamed from: y */
    public void m20050y(AbstractC8299u uVar) {
        boolean z;
        if (this.f18020n == null) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        this.f18020n = uVar;
    }
}
