package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.C1885m0;
import androidx.concurrent.futures.C2114c;
import androidx.core.p018os.C2457s;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import p001a0.C1230a;
import p390w.AbstractC13635m1;
import p390w.C13671s2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC1903p0 implements AbstractC13635m1.AbstractC13636a {

    /* renamed from: t */
    private static final RectF f1916t = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* renamed from: a */
    private C1885m0.AbstractC1886a f1917a;

    /* renamed from: b */
    private volatile int f1918b;

    /* renamed from: c */
    private volatile int f1919c;

    /* renamed from: e */
    private volatile boolean f1921e;

    /* renamed from: f */
    private volatile boolean f1922f;

    /* renamed from: g */
    private Executor f1923g;

    /* renamed from: h */
    private C1873j2 f1924h;

    /* renamed from: i */
    private ImageWriter f1925i;

    /* renamed from: n */
    ByteBuffer f1930n;

    /* renamed from: o */
    ByteBuffer f1931o;

    /* renamed from: p */
    ByteBuffer f1932p;

    /* renamed from: q */
    ByteBuffer f1933q;

    /* renamed from: d */
    private volatile int f1920d = 1;

    /* renamed from: j */
    private Rect f1926j = new Rect();

    /* renamed from: k */
    private Rect f1927k = new Rect();

    /* renamed from: l */
    private Matrix f1928l = new Matrix();

    /* renamed from: m */
    private Matrix f1929m = new Matrix();

    /* renamed from: r */
    private final Object f1934r = new Object();

    /* renamed from: s */
    protected boolean f1935s = true;

    /* renamed from: h */
    private void m39558h(ImageProxy imageProxy) {
        if (this.f1920d == 1) {
            if (this.f1931o == null) {
                this.f1931o = ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight());
            }
            this.f1931o.position(0);
            if (this.f1932p == null) {
                this.f1932p = ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 4);
            }
            this.f1932p.position(0);
            if (this.f1933q == null) {
                this.f1933q = ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 4);
            }
            this.f1933q.position(0);
        } else if (this.f1920d == 2 && this.f1930n == null) {
            this.f1930n = ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight() * 4);
        }
    }

    /* renamed from: i */
    private static C1873j2 m39557i(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        int i6;
        if (i3 == 90 || i3 == 270) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i6 = i2;
        } else {
            i6 = i;
        }
        if (!z) {
            i = i2;
        }
        return new C1873j2(C1900o1.m39564a(i6, i, i4, i5));
    }

    /* renamed from: k */
    static Matrix m39555k(int i, int i2, int i3, int i4, int i5) {
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i, i2), f1916t, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i5);
            matrix.postConcat(m39554l(new RectF(0.0f, 0.0f, i3, i4)));
        }
        return matrix;
    }

    /* renamed from: l */
    private static Matrix m39554l(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f1916t, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    /* renamed from: m */
    static Rect m39553m(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m39552n(ImageProxy imageProxy, Matrix matrix, ImageProxy imageProxy2, Rect rect, C1885m0.AbstractC1886a aVar, C2114c.C2115a aVar2) {
        int i;
        if (this.f1935s) {
            C13671s2 c = imageProxy.mo39604p0().mo343c();
            long a = imageProxy.mo39604p0().mo345a();
            if (this.f1921e) {
                i = 0;
            } else {
                i = this.f1918b;
            }
            C1877k2 k2Var = new C1877k2(imageProxy2, AbstractC1904p1.m39540d(c, a, i, matrix));
            k2Var.mo39605O(rect);
            aVar.mo26382a(k2Var);
            aVar2.m38961c(null);
            return;
        }
        aVar2.m38958f(new C2457s("ImageAnalysis is detached"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m39551o(Executor executor, final ImageProxy imageProxy, final Matrix matrix, final ImageProxy imageProxy2, final Rect rect, final C1885m0.AbstractC1886a aVar, final C2114c.C2115a aVar2) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.o0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1903p0.this.m39552n(imageProxy, matrix, imageProxy2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    /* renamed from: q */
    private void m39550q(int i, int i2, int i3, int i4) {
        Matrix k = m39555k(i, i2, i3, i4, this.f1918b);
        this.f1927k = m39553m(this.f1926j, k);
        this.f1929m.setConcat(this.f1928l, k);
    }

    /* renamed from: r */
    private void m39549r(ImageProxy imageProxy, int i) {
        C1873j2 j2Var = this.f1924h;
        if (j2Var != null) {
            j2Var.m39607k();
            this.f1924h = m39557i(imageProxy.getWidth(), imageProxy.getHeight(), i, this.f1924h.mo3158a(), this.f1924h.mo3157b());
            if (this.f1920d == 1) {
                ImageWriter imageWriter = this.f1925i;
                if (imageWriter != null) {
                    C1230a.m41559a(imageWriter);
                }
                this.f1925i = C1230a.m41557c(this.f1924h.getSurface(), this.f1924h.mo3157b());
            }
        }
    }

    @Override // p390w.AbstractC13635m1.AbstractC13636a
    /* renamed from: a */
    public void mo3152a(AbstractC13635m1 m1Var) {
        try {
            ImageProxy d = mo39535d(m1Var);
            if (d != null) {
                mo39533p(d);
            }
        } catch (IllegalStateException e) {
            C1915r1.m39524d("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    /* renamed from: d */
    abstract ImageProxy mo39535d(AbstractC13635m1 m1Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p120gc.AbstractFutureC7576b<java.lang.Void> m39560e(final androidx.camera.core.ImageProxy r15) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.AbstractC1903p0.m39560e(androidx.camera.core.ImageProxy):gc.b");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m39559f() {
        this.f1935s = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo39534g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m39556j() {
        this.f1935s = false;
        mo39534g();
    }

    /* renamed from: p */
    abstract void mo39533p(ImageProxy imageProxy);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m39548s(Executor executor, C1885m0.AbstractC1886a aVar) {
        synchronized (this.f1934r) {
            if (aVar == null) {
                mo39534g();
            }
            this.f1917a = aVar;
            this.f1923g = executor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m39547t(boolean z) {
        this.f1922f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m39546u(int i) {
        this.f1920d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m39545v(boolean z) {
        this.f1921e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m39544w(C1873j2 j2Var) {
        synchronized (this.f1934r) {
            this.f1924h = j2Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m39543x(int i) {
        this.f1918b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m39542y(Matrix matrix) {
        synchronized (this.f1934r) {
            this.f1928l = matrix;
            this.f1929m = new Matrix(this.f1928l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m39541z(Rect rect) {
        synchronized (this.f1934r) {
            this.f1926j = rect;
            this.f1927k = new Rect(this.f1926j);
        }
    }
}
