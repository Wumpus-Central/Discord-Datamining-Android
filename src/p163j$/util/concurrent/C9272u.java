package p163j$.util.concurrent;

import java.util.concurrent.ConcurrentMap;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.BiFunction;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.u */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9272u implements BiConsumer, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f20362a;

    /* renamed from: b */
    public final /* synthetic */ Object f20363b;

    /* renamed from: c */
    public final /* synthetic */ Object f20364c;

    public /* synthetic */ C9272u(int i, Object obj, Object obj2) {
        this.f20362a = i;
        this.f20363b = obj;
        this.f20364c = obj2;
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        ((Consumer) this.f20363b).accept(obj);
        ((Consumer) this.f20364c).accept(obj);
    }

    @Override // p163j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.f20362a;
        Object obj3 = this.f20364c;
        Object obj4 = this.f20363b;
        switch (i) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) obj4;
                BiFunction biFunction = (BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                return;
            default:
                ((BiConsumer) obj4).accept(obj, obj2);
                ((BiConsumer) obj3).accept(obj, obj2);
                return;
        }
    }

    @Override // p163j$.util.function.BiConsumer
    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f20362a) {
            case 0:
                return biConsumer.getClass();
            default:
                return biConsumer.getClass();
        }
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }
}
