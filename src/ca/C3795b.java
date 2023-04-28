package ca;

import p420x9.C13996n;

/* renamed from: ca.b */
/* loaded from: classes5.dex */
public final class C3795b {
    /* renamed from: a */
    public static boolean m33584a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <T> boolean m33583b(T[] tArr, T t) {
        int i;
        if (tArr != null) {
            i = tArr.length;
        } else {
            i = 0;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            } else if (!C13996n.m2071b(tArr[i2], t)) {
                i2++;
            } else if (i2 >= 0) {
                return true;
            }
        }
        return false;
    }
}
