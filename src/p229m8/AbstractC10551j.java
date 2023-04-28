package p229m8;

import java.util.List;
import p079e7.C6722k;
import p119g9.C7557q0;

/* renamed from: m8.j */
/* loaded from: classes7.dex */
public abstract class AbstractC10551j {

    /* renamed from: a */
    final C10546h f23363a;

    /* renamed from: b */
    final long f23364b;

    /* renamed from: c */
    final long f23365c;

    /* renamed from: m8.j$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC10552a extends AbstractC10551j {

        /* renamed from: d */
        final long f23366d;

        /* renamed from: e */
        final long f23367e;

        /* renamed from: f */
        final List<C10555d> f23368f;

        /* renamed from: g */
        private final long f23369g;

        /* renamed from: h */
        private final long f23370h;

        /* renamed from: i */
        final long f23371i;

        public AbstractC10552a(C10546h hVar, long j, long j2, long j3, long j4, List<C10555d> list, long j5, long j6, long j7) {
            super(hVar, j, j2);
            this.f23366d = j3;
            this.f23367e = j4;
            this.f23368f = list;
            this.f23371i = j5;
            this.f23369g = j6;
            this.f23370h = j7;
        }

        /* renamed from: c */
        public int m12838c(long j, long j2) {
            int g = mo12829g(j);
            if (g != -1) {
                return g;
            }
            return (int) (m12833i((j2 - this.f23370h) + this.f23371i, j) - m12837d(j, j2));
        }

        /* renamed from: d */
        public long m12837d(long j, long j2) {
            if (mo12829g(j) == -1) {
                long j3 = this.f23369g;
                if (j3 != -9223372036854775807L) {
                    return Math.max(m12836e(), m12833i((j2 - this.f23370h) - j3, j));
                }
            }
            return m12836e();
        }

        /* renamed from: e */
        public long m12836e() {
            return this.f23366d;
        }

        /* renamed from: f */
        public long m12835f(long j, long j2) {
            if (this.f23368f != null) {
                return -9223372036854775807L;
            }
            long d = m12837d(j, j2) + m12838c(j, j2);
            return (m12832j(d) + m12834h(d, j)) - this.f23371i;
        }

        /* renamed from: g */
        public abstract int mo12829g(long j);

        /* renamed from: h */
        public final long m12834h(long j, long j2) {
            List<C10555d> list = this.f23368f;
            if (list != null) {
                return (list.get((int) (j - this.f23366d)).f23377b * 1000000) / this.f23364b;
            }
            int g = mo12829g(j2);
            if (g == -1 || j != (m12836e() + g) - 1) {
                return (this.f23367e * 1000000) / this.f23364b;
            }
            return j2 - m12832j(j);
        }

        /* renamed from: i */
        public long m12833i(long j, long j2) {
            long e = m12836e();
            long g = mo12829g(j2);
            if (g == 0) {
                return e;
            }
            if (this.f23368f == null) {
                long j3 = this.f23366d + (j / ((this.f23367e * 1000000) / this.f23364b));
                if (j3 < e) {
                    return e;
                }
                if (g == -1) {
                    return j3;
                }
                return Math.min(j3, (e + g) - 1);
            }
            long j4 = (g + e) - 1;
            long j5 = e;
            while (j5 <= j4) {
                long j6 = ((j4 - j5) / 2) + j5;
                int i = (m12832j(j6) > j ? 1 : (m12832j(j6) == j ? 0 : -1));
                if (i < 0) {
                    j5 = j6 + 1;
                } else if (i <= 0) {
                    return j6;
                } else {
                    j4 = j6 - 1;
                }
            }
            if (j5 == e) {
                return j5;
            }
            return j4;
        }

        /* renamed from: j */
        public final long m12832j(long j) {
            long j2;
            List<C10555d> list = this.f23368f;
            if (list != null) {
                j2 = list.get((int) (j - this.f23366d)).f23376a - this.f23365c;
            } else {
                j2 = (j - this.f23366d) * this.f23367e;
            }
            return C7557q0.m22198I0(j2, 1000000L, this.f23364b);
        }

        /* renamed from: k */
        public abstract C10546h mo12828k(AbstractC10547i iVar, long j);

