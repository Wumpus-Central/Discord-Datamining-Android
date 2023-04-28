package p163j$.util.stream;

import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.e3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0547e3 implements AbstractC0536c2 {

    /* renamed from: a */
    public final /* synthetic */ int f20646a;

    /* renamed from: b */
    public final /* synthetic */ IntConsumer f20647b;

    public /* synthetic */ C0547e3(IntConsumer intConsumer, int i) {
        this.f20646a = i;
        this.f20647b = intConsumer;
    }

    @Override // p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final /* synthetic */ void accept(double d) {
        switch (this.f20646a) {
            case 0:
                AbstractC0606t0.m16291O();
                throw null;
            default:
                AbstractC0606t0.m16291O();
                throw null;
        }
    }

    @Override // p163j$.util.stream.AbstractC0536c2, p163j$.util.stream.AbstractC0546e2
    public final void accept(int i) {
        int i2 = this.f20646a;
        IntConsumer intConsumer = this.f20647b;
        switch (i2) {
            case 0:
                ((C9363K2) intConsumer).accept(i);
                return;
            default:
                intConsumer.accept(i);
                return;
        }
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void accept(long j) {
        switch (this.f20646a) {
            case 0:
                AbstractC0606t0.m16283W();
                throw null;
            default:
                AbstractC0606t0.m16283W();
                throw null;
        }
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f20646a) {
            case 0:
                mo16334d((Integer) obj);
                return;
            default:
                mo16334d((Integer) obj);
                return;
        }
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f20646a) {
            case 0:
                return consumer.getClass();
            default:
                return consumer.getClass();
        }
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f20646a) {
            case 0:
                return intConsumer.getClass();
            default:
                return intConsumer.getClass();
        }
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final /* synthetic */ void mo16235c(long j) {
    }

    @Override // p163j$.util.stream.AbstractC0536c2
    /* renamed from: d */
    public final /* synthetic */ void mo16334d(Integer num) {
        switch (this.f20646a) {
            case 0:
                AbstractC0606t0.m16288R(this, num);
                return;
            default:
                AbstractC0606t0.m16288R(this, num);
                return;
        }
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
