package p390w;

import android.os.SystemClock;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p120gc.AbstractFutureC7576b;
import p390w.AbstractC13568a2;
import p390w.C13678u1;
import p410x.C13905a;

/* renamed from: w.u1 */
/* loaded from: classes.dex */
public final class C13678u1<T> implements AbstractC13568a2<T> {

    /* renamed from: a */
    final MutableLiveData<C13680b<T>> f30549a = new MutableLiveData<>();

    /* renamed from: b */
    private final Map<AbstractC13568a2.AbstractC13569a<? super T>, C13679a<T>> f30550b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w.u1$a */
    /* loaded from: classes.dex */
    public static final class C13679a<T> implements Observer<C13680b<T>> {

        /* renamed from: a */
        final AtomicBoolean f30551a = new AtomicBoolean(true);

        /* renamed from: b */
        final AbstractC13568a2.AbstractC13569a<? super T> f30552b;

        /* renamed from: c */
        final Executor f30553c;

        C13679a(Executor executor, AbstractC13568a2.AbstractC13569a<? super T> aVar) {
            this.f30553c = executor;
            this.f30552b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m3064d(C13680b bVar) {
            if (this.f30551a.get()) {
                if (bVar.m3062a()) {
                    this.f30552b.mo3341a((Object) bVar.m3059d());
                    return;
                }
                C2517g.m37588g(bVar.m3060c());
                this.f30552b.onError(bVar.m3060c());
            }
        }

        /* renamed from: c */
        void m3065c() {
            this.f30551a.set(false);
        }

        /* renamed from: e */
        public void mo3067a(final C13680b<T> bVar) {
            this.f30553c.execute(new Runnable() { // from class: w.t1
                @Override // java.lang.Runnable
                public final void run() {
                    C13678u1.C13679a.this.m3064d(bVar);
                }
            });
        }
    }

    /* renamed from: w.u1$b */
    /* loaded from: classes.dex */
    public static final class C13680b<T> {

        /* renamed from: a */
        private final T f30554a;

        /* renamed from: b */
        private final Throwable f30555b;

        private C13680b(T t, Throwable th2) {
            this.f30554a = t;
            this.f30555b = th2;
        }

        /* renamed from: b */
        static <T> C13680b<T> m3061b(T t) {
            return new C13680b<>(t, null);
        }

        /* renamed from: a */
        public boolean m3062a() {
            return this.f30555b == null;
        }

        /* renamed from: c */
        public Throwable m3060c() {
            return this.f30555b;
        }

        /* renamed from: d */
        public T m3059d() {
            if (m3062a()) {
                return this.f30554a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (m3062a()) {
                str = "Value: " + this.f30554a;
            } else {
                str = "Error: " + this.f30555b;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m3072i(C13679a aVar, C13679a aVar2) {
        if (aVar != null) {
            this.f30549a.mo35727n(aVar);
        }
        this.f30549a.m35820j(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m3071j(C2114c.C2115a aVar) {
        C13680b<T> f = this.f30549a.mo8408f();
        if (f == null) {
            aVar.m38958f(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (f.m3062a()) {
            aVar.m38961c(f.m3059d());
        } else {
            C2517g.m37588g(f.m3060c());
            aVar.m38958f(f.m3060c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Object m3070k(final C2114c.C2115a aVar) {
        C13905a.m2336d().execute(new Runnable() { // from class: w.s1
            @Override // java.lang.Runnable
            public final void run() {
                C13678u1.this.m3071j(aVar);
            }
        });
        return this + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m3069l(C13679a aVar) {
        this.f30549a.mo35727n(aVar);
    }

    @Override // p390w.AbstractC13568a2
    /* renamed from: b */
    public void mo3078b(Executor executor, AbstractC13568a2.AbstractC13569a<? super T> aVar) {
        synchronized (this.f30550b) {
            final C13679a<T> aVar2 = this.f30550b.get(aVar);
            if (aVar2 != null) {
                aVar2.m3065c();
            }
            final C13679a<T> aVar3 = new C13679a<>(executor, aVar);
            this.f30550b.put(aVar, aVar3);
            C13905a.m2336d().execute(new Runnable() { // from class: w.r1
                @Override // java.lang.Runnable
                public final void run() {
                    C13678u1.this.m3072i(aVar2, aVar3);
                }
            });
        }
    }

    @Override // p390w.AbstractC13568a2
    /* renamed from: c */
    public AbstractFutureC7576b<T> mo3077c() {
        return C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: w.p1
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object k;
                k = C13678u1.this.m3070k(aVar);
                return k;
            }
        });
    }

    @Override // p390w.AbstractC13568a2
    /* renamed from: d */
    public void mo3076d(AbstractC13568a2.AbstractC13569a<? super T> aVar) {
        synchronized (this.f30550b) {
            final C13679a<T> remove = this.f30550b.remove(aVar);
            if (remove != null) {
                remove.m3065c();
                C13905a.m2336d().execute(new Runnable() { // from class: w.q1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C13678u1.this.m3069l(remove);
                    }
                });
            }
        }
    }

    /* renamed from: m */
    public void m3068m(T t) {
        this.f30549a.mo35815m(C13680b.m3061b(t));
    }
}
