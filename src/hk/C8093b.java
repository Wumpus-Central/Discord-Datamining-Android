package hk;

/* renamed from: hk.b */
/* loaded from: classes8.dex */
public class C8093b {
    /* renamed from: a */
    public static boolean m20633a(CharSequence charSequence) {
        if (charSequence == null || m20631c(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLowerCase(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m20632b(CharSequence charSequence) {
        if (charSequence == null || m20631c(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isUpperCase(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m20631c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: d */
    public static boolean m20630d(CharSequence charSequence) {
        if (m20631c(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
