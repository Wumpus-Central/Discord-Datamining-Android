package p053d0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.C1915r1;
import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;

/* renamed from: d0.a */
/* loaded from: classes.dex */
public final class C6389a {
    /* renamed from: a */
    public static Rect m25644a(Size size, Rational rational) {
        int i;
        if (!m25640e(rational)) {
            C1915r1.m39517k("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f = width;
        float f2 = height;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i2 = 0;
        if (rational.floatValue() > f / f2) {
            int round = Math.round((f / numerator) * denominator);
            i = (height - round) / 2;
            height = round;
        } else {
            int round2 = Math.round((f2 / denominator) * numerator);
            int i3 = (width - round2) / 2;
            width = round2;
            i = 0;
            i2 = i3;
        }
        return new Rect(i2, i, width + i2, height + i);
    }

    /* renamed from: b */
    public static Rect m25643b(Rect rect, int i, Size size, int i2) {
        Matrix matrix = new Matrix();
        matrix.setRotate(i2 - i);
        float[] i3 = m25636i(size);
        matrix.mapPoints(i3);
        matrix.postTranslate(-m25637h(i3[0], i3[2], i3[4], i3[6]), -m25637h(i3[1], i3[3], i3[5], i3[7]));
        matrix.invert(matrix);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, new RectF(rect));
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* renamed from: c */
    public static Rational m25642c(int i, Rational rational) {
        if (i == 90 || i == 270) {
            return m25641d(rational);
        }
        return new Rational(rational.getNumerator(), rational.getDenominator());
    }

    /* renamed from: d */
    private static Rational m25641d(Rational rational) {
        if (rational == null) {
            return rational;
        }
        return new Rational(rational.getDenominator(), rational.getNumerator());
    }

    /* renamed from: e */
    public static boolean m25640e(Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && !rational.isNaN();
    }

    /* renamed from: f */
    public static boolean m25639f(Size size, Rational rational) {
        if (rational == null || rational.floatValue() <= 0.0f || !m25638g(size, rational) || rational.isNaN()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m25638g(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = rational.getNumerator();
        float denominator = rational.getDenominator();
        if (height == Math.round((width / numerator) * denominator) && width == Math.round((height / denominator) * numerator)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static float m25637h(float f, float f2, float f3, float f4) {
        return Math.min(Math.min(f, f2), Math.min(f3, f4));
    }

    /* renamed from: i */
    public static float[] m25636i(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    /* renamed from: j */
    public static byte[] m25635j(ImageProxy imageProxy) {
        ImageProxy.AbstractC1764a aVar = imageProxy.mo39701d0()[0];
        ImageProxy.AbstractC1764a aVar2 = imageProxy.mo39701d0()[1];
        ImageProxy.AbstractC1764a aVar3 = imageProxy.mo39701d0()[2];
        ByteBuffer c = aVar.mo39901c();
        ByteBuffer c2 = aVar2.mo39901c();
        ByteBuffer c3 = aVar3.mo39901c();
        c.rewind();
        c2.rewind();
        c3.rewind();
        int remaining = c.remaining();
        byte[] bArr = new byte[((imageProxy.getWidth() * imageProxy.getHeight()) / 2) + remaining];
        int i = 0;
        for (int i2 = 0; i2 < imageProxy.getHeight(); i2++) {
            c.get(bArr, i, imageProxy.getWidth());
            i += imageProxy.getWidth();
            c.position(Math.min(remaining, (c.position() - imageProxy.getWidth()) + aVar.mo39900d()));
        }
        int height = imageProxy.getHeight() / 2;
        int width = imageProxy.getWidth() / 2;
        int d = aVar3.mo39900d();
        int d2 = aVar2.mo39900d();
        int e = aVar3.mo39899e();
        int e2 = aVar2.mo39899e();
        byte[] bArr2 = new byte[d];
        byte[] bArr3 = new byte[d2];
        for (int i3 = 0; i3 < height; i3++) {
            c3.get(bArr2, 0, Math.min(d, c3.remaining()));
            c2.get(bArr3, 0, Math.min(d2, c2.remaining()));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < width; i6++) {
                int i7 = i + 1;
                bArr[i] = bArr2[i4];
                i = i7 + 1;
                bArr[i7] = bArr3[i5];
                i4 += e;
                i5 += e2;
            }
        }
        return bArr;
    }
}
