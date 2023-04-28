package p163j$.util.stream;

import p163j$.util.function.BiConsumer;
import p163j$.util.function.Consumer;
import p163j$.util.function.Supplier;

/* renamed from: j$.util.stream.F1 */
/* loaded from: classes2.dex */
final class C9340F1 extends AbstractC9378O1 implements AbstractC9374N1 {

    /* renamed from: b */
    final /* synthetic */ Supplier f20484b;

    /* renamed from: c */
    final /* synthetic */ BiConsumer f20485c;

    /* renamed from: d */
    final /* synthetic */ BiConsumer f20486d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9340F1(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f20484b = supplier;
        this.f20485c = biConsumer;
        this.f20486d = biConsumer2;
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
    public final void accept(Object obj) {
        this.f20485c.accept(this.f20537a, obj);
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        this.f20537a = this.f20484b.get();
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
        this.f20486d.accept(this.f20537a, ((C9340F1) n1).f20537a);
    }
}
