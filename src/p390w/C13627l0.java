package p390w;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.C1915r1;
import androidx.camera.core.C1921t;

/* renamed from: w.l0 */
/* loaded from: classes.dex */
public final class C13627l0 {

    /* renamed from: w.l0$a */
    /* loaded from: classes.dex */
    public static class C13628a extends Exception {
        public C13628a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* renamed from: a */
    public static void m3168a(Context context, C13602h0 h0Var, C1921t tVar) {
        Integer d;
        if (tVar != null) {
            try {
                d = tVar.m39512d();
                if (d == null) {
                    C1915r1.m39517k("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e) {
                C1915r1.m39524d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                return;
            }
        } else {
            d = null;
        }
        C1915r1.m39527a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + d);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (tVar == null || d.intValue() == 1)) {
                C1921t.f1957c.m39511e(h0Var.m3259a());
            }
            if (!packageManager.hasSystemFeature("android.hardware.camera.front")) {
                return;
            }
            if (tVar == null || d.intValue() == 0) {
                C1921t.f1956b.m39511e(h0Var.m3259a());
            }
        } catch (IllegalArgumentException e2) {
            C1915r1.m39525c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + h0Var.m3259a());
            throw new C13628a("Expected camera missing from device.", e2);
        }
    }
}
