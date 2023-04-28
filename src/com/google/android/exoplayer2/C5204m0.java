package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import cc.AbstractC3884i0;
import com.google.android.exoplayer2.Timeline;
import p098f7.C7030d1;
import p119g9.C7510a;
import p153i8.AbstractC8287r;
import p153i8.AbstractC8299u;

/* renamed from: com.google.android.exoplayer2.m0 */
/* loaded from: classes7.dex */
final class C5204m0 {

    /* renamed from: a */
    private final Timeline.C5160b f9278a = new Timeline.C5160b();

    /* renamed from: b */
    private final Timeline.C5161c f9279b = new Timeline.C5161c();

    /* renamed from: c */
    private final C7030d1 f9280c;

    /* renamed from: d */
    private final Handler f9281d;

    /* renamed from: e */
    private long f9282e;

    /* renamed from: f */
    private int f9283f;

    /* renamed from: g */
    private boolean f9284g;

    /* renamed from: h */
    private C5198j0 f9285h;

    /* renamed from: i */
    private C5198j0 f9286i;

    /* renamed from: j */
    private C5198j0 f9287j;

    /* renamed from: k */
    private int f9288k;

    /* renamed from: l */
    private Object f9289l;

    /* renamed from: m */
    private long f9290m;

    public C5204m0(C7030d1 d1Var, Handler handler) {
        this.f9280c = d1Var;
        this.f9281d = handler;
    }

    /* renamed from: A */
    private static AbstractC8299u.C8300a m30100A(Timeline timeline, Object obj, long j, long j2, Timeline.C5160b bVar) {
        timeline.mo30409h(obj, bVar);
        int e = bVar.m30429e(j);
        if (e == -1) {
            return new AbstractC8299u.C8300a(obj, j2, bVar.m30430d(j));
        }
        return new AbstractC8299u.C8300a(obj, e, bVar.m30425i(e), j2);
    }

    /* renamed from: B */
    private long m30099B(Timeline timeline, Object obj) {
        int b;
        int i = timeline.mo30409h(obj, this.f9278a).f9084c;
        Object obj2 = this.f9289l;
        if (!(obj2 == null || (b = timeline.mo20027b(obj2)) == -1 || timeline.m30439f(b, this.f9278a).f9084c != i)) {
            return this.f9290m;
        }
        for (C5198j0 j0Var = this.f9285h; j0Var != null; j0Var = j0Var.m30119j()) {
            if (j0Var.f9249b.equals(obj)) {
                return j0Var.f9253f.f9264a.f18062d;
            }
        }
        for (C5198j0 j0Var2 = this.f9285h; j0Var2 != null; j0Var2 = j0Var2.m30119j()) {
            int b2 = timeline.mo20027b(j0Var2.f9249b);
            if (b2 != -1 && timeline.m30439f(b2, this.f9278a).f9084c == i) {
                return j0Var2.f9253f.f9264a.f18062d;
            }
        }
        long j = this.f9282e;
        this.f9282e = 1 + j;
        if (this.f9285h == null) {
            this.f9289l = obj;
            this.f9290m = j;
        }
        return j;
    }

    /* renamed from: D */
    private boolean m30097D(Timeline timeline) {
        C5198j0 j0Var = this.f9285h;
        if (j0Var == null) {
            return true;
        }
        int b = timeline.mo20027b(j0Var.f9249b);
        while (true) {
            b = timeline.m30440d(b, this.f9278a, this.f9279b, this.f9283f, this.f9284g);
            while (j0Var.m30119j() != null && !j0Var.f9253f.f9269f) {
                j0Var = j0Var.m30119j();
            }
            C5198j0 j = j0Var.m30119j();
            if (b == -1 || j == null || timeline.mo20027b(j.f9249b) != b) {
                break;
            }
            j0Var = j;
        }
        boolean y = m30069y(j0Var);
        j0Var.f9253f = m30077q(timeline, j0Var.f9253f);
        return !y;
    }

