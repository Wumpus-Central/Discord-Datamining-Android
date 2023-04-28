package p355u;

import android.graphics.PointF;
import androidx.camera.core.C1935v1;
import p340t.C12914b;
import p390w.C13600g2;

/* renamed from: u.i */
/* loaded from: classes.dex */
public class C13169i {

    /* renamed from: a */
    private final C13600g2 f29523a;

    public C13169i(C13600g2 g2Var) {
        this.f29523a = g2Var;
    }

    /* renamed from: a */
    public PointF m4428a(C1935v1 v1Var, int i) {
        if (i != 1 || !this.f29523a.m3261a(C12914b.class)) {
            return new PointF(v1Var.m39483c(), v1Var.m39482d());
        }
        return new PointF(1.0f - v1Var.m39483c(), v1Var.m39482d());
    }
}
