package p221m0;

import android.os.Build;
import p145i0.C8194v;
import p390w.AbstractC13595f2;

/* renamed from: m0.a */
/* loaded from: classes.dex */
public class C10457a implements AbstractC13595f2 {
    /* renamed from: a */
    private static boolean m13133a() {
        if (!"lge".equalsIgnoreCase(Build.BRAND) || !"lg-k430".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m13131c() {
        if (!"Xiaomi".equalsIgnoreCase(Build.BRAND) || !"redmi note 4".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m13130d() {
        return m13131c() || m13133a();
    }

    /* renamed from: b */
    public boolean m13132b(C8194v vVar) {
        if ((m13131c() || m13133a()) && vVar == C8194v.f17723c) {
            return true;
        }
        return false;
    }
}
