package p163j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
import p163j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f */
/* loaded from: classes2.dex */
public abstract class AbstractC0548f extends CountedCompleter {

    /* renamed from: g */
    static final int f20648g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a */
    protected final AbstractC0606t0 f20649a;

    /* renamed from: b */
    protected Spliterator f20650b;

    /* renamed from: c */
    protected long f20651c;

    /* renamed from: d */
    protected AbstractC0548f f20652d;

    /* renamed from: e */
    protected AbstractC0548f f20653e;

    /* renamed from: f */
    private Object f20654f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0548f(AbstractC0548f fVar, Spliterator spliterator) {
        super(fVar);
        this.f20650b = spliterator;
        this.f20649a = fVar.f20649a;
        this.f20651c = fVar.f20651c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0548f(AbstractC0606t0 t0Var, Spliterator spliterator) {
        super(null);
        this.f20649a = t0Var;
        this.f20650b = spliterator;
        this.f20651c = 0L;
    }

    /* renamed from: f */
    public static long m16369f(long j) {
        long j2 = j / f20648g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo16305a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo16372b() {
        return this.f20654f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final AbstractC0548f m16371c() {
        return (AbstractC0548f) getCompleter();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f20650b;
        long estimateSize = spliterator.estimateSize();
        long j = this.f20651c;
        if (j == 0) {
            j = m16369f(estimateSize);
            this.f20651c = j;
        }
        boolean z = false;
        AbstractC0548f fVar = this;
        while (estimateSize > j && (trySplit = spliterator.trySplit()) != null) {
            AbstractC0548f d = fVar.mo16304d(trySplit);
            fVar.f20652d = d;
            AbstractC0548f d2 = fVar.mo16304d(spliterator);
            fVar.f20653e = d2;
            fVar.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                fVar = d;
                d = d2;
            } else {
                fVar = d2;
            }
            z = !z;
            d.fork();
            estimateSize = spliterator.estimateSize();
        }
        fVar.mo16370e(fVar.mo16305a());
        fVar.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public abstract AbstractC0548f mo16304d(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo16370e(Object obj) {
        this.f20654f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f20654f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f20650b = null;
        this.f20653e = null;
        this.f20652d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
