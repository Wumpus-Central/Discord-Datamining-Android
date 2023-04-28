package p006a5;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import java.util.concurrent.ExecutorService;
import p414x3.C13925a;
import p415x4.AbstractC13928a;
import p436y4.AbstractC14224b;
import p436y4.AbstractC14225c;

/* renamed from: a5.c */
/* loaded from: classes7.dex */
public class C1267c implements AbstractC1266b {

    /* renamed from: f */
    private static final Class<?> f129f = C1267c.class;

    /* renamed from: a */
    private final PlatformBitmapFactory f130a;

    /* renamed from: b */
    private final AbstractC14225c f131b;

    /* renamed from: c */
    private final Bitmap.Config f132c;

    /* renamed from: d */
    private final ExecutorService f133d;

    /* renamed from: e */
    private final SparseArray<Runnable> f134e = new SparseArray<>();

    /* renamed from: a5.c$a */
    /* loaded from: classes7.dex */
    private class RunnableC1268a implements Runnable {

        /* renamed from: k */
        private final AbstractC14224b f135k;

        /* renamed from: l */
        private final AbstractC13928a f136l;

        /* renamed from: m */
        private final int f137m;

        /* renamed from: n */
        private final int f138n;

        public RunnableC1268a(AbstractC13928a aVar, AbstractC14224b bVar, int i, int i2) {
            this.f136l = aVar;
            this.f135k = bVar;
            this.f137m = i;
            this.f138n = i2;
        }

        /* renamed from: a */
        private boolean m41497a(int i, int i2) {
            CloseableReference<Bitmap> d;
            int i3 = 2;
            CloseableReference closeableReference = null;
            try {
                if (i2 == 1) {
                    d = this.f135k.mo246d(i, this.f136l.mo1340e(), this.f136l.mo1342c());
                } else if (i2 != 2) {
                    return false;
                } else {
                    d = C1267c.this.f130a.m31510b(this.f136l.mo1340e(), this.f136l.mo1342c(), C1267c.this.f132c);
                    i3 = -1;
                }
                boolean b = m41496b(i, closeableReference, i2);
                if (b || i3 == -1) {
                    return b;
                }
                return m41497a(i, i3);
            } catch (RuntimeException e) {
                C13925a.m2307E(C1267c.f129f, "Failed to create frame bitmap", e);
                return false;
            } finally {
                CloseableReference.m32025t(closeableReference);
            }
        }

        /* renamed from: b */
        private boolean m41496b(int i, CloseableReference<Bitmap> closeableReference, int i2) {
            if (!CloseableReference.m32036R(closeableReference) || !C1267c.this.f131b.mo1330a(i, closeableReference.m32039C())) {
                return false;
            }
            C13925a.m2274x(C1267c.f129f, "Frame %d ready.", Integer.valueOf(this.f137m));
            synchronized (C1267c.this.f134e) {
                this.f135k.mo249a(this.f137m, closeableReference, i2);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f135k.contains(this.f137m)) {
                    C13925a.m2274x(C1267c.f129f, "Frame %d is cached already.", Integer.valueOf(this.f137m));
                    synchronized (C1267c.this.f134e) {
                        C1267c.this.f134e.remove(this.f138n);
                    }
                    return;
                }
                if (m41497a(this.f137m, 1)) {
                    C13925a.m2274x(C1267c.f129f, "Prepared frame frame %d.", Integer.valueOf(this.f137m));
                } else {
                    C13925a.m2290h(C1267c.f129f, "Could not prepare frame %d.", Integer.valueOf(this.f137m));
                }
                synchronized (C1267c.this.f134e) {
                    C1267c.this.f134e.remove(this.f138n);
                }
            } catch (Throwable th2) {
                synchronized (C1267c.this.f134e) {
                    C1267c.this.f134e.remove(this.f138n);
                    throw th2;
                }
            }
        }
    }

    public C1267c(PlatformBitmapFactory platformBitmapFactory, AbstractC14225c cVar, Bitmap.Config config, ExecutorService executorService) {
        this.f130a = platformBitmapFactory;
        this.f131b = cVar;
        this.f132c = config;
        this.f133d = executorService;
    }

    /* renamed from: g */
    private static int m41498g(AbstractC13928a aVar, int i) {
        return (aVar.hashCode() * 31) + i;
    }

    @Override // p006a5.AbstractC1266b
    /* renamed from: a */
    public boolean mo41504a(AbstractC14224b bVar, AbstractC13928a aVar, int i) {
        int g = m41498g(aVar, i);
        synchronized (this.f134e) {
            if (this.f134e.get(g) != null) {
                C13925a.m2274x(f129f, "Already scheduled decode job for frame %d", Integer.valueOf(i));
                return true;
            } else if (bVar.contains(i)) {
                C13925a.m2274x(f129f, "Frame %d is cached already.", Integer.valueOf(i));
                return true;
            } else {
                RunnableC1268a aVar2 = new RunnableC1268a(aVar, bVar, i, g);
                this.f134e.put(g, aVar2);
                this.f133d.execute(aVar2);
                return true;
            }
        }
    }
}
