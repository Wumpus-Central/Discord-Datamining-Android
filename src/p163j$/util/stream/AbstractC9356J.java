package p163j$.util.stream;

import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.J */
/* loaded from: classes2.dex */
abstract class AbstractC9356J implements AbstractC9337E3 {

    /* renamed from: a */
    boolean f20508a;

    /* renamed from: b */
    Object f20509b;

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
    /* renamed from: accept */
    public final void m16465k(Object obj) {
        if (!this.f20508a) {
            this.f20508a = true;
            this.f20509b = obj;
        }
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
        return this.f20508a;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void end() {
    }
}
