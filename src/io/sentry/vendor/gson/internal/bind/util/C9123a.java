package io.sentry.vendor.gson.internal.bind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import p163j$.util.DesugarTimeZone;

/* renamed from: io.sentry.vendor.gson.internal.bind.util.a */
/* loaded from: classes8.dex */
public class C9123a {

    /* renamed from: a */
    public static final TimeZone f20003a = DesugarTimeZone.getTimeZone("UTC");

    /* renamed from: a */
    private static boolean m16966a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* renamed from: b */
    public static String m16965b(Date date, boolean z) {
        return m16964c(date, z, f20003a);
    }

    /* renamed from: c */
    public static String m16964c(Date date, boolean z, TimeZone timeZone) {
        int i;
        int i2;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        int i3 = 19 + i;
        if (timeZone.getRawOffset() == 0) {
            i2 = 1;
        } else {
            i2 = 6;
        }
        StringBuilder sb2 = new StringBuilder(i3 + i2);
        m16962e(sb2, gregorianCalendar.get(1), 4);
        char c = '-';
        sb2.append('-');
        m16962e(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        m16962e(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        m16962e(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        m16962e(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        m16962e(sb2, gregorianCalendar.get(13), 2);
        if (z) {
            sb2.append('.');
            m16962e(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i4 = offset / 60000;
            int abs = Math.abs(i4 / 60);
            int abs2 = Math.abs(i4 % 60);
            if (offset >= 0) {
                c = '+';
            }
            sb2.append(c);
            m16962e(sb2, abs, 2);
            sb2.append(':');
            m16962e(sb2, abs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    /* renamed from: d */
    private static int m16963d(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* renamed from: e */
    private static void m16962e(StringBuilder sb2, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:40:0x00b0, B:41:0x00b3, B:47:0x00c9, B:49:0x00cf, B:51:0x00d6, B:55:0x00e0, B:56:0x00fb, B:57:0x00fc, B:60:0x0107, B:61:0x0118, B:63:0x0125, B:66:0x012e, B:68:0x014d, B:71:0x015c, B:72:0x017e, B:74:0x0181, B:75:0x0183, B:77:0x01b4, B:78:0x01bb), top: B:90:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b4 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:40:0x00b0, B:41:0x00b3, B:47:0x00c9, B:49:0x00cf, B:51:0x00d6, B:55:0x00e0, B:56:0x00fb, B:57:0x00fc, B:60:0x0107, B:61:0x0118, B:63:0x0125, B:66:0x012e, B:68:0x014d, B:71:0x015c, B:72:0x017e, B:74:0x0181, B:75:0x0183, B:77:0x01b4, B:78:0x01bb), top: B:90:0x0004 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date m16961f(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.internal.bind.util.C9123a.m16961f(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: g */
    private static int m16960g(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4 = i5;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
        }
        return -i3;
    }
}
