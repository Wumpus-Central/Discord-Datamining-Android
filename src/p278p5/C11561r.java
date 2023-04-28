package p278p5;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p005a4.AbstractC1262c;
import p278p5.AbstractC11547i;
import p278p5.AbstractC11564s;
import p394w3.AbstractC13741k;
import p394w3.C13740j;

/* renamed from: p5.r */
/* loaded from: classes7.dex */
public class C11561r<K, V> implements AbstractC11547i<K, V>, AbstractC11564s<K, V> {

    /* renamed from: a */
    private final AbstractC11547i.AbstractC11549b<K> f25797a;

    /* renamed from: b */
    final C11546h<K, AbstractC11547i.C11548a<K, V>> f25798b;

    /* renamed from: c */
    final C11546h<K, AbstractC11547i.C11548a<K, V>> f25799c;

    /* renamed from: e */
    private final AbstractC11570x<V> f25801e;

    /* renamed from: f */
    private final AbstractC11564s.AbstractC11565a f25802f;

    /* renamed from: g */
    private final Supplier<MemoryCacheParams> f25803g;

    /* renamed from: h */
    protected MemoryCacheParams f25804h;

    /* renamed from: d */
    final Map<Bitmap, Object> f25800d = new WeakHashMap();

    /* renamed from: i */
    private long f25805i = SystemClock.uptimeMillis();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p5.r$a */
    /* loaded from: classes7.dex */
    public class C11562a implements AbstractC11570x<AbstractC11547i.C11548a<K, V>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC11570x f25806a;

        C11562a(AbstractC11570x xVar) {
            this.f25806a = xVar;
        }

