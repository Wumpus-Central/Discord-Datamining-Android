package p020b0;

import android.os.Build;
import p390w.AbstractC13595f2;
import p390w.AbstractC13662r0;
import p390w.C13639n0;

/* renamed from: b0.c */
/* loaded from: classes.dex */
public final class C3338c implements AbstractC13595f2 {
    /* renamed from: a */
    private static boolean m34620a() {
        if (!"HONOR".equalsIgnoreCase(Build.BRAND) || !"STK-LX1".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m34619b() {
        if (!"HUAWEI".equalsIgnoreCase(Build.BRAND) || !"SNE-LX1".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m34617d() {
        return m34619b() || m34620a();
    }

    /* renamed from: c */
    public boolean m34618c(AbstractC13662r0.AbstractC13663a<?> aVar) {
        return aVar != C13639n0.f30458g;
    }
}
