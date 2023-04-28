package p163j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p163j$.util.Spliterator;

/* renamed from: j$.util.stream.S */
/* loaded from: classes2.dex */
final class C9391S extends CountedCompleter {

    /* renamed from: a */
    private Spliterator f20558a;

    /* renamed from: b */
    private final AbstractC0546e2 f20559b;

    /* renamed from: c */
    private final AbstractC0606t0 f20560c;

    /* renamed from: d */
    private long f20561d;

    C9391S(C9391S s, Spliterator spliterator) {
        super(s);
        this.f20558a = spliterator;
        this.f20559b = s.f20559b;
        this.f20561d = s.f20561d;
        this.f20560c = s.f20560c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9391S(AbstractC0606t0 t0Var, Spliterator spliterator, AbstractC0546e2 e2Var) {
        super(null);
        this.f20559b = e2Var;
        this.f20560c = t0Var;
        this.f20558a = spliterator;
        this.f20561d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f20558a;
        long estimateSize = spliterator.estimateSize();
        long j = this.f20561d;
        if (j == 0) {
            j = AbstractC0548f.m16369f(estimateSize);
            this.f20561d = j;
        }
        boolean d = EnumC9394S2.SHORT_CIRCUIT.m16439d(this.f20560c.mo16302A0());
        AbstractC0546e2 e2Var = this.f20559b;
        boolean z = false;
        C9391S s = this;
        while (true) {
            if (d && e2Var.mo16234e()) {
                break;
            } else if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            } else {
                s = new C9391S(s, trySplit);
                s.addToPendingCount(1);
                if (z) {
                    spliterator = trySplit;
                } else {
                    s = s;
                    s = s;
                }
                z = !z;
                s.fork();
                estimateSize = spliterator.estimateSize();
            }
        }
        s.f20560c.mo16261r0(spliterator, e2Var);
        s.f20558a = null;
        s.propagateCompletion();
    }
}
