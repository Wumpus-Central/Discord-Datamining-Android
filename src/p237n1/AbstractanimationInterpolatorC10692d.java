package p237n1;

import android.view.animation.Interpolator;

/* renamed from: n1.d  reason: invalid class name */
/* loaded from: classes.dex */
abstract class AbstractanimationInterpolatorC10692d implements Interpolator {

    /* renamed from: a */
    private final float[] f23658a;

    /* renamed from: b */
    private final float f23659b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractanimationInterpolatorC10692d(float[] fArr) {
        this.f23658a = fArr;
        this.f23659b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f23658a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f23659b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f23658a;
        float f4 = fArr2[min];
        return f4 + (f3 * (fArr2[min + 1] - f4));
    }
}
