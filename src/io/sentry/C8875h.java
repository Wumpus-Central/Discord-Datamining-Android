package io.sentry;

import io.sentry.vendor.gson.internal.bind.util.C9123a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;

/* renamed from: io.sentry.h */
/* loaded from: classes8.dex */
public final class C8875h {
    /* renamed from: a */
    public static double m17847a(Date date) {
        return m17841g(date.getTime());
    }

    /* renamed from: b */
    public static Date m17846b() {
        return Calendar.getInstance(C9123a.f20003a).getTime();
    }

    /* renamed from: c */
    public static Date m17845c(long j) {
        Calendar instance = Calendar.getInstance(C9123a.f20003a);
        instance.setTimeInMillis(j);
        return instance.getTime();
    }

    /* renamed from: d */
    public static Date m17844d(String str) {
        try {
            return C9123a.m16961f(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException("timestamp is not ISO format " + str);
        }
    }

    /* renamed from: e */
    public static Date m17843e(String str) {
        try {
            return m17845c(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("timestamp is not millis format " + str);
        }
    }

    /* renamed from: f */
    public static String m17842f(Date date) {
        return C9123a.m16965b(date, true);
    }

    /* renamed from: g */
    public static double m17841g(double d) {
        return d / 1000.0d;
    }

    /* renamed from: h */
    public static double m17840h(double d) {
        return d / 1000000.0d;
    }
}
