package net.time4j.calendar;

import java.util.Locale;
import net.time4j.base.C10813c;
import net.time4j.calendar.AbstractC10840f;
import p143hj.AbstractC8047c0;
import p143hj.AbstractC8073m;
import p143hj.AbstractC8074m0;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8091z;
import p161ij.AbstractC8633c;

/* renamed from: net.time4j.calendar.f */
/* loaded from: classes8.dex */
public abstract class AbstractC10840f<U, D extends AbstractC10840f<U, D>> extends AbstractC8073m<U, D> {

    /* renamed from: k */
    private final transient int f24040k;

    /* renamed from: l */
    private final transient int f24041l;

    /* renamed from: m */
    private final transient C10847h f24042m;

    /* renamed from: n */
    private final transient int f24043n;

    /* renamed from: o */
    private final transient long f24044o;

    /* renamed from: p */
    private final transient int f24045p;

    /* renamed from: net.time4j.calendar.f$b */
    /* loaded from: classes8.dex */
    private static class C10842b<D extends AbstractC10840f<?, D>> implements AbstractC8091z<D, C10836c> {

        /* renamed from: k */
        private final AbstractC8079p<?> f24046k;

        /* renamed from: l */
        private final boolean f24047l;

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(D d) {
            return this.f24046k;
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(D d) {
            return this.f24046k;
        }

        /* renamed from: f */
        public C10836c mo11084d(D d) {
            return C10836c.m12108n(d.m12082Z() == 94 ? 56 : 60);
        }

        /* renamed from: i */
        public C10836c mo11078k(D d) {
            if (this.f24047l) {
                if (d.m12082Z() == 75) {
                    return C10836c.m12108n(10);
                }
                return C10836c.m12108n(1);
            } else if (d.m12082Z() == 72) {
                return C10836c.m12108n(22);
            } else {
                return C10836c.m12108n(1);
            }
        }

        /* renamed from: j */
        public C10836c mo11076n(D d) {
            return d.m12071j0();
        }

        /* renamed from: o */
        public boolean mo11081h(D d, C10836c cVar) {
            C10836c i = mo11078k(d);
            C10836c f = mo11084d(d);
            if (cVar == null || i.compareTo(cVar) > 0 || f.compareTo(cVar) < 0) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* JADX WARN: Type inference failed for: r8v8, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* renamed from: p */
        public D mo11077m(D d, C10836c cVar, boolean z) {
            C10847h hVar;
            if (mo11081h(d, cVar)) {
                AbstractC10838d<D> Y = d.mo12083Y();
                int o = d.m12069o();
                C10847h f0 = d.m12075f0();
                int number = cVar.getNumber();
                int Z = d.m12082Z();
                if (!f0.m12032c() || f0.getNumber() == Y.m12104g(Z, number)) {
                    hVar = f0;
                } else {
                    hVar = C10847h.m12031d(f0.getNumber());
                }
                if (o <= 29) {
                    return Y.mo12106e(Z, number, hVar, o, Y.m12091t(Z, number, hVar, o));
                }
                long t = Y.m12091t(Z, number, hVar, 1);
                int min = Math.min(o, Y.mo11790b(t).lengthOfMonth());
                return Y.mo12106e(Z, number, hVar, min, (t + min) - 1);
            }
            throw new IllegalArgumentException("Invalid cyclic year: " + cVar);
        }

        private C10842b(AbstractC8079p<?> pVar, boolean z) {
            this.f24046k = pVar;
            this.f24047l = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.calendar.f$c */
    /* loaded from: classes8.dex */
    public static class C10843c<D extends AbstractC10840f<?, D>> implements AbstractC8074m0<D> {

        /* renamed from: a */
        private final int f24048a;

        C10843c(int i) {
            this.f24048a = i;
        }

        /* renamed from: e */
        private static <D extends AbstractC10840f<?, D>> long m12059e(D d, D d2, int i) {
            int a;
            D d3;
            D d4;
            int g;
            AbstractC10838d<D> Y = d.mo12083Y();
            if (i == 0) {
                return m12059e(d, d2, 1) / 60;
            }
            if (i == 1) {
                int Z = (((d2.m12082Z() * 60) + d2.m12071j0().getNumber()) - (d.m12082Z() * 60)) - d.m12071j0().getNumber();
                if (Z > 0) {
                    int a2 = d.m12075f0().compareTo(d2.m12075f0());
                    if (a2 > 0 || (a2 == 0 && d.m12069o() > d2.m12069o())) {
                        Z--;
                    }
                } else if (Z < 0 && ((a = d.m12075f0().compareTo(d2.m12075f0())) < 0 || (a == 0 && d.m12069o() < d2.m12069o()))) {
                    Z++;
                }
                return Z;
            } else if (i == 2) {
                boolean R = d.m20670R(d2);
                if (R) {
                    d3 = d;
                    d4 = d2;
                } else {
                    d4 = d;
                    d3 = d2;
                }
                int Z2 = d4.m12082Z();
                int number = d4.m12071j0().getNumber();
                C10847h f0 = d4.m12075f0();
                int number2 = f0.getNumber();
                boolean c = f0.m12032c();
                int g2 = Y.m12104g(Z2, number);
                int i2 = 0;
                while (true) {
                    if (Z2 == d3.m12082Z() && number == d3.m12071j0().getNumber() && f0.equals(d3.m12075f0())) {
                        break;
                    }
                    if (c) {
                        number2++;
                        c = false;
                    } else if (g2 == number2) {
                        c = true;
                    } else {
                        number2++;
                    }
                    if (!c) {
                        if (number2 == 13) {
                            number++;
                            if (number == 61) {
                                Z2++;
                                number = 1;
                            }
                            g = Y.m12104g(Z2, number);
                            number2 = 1;
                        } else if (number2 == 0) {
                            number--;
                            if (number == 0) {
                                Z2--;
                                number = 60;
                            }
                            g = Y.m12104g(Z2, number);
                            number2 = 12;
                        }
                        g2 = g;
                    }
                    f0 = C10847h.m12031d(number2);
                    if (c) {
                        f0 = f0.m12030e();
                    }
                    i2++;
                }
                if (i2 > 0 && d4.m12069o() > d3.m12069o()) {
                    i2--;
                }
                if (R) {
                    i2 = -i2;
                }
                return i2;
            } else if (i == 3) {
                return (d2.mo12079c() - d.mo12079c()) / 7;
            } else {
                if (i == 4) {
                    return d2.mo12079c() - d.mo12079c();
                }
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: f */
        private static void m12058f(long j) {
            if (j > 1200 || j < -1200) {
                throw new ArithmeticException("Month arithmetic limited to delta not greater than 1200.");
            }
        }

        /* renamed from: g */
        private static <D extends AbstractC10840f<?, D>> D m12057g(int i, int i2, C10847h hVar, int i3, AbstractC10838d<D> dVar) {
            if (i3 <= 29) {
                return dVar.mo12106e(i, i2, hVar, i3, dVar.m12091t(i, i2, hVar, i3));
            }
            long t = dVar.m12091t(i, i2, hVar, 1);
            int min = Math.min(i3, dVar.mo11790b(t).lengthOfMonth());
            return dVar.mo12106e(i, i2, hVar, min, (t + min) - 1);
        }

        /* JADX WARN: Type inference failed for: r0v15, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* renamed from: c */
        public D mo11636b(D d, long j) {
            int i;
            long j2 = j;
            AbstractC10838d<D> Y = d.mo12083Y();
            int o = d.m12069o();
            int Z = d.m12082Z();
            int number = d.m12071j0().getNumber();
            C10847h f0 = d.m12075f0();
            int i2 = this.f24048a;
            if (i2 == 0) {
                j2 = C10813c.m12194i(j2, 60L);
            } else if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        j2 = C10813c.m12194i(j2, 7L);
                    } else if (i2 != 4) {
                        throw new UnsupportedOperationException();
                    }
                    return Y.mo11790b(C10813c.m12197f(d.mo12079c(), j2));
                }
                m12058f(j);
                if (j2 > 0) {
                    i = 1;
                } else {
                    i = -1;
                }
                int number2 = f0.getNumber();
                boolean c = f0.m12032c();
                int g = Y.m12104g(Z, number);
                for (long j3 = 0; j2 != j3; j3 = 0) {
                    if (c) {
                        c = false;
                        if (i == 1) {
                            number2++;
                        }
                    } else {
                        if (!(i == 1 && g == number2)) {
                            if (i == -1 && g == number2 - 1) {
                                number2--;
                            } else {
                                number2 += i;
                            }
                        }
                        c = true;
                    }
                    if (!c) {
                        if (number2 == 13) {
                            number++;
                            if (number == 61) {
                                Z++;
                                number = 1;
                            }
                            number2 = 1;
                            g = Y.m12104g(Z, number);
                        } else if (number2 == 0) {
                            number--;
                            if (number == 0) {
                                Z--;
                                number = 60;
                            }
                            g = Y.m12104g(Z, number);
                            number2 = 12;
                        }
                    }
                    j2 -= i;
                }
                C10847h d2 = C10847h.m12031d(number2);
                if (c) {
                    d2 = d2.m12030e();
                }
                return (D) m12057g(Z, number, d2, o, Y);
            }
            long f = C10813c.m12197f(((Z * 60) + number) - 1, j2);
            int g2 = C10813c.m12196g(C10813c.m12201b(f, 60));
            int d3 = C10813c.m12199d(f, 60) + 1;
            if (f0.m12032c() && Y.m12104g(g2, d3) != f0.getNumber()) {
                f0 = C10847h.m12031d(f0.getNumber());
            }
            return (D) m12057g(g2, d3, f0, o, Y);
        }

        /* renamed from: d */
        public long mo11637a(D d, D d2) {
            return m12059e(d, d2, this.f24048a);
        }
    }

    /* renamed from: net.time4j.calendar.f$d */
    /* loaded from: classes8.dex */
    private static class C10844d<D extends AbstractC10840f<?, D>> implements AbstractC8047c0<D> {

        /* renamed from: k */
        private final AbstractC8079p<?> f24049k;

        /* renamed from: l */
        private final int f24050l;

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(D d) {
            return this.f24049k;
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(D d) {
            return this.f24049k;
        }

        /* renamed from: f */
        public int mo11808l(D d) {
            int i = this.f24050l;
            if (i == 0) {
                return d.m12069o();
            }
            if (i == 1) {
                return d.m12078c0();
            }
            if (i == 2) {
                int number = d.m12075f0().getNumber();
                int e0 = d.m12076e0();
                if ((e0 <= 0 || e0 >= number) && !d.m12075f0().m12032c()) {
                    return number;
                }
                return number + 1;
            } else if (i == 3) {
                return d.m12082Z();
            } else {
                throw new UnsupportedOperationException("Unknown element index: " + this.f24050l);
            }
        }

        /* renamed from: i */
        public Integer mo11084d(D d) {
            int i;
            int i2 = this.f24050l;
            if (i2 == 0) {
                i = d.lengthOfMonth();
            } else if (i2 == 1) {
                i = d.lengthOfYear();
            } else if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC10838d<D> Y = d.mo12083Y();
                    i = ((AbstractC10840f) Y.mo11790b(Y.mo11791a())).m12082Z();
                } else {
                    throw new UnsupportedOperationException("Unknown element index: " + this.f24050l);
                }
            } else if (d.isLeapYear()) {
                i = 13;
            } else {
                i = 12;
            }
            return Integer.valueOf(i);
        }

        /* renamed from: j */
        public Integer mo11078k(D d) {
            if (this.f24050l != 3) {
                return 1;
            }
            AbstractC10838d<D> Y = d.mo12083Y();
            return Integer.valueOf(((AbstractC10840f) Y.mo11790b(Y.mo11788d())).m12082Z());
        }

        /* renamed from: o */
        public Integer mo11076n(D d) {
            return Integer.valueOf(mo11808l(d));
        }

        /* renamed from: p */
        public boolean m12050p(D d, int i) {
            if (i < 1) {
                return false;
            }
            int i2 = this.f24050l;
            if (i2 == 0) {
                if (i > 30) {
                    return false;
                }
                if (i != 30 || d.lengthOfMonth() == 30) {
                    return true;
                }
                return false;
            } else if (i2 == 1) {
                if (i <= d.lengthOfYear()) {
                    return true;
                }
                return false;
            } else if (i2 == 2) {
                if (i <= 12 || (i == 13 && d.m12076e0() > 0)) {
                    return true;
                }
                return false;
            } else if (i2 == 3) {
                AbstractC10838d<D> Y = d.mo12083Y();
                int Z = ((AbstractC10840f) Y.mo11790b(Y.mo11788d())).m12082Z();
                int Z2 = ((AbstractC10840f) Y.mo11790b(Y.mo11791a())).m12082Z();
                if (i < Z || i > Z2) {
                    return false;
                }
                return true;
            } else {
                throw new UnsupportedOperationException("Unknown element index: " + this.f24050l);
            }
        }

        /* renamed from: q */
        public boolean mo11081h(D d, Integer num) {
            return num != null && m12050p(d, num.intValue());
        }

        /* JADX WARN: Type inference failed for: r12v2, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* JADX WARN: Type inference failed for: r12v4, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* JADX WARN: Type inference failed for: r12v6, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* renamed from: r */
        public D mo11811g(D d, int i, boolean z) {
            int i2 = this.f24050l;
            boolean z2 = true;
            if (i2 != 0) {
                if (i2 != 1) {
                    boolean z3 = false;
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new UnsupportedOperationException("Unknown element index: " + this.f24050l);
                        } else if (m12050p(d, i)) {
                            return (D) ((AbstractC10840f) AbstractC10840f.m12072i0(0).mo11636b(d, i - d.m12082Z()));
                        } else {
                            throw new IllegalArgumentException("Sexagesimal cycle out of range: " + i);
                        }
                    } else if (m12050p(d, i)) {
                        int e0 = d.m12076e0();
                        if (e0 > 0 && e0 < i) {
                            if (i != e0 + 1) {
                                z2 = false;
                            }
                            i--;
                            z3 = z2;
                        }
                        C10847h d2 = C10847h.m12031d(i);
                        if (z3) {
                            d2 = d2.m12030e();
                        }
                        return (D) C10845e.m12040p(d, d2);
                    } else {
                        throw new IllegalArgumentException("Ordinal month out of range: " + i);
                    }
                } else if (z || (i >= 1 && i <= d.lengthOfYear())) {
                    return d.mo12083Y().mo11790b((d.mo12079c() + i) - d.m12078c0());
                } else {
                    throw new IllegalArgumentException("Day of year out of range: " + i);
                }
            } else if (z) {
                return d.mo12083Y().mo11790b((d.mo12079c() + i) - d.m12069o());
            } else if (i < 1 || i > 30 || (i == 30 && d.lengthOfMonth() < 30)) {
                throw new IllegalArgumentException("Day of month out of range: " + i);
            } else {
                return d.mo12083Y().mo12106e(d.m12082Z(), d.m12071j0().getNumber(), d.m12075f0(), i, (d.mo12079c() + i) - d.m12069o());
            }
        }

