package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import p029b9.AbstractC3415h;
import p029b9.AbstractC3425m;
import p029b9.C3427n;
import p079e7.AbstractC6733t;
import p081e9.AbstractC6765b;
import p119g9.C7510a;
import p119g9.C7558r;
import p153i8.AbstractC8278o0;
import p153i8.AbstractC8287r;
import p153i8.AbstractC8299u;
import p153i8.C8237d;
import p153i8.C8263k;

/* renamed from: com.google.android.exoplayer2.j0 */
/* loaded from: classes7.dex */
final class C5198j0 {

    /* renamed from: a */
    public final AbstractC8287r f9248a;

    /* renamed from: b */
    public final Object f9249b;

    /* renamed from: c */
    public final AbstractC8278o0[] f9250c;

    /* renamed from: d */
    public boolean f9251d;

    /* renamed from: e */
    public boolean f9252e;

    /* renamed from: f */
    public C5200k0 f9253f;

    /* renamed from: g */
    public boolean f9254g;

    /* renamed from: h */
    private final boolean[] f9255h;

    /* renamed from: i */
    private final AbstractC6733t[] f9256i;

    /* renamed from: j */
    private final AbstractC3425m f9257j;

    /* renamed from: k */
    private final C5210p0 f9258k;

    /* renamed from: l */
    private C5198j0 f9259l;

    /* renamed from: m */
    private TrackGroupArray f9260m = TrackGroupArray.f9361n;

    /* renamed from: n */
    private C3427n f9261n;

    /* renamed from: o */
    private long f9262o;

    public C5198j0(AbstractC6733t[] tVarArr, long j, AbstractC3425m mVar, AbstractC6765b bVar, C5210p0 p0Var, C5200k0 k0Var, C3427n nVar) {
        this.f9256i = tVarArr;
        this.f9262o = j;
        this.f9257j = mVar;
        this.f9258k = p0Var;
        AbstractC8299u.C8300a aVar = k0Var.f9264a;
        this.f9249b = aVar.f18059a;
        this.f9253f = k0Var;
        this.f9261n = nVar;
        this.f9250c = new AbstractC8278o0[tVarArr.length];
        this.f9255h = new boolean[tVarArr.length];
        this.f9248a = m30124e(aVar, p0Var, bVar, k0Var.f9265b, k0Var.f9267d);
    }

