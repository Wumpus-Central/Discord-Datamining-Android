package p163j$.util.stream;

import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.O */
/* loaded from: classes2.dex */
final class C9376O extends AbstractC9380P {

    /* renamed from: b */
    final Consumer f20536b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9376O(Consumer consumer, boolean z) {
        super(z);
        this.f20536b = consumer;
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f20536b.accept(obj);
    }
}
