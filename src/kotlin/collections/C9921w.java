package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p267of.C11278k;
import p267of.C11288u;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000.\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a7\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\n\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u000e\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¨\u0006\u0012"}, m15073d2 = {"T", "", "d", "", "elements", "i", "([Ljava/lang/Object;)Ljava/util/Set;", "", "g", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "e", "([Ljava/lang/Object;)Ljava/util/HashSet;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "f", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "h", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/collections/SetsKt")
/* renamed from: kotlin.collections.w */
/* loaded from: classes8.dex */
public class C9921w extends C9920v {
    /* renamed from: d */
    public static <T> Set<T> m14722d() {
        return C11278k.f25202k;
    }

    /* renamed from: e */
    public static <T> HashSet<T> m14721e(T... elements) {
        int d;
        C9971q.m14633g(elements, "elements");
        d = C11288u.m10255d(elements.length);
        return (HashSet) C9899f.m14924m0(elements, new HashSet(d));
    }

    /* renamed from: f */
    public static <T> LinkedHashSet<T> m14720f(T... elements) {
        int d;
        C9971q.m14633g(elements, "elements");
        d = C11288u.m10255d(elements.length);
        return (LinkedHashSet) C9899f.m14924m0(elements, new LinkedHashSet(d));
    }

    /* renamed from: g */
    public static <T> Set<T> m14719g(T... elements) {
        int d;
        C9971q.m14633g(elements, "elements");
        d = C11288u.m10255d(elements.length);
        return (Set) C9899f.m14924m0(elements, new LinkedHashSet(d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static final <T> Set<T> m14718h(Set<? extends T> set) {
        Set<T> d;
        Set<T> c;
        C9971q.m14633g(set, "<this>");
        int size = set.size();
        if (size == 0) {
            d = m14722d();
            return d;
        } else if (size != 1) {
            return set;
        } else {
            c = C9920v.m14723c(set.iterator().next());
            return c;
        }
    }

    /* renamed from: i */
    public static <T> Set<T> m14717i(T... elements) {
        Set<T> d;
        Set<T> H0;
        C9971q.m14633g(elements, "elements");
        if (elements.length > 0) {
            H0 = C9899f.m14957H0(elements);
            return H0;
        }
        d = m14722d();
        return d;
    }
}
