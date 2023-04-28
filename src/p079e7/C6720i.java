package p079e7;

import android.os.Build;
import java.util.HashSet;

/* renamed from: e7.i */
/* loaded from: classes7.dex */
public final class C6720i {
    @Deprecated

    /* renamed from: a */
    public static final String f14314a = "ExoPlayerLib/2.13.3 (Linux; Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.13.3";

    /* renamed from: b */
    private static final HashSet<String> f14315b = new HashSet<>();

    /* renamed from: c */
    private static String f14316c = "goog.exo.core";

    /* renamed from: a */
    public static synchronized void m24534a(String str) {
        synchronized (C6720i.class) {
            if (f14315b.add(str)) {
                f14316c += ", " + str;
            }
        }
    }

    /* renamed from: b */
    public static synchronized String m24533b() {
        String str;
        synchronized (C6720i.class) {
            str = f14316c;
        }
        return str;
    }
}
