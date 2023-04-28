package com.henninghall.date_picker;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.henninghall.date_picker.a */
/* loaded from: classes6.dex */
public class C5881a {

    /* renamed from: a */
    private Calendar f11695a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5881a(TimeZone timeZone, String str) {
        if (str != null) {
            this.f11695a = C5899l.m26919g(C5899l.m26917i(str, timeZone));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Calendar m26988a() {
        return this.f11695a;
    }
}
