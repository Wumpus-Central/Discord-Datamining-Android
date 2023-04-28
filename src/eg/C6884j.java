package eg;

import cg.AbstractC4002c;
import cg.C4004d;
import eg.C6877e;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.C9986a;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010\f\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u000bH\u0086\u0004\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010\u000f\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u000bH\u0086\u0004\u001a)\u0010\u0013\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u0010*\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0012\u0010\u0015\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003\u001a\u0012\u0010\u0016\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b\u001a\u0012\u0010\u0018\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0017\u001a\u0012\u0010\u001a\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003\u001a\u0012\u0010\u001b\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b\u001a\u0012\u0010\u001c\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017\u001a\u001a\u0010\u001d\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003\u001a\u001a\u0010\u001e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b\u001a\u001a\u0010\u001f\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017¨\u0006 "}, m15073d2 = {"Lkotlin/ranges/IntRange;", "Lcg/c;", "random", "", "m", "to", "Lkotlin/ranges/a;", "l", "step", "o", "Leg/e;", "", "n", "q", "Leg/g;", "p", "", "T", "minimumValue", "e", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "c", "d", "", "b", "maximumValue", "g", "h", "f", "j", "k", "i", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/ranges/RangesKt")
/* renamed from: eg.j */
/* loaded from: classes8.dex */
public class C6884j extends C6883i {
    /* renamed from: b */
    public static float m23962b(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    /* renamed from: c */
    public static int m23961c(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: d */
    public static long m23960d(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: e */
    public static <T extends Comparable<? super T>> T m23959e(T t, T minimumValue) {
        C9971q.m14633g(t, "<this>");
        C9971q.m14633g(minimumValue, "minimumValue");
        if (t.compareTo(minimumValue) < 0) {
            return minimumValue;
        }
        return t;
    }

    /* renamed from: f */
    public static float m23958f(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    /* renamed from: g */
    public static int m23957g(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: h */
    public static long m23956h(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: i */
    public static float m23955i(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* renamed from: j */
    public static int m23954j(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: k */
    public static long m23953k(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    /* renamed from: l */
    public static C9986a m23952l(int i, int i2) {
        return C9986a.f22102n.m14601a(i, i2, -1);
    }

    /* renamed from: m */
    public static int m23951m(IntRange intRange, AbstractC4002c random) {
        C9971q.m14633g(intRange, "<this>");
        C9971q.m14633g(random, "random");
        try {
            return C4004d.m33121d(random, intRange);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    /* renamed from: n */
    public static C6877e m23950n(C6877e eVar, long j) {
        boolean z;
        C9971q.m14633g(eVar, "<this>");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C6883i.m23963a(z, Long.valueOf(j));
        C6877e.C6878a aVar = C6877e.f15049n;
        long a = eVar.m23987a();
        long b = eVar.m23986b();
        if (eVar.m23985f() <= 0) {
            j = -j;
        }
        return aVar.m23983a(a, b, j);
    }

    /* renamed from: o */
    public static C9986a m23949o(C9986a aVar, int i) {
        boolean z;
        C9971q.m14633g(aVar, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C6883i.m23963a(z, Integer.valueOf(i));
        C9986a.C0305a aVar2 = C9986a.f22102n;
        int a = aVar.m14605a();
        int b = aVar.m14604b();
        if (aVar.m14603f() <= 0) {
            i = -i;
        }
        return aVar2.m14601a(a, b, i);
    }

    /* renamed from: p */
    public static C6880g m23948p(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return C6880g.f15057o.m23980a();
        }
        return new C6880g(i, j - 1);
    }

    /* renamed from: q */
    public static IntRange m23947q(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return IntRange.f22100o.m14606a();
        }
        return new IntRange(i, i2 - 1);
    }
}
