package cg;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0000¨\u0006\u0010"}, m15073d2 = {"Lcg/c;", "Lkotlin/ranges/IntRange;", "range", "", "d", "value", "c", "bitCount", "e", "from", "until", "", "b", "", "", "a", "kotlin-stdlib"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: cg.d */
/* loaded from: classes8.dex */
public final class C4004d {
    /* renamed from: a */
    public static final String m33124a(Object from, Object until) {
        C9971q.m14633g(from, "from");
        C9971q.m14633g(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    /* renamed from: b */
    public static final void m33123b(int i, int i2) {
        if (!(i2 > i)) {
            throw new IllegalArgumentException(m33124a(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    /* renamed from: c */
    public static final int m33122c(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: d */
    public static final int m33121d(AbstractC4002c cVar, IntRange range) {
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        } else if (range.m14604b() < Integer.MAX_VALUE) {
            return cVar.mo25537d(range.m14605a(), range.m14604b() + 1);
        } else {
            if (range.m14605a() > Integer.MIN_VALUE) {
                return cVar.mo25537d(range.m14605a() - 1, range.m14604b()) + 1;
            }
            return cVar.mo33125c();
        }
    }

    /* renamed from: e */
    public static final int m33120e(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
