package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.r */
/* loaded from: classes3.dex */
class C5607r {

    /* renamed from: c */
    private static final C5607r f10877c = new C5607r(null, null);

    /* renamed from: a */
    private final Long f10878a;

    /* renamed from: b */
    private final TimeZone f10879b;

    private C5607r(Long l, TimeZone timeZone) {
        this.f10878a = l;
        this.f10879b = timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C5607r m28119c() {
        return f10877c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Calendar m28121a() {
        return m28120b(this.f10879b);
    }

    /* renamed from: b */
    Calendar m28120b(TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = this.f10878a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
