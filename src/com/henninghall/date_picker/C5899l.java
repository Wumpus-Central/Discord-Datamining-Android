package com.henninghall.date_picker;

import ae.EnumC1369d;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import net.time4j.C10960j0;
import p162ik.C8685a;
import p163j$.util.DesugarTimeZone;

/* renamed from: com.henninghall.date_picker.l */
/* loaded from: classes6.dex */
public class C5899l {
    /* renamed from: a */
    public static String m26925a(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /* renamed from: b */
    public static String m26924b(Calendar calendar) {
        return m26922d().format(calendar.getTime());
    }

    /* renamed from: c */
    public static boolean m26923c() {
        return !DateFormat.is24HourFormat(C5882b.f11696a);
    }

    /* renamed from: d */
    private static SimpleDateFormat m26922d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    /* renamed from: e */
    public static String m26921e(Locale locale, String str) {
        ReactApplicationContext reactApplicationContext = C5882b.f11696a;
        return C5892g.m26964g(locale, reactApplicationContext.getResources().getIdentifier(str, "string", reactApplicationContext.getPackageName()), reactApplicationContext);
    }

    /* renamed from: f */
    public static int m26920f(int i, int i2, int i3, boolean z) {
        int i4 = i3 + 1;
        int i5 = i2 - i;
        int i6 = i5 > 0 ? i5 - i4 : i4 + i5;
        if (z) {
            return Math.abs(i5) < Math.abs(i6) ? i5 : i6;
        }
        int i7 = i + i5;
        return (i7 <= i3 && i7 >= 0) ? i5 : i6;
    }

    /* renamed from: g */
    public static Calendar m26919g(Calendar calendar) {
        try {
            return C8685a.m18396b(calendar, 12);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static boolean m26918h(Calendar calendar) {
        return DateUtils.isToday(calendar.getTimeInMillis());
    }

    /* renamed from: i */
    public static Calendar m26917i(String str, TimeZone timeZone) {
        if (str == null) {
            return null;
        }
        try {
            Calendar instance = Calendar.getInstance(timeZone);
            instance.setTime(m26922d().parse(str));
            return instance;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public static EnumC1369d m26916j(char c) {
        if (c != 'H') {
            if (c == 'M') {
                return EnumC1369d.MONTH;
            }
            if (c == 'a') {
                return EnumC1369d.AM_PM;
            }
            if (c == 'd') {
                return EnumC1369d.DATE;
            }
            if (c != 'h') {
                if (c == 'm') {
                    return EnumC1369d.MINUTE;
                }
                if (c == 'y') {
                    return EnumC1369d.YEAR;
                }
                throw new Exception("Invalid pattern char: " + c);
            }
        }
        return EnumC1369d.HOUR;
    }

    /* renamed from: k */
    public static String m26915k(Locale locale) {
        return C10960j0.m11466b(locale).m11465c();
    }

    /* renamed from: l */
    public static int m26914l(int i) {
        return (int) (i * C5882b.f11696a.getResources().getDisplayMetrics().density);
    }
}
