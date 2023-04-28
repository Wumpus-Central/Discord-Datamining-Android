package p340t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p308r.C12267f0;
import p390w.AbstractC13595f2;

/* renamed from: t.b */
/* loaded from: classes.dex */
public class C12914b implements AbstractC13595f2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m5075a(C12267f0 f0Var) {
        if (!Build.BRAND.equalsIgnoreCase("SAMSUNG") || ((Integer) f0Var.m7252a(CameraCharacteristics.LENS_FACING)).intValue() != 0) {
            return false;
        }
        return true;
    }
}
