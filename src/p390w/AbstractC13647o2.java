package p390w;

import androidx.core.util.C2517g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p120gc.AbstractFutureC7576b;
import p390w.AbstractC13568a2;
import p431y.C14186f;

/* renamed from: w.o2 */
/* loaded from: classes.dex */
public abstract class AbstractC13647o2<T> implements AbstractC13568a2<T> {

    /* renamed from: b */
    private final AtomicReference<Object> f30482b;

    /* renamed from: a */
    private final Object f30481a = new Object();

    /* renamed from: c */
    private int f30483c = 0;

    /* renamed from: d */
    private boolean f30484d = false;

    /* renamed from: e */
    private final Map<AbstractC13568a2.AbstractC13569a<? super T>, RunnableC13649b<T>> f30485e = new HashMap();

    /* renamed from: f */
    private final CopyOnWriteArraySet<RunnableC13649b<T>> f30486f = new CopyOnWriteArraySet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w.o2$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC13648a {
        /* renamed from: b */
        static AbstractC13648a m3117b(Throwable th2) {
            return new C13592f(th2);
        }

        /* renamed from: a */
        public abstract Throwable mo3118a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w.o2$b */
    /* loaded from: classes.dex */
    public static final class RunnableC13649b<T> implements Runnable {

        /* renamed from: r */
        private static final Object f30487r = new Object();

        /* renamed from: k */
        private final Executor f30488k;

        /* renamed from: l */
        private final AbstractC13568a2.AbstractC13569a<? super T> f30489l;

        /* renamed from: n */
        private final AtomicReference<Object> f30491n;

        /* renamed from: m */
        private final AtomicBoolean f30490m = new AtomicBoolean(true);

        /* renamed from: o */
        private Object f30492o = f30487r;

        /* renamed from: p */
        private int f30493p = -1;

        /* renamed from: q */
        private boolean f30494q = false;

        RunnableC13649b(AtomicReference<Object> atomicReference, Executor executor, AbstractC13568a2.AbstractC13569a<? super T> aVar) {
            this.f30491n = atomicReference;
            this.f30488k = executor;
            this.f30489l = aVar;
        }

        /* renamed from: a */
        void m3116a() {
            this.f30490m.set(false);
        }

        /* renamed from: b */
        void m3115b(int i) {
            synchronized (this) {
                if (this.f30490m.get()) {
                    if (i > this.f30493p) {
                        this.f30493p = i;
                        if (!this.f30494q) {
                            this.f30494q = true;
                            try {
                                this.f30488k.execute(this);
                            } finally {
                                synchronized (this) {
                                }
                            }
                        }
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                if (!this.f30490m.get()) {
                    this.f30494q = false;
                    return;
                }
                Object obj = this.f30491n.get();
                int i = this.f30493p;
                while (true) {
                    if (!Objects.equals(this.f30492o, obj)) {
                        this.f30492o = obj;
                        if (obj instanceof AbstractC13648a) {
                            this.f30489l.onError(((AbstractC13648a) obj).mo3118a());
                        } else {
                            this.f30489l.mo3341a(obj);
                        }
                    }
                    synchronized (this) {
                        if (i == this.f30493p || !this.f30490m.get()) {
                            break;
                        }
                        obj = this.f30491n.get();
                        i = this.f30493p;
                    }
                }
                this.f30494q = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC13647o2(Object obj, boolean z) {
        if (z) {
            C2517g.m37593b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f30482b = new AtomicReference<>(AbstractC13648a.m3117b((Throwable) obj));
            return;
        }
        this.f30482b = new AtomicReference<>(obj);
    }

    /* renamed from: a */
    private void m3121a(AbstractC13568a2.AbstractC13569a<? super T> aVar) {
        RunnableC13649b<T> remove = this.f30485e.remove(aVar);
        if (remove != null) {
            remove.m3116a();
            this.f30486f.remove(remove);
        }
    }

    /* renamed from: g */
    private void m3119g(Object obj) {
        Iterator<RunnableC13649b<T>> it;
        int i;
        synchronized (this.f30481a) {
            if (!Objects.equals(this.f30482b.getAndSet(obj), obj)) {
                int i2 = this.f30483c + 1;
                this.f30483c = i2;
                if (!this.f30484d) {
                    this.f30484d = true;
                    Iterator<RunnableC13649b<T>> it2 = this.f30486f.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it2.next().m3115b(i2);
                        } else {
                            synchronized (this.f30481a) {
                                if (this.f30483c == i2) {
                                    this.f30484d = false;
                                    return;
                                } else {
                                    it = this.f30486f.iterator();
                                    i = this.f30483c;
                                }
                            }
                            it2 = it;
                            i2 = i;
                        }
                    }
                }
            }
        }
    }

    @Override // p390w.AbstractC13568a2
    /* renamed from: b */
    public void mo3078b(Executor executor, AbstractC13568a2.AbstractC13569a<? super T> aVar) {
        RunnableC13649b<T> bVar;
        synchronized (this.f30481a) {
            m3121a(aVar);
            bVar = new RunnableC13649b<>(this.f30482b, executor, aVar);
            this.f30485e.put(aVar, bVar);
            this.f30486f.add(bVar);
        }
        bVar.m3115b(0);
    }

    @Override // p390w.AbstractC13568a2
    /* renamed from: c */
    public AbstractFutureC7576b<T> mo3077c() {
        Object obj = this.f30482b.get();
        if (obj instanceof AbstractC13648a) {
            return C14186f.m1423f(((AbstractC13648a) obj).mo3118a());
        }
        return C14186f.m1421h(obj);
    }

    @Override // p390w.AbstractC13568a2
    /* renamed from: d */
    public void mo3076d(AbstractC13568a2.AbstractC13569a<? super T> aVar) {
        synchronized (this.f30481a) {
            m3121a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m3120f(T t) {
        m3119g(t);
    }
}
