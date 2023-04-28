package androidx.core.p018os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: androidx.core.os.f */
/* loaded from: classes.dex */
public final class C2440f {

    /* renamed from: androidx.core.os.f$a */
    /* loaded from: classes.dex */
    static class C2441a {
        /* renamed from: a */
        static LocaleList m37738a(Configuration configuration) {
            LocaleList locales;
            locales = configuration.getLocales();
            return locales;
        }
    }

    /* renamed from: a */
    public static C2449l m37739a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C2449l.m37726d(C2441a.m37738a(configuration));
        }
        return C2449l.m37729a(configuration.locale);
    }
}
