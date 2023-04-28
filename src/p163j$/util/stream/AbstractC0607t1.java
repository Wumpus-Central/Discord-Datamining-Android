package p163j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.t1 */
/* loaded from: classes2.dex */
abstract class AbstractC0607t1 extends CountedCompleter {

    /* renamed from: a */
    protected final AbstractC9324C0 f20759a;

    /* renamed from: b */
    protected final int f20760b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0607t1(AbstractC9324C0 c0) {
        this.f20759a = c0;
        this.f20760b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0607t1(AbstractC0607t1 t1Var, AbstractC9324C0 c0, int i) {
        super(t1Var);
        this.f20759a = c0;
        this.f20760b = i;
    }

    /* renamed from: a */
    abstract void mo16251a();

    /* renamed from: b */
    abstract C0603s1 mo16250b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC0607t1 t1Var = this;
        while (t1Var.f20759a.mo16319l() != 0) {
            t1Var.setPendingCount(t1Var.f20759a.mo16319l() - 1);
            int i = 0;
            int i2 = 0;
            while (i < t1Var.f20759a.mo16319l() - 1) {
                C0603s1 b = t1Var.mo16250b(i, t1Var.f20760b + i2);
                i2 = (int) (i2 + b.f20759a.count());
                b.fork();
                i++;
            }
            t1Var = t1Var.mo16250b(i, t1Var.f20760b + i2);
        }
        t1Var.mo16251a();
        t1Var.propagateCompletion();
    }
}
