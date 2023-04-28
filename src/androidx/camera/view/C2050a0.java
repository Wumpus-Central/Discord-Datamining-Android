package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.C1915r1;
import androidx.camera.core.C1936v2;
import androidx.camera.view.AbstractC2073m;
import androidx.concurrent.futures.C2114c;
import androidx.core.content.C2337a;
import androidx.core.util.AbstractC2511b;
import androidx.core.util.C2517g;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p120gc.AbstractFutureC7576b;
import p410x.C13905a;
import p431y.AbstractC14182c;
import p431y.C14186f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.view.a0 */
/* loaded from: classes.dex */
public final class C2050a0 extends AbstractC2073m {

    /* renamed from: e */
    TextureView f2288e;

    /* renamed from: f */
    SurfaceTexture f2289f;

    /* renamed from: g */
    AbstractFutureC7576b<C1936v2.AbstractC1942f> f2290g;

    /* renamed from: h */
    C1936v2 f2291h;

    /* renamed from: j */
    SurfaceTexture f2293j;

    /* renamed from: l */
    AbstractC2073m.AbstractC2074a f2295l;

    /* renamed from: i */
    boolean f2292i = false;

    /* renamed from: k */
    AtomicReference<C2114c.C2115a<Void>> f2294k = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.view.a0$a */
    /* loaded from: classes.dex */
    public class TextureView$SurfaceTextureListenerC2051a implements TextureView.SurfaceTextureListener {

        /* renamed from: androidx.camera.view.a0$a$a */
        /* loaded from: classes.dex */
        class C0025a implements AbstractC14182c<C1936v2.AbstractC1942f> {

            /* renamed from: a */
            final /* synthetic */ SurfaceTexture f2297a;

            C0025a(SurfaceTexture surfaceTexture) {
                this.f2297a = surfaceTexture;
            }

            /* renamed from: b */
            public void mo1412a(C1936v2.AbstractC1942f fVar) {
                boolean z;
                if (fVar.mo39453a() != 3) {
                    z = true;
                } else {
                    z = false;
                }
                C2517g.m37585j(z, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                C1915r1.m39527a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f2297a.release();
                C2050a0 a0Var = C2050a0.this;
                if (a0Var.f2293j != null) {
                    a0Var.f2293j = null;
                }
            }

            @Override // p431y.AbstractC14182c
            public void onFailure(Throwable th2) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
            }
        }

