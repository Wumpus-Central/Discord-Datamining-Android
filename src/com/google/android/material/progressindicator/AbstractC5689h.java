package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.material.progressindicator.AbstractC5676b;

/* renamed from: com.google.android.material.progressindicator.h */
/* loaded from: classes3.dex */
abstract class AbstractC5689h<S extends AbstractC5676b> {

    /* renamed from: a */
    S f11140a;

    /* renamed from: b */
    protected AbstractC5685g f11141b;

    public AbstractC5689h(S s) {
        this.f11140a = s;
    }

    /* renamed from: a */
    abstract void mo27752a(Canvas canvas, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo27751b(Canvas canvas, Paint paint, float f, float f2, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo27750c(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo27749d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo27748e();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void m27747f(AbstractC5685g gVar) {
        this.f11141b = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m27746g(Canvas canvas, float f) {
        this.f11140a.mo27776e();
        mo27752a(canvas, f);
    }
}
