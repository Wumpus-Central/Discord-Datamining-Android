package p163j$.util.stream;

import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.y3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9441y3 implements AbstractC0546e2 {

    /* renamed from: a */
    public final /* synthetic */ int f20794a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f20795b;

    public /* synthetic */ C9441y3(Consumer consumer, int i) {
        this.f20794a = i;
        this.f20795b = consumer;
    }

    @Override // p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final /* synthetic */ void accept(double d) {
        switch (this.f20794a) {
            case 0:
                AbstractC0606t0.m16291O();
                throw null;
            default:
                AbstractC0606t0.m16291O();
                throw null;
        }
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void accept(int i) {
        switch (this.f20794a) {
            case 0:
                AbstractC0606t0.m16284V();
                throw null;
            default:
                AbstractC0606t0.m16284V();
                throw null;
        }
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void accept(long j) {
        switch (this.f20794a) {
            case 0:
                AbstractC0606t0.m16283W();
                throw null;
            default:
                AbstractC0606t0.m16283W();
                throw null;
        }
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f20794a;
        Consumer consumer = this.f20795b;
        switch (i) {
            case 0:
                ((C9383P2) consumer).accept(obj);
                return;
            default:
                consumer.accept(obj);
                return;
        }
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f20794a) {
            case 0:
                return consumer.getClass();
            default:
                return consumer.getClass();
        }
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final /* synthetic */ void mo16235c(long j) {
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final /* synthetic */ boolean mo16234e() {
        return false;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void end() {
    }
}
