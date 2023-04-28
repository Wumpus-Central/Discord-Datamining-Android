package androidx.concurrent.futures;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p120gc.AbstractFutureC7576b;

/* renamed from: androidx.concurrent.futures.a */
/* loaded from: classes.dex */
public abstract class AbstractC2104a<V> implements AbstractFutureC7576b<V> {

    /* renamed from: n */
    static final boolean f2458n = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: o */
    private static final Logger f2459o = Logger.getLogger(AbstractC2104a.class.getName());

    /* renamed from: p */
    static final AbstractC2105b f2460p;

    /* renamed from: q */
    private static final Object f2461q;

    /* renamed from: k */
    volatile Object f2462k;

    /* renamed from: l */
    volatile C2108e f2463l;

    /* renamed from: m */
    volatile C2112i f2464m;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2105b {
        private AbstractC2105b() {
        }

        /* renamed from: a */
        abstract boolean mo38972a(AbstractC2104a<?> aVar, C2108e eVar, C2108e eVar2);

        /* renamed from: b */
        abstract boolean mo38971b(AbstractC2104a<?> aVar, Object obj, Object obj2);

        /* renamed from: c */
        abstract boolean mo38970c(AbstractC2104a<?> aVar, C2112i iVar, C2112i iVar2);

        /* renamed from: d */
        abstract void mo38969d(C2112i iVar, C2112i iVar2);

        /* renamed from: e */
        abstract void mo38968e(C2112i iVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$c */
    /* loaded from: classes.dex */
    public static final class C2106c {

        /* renamed from: c */
        static final C2106c f2465c;

        /* renamed from: d */
        static final C2106c f2466d;

        /* renamed from: a */
        final boolean f2467a;

        /* renamed from: b */
        final Throwable f2468b;

        static {
            if (AbstractC2104a.f2458n) {
                f2466d = null;
                f2465c = null;
                return;
            }
            f2466d = new C2106c(false, null);
            f2465c = new C2106c(true, null);
        }

        C2106c(boolean z, Throwable th2) {
            this.f2467a = z;
            this.f2468b = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$d */
    /* loaded from: classes.dex */
    public static final class C2107d {

        /* renamed from: b */
        static final C2107d f2469b = new C2107d(new C0029a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f2470a;

        /* renamed from: androidx.concurrent.futures.a$d$a */
        /* loaded from: classes.dex */
        static class C0029a extends Throwable {
            C0029a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        C2107d(Throwable th2) {
            this.f2470a = (Throwable) AbstractC2104a.m38983e(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$e */
    /* loaded from: classes.dex */
    public static final class C2108e {

        /* renamed from: d */
        static final C2108e f2471d = new C2108e(null, null);

        /* renamed from: a */
        final Runnable f2472a;

        /* renamed from: b */
        final Executor f2473b;

        /* renamed from: c */
        C2108e f2474c;

        C2108e(Runnable runnable, Executor executor) {
            this.f2472a = runnable;
            this.f2473b = executor;
        }
    }

    /* renamed from: androidx.concurrent.futures.a$f */
    /* loaded from: classes.dex */
    private static final class C2109f extends AbstractC2105b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C2112i, Thread> f2475a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C2112i, C2112i> f2476b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractC2104a, C2112i> f2477c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractC2104a, C2108e> f2478d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractC2104a, Object> f2479e;

        C2109f(AtomicReferenceFieldUpdater<C2112i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C2112i, C2112i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC2104a, C2112i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC2104a, C2108e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC2104a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f2475a = atomicReferenceFieldUpdater;
            this.f2476b = atomicReferenceFieldUpdater2;
            this.f2477c = atomicReferenceFieldUpdater3;
            this.f2478d = atomicReferenceFieldUpdater4;
            this.f2479e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractC2104a.AbstractC2105b
        /* renamed from: a */
        boolean mo38972a(AbstractC2104a<?> aVar, C2108e eVar, C2108e eVar2) {
            return C2113b.m38965a(this.f2478d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC2104a.AbstractC2105b
        /* renamed from: b */
        boolean mo38971b(AbstractC2104a<?> aVar, Object obj, Object obj2) {
            return C2113b.m38965a(this.f2479e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractC2104a.AbstractC2105b
        /* renamed from: c */
        boolean mo38970c(AbstractC2104a<?> aVar, C2112i iVar, C2112i iVar2) {
            return C2113b.m38965a(this.f2477c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC2104a.AbstractC2105b
        /* renamed from: d */
        void mo38969d(C2112i iVar, C2112i iVar2) {
            this.f2476b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC2104a.AbstractC2105b
        /* renamed from: e */
        void mo38968e(C2112i iVar, Thread thread) {
            this.f2475a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$g */
    /* loaded from: classes.dex */
    public static final class RunnableC2110g<V> implements Runnable {

        /* renamed from: k */
        final AbstractC2104a<V> f2480k;

        /* renamed from: l */
        final AbstractFutureC7576b<? extends V> f2481l;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2480k.f2462k == this) {
                if (AbstractC2104a.f2460p.mo38971b(this.f2480k, this, AbstractC2104a.m38978j(this.f2481l))) {
                    AbstractC2104a.m38981g(this.f2480k);
                }
            }
        }
    }

    /* renamed from: androidx.concurrent.futures.a$h */
    /* loaded from: classes.dex */
    private static final class C2111h extends AbstractC2105b {
        C2111h() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractC2104a.AbstractC2105b
        /* renamed from: a */
        boolean mo38972a(AbstractC2104a<?> aVar, C2108e eVar, C2108e eVar2) {
            synchronized (aVar) {
                if (aVar.f2463l != eVar) {
                    return false;
                }
                aVar.f2463l = eVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC2104a.AbstractC2105b
        /* renamed from: b */
        boolean mo38971b(AbstractC2104a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f2462k != obj) {
                    return false;
                }
                aVar.f2462k = obj2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC2104a.AbstractC2105b
        /* renamed from: c */
        boolean mo38970c(AbstractC2104a<?> aVar, C2112i iVar, C2112i iVar2) {
            synchronized (aVar) {
                if (aVar.f2464m != iVar) {
                    return false;
                }
                aVar.f2464m = iVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC2104a.AbstractC2105b
        /* renamed from: d */
        void mo38969d(C2112i iVar, C2112i iVar2) {
            iVar.f2484b = iVar2;
        }

        @Override // androidx.concurrent.futures.AbstractC2104a.AbstractC2105b
        /* renamed from: e */
        void mo38968e(C2112i iVar, Thread thread) {
            iVar.f2483a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$i */
    /* loaded from: classes.dex */
    public static final class C2112i {

        /* renamed from: c */
        static final C2112i f2482c = new C2112i(false);

        /* renamed from: a */
        volatile Thread f2483a;

        /* renamed from: b */
        volatile C2112i f2484b;

        C2112i(boolean z) {
        }

        /* renamed from: a */
        void m38967a(C2112i iVar) {
            AbstractC2104a.f2460p.mo38969d(this, iVar);
        }

        /* renamed from: b */
        void m38966b() {
            Thread thread = this.f2483a;
            if (thread != null) {
                this.f2483a = null;
                LockSupport.unpark(thread);
            }
        }

        C2112i() {
            AbstractC2104a.f2460p.mo38968e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC2105b bVar;
        Throwable th2;
        try {
            bVar = new C2109f(AtomicReferenceFieldUpdater.newUpdater(C2112i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2112i.class, C2112i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2104a.class, C2112i.class, "m"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2104a.class, C2108e.class, "l"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2104a.class, Object.class, "k"));
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            bVar = new C2111h();
        }
        f2460p = bVar;
        if (th2 != null) {
            f2459o.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
        f2461q = new Object();
    }

    /* renamed from: b */
    private void m38986b(StringBuilder sb2) {
        try {
            Object k = m38977k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(m38973r(k));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e2.getCause());
            sb2.append("]");
        }
    }

    /* renamed from: d */
    private static CancellationException m38984d(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: e */
    static <T> T m38983e(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: f */
    private C2108e m38982f(C2108e eVar) {
        C2108e eVar2;
        do {
            eVar2 = this.f2463l;
        } while (!f2460p.mo38972a(this, eVar2, C2108e.f2471d));
        C2108e eVar3 = eVar;
        C2108e eVar4 = eVar2;
        while (eVar4 != null) {
            C2108e eVar5 = eVar4.f2474c;
            eVar4.f2474c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.concurrent.futures.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.concurrent.futures.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.concurrent.futures.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.concurrent.futures.a<V>, androidx.concurrent.futures.a] */
    /* renamed from: g */
    static void m38981g(AbstractC2104a<?> aVar) {
        C2108e eVar = null;
        while (true) {
            aVar.m38975n();
            aVar.m38985c();
            C2108e f = aVar.m38982f(eVar);
            while (f != null) {
                eVar = f.f2474c;
                Runnable runnable = f.f2472a;
                if (runnable instanceof RunnableC2110g) {
                    RunnableC2110g gVar = (RunnableC2110g) runnable;
                    aVar = gVar.f2480k;
                    if (aVar.f2462k == gVar) {
                        if (f2460p.mo38971b(aVar, gVar, m38978j(gVar.f2481l))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m38980h(runnable, f.f2473b);
                }
                f = eVar;
            }
            return;
        }
    }

    /* renamed from: h */
    private static void m38980h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f2459o;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private V m38979i(Object obj) {
        if (obj instanceof C2106c) {
            throw m38984d("Task was cancelled.", ((C2106c) obj).f2468b);
        } else if (obj instanceof C2107d) {
            throw new ExecutionException(((C2107d) obj).f2470a);
        } else if (obj == f2461q) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: j */
    static Object m38978j(AbstractFutureC7576b<?> bVar) {
        if (bVar instanceof AbstractC2104a) {
            Object obj = ((AbstractC2104a) bVar).f2462k;
            if (!(obj instanceof C2106c)) {
                return obj;
            }
            C2106c cVar = (C2106c) obj;
            if (!cVar.f2467a) {
                return obj;
            }
            if (cVar.f2468b != null) {
                return new C2106c(false, cVar.f2468b);
            }
            return C2106c.f2466d;
        }
        boolean isCancelled = bVar.isCancelled();
        if ((!f2458n) && isCancelled) {
            return C2106c.f2466d;
        }
        try {
            Object k = m38977k(bVar);
            if (k == null) {
                return f2461q;
            }
            return k;
        } catch (CancellationException e) {
            if (isCancelled) {
                return new C2106c(false, e);
            }
            return new C2107d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bVar, e));
        } catch (ExecutionException e2) {
            return new C2107d(e2.getCause());
        } catch (Throwable th2) {
            return new C2107d(th2);
        }
    }

    /* renamed from: k */
    private static <V> V m38977k(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: n */
    private void m38975n() {
        C2112i iVar;
        do {
            iVar = this.f2464m;
        } while (!f2460p.mo38970c(this, iVar, C2112i.f2482c));
        while (iVar != null) {
            iVar.m38966b();
            iVar = iVar.f2484b;
        }
    }

    /* renamed from: o */
    private void m38974o(C2112i iVar) {
        iVar.f2483a = null;
        while (true) {
            C2112i iVar2 = this.f2464m;
            if (iVar2 != C2112i.f2482c) {
                C2112i iVar3 = null;
                while (iVar2 != null) {
                    C2112i iVar4 = iVar2.f2484b;
                    if (iVar2.f2483a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f2484b = iVar4;
                        if (iVar3.f2483a == null) {
                            break;
                        }
                    } else if (!f2460p.mo38970c(this, iVar2, iVar4)) {
                        break;
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: r */
    private String m38973r(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    @Override // p120gc.AbstractFutureC7576b
    /* renamed from: a */
    public final void mo1409a(Runnable runnable, Executor executor) {
        m38983e(runnable);
        m38983e(executor);
        C2108e eVar = this.f2463l;
        if (eVar != C2108e.f2471d) {
            C2108e eVar2 = new C2108e(runnable, executor);
            do {
                eVar2.f2474c = eVar;
                if (!f2460p.mo38972a(this, eVar, eVar2)) {
                    eVar = this.f2463l;
                } else {
                    return;
                }
            } while (eVar != C2108e.f2471d);
            m38980h(runnable, executor);
        }
        m38980h(runnable, executor);
    }

    /* renamed from: c */
    protected void m38985c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        C2106c cVar;
        boolean z3;
        Object obj = this.f2462k;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !(obj instanceof RunnableC2110g)) {
            return false;
        }
        if (f2458n) {
            cVar = new C2106c(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            cVar = C2106c.f2465c;
        } else {
            cVar = C2106c.f2466d;
        }
        AbstractC2104a<V> aVar = this;
        boolean z4 = false;
        while (true) {
            if (f2460p.mo38971b(aVar, obj, cVar)) {
                if (z) {
                    aVar.m38976l();
                }
                m38981g(aVar);
                if (!(obj instanceof RunnableC2110g)) {
                    return true;
                }
                AbstractFutureC7576b<? extends V> bVar = ((RunnableC2110g) obj).f2481l;
                if (bVar instanceof AbstractC2104a) {
                    aVar = (AbstractC2104a) bVar;
                    obj = aVar.f2462k;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof RunnableC2110g)) {
                        return true;
                    }
                    z4 = true;
                } else {
                    bVar.cancel(z);
                    return true;
                }
            } else {
                obj = aVar.f2462k;
                if (!(obj instanceof RunnableC2110g)) {
                    return z4;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r19, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (java.lang.Thread.interrupted() != false) goto L_0x0075;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        r4 = r19.f2462k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r4 == null) goto L_0x005b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        if ((r5 & (!(r4 instanceof androidx.concurrent.futures.AbstractC2104a.RunnableC2110g))) == false) goto L_0x0067;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
        return m38979i(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        r4 = r11 - java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r4 >= 1000) goto L_0x004c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        m38974o(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
        m38974o(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.AbstractC2104a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2462k instanceof C2106c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj;
        boolean z;
        if (this.f2462k != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof RunnableC2110g)) & z;
    }

    /* renamed from: l */
    protected void m38976l() {
    }

    /* renamed from: m */
    protected String mo38954m() {
        Object obj = this.f2462k;
        if (obj instanceof RunnableC2110g) {
            return "setFuture=[" + m38973r(((RunnableC2110g) obj).f2481l) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo38953p(V v) {
        if (v == null) {
            v = (V) f2461q;
        }
        if (!f2460p.mo38971b(this, null, v)) {
            return false;
        }
        m38981g(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo38952q(Throwable th2) {
        if (!f2460p.mo38971b(this, null, new C2107d((Throwable) m38983e(th2)))) {
            return false;
        }
        m38981g(this);
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m38986b(sb2);
        } else {
            try {
                str = mo38954m();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                m38986b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        java.util.concurrent.locks.LockSupport.park(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (java.lang.Thread.interrupted() != false) goto L_0x004b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        r0 = r6.f2462k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r0 == null) goto L_0x003f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        if ((r4 & (!(r0 instanceof androidx.concurrent.futures.AbstractC2104a.RunnableC2110g))) == false) goto L_0x0030;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
        return m38979i(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        m38974o(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get() {
        /*
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0061
            java.lang.Object r0 = r6.f2462k
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000e
            r3 = r2
            goto L_0x000f
        L_0x000e:
            r3 = r1
        L_0x000f:
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractC2104a.RunnableC2110g
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L_0x001a
            java.lang.Object r0 = r6.m38979i(r0)
            return r0
        L_0x001a:
            androidx.concurrent.futures.a$i r0 = r6.f2464m
            androidx.concurrent.futures.a$i r3 = androidx.concurrent.futures.AbstractC2104a.C2112i.f2482c
            if (r0 == r3) goto L_0x005a
            androidx.concurrent.futures.a$i r3 = new androidx.concurrent.futures.a$i
            r3.<init>()
        L_0x0025:
            r3.m38967a(r0)
            androidx.concurrent.futures.a$b r4 = androidx.concurrent.futures.AbstractC2104a.f2460p
            boolean r0 = r4.mo38970c(r6, r0, r3)
            if (r0 == 0) goto L_0x0054
        L_0x0030:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x004b
            java.lang.Object r0 = r6.f2462k
            if (r0 == 0) goto L_0x003f
            r4 = r2
            goto L_0x0040
        L_0x003f:
            r4 = r1
        L_0x0040:
            boolean r5 = r0 instanceof androidx.concurrent.futures.AbstractC2104a.RunnableC2110g
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0030
            java.lang.Object r0 = r6.m38979i(r0)
            return r0
        L_0x004b:
            r6.m38974o(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0054:
            androidx.concurrent.futures.a$i r0 = r6.f2464m
            androidx.concurrent.futures.a$i r4 = androidx.concurrent.futures.AbstractC2104a.C2112i.f2482c
            if (r0 != r4) goto L_0x0025
        L_0x005a:
            java.lang.Object r0 = r6.f2462k
            java.lang.Object r0 = r6.m38979i(r0)
            return r0
        L_0x0061:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.AbstractC2104a.get():java.lang.Object");
    }
}
