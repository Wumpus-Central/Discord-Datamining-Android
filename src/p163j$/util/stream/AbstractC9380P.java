package p163j$.util.stream;

import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.P */
/* loaded from: classes2.dex */
abstract class AbstractC9380P implements AbstractC9332D3, AbstractC9337E3 {

    /* renamed from: a */
    private final boolean f20540a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9380P(boolean z) {
        this.f20540a = z;
    }

    @Override // p163j$.util.stream.AbstractC9332D3
    /* renamed from: N */
    public final Object mo16292N(AbstractC0606t0 t0Var, Spliterator spliterator) {
        t0Var.mo16294J0(spliterator, this);
        return null;
    }

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
    public final /* synthetic */ void mo16235c(long j) {
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final /* synthetic */ boolean mo16234e() {
        return false;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void end() {
    }

    @Override // p163j$.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // p163j$.util.stream.AbstractC9332D3
    /* renamed from: l */
    public final Object mo16268l(AbstractC0606t0 t0Var, Spliterator spliterator) {
        (this.f20540a ? new C9384Q(t0Var, spliterator, this) : new C9391S(t0Var, spliterator, t0Var.mo16293K0(this))).invoke();
        return null;
    }

    @Override // p163j$.util.stream.AbstractC9332D3
    /* renamed from: y */
    public final int mo16254y() {
        if (this.f20540a) {
            return 0;
        }
        return EnumC9394S2.f20576r;
    }
}
