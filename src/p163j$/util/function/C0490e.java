package p163j$.util.function;

import java.util.function.Consumer;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.function.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0490e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f20405a;

    private /* synthetic */ C0490e(Consumer consumer) {
        this.f20405a = consumer;
    }

    /* renamed from: a */
    public static /* synthetic */ Consumer m16528a(Consumer consumer) {
        if (consumer == null) {
            return null;
        }
        return consumer instanceof Consumer.VivifiedWrapper ? ((Consumer.VivifiedWrapper) consumer).f20381a : new C0490e(consumer);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        this.f20405a.accept(obj);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return m16528a(this.f20405a.andThen(Consumer.VivifiedWrapper.convert(consumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Consumer consumer = this.f20405a;
        if (obj instanceof C0490e) {
            obj = ((C0490e) obj).f20405a;
        }
        return consumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20405a.hashCode();
    }
}
