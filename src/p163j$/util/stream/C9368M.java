package p163j$.util.stream;

import p163j$.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.M */
/* loaded from: classes2.dex */
public final class C9368M extends AbstractC9380P implements AbstractC0536c2 {

    /* renamed from: b */
    final IntConsumer f20525b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9368M(IntConsumer intConsumer, boolean z) {
        super(z);
        this.f20525b = intConsumer;
    }

    @Override // p163j$.util.stream.AbstractC9380P, p163j$.util.stream.AbstractC0546e2
    public final void accept(int i) {
        this.f20525b.accept(i);
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16334d((Integer) obj);
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return intConsumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0536c2
    /* renamed from: d */
    public final /* synthetic */ void mo16334d(Integer num) {
        AbstractC0606t0.m16288R(this, num);
    }
}
