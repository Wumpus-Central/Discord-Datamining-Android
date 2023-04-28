package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.Set;
import p394w3.C13740j;
import p394w3.C13742l;
import p394w3.C13747n;
import p414x3.C13925a;
import p437y5.AbstractC14227a0;
import p437y5.C14257z;
import p455z3.AbstractC14531c;
import p455z3.AbstractC14533e;

/* renamed from: com.facebook.imagepipeline.memory.b */
/* loaded from: classes7.dex */
public abstract class AbstractC4914b<V> implements AbstractC14533e<V> {

    /* renamed from: a */
    private final Class<?> f8312a;

    /* renamed from: b */
    final AbstractC14531c f8313b;

    /* renamed from: c */
    final C14257z f8314c;

    /* renamed from: d */
    final SparseArray<C4917c<V>> f8315d;

    /* renamed from: e */
    final Set<V> f8316e;

    /* renamed from: f */
    private boolean f8317f;

    /* renamed from: g */
    final C4915a f8318g;

    /* renamed from: h */
    final C4915a f8319h;

    /* renamed from: i */
    private final AbstractC14227a0 f8320i;

    /* renamed from: j */
    private boolean f8321j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.memory.b$a */
    /* loaded from: classes7.dex */
    public static class C4915a {

        /* renamed from: a */
        int f8322a;

        /* renamed from: b */
        int f8323b;

        C4915a() {
        }

        /* renamed from: a */
        public void m31306a(int i) {
            int i2;
            int i3 = this.f8323b;
            if (i3 < i || (i2 = this.f8322a) <= 0) {
                C13925a.m2298N("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f8323b), Integer.valueOf(this.f8322a));
                return;
            }
            this.f8322a = i2 - 1;
            this.f8323b = i3 - i;
        }

        /* renamed from: b */
        public void m31305b(int i) {
            this.f8322a++;
            this.f8323b += i;
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.b$b */
    /* loaded from: classes7.dex */
    public static class C0121b extends RuntimeException {
        public C0121b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.b$c */
    /* loaded from: classes7.dex */
    public static class C4916c extends RuntimeException {
        public C4916c(int i, int i2, int i3, int i4) {
            super("Pool hard cap violation? Hard cap = " + i + " Used size = " + i2 + " Free size = " + i3 + " Request size = " + i4);
        }
    }

    public AbstractC4914b(AbstractC14531c cVar, C14257z zVar, AbstractC14227a0 a0Var) {
        this.f8312a = getClass();
        this.f8313b = (AbstractC14531c) C13740j.m2834g(cVar);
        C14257z zVar2 = (C14257z) C13740j.m2834g(zVar);
        this.f8314c = zVar2;
        this.f8320i = (AbstractC14227a0) C13740j.m2834g(a0Var);
        this.f8315d = new SparseArray<>();
        if (zVar2.f32221f) {
            m31313r();
        } else {
            m31310v(new SparseIntArray(0));
        }
        this.f8316e = C13742l.m2828b();
        this.f8319h = new C4915a();
        this.f8318g = new C4915a();
    }

    /* renamed from: i */
    private synchronized void m31317i() {
        boolean z;
        if (m31311t() && this.f8319h.f8323b != 0) {
            z = false;
            C13740j.m2832i(z);
        }
        z = true;
        C13740j.m2832i(z);
    }

    /* renamed from: j */
    private void m31316j(SparseIntArray sparseIntArray) {
        this.f8315d.clear();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int keyAt = sparseIntArray.keyAt(i);
            this.f8315d.put(keyAt, new C4917c<>(mo31275p(keyAt), sparseIntArray.valueAt(i), 0, this.f8314c.f32221f));
        }
    }

    /* renamed from: m */
    private synchronized C4917c<V> m31314m(int i) {
        return this.f8315d.get(i);
    }

    /* renamed from: r */
    private synchronized void m31313r() {
        SparseIntArray sparseIntArray = this.f8314c.f32218c;
        if (sparseIntArray != null) {
            m31316j(sparseIntArray);
            this.f8317f = false;
        } else {
            this.f8317f = true;
        }
    }

    /* renamed from: v */
    private synchronized void m31310v(SparseIntArray sparseIntArray) {
        C13740j.m2834g(sparseIntArray);
        this.f8315d.clear();
        SparseIntArray sparseIntArray2 = this.f8314c.f32218c;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                this.f8315d.put(keyAt, new C4917c<>(mo31275p(keyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0), this.f8314c.f32221f));
            }
            this.f8317f = false;
        } else {
            this.f8317f = true;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    /* renamed from: w */
    private void m31309w() {
        if (C13925a.m2276v(2)) {
            C13925a.m2311A(this.f8312a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f8318g.f8322a), Integer.valueOf(this.f8318g.f8323b), Integer.valueOf(this.f8319h.f8322a), Integer.valueOf(this.f8319h.f8323b));
        }
    }

    /* renamed from: g */
    protected abstract V mo31279g(int i);

    @Override // p455z3.AbstractC14533e
    public V get(int i) {
        V v;
        V q;
        m31317i();
        int n = mo31277n(i);
        synchronized (this) {
            C4917c<V> l = m31315l(n);
            if (l == null || (q = mo31293q(l)) == null) {
                int p = mo31275p(n);
                if (m31318h(p)) {
                    this.f8318g.m31305b(p);
                    if (l != null) {
                        l.m31301e();
                    }
                    try {
                        v = mo31279g(n);
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f8318g.m31306a(p);
                            C4917c<V> l2 = m31315l(n);
                            if (l2 != null) {
                                l2.m31304b();
                            }
                            C13747n.m2821c(th2);
                            v = null;
                        }
                    }
                    synchronized (this) {
                        C13740j.m2832i(this.f8316e.add(v));
                        m31307z();
                        this.f8320i.mo1267d(p);
                        m31309w();
                        if (C13925a.m2276v(2)) {
                            C13925a.m2273y(this.f8312a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(n));
                        }
                    }
                    return v;
                }
                throw new C4916c(this.f8314c.f32216a, this.f8318g.f8323b, this.f8319h.f8323b, p);
            }
            C13740j.m2832i(this.f8316e.add(q));
            int o = mo31276o(q);
            int p2 = mo31275p(o);
            this.f8318g.m31305b(p2);
            this.f8319h.m31306a(p2);
            this.f8320i.mo1266e(p2);
            m31309w();
            if (C13925a.m2276v(2)) {
                C13925a.m2273y(this.f8312a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(q)), Integer.valueOf(o));
            }
            return q;
        }
    }

