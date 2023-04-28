package com.facebook.imagepipeline.producers;

import p414x3.C13925a;

/* renamed from: com.facebook.imagepipeline.producers.b */
/* loaded from: classes7.dex */
public abstract class AbstractC4954b<T> implements Consumer<T> {

    /* renamed from: a */
    private boolean f8382a = false;

    /* renamed from: d */
    public static boolean m31197d(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: e */
    public static boolean m31196e(int i) {
        return !m31197d(i);
    }

    /* renamed from: k */
    public static int m31194k(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: l */
    public static boolean m31193l(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: m */
    public static boolean m31192m(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: n */
    public static int m31191n(int i, int i2) {
        return i & (~i2);
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    /* renamed from: a */
    public synchronized void mo31200a() {
        if (!this.f8382a) {
            this.f8382a = true;
            try {
                mo30932f();
            } catch (Exception e) {
                m31195j(e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    /* renamed from: b */
    public synchronized void mo31199b(T t, int i) {
        if (!this.f8382a) {
            this.f8382a = m31197d(i);
            try {
                mo30912h(t, i);
            } catch (Exception e) {
                m31195j(e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    /* renamed from: c */
    public synchronized void mo31198c(float f) {
        if (!this.f8382a) {
            try {
                mo31001i(f);
            } catch (Exception e) {
                m31195j(e);
            }
        }
    }

    /* renamed from: f */
    protected abstract void mo30932f();

    /* renamed from: g */
    protected abstract void mo30913g(Throwable th2);

    /* renamed from: h */
    protected abstract void mo30912h(T t, int i);

    /* renamed from: i */
    protected abstract void mo31001i(float f);

    /* renamed from: j */
    protected void m31195j(Exception exc) {
        C13925a.m2300L(getClass(), "unhandled exception", exc);
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    public synchronized void onFailure(Throwable th2) {
        if (!this.f8382a) {
            this.f8382a = true;
            try {
                mo30913g(th2);
            } catch (Exception e) {
                m31195j(e);
            }
        }
    }
}
