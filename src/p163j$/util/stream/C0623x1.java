package p163j$.util.stream;

import p163j$.util.function.AbstractC0492g;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.x1 */
/* loaded from: classes2.dex */
final class C0623x1 implements AbstractC9374N1, AbstractC0531b2 {

    /* renamed from: a */
    private double f20785a;

    /* renamed from: b */
    final /* synthetic */ double f20786b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0492g f20787c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0623x1(double d, AbstractC0492g gVar) {
        this.f20786b = d;
        this.f20787c = gVar;
    }

    @Override // p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        this.f20785a = this.f20787c.applyAsDouble(this.f20785a, d);
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
        this.f20785a = this.f20786b;
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
    public final Object get() {
        return Double.valueOf(this.f20785a);
    }

    @Override // p163j$.util.stream.AbstractC9374N1
    /* renamed from: h */
    public final void mo16233h(AbstractC9374N1 n1) {
        accept(((C0623x1) n1).f20785a);
    }

    @Override // p163j$.util.stream.AbstractC0531b2
    /* renamed from: k */
    public final /* synthetic */ void mo16232k(Double d) {
        AbstractC0606t0.m16290P(this, d);
    }
}
