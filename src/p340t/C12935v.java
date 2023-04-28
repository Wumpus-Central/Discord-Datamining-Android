package p340t;

import android.os.Build;
import p020b0.AbstractC3339d;
import p308r.C12267f0;

/* renamed from: t.v */
/* loaded from: classes.dex */
public final class C12935v implements AbstractC3339d {
    /* renamed from: a */
    private static boolean m5038a() {
        if (!"motorola".equalsIgnoreCase(Build.BRAND) || !"MotoG3".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m5037b() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND) || !"SM-G532F".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m5036c() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND) || !"SM-J700F".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m5035d(C12267f0 f0Var) {
        return m5038a() || m5037b() || m5036c();
    }
}
