package p286pi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;

/* renamed from: pi.a */
/* loaded from: classes8.dex */
public final class C11754a {
    /* renamed from: a */
    public static final <T> void m8689a(Collection<T> collection, T t) {
        C9971q.m14633g(collection, "<this>");
        if (t != null) {
            collection.add(t);
        }
    }

    /* renamed from: b */
    private static final int m8688b(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    /* renamed from: c */
    public static final <T> List<T> m8687c(ArrayList<T> arrayList) {
        List<T> i;
        Object U;
        List<T> d;
        C9971q.m14633g(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            i = C9906j.m14820i();
            return i;
        } else if (size != 1) {
            arrayList.trimToSize();
            return arrayList;
        } else {
            U = C9914r.m14770U(arrayList);
            d = C9905i.m14825d(U);
            return d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final <K> Map<K, Integer> m8686d(Iterable<? extends K> iterable) {
        C9971q.m14633g(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    public static final <K, V> HashMap<K, V> m8685e(int i) {
        return new HashMap<>(m8688b(i));
    }

    /* renamed from: f */
    public static final <E> HashSet<E> m8684f(int i) {
        return new HashSet<>(m8688b(i));
    }

    /* renamed from: g */
    public static final <E> LinkedHashSet<E> m8683g(int i) {
        return new LinkedHashSet<>(m8688b(i));
    }
}
