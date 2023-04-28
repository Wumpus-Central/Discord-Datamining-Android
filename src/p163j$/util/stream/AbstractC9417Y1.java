package p163j$.util.stream;

import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.Y1 */
/* loaded from: classes2.dex */
public abstract class AbstractC9417Y1 implements AbstractC0536c2 {

    /* renamed from: a */
    protected final AbstractC0546e2 f20609a;

    public AbstractC9417Y1(AbstractC0546e2 e2Var) {
        e2Var.getClass();
        this.f20609a = e2Var;
    }

    @Override // p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final /* synthetic */ void accept(double d) {
        AbstractC0606t0.m16291O();
        throw null;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void accept(long j) {
        AbstractC0606t0.m16283W();
        throw null;
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16334d((Integer) obj);
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return intConsumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0536c2
    /* renamed from: d */
    public final /* synthetic */ void mo16334d(Integer num) {
        AbstractC0606t0.m16288R(this, num);
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public boolean mo16234e() {
        return this.f20609a.mo16234e();
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public void end() {
        this.f20609a.end();
    }
}
