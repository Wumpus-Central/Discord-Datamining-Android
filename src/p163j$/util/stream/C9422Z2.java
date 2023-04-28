package p163j$.util.stream;

import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.Z2 */
/* loaded from: classes2.dex */
final class C9422Z2 extends AbstractC0527a3 implements Consumer {

    /* renamed from: b */
    final Object[] f20612b = new Object[128];

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f20616a;
        this.f20616a = i + 1;
        this.f20612b[i] = obj;
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }
}
