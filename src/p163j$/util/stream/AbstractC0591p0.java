package p163j$.util.stream;

import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.p0 */
/* loaded from: classes2.dex */
abstract class AbstractC0591p0 implements AbstractC0546e2 {

    /* renamed from: a */
    boolean f20724a;

    /* renamed from: b */
    boolean f20725b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0591p0(EnumC0595q0 q0Var) {
        boolean z;
        z = q0Var.f20730b;
        this.f20725b = !z;
    }

    @Override // p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public /* synthetic */ void accept(double d) {
        AbstractC0606t0.m16291O();
        throw null;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public /* synthetic */ void accept(int i) {
        AbstractC0606t0.m16284V();
        throw null;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public /* synthetic */ void accept(long j) {
        AbstractC0606t0.m16283W();
        throw null;
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final /* synthetic */ void mo16235c(long j) {
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final boolean mo16234e() {
        return this.f20724a;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void end() {
    }
}
