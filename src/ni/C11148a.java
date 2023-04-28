package ni;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;
import p326ri.C12719v;

/* renamed from: ni.a */
/* loaded from: classes8.dex */
public final class C11148a {
    /* renamed from: a */
    public static final String m10725a(String str) {
        boolean z;
        C9971q.m14633g(str, "<this>");
        boolean z2 = false;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z2 = true;
        }
        if (!z2) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        C9971q.m14634f(substring, "this as java.lang.String).substring(startIndex)");
        return upperCase + substring;
    }

    /* renamed from: b */
    public static final String m10724b(String str) {
        boolean z;
        C9971q.m14633g(str, "<this>");
        boolean z2 = false;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && charAt < '[') {
            z2 = true;
        }
        if (!z2) {
            return str;
        }
        char lowerCase = Character.toLowerCase(charAt);
        String substring = str.substring(1);
        C9971q.m14634f(substring, "this as java.lang.String).substring(startIndex)");
        return lowerCase + substring;
    }

    /* renamed from: c */
    public static final String m10723c(String str, boolean z) {
        boolean z2;
        boolean z3;
        IntRange S;
        Integer num;
        C9971q.m14633g(str, "<this>");
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !m10722d(str, 0, z)) {
            return str;
        }
        if (str.length() != 1 && m10722d(str, 1, z)) {
            S = C12719v.m5697S(str);
            Iterator<Integer> it = S.iterator();
            while (true) {
                if (!it.hasNext()) {
                    num = null;
                    break;
                }
                num = it.next();
                if (!m10722d(str, num.intValue(), z)) {
                    break;
                }
            }
            Integer num2 = num;
            if (num2 == null) {
                return m10721e(str, z);
            }
            int intValue = num2.intValue() - 1;
            StringBuilder sb2 = new StringBuilder();
            String substring = str.substring(0, intValue);
            C9971q.m14634f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(m10721e(substring, z));
            String substring2 = str.substring(intValue);
            C9971q.m14634f(substring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring2);
            return sb2.toString();
        } else if (z) {
            return m10724b(str);
        } else {
            if (str.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String substring3 = str.substring(1);
            C9971q.m14634f(substring3, "this as java.lang.String).substring(startIndex)");
            return lowerCase + substring3;
        }
    }

    /* renamed from: d */
    private static final boolean m10722d(String str, int i, boolean z) {
        char charAt = str.charAt(i);
        if (!z) {
            return Character.isUpperCase(charAt);
        }
        if ('A' > charAt || charAt >= '[') {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static final String m10721e(String str, boolean z) {
        if (z) {
            return m10720f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C9971q.m14634f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    /* renamed from: f */
    public static final String m10720f(String str) {
        boolean z;
        C9971q.m14633g(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' > charAt || charAt >= '[') {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                charAt = Character.toLowerCase(charAt);
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "builder.toString()");
        return sb3;
    }
}
