package p119g9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p030bc.AbstractC3465n;
import p119g9.C7565v;

/* renamed from: g9.q */
/* loaded from: classes5.dex */
public final class C7553q<T, E extends C7565v> {

    /* renamed from: a */
    private final AbstractC7516c f16356a;

    /* renamed from: b */
    private final AbstractC7545m f16357b;

    /* renamed from: c */
    private final AbstractC3465n<E> f16358c;

    /* renamed from: d */
    private final AbstractC7555b<T, E> f16359d;

    /* renamed from: e */
    private final CopyOnWriteArraySet<C7556c<T, E>> f16360e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f16361f;

    /* renamed from: g */
    private final ArrayDeque<Runnable> f16362g;

    /* renamed from: h */
    private boolean f16363h;

    /* renamed from: g9.q$a */
    /* loaded from: classes5.dex */
    public interface AbstractC7554a<T> {
        void invoke(T t);
    }

    /* renamed from: g9.q$b */
    /* loaded from: classes5.dex */
    public interface AbstractC7555b<T, E extends C7565v> {
        /* renamed from: a */
        void mo22219a(T t, E e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g9.q$c */
    /* loaded from: classes5.dex */
    public static final class C7556c<T, E extends C7565v> {

        /* renamed from: a */
        public final T f16364a;

        /* renamed from: b */
        private E f16365b;

        /* renamed from: c */
        private boolean f16366c;

        /* renamed from: d */
        private boolean f16367d;

        public C7556c(T t, AbstractC3465n<E> nVar) {
            this.f16364a = t;
            this.f16365b = nVar.get();
        }

        /* renamed from: a */
        public void m22218a(int i, AbstractC7554a<T> aVar) {
            if (!this.f16367d) {
                if (i != -1) {
                    this.f16365b.m22067a(i);
                }
                this.f16366c = true;
                aVar.invoke(this.f16364a);
            }
        }

        /* renamed from: b */
        public void m22217b(AbstractC3465n<E> nVar, AbstractC7555b<T, E> bVar) {
            if (!this.f16367d && this.f16366c) {
                E e = this.f16365b;
                this.f16365b = nVar.get();
                this.f16366c = false;
                bVar.mo22219a(this.f16364a, e);
            }
        }

        /* renamed from: c */
        public void m22216c(AbstractC7555b<T, E> bVar) {
            this.f16367d = true;
            if (this.f16366c) {
                bVar.mo22219a(this.f16364a, this.f16365b);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7556c.class != obj.getClass()) {
                return false;
            }
            return this.f16364a.equals(((C7556c) obj).f16364a);
        }

        public int hashCode() {
            return this.f16364a.hashCode();
        }
    }

    public C7553q(Looper looper, AbstractC7516c cVar, AbstractC3465n<E> nVar, AbstractC7555b<T, E> bVar) {
        this(new CopyOnWriteArraySet(), looper, cVar, nVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public boolean m22226f(Message message) {
        int i = message.what;
        if (i == 0) {
            Iterator<C7556c<T, E>> it = this.f16360e.iterator();
            while (it.hasNext()) {
                it.next().m22217b(this.f16358c, this.f16359d);
                if (this.f16357b.mo22253c(0)) {
                    break;
                }
            }
        } else if (i == 1) {
            m22220l(message.arg1, (AbstractC7554a) message.obj);
            m22222j();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m22225g(CopyOnWriteArraySet copyOnWriteArraySet, int i, AbstractC7554a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C7556c) it.next()).m22218a(i, aVar);
        }
    }

    /* renamed from: c */
    public void m22229c(T t) {
        if (!this.f16363h) {
            C7510a.m22367e(t);
            this.f16360e.add(new C7556c<>(t, this.f16358c));
        }
    }

    /* renamed from: d */
    public C7553q<T, E> m22228d(Looper looper, AbstractC7555b<T, E> bVar) {
        return new C7553q<>(this.f16360e, looper, this.f16356a, this.f16358c, bVar);
    }

    /* renamed from: e */
    public void m22227e() {
        if (!this.f16362g.isEmpty()) {
            if (!this.f16357b.mo22253c(0)) {
                this.f16357b.mo22254b(0).sendToTarget();
            }
            boolean z = !this.f16361f.isEmpty();
            this.f16361f.addAll(this.f16362g);
            this.f16362g.clear();
            if (!z) {
                while (!this.f16361f.isEmpty()) {
                    this.f16361f.peekFirst().run();
                    this.f16361f.removeFirst();
                }
            }
        }
    }

    /* renamed from: h */
    public void m22224h(int i, AbstractC7554a<T> aVar) {
        this.f16357b.mo22252d(1, i, 0, aVar).sendToTarget();
    }

    /* renamed from: i */
    public void m22223i(final int i, final AbstractC7554a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f16360e);
        this.f16362g.add(new Runnable() { // from class: g9.p
            @Override // java.lang.Runnable
            public final void run() {
                C7553q.m22225g(copyOnWriteArraySet, i, aVar);
            }
        });
    }

    /* renamed from: j */
    public void m22222j() {
        Iterator<C7556c<T, E>> it = this.f16360e.iterator();
        while (it.hasNext()) {
            it.next().m22216c(this.f16359d);
        }
        this.f16360e.clear();
        this.f16363h = true;
    }

    /* renamed from: k */
    public void m22221k(T t) {
        Iterator<C7556c<T, E>> it = this.f16360e.iterator();
        while (it.hasNext()) {
            C7556c<T, E> next = it.next();
            if (next.f16364a.equals(t)) {
                next.m22216c(this.f16359d);
                this.f16360e.remove(next);
            }
        }
    }

    /* renamed from: l */
    public void m22220l(int i, AbstractC7554a<T> aVar) {
        m22223i(i, aVar);
        m22227e();
    }

    private C7553q(CopyOnWriteArraySet<C7556c<T, E>> copyOnWriteArraySet, Looper looper, AbstractC7516c cVar, AbstractC3465n<E> nVar, AbstractC7555b<T, E> bVar) {
        this.f16356a = cVar;
        this.f16360e = copyOnWriteArraySet;
        this.f16358c = nVar;
        this.f16359d = bVar;
        this.f16361f = new ArrayDeque<>();
        this.f16362g = new ArrayDeque<>();
        this.f16357b = cVar.mo22291c(looper, new Handler.Callback() { // from class: g9.o
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean f;
                f = C7553q.this.m22226f(message);
                return f;
            }
        });
    }
}
