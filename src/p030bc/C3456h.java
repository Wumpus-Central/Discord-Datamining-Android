package p030bc;

import java.util.Arrays;

/* renamed from: bc.h */
/* loaded from: classes3.dex */
public final class C3456h extends AbstractC3453e {
    /* renamed from: a */
    public static boolean m34362a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m34361b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
