package com.imagepicker;

import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.imagepicker.d */
/* loaded from: classes6.dex */
abstract class AbstractC5999d {

    /* renamed from: a */
    protected String f12097a;

    /* renamed from: b */
    protected int f12098b;

    /* renamed from: c */
    protected int f12099c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public String m26540a(String str, String str2) {
        try {
            Locale locale = Locale.US;
            Date parse = new SimpleDateFormat(str2, locale).parse(str);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
            if (parse != null) {
                return simpleDateFormat.format(parse);
            }
            return null;
        } catch (Exception e) {
            Log.e("RNIP", "Could not parse image datetime to UTC: " + e.getMessage());
            return null;
        }
    }
}
