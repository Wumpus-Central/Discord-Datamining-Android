package p451z;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.AbstractC1948w2;
import androidx.core.util.C2517g;
import java.util.HashMap;
import java.util.Map;
import p053d0.C6389a;

/* renamed from: z.n */
/* loaded from: classes.dex */
public class C14511n {
    /* renamed from: a */
    public static Map<AbstractC1948w2, Rect> m299a(Rect rect, boolean z, Rational rational, int i, int i2, int i3, Map<AbstractC1948w2, Size> map) {
        boolean z2;
        if (rect.width() <= 0 || rect.height() <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        C2517g.m37593b(z2, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap hashMap = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<AbstractC1948w2, Size> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().getWidth(), entry.getValue().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            hashMap.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF g = m293g(rectF2, C6389a.m25642c(i, rational), i2, z, i3, i);
        HashMap hashMap2 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, g);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            hashMap2.put((AbstractC1948w2) entry2.getKey(), rect2);
        }
        return hashMap2;
    }

    /* renamed from: b */
    private static RectF m298b(boolean z, int i, RectF rectF, RectF rectF2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = true;
        if (i != 0 || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i != 90 || !z) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 || z3) {
            return rectF2;
        }
        if (i != 0 || !z) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i != 270 || z) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z4 || z5) {
            return m297c(rectF2, rectF.centerX());
        }
        if (i != 90 || z) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (i != 180 || !z) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z6 || z7) {
            return m296d(rectF2, rectF.centerY());
        }
        if (i != 180 || z) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (i != 270 || !z) {
            z9 = false;
        }
        if (z8 || z9) {
            return m297c(m296d(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z + " rotation " + i);
    }

    /* renamed from: c */
    private static RectF m297c(RectF rectF, float f) {
        return new RectF(m295e(rectF.right, f), rectF.top, m295e(rectF.left, f), rectF.bottom);
    }

    /* renamed from: d */
    private static RectF m296d(RectF rectF, float f) {
        return new RectF(rectF.left, m294f(rectF.bottom, f), rectF.right, m294f(rectF.top, f));
    }

    /* renamed from: e */
    private static float m295e(float f, float f2) {
        return (f2 + f2) - f;
    }

    /* renamed from: f */
    private static float m294f(float f, float f2) {
        return (f2 + f2) - f;
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: g */
    public static RectF m293g(RectF rectF, Rational rational, int i, boolean z, int i2, int i3) {
        if (i == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else if (i == 2) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        } else {
            throw new IllegalStateException("Unexpected scale type: " + i);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return m298b(m292h(z, i2), i3, rectF, rectF3);
    }

    /* renamed from: h */
    private static boolean m292h(boolean z, int i) {
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        return z ^ z2;
    }
}
