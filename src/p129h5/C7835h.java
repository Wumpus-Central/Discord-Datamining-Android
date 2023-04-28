package p129h5;

/* renamed from: h5.h */
/* loaded from: classes7.dex */
public class C7835h {
    /* renamed from: a */
    public static boolean m21281a(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: b */
    public static boolean m21280b(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: c */
    public static boolean m21279c(char c) {
        return m21280b(c) || m21281a(c);
    }

    /* renamed from: d */
    public static boolean m21278d(CharSequence charSequence, int i, int i2, int i3, int i4) {
        int i5;
        if (i2 >= charSequence.length() || (i5 = (i2 - i) + 1) < i3 || i5 > i4) {
            return false;
        }
        while (i <= i2) {
            if (!m21280b(charSequence.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m21277e(CharSequence charSequence, int i, int i2, int i3, int i4) {
        int i5;
        if (i2 >= charSequence.length() || (i5 = (i2 - i) + 1) < i3 || i5 > i4) {
            return false;
        }
        while (i <= i2) {
            if (!m21279c(charSequence.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m21276f(CharSequence charSequence, int i, int i2, int i3, int i4) {
        int i5;
        if (i2 >= charSequence.length() || (i5 = (i2 - i) + 1) < i3 || i5 > i4) {
            return false;
        }
        while (i <= i2) {
            if (!m21281a(charSequence.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m21275g(CharSequence charSequence, int i, int i2) {
        if ((i2 - i) + 1 != 4 || !m21280b(charSequence.charAt(i)) || !m21277e(charSequence, i + 1, i2, 3, 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m21274h(CharSequence charSequence, int i, int i2) {
        return m21277e(charSequence, i, i2, 1, 1);
    }

    /* renamed from: i */
    public static boolean m21273i(CharSequence charSequence, int i, int i2) {
        return m21277e(charSequence, i, i2, 2, 8);
    }

    /* renamed from: j */
    public static boolean m21272j(CharSequence charSequence, int i, int i2) {
        return m21277e(charSequence, i, i2, 1, 8);
    }

    /* renamed from: k */
    public static boolean m21271k(CharSequence charSequence, int i, int i2) {
        return i2 == i + 1 && m21280b(charSequence.charAt(i)) && m21281a(charSequence.charAt(i2));
    }

    /* renamed from: l */
    public static boolean m21270l(CharSequence charSequence, int i, int i2) {
        return m21277e(charSequence, i, i2, 3, 8);
    }

    /* renamed from: m */
    public static boolean m21269m(CharSequence charSequence, int i, int i2) {
        return m21277e(charSequence, i, i2, 3, 8);
    }

    /* renamed from: n */
    public static boolean m21268n(CharSequence charSequence, int i, int i2) {
        return i2 == i + 1 && m21279c(charSequence.charAt(i)) && m21280b(charSequence.charAt(i2));
    }

    /* renamed from: o */
    public static boolean m21267o(CharSequence charSequence, int i, int i2) {
        return m21277e(charSequence, i, i2, 3, 8);
    }

    /* renamed from: p */
    public static boolean m21266p(CharSequence charSequence, int i, int i2) {
        if (m21278d(charSequence, i, i2, 2, 3) || m21278d(charSequence, i, i2, 5, 8)) {
            return true;
        }
        if ((i2 - i) + 1 == 4 && charSequence.charAt(i) == 'r' && charSequence.charAt(i + 1) == 'o' && charSequence.charAt(i + 2) == 'o' && charSequence.charAt(i + 3) == 't') {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static boolean m21265q(CharSequence charSequence, int i, int i2) {
        return m21278d(charSequence, i, i2, 2, 2) || m21276f(charSequence, i, i2, 3, 3);
    }

    /* renamed from: r */
    public static boolean m21264r(CharSequence charSequence, int i, int i2) {
        return m21278d(charSequence, i, i2, 4, 4);
    }

    /* renamed from: s */
    public static boolean m21263s(CharSequence charSequence, int i, int i2) {
        return m21277e(charSequence, i, i2, 5, 8) || m21275g(charSequence, i, i2);
    }
}
