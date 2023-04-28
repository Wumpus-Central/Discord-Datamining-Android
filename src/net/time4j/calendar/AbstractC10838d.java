package net.time4j.calendar;

import net.time4j.C10779a0;
import net.time4j.C10892f0;
import net.time4j.base.C10813c;
import net.time4j.calendar.AbstractC10840f;
import net.time4j.p248tz.C11028p;
import p121gj.C7700c;
import p121gj.EnumC7698b;
import p121gj.EnumC7702d;
import p143hj.AbstractC8068k;
import p143hj.EnumC8042a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.calendar.d */
/* loaded from: classes8.dex */
public abstract class AbstractC10838d<D extends AbstractC10840f<?, D>> implements AbstractC8068k<D> {

    /* renamed from: a */
    private static final long f24036a = C10892f0.m11875L0(1645, 1, 28).mo12079c();

    /* renamed from: b */
    private static final long f24037b = C10892f0.m11875L0(3000, 1, 27).mo12079c();

    /* renamed from: c */
    private static final long f24038c = C10892f0.m11875L0(-2636, 2, 15).mo12079c();

    /* renamed from: f */
    private long m12105f(int i, int i2, C10847h hVar) {
        long p = m12095p(m12094q(i, i2) + ((hVar.getNumber() - 1) * 29));
        if (hVar.equals(mo11790b(p).m12075f0())) {
            return p;
        }
        return m12095p(p + 1);
    }

    /* renamed from: j */
    private boolean m12101j(long j, long j2) {
        return j2 >= j && (m12100k(j2) || m12101j(j, m12096o(j2)));
    }

    /* renamed from: m */
    private static long m12098m(long j, long j2) {
        return Math.round((j2 - j) / 29.530588861d);
    }

    /* renamed from: o */
    private long m12096o(long j) {
        return EnumC7702d.NEW_MOON.m21621c(m12097n(j)).m12300w0(mo12102i(j)).m11645i0().mo12079c();
    }

    /* renamed from: r */
    private long m12093r(long j) {
        long w = m12088w(j);
        long w2 = m12088w(370 + w);
        long p = m12095p(w + 1);
        long p2 = m12095p(p + 1);
        if (m12098m(p, m12096o(w2 + 1)) != 12 || (!m12100k(p) && !m12100k(p2))) {
            return p2;
        }
        return m12095p(p2 + 1);
    }

    /* renamed from: s */
    private long m12092s(long j) {
        long r = m12093r(j);
        if (j >= r) {
            return r;
        }
        return m12093r(j - 180);
    }

    /* renamed from: w */
    private long m12088w(long j) {
        int i;
        C11028p i2 = mo12102i(j);
        C10892f0 Q0 = C10892f0.m11869Q0(j, EnumC8042a0.UTC);
        if (Q0.mo11642n() <= 11 || Q0.mo11641o() <= 15) {
            i = Q0.mo11643m() - 1;
        } else {
            i = Q0.mo11643m();
        }
        EnumC7698b bVar = EnumC7698b.WINTER_SOLSTICE;
        C10892f0 Y = bVar.m21635c(i).m12300w0(i2).m11657Y();
        if (Y.m20670R(Q0)) {
            Y = bVar.m21635c(i - 1).m12300w0(i2).m11657Y();
        }
        return Y.mo12079c();
    }

    @Override // p143hj.AbstractC8068k
    /* renamed from: a */
    public final long mo11791a() {
        return f24037b;
    }

    @Override // p143hj.AbstractC8068k
    /* renamed from: d */
    public long mo11788d() {
        return f24036a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract D mo12106e(int i, int i2, C10847h hVar, int i3, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final int m12104g(int i, int i2) {
        int[] h = mo12103h();
        int i3 = (((i - 1) * 60) + i2) - 1;
        int i4 = ((i3 - h[0]) / 3) * 2;
        while (i4 < h.length) {
            int i5 = h[i4];
            if (i5 < i3) {
                i4 += Math.max(((i3 - i5) / 3) * 2, 2);
            } else if (i5 > i3) {
                return 0;
            } else {
                return h[i4 + 1];
            }
        }
        return 0;
    }

    /* renamed from: h */
    abstract int[] mo12103h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract C11028p mo12102i(long j);

    /* renamed from: k */
    final boolean m12100k(long j) {
        if ((((int) Math.floor(EnumC10863p.m11953l(C7700c.m21625g(m12097n(j)).m21629c()) / 30.0d)) + 2) % 12 == (((int) Math.floor(EnumC10863p.m11953l(C7700c.m21625g(m12097n(m12095p(j + 1))).m21629c()) / 30.0d)) + 2) % 12) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    boolean m12099l(int i, int i2, C10847h hVar, int i3) {
        if (i < 72 || i > 94 || i2 < 1 || i2 > 60 || ((i == 72 && i2 < 22) || ((i == 94 && i2 > 56) || i3 < 1 || i3 > 30 || hVar == null || (hVar.m12032c() && hVar.getNumber() != m12104g(i, i2))))) {
            return false;
        }
        if (i3 != 30) {
            return true;
        }
        long f = m12105f(i, i2, hVar);
        if (m12095p(1 + f) - f == 30) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public C10779a0 m12097n(long j) {
        return C10892f0.m11869Q0(j, EnumC8042a0.UTC).m11837t0().m11662T(mo12102i(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final long m12095p(long j) {
        return EnumC7702d.NEW_MOON.m21622b(m12097n(j)).m12300w0(mo12102i(j)).m11645i0().mo12079c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final long m12094q(int i, int i2) {
        return m12092s((long) Math.floor(f24038c + (((((i - 1) * 60) + i2) - 0.5d) * 365.242189d)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final long m12091t(int i, int i2, C10847h hVar, int i3) {
        if (m12099l(i, i2, hVar, i3)) {
            return (m12105f(i, i2, hVar) + i3) - 1;
        }
        throw new IllegalArgumentException("Invalid date.");
    }

    /* renamed from: u */
    public final long mo11789c(D d) {
        return m12091t(d.m12082Z(), d.m12071j0().getNumber(), d.m12075f0(), d.m12069o());
    }

    /* renamed from: v */
    public final D mo11790b(long j) {
        boolean z;
        long w = m12088w(j);
        long w2 = m12088w(370 + w);
        long p = m12095p(w + 1);
        long o = m12096o(w2 + 1);
        long o2 = m12096o(j + 1);
        if (m12098m(p, o) == 12) {
            z = true;
        } else {
            z = false;
        }
        long m = m12098m(p, o2);
        if (z && m12101j(p, o2)) {
            m--;
        }
        int i = 12;
        int d = C10813c.m12199d(m, 12);
        if (d != 0) {
            i = d;
        }
        long floor = (long) Math.floor((1.5d - (i / 12.0d)) + ((j - f24038c) / 365.242189d));
        int i2 = 60;
        int b = 1 + ((int) C10813c.m12201b(floor - 1, 60));
        int d2 = C10813c.m12199d(floor, 60);
        if (d2 != 0) {
            i2 = d2;
        }
        int i3 = (int) ((j - o2) + 1);
        C10847h d3 = C10847h.m12031d(i);
        if (z && m12100k(o2) && !m12101j(p, m12096o(o2))) {
            d3 = d3.m12030e();
        }
        return mo12106e(b, i2, d3, i3, j);
    }
}
