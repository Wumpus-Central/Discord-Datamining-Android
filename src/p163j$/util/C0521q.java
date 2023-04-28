package p163j$.util;

import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.q */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0521q implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f20441a;

    public /* synthetic */ C0521q(Consumer consumer) {
        this.f20441a = consumer;
    }

    @Override // p163j$.util.function.IntConsumer
    public final void accept(int i) {
        this.f20441a.accept(Integer.valueOf(i));
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return intConsumer.getClass();
    }
}
