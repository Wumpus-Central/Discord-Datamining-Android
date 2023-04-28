package p163j$.util.stream;

import java.util.List;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC9292O;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;
import p163j$.util.function.Supplier;

/* renamed from: j$.util.stream.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0523a implements Supplier, AbstractC9292O, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f20613a;

    /* renamed from: b */
    public final /* synthetic */ Object f20614b;

    public /* synthetic */ C0523a(int i, Object obj) {
        this.f20613a = i;
        this.f20614b = obj;
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f20613a;
        Object obj2 = this.f20614b;
        switch (i) {
            case 3:
                ((AbstractC0546e2) obj2).accept((AbstractC0546e2) obj);
                return;
            default:
                ((List) obj2).add(obj);
                return;
        }
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f20613a) {
            case 3:
                return consumer.getClass();
            default:
                return consumer.getClass();
        }
    }

    @Override // p163j$.util.function.AbstractC9292O
    public final Object apply(long j) {
        int i = C9349H0.f20499k;
        return AbstractC0606t0.m16267l0(j, (IntFunction) this.f20614b);
    }

    @Override // p163j$.util.function.Supplier
    public final Object get() {
        int i = this.f20613a;
        Object obj = this.f20614b;
        switch (i) {
            case 0:
                return (Spliterator) obj;
            default:
                return ((AbstractC0533c) obj).m16382T0();
        }
    }
}
