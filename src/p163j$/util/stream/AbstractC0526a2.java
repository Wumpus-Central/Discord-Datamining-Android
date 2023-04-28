package p163j$.util.stream;

import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.a2 */
/* loaded from: classes2.dex */
public abstract class AbstractC0526a2 implements AbstractC0546e2 {

    /* renamed from: a */
    protected final AbstractC0546e2 f20615a;

    public AbstractC0526a2(AbstractC0546e2 e2Var) {
        e2Var.getClass();
        this.f20615a = e2Var;
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

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void accept(long j) {
        AbstractC0606t0.m16283W();
        throw null;
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public boolean mo16234e() {
        return this.f20615a.mo16234e();
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public void end() {
        this.f20615a.end();
    }
}
