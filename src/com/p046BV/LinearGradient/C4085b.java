package com.p046BV.LinearGradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.PixelUtil;

/* renamed from: com.BV.LinearGradient.b */
/* loaded from: classes.dex */
public class C4085b extends View {

    /* renamed from: l */
    private Path f6713l;

    /* renamed from: m */
    private RectF f6714m;

    /* renamed from: n */
    private LinearGradient f6715n;

    /* renamed from: o */
    private float[] f6716o;

    /* renamed from: r */
    private int[] f6719r;

    /* renamed from: k */
    private final Paint f6712k = new Paint(1);

    /* renamed from: p */
    private float[] f6717p = {0.0f, 0.0f};

    /* renamed from: q */
    private float[] f6718q = {0.0f, 1.0f};

    /* renamed from: s */
    private boolean f6720s = false;

    /* renamed from: t */
    private float[] f6721t = {0.5f, 0.5f};

    /* renamed from: u */
    private float f6722u = 45.0f;

    /* renamed from: v */
    private int[] f6723v = {0, 0};

    /* renamed from: w */
    private float[] f6724w = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    public C4085b(Context context) {
        super(context);
    }

    /* renamed from: a */
    private float[] m32871a(float f) {
        float sqrt = (float) Math.sqrt(2.0d);
        double d = (f - 90.0f) * 0.017453292f;
        return new float[]{((float) Math.cos(d)) * sqrt, ((float) Math.sin(d)) * sqrt};
    }

    /* renamed from: b */
    private void m32870b() {
        int[] iArr = this.f6719r;
        if (iArr != null) {
            float[] fArr = this.f6716o;
            if (fArr == null || iArr.length == fArr.length) {
                float[] fArr2 = this.f6717p;
                float[] fArr3 = this.f6718q;
                if (this.f6720s && this.f6721t != null) {
                    float[] a = m32871a(this.f6722u);
                    float[] fArr4 = this.f6721t;
                    float[] fArr5 = {fArr4[0] - (a[0] / 2.0f), fArr4[1] - (a[1] / 2.0f)};
                    fArr3 = new float[]{fArr4[0] + (a[0] / 2.0f), fArr4[1] + (a[1] / 2.0f)};
                    fArr2 = fArr5;
                }
                float f = fArr2[0];
                int[] iArr2 = this.f6723v;
                int i = iArr2[0];
                float f2 = i * f;
                float f3 = fArr2[1];
                int i2 = iArr2[1];
                LinearGradient linearGradient = new LinearGradient(f2, f3 * i2, fArr3[0] * i, fArr3[1] * i2, this.f6719r, this.f6716o, Shader.TileMode.CLAMP);
                this.f6715n = linearGradient;
                this.f6712k.setShader(linearGradient);
                invalidate();
            }
        }
    }

    /* renamed from: c */
    private void m32869c() {
        if (this.f6713l == null) {
            this.f6713l = new Path();
            this.f6714m = new RectF();
        }
        this.f6713l.reset();
        RectF rectF = this.f6714m;
        int[] iArr = this.f6723v;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.f6713l.addRoundRect(this.f6714m, this.f6724w, Path.Direction.CW);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f6713l;
        if (path == null) {
            canvas.drawPaint(this.f6712k);
        } else {
            canvas.drawPath(path, this.f6712k);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f6723v = new int[]{i, i2};
        m32869c();
        m32870b();
    }

    public void setAngle(float f) {
        this.f6722u = f;
        m32870b();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.f6721t = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m32870b();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = PixelUtil.toPixelFromDIP((float) readableArray.getDouble(i));
        }
        this.f6724w = fArr;
        m32869c();
        m32870b();
    }

    public void setColors(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = readableArray.getInt(i);
        }
        this.f6719r = iArr;
        m32870b();
    }

    public void setEndPosition(ReadableArray readableArray) {
        this.f6718q = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m32870b();
    }

    public void setLocations(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        this.f6716o = fArr;
        m32870b();
    }

    public void setStartPosition(ReadableArray readableArray) {
        this.f6717p = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m32870b();
    }

    public void setUseAngle(boolean z) {
        this.f6720s = z;
        m32870b();
    }
}
