package p122gk;

import fk.C7380w;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¨\u0006\t"}, m15073d2 = {"", "", "value", "fromIndex", "toIndex", "a", "Lfk/w;", "pos", "b", "okio"}, m15072k = 2, m15071mv = {1, 4, 0})
/* renamed from: gk.e */
/* loaded from: classes8.dex */
public final class C7713e {
    /* renamed from: a */
    public static final int m21576a(int[] binarySearch, int i, int i2, int i3) {
        C9971q.m14633g(binarySearch, "$this$binarySearch");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = binarySearch[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    /* renamed from: b */
    public static final int m21575b(C7380w segment, int i) {
        C9971q.m14633g(segment, "$this$segment");
        int a = m21576a(segment.m22769E(), i + 1, 0, segment.m22768F().length);
        if (a >= 0) {
            return a;
        }
        return ~a;
    }
}
