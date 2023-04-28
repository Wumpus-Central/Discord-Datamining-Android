package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: androidx.core.text.q */
/* loaded from: classes.dex */
public final class C2508q {

    /* renamed from: a */
    private static final Locale f3478a = new Locale("", "");

    /* renamed from: androidx.core.text.q$a */
    /* loaded from: classes.dex */
    static class C2509a {
        /* renamed from: a */
        static int m37610a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    /* renamed from: a */
    public static int m37611a(Locale locale) {
        return C2509a.m37610a(locale);
    }
}
