package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C1790c2;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p120gc.AbstractFutureC7576b;
import p390w.AbstractC13615k;
import p390w.AbstractC13634m0;
import p390w.AbstractC13635m1;
import p390w.AbstractC13645o0;
import p390w.AbstractC13651p0;
import p431y.AbstractC14182c;
import p431y.C14186f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.c2 */
/* loaded from: classes.dex */
public class C1790c2 implements AbstractC13635m1 {

    /* renamed from: g */
    final C1930u1 f1656g;

    /* renamed from: h */
    final AbstractC13635m1 f1657h;

    /* renamed from: i */
    AbstractC13635m1.AbstractC13636a f1658i;

    /* renamed from: j */
    Executor f1659j;

    /* renamed from: k */
    C2114c.C2115a<Void> f1660k;

    /* renamed from: l */
    private AbstractFutureC7576b<Void> f1661l;

    /* renamed from: m */
    final Executor f1662m;

    /* renamed from: n */
    final AbstractC13645o0 f1663n;

    /* renamed from: a */
    final Object f1650a = new Object();

    /* renamed from: b */
    private AbstractC13635m1.AbstractC13636a f1651b = new C1791a();

    /* renamed from: c */
    private AbstractC13635m1.AbstractC13636a f1652c = new C1792b();

    /* renamed from: d */
    private AbstractC14182c<List<ImageProxy>> f1653d = new C1793c();

    /* renamed from: e */
    boolean f1654e = false;

    /* renamed from: f */
    boolean f1655f = false;

    /* renamed from: o */
    private String f1664o = new String();

    /* renamed from: p */
    C1881l2 f1665p = new C1881l2(Collections.emptyList(), this.f1664o);

    /* renamed from: q */
    private final List<Integer> f1666q = new ArrayList();

    /* renamed from: androidx.camera.core.c2$a */
    /* loaded from: classes.dex */
    class C1791a implements AbstractC13635m1.AbstractC13636a {
        C1791a() {
        }

        @Override // p390w.AbstractC13635m1.AbstractC13636a
        /* renamed from: a */
        public void mo3152a(AbstractC13635m1 m1Var) {
            C1790c2.this.m39818k(m1Var);
        }
    }

    /* renamed from: androidx.camera.core.c2$b */
    /* loaded from: classes.dex */
    class C1792b implements AbstractC13635m1.AbstractC13636a {
        C1792b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m39813c(AbstractC13635m1.AbstractC13636a aVar) {
            aVar.mo3152a(C1790c2.this);
        }

