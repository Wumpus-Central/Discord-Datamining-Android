package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.AbstractC1833i0;
import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p390w.AbstractC13615k;
import p390w.AbstractC13635m1;
import p390w.AbstractC13672t;
import p451z.C14496b;

/* renamed from: androidx.camera.core.u1 */
/* loaded from: classes.dex */
class C1930u1 implements AbstractC13635m1, AbstractC1833i0.AbstractC1834a {

    /* renamed from: a */
    private final Object f1974a;

    /* renamed from: b */
    private AbstractC13615k f1975b;

    /* renamed from: c */
    private AbstractC13635m1.AbstractC13636a f1976c;

    /* renamed from: d */
    private boolean f1977d;

    /* renamed from: e */
    private final AbstractC13635m1 f1978e;

    /* renamed from: f */
    AbstractC13635m1.AbstractC13636a f1979f;

    /* renamed from: g */
    private Executor f1980g;

    /* renamed from: h */
    private final LongSparseArray<AbstractC1876k1> f1981h;

    /* renamed from: i */
    private final LongSparseArray<ImageProxy> f1982i;

    /* renamed from: j */
    private int f1983j;

    /* renamed from: k */
    private final List<ImageProxy> f1984k;

    /* renamed from: l */
    private final List<ImageProxy> f1985l;

    /* renamed from: androidx.camera.core.u1$a */
    /* loaded from: classes.dex */
    class C1931a extends AbstractC13615k {
        C1931a() {
        }