        TextureView$SurfaceTextureListenerC2051a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C1915r1.m39527a("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
            C2050a0 a0Var = C2050a0.this;
            a0Var.f2289f = surfaceTexture;
            if (a0Var.f2290g != null) {
                C2517g.m37588g(a0Var.f2291h);
                C1915r1.m39527a("TextureViewImpl", "Surface invalidated " + C2050a0.this.f2291h);
                C2050a0.this.f2291h.m39471k().m3023c();
                return;
            }
            a0Var.m39174u();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C2050a0 a0Var = C2050a0.this;
            a0Var.f2289f = null;
            AbstractFutureC7576b<C1936v2.AbstractC1942f> bVar = a0Var.f2290g;
            if (bVar != null) {
                C14186f.m1427b(bVar, new C0025a(surfaceTexture), C2337a.m38130h(C2050a0.this.f2288e.getContext()));
                C2050a0.this.f2293j = surfaceTexture;
                return false;
            }
            C1915r1.m39527a("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C1915r1.m39527a("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C2114c.C2115a<Void> andSet = C2050a0.this.f2294k.getAndSet(null);
            if (andSet != null) {
                andSet.m38961c(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2050a0(FrameLayout frameLayout, C2059f fVar) {
        super(frameLayout, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m39180o(C1936v2 v2Var) {
        C1936v2 v2Var2 = this.f2291h;
        if (v2Var2 != null && v2Var2 == v2Var) {
            this.f2291h = null;
            this.f2290g = null;
        }
        m39176s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m39179p(Surface surface, final C2114c.C2115a aVar) {
        C1915r1.m39527a("TextureViewImpl", "Surface set on Preview.");
        C1936v2 v2Var = this.f2291h;
        Executor a = C13905a.m2339a();
        Objects.requireNonNull(aVar);
        v2Var.m39460v(surface, a, new AbstractC2511b() { // from class: androidx.camera.view.z
            @Override // androidx.core.util.AbstractC2511b
            public final void accept(Object obj) {
                C2114c.C2115a.this.m38961c((C1936v2.AbstractC1942f) obj);
            }
        });
        return "provideSurface[request=" + this.f2291h + " surface=" + surface + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m39178q(Surface surface, AbstractFutureC7576b bVar, C1936v2 v2Var) {
        C1915r1.m39527a("TextureViewImpl", "Safe to release surface.");
        m39176s();
        surface.release();
        if (this.f2290g == bVar) {
            this.f2290g = null;
        }
        if (this.f2291h == v2Var) {
            this.f2291h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m39177r(C2114c.C2115a aVar) {
        this.f2294k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    /* renamed from: s */
    private void m39176s() {
        AbstractC2073m.AbstractC2074a aVar = this.f2295l;
        if (aVar != null) {
            aVar.mo39117a();
            this.f2295l = null;
        }
    }

    /* renamed from: t */
    private void m39175t() {
        if (this.f2292i && this.f2293j != null) {
            SurfaceTexture surfaceTexture = this.f2288e.getSurfaceTexture();
            SurfaceTexture surfaceTexture2 = this.f2293j;
            if (surfaceTexture != surfaceTexture2) {
                this.f2288e.setSurfaceTexture(surfaceTexture2);
                this.f2293j = null;
                this.f2292i = false;
            }
        }
    }

    @Override // androidx.camera.view.AbstractC2073m
    /* renamed from: b */
    View mo39113b() {
        return this.f2288e;
    }

    @Override // androidx.camera.view.AbstractC2073m
    /* renamed from: c */
    Bitmap mo39112c() {
        TextureView textureView = this.f2288e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f2288e.getBitmap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC2073m
    /* renamed from: d */
    public void mo39111d() {
        m39175t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC2073m
    /* renamed from: e */
    public void mo39110e() {
        this.f2292i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC2073m
    /* renamed from: g */
    public void mo39109g(final C1936v2 v2Var, AbstractC2073m.AbstractC2074a aVar) {
        this.f2364a = v2Var.m39470l();
        this.f2295l = aVar;
        m39181n();
        C1936v2 v2Var2 = this.f2291h;
        if (v2Var2 != null) {
            v2Var2.m39457y();
        }
        this.f2291h = v2Var;
        v2Var.m39473i(C2337a.m38130h(this.f2288e.getContext()), new Runnable() { // from class: androidx.camera.view.v
            @Override // java.lang.Runnable
            public final void run() {
                C2050a0.this.m39180o(v2Var);
            }
        });
        m39174u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC2073m
    /* renamed from: i */
    public AbstractFutureC7576b<Void> mo39108i() {
        return C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.view.y
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object r;
                r = C2050a0.this.m39177r(aVar);
                return r;
            }
        });
    }

    /* renamed from: n */
    public void m39181n() {
        C2517g.m37588g(this.f2365b);
        C2517g.m37588g(this.f2364a);
        TextureView textureView = new TextureView(this.f2365b.getContext());
        this.f2288e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f2364a.getWidth(), this.f2364a.getHeight()));
        this.f2288e.setSurfaceTextureListener(new TextureView$SurfaceTextureListenerC2051a());
        this.f2365b.removeAllViews();
        this.f2365b.addView(this.f2288e);
    }

    /* renamed from: u */
    void m39174u() {
        SurfaceTexture surfaceTexture;
        Size size = this.f2364a;
        if (size != null && (surfaceTexture = this.f2289f) != null && this.f2291h != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f2364a.getHeight());
            final Surface surface = new Surface(this.f2289f);
            final C1936v2 v2Var = this.f2291h;
            final AbstractFutureC7576b<C1936v2.AbstractC1942f> a = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.view.w
                @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                /* renamed from: a */
                public final Object mo1403a(C2114c.C2115a aVar) {
                    Object p;
                    p = C2050a0.this.m39179p(surface, aVar);
                    return p;
                }
            });
            this.f2290g = a;
            a.mo1409a(new Runnable() { // from class: androidx.camera.view.x
                @Override // java.lang.Runnable
                public final void run() {
                    C2050a0.this.m39178q(surface, a, v2Var);
                }
            }, C2337a.m38130h(this.f2288e.getContext()));
            m39119f();
        }
    }
}
