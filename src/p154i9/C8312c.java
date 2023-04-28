package p154i9;

import android.opengl.Matrix;
import p119g9.C7542k0;

/* renamed from: i9.c */
/* loaded from: classes5.dex */
public final class C8312c {

    /* renamed from: a */
    private final float[] f18128a = new float[16];

    /* renamed from: b */
    private final float[] f18129b = new float[16];

    /* renamed from: c */
    private final C7542k0<float[]> f18130c = new C7542k0<>();

    /* renamed from: d */
    private boolean f18131d;

    /* renamed from: a */
    public static void m19981a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10];
        fArr[0] = f3 / sqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3 / sqrt;
    }

    /* renamed from: b */
    private static void m19980b(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    /* renamed from: c */
    public boolean m19979c(float[] fArr, long j) {
        float[] j2 = this.f18130c.m22278j(j);
        if (j2 == null) {
            return false;
        }
        m19980b(this.f18129b, j2);
        if (!this.f18131d) {
            m19981a(this.f18128a, this.f18129b);
            this.f18131d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f18128a, 0, this.f18129b, 0);
        return true;
    }

    /* renamed from: d */
    public void m19978d() {
        this.f18130c.m22285c();
        this.f18131d = false;
    }

    /* renamed from: e */
    public void m19977e(long j, float[] fArr) {
        this.f18130c.m22287a(j, fArr);
    }
}
