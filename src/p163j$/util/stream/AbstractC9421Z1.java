package p163j$.util.stream;

import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.Z1 */
/* loaded from: classes2.dex */
public abstract class AbstractC9421Z1 implements AbstractC0541d2 {

    /* renamed from: a */
    protected final AbstractC0546e2 f20611a;

    public AbstractC9421Z1(AbstractC0546e2 e2Var) {
        e2Var.getClass();
        this.f20611a = e2Var;
    }

    @Override // p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final /* synthetic */ void accept(double d) {
        AbstractC0606t0.m16291O();
        throw null;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void accept(int i) {
        AbstractC0606t0.m16284V();
        throw null;
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16243j((Long) obj);
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public boolean mo16234e() {
        return this.f20611a.mo16234e();
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public void end() {
        this.f20611a.end();
    }

    @Override // p163j$.util.stream.AbstractC0541d2
    /* renamed from: j */
    public final /* synthetic */ void mo16243j(Long l) {
        AbstractC0606t0.m16286T(this, l);
    }
}
