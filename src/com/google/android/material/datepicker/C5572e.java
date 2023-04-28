package com.google.android.material.datepicker;

import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes3.dex */
public class C5572e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m28216a(long j) {
        return m28215b(j, Locale.getDefault());
    }

    /* renamed from: b */
    static String m28215b(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return C5609t.m28112f(locale).format(new Date(j));
        }
        format = C5609t.m28116b(locale).format(new Date(j));
        return format;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m28214c(long j) {
        return DateUtils.formatDateTime(null, j, 8228);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m28213d(long j) {
        return m28212e(j, Locale.getDefault());
    }

    /* renamed from: e */
    static String m28212e(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return C5609t.m28112f(locale).format(new Date(j));
        }
        format = C5609t.m28105m(locale).format(new Date(j));
        return format;
    }
}
