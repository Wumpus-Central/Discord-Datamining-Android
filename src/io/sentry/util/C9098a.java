package io.sentry.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.util.a */
/* loaded from: classes8.dex */
public final class C9098a {
    /* renamed from: a */
    public static <T> List<T> m17025a(List<T> list) {
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m17024b(Map<K, V> map) {
        if (map != null) {
            return new ConcurrentHashMap(map);
        }
        return null;
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m17023c(Map<K, V> map) {
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    /* renamed from: d */
    public static int m17022d(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<?> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
        }
        return i;
    }
}
