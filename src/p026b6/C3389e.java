package p026b6;

import android.graphics.Matrix;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import p380v5.C13434e;
import p394w3.C13732e;

/* renamed from: b6.e */
/* loaded from: classes7.dex */
public class C3389e {

    /* renamed from: a */
    public static final C13732e<Integer> f5417a = C13732e.m2854a(2, 7, 4, 5);

    /* renamed from: a */
    public static int m34538a(int i) {
        return Math.max(1, 8 / i);
    }

    /* renamed from: b */
    public static float m34537b(ResizeOptions resizeOptions, int i, int i2) {
        if (resizeOptions == null) {
            return 1.0f;
        }
        float f = i;
        float f2 = i2;
        float max = Math.max(resizeOptions.f8141a / f, resizeOptions.f8142b / f2);
        float f3 = resizeOptions.f8143c;
        if (f * max > f3) {
            max = f3 / f;
        }
        if (f2 * max > f3) {
            return f3 / f2;
        }
        return max;
    }

    /* renamed from: c */
    private static int m34536c(C13434e eVar) {
        int H = eVar.m3723H();
        if (H == 90 || H == 180 || H == 270) {
            return eVar.m3723H();
        }
        return 0;
    }

    /* renamed from: d */
    public static int m34535d(RotationOptions rotationOptions, C13434e eVar) {
        int i;
        int r = eVar.m3700r();
        C13732e<Integer> eVar2 = f5417a;
        int indexOf = eVar2.indexOf(Integer.valueOf(r));
        if (indexOf >= 0) {
            if (!rotationOptions.m31491g()) {
                i = rotationOptions.m31493e();
            } else {
                i = 0;
            }
            return eVar2.get((indexOf + (i / 90)) % eVar2.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    /* renamed from: e */
    public static int m34534e(RotationOptions rotationOptions, C13434e eVar) {
        if (!rotationOptions.m31492f()) {
            return 0;
        }
        int c = m34536c(eVar);
        if (rotationOptions.m31491g()) {
            return c;
        }
        return (c + rotationOptions.m31493e()) % 360;
    }

    /* renamed from: f */
    public static int m34533f(RotationOptions rotationOptions, ResizeOptions resizeOptions, C13434e eVar, boolean z) {
        int i;
        int i2;
        int i3;
        if (!z || resizeOptions == null) {
            return 8;
        }
        int e = m34534e(rotationOptions, eVar);
        boolean z2 = false;
        if (f5417a.contains(Integer.valueOf(eVar.m3700r()))) {
            i = m34535d(rotationOptions, eVar);
        } else {
            i = 0;
        }
        if (e == 90 || e == 270 || i == 5 || i == 7) {
            z2 = true;
        }
        if (z2) {
            i2 = eVar.getHeight();
        } else {
            i2 = eVar.getWidth();
        }
        if (z2) {
            i3 = eVar.getWidth();
        } else {
            i3 = eVar.getHeight();
        }
        int k = m34528k(m34537b(resizeOptions, i2, i3), resizeOptions.f8144d);
        if (k > 8) {
            return 8;
        }
        if (k < 1) {
            return 1;
        }
        return k;
    }

    /* renamed from: g */
    public static Matrix m34532g(C13434e eVar, RotationOptions rotationOptions) {
        if (f5417a.contains(Integer.valueOf(eVar.m3700r()))) {
            return m34531h(m34535d(rotationOptions, eVar));
        }
        int e = m34534e(rotationOptions, eVar);
        if (e == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(e);
        return matrix;
    }

    /* renamed from: h */
    private static Matrix m34531h(int i) {
        Matrix matrix = new Matrix();
        if (i == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i != 5) {
            return null;
        } else {
            matrix.setRotate(90.0f);
            matrix.postScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    /* renamed from: i */
    public static boolean m34530i(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: j */
    public static boolean m34529j(int i) {
        return i >= 0 && i <= 270 && i % 90 == 0;
    }

    /* renamed from: k */
    public static int m34528k(float f, float f2) {
        return (int) (f2 + (f * 8.0f));
    }
}
