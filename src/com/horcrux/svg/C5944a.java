package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.horcrux.svg.SVGLength;
import p414x3.C13925a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.horcrux.svg.a */
/* loaded from: classes6.dex */
public class C5944a {

    /* renamed from: a */
    private final EnumC0171a f11807a;

    /* renamed from: b */
    private final SVGLength[] f11808b;

    /* renamed from: c */
    private ReadableArray f11809c;

    /* renamed from: d */
    private final boolean f11810d;

    /* renamed from: e */
    private boolean f11811e;

    /* renamed from: f */
    private Matrix f11812f;

    /* renamed from: g */
    private Rect f11813g;

    /* renamed from: h */
    private C5989v f11814h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.a$a */
    /* loaded from: classes6.dex */
    public enum EnumC0171a {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.a$b */
    /* loaded from: classes6.dex */
    public enum EnumC5945b {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5944a(EnumC0171a aVar, SVGLength[] sVGLengthArr, EnumC5945b bVar) {
        boolean z;
        this.f11807a = aVar;
        this.f11808b = sVGLengthArr;
        if (bVar == EnumC5945b.OBJECT_BOUNDING_BOX) {
            z = true;
        } else {
            z = false;
        }
        this.f11810d = z;
    }

    /* renamed from: a */
    private RectF m26864a(RectF rectF) {
        float f;
        float f2;
        if (!this.f11810d) {
            rectF = new RectF(this.f11813g);
        }
        float width = rectF.width();
        float height = rectF.height();
        if (this.f11810d) {
            f2 = rectF.left;
            f = rectF.top;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        return new RectF(f2, f, width + f2, height + f);
    }

    /* renamed from: b */
    private double m26863b(SVGLength sVGLength, double d, float f, float f2) {
        double d2;
        if (!this.f11810d || sVGLength.f11768b != SVGLength.UnitType.NUMBER) {
            d2 = f;
        } else {
            d2 = d;
        }
        return C5992x.m26556a(sVGLength, d, 0.0d, d2, f2);
    }

    /* renamed from: c */
    private static void m26862c(ReadableArray readableArray, int i, float[] fArr, int[] iArr, float f) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            fArr[i2] = (float) readableArray.getDouble(i3);
            int i4 = readableArray.getInt(i3 + 1);
            iArr[i2] = (i4 & 16777215) | (Math.round((i4 >>> 24) * f) << 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m26861d(EnumC5945b bVar) {
        this.f11811e = bVar == EnumC5945b.OBJECT_BOUNDING_BOX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m26860e(ReadableArray readableArray) {
        this.f11809c = readableArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m26859f(Matrix matrix) {
        this.f11812f = matrix;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m26858g(C5989v vVar) {
        this.f11814h = vVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m26857h(Rect rect) {
        this.f11813g = rect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m26856i(Paint paint, RectF rectF, float f, float f2) {
        float[] fArr;
        int[] iArr;
        RectF a = m26864a(rectF);
        float width = a.width();
        float height = a.height();
        float f3 = a.left;
        float f4 = a.top;
        float textSize = paint.getTextSize();
        if (this.f11807a == EnumC0171a.PATTERN) {
            double d = width;
            double b = m26863b(this.f11808b[0], d, f, textSize);
            double d2 = height;
            double b2 = m26863b(this.f11808b[1], d2, f, textSize);
            double b3 = m26863b(this.f11808b[2], d, f, textSize);
            double b4 = m26863b(this.f11808b[3], d2, f, textSize);
            if (b3 > 1.0d && b4 > 1.0d) {
                Bitmap createBitmap = Bitmap.createBitmap((int) b3, (int) b4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                RectF viewBox = this.f11814h.getViewBox();
                if (viewBox != null && viewBox.width() > 0.0f && viewBox.height() > 0.0f) {
                    RectF rectF2 = new RectF((float) b, (float) b2, (float) b3, (float) b4);
                    C5989v vVar = this.f11814h;
                    canvas.concat(C5990v0.m26557a(viewBox, rectF2, vVar.f12075w, vVar.f12076x));
                }
                if (this.f11811e) {
                    canvas.scale(width / f, height / f);
                }
                this.f11814h.draw(canvas, new Paint(), f2);
                Matrix matrix = new Matrix();
                Matrix matrix2 = this.f11812f;
                if (matrix2 != null) {
                    matrix.preConcat(matrix2);
                }
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                return;
            }
            return;
        }
        int size = this.f11809c.size();
        if (size == 0) {
            C13925a.m2304H(ReactConstants.TAG, "Gradient contains no stops");
            return;
        }
        int i = size / 2;
        int[] iArr2 = new int[i];
        float[] fArr2 = new float[i];
        m26862c(this.f11809c, i, fArr2, iArr2, f2);
        if (i == 1) {
            int[] iArr3 = {iArr2[0], iArr2[0]};
            float[] fArr3 = {fArr2[0], fArr2[0]};
            C13925a.m2304H(ReactConstants.TAG, "Gradient contains only one stop");
            iArr = iArr3;
            fArr = fArr3;
        } else {
            iArr = iArr2;
            fArr = fArr2;
        }
        EnumC0171a aVar = this.f11807a;
        if (aVar == EnumC0171a.LINEAR_GRADIENT) {
            double d3 = width;
            double b5 = m26863b(this.f11808b[0], d3, f, textSize);
            double d4 = f3;
            double d5 = height;
            double d6 = f4;
            LinearGradient linearGradient = new LinearGradient((float) (b5 + d4), (float) (m26863b(this.f11808b[1], d5, f, textSize) + d6), (float) (m26863b(this.f11808b[2], d3, f, textSize) + d4), (float) (m26863b(this.f11808b[3], d5, f, textSize) + d6), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.f11812f != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.f11812f);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
        } else if (aVar == EnumC0171a.RADIAL_GRADIENT) {
            double d7 = width;
            double b6 = m26863b(this.f11808b[2], d7, f, textSize);
            double d8 = height;
            double b7 = m26863b(this.f11808b[3], d8, f, textSize) / b6;
            RadialGradient radialGradient = new RadialGradient((float) (m26863b(this.f11808b[4], d7, f, textSize) + f3), (float) (m26863b(this.f11808b[5], d8 / b7, f, textSize) + (f4 / b7)), (float) b6, iArr, fArr, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) b7);
            Matrix matrix5 = this.f11812f;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }
}
