package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p267of.C11286s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0005\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002\u001a.\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0004\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¨\u0006\n"}, m15073d2 = {"T", "", "element", "k", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "j", "m", "l", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/collections/SetsKt")
/* renamed from: kotlin.collections.x */
/* loaded from: classes8.dex */
public class C9922x extends C9921w {
    /* renamed from: j */
    public static <T> Set<T> m14716j(Set<? extends T> set, Iterable<? extends T> elements) {
        C9971q.m14633g(set, "<this>");
        C9971q.m14633g(elements, "elements");
        Collection<?> A = C9911o.m14804A(elements);
        if (A.isEmpty()) {
            return C9904h.m14893H0(set);
        }
        if (A instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t : set) {
                if (!A.contains(t)) {
                    linkedHashSet.add(t);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(A);
        return linkedHashSet2;
    }

    /* renamed from: k */
    public static <T> Set<T> m14715k(Set<? extends T> set, T t) {
        C9971q.m14633g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C11286s.m10271d(set.size()));
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && C9971q.m14638b(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: l */
    public static <T> Set<T> m14714l(Set<? extends T> set, Iterable<? extends T> elements) {
        int i;
        C9971q.m14633g(set, "<this>");
        C9971q.m14633g(elements, "elements");
        Integer u = C9907k.m14808u(elements);
        if (u != null) {
            i = set.size() + u.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C11286s.m10271d(i));
        linkedHashSet.addAll(set);
        C9904h.m14832y(linkedHashSet, elements);
        return linkedHashSet;
    }

    /* renamed from: m */
    public static <T> Set<T> m14713m(Set<? extends T> set, T t) {
        C9971q.m14633g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C11286s.m10271d(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }
}