        /* renamed from: b */
        public int mo9326a(AbstractC11547i.C11548a<K, V> aVar) {
            return this.f25806a.mo9326a(aVar.f25786b.m32039C());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p5.r$b */
    /* loaded from: classes7.dex */
    public class C11563b implements AbstractC1262c<V> {

        /* renamed from: a */
        final /* synthetic */ AbstractC11547i.C11548a f25808a;

        C11563b(AbstractC11547i.C11548a aVar) {
            this.f25808a = aVar;
        }

        @Override // p005a4.AbstractC1262c
        public void release(V v) {
            C11561r.this.m9360x(this.f25808a);
        }
    }

    public C11561r(AbstractC11570x<V> xVar, AbstractC11564s.AbstractC11565a aVar, Supplier<MemoryCacheParams> supplier, AbstractC11547i.AbstractC11549b<K> bVar) {
        this.f25801e = xVar;
        this.f25798b = new C11546h<>(m9358z(xVar));
        this.f25799c = new C11546h<>(m9358z(xVar));
        this.f25802f = aVar;
        this.f25803g = supplier;
        this.f25804h = (MemoryCacheParams) C13740j.m2833h(supplier.get(), "mMemoryCacheParamsSupplier returned null");
        this.f25797a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (m9373k() <= (r3.f25804h.f8116a - r4)) goto L_0x0026;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean m9376h(V r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            p5.x<V> r0 = r3.f25801e     // Catch: all -> 0x0028
            int r4 = r0.mo9326a(r4)     // Catch: all -> 0x0028
            com.facebook.imagepipeline.cache.MemoryCacheParams r0 = r3.f25804h     // Catch: all -> 0x0028
            int r0 = r0.f8120e     // Catch: all -> 0x0028
            if (r4 > r0) goto L_0x0025
            int r0 = r3.m9374j()     // Catch: all -> 0x0028
            com.facebook.imagepipeline.cache.MemoryCacheParams r1 = r3.f25804h     // Catch: all -> 0x0028
            int r1 = r1.f8117b     // Catch: all -> 0x0028
            r2 = 1
            int r1 = r1 - r2
            if (r0 > r1) goto L_0x0025
            int r0 = r3.m9373k()     // Catch: all -> 0x0028
            com.facebook.imagepipeline.cache.MemoryCacheParams r1 = r3.f25804h     // Catch: all -> 0x0028
            int r1 = r1.f8116a     // Catch: all -> 0x0028
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            monitor-exit(r3)
            return r2
        L_0x0028:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p278p5.C11561r.m9376h(java.lang.Object):boolean");
    }

    /* renamed from: i */
    private synchronized void m9375i(AbstractC11547i.C11548a<K, V> aVar) {
        boolean z;
        C13740j.m2834g(aVar);
        if (aVar.f25787c > 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2832i(z);
        aVar.f25787c--;
    }

    /* renamed from: l */
    private synchronized void m9372l(AbstractC11547i.C11548a<K, V> aVar) {
        boolean z;
        C13740j.m2834g(aVar);
        if (!aVar.f25788d) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2832i(z);
        aVar.f25787c++;
    }

    /* renamed from: m */
    private synchronized void m9371m(AbstractC11547i.C11548a<K, V> aVar) {
        boolean z;
        C13740j.m2834g(aVar);
        if (!aVar.f25788d) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2832i(z);
        aVar.f25788d = true;
    }

    /* renamed from: n */
    private synchronized void m9370n(ArrayList<AbstractC11547i.C11548a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<AbstractC11547i.C11548a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m9371m(it.next());
            }
        }
    }

    /* renamed from: o */
    private synchronized boolean m9369o(AbstractC11547i.C11548a<K, V> aVar) {
        if (aVar.f25788d || aVar.f25787c != 0) {
            return false;
        }
        this.f25798b.m9402h(aVar.f25785a, aVar);
        return true;
    }

    /* renamed from: p */
    private void m9368p(ArrayList<AbstractC11547i.C11548a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<AbstractC11547i.C11548a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                CloseableReference.m32025t(m9361w(it.next()));
            }
        }
    }

    /* renamed from: r */
    private static <K, V> void m9366r(AbstractC11547i.C11548a<K, V> aVar) {
        AbstractC11547i.AbstractC11549b<K> bVar;
        if (aVar != null && (bVar = aVar.f25789e) != null) {
            bVar.mo9398a(aVar.f25785a, true);
        }
    }

    /* renamed from: s */
    private void m9365s(ArrayList<AbstractC11547i.C11548a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<AbstractC11547i.C11548a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m9364t(it.next());
            }
        }
    }

    /* renamed from: t */
    private static <K, V> void m9364t(AbstractC11547i.C11548a<K, V> aVar) {
        AbstractC11547i.AbstractC11549b<K> bVar;
        if (aVar != null && (bVar = aVar.f25789e) != null) {
            bVar.mo9398a(aVar.f25785a, false);
        }
    }

    /* renamed from: u */
    private synchronized void m9363u() {
        if (this.f25805i + this.f25804h.f8121f <= SystemClock.uptimeMillis()) {
            this.f25805i = SystemClock.uptimeMillis();
            this.f25804h = (MemoryCacheParams) C13740j.m2833h(this.f25803g.get(), "mMemoryCacheParamsSupplier returned null");
        }
    }

    /* renamed from: v */
    private synchronized CloseableReference<V> m9362v(AbstractC11547i.C11548a<K, V> aVar) {
        m9372l(aVar);
        return CloseableReference.m32033Y(aVar.f25786b.m32039C(), new C11563b(aVar));
    }

    /* renamed from: w */
    private synchronized CloseableReference<V> m9361w(AbstractC11547i.C11548a<K, V> aVar) {
        CloseableReference<V> closeableReference;
        C13740j.m2834g(aVar);
        if (!aVar.f25788d || aVar.f25787c != 0) {
            closeableReference = null;
        } else {
            closeableReference = aVar.f25786b;
        }
        return closeableReference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m9360x(AbstractC11547i.C11548a<K, V> aVar) {
        boolean o;
        CloseableReference<V> w;
        C13740j.m2834g(aVar);
        synchronized (this) {
            m9375i(aVar);
            o = m9369o(aVar);
            w = m9361w(aVar);
        }
        CloseableReference.m32025t(w);
        if (!o) {
            aVar = null;
        }
        m9366r(aVar);
        m9363u();
        m9367q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
        throw new java.lang.IllegalStateException(java.lang.String.format("key is null, but exclusiveEntries count: %d, size: %d", java.lang.Integer.valueOf(r4.f25798b.m9407c()), java.lang.Integer.valueOf(r4.f25798b.m9404f())));
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized java.util.ArrayList<p278p5.AbstractC11547i.C11548a<K, V>> m9359y(int r5, int r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            int r5 = java.lang.Math.max(r5, r0)     // Catch: all -> 0x0074
            int r6 = java.lang.Math.max(r6, r0)     // Catch: all -> 0x0074
            p5.h<K, p5.i$a<K, V>> r1 = r4.f25798b     // Catch: all -> 0x0074
            int r1 = r1.m9407c()     // Catch: all -> 0x0074
            if (r1 > r5) goto L_0x001d
            p5.h<K, p5.i$a<K, V>> r1 = r4.f25798b     // Catch: all -> 0x0074
            int r1 = r1.m9404f()     // Catch: all -> 0x0074
            if (r1 > r6) goto L_0x001d
            monitor-exit(r4)
            r5 = 0
            return r5
        L_0x001d:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: all -> 0x0074
            r1.<init>()     // Catch: all -> 0x0074
        L_0x0022:
            p5.h<K, p5.i$a<K, V>> r2 = r4.f25798b     // Catch: all -> 0x0074
            int r2 = r2.m9407c()     // Catch: all -> 0x0074
            if (r2 > r5) goto L_0x0035
            p5.h<K, p5.i$a<K, V>> r2 = r4.f25798b     // Catch: all -> 0x0074
            int r2 = r2.m9404f()     // Catch: all -> 0x0074
            if (r2 <= r6) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            monitor-exit(r4)
            return r1
        L_0x0035:
            p5.h<K, p5.i$a<K, V>> r2 = r4.f25798b     // Catch: all -> 0x0074
            java.lang.Object r2 = r2.m9406d()     // Catch: all -> 0x0074
            if (r2 == 0) goto L_0x004c
            p5.h<K, p5.i$a<K, V>> r3 = r4.f25798b     // Catch: all -> 0x0074
            r3.m9401i(r2)     // Catch: all -> 0x0074
            p5.h<K, p5.i$a<K, V>> r3 = r4.f25799c     // Catch: all -> 0x0074
            java.lang.Object r2 = r3.m9401i(r2)     // Catch: all -> 0x0074
            r1.add(r2)     // Catch: all -> 0x0074
            goto L_0x0022
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: all -> 0x0074
            java.lang.String r6 = "key is null, but exclusiveEntries count: %d, size: %d"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: all -> 0x0074
            p5.h<K, p5.i$a<K, V>> r2 = r4.f25798b     // Catch: all -> 0x0074
            int r2 = r2.m9407c()     // Catch: all -> 0x0074
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: all -> 0x0074
            r1[r0] = r2     // Catch: all -> 0x0074
            p5.h<K, p5.i$a<K, V>> r0 = r4.f25798b     // Catch: all -> 0x0074
            int r0 = r0.m9404f()     // Catch: all -> 0x0074
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: all -> 0x0074
            r2 = 1
            r1[r2] = r0     // Catch: all -> 0x0074
            java.lang.String r6 = java.lang.String.format(r6, r1)     // Catch: all -> 0x0074
            r5.<init>(r6)     // Catch: all -> 0x0074
            throw r5     // Catch: all -> 0x0074
        L_0x0074:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p278p5.C11561r.m9359y(int, int):java.util.ArrayList");
    }

    /* renamed from: z */
    private AbstractC11570x<AbstractC11547i.C11548a<K, V>> m9358z(AbstractC11570x<V> xVar) {
        return new C11562a(xVar);
    }

    @Override // p278p5.AbstractC11564s
    /* renamed from: a */
    public void mo9356a(K k) {
        C13740j.m2834g(k);
        synchronized (this) {
            AbstractC11547i.C11548a<K, V> i = this.f25798b.m9401i(k);
            if (i != null) {
                this.f25798b.m9402h(k, i);
            }
        }
    }

    @Override // p278p5.AbstractC11564s
    /* renamed from: b */
    public CloseableReference<V> mo9355b(K k, CloseableReference<V> closeableReference) {
        return mo9378f(k, closeableReference, this.f25797a);
    }

    @Override // p278p5.AbstractC11547i
    /* renamed from: c */
    public CloseableReference<V> mo9379c(K k) {
        AbstractC11547i.C11548a<K, V> i;
        boolean z;
        CloseableReference<V> closeableReference;
        C13740j.m2834g(k);
        synchronized (this) {
            i = this.f25798b.m9401i(k);
            z = false;
            if (i != null) {
                AbstractC11547i.C11548a<K, V> i2 = this.f25799c.m9401i(k);
                C13740j.m2834g(i2);
                if (i2.f25787c == 0) {
                    z = true;
                }
                C13740j.m2832i(z);
                closeableReference = i2.f25786b;
                z = true;
            } else {
                closeableReference = null;
            }
        }
        if (z) {
            m9364t(i);
        }
        return closeableReference;
    }

    @Override // p278p5.AbstractC11564s
    public synchronized boolean contains(K k) {
        return this.f25799c.m9409a(k);
    }

    @Override // p278p5.AbstractC11564s
    /* renamed from: d */
    public synchronized boolean mo9354d(AbstractC13741k<K> kVar) {
        return !this.f25799c.m9405e(kVar).isEmpty();
    }

    @Override // p278p5.AbstractC11564s
    /* renamed from: e */
    public int mo9353e(AbstractC13741k<K> kVar) {
        ArrayList<AbstractC11547i.C11548a<K, V>> j;
        ArrayList<AbstractC11547i.C11548a<K, V>> j2;
        synchronized (this) {
            j = this.f25798b.m9400j(kVar);
            j2 = this.f25799c.m9400j(kVar);
            m9370n(j2);
        }
        m9368p(j2);
        m9365s(j);
        m9363u();
        m9367q();
        return j2.size();
    }

    @Override // p278p5.AbstractC11547i
    /* renamed from: f */
    public CloseableReference<V> mo9378f(K k, CloseableReference<V> closeableReference, AbstractC11547i.AbstractC11549b<K> bVar) {
        AbstractC11547i.C11548a<K, V> i;
        CloseableReference<V> closeableReference2;
        CloseableReference<V> closeableReference3;
        C13740j.m2834g(k);
        C13740j.m2834g(closeableReference);
        m9363u();
        synchronized (this) {
            i = this.f25798b.m9401i(k);
            AbstractC11547i.C11548a<K, V> i2 = this.f25799c.m9401i(k);
            closeableReference2 = null;
            if (i2 != null) {
                m9371m(i2);
                closeableReference3 = m9361w(i2);
            } else {
                closeableReference3 = null;
            }
            if (m9376h(closeableReference.m32039C())) {
                AbstractC11547i.C11548a<K, V> a = AbstractC11547i.C11548a.m9399a(k, closeableReference, bVar);
                this.f25799c.m9402h(k, a);
                closeableReference2 = m9362v(a);
            }
        }
        CloseableReference.m32025t(closeableReference3);
        m9364t(i);
        m9367q();
        return closeableReference2;
    }

    @Override // p278p5.AbstractC11564s
    public CloseableReference<V> get(K k) {
        AbstractC11547i.C11548a<K, V> i;
        CloseableReference<V> closeableReference;
        C13740j.m2834g(k);
        synchronized (this) {
            i = this.f25798b.m9401i(k);
            AbstractC11547i.C11548a<K, V> b = this.f25799c.m9408b(k);
            if (b != null) {
                closeableReference = m9362v(b);
            } else {
                closeableReference = null;
            }
        }
        m9364t(i);
        m9363u();
        m9367q();
        return closeableReference;
    }

    /* renamed from: j */
    public synchronized int m9374j() {
        return this.f25799c.m9407c() - this.f25798b.m9407c();
    }

    /* renamed from: k */
    public synchronized int m9373k() {
        return this.f25799c.m9404f() - this.f25798b.m9404f();
    }

    /* renamed from: q */
    public void m9367q() {
        ArrayList<AbstractC11547i.C11548a<K, V>> y;
        synchronized (this) {
            MemoryCacheParams memoryCacheParams = this.f25804h;
            int min = Math.min(memoryCacheParams.f8119d, memoryCacheParams.f8117b - m9374j());
            MemoryCacheParams memoryCacheParams2 = this.f25804h;
            y = m9359y(min, Math.min(memoryCacheParams2.f8118c, memoryCacheParams2.f8116a - m9373k()));
            m9370n(y);
        }
        m9368p(y);
        m9365s(y);
    }
}