    /* renamed from: c */
    private void m30126c(AbstractC8278o0[] o0VarArr) {
        int i = 0;
        while (true) {
            AbstractC6733t[] tVarArr = this.f9256i;
            if (i < tVarArr.length) {
                if (tVarArr[i].mo24424d() == 7 && this.f9261n.m34397c(i)) {
                    o0VarArr[i] = new C8263k();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private static AbstractC8287r m30124e(AbstractC8299u.C8300a aVar, C5210p0 p0Var, AbstractC6765b bVar, long j, long j2) {
        AbstractC8287r h = p0Var.m30056h(aVar, bVar, j);
        if (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) {
            return h;
        }
        return new C8237d(h, true, 0L, j2);
    }

    /* renamed from: f */
    private void m30123f() {
        if (m30111r()) {
            int i = 0;
            while (true) {
                C3427n nVar = this.f9261n;
                if (i < nVar.f5563a) {
                    boolean c = nVar.m34397c(i);
                    AbstractC3415h hVar = this.f9261n.f5565c[i];
                    if (c && hVar != null) {
                        hVar.disable();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private void m30122g(AbstractC8278o0[] o0VarArr) {
        int i = 0;
        while (true) {
            AbstractC6733t[] tVarArr = this.f9256i;
            if (i < tVarArr.length) {
                if (tVarArr[i].mo24424d() == 7) {
                    o0VarArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    private void m30121h() {
        if (m30111r()) {
            int i = 0;
            while (true) {
                C3427n nVar = this.f9261n;
                if (i < nVar.f5563a) {
                    boolean c = nVar.m34397c(i);
                    AbstractC3415h hVar = this.f9261n.f5565c[i];
                    if (c && hVar != null) {
                        hVar.enable();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: r */
    private boolean m30111r() {
        return this.f9259l == null;
    }

    /* renamed from: u */
    private static void m30108u(long j, C5210p0 p0Var, AbstractC8287r rVar) {
        try {
            if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
                p0Var.m30038z(rVar);
            } else {
                p0Var.m30038z(((C8237d) rVar).f17846k);
            }
        } catch (RuntimeException e) {
            C7558r.m22108d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: a */
    public long m30128a(C3427n nVar, long j, boolean z) {
        return m30127b(nVar, j, z, new boolean[this.f9256i.length]);
    }

    /* renamed from: b */
    public long m30127b(C3427n nVar, long j, boolean z, boolean[] zArr) {
        boolean z2;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= nVar.f5563a) {
                break;
            }
            boolean[] zArr2 = this.f9255h;
            if (z || !nVar.m34398b(this.f9261n, i)) {
                z3 = false;
            }
            zArr2[i] = z3;
            i++;
        }
        m30122g(this.f9250c);
        m30123f();
        this.f9261n = nVar;
        m30121h();
        long q = this.f9248a.mo12466q(nVar.f5565c, this.f9255h, this.f9250c, zArr, j);
        m30126c(this.f9250c);
        this.f9252e = false;
        int i2 = 0;
        while (true) {
            AbstractC8278o0[] o0VarArr = this.f9250c;
            if (i2 >= o0VarArr.length) {
                return q;
            }
            if (o0VarArr[i2] != null) {
                C7510a.m22366f(nVar.m34397c(i2));
                if (this.f9256i[i2].mo24424d() != 7) {
                    this.f9252e = true;
                }
            } else {
                if (nVar.f5565c[i2] == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C7510a.m22366f(z2);
            }
            i2++;
        }
    }

    /* renamed from: d */
    public void m30125d(long j) {
        C7510a.m22366f(m30111r());
        this.f9248a.mo12415f(m30104y(j));
    }

    /* renamed from: i */
    public long m30120i() {
        long j;
        if (!this.f9251d) {
            return this.f9253f.f9265b;
        }
        if (this.f9252e) {
            j = this.f9248a.mo12413g();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.f9253f.f9268e;
        }
        return j;
    }

    /* renamed from: j */
    public C5198j0 m30119j() {
        return this.f9259l;
    }

    /* renamed from: k */
    public long m30118k() {
        if (!this.f9251d) {
            return 0L;
        }
        return this.f9248a.mo12421b();
    }

    /* renamed from: l */
    public long m30117l() {
        return this.f9262o;
    }

    /* renamed from: m */
    public long m30116m() {
        return this.f9253f.f9265b + this.f9262o;
    }

    /* renamed from: n */
    public TrackGroupArray m30115n() {
        return this.f9260m;
    }

    /* renamed from: o */
    public C3427n m30114o() {
        return this.f9261n;
    }

    /* renamed from: p */
    public void m30113p(float f, Timeline timeline) {
        this.f9251d = true;
        this.f9260m = this.f9248a.mo12463t();
        C3427n v = m30107v(f, timeline);
        C5200k0 k0Var = this.f9253f;
        long j = k0Var.f9265b;
        long j2 = k0Var.f9268e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long a = m30128a(v, j, false);
        long j3 = this.f9262o;
        C5200k0 k0Var2 = this.f9253f;
        this.f9262o = j3 + (k0Var2.f9265b - a);
        this.f9253f = k0Var2.m30101b(a);
    }

    /* renamed from: q */
    public boolean m30112q() {
        if (!this.f9251d || (this.f9252e && this.f9248a.mo12413g() != Long.MIN_VALUE)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public void m30110s(long j) {
        C7510a.m22366f(m30111r());
        if (this.f9251d) {
            this.f9248a.mo12411h(m30104y(j));
        }
    }

    /* renamed from: t */
    public void m30109t() {
        m30123f();
        m30108u(this.f9253f.f9267d, this.f9258k, this.f9248a);
    }

    /* renamed from: v */
    public C3427n m30107v(float f, Timeline timeline) {
        AbstractC3415h[] hVarArr;
        C3427n e = this.f9257j.mo34400e(this.f9256i, m30115n(), this.f9253f.f9264a, timeline);
        for (AbstractC3415h hVar : e.f5565c) {
            if (hVar != null) {
                hVar.mo34434f(f);
            }
        }
        return e;
    }

    /* renamed from: w */
    public void m30106w(C5198j0 j0Var) {
        if (j0Var != this.f9259l) {
            m30123f();
            this.f9259l = j0Var;
            m30121h();
        }
    }

    /* renamed from: x */
    public void m30105x(long j) {
        this.f9262o = j;
    }

    /* renamed from: y */
    public long m30104y(long j) {
        return j - m30117l();
    }

    /* renamed from: z */
    public long m30103z(long j) {
        return j + m30117l();
    }
}
