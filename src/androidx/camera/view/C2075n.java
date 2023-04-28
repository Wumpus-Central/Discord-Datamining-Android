package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;
import androidx.camera.core.AbstractC1947w1;
import androidx.camera.core.impl.utils.C1869r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.view.n */
/* loaded from: classes.dex */
public class C2075n extends AbstractC1947w1 {

    /* renamed from: d */
    static final PointF f2368d = new PointF(2.0f, 2.0f);

    /* renamed from: b */
    private final C2059f f2369b;

    /* renamed from: c */
    private Matrix f2370c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2075n(C2059f fVar) {
        this.f2369b = fVar;
    }

    @Override // androidx.camera.core.AbstractC1947w1
    /* renamed from: a */
    protected PointF mo39116a(float f, float f2) {
        float[] fArr = {f, f2};
        synchronized (this) {
            Matrix matrix = this.f2370c;
            if (matrix == null) {
                return f2368d;
            }
            matrix.mapPoints(fArr);
            return new PointF(fArr[0], fArr[1]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m39115e(Size size, int i) {
        C1869r.m39614a();
        synchronized (this) {
            if (!(size.getWidth() == 0 || size.getHeight() == 0)) {
                this.f2370c = this.f2369b.m39151c(size, i);
                return;
            }
            this.f2370c = null;
        }
    }
}