    /* renamed from: h */
    synchronized boolean m31318h(int i) {
        if (this.f8321j) {
            return true;
        }
        C14257z zVar = this.f8314c;
        int i2 = zVar.f32216a;
        int i3 = this.f8318g.f8323b;
        if (i > i2 - i3) {
            this.f8320i.mo1264g();
            return false;
        }
        int i4 = zVar.f32217b;
        if (i > i4 - (i3 + this.f8319h.f8323b)) {
            m31308y(i4 - i);
        }
        if (i <= i2 - (this.f8318g.f8323b + this.f8319h.f8323b)) {
            return true;
        }
        this.f8320i.mo1264g();
        return false;
    }

    /* renamed from: k */
    protected abstract void mo31278k(V v);

    /* renamed from: l */
    synchronized C4917c<V> m31315l(int i) {
        C4917c<V> cVar = this.f8315d.get(i);
        if (cVar == null && this.f8317f) {
            if (C13925a.m2276v(2)) {
                C13925a.m2274x(this.f8312a, "creating new bucket %s", Integer.valueOf(i));
            }
            C4917c<V> x = mo31288x(i);
            this.f8315d.put(i, x);
            return x;
        }
        return cVar;
    }

    /* renamed from: n */
    protected abstract int mo31277n(int i);

    /* renamed from: o */
    protected abstract int mo31276o(V v);

