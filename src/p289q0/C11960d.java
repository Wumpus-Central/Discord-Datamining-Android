package p289q0;

import android.os.Build;
import p390w.AbstractC13595f2;

/* renamed from: q0.d */
/* loaded from: classes.dex */
public class C11960d implements AbstractC13595f2 {
    /* renamed from: a */
    private static boolean m8139a() {
        if (!"OPPO".equalsIgnoreCase(Build.MANUFACTURER) || !"OP4E75L1".equalsIgnoreCase(Build.DEVICE)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m8138b() {
        if ("SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.DEVICE;
            if ("F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m8137c() {
        return m8138b() || m8139a();
    }
}
