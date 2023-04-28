package io.sentry.util;

import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: io.sentry.util.o */
/* loaded from: classes8.dex */
public final class C9115o {

    /* renamed from: a */
    private static final Charset f19981a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static String m16985a(String str, AbstractC8869g0 g0Var) {
        if (str != null && !str.isEmpty()) {
            try {
                return new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str.getBytes(f19981a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e) {
                g0Var.mo17723b(EnumC8942n3.INFO, "SHA-1 isn't available to calculate the hash.", e);
            } catch (Throwable th2) {
                g0Var.mo17722c(EnumC8942n3.INFO, "string: %s could not calculate its hash", th2, str);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m16984b(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb2.append(substring.toUpperCase(locale));
        sb2.append(str.substring(1).toLowerCase(locale));
        return sb2.toString();
    }

    /* renamed from: c */
    public static String m16983c(String str) {
        int i;
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf < 0 || str.length() <= (i = lastIndexOf + 1)) {
            return str;
        }
        return str.substring(i);
    }

    /* renamed from: d */
    public static String m16982d(String str) {
        if (str.equals("0000-0000")) {
            return "00000000-0000-0000-0000-000000000000";
        }
        return str;
    }

    /* renamed from: e */
    public static String m16981e(String str, String str2) {
        if (str == null || str2 == null || !str.startsWith(str2) || !str.endsWith(str2)) {
            return str;
        }
        return str.substring(str2.length(), str.length() - str2.length());
    }
}