    /* renamed from: p */
    protected abstract int mo31275p(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public synchronized V mo31293q(C4917c<V> cVar) {
        return cVar.m31303c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        r2.m31304b();
     */
    @Override // p455z3.AbstractC14533e, p005a4.AbstractC1262c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void release(V r8) {
        /*
            r7 = this;
            p394w3.C13740j.m2834g(r8)
            int r0 = r7.mo31276o(r8)
            int r1 = r7.mo31275p(r0)
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.c r2 = r7.m31314m(r0)     // Catch: all -> 0x00ae
            java.util.Set<V> r3 = r7.f8316e     // Catch: all -> 0x00ae
            boolean r3 = r3.remove(r8)     // Catch: all -> 0x00ae
            r4 = 2
            if (r3 != 0) goto L_0x003d
            java.lang.Class<?> r2 = r7.f8312a     // Catch: all -> 0x00ae
            java.lang.String r3 = "release (free, value unrecognized) (object, size) = (%x, %s)"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: all -> 0x00ae
            int r5 = java.lang.System.identityHashCode(r8)     // Catch: all -> 0x00ae
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: all -> 0x00ae
            r6 = 0
            r4[r6] = r5     // Catch: all -> 0x00ae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: all -> 0x00ae
            r5 = 1
            r4[r5] = r0     // Catch: all -> 0x00ae
            p414x3.C13925a.m2290h(r2, r3, r4)     // Catch: all -> 0x00ae
            r7.mo31278k(r8)     // Catch: all -> 0x00ae
            y5.a0 r8 = r7.f8320i     // Catch: all -> 0x00ae
            r8.mo1269b(r1)     // Catch: all -> 0x00ae
            goto L_0x00a9
        L_0x003d:
            if (r2 == 0) goto L_0x007e
            boolean r3 = r2.m31300f()     // Catch: all -> 0x00ae
            if (r3 != 0) goto L_0x007e
            boolean r3 = r7.m31311t()     // Catch: all -> 0x00ae
            if (r3 != 0) goto L_0x007e
            boolean r3 = r7.mo31274u(r8)     // Catch: all -> 0x00ae
            if (r3 != 0) goto L_0x0052
            goto L_0x007e
        L_0x0052:
            r2.m31299h(r8)     // Catch: all -> 0x00ae
            com.facebook.imagepipeline.memory.b$a r2 = r7.f8319h     // Catch: all -> 0x00ae
            r2.m31305b(r1)     // Catch: all -> 0x00ae
            com.facebook.imagepipeline.memory.b$a r2 = r7.f8318g     // Catch: all -> 0x00ae
            r2.m31306a(r1)     // Catch: all -> 0x00ae
            y5.a0 r2 = r7.f8320i     // Catch: all -> 0x00ae
            r2.mo1268c(r1)     // Catch: all -> 0x00ae
            boolean r1 = p414x3.C13925a.m2276v(r4)     // Catch: all -> 0x00ae
            if (r1 == 0) goto L_0x00a9
            java.lang.Class<?> r1 = r7.f8312a     // Catch: all -> 0x00ae
            java.lang.String r2 = "release (reuse) (object, size) = (%x, %s)"
            int r8 = java.lang.System.identityHashCode(r8)     // Catch: all -> 0x00ae
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: all -> 0x00ae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: all -> 0x00ae
            p414x3.C13925a.m2273y(r1, r2, r8, r0)     // Catch: all -> 0x00ae
            goto L_0x00a9
        L_0x007e:
            if (r2 == 0) goto L_0x0083
            r2.m31304b()     // Catch: all -> 0x00ae
        L_0x0083:
            boolean r2 = p414x3.C13925a.m2276v(r4)     // Catch: all -> 0x00ae
            if (r2 == 0) goto L_0x009c
            java.lang.Class<?> r2 = r7.f8312a     // Catch: all -> 0x00ae
            java.lang.String r3 = "release (free) (object, size) = (%x, %s)"
            int r4 = java.lang.System.identityHashCode(r8)     // Catch: all -> 0x00ae
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: all -> 0x00ae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: all -> 0x00ae
            p414x3.C13925a.m2273y(r2, r3, r4, r0)     // Catch: all -> 0x00ae
        L_0x009c:
            r7.mo31278k(r8)     // Catch: all -> 0x00ae
            com.facebook.imagepipeline.memory.b$a r8 = r7.f8318g     // Catch: all -> 0x00ae
            r8.m31306a(r1)     // Catch: all -> 0x00ae
            y5.a0 r8 = r7.f8320i     // Catch: all -> 0x00ae
            r8.mo1269b(r1)     // Catch: all -> 0x00ae
        L_0x00a9:
            r7.m31309w()     // Catch: all -> 0x00ae
            monitor-exit(r7)     // Catch: all -> 0x00ae
            return
        L_0x00ae:
            r8 = move-exception
            monitor-exit(r7)     // Catch: all -> 0x00ae
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.AbstractC4914b.release(java.lang.Object):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public void m31312s() {
        this.f8313b.mo271a(this);
        this.f8320i.mo1265f(this);
    }

    /* renamed from: t */
    synchronized boolean m31311t() {
        boolean z;
        if (this.f8318g.f8323b + this.f8319h.f8323b > this.f8314c.f32217b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f8320i.mo1270a();
        }
        return z;
    }

    /* renamed from: u */
    protected boolean mo31274u(V v) {
        C13740j.m2834g(v);
        return true;
    }

    /* renamed from: x */
    C4917c<V> mo31288x(int i) {
        return new C4917c<>(mo31275p(i), ViewDefaults.NUMBER_OF_LINES, 0, this.f8314c.f32221f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    synchronized void m31308y(int i) {
        int i2 = this.f8318g.f8323b;
        int i3 = this.f8319h.f8323b;
        int min = Math.min((i2 + i3) - i, i3);
        if (min > 0) {
            if (C13925a.m2276v(2)) {
                C13925a.m2272z(this.f8312a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.f8318g.f8323b + this.f8319h.f8323b), Integer.valueOf(min));
            }
            m31309w();
            for (int i4 = 0; i4 < this.f8315d.size() && min > 0; i4++) {
                C4917c cVar = (C4917c) C13740j.m2834g(this.f8315d.valueAt(i4));
                while (min > 0) {
                    Object g = cVar.mo31267g();
                    if (g == null) {
                        break;
                    }
                    mo31278k(g);
                    int i5 = cVar.f8324a;
                    min -= i5;
                    this.f8319h.m31306a(i5);
                }
            }
            m31309w();
            if (C13925a.m2276v(2)) {
                C13925a.m2273y(this.f8312a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.f8318g.f8323b + this.f8319h.f8323b));
            }
        }
    }

    /* renamed from: z */
    synchronized void m31307z() {
        if (m31311t()) {
            m31308y(this.f8314c.f32217b);
        }
    }

    public AbstractC4914b(AbstractC14531c cVar, C14257z zVar, AbstractC14227a0 a0Var, boolean z) {
        this(cVar, zVar, a0Var);
        this.f8321j = z;
    }
}
