package cc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: cc.s1 */
/* loaded from: classes3.dex */
final class C3942s1 {

    /* renamed from: a */
    private static final Logger f6485a = Logger.getLogger(C3942s1.class.getName());

    private C3942s1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> T[] m33308a(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> T[] m33307b(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <K, V> Map<K, V> m33306c(int i) {
        return C3871h1.m33434e(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <K, V> Map<K, V> m33305d() {
        return C3871h1.m33432g();
    }
}
