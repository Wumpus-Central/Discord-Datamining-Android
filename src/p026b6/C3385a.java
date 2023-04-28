package p026b6;

import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import p170j5.C9489b;
import p380v5.C13434e;
import p394w3.C13740j;
import p414x3.C13925a;

/* renamed from: b6.a */
/* loaded from: classes7.dex */
public class C3385a {
    /* renamed from: a */
    public static float m34545a(RotationOptions rotationOptions, ResizeOptions resizeOptions, C13434e eVar) {
        boolean z;
        int i;
        int i2;
        C13740j.m2839b(Boolean.valueOf(C13434e.m3709b0(eVar)));
        if (resizeOptions == null || resizeOptions.f8142b <= 0 || resizeOptions.f8141a <= 0 || eVar.getWidth() == 0 || eVar.getHeight() == 0) {
            return 1.0f;
        }
        int d = m34542d(rotationOptions, eVar);
        if (d == 90 || d == 270) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = eVar.getHeight();
        } else {
            i = eVar.getWidth();
        }
        if (z) {
            i2 = eVar.getWidth();
        } else {
            i2 = eVar.getHeight();
        }
        float f = resizeOptions.f8141a / i;
        float f2 = resizeOptions.f8142b / i2;
        float max = Math.max(f, f2);
        C13925a.m2309C("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(resizeOptions.f8141a), Integer.valueOf(resizeOptions.f8142b), Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(max));
        return max;
    }

    /* renamed from: b */
    public static int m34544b(RotationOptions rotationOptions, ResizeOptions resizeOptions, C13434e eVar, int i) {
        int i2;
        float f;
        if (!C13434e.m3709b0(eVar)) {
            return 1;
        }
        float a = m34545a(rotationOptions, resizeOptions, eVar);
        if (eVar.m3698t() == C9489b.f21011a) {
            i2 = m34540f(a);
        } else {
            i2 = m34541e(a);
        }
        int max = Math.max(eVar.getHeight(), eVar.getWidth());
        if (resizeOptions != null) {
            f = resizeOptions.f8143c;
        } else {
            f = i;
        }
        while (max / i2 > f) {
            if (eVar.m3698t() == C9489b.f21011a) {
                i2 *= 2;
            } else {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: c */
    public static int m34543c(C13434e eVar, int i, int i2) {
        int Q = eVar.m3715Q();
        while ((((eVar.getWidth() * eVar.getHeight()) * i) / Q) / Q > i2) {
            Q *= 2;
        }
        return Q;
    }

    /* renamed from: d */
    private static int m34542d(RotationOptions rotationOptions, C13434e eVar) {
        boolean z = false;
        if (!rotationOptions.m31491g()) {
            return 0;
        }
        int H = eVar.m3723H();
        if (H == 0 || H == 90 || H == 180 || H == 270) {
            z = true;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        return H;
    }

    /* renamed from: e */
    public static int m34541e(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d = i;
            if ((1.0d / d) + ((1.0d / (Math.pow(d, 2.0d) - d)) * 0.3333333432674408d) <= f) {
                return i - 1;
            }
            i++;
        }
    }

    /* renamed from: f */
    public static int m34540f(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d = 1.0d / i2;
            if (d + (0.3333333432674408d * d) <= f) {
                return i;
            }
            i = i2;
        }
    }
}
