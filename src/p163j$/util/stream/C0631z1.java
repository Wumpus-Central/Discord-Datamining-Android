package p163j$.util.stream;

import p163j$.util.C0514j;
import p163j$.util.function.AbstractC0492g;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.z1 */
/* loaded from: classes2.dex */
final class C0631z1 implements AbstractC9374N1, AbstractC0531b2 {

    /* renamed from: a */
    private boolean f20796a;

    /* renamed from: b */
    private double f20797b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0492g f20798c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0631z1(AbstractC0492g gVar) {
        this.f20798c = gVar;
    }

    @Override // p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        if (this.f20796a) {
            this.f20796a = false;
        } else {
            d = this.f20798c.applyAsDouble(this.f20797b, d);
        }
        this.f20797b = d;
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
        this.f20796a = true;
        this.f20797b = 0.0d;
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
        return this.f20796a ? C0514j.m16501a() : C0514j.m16498d(this.f20797b);
    }

    @Override // p163j$.util.stream.AbstractC9374N1
    /* renamed from: h */
    public final void mo16233h(AbstractC9374N1 n1) {
        C0631z1 z1Var = (C0631z1) n1;
        if (!z1Var.f20796a) {
            accept(z1Var.f20797b);
        }
    }

    @Override // p163j$.util.stream.AbstractC0531b2
    /* renamed from: k */
    public final /* synthetic */ void mo16232k(Double d) {
        AbstractC0606t0.m16290P(this, d);
    }
}
