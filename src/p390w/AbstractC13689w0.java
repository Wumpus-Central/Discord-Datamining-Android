package p390w;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C1915r1;
import androidx.concurrent.futures.C2114c;
import java.util.concurrent.atomic.AtomicInteger;
import p120gc.AbstractFutureC7576b;
import p410x.C13905a;
import p431y.C14186f;

/* renamed from: w.w0 */
/* loaded from: classes.dex */
public abstract class AbstractC13689w0 {

    /* renamed from: i */
    public static final Size f30568i = new Size(0, 0);

    /* renamed from: j */
    private static final boolean f30569j = C1915r1.m39522f("DeferrableSurface");

    /* renamed from: k */
    private static final AtomicInteger f30570k = new AtomicInteger(0);

    /* renamed from: l */
    private static final AtomicInteger f30571l = new AtomicInteger(0);

    /* renamed from: a */
    private final Object f30572a;

    /* renamed from: b */
    private int f30573b;

    /* renamed from: c */
    private boolean f30574c;

    /* renamed from: d */
    private C2114c.C2115a<Void> f30575d;

    /* renamed from: e */
    private final AbstractFutureC7576b<Void> f30576e;

    /* renamed from: f */
    private final Size f30577f;

    /* renamed from: g */
    private final int f30578g;

    /* renamed from: h */
    Class<?> f30579h;

    /* renamed from: w.w0$a */
    /* loaded from: classes.dex */
    public static final class C13690a extends Exception {

        /* renamed from: k */
        AbstractC13689w0 f30580k;

        public C13690a(String str, AbstractC13689w0 w0Var) {
            super(str);
            this.f30580k = w0Var;
        }

        /* renamed from: a */
        public AbstractC13689w0 m3010a() {
            return this.f30580k;
        }
    }

    /* renamed from: w.w0$b */
    /* loaded from: classes.dex */
    public static final class C13691b extends Exception {
        public C13691b(String str) {
            super(str);
        }
    }

    public AbstractC13689w0() {
        this(f30568i, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Object m3015k(C2114c.C2115a aVar) {
        synchronized (this.f30572a) {
            this.f30575d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m3014l(String str) {
        try {
            this.f30576e.get();
            m3013m("Surface terminated", f30571l.decrementAndGet(), f30570k.get());
        } catch (Exception e) {
            C1915r1.m39525c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f30572a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f30574c), Integer.valueOf(this.f30573b)), e);
            }
        }
    }

    /* renamed from: m */
    private void m3013m(String str, int i, int i2) {
        if (!f30569j && C1915r1.m39522f("DeferrableSurface")) {
            C1915r1.m39527a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        C1915r1.m39527a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    /* renamed from: c */
    public final void m3023c() {
        C2114c.C2115a<Void> aVar;
        synchronized (this.f30572a) {
            if (!this.f30574c) {
                this.f30574c = true;
                if (this.f30573b == 0) {
                    aVar = this.f30575d;
                    this.f30575d = null;
                } else {
                    aVar = null;
                }
                if (C1915r1.m39522f("DeferrableSurface")) {
                    C1915r1.m39527a("DeferrableSurface", "surface closed,  useCount=" + this.f30573b + " closed=true " + this);
                }
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.m38961c(null);
        }
    }

    /* renamed from: d */
    public void m3022d() {
        C2114c.C2115a<Void> aVar;
        synchronized (this.f30572a) {
            int i = this.f30573b;
            if (i != 0) {
                int i2 = i - 1;
                this.f30573b = i2;
                if (i2 != 0 || !this.f30574c) {
                    aVar = null;
                } else {
                    aVar = this.f30575d;
                    this.f30575d = null;
                }
                if (C1915r1.m39522f("DeferrableSurface")) {
                    C1915r1.m39527a("DeferrableSurface", "use count-1,  useCount=" + this.f30573b + " closed=" + this.f30574c + " " + this);
                    if (this.f30573b == 0) {
                        m3013m("Surface no longer in use", f30571l.get(), f30570k.decrementAndGet());
                    }
                }
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
        if (aVar != null) {
            aVar.m38961c(null);
        }
    }

    /* renamed from: e */
    public Class<?> m3021e() {
        return this.f30579h;
    }

    /* renamed from: f */
    public Size m3020f() {
        return this.f30577f;
    }

    /* renamed from: g */
    public int m3019g() {
        return this.f30578g;
    }

    /* renamed from: h */
    public final AbstractFutureC7576b<Surface> m3018h() {
        synchronized (this.f30572a) {
            if (this.f30574c) {
                return C14186f.m1423f(new C13690a("DeferrableSurface already closed.", this));
            }
            return mo3012n();
        }
    }

    /* renamed from: i */
    public AbstractFutureC7576b<Void> m3017i() {
        return C14186f.m1419j(this.f30576e);
    }

    /* renamed from: j */
    public void m3016j() {
        synchronized (this.f30572a) {
            int i = this.f30573b;
            if (i == 0 && this.f30574c) {
                throw new C13690a("Cannot begin use on a closed surface.", this);
            }
            this.f30573b = i + 1;
            if (C1915r1.m39522f("DeferrableSurface")) {
                if (this.f30573b == 1) {
                    m3013m("New surface in use", f30571l.get(), f30570k.incrementAndGet());
                }
                C1915r1.m39527a("DeferrableSurface", "use count+1, useCount=" + this.f30573b + " " + this);
            }
        }
    }

    /* renamed from: n */
    protected abstract AbstractFutureC7576b<Surface> mo3012n();

    /* renamed from: o */
    public void m3011o(Class<?> cls) {
        this.f30579h = cls;
    }

    public AbstractC13689w0(Size size, int i) {
        this.f30572a = new Object();
        this.f30573b = 0;
        this.f30574c = false;
        this.f30577f = size;
        this.f30578g = i;
        AbstractFutureC7576b<Void> a = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: w.u0
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object k;
                k = AbstractC13689w0.this.m3015k(aVar);
                return k;
            }
        });
        this.f30576e = a;
        if (C1915r1.m39522f("DeferrableSurface")) {
            m3013m("Surface created", f30571l.incrementAndGet(), f30570k.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            a.mo1409a(new Runnable() { // from class: w.v0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC13689w0.this.m3014l(stackTraceString);
                }
            }, C13905a.m2339a());
        }
    }
}
