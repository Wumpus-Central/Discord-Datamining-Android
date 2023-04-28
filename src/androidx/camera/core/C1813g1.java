package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.arch.core.util.Function;
import androidx.camera.core.AbstractC1833i0;
import androidx.camera.core.AbstractC1948w2;
import androidx.camera.core.C1813g1;
import androidx.camera.core.impl.utils.C1838b;
import androidx.camera.core.impl.utils.C1851k;
import androidx.camera.core.impl.utils.C1869r;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p020b0.AbstractC3340e;
import p033c0.C3749a;
import p053d0.C6389a;
import p120gc.AbstractFutureC7576b;
import p163j$.util.Spliterator;
import p390w.AbstractC13589e0;
import p390w.AbstractC13597g0;
import p390w.AbstractC13607i1;
import p390w.AbstractC13615k;
import p390w.AbstractC13617k1;
import p390w.AbstractC13634m0;
import p390w.AbstractC13635m1;
import p390w.AbstractC13645o0;
import p390w.AbstractC13651p0;
import p390w.AbstractC13662r0;
import p390w.AbstractC13689w0;
import p390w.AbstractC13692w1;
import p390w.AbstractC13697x2;
import p390w.AbstractC13702y2;
import p390w.C13582c2;
import p390w.C13594f1;
import p390w.C13619k2;
import p390w.C13639n0;
import p390w.C13656q0;
import p390w.C13696x1;
import p410x.C13905a;
import p431y.AbstractC14182c;
import p431y.C14186f;
import p451z.AbstractC14504g;
import p451z.AbstractC14506i;
import p451z.AbstractC14510m;
import p451z.C14512o;

/* renamed from: androidx.camera.core.g1 */
/* loaded from: classes.dex */
public final class C1813g1 extends AbstractC1948w2 {

    /* renamed from: G */
    public static final C1819f f35327G = new C1819f();

    /* renamed from: A */
    C1790c2 f35328A;

    /* renamed from: B */
    private AbstractC13615k f35329B;

    /* renamed from: C */
    private AbstractC13689w0 f35330C;

    /* renamed from: D */
    private C1821h f35331D;

    /* renamed from: E */
    final Executor f35332E;

    /* renamed from: m */
    final Executor f1716m;

    /* renamed from: n */
    private final int f1717n;

    /* renamed from: p */
    private final int f1719p;

    /* renamed from: s */
    private ExecutorService f1722s;

    /* renamed from: t */
    private C13639n0 f1723t;

    /* renamed from: u */
    private AbstractC13634m0 f1724u;

    /* renamed from: v */
    private int f1725v;

    /* renamed from: w */
    private AbstractC13645o0 f1726w;

    /* renamed from: y */
    C13619k2.C13621b f1728y;

    /* renamed from: z */
    C1873j2 f1729z;

    /* renamed from: l */
    private final AbstractC13635m1.AbstractC13636a f1715l = new AbstractC13635m1.AbstractC13636a() { // from class: androidx.camera.core.z0
        @Override // p390w.AbstractC13635m1.AbstractC13636a
        /* renamed from: a */
        public final void mo3152a(AbstractC13635m1 m1Var) {
            C1813g1.m39756k0(m1Var);
        }
    };

    /* renamed from: o */
    private final AtomicReference<Integer> f1718o = new AtomicReference<>(null);

    /* renamed from: q */
    private int f1720q = -1;

    /* renamed from: r */
    private Rational f1721r = null;

    /* renamed from: x */
    private boolean f1727x = false;

    /* renamed from: F */
    private Matrix f35333F = new Matrix();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.g1$a */
    /* loaded from: classes.dex */
    public class C1814a extends AbstractC13615k {
        C1814a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.g1$b */
    /* loaded from: classes.dex */
    public class C1815b implements C1821h.AbstractC1824c {

        /* renamed from: a */
        final /* synthetic */ C14512o f1731a;

        C1815b(C14512o oVar) {
            this.f1731a = oVar;
        }

        @Override // androidx.camera.core.C1813g1.C1821h.AbstractC1824c
        /* renamed from: a */
        public void mo39712a(C1820g gVar) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f1731a.m286f(gVar.f1740b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.g1$c */
    /* loaded from: classes.dex */
    public class C1816c implements AbstractC14182c<Void> {

        /* renamed from: a */
        final /* synthetic */ C2114c.C2115a f1733a;

        C1816c(C2114c.C2115a aVar) {
            this.f1733a = aVar;
        }

        /* renamed from: b */
        public void mo1412a(Void r1) {
            C1813g1.this.m39741z0();
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            C1813g1.this.m39741z0();
            this.f1733a.m38958f(th2);
        }
    }

    /* renamed from: androidx.camera.core.g1$d */
    /* loaded from: classes.dex */
    class ThreadFactoryC1817d implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f1735a = new AtomicInteger(0);

        ThreadFactoryC1817d() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "CameraX-image_capture_" + this.f1735a.getAndIncrement());
        }
    }

