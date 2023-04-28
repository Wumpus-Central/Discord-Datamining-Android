package p163j$.util.stream;

import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.X1 */
/* loaded from: classes2.dex */
public abstract class AbstractC9413X1 implements AbstractC0531b2 {

    /* renamed from: a */
    protected final AbstractC0546e2 f20605a;

    public AbstractC9413X1(AbstractC0546e2 e2Var) {
        e2Var.getClass();
        this.f20605a = e2Var;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void accept(int i) {
        AbstractC0606t0.m16284V();
        throw null;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void accept(long j) {
        AbstractC0606t0.m16283W();
        throw null;
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16232k((Double) obj);
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public boolean mo16234e() {
        return this.f20605a.mo16234e();
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public void end() {
        this.f20605a.end();
    }

    @Override // p163j$.util.stream.AbstractC0531b2
    /* renamed from: k */
    public final /* synthetic */ void mo16232k(Double d) {
        AbstractC0606t0.m16290P(this, d);
    }
}
