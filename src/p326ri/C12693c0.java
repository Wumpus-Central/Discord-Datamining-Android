package p326ri;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import nf.C11056b0;
import nf.C11062d0;
import nf.C11070g0;
import nf.C11075i;
import nf.C11100z;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0016\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0016\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000\u001a\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000\u001a\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000\u001a\u0011\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0016\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m15073d2 = {"", "Lnf/z;", "a", "(Ljava/lang/String;)B", "Lnf/g0;", "j", "(Ljava/lang/String;)S", "Lnf/b0;", "d", "(Ljava/lang/String;)I", "Lnf/d0;", "g", "(Ljava/lang/String;)J", "b", "", "radix", "c", "k", "l", "e", "f", "h", "i", "kotlin-stdlib"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: ri.c0 */
/* loaded from: classes8.dex */
public final class C12693c0 {
    /* renamed from: a */
    public static final byte m5864a(String str) {
        C9971q.m14633g(str, "<this>");
        C11100z b = m5863b(str);
        if (b != null) {
            return b.m10915f();
        }
        C12717t.m5748l(str);
        throw new C11075i();
    }

    /* renamed from: b */
    public static final C11100z m5863b(String str) {
        C9971q.m14633g(str, "<this>");
        return m5862c(str, 10);
    }

    /* renamed from: c */
    public static final C11100z m5862c(String str, int i) {
        int compare;
        C9971q.m14633g(str, "<this>");
        C11056b0 f = m5859f(str, i);
        if (f == null) {
            return null;
        }
        int f2 = f.m11026f();
        compare = Integer.compare(f2 ^ Integer.MIN_VALUE, C11056b0.m11030b(255) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return C11100z.m10920a(C11100z.m10919b((byte) f2));
    }

    /* renamed from: d */
    public static final int m5861d(String str) {
        C9971q.m14633g(str, "<this>");
        C11056b0 e = m5860e(str);
        if (e != null) {
            return e.m11026f();
        }
        C12717t.m5748l(str);
        throw new C11075i();
    }

    /* renamed from: e */
    public static final C11056b0 m5860e(String str) {
        C9971q.m14633g(str, "<this>");
        return m5859f(str, 10);
    }

    /* renamed from: f */
    public static final C11056b0 m5859f(String str, int i) {
        int i2;
        int compare;
        int compare2;
        int compare3;
        C9971q.m14633g(str, "<this>");
        C12690b.m5870a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        if (C9971q.m14631i(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int b = C11056b0.m11030b(i);
        int i4 = 119304647;
        while (i2 < length) {
            int b2 = C12690b.m5869b(str.charAt(i2), i);
            if (b2 < 0) {
                return null;
            }
            compare = Integer.compare(i3 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                if (i4 == 119304647) {
                    i4 = C12691b0.m5867a(-1, b);
                    compare3 = Integer.compare(i3 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            int b3 = C11056b0.m11030b(i3 * b);
            int b4 = C11056b0.m11030b(C11056b0.m11030b(b2) + b3);
            compare2 = Integer.compare(b4 ^ Integer.MIN_VALUE, b3 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i2++;
            i3 = b4;
        }
        return C11056b0.m11031a(i3);
    }

    /* renamed from: g */
    public static final long m5858g(String str) {
        C9971q.m14633g(str, "<this>");
        C11062d0 h = m5857h(str);
        if (h != null) {
            return h.m11001f();
        }
        C12717t.m5748l(str);
        throw new C11075i();
    }

    /* renamed from: h */
    public static final C11062d0 m5857h(String str) {
        C9971q.m14633g(str, "<this>");
        return m5856i(str, 10);
    }

    /* renamed from: i */
    public static final C11062d0 m5856i(String str, int i) {
        int b;
        int compare;
        int compare2;
        int compare3;
        C9971q.m14633g(str, "<this>");
        C12690b.m5870a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (C9971q.m14631i(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long b2 = C11062d0.m11005b(i);
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            if (C12690b.m5869b(str.charAt(i2), i) < 0) {
                return null;
            }
            compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare > 0) {
                if (j2 == 512409557603043100L) {
                    j2 = C12689a0.m5871a(-1L, b2);
                    compare3 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            long b3 = C11062d0.m11005b(j * b2);
            long b4 = C11062d0.m11005b(C11062d0.m11005b(C11056b0.m11030b(b) & 4294967295L) + b3);
            compare2 = Long.compare(b4 ^ Long.MIN_VALUE, b3 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i2++;
            j = b4;
        }
        return C11062d0.m11006a(j);
    }

    /* renamed from: j */
    public static final short m5855j(String str) {
        C9971q.m14633g(str, "<this>");
        C11070g0 k = m5854k(str);
        if (k != null) {
            return k.m10974f();
        }
        C12717t.m5748l(str);
        throw new C11075i();
    }

    /* renamed from: k */
    public static final C11070g0 m5854k(String str) {
        C9971q.m14633g(str, "<this>");
        return m5853l(str, 10);
    }

    /* renamed from: l */
    public static final C11070g0 m5853l(String str, int i) {
        int compare;
        C9971q.m14633g(str, "<this>");
        C11056b0 f = m5859f(str, i);
        if (f == null) {
            return null;
        }
        int f2 = f.m11026f();
        compare = Integer.compare(f2 ^ Integer.MIN_VALUE, C11056b0.m11030b(65535) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return C11070g0.m10979a(C11070g0.m10978b((short) f2));
    }
}
