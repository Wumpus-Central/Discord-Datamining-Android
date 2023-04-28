package androidx.transition;

import android.animation.TypeEvaluator;

/* renamed from: androidx.transition.i */
/* loaded from: classes.dex */
class C3231i implements TypeEvaluator<float[]> {

    /* renamed from: a */
    private float[] f5103a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3231i(float[] fArr) {
        this.f5103a = fArr;
    }

    /* renamed from: a */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f5103a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