        @Override // p390w.AbstractC13615k
        /* renamed from: b */
        public void mo3171b(AbstractC13672t tVar) {
            super.mo3171b(tVar);
            C1930u1.this.m39486s(tVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1930u1(int i, int i2, int i3, int i4) {
        this(m39495j(i, i2, i3, i4));
    }

    /* renamed from: j */
    private static AbstractC13635m1 m39495j(int i, int i2, int i3, int i4) {
        return new C1797d(ImageReader.newInstance(i, i2, i3, i4));
    }

    /* renamed from: k */
    private void m39494k(ImageProxy imageProxy) {
        synchronized (this.f1974a) {
            int indexOf = this.f1984k.indexOf(imageProxy);
            if (indexOf >= 0) {
                this.f1984k.remove(indexOf);
                int i = this.f1983j;
                if (indexOf <= i) {
                    this.f1983j = i - 1;
                }
            }
            this.f1985l.remove(imageProxy);
        }
    }

    /* renamed from: l */
    private void m39493l(C1877k2 k2Var) {
        final AbstractC13635m1.AbstractC13636a aVar;
        Executor executor;
        synchronized (this.f1974a) {
            if (this.f1984k.size() < mo3157b()) {
                k2Var.m39702b(this);
                this.f1984k.add(k2Var);
                aVar = this.f1979f;
                executor = this.f1980g;
            } else {
                C1915r1.m39527a("TAG", "Maximum image number reached.");
                k2Var.close();
                aVar = null;
                executor = null;
            }
        }
        if (aVar == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.camera.core.t1
                @Override // java.lang.Runnable
                public final void run() {
                    C1930u1.this.m39490o(aVar);
                }
            });
        } else {
            aVar.mo3152a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m39490o(AbstractC13635m1.AbstractC13636a aVar) {
        aVar.mo3152a(this);
    }

    /* renamed from: q */
    private void m39488q() {
        synchronized (this.f1974a) {
            for (int size = this.f1981h.size() - 1; size >= 0; size--) {
                AbstractC1876k1 valueAt = this.f1981h.valueAt(size);
                long a = valueAt.mo345a();
                ImageProxy imageProxy = this.f1982i.get(a);
                if (imageProxy != null) {
                    this.f1982i.remove(a);
                    this.f1981h.removeAt(size);
                    m39493l(new C1877k2(imageProxy, valueAt));
                }
            }
            m39487r();
        }
    }

    /* renamed from: r */
    private void m39487r() {
        synchronized (this.f1974a) {
            if (!(this.f1982i.size() == 0 || this.f1981h.size() == 0)) {
                boolean z = false;
                Long valueOf = Long.valueOf(this.f1982i.keyAt(0));
                Long valueOf2 = Long.valueOf(this.f1981h.keyAt(0));
                if (!valueOf2.equals(valueOf)) {
                    z = true;
                }
                C2517g.m37594a(z);
                if (valueOf2.longValue() > valueOf.longValue()) {
                    for (int size = this.f1982i.size() - 1; size >= 0; size--) {
                        if (this.f1982i.keyAt(size) < valueOf2.longValue()) {
                            this.f1982i.valueAt(size).close();
                            this.f1982i.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.f1981h.size() - 1; size2 >= 0; size2--) {
                        if (this.f1981h.keyAt(size2) < valueOf.longValue()) {
                            this.f1981h.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: a */
    public int mo3158a() {
        int a;
        synchronized (this.f1974a) {
            a = this.f1978e.mo3158a();
        }
        return a;
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: b */
    public int mo3157b() {
        int b;
        synchronized (this.f1974a) {
            b = this.f1978e.mo3157b();
        }
        return b;
    }

    @Override // androidx.camera.core.AbstractC1833i0.AbstractC1834a
    /* renamed from: c */
    public void mo39498c(ImageProxy imageProxy) {
        synchronized (this.f1974a) {
            m39494k(imageProxy);
        }
    }

    @Override // p390w.AbstractC13635m1
    public void close() {
        synchronized (this.f1974a) {
            if (!this.f1977d) {
                for (ImageProxy imageProxy : new ArrayList(this.f1984k)) {
                    imageProxy.close();
                }
                this.f1984k.clear();
                this.f1978e.close();
                this.f1977d = true;
            }
        }
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: d */
    public ImageProxy mo3156d() {
        synchronized (this.f1974a) {
            if (this.f1984k.isEmpty()) {
                return null;
            }
            if (this.f1983j < this.f1984k.size()) {
                ArrayList<ImageProxy> arrayList = new ArrayList();
                for (int i = 0; i < this.f1984k.size() - 1; i++) {
                    if (!this.f1985l.contains(this.f1984k.get(i))) {
                        arrayList.add(this.f1984k.get(i));
                    }
                }
                for (ImageProxy imageProxy : arrayList) {
                    imageProxy.close();
                }
                int size = this.f1984k.size() - 1;
                List<ImageProxy> list = this.f1984k;
                this.f1983j = size + 1;
                ImageProxy imageProxy2 = list.get(size);
                this.f1985l.add(imageProxy2);
                return imageProxy2;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: e */
    public void mo3155e() {
        synchronized (this.f1974a) {
            this.f1979f = null;
            this.f1980g = null;
        }
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: f */
    public void mo3154f(AbstractC13635m1.AbstractC13636a aVar, Executor executor) {
        synchronized (this.f1974a) {
            this.f1979f = (AbstractC13635m1.AbstractC13636a) C2517g.m37588g(aVar);
            this.f1980g = (Executor) C2517g.m37588g(executor);
            this.f1978e.mo3154f(this.f1976c, executor);
        }
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: g */
    public ImageProxy mo3153g() {
        synchronized (this.f1974a) {
            if (this.f1984k.isEmpty()) {
                return null;
            }
            if (this.f1983j < this.f1984k.size()) {
                List<ImageProxy> list = this.f1984k;
                int i = this.f1983j;
                this.f1983j = i + 1;
                ImageProxy imageProxy = list.get(i);
                this.f1985l.add(imageProxy);
                return imageProxy;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    @Override // p390w.AbstractC13635m1
    public int getHeight() {
        int height;
        synchronized (this.f1974a) {
            height = this.f1978e.getHeight();
        }
        return height;
    }

    @Override // p390w.AbstractC13635m1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f1974a) {
            surface = this.f1978e.getSurface();
        }
        return surface;
    }

    @Override // p390w.AbstractC13635m1
    public int getWidth() {
        int width;
        synchronized (this.f1974a) {
            width = this.f1978e.getWidth();
        }
        return width;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public AbstractC13615k m39492m() {
        return this.f1975b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m39489p(AbstractC13635m1 m1Var) {
        ImageProxy imageProxy;
        synchronized (this.f1974a) {
            if (!this.f1977d) {
                int i = 0;
                do {
                    try {
                        imageProxy = m1Var.mo3153g();
                        if (imageProxy != null) {
                            i++;
                            this.f1982i.put(imageProxy.mo39604p0().mo345a(), imageProxy);
                            m39488q();
                        }
                    } catch (IllegalStateException e) {
                        C1915r1.m39526b("MetadataImageReader", "Failed to acquire next image.", e);
                        imageProxy = null;
                    }
                    if (imageProxy == null) {
                        break;
                    }
                } while (i < m1Var.mo3157b());
            }
        }
    }

    /* renamed from: s */
    void m39486s(AbstractC13672t tVar) {
        synchronized (this.f1974a) {
            if (!this.f1977d) {
                this.f1981h.put(tVar.mo3087a(), new C14496b(tVar));
                m39488q();
            }
        }
    }

    C1930u1(AbstractC13635m1 m1Var) {
        this.f1974a = new Object();
        this.f1975b = new C1931a();
        this.f1976c = new AbstractC13635m1.AbstractC13636a() { // from class: androidx.camera.core.s1
            @Override // p390w.AbstractC13635m1.AbstractC13636a
            /* renamed from: a */
            public final void mo3152a(AbstractC13635m1 m1Var2) {
                C1930u1.this.m39489p(m1Var2);
            }
        };
        this.f1977d = false;
        this.f1981h = new LongSparseArray<>();
        this.f1982i = new LongSparseArray<>();
        this.f1985l = new ArrayList();
        this.f1978e = m1Var;
        this.f1983j = 0;
        this.f1984k = new ArrayList(mo3157b());
    }
}