        /* renamed from: s */
        public D mo11077m(D d, Integer num, boolean z) {
            if (num != null) {
                return mo11811g(d, num.intValue(), z);
            }
            throw new IllegalArgumentException("Missing element value.");
        }

        private C10844d(int i, AbstractC8079p<?> pVar) {
            this.f24050l = i;
            this.f24049k = pVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.calendar.f$e */
    /* loaded from: classes8.dex */
    public static class C10845e<D extends AbstractC10840f<?, D>> implements AbstractC8091z<D, C10847h> {

        /* renamed from: k */
        private final AbstractC8079p<?> f24051k;

        /* JADX WARN: Type inference failed for: r9v1, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* JADX WARN: Type inference failed for: r9v2, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* renamed from: p */
        static <D extends AbstractC10840f<?, D>> D m12040p(D d, C10847h hVar) {
            AbstractC10838d<D> Y = d.mo12083Y();
            int o = d.m12069o();
            int number = d.m12071j0().getNumber();
            if (o <= 29) {
                return Y.mo12106e(d.m12082Z(), number, hVar, o, Y.m12091t(d.m12082Z(), number, hVar, o));
            }
            long t = Y.m12091t(d.m12082Z(), number, hVar, 1);
            int min = Math.min(o, Y.mo11790b(t).lengthOfMonth());
            return Y.mo12106e(d.m12082Z(), number, hVar, min, (t + min) - 1);
        }

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(D d) {
            return this.f24051k;
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(D d) {
            return this.f24051k;
        }

        /* renamed from: f */
        public C10847h mo11084d(D d) {
            return C10847h.m12031d(12);
        }

        /* renamed from: i */
        public C10847h mo11078k(D d) {
            return C10847h.m12031d(1);
        }

        /* renamed from: j */
        public C10847h mo11076n(D d) {
            return d.m12075f0();
        }

        /* renamed from: o */
        public boolean mo11081h(D d, C10847h hVar) {
            return hVar != null && (!hVar.m12032c() || hVar.getNumber() == d.m12076e0());
        }

        /* renamed from: q */
        public D mo11077m(D d, C10847h hVar, boolean z) {
            if (mo11081h(d, hVar)) {
                return (D) m12040p(d, hVar);
            }
            throw new IllegalArgumentException("Invalid month: " + hVar);
        }

        private C10845e(AbstractC8079p<?> pVar) {
            this.f24051k = pVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10840f(int i, int i2, C10847h hVar, int i3, long j) {
        this.f24040k = i;
        this.f24041l = i2;
        this.f24042m = hVar;
        this.f24043n = i3;
        this.f24044o = j;
        this.f24045p = mo12083Y().m12104g(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public static <D extends AbstractC10840f<?, D>> AbstractC8091z<D, Integer> m12081a0(AbstractC8079p<?> pVar) {
        return new C10844d(3, pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public static <D extends AbstractC10840f<?, D>> AbstractC8091z<D, Integer> m12080b0() {
        return new C10844d(0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public static <D extends AbstractC10840f<?, D>> AbstractC8091z<D, Integer> m12077d0() {
        return new C10844d(1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public static <D extends AbstractC10840f<?, D>> AbstractC8091z<D, Integer> m12074g0(AbstractC8079p<?> pVar) {
        return new C10844d(2, pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public static <D extends AbstractC10840f<?, D>> AbstractC8091z<D, C10847h> m12073h0(AbstractC8079p<?> pVar) {
        return new C10845e(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public static <D extends AbstractC10840f<?, D>> AbstractC8074m0<D> m12072i0(int i) {
        return new C10843c(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public static <D extends AbstractC10840f<?, D>> AbstractC8091z<D, C10836c> m12070k0(AbstractC8079p<?> pVar) {
        return new C10842b(pVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public abstract AbstractC10838d<D> mo12083Y();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public int m12082Z() {
        return this.f24040k;
    }

    @Override // p143hj.AbstractC8073m, p143hj.AbstractC8056g
    /* renamed from: c */
    public long mo12079c() {
        return this.f24044o;
    }

    /* renamed from: c0 */
    public int m12078c0() {
        return (int) ((this.f24044o - mo12083Y().m12094q(this.f24040k, this.f24041l)) + 1);
    }

    /* renamed from: e0 */
    int m12076e0() {
        return this.f24045p;
    }

    @Override // p143hj.AbstractC8073m
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC10840f fVar = (AbstractC10840f) obj;
        if (this.f24040k == fVar.f24040k && this.f24041l == fVar.f24041l && this.f24043n == fVar.f24043n && this.f24042m.equals(fVar.f24042m) && this.f24044o == fVar.f24044o) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public C10847h m12075f0() {
        return this.f24042m;
    }

    @Override // p143hj.AbstractC8073m
    public int hashCode() {
        long j = this.f24044o;
        return (int) (j ^ (j >>> 32));
    }

    public boolean isLeapYear() {
        return this.f24045p > 0;
    }

    /* renamed from: j0 */
    public C10836c m12071j0() {
        return C10836c.m12108n(this.f24041l);
    }

    public int lengthOfMonth() {
        return (int) (((this.f24043n + mo12083Y().m12095p(this.f24044o + 1)) - this.f24044o) - 1);
    }

    public int lengthOfYear() {
        int i = this.f24040k;
        int i2 = 1;
        int i3 = this.f24041l + 1;
        if (i3 > 60) {
            i++;
        } else {
            i2 = i3;
        }
        return (int) (mo12083Y().m12094q(i, i2) - mo12083Y().m12094q(this.f24040k, this.f24041l));
    }

    /* renamed from: o */
    public int m12069o() {
        return this.f24043n;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String value = ((AbstractC8633c) getClass().getAnnotation(AbstractC8633c.class)).value();
        if (value.equals("dangi")) {
            value = "korean";
        }
        sb2.append(value);
        sb2.append('[');
        sb2.append(m12071j0().m11972g(Locale.ROOT));
        sb2.append('(');
        sb2.append(mo11370s(C10829b.f24026a));
        sb2.append(")-");
        sb2.append(this.f24042m.toString());
        sb2.append('-');
        if (this.f24043n < 10) {
            sb2.append('0');
        }
        sb2.append(this.f24043n);
        sb2.append(']');
        return sb2.toString();
    }
}
