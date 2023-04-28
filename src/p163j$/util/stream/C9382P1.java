package p163j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p163j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.P1 */
/* loaded from: classes2.dex */
public final class C9382P1 extends AbstractC0548f {

    /* renamed from: h */
    private final AbstractC0606t0 f20543h;

    C9382P1(C9382P1 p1, Spliterator spliterator) {
        super(p1, spliterator);
        this.f20543h = p1.f20543h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9382P1(AbstractC0606t0 t0Var, AbstractC0606t0 t0Var2, Spliterator spliterator) {
        super(t0Var2, spliterator);
        this.f20543h = t0Var;
    }

    @Override // p163j$.util.stream.AbstractC0548f
    /* renamed from: a */
    protected final Object mo16305a() {
        AbstractC0606t0 t0Var = this.f20649a;
        AbstractC9374N1 I0 = this.f20543h.mo16237I0();
        t0Var.mo16294J0(this.f20650b, I0);
        return I0;
    }

    @Override // p163j$.util.stream.AbstractC0548f
    /* renamed from: d */
    protected final AbstractC0548f mo16304d(Spliterator spliterator) {
        return new C9382P1(this, spliterator);
    }

    @Override // p163j$.util.stream.AbstractC0548f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0548f fVar = this.f20652d;
        if (!(fVar == null)) {
            AbstractC9374N1 n1 = (AbstractC9374N1) ((C9382P1) fVar).mo16372b();
            n1.mo16233h((AbstractC9374N1) ((C9382P1) this.f20653e).mo16372b());
            mo16370e(n1);
        }
        super.onCompletion(countedCompleter);
    }
}
