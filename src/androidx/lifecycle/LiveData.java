package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import p185k.C9688a;
import p203l.C10297b;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k */
    static final Object f4384k = new Object();

    /* renamed from: a */
    final Object f4385a;

    /* renamed from: b */
    private C10297b<Observer<? super T>, LiveData<T>.AbstractC3015c> f4386b;

    /* renamed from: c */
    int f4387c;

    /* renamed from: d */
    private boolean f4388d;

    /* renamed from: e */
    private volatile Object f4389e;

    /* renamed from: f */
    volatile Object f4390f;

    /* renamed from: g */
    private int f4391g;

    /* renamed from: h */
    private boolean f4392h;

    /* renamed from: i */
    private boolean f4393i;

    /* renamed from: j */
    private final Runnable f4394j;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.AbstractC3015c implements AbstractC3038j {

        /* renamed from: o */
        final LifecycleOwner f4395o;

        LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super(observer);
            this.f4395o = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC3015c
        /* renamed from: b */
        void mo35818b() {
            this.f4395o.getLifecycle().mo35842c(this);
        }

        @Override // androidx.lifecycle.AbstractC3038j
        /* renamed from: c */
        public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
            Lifecycle.State b = this.f4395o.getLifecycle().mo35843b();
            if (b == Lifecycle.State.DESTROYED) {
                LiveData.this.mo35727n(this.f4399k);
                return;
            }
            Lifecycle.State state = null;
            while (state != b) {
                m35819a(mo35816e());
                state = b;
                b = this.f4395o.getLifecycle().mo35843b();
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC3015c
        /* renamed from: d */
        boolean mo35817d(LifecycleOwner lifecycleOwner) {
            return this.f4395o == lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC3015c
        /* renamed from: e */
        boolean mo35816e() {
            return this.f4395o.getLifecycle().mo35843b().m35851a(Lifecycle.State.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: classes.dex */
    class RunnableC3013a implements Runnable {
        RunnableC3013a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f4385a) {
                obj = LiveData.this.f4390f;
                LiveData.this.f4390f = LiveData.f4384k;
            }
            LiveData.this.mo35726o(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: classes.dex */
    private class C3014b extends LiveData<T>.AbstractC3015c {
        C3014b(Observer<? super T> observer) {
            super(observer);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC3015c
        /* renamed from: e */
        boolean mo35816e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.lifecycle.LiveData$c */
    /* loaded from: classes.dex */
    public abstract class AbstractC3015c {

        /* renamed from: k */
        final Observer<? super T> f4399k;

        /* renamed from: l */
        boolean f4400l;

        /* renamed from: m */
        int f4401m = -1;

        AbstractC3015c(Observer<? super T> observer) {
            this.f4399k = observer;
        }

        /* renamed from: a */
        void m35819a(boolean z) {
            int i;
            if (z != this.f4400l) {
                this.f4400l = z;
                LiveData liveData = LiveData.this;
                if (z) {
                    i = 1;
                } else {
                    i = -1;
                }
                liveData.m35826c(i);
                if (this.f4400l) {
                    LiveData.this.m35824e(this);
                }
            }
        }

        /* renamed from: b */
        void mo35818b() {
        }

        /* renamed from: d */
        boolean mo35817d(LifecycleOwner lifecycleOwner) {
            return false;
        }

        /* renamed from: e */
        abstract boolean mo35816e();
    }

    public LiveData(T t) {
        this.f4385a = new Object();
        this.f4386b = new C10297b<>();
        this.f4387c = 0;
        this.f4390f = f4384k;
        this.f4394j = new RunnableC3013a();
        this.f4389e = t;
        this.f4391g = 0;
    }

    /* renamed from: b */
    static void m35827b(String str) {
        if (!C9688a.m15590d().mo15586b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    /* renamed from: d */
    private void m35825d(LiveData<T>.AbstractC3015c cVar) {
        if (cVar.f4400l) {
            if (!cVar.mo35816e()) {
                cVar.m35819a(false);
                return;
            }
            int i = cVar.f4401m;
            int i2 = this.f4391g;
            if (i < i2) {
                cVar.f4401m = i2;
                cVar.f4399k.mo3067a((Object) this.f4389e);
            }
        }
    }

    /* renamed from: c */
    void m35826c(int i) {
        boolean z;
        boolean z2;
        int i2 = this.f4387c;
        this.f4387c = i + i2;
        if (!this.f4388d) {
            this.f4388d = true;
            while (true) {
                try {
                    int i3 = this.f4387c;
                    if (i2 != i3) {
                        if (i2 != 0 || i3 <= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (i2 <= 0 || i3 != 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z) {
                            mo35729k();
                        } else if (z2) {
                            mo35728l();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.f4388d = false;
                }
            }
        }
    }

    /* renamed from: e */
    void m35824e(LiveData<T>.AbstractC3015c cVar) {
        if (this.f4392h) {
            this.f4393i = true;
            return;
        }
        this.f4392h = true;
        do {
            this.f4393i = false;
            if (cVar == null) {
                C10297b<Observer<? super T>, LiveData<T>.AbstractC3015c>.C10300d e = this.f4386b.m13668e();
                while (e.hasNext()) {
                    m35825d((AbstractC3015c) e.next().getValue());
                    if (this.f4393i) {
                        break;
                    }
                }
            } else {
                m35825d(cVar);
                cVar = null;
            }
        } while (this.f4393i);
        this.f4392h = false;
    }

    /* renamed from: f */
    public T mo8408f() {
        T t = (T) this.f4389e;
        if (t != f4384k) {
            return t;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m35823g() {
        return this.f4391g;
    }

    /* renamed from: h */
    public boolean m35822h() {
        return this.f4387c > 0;
    }

    /* renamed from: i */
    public void m35821i(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        m35827b("observe");
        if (lifecycleOwner.getLifecycle().mo35843b() != Lifecycle.State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
            LiveData<T>.AbstractC3015c i = this.f4386b.mo13665i(observer, lifecycleBoundObserver);
            if (i != null && !i.mo35817d(lifecycleOwner)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (i == null) {
                lifecycleOwner.getLifecycle().mo35844a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: j */
    public void m35820j(Observer<? super T> observer) {
        m35827b("observeForever");
        C3014b bVar = new C3014b(observer);
        LiveData<T>.AbstractC3015c i = this.f4386b.mo13665i(observer, bVar);
        if (i instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (i == null) {
            bVar.m35819a(true);
        }
    }

    /* renamed from: k */
    protected void mo35729k() {
    }

    /* renamed from: l */
    protected void mo35728l() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void mo35815m(T t) {
        boolean z;
        synchronized (this.f4385a) {
            if (this.f4390f == f4384k) {
                z = true;
            } else {
                z = false;
            }
            this.f4390f = t;
        }
        if (z) {
            C9688a.m15590d().mo15585c(this.f4394j);
        }
    }

    /* renamed from: n */
    public void mo35727n(Observer<? super T> observer) {
        m35827b("removeObserver");
        LiveData<T>.AbstractC3015c j = this.f4386b.mo13664j(observer);
        if (j != null) {
            j.mo35818b();
            j.m35819a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void mo35726o(T t) {
        m35827b("setValue");
        this.f4391g++;
        this.f4389e = t;
        m35824e(null);
    }

    public LiveData() {
        this.f4385a = new Object();
        this.f4386b = new C10297b<>();
        this.f4387c = 0;
        Object obj = f4384k;
        this.f4390f = obj;
        this.f4394j = new RunnableC3013a();
        this.f4389e = obj;
        this.f4391g = -1;
    }
}
