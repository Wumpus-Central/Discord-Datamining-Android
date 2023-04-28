package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import p163j$.util.DesugarTimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.t */
/* loaded from: classes3.dex */
public class C5609t {

    /* renamed from: a */
    static AtomicReference<C5607r> f10880a = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m28117a(long j) {
        Calendar k = m28107k();
        k.setTimeInMillis(j);
        return m28114d(k).getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: b */
    public static DateFormat m28116b(Locale locale) {
        return m28115c("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: c */
    private static DateFormat m28115c(String str, Locale locale) {
        DateFormat instanceForSkeleton;
        instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m28108j());
        return instanceForSkeleton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Calendar m28114d(Calendar calendar) {
        Calendar l = m28106l(calendar);
        Calendar k = m28107k();
        k.set(l.get(1), l.get(2), l.get(5));
        return k;
    }

    /* renamed from: e */
    private static java.text.DateFormat m28113e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m28110h());
        return dateInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static java.text.DateFormat m28112f(Locale locale) {
        return m28113e(0, locale);
    }

    /* renamed from: g */
    static C5607r m28111g() {
        C5607r rVar = f10880a.get();
        if (rVar == null) {
            return C5607r.m28119c();
        }
        return rVar;
    }

    /* renamed from: h */
    private static TimeZone m28110h() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Calendar m28109i() {
        Calendar a = m28111g().m28121a();
        a.set(11, 0);
        a.set(12, 0);
        a.set(13, 0);
        a.set(14, 0);
        a.setTimeZone(m28110h());
        return a;
    }

    @TargetApi(24)
    /* renamed from: j */
    private static android.icu.util.TimeZone m28108j() {
        android.icu.util.TimeZone timeZone;
        timeZone = android.icu.util.TimeZone.getTimeZone("UTC");
        return timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Calendar m28107k() {
        return m28106l(null);
    }

    /* renamed from: l */
    static Calendar m28106l(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m28110h());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: m */
    public static DateFormat m28105m(Locale locale) {
        return m28115c("yMMMEd", locale);
    }
}
