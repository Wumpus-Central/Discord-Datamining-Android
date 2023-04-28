package p278p5;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p007a6.C1271b;
import p022b2.C3373f;
import p276p3.AbstractC11526a;
import p292q3.AbstractC11989i;
import p312r3.AbstractC12384h;
import p380v5.C13434e;
import p394w3.C13740j;
import p396w5.C13749a;
import p414x3.C13925a;
import p455z3.AbstractC14535g;
import p455z3.AbstractC14537h;
import p455z3.C14540k;

/* renamed from: p5.e */
/* loaded from: classes7.dex */
public class C11538e {

    /* renamed from: h */
    private static final Class<?> f25758h = C11538e.class;

    /* renamed from: a */
    private final AbstractC12384h f25759a;

    /* renamed from: b */
    private final AbstractC14537h f25760b;

    /* renamed from: c */
    private final C14540k f25761c;

    /* renamed from: d */
    private final Executor f25762d;

    /* renamed from: e */
    private final Executor f25763e;

    /* renamed from: f */
    private final C11569w f25764f = C11569w.m9331d();

    /* renamed from: g */
    private final AbstractC11557o f25765g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p5.e$a */
    /* loaded from: classes7.dex */
    public class CallableC11539a implements Callable<C13434e> {

        /* renamed from: a */
        final /* synthetic */ Object f25766a;

        /* renamed from: b */
        final /* synthetic */ AtomicBoolean f25767b;

        /* renamed from: c */
        final /* synthetic */ CacheKey f25768c;

        CallableC11539a(Object obj, AtomicBoolean atomicBoolean, CacheKey cacheKey) {
            this.f25766a = obj;
            this.f25767b = atomicBoolean;
            this.f25768c = cacheKey;
        }

