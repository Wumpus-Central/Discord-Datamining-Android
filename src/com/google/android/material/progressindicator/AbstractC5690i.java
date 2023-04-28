package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.vectordrawable.graphics.drawable.AbstractC3285b;

/* renamed from: com.google.android.material.progressindicator.i */
/* loaded from: classes3.dex */
abstract class AbstractC5690i<T extends Animator> {

    /* renamed from: a */
    protected C5691j f11142a;

    /* renamed from: b */
    protected final float[] f11143b;

    /* renamed from: c */
    protected final int[] f11144c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5690i(int i) {
        this.f11143b = new float[i * 2];
        this.f11144c = new int[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo27745a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public float m27744b(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    /* renamed from: c */
    public abstract void mo27743c();

    /* renamed from: d */
    public abstract void mo27742d(AbstractC3285b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void m27741e(C5691j jVar) {
        this.f11142a = jVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo27740f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo27739g();

    /* renamed from: h */
    public abstract void mo27738h();
}
