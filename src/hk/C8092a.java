package hk;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: hk.a */
/* loaded from: classes8.dex */
public class C8092a {

    /* renamed from: a */
    private static final ConcurrentMap<String, List<Locale>> f17479a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final ConcurrentMap<String, List<Locale>> f17480b = new ConcurrentHashMap();

    /* renamed from: a */
    private static boolean m20638a(String str) {
        return C8093b.m20632b(str) && str.length() == 2;
    }

    /* renamed from: b */
    private static boolean m20637b(String str) {
        return C8093b.m20633a(str) && (str.length() == 2 || str.length() == 3);
    }

    /* renamed from: c */
    private static boolean m20636c(String str) {
        return C8093b.m20630d(str) && str.length() == 3;
    }

    /* renamed from: d */
    private static Locale m20635d(String str) {
        if (m20637b(str)) {
            return new Locale(str);
        }
        String[] split = str.split("_", -1);
        String str2 = split[0];
        if (split.length == 2) {
            String str3 = split[1];
            if ((m20637b(str2) && m20638a(str3)) || m20636c(str3)) {
                return new Locale(str2, str3);
            }
        } else if (split.length == 3) {
            String str4 = split[1];
            String str5 = split[2];
            if (m20637b(str2) && ((str4.isEmpty() || m20638a(str4) || m20636c(str4)) && !str5.isEmpty())) {
                return new Locale(str2, str4, str5);
            }
        }
        throw new IllegalArgumentException("Invalid locale format: " + str);
    }

    /* renamed from: e */
    public static Locale m20634e(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new Locale("", "");
        }
        if (!str.contains("#")) {
            int length = str.length();
            if (length < 2) {
                throw new IllegalArgumentException("Invalid locale format: " + str);
            } else if (str.charAt(0) != '_') {
                return m20635d(str);
            } else {
                if (length >= 3) {
                    char charAt = str.charAt(1);
                    char charAt2 = str.charAt(2);
                    if (!Character.isUpperCase(charAt) || !Character.isUpperCase(charAt2)) {
                        throw new IllegalArgumentException("Invalid locale format: " + str);
                    } else if (length == 3) {
                        return new Locale("", str.substring(1, 3));
                    } else {
                        if (length < 5) {
                            throw new IllegalArgumentException("Invalid locale format: " + str);
                        } else if (str.charAt(3) == '_') {
                            return new Locale("", str.substring(1, 3), str.substring(4));
                        } else {
                            throw new IllegalArgumentException("Invalid locale format: " + str);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Invalid locale format: " + str);
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
    }
}
