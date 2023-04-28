package p163j$.util.stream;

import p163j$.util.function.AbstractC0489d;
import p163j$.util.function.AbstractC9302Z;
import p163j$.util.function.Consumer;
import p163j$.util.function.Supplier;

/* renamed from: j$.util.stream.A1 */
/* loaded from: classes2.dex */
final class C9315A1 extends AbstractC9378O1 implements AbstractC9374N1, AbstractC0531b2 {

    /* renamed from: b */
    final /* synthetic */ Supplier f20443b;

    /* renamed from: c */
    final /* synthetic */ AbstractC9302Z f20444c;

    /* renamed from: d */
    final /* synthetic */ AbstractC0489d f20445d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9315A1(Supplier supplier, AbstractC9302Z z, AbstractC0489d dVar) {
        this.f20443b = supplier;
        this.f20444c = z;
        this.f20445d = dVar;
    }

    @Override // p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        this.f20444c.accept(this.f20537a, d);
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
    /* renamed from: c */
    public final void mo16235c(long j) {
        this.f20537a = this.f20443b.get();
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
        this.f20537a = this.f20445d.apply(this.f20537a, ((C9315A1) n1).f20537a);
    }

    @Override // p163j$.util.stream.AbstractC0531b2
    /* renamed from: k */
    public final /* synthetic */ void mo16232k(Double d) {
        AbstractC0606t0.m16290P(this, d);
    }
}
