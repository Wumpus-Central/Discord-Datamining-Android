package cc;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: cc.z0 */
/* loaded from: classes3.dex */
public final class C3976z0 {
    /* renamed from: a */
    private static <E> Collection<E> m33217a(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return C3847f1.m33490g(iterable.iterator());
    }

    /* renamed from: b */
    public static <T> T m33216b(Iterable<? extends T> iterable, T t) {
        return (T) C3818a1.m33527k(iterable.iterator(), t);
    }

    /* renamed from: c */
    public static <T> T m33215c(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) C3818a1.m33528j(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return (T) m33214d(list);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    private static <T> T m33214d(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: e */
    public static <T> T m33213e(Iterable<T> iterable) {
        return (T) C3818a1.m33526l(iterable.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Object[] m33212f(Iterable<?> iterable) {
        return m33217a(iterable).toArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static <T> T[] m33211g(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) m33217a(iterable).toArray(tArr);
    }

    /* renamed from: h */
    public static String m33210h(Iterable<?> iterable) {
        return C3818a1.m33522p(iterable.iterator());
    }
}
