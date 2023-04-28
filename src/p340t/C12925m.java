package p340t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p308r.C12267f0;

/* renamed from: t.m */
/* loaded from: classes.dex */
public class C12925m implements AbstractC12934u {

    /* renamed from: a */
    private static final List<String> f29007a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m5049a(C12267f0 f0Var) {
        if (!f29007a.contains(Build.MODEL.toUpperCase(Locale.US)) || ((Integer) f0Var.m7252a(CameraCharacteristics.LENS_FACING)).intValue() != 1) {
            return false;
        }
        return true;
    }
}
