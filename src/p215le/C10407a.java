package p215le;

import android.graphics.PointF;
import android.opengl.Matrix;
import ke.C9853d;

/* renamed from: le.a */
/* loaded from: classes6.dex */
public class C10407a {
    /* renamed from: a */
    public static float[] m13474a(float[] fArr, C9853d dVar) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = fArr[0];
        if (f6 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = Math.abs(fArr[4]);
        } else {
            f = Math.abs(f6);
        }
        float f7 = 1.0f / f;
        if (z) {
            PointF pointF = dVar.f21967a;
            f2 = pointF.x;
            f3 = pointF.y * f7;
        } else {
            PointF pointF2 = dVar.f21967a;
            f2 = pointF2.x * f7;
            f3 = pointF2.y;
        }
        if (z) {
            PointF pointF3 = dVar.f21968b;
            f4 = (pointF3.x * 2.0f) - 1.0f;
            f5 = (1.0f - (pointF3.y * 2.0f)) * f7;
        } else {
            PointF pointF4 = dVar.f21968b;
            f4 = ((pointF4.x * 2.0f) - 1.0f) * f7;
            f5 = 1.0f - (pointF4.y * 2.0f);
        }
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, f4, f5, 0.0f);
        Matrix.rotateM(fArr2, 0, dVar.f21969c, 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArr2, 0, f2, f3, 1.0f);
        float[] fArr3 = new float[16];
        Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
        return fArr3;
    }
}
