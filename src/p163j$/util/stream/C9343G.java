package p163j$.util.stream;

import p163j$.util.C0515k;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.G */
/* loaded from: classes2.dex */
final class C9343G extends AbstractC9356J implements AbstractC0536c2 {
    @Override // p163j$.util.stream.AbstractC9356J, p163j$.util.stream.AbstractC0546e2
    public final void accept(int i) {
        m16465k(Integer.valueOf(i));
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return intConsumer.getClass();
    }

    @Override // p163j$.util.function.Supplier
    public final Object get() {
        if (this.f20508a) {
            return C0515k.m16494d(((Integer) this.f20509b).intValue());
        }
        return null;
    }
}
