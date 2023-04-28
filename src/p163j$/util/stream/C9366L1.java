package p163j$.util.stream;

import p163j$.util.function.AbstractC9288K;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.L1 */
/* loaded from: classes2.dex */
final class C9366L1 implements AbstractC9374N1, AbstractC0541d2 {

    /* renamed from: a */
    private long f20521a;

    /* renamed from: b */
    final /* synthetic */ long f20522b;

    /* renamed from: c */
    final /* synthetic */ AbstractC9288K f20523c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9366L1(long j, AbstractC9288K k) {
        this.f20522b = j;
        this.f20523c = k;
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
        this.f20521a = this.f20523c.applyAsLong(this.f20521a, j);
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
        this.f20521a = this.f20522b;
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
        return Long.valueOf(this.f20521a);
    }

    @Override // p163j$.util.stream.AbstractC9374N1
    /* renamed from: h */
    public final void mo16233h(AbstractC9374N1 n1) {
        accept(((C9366L1) n1).f20521a);
    }

    @Override // p163j$.util.stream.AbstractC0541d2
    /* renamed from: j */
    public final /* synthetic */ void mo16243j(Long l) {
        AbstractC0606t0.m16286T(this, l);
    }
}
