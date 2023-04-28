package p163j$.util.stream;

import p163j$.util.function.AbstractC0489d;
import p163j$.util.function.AbstractC9306d0;
import p163j$.util.function.Consumer;
import p163j$.util.function.Supplier;

/* renamed from: j$.util.stream.v1 */
/* loaded from: classes2.dex */
final class C0615v1 extends AbstractC9378O1 implements AbstractC9374N1, AbstractC0541d2 {

    /* renamed from: b */
    final /* synthetic */ Supplier f20773b;

    /* renamed from: c */
    final /* synthetic */ AbstractC9306d0 f20774c;

    /* renamed from: d */
    final /* synthetic */ AbstractC0489d f20775d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0615v1(Supplier supplier, AbstractC9306d0 d0Var, AbstractC0489d dVar) {
        this.f20773b = supplier;
        this.f20774c = d0Var;
        this.f20775d = dVar;
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
    public final void accept(long j) {
        this.f20774c.accept(this.f20537a, j);
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
    /* renamed from: c */
    public final void mo16235c(long j) {
        this.f20537a = this.f20773b.get();
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
        this.f20537a = this.f20775d.apply(this.f20537a, ((C0615v1) n1).f20537a);
    }

    @Override // p163j$.util.stream.AbstractC0541d2
    /* renamed from: j */
    public final /* synthetic */ void mo16243j(Long l) {
        AbstractC0606t0.m16286T(this, l);
    }
}
