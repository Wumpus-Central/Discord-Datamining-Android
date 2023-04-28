package p163j$.util.stream;

import p163j$.util.function.AbstractC0489d;
import p163j$.util.function.BiConsumer;

/* renamed from: j$.util.stream.q */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0594q implements AbstractC0489d {

    /* renamed from: a */
    public final /* synthetic */ int f20726a;

    /* renamed from: b */
    public final /* synthetic */ BiConsumer f20727b;

    public /* synthetic */ C0594q(BiConsumer biConsumer, int i) {
        this.f20726a = i;
        this.f20727b = biConsumer;
    }

    @Override // p163j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.f20726a;
        BiConsumer biConsumer = this.f20727b;
        switch (i) {
            case 0:
                biConsumer.accept(obj, obj2);
                return obj;
            case 1:
                biConsumer.accept(obj, obj2);
                return obj;
            default:
                biConsumer.accept(obj, obj2);
                return obj;
        }
    }
}
