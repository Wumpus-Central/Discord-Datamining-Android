package p340t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p308r.C12267f0;

/* renamed from: t.o */
/* loaded from: classes.dex */
public class C12927o implements AbstractC12934u {

    /* renamed from: a */
    public static final List<String> f29009a = Arrays.asList("SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m5047a(C12267f0 f0Var) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        if (!"SAMSUNG".equals(str.toUpperCase(locale)) || !f29009a.contains(Build.MODEL.toUpperCase(locale)) || ((Integer) f0Var.m7252a(CameraCharacteristics.LENS_FACING)).intValue() != 1) {
            return false;
        }
        return true;
    }
}
