package p163j$.time;

import java.io.Serializable;
import p163j$.time.chrono.AbstractC9170b;
import p163j$.time.chrono.C9176h;
import p163j$.time.temporal.AbstractC9222j;
import p163j$.time.temporal.AbstractC9223k;
import p163j$.time.temporal.AbstractC9224l;
import p163j$.time.temporal.AbstractC9226n;
import p163j$.time.temporal.C9228p;
import p163j$.time.temporal.C9229q;
import p163j$.time.temporal.EnumC9213a;
import p163j$.time.temporal.EnumC9214b;

/* renamed from: j$.time.g */
/* loaded from: classes2.dex */
public final class C9203g implements AbstractC9223k, AbstractC9170b, Serializable {

    /* renamed from: d */
    public static final C9203g f20202d = m16676n(-999999999, 1, 1);

    /* renamed from: e */
    public static final C9203g f20203e = m16676n(999999999, 12, 31);

    /* renamed from: a */
    private final int f20204a;

    /* renamed from: b */
    private final short f20205b;

    /* renamed from: c */
    private final short f20206c;

    private C9203g(int i, int i2, int i3) {
        this.f20204a = i;
        this.f20205b = (short) i2;
        this.f20206c = (short) i3;
    }

    /* renamed from: h */
    public static C9203g m16682h(AbstractC9223k kVar) {
        if (kVar != null) {
            C9203g gVar = (C9203g) kVar.mo16632d(AbstractC9222j.m16641e());
            if (gVar != null) {
                return gVar;
            }
            throw new C9167b("Unable to obtain LocalDate from TemporalAccessor: " + kVar + " of type " + kVar.getClass().getName());
        }
        throw new NullPointerException("temporal");
    }

