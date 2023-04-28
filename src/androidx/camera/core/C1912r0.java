package androidx.camera.core;

import androidx.camera.core.AbstractC1833i0;
import androidx.camera.core.C1912r0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import p390w.AbstractC13635m1;
import p410x.C13905a;
import p431y.AbstractC14182c;
import p431y.C14186f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.r0 */
/* loaded from: classes.dex */
public final class C1912r0 extends AbstractC1903p0 {

    /* renamed from: u */
    final Executor f1942u;

    /* renamed from: v */
    private final Object f1943v = new Object();

    /* renamed from: w */
    ImageProxy f1944w;

    /* renamed from: x */
    private C1914b f1945x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.r0$a */
    /* loaded from: classes.dex */
    public class C1913a implements AbstractC14182c<Void> {

        /* renamed from: a */
        final /* synthetic */ C1914b f1946a;

        C1913a(C1914b bVar) {
            this.f1946a = bVar;
        }

        /* renamed from: b */
        public void mo1412a(Void r1) {
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            this.f1946a.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.r0$b */
    /* loaded from: classes.dex */
    public static class C1914b extends AbstractC1833i0 {

        /* renamed from: m */
        final WeakReference<C1912r0> f1948m;

        C1914b(ImageProxy imageProxy, C1912r0 r0Var) {
            super(imageProxy);
            this.f1948m = new WeakReference<>(r0Var);
            m39702b(new AbstractC1833i0.AbstractC1834a() { // from class: androidx.camera.core.s0
                @Override // androidx.camera.core.AbstractC1833i0.AbstractC1834a
                /* renamed from: c */
                public final void mo39498c(ImageProxy imageProxy2) {
                    C1912r0.C1914b.this.m39528n(imageProxy2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m39528n(ImageProxy imageProxy) {
            final C1912r0 r0Var = this.f1948m.get();
            if (r0Var != null) {
                r0Var.f1942u.execute(new Runnable() { // from class: androidx.camera.core.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1912r0.this.m39536A();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1912r0(Executor executor) {
        this.f1942u = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m39536A() {
        synchronized (this.f1943v) {
            this.f1945x = null;
            ImageProxy imageProxy = this.f1944w;
            if (imageProxy != null) {
                this.f1944w = null;
                mo39533p(imageProxy);
            }
        }
    }

    @Override // androidx.camera.core.AbstractC1903p0
    /* renamed from: d */
    ImageProxy mo39535d(AbstractC13635m1 m1Var) {
        return m1Var.mo3156d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.core.AbstractC1903p0
    /* renamed from: g */
    public void mo39534g() {
        synchronized (this.f1943v) {
            ImageProxy imageProxy = this.f1944w;
            if (imageProxy != null) {
                imageProxy.close();
                this.f1944w = null;
            }
        }
    }

    @Override // androidx.camera.core.AbstractC1903p0
    /* renamed from: p */
    void mo39533p(ImageProxy imageProxy) {
        synchronized (this.f1943v) {
            if (!this.f1935s) {
                imageProxy.close();
            } else if (this.f1945x != null) {
                if (imageProxy.mo39604p0().mo345a() <= this.f1945x.mo39604p0().mo345a()) {
                    imageProxy.close();
                } else {
                    ImageProxy imageProxy2 = this.f1944w;
                    if (imageProxy2 != null) {
                        imageProxy2.close();
                    }
                    this.f1944w = imageProxy;
                }
            } else {
                C1914b bVar = new C1914b(imageProxy, this);
                this.f1945x = bVar;
                C14186f.m1427b(m39560e(bVar), new C1913a(bVar), C13905a.m2339a());
            }
        }
    }
}
