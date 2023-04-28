package p163j$.util.stream;

import p163j$.util.AbstractC9234B;
import p163j$.util.AbstractC9447y;
import p163j$.util.Spliterator;

/* renamed from: j$.util.stream.p2 */
/* loaded from: classes2.dex */
abstract class AbstractC0593p2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m16316a(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Spliterator m16315b(EnumC9398T2 t2, Spliterator spliterator, long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        int i = AbstractC0585n2.f20705a[t2.ordinal()];
        if (i == 1) {
            return new C9431p3(spliterator, j, j4);
        }
        if (i == 2) {
            return new C9427l3((Spliterator.OfInt) spliterator, j, j4);
        }
        if (i == 3) {
            return new C9429n3((AbstractC9234B) spliterator, j, j4);
        }
        if (i == 4) {
            return new C9425j3((AbstractC9447y) spliterator, j, j4);
        }
        throw new IllegalStateException("Unknown shape " + t2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static long m16314c(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    /* renamed from: d */
    private static int m16313d(long j) {
        return (j != -1 ? EnumC9394S2.f20579u : 0) | EnumC9394S2.f20578t;
    }

    /* renamed from: e */
    public static AbstractC9328D m16312e(AbstractC9318B b, long j, long j2) {
        if (j >= 0) {
            return new C0581m2(b, m16313d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: f */
    public static IntStream m16311f(AbstractC0533c cVar, long j, long j2) {
        if (j >= 0) {
            return new C0565i2(cVar, m16313d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: g */
    public static AbstractC0571k0 m16310g(AbstractC0563i0 i0Var, long j, long j2) {
        if (j >= 0) {
            return new C0573k2(i0Var, m16313d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: h */
    public static Stream m16309h(AbstractC0533c cVar, long j, long j2) {
        if (j >= 0) {
            return new C0556g2(cVar, m16313d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }
}
