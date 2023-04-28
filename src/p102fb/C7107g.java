package p102fb;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: fb.g */
/* loaded from: classes3.dex */
public class C7107g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f15496a = new float[9];

    /* renamed from: b */
    private final float[] f15497b = new float[9];

    /* renamed from: c */
    private final Matrix f15498c = new Matrix();

    /* renamed from: a */
    public Matrix mo23387a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f15496a);
        matrix2.getValues(this.f15497b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f15497b;
            float f2 = fArr[i];
            float f3 = this.f15496a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f15498c.setValues(this.f15497b);
        return this.f15498c;
    }
}
