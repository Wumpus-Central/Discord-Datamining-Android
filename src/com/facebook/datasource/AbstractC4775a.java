package com.facebook.datasource;

import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.datasource.a */
/* loaded from: classes7.dex */
public abstract class AbstractC4775a<T> implements DataSource<T> {

    /* renamed from: a */
    private Map<String, Object> f7585a;

    /* renamed from: d */
    private T f7588d = null;

    /* renamed from: e */
    private Throwable f7589e = null;

    /* renamed from: f */
    private float f7590f = 0.0f;

    /* renamed from: c */
    private boolean f7587c = false;

    /* renamed from: b */
    private EnumC4778d f7586b = EnumC4778d.IN_PROGRESS;

    /* renamed from: g */
    private final ConcurrentLinkedQueue<Pair<AbstractC4782d<T>, Executor>> f7591g = new ConcurrentLinkedQueue<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.datasource.a$a */
    /* loaded from: classes7.dex */
    public class RunnableC0110a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ boolean f7592k;

        /* renamed from: l */
        final /* synthetic */ AbstractC4782d f7593l;

        /* renamed from: m */
        final /* synthetic */ boolean f7594m;

        RunnableC0110a(boolean z, AbstractC4782d dVar, boolean z2) {
            this.f7592k = z;
            this.f7593l = dVar;
            this.f7594m = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7592k) {
                this.f7593l.onFailure(AbstractC4775a.this);
            } else if (this.f7594m) {
                this.f7593l.onCancellation(AbstractC4775a.this);
            } else {
                this.f7593l.onNewResult(AbstractC4775a.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.datasource.a$b */
    /* loaded from: classes7.dex */
    public class RunnableC4776b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ AbstractC4782d f7596k;

        RunnableC4776b(AbstractC4782d dVar) {
            this.f7596k = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7596k.onProgressUpdate(AbstractC4775a.this);
        }
    }

    /* renamed from: com.facebook.datasource.a$c */
    /* loaded from: classes7.dex */
    public interface AbstractC4777c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.datasource.a$d */
    /* loaded from: classes7.dex */
    public enum EnumC4778d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    /* renamed from: i */
    public static AbstractC4777c m32015i() {
        return null;
    }

    /* renamed from: m */
    private void m32011m() {
        boolean j = m32014j();
        boolean w = m32002w();
        Iterator<Pair<AbstractC4782d<T>, Executor>> it = this.f7591g.iterator();
        while (it.hasNext()) {
            Pair<AbstractC4782d<T>, Executor> next = it.next();
            m32012l((AbstractC4782d) next.first, (Executor) next.second, j, w);
        }
    }

    /* renamed from: r */
    private synchronized boolean m32007r(Throwable th2, Map<String, Object> map) {
        if (!this.f7587c && this.f7586b == EnumC4778d.IN_PROGRESS) {
            this.f7586b = EnumC4778d.FAILURE;
            this.f7589e = th2;
            this.f7585a = map;
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private synchronized boolean m32005t(float f) {
        if (!this.f7587c && this.f7586b == EnumC4778d.IN_PROGRESS) {
            if (f < this.f7590f) {
                return false;
            }
            this.f7590f = f;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002e, code lost:
        mo31325h(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0031, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
        return false;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m32003v(T r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch: all -> 0x003a
            boolean r1 = r3.f7587c     // Catch: all -> 0x0037
            if (r1 != 0) goto L_0x002b
            com.facebook.datasource.a$d r1 = r3.f7586b     // Catch: all -> 0x0037
            com.facebook.datasource.a$d r2 = com.facebook.datasource.AbstractC4775a.EnumC4778d.IN_PROGRESS     // Catch: all -> 0x0037
            if (r1 == r2) goto L_0x000d
            goto L_0x002b
        L_0x000d:
            if (r5 == 0) goto L_0x0017
            com.facebook.datasource.a$d r5 = com.facebook.datasource.AbstractC4775a.EnumC4778d.SUCCESS     // Catch: all -> 0x0037
            r3.f7586b = r5     // Catch: all -> 0x0037
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.f7590f = r5     // Catch: all -> 0x0037
        L_0x0017:
            T r5 = r3.f7588d     // Catch: all -> 0x0037
            if (r5 == r4) goto L_0x0022
            r3.f7588d = r4     // Catch: all -> 0x001f
            r4 = r5
            goto L_0x0023
        L_0x001f:
            r4 = move-exception
            r0 = r5
            goto L_0x0038
        L_0x0022:
            r4 = r0
        L_0x0023:
            monitor-exit(r3)     // Catch: all -> 0x0033
            if (r4 == 0) goto L_0x0029
            r3.mo31325h(r4)
        L_0x0029:
            r4 = 1
            return r4
        L_0x002b:
            monitor-exit(r3)     // Catch: all -> 0x0033
            if (r4 == 0) goto L_0x0031
            r3.mo31325h(r4)
        L_0x0031:
            r4 = 0
            return r4
        L_0x0033:
            r5 = move-exception
            r0 = r4
            r4 = r5
            goto L_0x0038
        L_0x0037:
            r4 = move-exception
        L_0x0038:
            monitor-exit(r3)     // Catch: all -> 0x0037
            throw r4     // Catch: all -> 0x003a
        L_0x003a:
            r4 = move-exception
            if (r0 == 0) goto L_0x0040
            r3.mo31325h(r0)
        L_0x0040:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractC4775a.m32003v(java.lang.Object, boolean):boolean");
    }

    /* renamed from: w */
    private synchronized boolean m32002w() {
        boolean z;
        if (m32013k()) {
            if (!mo32020a()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // com.facebook.datasource.DataSource
    /* renamed from: a */
    public synchronized boolean mo32020a() {
        boolean z;
        if (this.f7586b != EnumC4778d.IN_PROGRESS) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.facebook.datasource.DataSource
    /* renamed from: b */
    public synchronized boolean mo31971b() {
        boolean z;
        if (this.f7588d != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.facebook.datasource.DataSource
    /* renamed from: c */
    public synchronized Throwable mo32019c() {
        return this.f7589e;
    }

    @Override // com.facebook.datasource.DataSource
    public boolean close() {
        synchronized (this) {
            if (this.f7587c) {
                return false;
            }
            this.f7587c = true;
            T t = this.f7588d;
            this.f7588d = null;
            if (t != null) {
                mo31325h(t);
            }
            if (!mo32020a()) {
                m32011m();
            }
            synchronized (this) {
                this.f7591g.clear();
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.datasource.DataSource
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo32018d(com.facebook.datasource.AbstractC4782d<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            p394w3.C13740j.m2834g(r3)
            p394w3.C13740j.m2834g(r4)
            monitor-enter(r2)
            boolean r0 = r2.f7587c     // Catch: all -> 0x0041
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch: all -> 0x0041
            return
        L_0x000d:
            com.facebook.datasource.a$d r0 = r2.f7586b     // Catch: all -> 0x0041
            com.facebook.datasource.a$d r1 = com.facebook.datasource.AbstractC4775a.EnumC4778d.IN_PROGRESS     // Catch: all -> 0x0041
            if (r0 != r1) goto L_0x001c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.d<T>, java.util.concurrent.Executor>> r0 = r2.f7591g     // Catch: all -> 0x0041
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch: all -> 0x0041
            r0.add(r1)     // Catch: all -> 0x0041
        L_0x001c:
            boolean r0 = r2.mo31971b()     // Catch: all -> 0x0041
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.mo32020a()     // Catch: all -> 0x0041
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.m32002w()     // Catch: all -> 0x0041
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            monitor-exit(r2)     // Catch: all -> 0x0041
            if (r0 == 0) goto L_0x0040
            boolean r0 = r2.m32014j()
            boolean r1 = r2.m32002w()
            r2.m32012l(r3, r4, r0, r1)
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r2)     // Catch: all -> 0x0041
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractC4775a.mo32018d(com.facebook.datasource.d, java.util.concurrent.Executor):void");
    }

    @Override // com.facebook.datasource.DataSource
    /* renamed from: e */
    public synchronized float mo32017e() {
        return this.f7590f;
    }

    @Override // com.facebook.datasource.DataSource
    /* renamed from: f */
    public boolean mo32016f() {
        return false;
    }

    @Override // com.facebook.datasource.DataSource
    /* renamed from: g */
    public synchronized T mo31326g() {
        return this.f7588d;
    }

    @Override // com.facebook.datasource.DataSource
    public Map<String, Object> getExtras() {
        return this.f7585a;
    }

    /* renamed from: h */
    protected void mo31325h(T t) {
    }

    /* renamed from: j */
    public synchronized boolean m32014j() {
        boolean z;
        if (this.f7586b == EnumC4778d.FAILURE) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: k */
    public synchronized boolean m32013k() {
        return this.f7587c;
    }

    /* renamed from: l */
    protected void m32012l(AbstractC4782d<T> dVar, Executor executor, boolean z, boolean z2) {
        RunnableC0110a aVar = new RunnableC0110a(z, dVar, z2);
        m32015i();
        executor.execute(aVar);
    }

    /* renamed from: n */
    protected void m32010n() {
        Iterator<Pair<AbstractC4782d<T>, Executor>> it = this.f7591g.iterator();
        while (it.hasNext()) {
            Pair<AbstractC4782d<T>, Executor> next = it.next();
            ((Executor) next.second).execute(new RunnableC4776b((AbstractC4782d) next.first));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void m32009o(Map<String, Object> map) {
        this.f7585a = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo31967p(Throwable th2) {
        return m32008q(th2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public boolean m32008q(Throwable th2, Map<String, Object> map) {
        boolean r = m32007r(th2, map);
        if (r) {
            m32011m();
        }
        return r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public boolean m32006s(float f) {
        boolean t = m32005t(f);
        if (t) {
            m32010n();
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public boolean m32004u(T t, boolean z, Map<String, Object> map) {
        m32009o(map);
        boolean v = m32003v(t, z);
        if (v) {
            m32011m();
        }
        return v;
    }
}
