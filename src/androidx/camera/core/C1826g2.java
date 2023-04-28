package androidx.camera.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ScheduledExecutorService;
import p120gc.AbstractFutureC7576b;
import p390w.AbstractC13615k;
import p390w.AbstractC13635m1;
import p390w.AbstractC13645o0;
import p390w.AbstractC13651p0;
import p390w.AbstractC13689w0;
import p390w.C13643n2;
import p410x.C13905a;
import p431y.AbstractC14182c;
import p431y.C14186f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.g2 */
/* loaded from: classes.dex */
public final class C1826g2 extends AbstractC13689w0 {

    /* renamed from: n */
    private final AbstractC13635m1.AbstractC13636a f1758n;

    /* renamed from: p */
    private final Size f1760p;

    /* renamed from: q */
    final C1930u1 f1761q;

    /* renamed from: r */
    final Surface f1762r;

    /* renamed from: s */
    private final Handler f1763s;

    /* renamed from: t */
    final AbstractC13651p0 f1764t;

    /* renamed from: u */
    final AbstractC13645o0 f1765u;

    /* renamed from: v */
    private final AbstractC13615k f1766v;

    /* renamed from: w */
    private final AbstractC13689w0 f1767w;

    /* renamed from: x */
    private String f1768x;

    /* renamed from: m */
    final Object f1757m = new Object();

    /* renamed from: o */
    boolean f1759o = false;

    /* renamed from: androidx.camera.core.g2$a */
    /* loaded from: classes.dex */
    class C1827a implements AbstractC14182c<Surface> {
        C1827a() {
        }

        /* renamed from: b */
        public void mo1412a(Surface surface) {
            synchronized (C1826g2.this.f1757m) {
                C1826g2.this.f1765u.mo291a(surface, 1);
            }
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            C1915r1.m39524d("ProcessingSurfaceTextur", "Failed to extract Listenable<Surface>.", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1826g2(int i, int i2, int i3, Handler handler, AbstractC13651p0 p0Var, AbstractC13645o0 o0Var, AbstractC13689w0 w0Var, String str) {
        super(new Size(i, i2), i3);
        AbstractC13635m1.AbstractC13636a e2Var = new AbstractC13635m1.AbstractC13636a() { // from class: androidx.camera.core.e2
            @Override // p390w.AbstractC13635m1.AbstractC13636a
            /* renamed from: a */
            public final void mo3152a(AbstractC13635m1 m1Var) {
                C1826g2.this.m39707t(m1Var);
            }
        };
        this.f1758n = e2Var;
        Size size = new Size(i, i2);
        this.f1760p = size;
        if (handler != null) {
            this.f1763s = handler;
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.f1763s = new Handler(myLooper);
            } else {
                throw new IllegalStateException("Creating a ProcessingSurface requires a non-null Handler, or be created  on a thread with a Looper.");
            }
        }
        ScheduledExecutorService f = C13905a.m2334f(this.f1763s);
        C1930u1 u1Var = new C1930u1(i, i2, i3, 2);
        this.f1761q = u1Var;
        u1Var.mo3154f(e2Var, f);
        this.f1762r = u1Var.getSurface();
        this.f1766v = u1Var.m39492m();
        this.f1765u = o0Var;
        o0Var.mo289c(size);
        this.f1764t = p0Var;
        this.f1767w = w0Var;
        this.f1768x = str;
        C14186f.m1427b(w0Var.m3018h(), new C1827a(), C13905a.m2339a());
        m3017i().mo1409a(new Runnable() { // from class: androidx.camera.core.f2
            @Override // java.lang.Runnable
            public final void run() {
                C1826g2.this.m39706u();
            }
        }, C13905a.m2339a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m39707t(AbstractC13635m1 m1Var) {
        synchronized (this.f1757m) {
            m39708s(m1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m39706u() {
        synchronized (this.f1757m) {
            if (!this.f1759o) {
                this.f1761q.close();
                this.f1762r.release();
                this.f1767w.m3023c();
                this.f1759o = true;
            }
        }
    }

    @Override // p390w.AbstractC13689w0
    /* renamed from: n */
    public AbstractFutureC7576b<Surface> mo3012n() {
        AbstractFutureC7576b<Surface> h;
        synchronized (this.f1757m) {
            h = C14186f.m1421h(this.f1762r);
        }
        return h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public AbstractC13615k m39709r() {
        AbstractC13615k kVar;
        synchronized (this.f1757m) {
            if (!this.f1759o) {
                kVar = this.f1766v;
            } else {
                throw new IllegalStateException("ProcessingSurface already released!");
            }
        }
        return kVar;
    }

    /* renamed from: s */
    void m39708s(AbstractC13635m1 m1Var) {
        ImageProxy imageProxy;
        if (!this.f1759o) {
            try {
                imageProxy = m1Var.mo3153g();
            } catch (IllegalStateException e) {
                C1915r1.m39524d("ProcessingSurfaceTextur", "Failed to acquire next image.", e);
                imageProxy = null;
            }
            if (imageProxy != null) {
                AbstractC1876k1 p0 = imageProxy.mo39604p0();
                if (p0 == null) {
                    imageProxy.close();
                    return;
                }
                Integer num = (Integer) p0.mo343c().m3089c(this.f1768x);
                if (num == null) {
                    imageProxy.close();
                } else if (this.f1764t.getId() != num.intValue()) {
                    C1915r1.m39517k("ProcessingSurfaceTextur", "ImageProxyBundle does not contain this id: " + num);
                    imageProxy.close();
                } else {
                    C13643n2 n2Var = new C13643n2(imageProxy, this.f1768x);
                    this.f1765u.mo290b(n2Var);
                    n2Var.m3125c();
                }
            }
        }
    }
}
