package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0000\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m15073d2 = {"", "", "index", "H", "(Ljava/util/List;I)I", "I", "T", "F", "", "G", "(Ljava/util/List;)Ljava/util/List;", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.p */
/* loaded from: classes8.dex */
public class C9912p extends C9911o {
    /* renamed from: F */
    public static <T> List<T> m14797F(List<? extends T> list) {
        C9971q.m14633g(list, "<this>");
        return new C9918t(list);
    }

    /* renamed from: G */
    public static <T> List<T> m14796G(List<T> list) {
        C9971q.m14633g(list, "<this>");
        return new C9917s(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static final int m14795H(List<?> list, int i) {
        int k;
        int k2;
        int k3;
        k = C9906j.m14818k(list);
        if (new IntRange(0, k).contains(i)) {
            k3 = C9906j.m14818k(list);
            return k3 - i;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Element index ");
        sb2.append(i);
        sb2.append(" must be in range [");
        k2 = C9906j.m14818k(list);
        sb2.append(new IntRange(0, k2));
        sb2.append("].");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final int m14794I(List<?> list, int i) {
        if (new IntRange(0, list.size()).contains(i)) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new IntRange(0, list.size()) + "].");
    }
}