        @Override // p390w.AbstractC13635m1.AbstractC13636a
        /* renamed from: a */
        public void mo3152a(AbstractC13635m1 m1Var) {
            final AbstractC13635m1.AbstractC13636a aVar;
            Executor executor;
            synchronized (C1790c2.this.f1650a) {
                C1790c2 c2Var = C1790c2.this;
                aVar = c2Var.f1658i;
                executor = c2Var.f1659j;
                c2Var.f1665p.m39601e();
                C1790c2.this.m39815n();
            }
            if (aVar == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.camera.core.d2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1790c2.C1792b.this.m39813c(aVar);
                    }
                });
            } else {
                aVar.mo3152a(C1790c2.this);
            }
        }
    }

    /* renamed from: androidx.camera.core.c2$c */
    /* loaded from: classes.dex */
    class C1793c implements AbstractC14182c<List<ImageProxy>> {
        C1793c() {
        }

        /* renamed from: b */
        public void mo1412a(List<ImageProxy> list) {
            synchronized (C1790c2.this.f1650a) {
                C1790c2 c2Var = C1790c2.this;
                if (!c2Var.f1654e) {
                    c2Var.f1655f = true;
                    c2Var.f1663n.mo290b(c2Var.f1665p);
                    synchronized (C1790c2.this.f1650a) {
                        C1790c2 c2Var2 = C1790c2.this;
                        c2Var2.f1655f = false;
                        if (c2Var2.f1654e) {
                            c2Var2.f1656g.close();
                            C1790c2.this.f1665p.m39602d();
                            C1790c2.this.f1657h.close();
                            C2114c.C2115a<Void> aVar = C1790c2.this.f1660k;
                            if (aVar != null) {
                                aVar.m38961c(null);
                            }
                        }
                    }
                }
            }
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
        }
    }

    C1790c2(C1794d dVar) {
        if (dVar.f1670a.mo3157b() >= dVar.f1671b.mo3159c().size()) {
            C1930u1 u1Var = dVar.f1670a;
            this.f1656g = u1Var;
            int width = u1Var.getWidth();
            int height = u1Var.getHeight();
            int i = dVar.f1673d;
            if (i == 256) {
                width = ((int) (width * height * 1.5f)) + 64000;
                height = 1;
            }
            C1797d dVar2 = new C1797d(ImageReader.newInstance(width, height, i, u1Var.mo3157b()));
            this.f1657h = dVar2;
            this.f1662m = dVar.f1674e;
            AbstractC13645o0 o0Var = dVar.f1672c;
            this.f1663n = o0Var;
            o0Var.mo291a(dVar2.getSurface(), dVar.f1673d);
            o0Var.mo289c(new Size(u1Var.getWidth(), u1Var.getHeight()));
            m39816m(dVar.f1671b);
            return;
        }
        throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Object m39817l(C2114c.C2115a aVar) {
        synchronized (this.f1650a) {
            this.f1660k = aVar;
        }
        return "ProcessingImageReader-close";
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: a */
    public int mo3158a() {
        int a;
        synchronized (this.f1650a) {
            a = this.f1657h.mo3158a();
        }
        return a;
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: b */
    public int mo3157b() {
        int b;
        synchronized (this.f1650a) {
            b = this.f1656g.mo3157b();
        }
        return b;
    }

    @Override // p390w.AbstractC13635m1
    public void close() {
        synchronized (this.f1650a) {
            if (!this.f1654e) {
                this.f1657h.mo3155e();
                if (!this.f1655f) {
                    this.f1656g.close();
                    this.f1665p.m39602d();
                    this.f1657h.close();
                    C2114c.C2115a<Void> aVar = this.f1660k;
                    if (aVar != null) {
                        aVar.m38961c(null);
                    }
                }
                this.f1654e = true;
            }
        }
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: d */
    public ImageProxy mo3156d() {
        ImageProxy d;
        synchronized (this.f1650a) {
            d = this.f1657h.mo3156d();
        }
        return d;
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: e */
    public void mo3155e() {
        synchronized (this.f1650a) {
            this.f1658i = null;
            this.f1659j = null;
            this.f1656g.mo3155e();
            this.f1657h.mo3155e();
            if (!this.f1655f) {
                this.f1665p.m39602d();
            }
        }
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: f */
    public void mo3154f(AbstractC13635m1.AbstractC13636a aVar, Executor executor) {
        synchronized (this.f1650a) {
            this.f1658i = (AbstractC13635m1.AbstractC13636a) C2517g.m37588g(aVar);
            this.f1659j = (Executor) C2517g.m37588g(executor);
            this.f1656g.mo3154f(this.f1651b, executor);
            this.f1657h.mo3154f(this.f1652c, executor);
        }
    }

    @Override // p390w.AbstractC13635m1
    /* renamed from: g */
    public ImageProxy mo3153g() {
        ImageProxy g;
        synchronized (this.f1650a) {
            g = this.f1657h.mo3153g();
        }
        return g;
    }

    @Override // p390w.AbstractC13635m1
    public int getHeight() {
        int height;
        synchronized (this.f1650a) {
            height = this.f1656g.getHeight();
        }
        return height;
    }

    @Override // p390w.AbstractC13635m1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f1650a) {
            surface = this.f1656g.getSurface();
        }
        return surface;
    }

    @Override // p390w.AbstractC13635m1
    public int getWidth() {
        int width;
        synchronized (this.f1650a) {
            width = this.f1656g.getWidth();
        }
        return width;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public AbstractC13615k m39821h() {
        AbstractC13615k m;
        synchronized (this.f1650a) {
            m = this.f1656g.m39492m();
        }
        return m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public AbstractFutureC7576b<Void> m39820i() {
        AbstractFutureC7576b<Void> bVar;
        synchronized (this.f1650a) {
            if (!this.f1654e || this.f1655f) {
                if (this.f1661l == null) {
                    this.f1661l = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.core.b2
                        @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                        /* renamed from: a */
                        public final Object mo1403a(C2114c.C2115a aVar) {
                            Object l;
                            l = C1790c2.this.m39817l(aVar);
                            return l;
                        }
                    });
                }
                bVar = C14186f.m1419j(this.f1661l);
            } else {
                bVar = C14186f.m1421h(null);
            }
        }
        return bVar;
    }

    /* renamed from: j */
    public String m39819j() {
        return this.f1664o;
    }

    /* renamed from: k */
    void m39818k(AbstractC13635m1 m1Var) {
        synchronized (this.f1650a) {
            if (!this.f1654e) {
                try {
                    ImageProxy g = m1Var.mo3153g();
                    if (g != null) {
                        Integer num = (Integer) g.mo39604p0().mo343c().m3089c(this.f1664o);
                        if (!this.f1666q.contains(num)) {
                            C1915r1.m39517k("ProcessingImageReader", "ImageProxyBundle does not contain this id: " + num);
                            g.close();
                        } else {
                            this.f1665p.m39603c(g);
                        }
                    }
                } catch (IllegalStateException e) {
                    C1915r1.m39524d("ProcessingImageReader", "Failed to acquire latest image.", e);
                }
            }
        }
    }

    /* renamed from: m */
    public void m39816m(AbstractC13634m0 m0Var) {
        synchronized (this.f1650a) {
            if (m0Var.mo3159c() != null) {
                if (this.f1656g.mo3157b() >= m0Var.mo3159c().size()) {
                    this.f1666q.clear();
                    for (AbstractC13651p0 p0Var : m0Var.mo3159c()) {
                        if (p0Var != null) {
                            this.f1666q.add(Integer.valueOf(p0Var.getId()));
                        }
                    }
                } else {
                    throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                }
            }
            String num = Integer.toString(m0Var.hashCode());
            this.f1664o = num;
            this.f1665p = new C1881l2(this.f1666q, num);
            m39815n();
        }
    }

    /* renamed from: n */
    void m39815n() {
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.f1666q) {
            arrayList.add(this.f1665p.mo3126b(num.intValue()));
        }
        C14186f.m1427b(C14186f.m1426c(arrayList), this.f1653d, this.f1662m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.c2$d */
    /* loaded from: classes.dex */
    public static final class C1794d {

        /* renamed from: a */
        protected final C1930u1 f1670a;

        /* renamed from: b */
        protected final AbstractC13634m0 f1671b;

        /* renamed from: c */
        protected final AbstractC13645o0 f1672c;

        /* renamed from: d */
        protected int f1673d;

        /* renamed from: e */
        protected Executor f1674e;

        C1794d(C1930u1 u1Var, AbstractC13634m0 m0Var, AbstractC13645o0 o0Var) {
            this.f1674e = Executors.newSingleThreadExecutor();
            this.f1670a = u1Var;
            this.f1671b = m0Var;
            this.f1672c = o0Var;
            this.f1673d = u1Var.mo3158a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public C1790c2 m39811a() {
            return new C1790c2(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public C1794d m39810b(int i) {
            this.f1673d = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public C1794d m39809c(Executor executor) {
            this.f1674e = executor;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1794d(int i, int i2, int i3, int i4, AbstractC13634m0 m0Var, AbstractC13645o0 o0Var) {
            this(new C1930u1(i, i2, i3, i4), m0Var, o0Var);
        }
    }
}