    /* renamed from: d */
    private boolean m30090d(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    /* renamed from: e */
    private boolean m30089e(C5200k0 k0Var, C5200k0 k0Var2) {
        return k0Var.f9265b == k0Var2.f9265b && k0Var.f9264a.equals(k0Var2.f9264a);
    }

    /* renamed from: h */
    private C5200k0 m30086h(C5216q0 q0Var) {
        return m30083k(q0Var.f9321a, q0Var.f9322b, q0Var.f9323c, q0Var.f9338r);
    }

    /* renamed from: i */
    private C5200k0 m30085i(Timeline timeline, C5198j0 j0Var, long j) {
        long j2;
        C5200k0 k0Var = j0Var.f9253f;
        long l = (j0Var.m30117l() + k0Var.f9268e) - j;
        if (k0Var.f9269f) {
            long j3 = 0;
            int d = timeline.m30440d(timeline.mo20027b(k0Var.f9264a.f18059a), this.f9278a, this.f9279b, this.f9283f, this.f9284g);
            if (d == -1) {
                return null;
            }
            int i = timeline.mo20026g(d, this.f9278a, true).f9084c;
            Object obj = this.f9278a.f9083b;
            long j4 = k0Var.f9264a.f18062d;
            if (timeline.m30436n(i, this.f9279b).f9102m == d) {
                Pair<Object, Long> k = timeline.m30437k(this.f9279b, this.f9278a, i, -9223372036854775807L, Math.max(0L, l));
                if (k == null) {
                    return null;
                }
                obj = k.first;
                long longValue = ((Long) k.second).longValue();
                C5198j0 j5 = j0Var.m30119j();
                if (j5 == null || !j5.f9249b.equals(obj)) {
                    j4 = this.f9282e;
                    this.f9282e = 1 + j4;
                } else {
                    j4 = j5.f9253f.f9264a.f18062d;
                }
                j2 = longValue;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return m30083k(timeline, m30100A(timeline, obj, j2, j4, this.f9278a), j3, j2);
        }
        AbstractC8299u.C8300a aVar = k0Var.f9264a;
        timeline.mo30409h(aVar.f18059a, this.f9278a);
        if (aVar.m20020b()) {
            int i2 = aVar.f18060b;
            int a = this.f9278a.m30433a(i2);
            if (a == -1) {
                return null;
            }
            int j6 = this.f9278a.m30424j(i2, aVar.f18061c);
            if (j6 < a) {
                return m30082l(timeline, aVar.f18059a, i2, j6, k0Var.f9266c, aVar.f18062d);
            }
            long j7 = k0Var.f9266c;
            if (j7 == -9223372036854775807L) {
                Timeline.C5161c cVar = this.f9279b;
                Timeline.C5160b bVar = this.f9278a;
                Pair<Object, Long> k2 = timeline.m30437k(cVar, bVar, bVar.f9084c, -9223372036854775807L, Math.max(0L, l));
                if (k2 == null) {
                    return null;
                }
                j7 = ((Long) k2.second).longValue();
            }
            return m30081m(timeline, aVar.f18059a, j7, k0Var.f9266c, aVar.f18062d);
        }
        int e = this.f9278a.m30429e(k0Var.f9267d);
        if (e == -1) {
            Object obj2 = aVar.f18059a;
            long j8 = k0Var.f9268e;
            return m30081m(timeline, obj2, j8, j8, aVar.f18062d);
        }
        return m30082l(timeline, aVar.f18059a, e, this.f9278a.m30425i(e), k0Var.f9268e, aVar.f18062d);
    }

    /* renamed from: k */
    private C5200k0 m30083k(Timeline timeline, AbstractC8299u.C8300a aVar, long j, long j2) {
        timeline.mo30409h(aVar.f18059a, this.f9278a);
        if (aVar.m20020b()) {
            return m30082l(timeline, aVar.f18059a, aVar.f18060b, aVar.f18061c, j, aVar.f18062d);
        }
        return m30081m(timeline, aVar.f18059a, j2, j, aVar.f18062d);
    }

    /* renamed from: l */
    private C5200k0 m30082l(Timeline timeline, Object obj, int i, int i2, long j, long j2) {
        long j3;
        long j4;
        AbstractC8299u.C8300a aVar = new AbstractC8299u.C8300a(obj, i, i2, j2);
        long b = timeline.mo30409h(aVar.f18059a, this.f9278a).m30432b(aVar.f18060b, aVar.f18061c);
        if (i2 == this.f9278a.m30425i(i)) {
            j3 = this.f9278a.m30427g();
        } else {
            j3 = 0;
        }
        if (b == -9223372036854775807L || j3 < b) {
            j4 = j3;
        } else {
            j4 = Math.max(0L, b - 1);
        }
        return new C5200k0(aVar, j4, j, -9223372036854775807L, b, false, false, false);
    }

    /* renamed from: m */
    private C5200k0 m30081m(Timeline timeline, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6 = j;
        timeline.mo30409h(obj, this.f9278a);
        int d = this.f9278a.m30430d(j6);
        AbstractC8299u.C8300a aVar = new AbstractC8299u.C8300a(obj, j3, d);
        boolean r = m30076r(aVar);
        boolean t = m30074t(timeline, aVar);
        boolean s = m30075s(timeline, aVar, r);
        if (d != -1) {
            j4 = this.f9278a.m30428f(d);
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) {
            j5 = this.f9278a.f9085d;
        } else {
            j5 = j4;
        }
        if (j5 != -9223372036854775807L && j6 >= j5) {
            j6 = Math.max(0L, j5 - 1);
        }
        return new C5200k0(aVar, j6, j2, j4, j5, r, t, s);
    }

    /* renamed from: r */
    private boolean m30076r(AbstractC8299u.C8300a aVar) {
        return !aVar.m20020b() && aVar.f18063e == -1;
    }

    /* renamed from: s */
    private boolean m30075s(Timeline timeline, AbstractC8299u.C8300a aVar, boolean z) {
        int b = timeline.mo20027b(aVar.f18059a);
        if (timeline.m30436n(timeline.m30439f(b, this.f9278a).f9084c, this.f9279b).f9098i || !timeline.m30434r(b, this.f9278a, this.f9279b, this.f9283f, this.f9284g) || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private boolean m30074t(Timeline timeline, AbstractC8299u.C8300a aVar) {
        if (!m30076r(aVar)) {
            return false;
        }
        int i = timeline.mo30409h(aVar.f18059a, this.f9278a).f9084c;
        if (timeline.m30436n(i, this.f9279b).f9103n == timeline.mo20027b(aVar.f18059a)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m30072v(AbstractC3884i0.C3886b bVar, AbstractC8299u.C8300a aVar) {
        this.f9280c.m23574Y1(bVar.m33394c(), aVar);
    }

    /* renamed from: w */
    private void m30071w() {
        final AbstractC8299u.C8300a aVar;
        if (this.f9280c != null) {
            final AbstractC3884i0.C3886b s = AbstractC3884i0.m33403s();
            for (C5198j0 j0Var = this.f9285h; j0Var != null; j0Var = j0Var.m30119j()) {
                s.m33395b(j0Var.f9253f.f9264a);
            }
            C5198j0 j0Var2 = this.f9286i;
            if (j0Var2 == null) {
                aVar = null;
            } else {
                aVar = j0Var2.f9253f.f9264a;
            }
            this.f9281d.post(new Runnable() { // from class: com.google.android.exoplayer2.l0
                @Override // java.lang.Runnable
                public final void run() {
                    C5204m0.this.m30072v(s, aVar);
                }
            });
        }
    }

    /* renamed from: C */
    public boolean m30098C() {
        C5198j0 j0Var = this.f9287j;
        if (j0Var == null || (!j0Var.f9253f.f9271h && j0Var.m30112q() && this.f9287j.f9253f.f9268e != -9223372036854775807L && this.f9288k < 100)) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean m30096E(Timeline timeline, long j, long j2) {
        C5200k0 k0Var;
        long j3;
        boolean z;
        C5198j0 j0Var = null;
        for (C5198j0 j0Var2 = this.f9285h; j0Var2 != null; j0Var2 = j0Var2.m30119j()) {
            C5200k0 k0Var2 = j0Var2.f9253f;
            if (j0Var == null) {
                k0Var = m30077q(timeline, k0Var2);
            } else {
                C5200k0 i = m30085i(timeline, j0Var, j);
                if (i == null) {
                    return !m30069y(j0Var);
                }
                if (!m30089e(k0Var2, i)) {
                    return !m30069y(j0Var);
                }
                k0Var = i;
            }
            j0Var2.f9253f = k0Var.m30102a(k0Var2.f9266c);
            if (!m30090d(k0Var2.f9268e, k0Var.f9268e)) {
                long j4 = k0Var.f9268e;
                if (j4 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = j0Var2.m30103z(j4);
                }
                if (j0Var2 != this.f9286i || (j2 != Long.MIN_VALUE && j2 < j3)) {
                    z = false;
                } else {
                    z = true;
                }
                if (m30069y(j0Var2) || z) {
                    return false;
                }
                return true;
            }
            j0Var = j0Var2;
        }
        return true;
    }

    /* renamed from: F */
    public boolean m30095F(Timeline timeline, int i) {
        this.f9283f = i;
        return m30097D(timeline);
    }

    /* renamed from: G */
    public boolean m30094G(Timeline timeline, boolean z) {
        this.f9284g = z;
        return m30097D(timeline);
    }

    /* renamed from: b */
    public C5198j0 m30092b() {
        C5198j0 j0Var = this.f9285h;
        if (j0Var == null) {
            return null;
        }
        if (j0Var == this.f9286i) {
            this.f9286i = j0Var.m30119j();
        }
        this.f9285h.m30109t();
        int i = this.f9288k - 1;
        this.f9288k = i;
        if (i == 0) {
            this.f9287j = null;
            C5198j0 j0Var2 = this.f9285h;
            this.f9289l = j0Var2.f9249b;
            this.f9290m = j0Var2.f9253f.f9264a.f18062d;
        }
        this.f9285h = this.f9285h.m30119j();
        m30071w();
        return this.f9285h;
    }

    /* renamed from: c */
    public C5198j0 m30091c() {
        boolean z;
        C5198j0 j0Var = this.f9286i;
        if (j0Var == null || j0Var.m30119j() == null) {
            z = false;
        } else {
            z = true;
        }
        C7510a.m22366f(z);
        this.f9286i = this.f9286i.m30119j();
        m30071w();
        return this.f9286i;
    }

    /* renamed from: f */
    public void m30088f() {
        if (this.f9288k != 0) {
            C5198j0 j0Var = (C5198j0) C7510a.m22364h(this.f9285h);
            this.f9289l = j0Var.f9249b;
            this.f9290m = j0Var.f9253f.f9264a.f18062d;
            while (j0Var != null) {
                j0Var.m30109t();
                j0Var = j0Var.m30119j();
            }
            this.f9285h = null;
            this.f9287j = null;
            this.f9286i = null;
            this.f9288k = 0;
            m30071w();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r1 != (-9223372036854775807L)) goto L_0x002c;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.C5198j0 m30087g(p079e7.AbstractC6733t[] r12, p029b9.AbstractC3425m r13, p081e9.AbstractC6765b r14, com.google.android.exoplayer2.C5210p0 r15, com.google.android.exoplayer2.C5200k0 r16, p029b9.C3427n r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            com.google.android.exoplayer2.j0 r1 = r0.f9287j
            if (r1 != 0) goto L_0x001e
            i8.u$a r1 = r8.f9264a
            boolean r1 = r1.m20020b()
            if (r1 == 0) goto L_0x001b
            long r1 = r8.f9266c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            r1 = 0
            goto L_0x002c
        L_0x001e:
            long r1 = r1.m30117l()
            com.google.android.exoplayer2.j0 r3 = r0.f9287j
            com.google.android.exoplayer2.k0 r3 = r3.f9253f
            long r3 = r3.f9268e
            long r1 = r1 + r3
            long r3 = r8.f9265b
            long r1 = r1 - r3
        L_0x002c:
            r3 = r1
            com.google.android.exoplayer2.j0 r10 = new com.google.android.exoplayer2.j0
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            com.google.android.exoplayer2.j0 r1 = r0.f9287j
            if (r1 == 0) goto L_0x0043
            r1.m30106w(r10)
            goto L_0x0047
        L_0x0043:
            r0.f9285h = r10
            r0.f9286i = r10
        L_0x0047:
            r1 = 0
            r0.f9289l = r1
            r0.f9287j = r10
            int r1 = r0.f9288k
            int r1 = r1 + 1
            r0.f9288k = r1
            r11.m30071w()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C5204m0.m30087g(e7.t[], b9.m, e9.b, com.google.android.exoplayer2.p0, com.google.android.exoplayer2.k0, b9.n):com.google.android.exoplayer2.j0");
    }

    /* renamed from: j */
    public C5198j0 m30084j() {
        return this.f9287j;
    }

    /* renamed from: n */
    public C5200k0 m30080n(long j, C5216q0 q0Var) {
        C5198j0 j0Var = this.f9287j;
        if (j0Var == null) {
            return m30086h(q0Var);
        }
        return m30085i(q0Var.f9321a, j0Var, j);
    }

    /* renamed from: o */
    public C5198j0 m30079o() {
        return this.f9285h;
    }

    /* renamed from: p */
    public C5198j0 m30078p() {
        return this.f9286i;
    }

    /* renamed from: q */
    public C5200k0 m30077q(Timeline timeline, C5200k0 k0Var) {
        long j;
        AbstractC8299u.C8300a aVar = k0Var.f9264a;
        boolean r = m30076r(aVar);
        boolean t = m30074t(timeline, aVar);
        boolean s = m30075s(timeline, aVar, r);
        timeline.mo30409h(k0Var.f9264a.f18059a, this.f9278a);
        if (aVar.m20020b()) {
            j = this.f9278a.m30432b(aVar.f18060b, aVar.f18061c);
        } else {
            j = k0Var.f9267d;
            if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
                j = this.f9278a.m30426h();
            }
        }
        return new C5200k0(aVar, k0Var.f9265b, k0Var.f9266c, k0Var.f9267d, j, r, t, s);
    }

    /* renamed from: u */
    public boolean m30073u(AbstractC8287r rVar) {
        C5198j0 j0Var = this.f9287j;
        return j0Var != null && j0Var.f9248a == rVar;
    }

    /* renamed from: x */
    public void m30070x(long j) {
        C5198j0 j0Var = this.f9287j;
        if (j0Var != null) {
            j0Var.m30110s(j);
        }
    }

    /* renamed from: y */
    public boolean m30069y(C5198j0 j0Var) {
        boolean z;
        boolean z2 = false;
        if (j0Var != null) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        if (j0Var.equals(this.f9287j)) {
            return false;
        }
        this.f9287j = j0Var;
        while (j0Var.m30119j() != null) {
            j0Var = j0Var.m30119j();
            if (j0Var == this.f9286i) {
                this.f9286i = this.f9285h;
                z2 = true;
            }
            j0Var.m30109t();
            this.f9288k--;
        }
        this.f9287j.m30106w(null);
        m30071w();
        return z2;
    }

    /* renamed from: z */
    public AbstractC8299u.C8300a m30068z(Timeline timeline, Object obj, long j) {
        return m30100A(timeline, obj, j, m30099B(timeline, obj), this.f9278a);
    }
}