        /* renamed from: a */
        public C13434e call() {
            Object e = C13749a.m2816e(this.f25766a, null);
            try {
                if (!this.f25767b.get()) {
                    C13434e c = C11538e.this.f25764f.m9332c(this.f25768c);
                    if (c != null) {
                        C13925a.m2274x(C11538e.f25758h, "Found image for %s in staging area", this.f25768c.mo256a());
                        C11538e.this.f25765g.mo9343g(this.f25768c);
                    } else {
                        C13925a.m2274x(C11538e.f25758h, "Did not find image for %s in staging area", this.f25768c.mo256a());
                        C11538e.this.f25765g.mo9338l(this.f25768c);
                        try {
                            AbstractC14535g q = C11538e.this.m9417q(this.f25768c);
                            if (q == null) {
                                return null;
                            }
                            CloseableReference S = CloseableReference.m32035S(q);
                            try {
                                c = new C13434e(S);
                            } finally {
                                CloseableReference.m32025t(S);
                            }
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                    if (!Thread.interrupted()) {
                        return c;
                    }
                    C13925a.m2275w(C11538e.f25758h, "Host thread was interrupted, decreasing reference count");
                    c.close();
                    throw new InterruptedException();
                }
                throw new CancellationException();
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    /* renamed from: p5.e$b */
    /* loaded from: classes7.dex */
    class RunnableC11540b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Object f25770k;

        /* renamed from: l */
        final /* synthetic */ CacheKey f25771l;

        /* renamed from: m */
        final /* synthetic */ C13434e f25772m;

        RunnableC11540b(Object obj, CacheKey cacheKey, C13434e eVar) {
            this.f25770k = obj;
            this.f25771l = cacheKey;
            this.f25772m = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object e = C13749a.m2816e(this.f25770k, null);
            try {
                C11538e.this.m9415s(this.f25771l, this.f25772m);
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    /* renamed from: p5.e$c */
    /* loaded from: classes7.dex */
    class CallableC11541c implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Object f25774a;

        /* renamed from: b */
        final /* synthetic */ CacheKey f25775b;

        CallableC11541c(Object obj, CacheKey cacheKey) {
            this.f25774a = obj;
            this.f25775b = cacheKey;
        }

        /* renamed from: a */
        public Void call() {
            Object e = C13749a.m2816e(this.f25774a, null);
            try {
                C11538e.this.f25764f.m9328g(this.f25775b);
                C11538e.this.f25759a.mo6998f(this.f25775b);
                return null;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p5.e$d */
    /* loaded from: classes7.dex */
    public class CallableC11542d implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Object f25777a;

        CallableC11542d(Object obj) {
            this.f25777a = obj;
        }

        /* renamed from: a */
        public Void call() {
            Object e = C13749a.m2816e(this.f25777a, null);
            try {
                C11538e.this.f25764f.m9334a();
                C11538e.this.f25759a.mo7003a();
                return null;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p5.e$e */
    /* loaded from: classes7.dex */
    public class C0368e implements AbstractC11989i {

        /* renamed from: a */
        final /* synthetic */ C13434e f25779a;

        C0368e(C13434e eVar) {
            this.f25779a = eVar;
        }

        @Override // p292q3.AbstractC11989i
        /* renamed from: a */
        public void mo8059a(OutputStream outputStream) {
            InputStream z = this.f25779a.m3696z();
            C13740j.m2834g(z);
            C11538e.this.f25761c.m257a(z, outputStream);
        }
    }

    public C11538e(AbstractC12384h hVar, AbstractC14537h hVar2, C14540k kVar, Executor executor, Executor executor2, AbstractC11557o oVar) {
        this.f25759a = hVar;
        this.f25760b = hVar2;
        this.f25761c = kVar;
        this.f25762d = executor;
        this.f25763e = executor2;
        this.f25765g = oVar;
    }

    /* renamed from: i */
    private boolean m9425i(CacheKey cacheKey) {
        C13434e c = this.f25764f.m9332c(cacheKey);
        if (c != null) {
            c.close();
            C13925a.m2274x(f25758h, "Found image for %s in staging area", cacheKey.mo256a());
            this.f25765g.mo9343g(cacheKey);
            return true;
        }
        C13925a.m2274x(f25758h, "Did not find image for %s in staging area", cacheKey.mo256a());
        this.f25765g.mo9338l(cacheKey);
        try {
            return this.f25759a.mo6997g(cacheKey);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: m */
    private C3373f<C13434e> m9421m(CacheKey cacheKey, C13434e eVar) {
        C13925a.m2274x(f25758h, "Found image for %s in staging area", cacheKey.mo256a());
        this.f25765g.mo9343g(cacheKey);
        return C3373f.m34574h(eVar);
    }

    /* renamed from: o */
    private C3373f<C13434e> m9419o(CacheKey cacheKey, AtomicBoolean atomicBoolean) {
        try {
            return C3373f.m34580b(new CallableC11539a(C13749a.m2817d("BufferedDiskCache_getAsync"), atomicBoolean, cacheKey), this.f25762d);
        } catch (Exception e) {
            C13925a.m2305G(f25758h, e, "Failed to schedule disk-cache read for %s", cacheKey.mo256a());
            return C3373f.m34575g(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public AbstractC14535g m9417q(CacheKey cacheKey) {
        try {
            Class<?> cls = f25758h;
            C13925a.m2274x(cls, "Disk cache read for %s", cacheKey.mo256a());
            AbstractC11526a d = this.f25759a.mo7000d(cacheKey);
            if (d == null) {
                C13925a.m2274x(cls, "Disk cache miss for %s", cacheKey.mo256a());
                this.f25765g.mo9347c(cacheKey);
                return null;
            }
            C13925a.m2274x(cls, "Found entry in disk cache for %s", cacheKey.mo256a());
            this.f25765g.mo9340j(cacheKey);
            InputStream a = d.mo9455a();
            AbstractC14535g b = this.f25760b.mo262b(a, (int) d.size());
            a.close();
            C13925a.m2274x(cls, "Successful read from disk cache for %s", cacheKey.mo256a());
            return b;
        } catch (IOException e) {
            C13925a.m2305G(f25758h, e, "Exception reading from cache for %s", cacheKey.mo256a());
            this.f25765g.mo9336n(cacheKey);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m9415s(CacheKey cacheKey, C13434e eVar) {
        Class<?> cls = f25758h;
        C13925a.m2274x(cls, "About to write to disk-cache for key %s", cacheKey.mo256a());
        try {
            this.f25759a.mo7002b(cacheKey, new C0368e(eVar));
            this.f25765g.mo9345e(cacheKey);
            C13925a.m2274x(cls, "Successful disk-cache write for key %s", cacheKey.mo256a());
        } catch (IOException e) {
            C13925a.m2305G(f25758h, e, "Failed to write to disk-cache for key %s", cacheKey.mo256a());
        }
    }

    /* renamed from: h */
    public void m9426h(CacheKey cacheKey) {
        C13740j.m2834g(cacheKey);
        this.f25759a.mo7001c(cacheKey);
    }

    /* renamed from: j */
    public C3373f<Void> m9424j() {
        this.f25764f.m9334a();
        try {
            return C3373f.m34580b(new CallableC11542d(C13749a.m2817d("BufferedDiskCache_clearAll")), this.f25763e);
        } catch (Exception e) {
            C13925a.m2305G(f25758h, e, "Failed to schedule disk-cache clear", new Object[0]);
            return C3373f.m34575g(e);
        }
    }

    /* renamed from: k */
    public boolean m9423k(CacheKey cacheKey) {
        return this.f25764f.m9333b(cacheKey) || this.f25759a.mo6999e(cacheKey);
    }

    /* renamed from: l */
    public boolean m9422l(CacheKey cacheKey) {
        if (m9423k(cacheKey)) {
            return true;
        }
        return m9425i(cacheKey);
    }

    /* renamed from: n */
    public C3373f<C13434e> m9420n(CacheKey cacheKey, AtomicBoolean atomicBoolean) {
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("BufferedDiskCache#get");
            }
            C13434e c = this.f25764f.m9332c(cacheKey);
            if (c != null) {
                return m9421m(cacheKey, c);
            }
            C3373f<C13434e> o = m9419o(cacheKey, atomicBoolean);
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
            return o;
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }

    /* renamed from: p */
    public void m9418p(CacheKey cacheKey, C13434e eVar) {
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("BufferedDiskCache#put");
            }
            C13740j.m2834g(cacheKey);
            C13740j.m2839b(Boolean.valueOf(C13434e.m3704j0(eVar)));
            this.f25764f.m9329f(cacheKey, eVar);
            C13434e g = C13434e.m3707g(eVar);
            try {
                this.f25763e.execute(new RunnableC11540b(C13749a.m2817d("BufferedDiskCache_putAsync"), cacheKey, g));
            } catch (Exception e) {
                C13925a.m2305G(f25758h, e, "Failed to schedule disk-cache write for %s", cacheKey.mo256a());
                this.f25764f.m9327h(cacheKey, eVar);
                C13434e.m3706h(g);
            }
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }

    /* renamed from: r */
    public C3373f<Void> m9416r(CacheKey cacheKey) {
        C13740j.m2834g(cacheKey);
        this.f25764f.m9328g(cacheKey);
        try {
            return C3373f.m34580b(new CallableC11541c(C13749a.m2817d("BufferedDiskCache_remove"), cacheKey), this.f25763e);
        } catch (Exception e) {
            C13925a.m2305G(f25758h, e, "Failed to schedule disk-cache remove for %s", cacheKey.mo256a());
            return C3373f.m34575g(e);
        }
    }
}
