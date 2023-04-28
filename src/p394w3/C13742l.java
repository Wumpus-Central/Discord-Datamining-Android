package p394w3;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: w3.l */
/* loaded from: classes7.dex */
public final class C13742l {
    /* renamed from: a */
    public static <E> CopyOnWriteArraySet<E> m2829a() {
        return new CopyOnWriteArraySet<>();
    }

    /* renamed from: b */
    public static <E> Set<E> m2828b() {
        return m2827c(new IdentityHashMap());
    }

    /* renamed from: c */
    public static <E> Set<E> m2827c(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }
}
