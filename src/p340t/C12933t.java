package p340t;

import android.os.Build;
import java.util.Locale;
import p390w.AbstractC13595f2;

/* renamed from: t.t */
/* loaded from: classes.dex */
public class C12933t implements AbstractC13595f2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m5039a() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        if (!"SAMSUNG".equals(str.toUpperCase(locale)) || !Build.MODEL.toUpperCase(locale).startsWith("SM-A716")) {
            return false;
        }
        return true;
    }
}
