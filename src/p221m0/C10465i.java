package p221m0;

import android.os.Build;
import p145i0.C8194v;
import p390w.AbstractC13595f2;

/* renamed from: m0.i */
/* loaded from: classes.dex */
public class C10465i implements AbstractC13595f2 {
    /* renamed from: a */
    private static boolean m13114a() {
        if (!"Huawei".equalsIgnoreCase(Build.BRAND) || !"HMA-L29".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m13113b() {
        if (!"Huawei".equalsIgnoreCase(Build.BRAND) || !"LYA-AL00".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m13111d() {
        return m13114a() || m13113b();
    }

    /* renamed from: c */
    public boolean m13112c(C8194v vVar) {
        return vVar == C8194v.f17724d;
    }
}
