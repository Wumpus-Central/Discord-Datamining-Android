package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* renamed from: androidx.camera.view.b0 */
/* loaded from: classes.dex */
public class C2053b0 {

    /* renamed from: a */
    public static final RectF f2300a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* renamed from: a */
    public static Matrix m39172a(Rect rect) {
        return m39171b(new RectF(rect));
    }

    /* renamed from: b */
    private static Matrix m39171b(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f2300a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    /* renamed from: c */
    public static Matrix m39170c(RectF rectF, RectF rectF2, int i) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f2300a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i);
        matrix.postConcat(m39171b(rectF2));
        return matrix;
    }

    /* renamed from: d */
    public static boolean m39169d(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i);
    }

    /* renamed from: e */
    public static boolean m39168e(Size size, boolean z, Size size2, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        if (z) {
            f = size.getWidth() / size.getHeight();
            f2 = f;
        } else {
            f = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            f2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z2) {
            f3 = size2.getWidth() / size2.getHeight();
            f4 = f3;
        } else {
            float width = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
            f3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            f4 = width;
        }
        if (f < f3 || f4 < f2) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static int m39167f(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalStateException("Unexpected rotation value " + i);
    }
}