    /* renamed from: i */
    private int m16681i(AbstractC9224l lVar) {
        int i;
        int k;
        int i2 = AbstractC9179f.f20147a[((EnumC9213a) lVar).ordinal()];
        int i3 = this.f20204a;
        short s = this.f20206c;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return m16679k();
            case 3:
                i = (s - 1) / 7;
                return i + 1;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return m16680j().ordinal() + 1;
            case 6:
                i = (s - 1) % 7;
                return i + 1;
            case 7:
                k = (m16679k() - 1) % 7;
                return k + 1;
            case 8:
                throw new C9228p("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                k = (m16679k() - 1) / 7;
                return k + 1;
            case 10:
                return this.f20205b;
            case 11:
                throw new C9228p("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new C9228p("Unsupported field: " + lVar);
        }
    }

    /* renamed from: n */
    public static C9203g m16676n(int i, int i2, int i3) {
        long j = i;
        EnumC9213a.YEAR.m16653h(j);
        EnumC9213a.MONTH_OF_YEAR.m16653h(i2);
        EnumC9213a.DAY_OF_MONTH.m16653h(i3);
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                C9176h.f20141a.getClass();
                if (C9176h.m16727a(j)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new C9167b("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new C9167b("Invalid date '" + EnumC9207k.m16663g(i2).name() + " " + i3 + "'");
            }
        }
        return new C9203g(i, i2, i3);
    }

    /* renamed from: o */
    public static C9203g m16675o(long j) {
        long j2;
        long j3 = (j + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new C9203g(EnumC9213a.YEAR.m16654g(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: a */
    public final C9229q mo16635a(AbstractC9224l lVar) {
        int i;
        if (!(lVar instanceof EnumC9213a)) {
            return lVar.mo16629b(this);
        }
        EnumC9213a aVar = (EnumC9213a) lVar;
        if (aVar.mo16628c()) {
            int i2 = AbstractC9179f.f20147a[aVar.ordinal()];
            short s = this.f20205b;
            if (i2 == 1) {
                i = s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : m16677m() ? 29 : 28;
            } else if (i2 == 2) {
                i = m16677m() ? 366 : 365;
            } else if (i2 == 3) {
                return C9229q.m16615i(1L, (EnumC9207k.m16663g(s) != EnumC9207k.FEBRUARY || m16677m()) ? 5L : 4L);
            } else if (i2 != 4) {
                return lVar.mo16627d();
            } else {
                return C9229q.m16615i(1L, this.f20204a <= 0 ? 1000000000L : 999999999L);
            }
            return C9229q.m16615i(1L, i);
        }
        throw new C9228p("Unsupported field: " + lVar);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: b */
    public final boolean mo16634b(AbstractC9224l lVar) {
        return lVar instanceof EnumC9213a ? lVar.mo16628c() : lVar != null && lVar.mo16630a(this);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: c */
    public final long mo16633c(AbstractC9224l lVar) {
        return lVar instanceof EnumC9213a ? lVar == EnumC9213a.EPOCH_DAY ? m16673q() : lVar == EnumC9213a.PROLEPTIC_MONTH ? ((this.f20204a * 12) + this.f20205b) - 1 : m16681i(lVar) : lVar.mo16625f(this);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: d */
    public final Object mo16632d(AbstractC9226n nVar) {
        if (nVar == AbstractC9222j.m16641e()) {
            return this;
        }
        if (nVar == AbstractC9222j.m16636j() || nVar == AbstractC9222j.m16637i() || nVar == AbstractC9222j.m16639g() || nVar == AbstractC9222j.m16640f()) {
            return null;
        }
        return nVar == AbstractC9222j.m16642d() ? C9176h.f20141a : nVar == AbstractC9222j.m16638h() ? EnumC9214b.DAYS : nVar.mo16624a(this);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: e */
    public final int mo16631e(EnumC9213a aVar) {
        return aVar instanceof EnumC9213a ? m16681i(aVar) : AbstractC9222j.m16645a(this, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9203g) && m16683g((C9203g) obj) == 0;
    }

    /* renamed from: f */
    public final int compareTo(AbstractC9170b bVar) {
        if (bVar instanceof C9203g) {
            return m16683g((C9203g) bVar);
        }
        int compare = Long.compare(m16673q(), ((C9203g) bVar).m16673q());
        if (compare != 0) {
            return compare;
        }
        C9176h.f20141a.getClass();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final int m16683g(C9203g gVar) {
        int i = this.f20204a - gVar.f20204a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f20205b - gVar.f20205b;
        return i2 == 0 ? this.f20206c - gVar.f20206c : i2;
    }

    public final int hashCode() {
        int i = this.f20204a;
        return (((i << 11) + (this.f20205b << 6)) + this.f20206c) ^ (i & (-2048));
    }

    /* renamed from: j */
    public final EnumC9168c m16680j() {
        return EnumC9168c.m16729f(((int) AbstractC9166a.m16731c(m16673q() + 3, 7L)) + 1);
    }

    /* renamed from: k */
    public final int m16679k() {
        return (EnumC9207k.m16663g(this.f20205b).m16664f(m16677m()) + this.f20206c) - 1;
    }

    /* renamed from: l */
    public final int m16678l() {
        return this.f20204a;
    }

    /* renamed from: m */
    public final boolean m16677m() {
        C9176h.f20141a.getClass();
        return C9176h.m16727a(this.f20204a);
    }

    /* renamed from: p */
    public final C9203g m16674p(long j) {
        int i;
        if (j == 0) {
            return this;
        }
        int g = EnumC9213a.YEAR.m16654g(this.f20204a + j);
        short s = this.f20205b;
        int i2 = this.f20206c;
        if (s != 2) {
            if (s == 4 || s == 6 || s == 9 || s == 11) {
                i = 30;
            }
            return new C9203g(g, s, i2);
        }
        C9176h.f20141a.getClass();
        i = C9176h.m16727a((long) g) ? 29 : 28;
        i2 = Math.min(i2, i);
        return new C9203g(g, s, i2);
    }

    /* renamed from: q */
    public final long m16673q() {
        long j;
        long j2 = this.f20204a;
        long j3 = this.f20205b;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + (this.f20206c - 1);
        if (j3 > 2) {
            j5--;
            if (!m16677m()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    /* renamed from: r */
    public final C9203g m16672r() {
        if (m16679k() == 180) {
            return this;
        }
        EnumC9213a aVar = EnumC9213a.YEAR;
        int i = this.f20204a;
        long j = i;
        aVar.m16653h(j);
        EnumC9213a.DAY_OF_YEAR.m16653h(180);
        C9176h.f20141a.getClass();
        boolean a = C9176h.m16727a(j);
        EnumC9207k g = EnumC9207k.m16663g(6);
        int f = g.m16664f(a);
        int i2 = AbstractC9206j.f20216a[g.ordinal()];
        if (180 > (f + (i2 != 1 ? (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31 : a ? 29 : 28)) - 1) {
            g = g.m16662h();
        }
        return new C9203g(i, g.ordinal() + 1, (180 - g.m16664f(a)) + 1);
    }

    public final String toString() {
        int i;
        int i2 = this.f20204a;
        int abs = Math.abs(i2);
        StringBuilder sb2 = new StringBuilder(10);
        if (abs < 1000) {
            if (i2 < 0) {
                sb2.append(i2 - 10000);
                i = 1;
            } else {
                sb2.append(i2 + 10000);
                i = 0;
            }
            sb2.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb2.append('+');
            }
            sb2.append(i2);
        }
        String str = "-0";
        short s = this.f20205b;
        sb2.append(s < 10 ? str : "-");
        sb2.append((int) s);
        short s2 = this.f20206c;
        if (s2 >= 10) {
            str = "-";
        }
        sb2.append(str);
        sb2.append((int) s2);
        return sb2.toString();
    }
}
