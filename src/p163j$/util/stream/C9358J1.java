package p163j$.util.stream;

import p163j$.util.function.AbstractC0489d;
import p163j$.util.function.AbstractC9304b0;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;
import p163j$.util.function.Supplier;

/* renamed from: j$.util.stream.J1 */
/* loaded from: classes2.dex */
final class C9358J1 extends AbstractC9378O1 implements AbstractC9374N1, AbstractC0536c2 {

    /* renamed from: b */
    final /* synthetic */ Supplier f20513b;

    /* renamed from: c */
    final /* synthetic */ AbstractC9304b0 f20514c;

    /* renamed from: d */
    final /* synthetic */ AbstractC0489d f20515d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9358J1(Supplier supplier, AbstractC9304b0 b0Var, AbstractC0489d dVar) {
        this.f20513b = supplier;
        this.f20514c = b0Var;
        this.f20515d = dVar;
    }

    @Override // p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final /* synthetic */ void accept(double d) {
        AbstractC0606t0.m16291O();
        throw null;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final void accept(int i) {
        this.f20514c.mo16406a(i, this.f20537a);
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

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        this.f20537a = this.f20513b.get();
    }

    @Override // p163j$.util.stream.AbstractC0536c2
    /* renamed from: d */
    public final /* synthetic */ void mo16334d(Integer num) {
        AbstractC0606t0.m16288R(this, num);
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final /* synthetic */ boolean mo16234e() {
        return false;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void end() {
    }

    @Override // p163j$.util.stream.AbstractC9374N1
    /* renamed from: h */
    public final void mo16233h(AbstractC9374N1 n1) {
        this.f20537a = this.f20515d.apply(this.f20537a, ((C9358J1) n1).f20537a);
    }
}