        /* renamed from: l */
        public boolean mo12831l() {
            return this.f23368f != null;
        }
    }

    /* renamed from: m8.j$b */
    /* loaded from: classes7.dex */
    public static final class C10553b extends AbstractC10552a {

        /* renamed from: j */
        final List<C10546h> f23372j;

        public C10553b(C10546h hVar, long j, long j2, long j3, long j4, List<C10555d> list, long j5, List<C10546h> list2, long j6, long j7) {
            super(hVar, j, j2, j3, j4, list, j5, j6, j7);
            this.f23372j = list2;
        }

        @Override // p229m8.AbstractC10551j.AbstractC10552a
        /* renamed from: g */
        public int mo12829g(long j) {
            return this.f23372j.size();
        }

        @Override // p229m8.AbstractC10551j.AbstractC10552a
        /* renamed from: k */
        public C10546h mo12828k(AbstractC10547i iVar, long j) {
            return this.f23372j.get((int) (j - this.f23366d));
        }

        @Override // p229m8.AbstractC10551j.AbstractC10552a
        /* renamed from: l */
        public boolean mo12831l() {
            return true;
        }
    }

    /* renamed from: m8.j$c */
    /* loaded from: classes7.dex */
    public static final class C10554c extends AbstractC10552a {

        /* renamed from: j */
        final C10559m f23373j;

        /* renamed from: k */
        final C10559m f23374k;

        /* renamed from: l */
        final long f23375l;

        public C10554c(C10546h hVar, long j, long j2, long j3, long j4, long j5, List<C10555d> list, long j6, C10559m mVar, C10559m mVar2, long j7, long j8) {
            super(hVar, j, j2, j3, j5, list, j6, j7, j8);
            this.f23373j = mVar;
            this.f23374k = mVar2;
            this.f23375l = j4;
        }

        @Override // p229m8.AbstractC10551j
        /* renamed from: a */
        public C10546h mo12830a(AbstractC10547i iVar) {
            C10559m mVar = this.f23373j;
            if (mVar == null) {
                return AbstractC10551j.super.mo12830a(iVar);
            }
            C6722k kVar = iVar.f23352b;
            return new C10546h(mVar.m12816a(kVar.f14318k, 0L, kVar.f14325r, 0L), 0L, -1L);
        }

        @Override // p229m8.AbstractC10551j.AbstractC10552a
        /* renamed from: g */
        public int mo12829g(long j) {
            List<C10555d> list = this.f23368f;
            if (list != null) {
                return list.size();
            }
            long j2 = this.f23375l;
            if (j2 != -1) {
                return (int) ((j2 - this.f23366d) + 1);
            }
            if (j != -9223372036854775807L) {
                return (int) C7557q0.m22139m(j, (this.f23367e * 1000000) / this.f23364b);
            }
            return -1;
        }

        @Override // p229m8.AbstractC10551j.AbstractC10552a
        /* renamed from: k */
        public C10546h mo12828k(AbstractC10547i iVar, long j) {
            long j2;
            List<C10555d> list = this.f23368f;
            if (list != null) {
                j2 = list.get((int) (j - this.f23366d)).f23376a;
            } else {
                j2 = (j - this.f23366d) * this.f23367e;
            }
            C10559m mVar = this.f23374k;
            C6722k kVar = iVar.f23352b;
            return new C10546h(mVar.m12816a(kVar.f14318k, j, kVar.f14325r, j2), 0L, -1L);
        }
    }

    /* renamed from: m8.j$d */
    /* loaded from: classes7.dex */
    public static final class C10555d {

        /* renamed from: a */
        final long f23376a;

        /* renamed from: b */
        final long f23377b;

        public C10555d(long j, long j2) {
            this.f23376a = j;
            this.f23377b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C10555d.class != obj.getClass()) {
                return false;
            }
            C10555d dVar = (C10555d) obj;
            if (this.f23376a == dVar.f23376a && this.f23377b == dVar.f23377b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f23376a) * 31) + ((int) this.f23377b);
        }
    }

    public AbstractC10551j(C10546h hVar, long j, long j2) {
        this.f23363a = hVar;
        this.f23364b = j;
        this.f23365c = j2;
    }

    /* renamed from: a */
    public C10546h mo12830a(AbstractC10547i iVar) {
        return this.f23363a;
    }

    /* renamed from: b */
    public long m12839b() {
        return C7557q0.m22198I0(this.f23365c, 1000000L, this.f23364b);
    }

    /* renamed from: m8.j$e */
    /* loaded from: classes7.dex */
    public static class C10556e extends AbstractC10551j {

        /* renamed from: d */
        final long f23378d;

        /* renamed from: e */
        final long f23379e;

        public C10556e(C10546h hVar, long j, long j2, long j3, long j4) {
            super(hVar, j, j2);
            this.f23378d = j3;
            this.f23379e = j4;
        }

        /* renamed from: c */
        public C10546h m12827c() {
            long j = this.f23379e;
            if (j <= 0) {
                return null;
            }
            return new C10546h(null, this.f23378d, j);
        }

        public C10556e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
