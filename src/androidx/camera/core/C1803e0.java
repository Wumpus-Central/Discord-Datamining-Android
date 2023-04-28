package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.core.util.C2517g;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p120gc.AbstractFutureC7576b;
import p390w.AbstractC13629l1;
import p390w.AbstractC13635m1;
import p390w.AbstractC13645o0;
import p410x.C13905a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.e0 */
/* loaded from: classes.dex */
public class C1803e0 implements AbstractC13645o0 {

    /* renamed from: a */
    private final AbstractC13645o0 f1692a;

    /* renamed from: b */
    private final AbstractC13645o0 f1693b;

    /* renamed from: c */
    final Executor f1694c;

    /* renamed from: d */
    private final int f1695d;

    /* renamed from: e */
    private AbstractC13635m1 f1696e = null;

    /* renamed from: f */
    private AbstractC1876k1 f1697f = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1803e0(AbstractC13645o0 o0Var, int i, AbstractC13645o0 o0Var2, Executor executor) {
        this.f1692a = o0Var;
        this.f1693b = o0Var2;
        this.f1694c = executor;
        this.f1695d = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m39792h(AbstractC13635m1 m1Var) {
        final ImageProxy g = m1Var.mo3153g();
        try {
            this.f1694c.execute(new Runnable() { // from class: androidx.camera.core.d0
                @Override // java.lang.Runnable
                public final void run() {
                    C1803e0.this.m39793g(g);
                }
            });
        } catch (RejectedExecutionException unused) {
            C1915r1.m39525c("CaptureProcessorPipeline", "The executor for post-processing might have been shutting down or terminated!");
            g.close();
        }
    }

    @Override // p390w.AbstractC13645o0
    /* renamed from: a */
    public void mo291a(Surface surface, int i) {
        this.f1693b.mo291a(surface, i);
    }

    @Override // p390w.AbstractC13645o0
    /* renamed from: b */
    public void mo290b(AbstractC13629l1 l1Var) {
        AbstractFutureC7576b<ImageProxy> b = l1Var.mo3126b(l1Var.mo3127a().get(0).intValue());
        C2517g.m37594a(b.isDone());
        try {
            this.f1697f = b.get().mo39604p0();
            this.f1692a.mo290b(l1Var);
        } catch (InterruptedException | ExecutionException unused) {
            throw new IllegalArgumentException("Can not successfully extract ImageProxy from the ImageProxyBundle.");
        }
    }

    @Override // p390w.AbstractC13645o0
    /* renamed from: c */
    public void mo289c(Size size) {
        C1797d dVar = new C1797d(ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, this.f1695d));
        this.f1696e = dVar;
        this.f1692a.mo291a(dVar.getSurface(), 35);
        this.f1692a.mo289c(size);
        this.f1693b.mo289c(size);
        this.f1696e.mo3154f(new AbstractC13635m1.AbstractC13636a() { // from class: androidx.camera.core.c0
            @Override // p390w.AbstractC13635m1.AbstractC13636a
            /* renamed from: a */
            public final void mo3152a(AbstractC13635m1 m1Var) {
                C1803e0.this.m39792h(m1Var);
            }
        }, C13905a.m2339a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m39794f() {
        AbstractC13635m1 m1Var = this.f1696e;
        if (m1Var != null) {
            m1Var.mo3155e();
            this.f1696e.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m39793g(ImageProxy imageProxy) {
        Size size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
        C2517g.m37588g(this.f1697f);
        String next = this.f1697f.mo343c().m3088d().iterator().next();
        int intValue = ((Integer) this.f1697f.mo343c().m3089c(next)).intValue();
        C1877k2 k2Var = new C1877k2(imageProxy, size, this.f1697f);
        this.f1697f = null;
        C1881l2 l2Var = new C1881l2(Collections.singletonList(Integer.valueOf(intValue)), next);
        l2Var.m39603c(k2Var);
        this.f1693b.mo290b(l2Var);
    }
}
