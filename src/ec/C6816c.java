package ec;

/* renamed from: ec.c */
/* loaded from: classes3.dex */
final class C6816c {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m24295a(String str, int i) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(i);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m24294b(String str, int i) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(i);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m24293c(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
