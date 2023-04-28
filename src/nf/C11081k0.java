package nf;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p326ri.C12688a;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001\u001a\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0001\u001a\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0000H\u0000¨\u0006\u000b"}, m15073d2 = {"", "v1", "v2", "a", "", "b", "v", "", "c", "base", "d", "kotlin-stdlib"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: nf.k0 */
/* loaded from: classes8.dex */
public final class C11081k0 {
    /* renamed from: a */
    public static final int m10953a(int i, int i2) {
        return C9971q.m14631i(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    /* renamed from: b */
    public static final int m10952b(long j, long j2) {
        return C9971q.m14630j(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    /* renamed from: c */
    public static final String m10951c(long j) {
        return m10950d(j, 10);
    }

    /* renamed from: d */
    public static final String m10950d(long j, int i) {
        if (j >= 0) {
            String l = Long.toString(j, C12688a.m5874a(i));
            C9971q.m14634f(l, "toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb2 = new StringBuilder();
        String l2 = Long.toString(j3, C12688a.m5874a(i));
        C9971q.m14634f(l2, "toString(this, checkRadix(radix))");
        sb2.append(l2);
        String l3 = Long.toString(j4, C12688a.m5874a(i));
        C9971q.m14634f(l3, "toString(this, checkRadix(radix))");
        sb2.append(l3);
        return sb2.toString();
    }
}
