package p163j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p163j$.util.Spliterator;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.util.stream.Q */
/* loaded from: classes2.dex */
final class C9384Q extends CountedCompleter {

    /* renamed from: h */
    public static final /* synthetic */ int f20546h = 0;

    /* renamed from: a */
    private final AbstractC0606t0 f20547a;

    /* renamed from: b */
    private Spliterator f20548b;

    /* renamed from: c */
    private final long f20549c;

    /* renamed from: d */
    private final ConcurrentHashMap f20550d;

    /* renamed from: e */
    private final AbstractC0546e2 f20551e;

    /* renamed from: f */
    private final C9384Q f20552f;

    /* renamed from: g */
    private AbstractC9324C0 f20553g;

    C9384Q(C9384Q q, Spliterator spliterator, C9384Q q2) {
        super(q);
        this.f20547a = q.f20547a;
        this.f20548b = spliterator;
        this.f20549c = q.f20549c;
        this.f20550d = q.f20550d;
        this.f20551e = q.f20551e;
        this.f20552f = q2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C9384Q(AbstractC0606t0 t0Var, Spliterator spliterator, AbstractC0546e2 e2Var) {
        super(null);
        this.f20547a = t0Var;
        this.f20548b = spliterator;
        this.f20549c = AbstractC0548f.m16369f(spliterator.estimateSize());
        this.f20550d = new ConcurrentHashMap(Math.max(16, AbstractC0548f.f20648g << 1));
        this.f20551e = e2Var;
        this.f20552f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f20548b;
        long j = this.f20549c;
        boolean z = false;
        C9384Q q = this;
        while (spliterator.estimateSize() > j && (trySplit = spliterator.trySplit()) != null) {
            C9384Q q2 = new C9384Q(q, trySplit, q.f20552f);
            C9384Q q3 = new C9384Q(q, spliterator, q2);
            q.addToPendingCount(1);
            q3.addToPendingCount(1);
            q.f20550d.put(q2, q3);
            if (q.f20552f != null) {
                q2.addToPendingCount(1);
                if (q.f20550d.replace(q.f20552f, q, q2)) {
                    q.addToPendingCount(-1);
                } else {
                    q2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = trySplit;
                q = q2;
                q2 = q3;
            } else {
                q = q3;
            }
            z = !z;
            q2.fork();
        }
        if (q.getPendingCount() > 0) {
            C0528b bVar = new C0528b(14);
            AbstractC0606t0 t0Var = q.f20547a;
            AbstractC0622x0 G0 = t0Var.mo16296G0(t0Var.mo16257v0(spliterator), bVar);
            q.f20547a.mo16294J0(spliterator, G0);
            q.f20553g = G0.mo42182build();
            q.f20548b = null;
        }
        q.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC9324C0 c0 = this.f20553g;
        if (c0 != null) {
            c0.forEach(this.f20551e);
            this.f20553g = null;
        } else {
            Spliterator spliterator = this.f20548b;
            if (spliterator != null) {
                this.f20547a.mo16294J0(spliterator, this.f20551e);
                this.f20548b = null;
            }
        }
        C9384Q q = (C9384Q) this.f20550d.remove(this);
        if (q != null) {
            q.tryComplete();
        }
    }
}