    /* renamed from: androidx.camera.core.g1$e */
    /* loaded from: classes.dex */
    public static final class C1818e implements AbstractC13697x2.AbstractC13698a<C1813g1, C13594f1, C1818e>, AbstractC13617k1.AbstractC13618a<C1818e> {

        /* renamed from: a */
        private final C13696x1 f1737a;

        public C1818e() {
            this(C13696x1.m3002J());
        }

        /* renamed from: f */
        public static C1818e m39738f(AbstractC13662r0 r0Var) {
            return new C1818e(C13696x1.m3001K(r0Var));
        }

        @Override // androidx.camera.core.AbstractC1807f0
        /* renamed from: a */
        public AbstractC13692w1 mo3781a() {
            return this.f1737a;
        }

        /* renamed from: e */
        public C1813g1 m39739e() {
            int intValue;
            boolean z;
            if (mo3781a().mo2977a(AbstractC13617k1.f30420f, null) == null || mo3781a().mo2977a(AbstractC13617k1.f30422h, null) == null) {
                Integer num = (Integer) mo3781a().mo2977a(C13594f1.f39405B, null);
                boolean z2 = false;
                if (num != null) {
                    if (mo3781a().mo2977a(C13594f1.f39404A, null) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C2517g.m37593b(z, "Cannot set buffer format with CaptureProcessor defined.");
                    mo3781a().mo2999u(AbstractC13607i1.f30410e, num);
                } else if (mo3781a().mo2977a(C13594f1.f39404A, null) != null) {
                    mo3781a().mo2999u(AbstractC13607i1.f30410e, 35);
                } else {
                    mo3781a().mo2999u(AbstractC13607i1.f30410e, Integer.valueOf((int) Spliterator.NONNULL));
                }
                C1813g1 g1Var = new C1813g1(mo2998d());
                Size size = (Size) mo3781a().mo2977a(AbstractC13617k1.f30422h, null);
                if (size != null) {
                    g1Var.m39747t0(new Rational(size.getWidth(), size.getHeight()));
                }
                if (((Integer) mo3781a().mo2977a(C13594f1.f39406C, 2)).intValue() >= 1) {
                    z2 = true;
                }
                C2517g.m37593b(z2, "Maximum outstanding image count must be at least 1");
                C2517g.m37587h((Executor) mo3781a().mo2977a(AbstractC14504g.f32898r, C13905a.m2337c()), "The IO executor can't be null");
                AbstractC13692w1 a = mo3781a();
                AbstractC13662r0.AbstractC13663a<Integer> aVar = C13594f1.f30388y;
                if (!a.mo2973e(aVar) || (intValue = ((Integer) mo3781a().mo2976b(aVar)).intValue()) == 0 || intValue == 1 || intValue == 2) {
                    return g1Var;
                }
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + intValue);
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        /* renamed from: g */
        public C13594f1 mo2998d() {
            return new C13594f1(C13582c2.m3310H(this.f1737a));
        }

        /* renamed from: h */
        public C1818e m39736h(AbstractC13634m0 m0Var) {
            mo3781a().mo2999u(C13594f1.f30389z, m0Var);
            return this;
        }

        /* renamed from: i */
        public C1818e m39735i(int i) {
            mo3781a().mo2999u(C13594f1.f30387x, Integer.valueOf(i));
            return this;
        }

        /* renamed from: j */
        public C1818e m39734j(AbstractC13645o0 o0Var) {
            mo3781a().mo2999u(C13594f1.f39404A, o0Var);
            return this;
        }

        /* renamed from: k */
        public C1818e m39733k(int i) {
            mo3781a().mo2999u(C13594f1.f39406C, Integer.valueOf(i));
            return this;
        }

        /* renamed from: l */
        public C1818e m39732l(List<Pair<Integer, Size[]>> list) {
            mo3781a().mo2999u(AbstractC13617k1.f30425k, list);
            return this;
        }

        /* renamed from: m */
        public C1818e m39731m(int i) {
            mo3781a().mo2999u(AbstractC13697x2.f30589p, Integer.valueOf(i));
            return this;
        }

        /* renamed from: n */
        public C1818e m39730n(int i) {
            mo3781a().mo2999u(AbstractC13617k1.f30420f, Integer.valueOf(i));
            return this;
        }

        /* renamed from: o */
        public C1818e m39729o(Class<C1813g1> cls) {
            mo3781a().mo2999u(AbstractC14506i.f32900t, cls);
            if (mo3781a().mo2977a(AbstractC14506i.f32899s, null) == null) {
                m39728p(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: p */
        public C1818e m39728p(String str) {
            mo3781a().mo2999u(AbstractC14506i.f32899s, str);
            return this;
        }

        /* renamed from: q */
        public C1818e mo3208c(Size size) {
            mo3781a().mo2999u(AbstractC13617k1.f30422h, size);
            return this;
        }

        /* renamed from: r */
        public C1818e mo3209b(int i) {
            mo3781a().mo2999u(AbstractC13617k1.f30421g, Integer.valueOf(i));
            return this;
        }

        /* renamed from: s */
        public C1818e m39725s(AbstractC1948w2.AbstractC1950b bVar) {
            mo3781a().mo2999u(AbstractC14510m.f32902v, bVar);
            return this;
        }

        private C1818e(C13696x1 x1Var) {
            this.f1737a = x1Var;
            Class cls = (Class) x1Var.mo2977a(AbstractC14506i.f32900t, null);
            if (cls == null || cls.equals(C1813g1.class)) {
                m39729o(C1813g1.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* renamed from: androidx.camera.core.g1$f */
    /* loaded from: classes.dex */
    public static final class C1819f {

        /* renamed from: a */
        private static final C13594f1 f1738a = new C1818e().m39731m(4).m39730n(0).mo2998d();

        /* renamed from: a */
        public C13594f1 m39724a() {
            return f1738a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.g1$g */
    /* loaded from: classes.dex */
    public static class C1820g {

        /* renamed from: a */
        final int f1739a;

        /* renamed from: b */
        final int f1740b;

        /* renamed from: c */
        private final Rational f1741c;

        /* renamed from: d */
        private final Executor f1742d;

        /* renamed from: e */
        private final AbstractC1825i f1743e;

        /* renamed from: f */
        AtomicBoolean f1744f = new AtomicBoolean(false);

        /* renamed from: g */
        private final Rect f1745g;

        /* renamed from: h */
        private final Matrix f1746h;

        C1820g(int i, int i2, Rational rational, Rect rect, Matrix matrix, Executor executor, AbstractC1825i iVar) {
            boolean z = false;
            this.f1739a = i;
            this.f1740b = i2;
            if (rational != null) {
                C2517g.m37593b(!rational.isZero(), "Target ratio cannot be zero");
                C2517g.m37593b(rational.floatValue() > 0.0f ? true : z, "Target ratio must be positive");
            }
            this.f1741c = rational;
            this.f1745g = rect;
            this.f1746h = matrix;
            this.f1742d = executor;
            this.f1743e = iVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m39720d(ImageProxy imageProxy) {
            this.f1743e.mo4663a(imageProxy);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m39719e(int i, String str, Throwable th2) {
            this.f1743e.mo4662b(new C1872j1(i, str, th2));
        }

        /* renamed from: c */
        void m39721c(ImageProxy imageProxy) {
            Size size;
            int j;
            if (!this.f1744f.compareAndSet(false, true)) {
                imageProxy.close();
                return;
            }
            if (new C3749a().m33695b(imageProxy)) {
                try {
                    ByteBuffer c = imageProxy.mo39701d0()[0].mo39901c();
                    c.rewind();
                    byte[] bArr = new byte[c.capacity()];
                    c.get(bArr);
                    C1851k d = C1851k.m39670d(new ByteArrayInputStream(bArr));
                    c.rewind();
                    size = new Size(d.m39662l(), d.m39667g());
                    j = d.m39664j();
                } catch (IOException e) {
                    m39718f(1, "Unable to parse JPEG exif", e);
                    imageProxy.close();
                    return;
                }
            } else {
                size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
                j = this.f1739a;
            }
            final C1877k2 k2Var = new C1877k2(imageProxy, size, AbstractC1904p1.m39540d(imageProxy.mo39604p0().mo343c(), imageProxy.mo39604p0().mo345a(), j, this.f1746h));
            k2Var.mo39605O(C1813g1.m39769X(this.f1745g, this.f1741c, this.f1739a, size, j));
            try {
                this.f1742d.execute(new Runnable() { // from class: androidx.camera.core.i1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1813g1.C1820g.this.m39720d(k2Var);
                    }
                });
            } catch (RejectedExecutionException unused) {
                C1915r1.m39525c("ImageCapture", "Unable to post to the supplied executor.");
                imageProxy.close();
            }
        }

        /* renamed from: f */
        void m39718f(final int i, final String str, final Throwable th2) {
            if (this.f1744f.compareAndSet(false, true)) {
                try {
                    this.f1742d.execute(new Runnable() { // from class: androidx.camera.core.h1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1813g1.C1820g.this.m39719e(i, str, th2);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                    C1915r1.m39525c("ImageCapture", "Unable to post to the supplied executor.");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.g1$h */
    /* loaded from: classes.dex */
    public static class C1821h implements AbstractC1833i0.AbstractC1834a {

        /* renamed from: e */
        private final AbstractC1823b f1751e;

        /* renamed from: f */
        private final int f1752f;

        /* renamed from: g */
        private final AbstractC1824c f1753g;

        /* renamed from: a */
        private final Deque<C1820g> f1747a = new ArrayDeque();

        /* renamed from: b */
        C1820g f1748b = null;

        /* renamed from: c */
        AbstractFutureC7576b<ImageProxy> f1749c = null;

        /* renamed from: d */
        int f1750d = 0;

        /* renamed from: h */
        final Object f1754h = new Object();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.core.g1$h$a */
        /* loaded from: classes.dex */
        public class C1822a implements AbstractC14182c<ImageProxy> {

            /* renamed from: a */
            final /* synthetic */ C1820g f1755a;

            C1822a(C1820g gVar) {
                this.f1755a = gVar;
            }

            /* renamed from: b */
            public void mo1412a(ImageProxy imageProxy) {
                synchronized (C1821h.this.f1754h) {
                    C2517g.m37588g(imageProxy);
                    C1892m2 m2Var = new C1892m2(imageProxy);
                    m2Var.m39702b(C1821h.this);
                    C1821h.this.f1750d++;
                    this.f1755a.m39721c(m2Var);
                    C1821h hVar = C1821h.this;
                    hVar.f1748b = null;
                    hVar.f1749c = null;
                    hVar.m39716b();
                }
            }

            @Override // p431y.AbstractC14182c
            public void onFailure(Throwable th2) {
                String str;
                synchronized (C1821h.this.f1754h) {
                    if (!(th2 instanceof CancellationException)) {
                        C1820g gVar = this.f1755a;
                        int b0 = C1813g1.m39765b0(th2);
                        if (th2 != null) {
                            str = th2.getMessage();
                        } else {
                            str = "Unknown error";
                        }
                        gVar.m39718f(b0, str, th2);
                    }
                    C1821h hVar = C1821h.this;
                    hVar.f1748b = null;
                    hVar.f1749c = null;
                    hVar.m39716b();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.core.g1$h$b */
        /* loaded from: classes.dex */
        public interface AbstractC1823b {
            /* renamed from: a */
            AbstractFutureC7576b<ImageProxy> mo39713a(C1820g gVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.core.g1$h$c */
        /* loaded from: classes.dex */
        public interface AbstractC1824c {
            /* renamed from: a */
            void mo39712a(C1820g gVar);
        }

        C1821h(int i, AbstractC1823b bVar, AbstractC1824c cVar) {
            this.f1752f = i;
            this.f1751e = bVar;
            this.f1753g = cVar;
        }

        /* renamed from: a */
        public void m39717a(Throwable th2) {
            C1820g gVar;
            AbstractFutureC7576b<ImageProxy> bVar;
            ArrayList<C1820g> arrayList;
            synchronized (this.f1754h) {
                gVar = this.f1748b;
                this.f1748b = null;
                bVar = this.f1749c;
                this.f1749c = null;
                arrayList = new ArrayList(this.f1747a);
                this.f1747a.clear();
            }
            if (!(gVar == null || bVar == null)) {
                gVar.m39718f(C1813g1.m39765b0(th2), th2.getMessage(), th2);
                bVar.cancel(true);
            }
            for (C1820g gVar2 : arrayList) {
                gVar2.m39718f(C1813g1.m39765b0(th2), th2.getMessage(), th2);
            }
        }

        /* renamed from: b */
        void m39716b() {
            synchronized (this.f1754h) {
                if (this.f1748b == null) {
                    if (this.f1750d >= this.f1752f) {
                        C1915r1.m39517k("ImageCapture", "Too many acquire images. Close image to be able to process next.");
                        return;
                    }
                    C1820g poll = this.f1747a.poll();
                    if (poll != null) {
                        this.f1748b = poll;
                        AbstractC1824c cVar = this.f1753g;
                        if (cVar != null) {
                            cVar.mo39712a(poll);
                        }
                        AbstractFutureC7576b<ImageProxy> a = this.f1751e.mo39713a(poll);
                        this.f1749c = a;
                        C14186f.m1427b(a, new C1822a(poll), C13905a.m2339a());
                    }
                }
            }
        }

        @Override // androidx.camera.core.AbstractC1833i0.AbstractC1834a
        /* renamed from: c */
        public void mo39498c(ImageProxy imageProxy) {
            synchronized (this.f1754h) {
                this.f1750d--;
                m39716b();
            }
        }

        /* renamed from: d */
        public void m39715d(C1820g gVar) {
            int i;
            synchronized (this.f1754h) {
                this.f1747a.offer(gVar);
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                if (this.f1748b != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(this.f1747a.size());
                C1915r1.m39527a("ImageCapture", String.format(locale, "Send image capture request [current, pending] = [%d, %d]", objArr));
                m39716b();
            }
        }
    }

    /* renamed from: androidx.camera.core.g1$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1825i {
        /* renamed from: a */
        public void mo4663a(ImageProxy imageProxy) {
        }

        /* renamed from: b */
        public void mo4662b(C1872j1 j1Var) {
        }
    }

    C1813g1(C13594f1 f1Var) {
        super(f1Var);
        C13594f1 f1Var2 = (C13594f1) m39433f();
        if (f1Var2.mo2973e(C13594f1.f30387x)) {
            this.f1717n = f1Var2.m3280G();
        } else {
            this.f1717n = 1;
        }
        this.f1719p = f1Var2.m3277J(0);
        Executor executor = (Executor) C2517g.m37588g(f1Var2.m3275L(C13905a.m2337c()));
        this.f1716m = executor;
        this.f35332E = C13905a.m2333g(executor);
    }

    /* renamed from: V */
    private void m39771V() {
        if (this.f35331D != null) {
            this.f35331D.m39717a(new C1878l("Camera is closed."));
        }
    }

    /* renamed from: X */
    static Rect m39769X(Rect rect, Rational rational, int i, Size size, int i2) {
        if (rect != null) {
            return C6389a.m25643b(rect, i, size, i2);
        }
        if (rational != null) {
            if (i2 % 180 != 0) {
                rational = new Rational(rational.getDenominator(), rational.getNumerator());
            }
            if (C6389a.m25639f(size, rational)) {
                return C6389a.m25644a(size, rational);
            }
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    /* renamed from: Z */
    static boolean m39767Z(AbstractC13692w1 w1Var) {
        boolean z;
        AbstractC13662r0.AbstractC13663a<Boolean> aVar = C13594f1.f39408E;
        Boolean bool = Boolean.FALSE;
        boolean z2 = false;
        if (((Boolean) w1Var.mo2977a(aVar, bool)).booleanValue()) {
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                C1915r1.m39517k("ImageCapture", "Software JPEG only supported on API 26+, but current API level is " + i);
                z = false;
            } else {
                z = true;
            }
            Integer num = (Integer) w1Var.mo2977a(C13594f1.f39405B, null);
            if (num == null || num.intValue() == 256) {
                z2 = z;
            } else {
                C1915r1.m39517k("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z2) {
                C1915r1.m39517k("ImageCapture", "Unable to support software JPEG. Disabling.");
                w1Var.mo2999u(aVar, bool);
            }
        }
        return z2;
    }

    /* renamed from: a0 */
    private AbstractC13634m0 m39766a0(AbstractC13634m0 m0Var) {
        List<AbstractC13651p0> c = this.f1724u.mo3159c();
        if (c == null || c.isEmpty()) {
            return m0Var;
        }
        return C1777b0.m39858a(c);
    }

    /* renamed from: b0 */
    static int m39765b0(Throwable th2) {
        if (th2 instanceof C1878l) {
            return 3;
        }
        if (th2 instanceof C1872j1) {
            return ((C1872j1) th2).m39612a();
        }
        return 0;
    }

    /* renamed from: d0 */
    private int m39763d0() {
        C13594f1 f1Var = (C13594f1) m39433f();
        if (f1Var.mo2973e(C13594f1.f39410G)) {
            return f1Var.m3274M();
        }
        int i = this.f1717n;
        if (i == 0) {
            return 100;
        }
        if (i == 1) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f1717n + " is invalid");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static /* synthetic */ void m39760g0(C14512o oVar, C1803e0 e0Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            oVar.m288d();
            e0Var.m39794f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ void m39758i0(String str, C13594f1 f1Var, Size size, C13619k2 k2Var, C13619k2.EnumC13624e eVar) {
        m39770W();
        if (m39426o(str)) {
            C13619k2.C13621b Y = m39768Y(str, f1Var, size);
            this.f1728y = Y;
            m39440I(Y.m3185m());
            m39422s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static /* synthetic */ Void m39757j0(List list) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public static /* synthetic */ void m39756k0(AbstractC13635m1 m1Var) {
        try {
            ImageProxy d = m1Var.mo3156d();
            Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + d);
            if (d != null) {
                d.close();
            }
        } catch (IllegalStateException e) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ void m39755l0(AbstractC1825i iVar) {
        iVar.mo4662b(new C1872j1(4, "Not bound to a valid Camera [" + this + "]", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public static /* synthetic */ void m39754m0(AbstractC1825i iVar) {
        iVar.mo4662b(new C1872j1(0, "Request is canceled", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public /* synthetic */ Object m39752o0(C1820g gVar, final C2114c.C2115a aVar) {
        this.f1729z.mo3154f(new AbstractC13635m1.AbstractC13636a() { // from class: androidx.camera.core.f1
            @Override // p390w.AbstractC13635m1.AbstractC13636a
            /* renamed from: a */
            public final void mo3152a(AbstractC13635m1 m1Var) {
                C1813g1.m39751p0(C2114c.C2115a.this, m1Var);
            }
        }, C13905a.m2336d());
        m39749r0();
        final AbstractFutureC7576b<Void> f0 = m39761f0(gVar);
        C14186f.m1427b(f0, new C1816c(aVar), this.f1722s);
        aVar.m38963a(new Runnable() { // from class: androidx.camera.core.v0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractFutureC7576b.this.cancel(true);
            }
        }, C13905a.m2339a());
        return "takePictureInternal";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static /* synthetic */ void m39751p0(C2114c.C2115a aVar, AbstractC13635m1 m1Var) {
        try {
            ImageProxy d = m1Var.mo3156d();
            if (d == null) {
                aVar.m38958f(new IllegalStateException("Unable to acquire image"));
            } else if (!aVar.m38961c(d)) {
                d.close();
            }
        } catch (IllegalStateException e) {
            aVar.m38958f(e);
        }
    }

    /* renamed from: r0 */
    private void m39749r0() {
        synchronized (this.f1718o) {
            if (this.f1718o.get() == null) {
                this.f1718o.set(Integer.valueOf(m39764c0()));
            }
        }
    }

    /* renamed from: s0 */
    private void m39748s0(Executor executor, final AbstractC1825i iVar, int i) {
        AbstractC13597g0 c = m39436c();
        if (c == null) {
            executor.execute(new Runnable() { // from class: androidx.camera.core.x0
                @Override // java.lang.Runnable
                public final void run() {
                    C1813g1.this.m39755l0(iVar);
                }
            });
            return;
        }
        C1821h hVar = this.f35331D;
        if (hVar == null) {
            executor.execute(new Runnable() { // from class: androidx.camera.core.y0
                @Override // java.lang.Runnable
                public final void run() {
                    C1813g1.m39754m0(C1813g1.AbstractC1825i.this);
                }
            });
        } else {
            hVar.m39715d(new C1820g(m39430j(c), i, this.f1721r, m39427n(), this.f35333F, executor, iVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public AbstractFutureC7576b<ImageProxy> m39759h0(final C1820g gVar) {
        return C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.core.e1
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object o0;
                o0 = C1813g1.this.m39752o0(gVar, aVar);
                return o0;
            }
        });
    }

    /* renamed from: y0 */
    private void m39742y0() {
        synchronized (this.f1718o) {
            if (this.f1718o.get() == null) {
                m39435d().mo3336e(m39764c0());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: A */
    public AbstractC13697x2<?> mo20570A(AbstractC13589e0 e0Var, AbstractC13697x2.AbstractC13698a<?, ?, ?> aVar) {
        boolean z;
        AbstractC13697x2 d = aVar.mo2998d();
        AbstractC13662r0.AbstractC13663a<AbstractC13645o0> aVar2 = C13594f1.f39404A;
        if (d.mo2977a(aVar2, null) != null && Build.VERSION.SDK_INT >= 29) {
            C1915r1.m39523e("ImageCapture", "Requesting software JPEG due to a CaptureProcessor is set.");
            aVar.mo3781a().mo2999u(C13594f1.f39408E, Boolean.TRUE);
        } else if (e0Var.mo3294e().m3261a(AbstractC3340e.class)) {
            AbstractC13692w1 a = aVar.mo3781a();
            AbstractC13662r0.AbstractC13663a<Boolean> aVar3 = C13594f1.f39408E;
            Boolean bool = Boolean.TRUE;
            if (!((Boolean) a.mo2977a(aVar3, bool)).booleanValue()) {
                C1915r1.m39517k("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                C1915r1.m39523e("ImageCapture", "Requesting software JPEG due to device quirk.");
                aVar.mo3781a().mo2999u(aVar3, bool);
            }
        }
        boolean Z = m39767Z(aVar.mo3781a());
        Integer num = (Integer) aVar.mo3781a().mo2977a(C13594f1.f39405B, null);
        boolean z2 = false;
        int i = 35;
        if (num != null) {
            if (aVar.mo3781a().mo2977a(aVar2, null) == null) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37593b(z, "Cannot set buffer format with CaptureProcessor defined.");
            AbstractC13692w1 a2 = aVar.mo3781a();
            AbstractC13662r0.AbstractC13663a<Integer> aVar4 = AbstractC13607i1.f30410e;
            if (!Z) {
                i = num.intValue();
            }
            a2.mo2999u(aVar4, Integer.valueOf(i));
        } else if (aVar.mo3781a().mo2977a(aVar2, null) != null || Z) {
            aVar.mo3781a().mo2999u(AbstractC13607i1.f30410e, 35);
        } else {
            aVar.mo3781a().mo2999u(AbstractC13607i1.f30410e, Integer.valueOf((int) Spliterator.NONNULL));
        }
        if (((Integer) aVar.mo3781a().mo2977a(C13594f1.f39406C, 2)).intValue() >= 1) {
            z2 = true;
        }
        C2517g.m37593b(z2, "Maximum outstanding image count must be at least 1");
        return aVar.mo2998d();
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: C */
    public void mo20568C() {
        m39771V();
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: D */
    protected Size mo20567D(Size size) {
        C13619k2.C13621b Y = m39768Y(m39434e(), (C13594f1) m39433f(), size);
        this.f1728y = Y;
        m39440I(Y.m3185m());
        m39424q();
        return size;
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: F */
    public void mo39442F(Matrix matrix) {
        this.f35333F = matrix;
    }

    /* renamed from: W */
    void m39770W() {
        C1869r.m39614a();
        C1821h hVar = this.f35331D;
        if (hVar != null) {
            hVar.m39717a(new CancellationException("Request is canceled."));
            this.f35331D = null;
        }
        AbstractC13689w0 w0Var = this.f35330C;
        this.f35330C = null;
        this.f1729z = null;
        this.f35328A = null;
        if (w0Var != null) {
            w0Var.m3023c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    p390w.C13619k2.C13621b m39768Y(final java.lang.String r16, final p390w.C13594f1 r17, final android.util.Size r18) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1813g1.m39768Y(java.lang.String, w.f1, android.util.Size):w.k2$b");
    }

    /* renamed from: c0 */
    public int m39764c0() {
        int i;
        synchronized (this.f1718o) {
            i = this.f1720q;
            if (i == -1) {
                i = ((C13594f1) m39433f()).m3278I(2);
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public int m39762e0() {
        return m39428l();
    }

    /* renamed from: f0 */
    AbstractFutureC7576b<Void> m39761f0(C1820g gVar) {
        String str;
        AbstractC13634m0 m0Var;
        C1915r1.m39527a("ImageCapture", "issueTakePicture");
        ArrayList arrayList = new ArrayList();
        if (this.f35328A != null) {
            m0Var = m39766a0(C1777b0.m39856c());
            if (m0Var == null) {
                return C14186f.m1423f(new IllegalArgumentException("ImageCapture cannot set empty CaptureBundle."));
            }
            if (this.f1726w == null && m0Var.mo3159c().size() > 1) {
                return C14186f.m1423f(new IllegalArgumentException("No CaptureProcessor can be found to process the images captured for multiple CaptureStages."));
            }
            if (m0Var.mo3159c().size() > this.f1725v) {
                return C14186f.m1423f(new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size"));
            }
            this.f35328A.m39816m(m0Var);
            str = this.f35328A.m39819j();
        } else {
            m0Var = m39766a0(C1777b0.m39856c());
            if (m0Var.mo3159c().size() > 1) {
                return C14186f.m1423f(new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1."));
            }
            str = null;
        }
        for (AbstractC13651p0 p0Var : m0Var.mo3159c()) {
            C13639n0.C13640a aVar = new C13639n0.C13640a();
            aVar.m3130o(this.f1723t.m3146f());
            aVar.m3140e(this.f1723t.m3149c());
            aVar.m3144a(this.f1728y.m3182p());
            aVar.m3139f(this.f35330C);
            if (new C3749a().m33696a()) {
                aVar.m3141d(C13639n0.f30458g, Integer.valueOf(gVar.f1739a));
            }
            aVar.m3141d(C13639n0.f30459h, Integer.valueOf(gVar.f1740b));
            aVar.m3140e(p0Var.mo3114a().m3149c());
            if (str != null) {
                aVar.m3138g(str, Integer.valueOf(p0Var.getId()));
            }
            aVar.m3142c(this.f35329B);
            arrayList.add(aVar.m3137h());
        }
        return C14186f.m1414o(m39435d().mo3340a(arrayList, this.f1717n, this.f1719p), new Function() { // from class: androidx.camera.core.w0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                Void j0;
                j0 = C1813g1.m39757j0((List) obj);
                return j0;
            }
        }, C13905a.m2339a());
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: g */
    public AbstractC13697x2<?> mo20549g(boolean z, AbstractC13702y2 y2Var) {
        AbstractC13662r0 a = y2Var.mo2994a(AbstractC13702y2.EnumC13704b.IMAGE_CAPTURE);
        if (z) {
            a = C13656q0.m3108b(a, f35327G.m39724a());
        }
        if (a == null) {
            return null;
        }
        return mo20548m(a).mo2998d();
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: m */
    public AbstractC13697x2.AbstractC13698a<?, ?, ?> mo20548m(AbstractC13662r0 r0Var) {
        return C1818e.m39738f(r0Var);
    }

    /* renamed from: t0 */
    public void m39747t0(Rational rational) {
        this.f1721r = rational;
    }

    public String toString() {
        return "ImageCapture:" + m39431i();
    }

    /* renamed from: u0 */
    public void m39746u0(int i) {
        if (i == 0 || i == 1 || i == 2) {
            synchronized (this.f1718o) {
                this.f1720q = i;
                m39742y0();
            }
            return;
        }
        throw new IllegalArgumentException("Invalid flash mode: " + i);
    }

    /* renamed from: v0 */
    public void m39745v0(int i) {
        int e0 = m39762e0();
        if (m39441G(i) && this.f1721r != null) {
            this.f1721r = C6389a.m25642c(Math.abs(C1838b.m39691b(i) - C1838b.m39691b(e0)), this.f1721r);
        }
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: w */
    public void mo20547w() {
        C13594f1 f1Var = (C13594f1) m39433f();
        this.f1723t = C13639n0.C13640a.m3135j(f1Var).m3137h();
        this.f1726w = f1Var.m3279H(null);
        this.f1725v = f1Var.m3273N(2);
        this.f1724u = f1Var.m3281F(C1777b0.m39856c());
        this.f1727x = f1Var.m3271P();
        C2517g.m37587h(m39436c(), "Attached camera cannot be null");
        this.f1722s = Executors.newFixedThreadPool(1, new ThreadFactoryC1817d());
    }

    /* renamed from: w0 */
    public void m39753n0(final Executor executor, final AbstractC1825i iVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C13905a.m2336d().execute(new Runnable() { // from class: androidx.camera.core.u0
                @Override // java.lang.Runnable
                public final void run() {
                    C1813g1.this.m39753n0(executor, iVar);
                }
            });
        } else {
            m39748s0(executor, iVar, m39763d0());
        }
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: x */
    protected void mo39418x() {
        m39742y0();
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: z */
    public void mo20546z() {
        m39771V();
        m39770W();
        this.f1727x = false;
        this.f1722s.shutdown();
    }

    /* renamed from: z0 */
    void m39741z0() {
        synchronized (this.f1718o) {
            Integer andSet = this.f1718o.getAndSet(null);
            if (andSet != null) {
                if (andSet.intValue() != m39764c0()) {
                    m39742y0();
                }
            }
        }
    }
}
