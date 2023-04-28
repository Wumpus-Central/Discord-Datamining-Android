package p163j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.o1 */
/* loaded from: classes2.dex */
public abstract class AbstractC0588o1 extends CountedCompleter implements AbstractC0546e2 {

    /* renamed from: a */
    protected final Spliterator f20711a;

    /* renamed from: b */
    protected final AbstractC0606t0 f20712b;

    /* renamed from: c */
    protected final long f20713c;

    /* renamed from: d */
    protected long f20714d;

    /* renamed from: e */
    protected long f20715e;

    /* renamed from: f */
    protected int f20716f;

    /* renamed from: g */
    protected int f20717g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0588o1(int i, Spliterator spliterator, AbstractC0606t0 t0Var) {
        this.f20711a = spliterator;
        this.f20712b = t0Var;
        this.f20713c = AbstractC0548f.m16369f(spliterator.estimateSize());
        this.f20714d = 0L;
        this.f20715e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0588o1(AbstractC0588o1 o1Var, Spliterator spliterator, long j, long j2, int i) {
        super(o1Var);
        this.f20711a = spliterator;
        this.f20712b = o1Var.f20712b;
        this.f20713c = o1Var.f20713c;
        this.f20714d = j;
        this.f20715e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    abstract AbstractC0588o1 mo16332a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        AbstractC0606t0.m16291O();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC0606t0.m16284V();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC0606t0.m16283W();
        throw null;
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        long j2 = this.f20715e;
        if (j <= j2) {
            int i = (int) this.f20714d;
            this.f20716f = i;
            this.f20717g = i + ((int) j2);
            return;
        }
        throw new IllegalStateException("size passed to Sink.begin exceeds array length");
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f20711a;
        AbstractC0588o1 o1Var = this;
        while (spliterator.estimateSize() > o1Var.f20713c && (trySplit = spliterator.trySplit()) != null) {
            o1Var.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            o1Var.mo16332a(trySplit, o1Var.f20714d, estimateSize).fork();
            o1Var = o1Var.mo16332a(spliterator, o1Var.f20714d + estimateSize, o1Var.f20715e - estimateSize);
        }
        o1Var.f20712b.mo16294J0(spliterator, o1Var);
        o1Var.propagateCompletion();
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final /* synthetic */ boolean mo16234e() {
        return false;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void end() {
    }
}
