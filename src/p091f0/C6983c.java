package p091f0;

import android.os.Build;
import p390w.AbstractC13595f2;

/* renamed from: f0.c */
/* loaded from: classes.dex */
public class C6983c implements AbstractC13595f2 {
    /* renamed from: a */
    private static boolean m23738a() {
        if (!"google".equalsIgnoreCase(Build.BRAND) || !"redfin".equalsIgnoreCase(Build.DEVICE)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m23737b() {
        return m23738a();
    }

    /* renamed from: c */
    public boolean m23736c(boolean z) {
        return !z && m23738a();
    }
}
