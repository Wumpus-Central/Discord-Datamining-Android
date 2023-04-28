package p030bc;

/* renamed from: bc.b */
/* loaded from: classes3.dex */
public final class C3445b {
    /* renamed from: a */
    public static boolean m34378a(CharSequence charSequence, CharSequence charSequence2) {
        int b;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((b = m34377b(charAt)) >= 26 || b != m34377b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m34377b(char c) {
        return (char) ((c | ' ') - 97);
    }
}
