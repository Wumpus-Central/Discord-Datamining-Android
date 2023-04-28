package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.C1915r1;
import androidx.camera.core.C1936v2;
import androidx.camera.view.AbstractC2073m;
import androidx.camera.view.C2081t;
import androidx.core.content.C2337a;
import androidx.core.util.AbstractC2511b;
import androidx.core.util.C2517g;
import p120gc.AbstractFutureC7576b;
import p431y.C14186f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.view.t */
/* loaded from: classes.dex */
public final class C2081t extends AbstractC2073m {

    /* renamed from: e */
    SurfaceView f2377e;

    /* renamed from: f */
    final SurfaceHolder$CallbackC2083b f2378f = new SurfaceHolder$CallbackC2083b();

    /* renamed from: g */
    private AbstractC2073m.AbstractC2074a f2379g;

    /* renamed from: androidx.camera.view.t$a */
    /* loaded from: classes.dex */
    private static class C2082a {
        /* renamed from: a */
        static void m39101a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.view.t$b */
    /* loaded from: classes.dex */
    public class SurfaceHolder$CallbackC2083b implements SurfaceHolder.Callback {

        /* renamed from: k */
        private Size f2380k;

        /* renamed from: l */
        private C1936v2 f2381l;

        /* renamed from: m */
        private Size f2382m;

        /* renamed from: n */
        private boolean f2383n = false;

        SurfaceHolder$CallbackC2083b() {
        }

        /* renamed from: b */
        private boolean m39099b() {
            Size size;
            if (this.f2383n || this.f2381l == null || (size = this.f2380k) == null || !size.equals(this.f2382m)) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private void m39098c() {
            if (this.f2381l != null) {
                C1915r1.m39527a("SurfaceViewImpl", "Request canceled: " + this.f2381l);
                this.f2381l.m39457y();
            }
        }

        /* renamed from: d */
        private void m39097d() {
            if (this.f2381l != null) {
                C1915r1.m39527a("SurfaceViewImpl", "Surface invalidated " + this.f2381l);
                this.f2381l.m39471k().m3023c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m39096e(C1936v2.AbstractC1942f fVar) {
            C1915r1.m39527a("SurfaceViewImpl", "Safe to release surface.");
            C2081t.this.m39102o();
        }

        /* renamed from: g */
        private boolean m39094g() {
            Surface surface = C2081t.this.f2377e.getHolder().getSurface();
            if (!m39099b()) {
                return false;
            }
            C1915r1.m39527a("SurfaceViewImpl", "Surface set on Preview.");
            this.f2381l.m39460v(surface, C2337a.m38130h(C2081t.this.f2377e.getContext()), new AbstractC2511b() { // from class: androidx.camera.view.u
                @Override // androidx.core.util.AbstractC2511b
                public final void accept(Object obj) {
                    C2081t.SurfaceHolder$CallbackC2083b.this.m39096e((C1936v2.AbstractC1942f) obj);
                }
            });
            this.f2383n = true;
            C2081t.this.m39119f();
            return true;
        }

        /* renamed from: f */
        void m39095f(C1936v2 v2Var) {
            m39098c();
            this.f2381l = v2Var;
            Size l = v2Var.m39470l();
            this.f2380k = l;
            this.f2383n = false;
            if (!m39094g()) {
                C1915r1.m39527a("SurfaceViewImpl", "Wait for new Surface creation.");
                C2081t.this.f2377e.getHolder().setFixedSize(l.getWidth(), l.getHeight());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C1915r1.m39527a("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
            this.f2382m = new Size(i2, i3);
            m39094g();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C1915r1.m39527a("SurfaceViewImpl", "Surface created.");
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C1915r1.m39527a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f2383n) {
                m39097d();
            } else {
                m39098c();
            }
            this.f2383n = false;
            this.f2381l = null;
            this.f2382m = null;
            this.f2380k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2081t(FrameLayout frameLayout, C2059f fVar) {
        super(frameLayout, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m39104m(int i) {
        if (i == 0) {
            C1915r1.m39527a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
            return;
        }
        C1915r1.m39525c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m39103n(C1936v2 v2Var) {
        this.f2378f.m39095f(v2Var);
    }

    @Override // androidx.camera.view.AbstractC2073m
    /* renamed from: b */
    View mo39113b() {
        return this.f2377e;
    }

    @Override // androidx.camera.view.AbstractC2073m
    /* renamed from: c */
    Bitmap mo39112c() {
        SurfaceView surfaceView = this.f2377e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f2377e.getHolder().getSurface().isValid()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.f2377e.getWidth(), this.f2377e.getHeight(), Bitmap.Config.ARGB_8888);
        C2082a.m39101a(this.f2377e, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.r
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                C2081t.m39104m(i);
            }
        }, this.f2377e.getHandler());
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC2073m
    /* renamed from: d */
    public void mo39111d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC2073m
    /* renamed from: e */
    public void mo39110e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC2073m
    /* renamed from: g */
    public void mo39109g(final C1936v2 v2Var, AbstractC2073m.AbstractC2074a aVar) {
        this.f2364a = v2Var.m39470l();
        this.f2379g = aVar;
        m39105l();
        v2Var.m39473i(C2337a.m38130h(this.f2377e.getContext()), new Runnable() { // from class: androidx.camera.view.p
            @Override // java.lang.Runnable
            public final void run() {
                C2081t.this.m39102o();
            }
        });
        this.f2377e.post(new Runnable() { // from class: androidx.camera.view.q
            @Override // java.lang.Runnable
            public final void run() {
                C2081t.this.m39103n(v2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.AbstractC2073m
    /* renamed from: i */
    public AbstractFutureC7576b<Void> mo39108i() {
        return C14186f.m1421h(null);
    }

    /* renamed from: l */
    void m39105l() {
        C2517g.m37588g(this.f2365b);
        C2517g.m37588g(this.f2364a);
        SurfaceView surfaceView = new SurfaceView(this.f2365b.getContext());
        this.f2377e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f2364a.getWidth(), this.f2364a.getHeight()));
        this.f2365b.removeAllViews();
        this.f2365b.addView(this.f2377e);
        this.f2377e.getHolder().addCallback(this.f2378f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m39102o() {
        AbstractC2073m.AbstractC2074a aVar = this.f2379g;
        if (aVar != null) {
            aVar.mo39117a();
            this.f2379g = null;
        }
    }
}
