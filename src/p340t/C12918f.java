package p340t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p308r.C12267f0;

/* renamed from: t.f */
/* loaded from: classes.dex */
public class C12918f implements AbstractC12934u {

    /* renamed from: a */
    public static final List<String> f29001a = Arrays.asList("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m5070a(C12267f0 f0Var) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        if (!"SAMSUNG".equals(str.toUpperCase(locale)) || !f29001a.contains(Build.MODEL.toUpperCase(locale)) || ((Integer) f0Var.m7252a(CameraCharacteristics.LENS_FACING)).intValue() != 1) {
            return false;
        }
        return true;
    }
}
