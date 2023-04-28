package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.utils.C1858m;
import p390w.C13671s2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.p1 */
/* loaded from: classes.dex */
public abstract class AbstractC1904p1 implements AbstractC1876k1 {
    /* renamed from: d */
    public static AbstractC1876k1 m39540d(C13671s2 s2Var, long j, int i, Matrix matrix) {
        return new C1828h(s2Var, j, i, matrix);
    }

    @Override // androidx.camera.core.AbstractC1876k1
    /* renamed from: a */
    public abstract long mo345a();

    @Override // androidx.camera.core.AbstractC1876k1
    /* renamed from: b */
    public void mo344b(C1858m.C1860b bVar) {
        bVar.m39625m(mo39539e());
    }

    @Override // androidx.camera.core.AbstractC1876k1
    /* renamed from: c */
    public abstract C13671s2 mo343c();

    /* renamed from: e */
    public abstract int mo39539e();

    /* renamed from: f */
    public abstract Matrix mo39538f();
}
