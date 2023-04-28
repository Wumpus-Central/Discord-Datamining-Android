package cc;

/* renamed from: cc.z */
/* loaded from: classes3.dex */
final class C3975z {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m33220a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d * highestOneBit))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m33219b(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m33218c(Object obj) {
        return m33219b(obj == null ? 0 : obj.hashCode());
    }
}
