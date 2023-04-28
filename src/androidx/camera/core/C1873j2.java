package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.AbstractC1833i0;
import java.util.concurrent.Executor;
import p390w.AbstractC13635m1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.j2 */
/* loaded from: classes.dex */
public class C1873j2 implements AbstractC13635m1 {

    /* renamed from: d */
    private final AbstractC13635m1 f1859d;

    /* renamed from: e */
    private final Surface f1860e;

    /* renamed from: a */
    private final Object f1856a = new Object();

    /* renamed from: b */
    private int f1857b = 0;

    /* renamed from: c */
    private boolean f1858c = false;

    /* renamed from: f */
    private final AbstractC1833i0.AbstractC1834a f1861f = new AbstractC1833i0.AbstractC1834a() { // from class: androidx.camera.core.h2
        @Override // androidx.camera.core.AbstractC1833i0.AbstractC1834a
        /* renamed from: c */
        public final void mo39498c(ImageProxy imageProxy) {
            C1873j2.this.m39609i(imageProxy);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1873j2(AbstractC13635m1 m1Var) {
        this.f1859d = m1Var;
        this.f1860e = m1Var.getSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m39609i(ImageProxy imageProxy) {
        synchronized (this.f1856a) {
            int i = this.f1857b - 1;
            this.f1857b = i;
            if (this.f1858c && i == 0) {
                close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m39608j(AbstractC13635m1.AbstractC13636a aVar, AbstractC13635m1 m1Var) {
        aVar.mo3152a(this);
    }

    /* renamed from: l */
    private ImageProxy m39606l(ImageProxy imageProxy) {
        if (imageProxy == null) {
            return null;
        }
        this.f1857b++;
        C1892m2 m2Var = new C1892m2(imageProxy);
        m2Var.m39702b(this.f1861f);
        return m2Var;
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: a */
    public int mo3158a() {
        int a;
        synchronized (this.f1856a) {
            a = this.f1859d.mo3158a();
        }
        return a;
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: b */
    public int mo3157b() {
        int b;
        synchronized (this.f1856a) {
            b = this.f1859d.mo3157b();
        }
        return b;
    }

    @Override // p390w.AbstractC13635m1
    public void close() {
        synchronized (this.f1856a) {
            Surface surface = this.f1860e;
            if (surface != null) {
                surface.release();
            }
            this.f1859d.close();
        }
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: d */
    public ImageProxy mo3156d() {
        ImageProxy l;
        synchronized (this.f1856a) {
            l = m39606l(this.f1859d.mo3156d());
        }
        return l;
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: e */
    public void mo3155e() {
        synchronized (this.f1856a) {
            this.f1859d.mo3155e();
        }
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: f */
    public void mo3154f(final AbstractC13635m1.AbstractC13636a aVar, Executor executor) {
        synchronized (this.f1856a) {
            this.f1859d.mo3154f(new AbstractC13635m1.AbstractC13636a() { // from class: androidx.camera.core.i2
                @Override // p390w.AbstractC13635m1.AbstractC13636a
                /* renamed from: a */
                public final void mo3152a(AbstractC13635m1 m1Var) {
                    C1873j2.this.m39608j(aVar, m1Var);
                }
            }, executor);
        }
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: g */
    public ImageProxy mo3153g() {
        ImageProxy l;
        synchronized (this.f1856a) {
            l = m39606l(this.f1859d.mo3153g());
        }
        return l;
    }

    @Override // p390w.AbstractC13635m1
    public int getHeight() {
        int height;
        synchronized (this.f1856a) {
            height = this.f1859d.getHeight();
        }
        return height;
    }

    @Override // p390w.AbstractC13635m1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f1856a) {
            surface = this.f1859d.getSurface();
        }
        return surface;
    }

    @Override // p390w.AbstractC13635m1
    public int getWidth() {
        int width;
        synchronized (this.f1856a) {
            width = this.f1859d.getWidth();
        }
        return width;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m39607k() {
        synchronized (this.f1856a) {
            this.f1858c = true;
            this.f1859d.mo3155e();
            if (this.f1857b == 0) {
                close();
            }
        }
    }
}
