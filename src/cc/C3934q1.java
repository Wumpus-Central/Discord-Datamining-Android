package cc;

/* renamed from: cc.q1 */
/* loaded from: classes3.dex */
public final class C3934q1 {
    /* renamed from: a */
    static Object m33320a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append("at index ");
        sb2.append(i);
        throw new NullPointerException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Object[] m33319b(Object... objArr) {
        return m33318c(objArr, objArr.length);
    }

    /* renamed from: c */
    static Object[] m33318c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m33320a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: d */
    public static <T> T[] m33317d(T[] tArr, int i) {
        return (T[]) C3942s1.m33307b(tArr, i);
    }
}
