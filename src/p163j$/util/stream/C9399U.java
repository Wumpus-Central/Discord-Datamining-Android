package p163j$.util.stream;

import p163j$.util.C0485f;
import p163j$.util.C0511g;
import p163j$.util.function.AbstractC0507w;
import p163j$.util.function.AbstractC9288K;
import p163j$.util.function.AbstractC9292O;
import p163j$.util.function.AbstractC9306d0;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;

/* renamed from: j$.util.stream.U */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9399U implements BiConsumer, IntFunction, AbstractC0507w, AbstractC9288K, AbstractC9292O, AbstractC9306d0, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f20590a;

    public /* synthetic */ C9399U(int i) {
        this.f20590a = i;
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
    }

    @Override // p163j$.util.function.AbstractC9306d0
    public final void accept(Object obj, long j) {
        ((C0511g) obj).accept(j);
    }

    @Override // p163j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f20590a) {
            case 0:
                ((C0485f) obj).m16552a((C0485f) obj2);
                return;
            default:
                ((C0511g) obj).m16510a((C0511g) obj2);
                return;
        }
    }

    @Override // p163j$.util.function.BiConsumer
    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f20590a) {
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

    @Override // p163j$.util.function.IntFunction
    public final Object apply(int i) {
        return Integer.valueOf(i);
    }

    @Override // p163j$.util.function.AbstractC9292O
    public final Object apply(long j) {
        return Long.valueOf(j);
    }

    @Override // p163j$.util.function.AbstractC0507w
    public final int applyAsInt(int i, int i2) {
        return Math.max(i, i2);
    }

    @Override // p163j$.util.function.AbstractC9288K
    public final long applyAsLong(long j, long j2) {
        switch (this.f20590a) {
            case 3:
                return Math.min(j, j2);
            case 4:
                return Math.max(j, j2);
            default:
                return j + j2;
        }
    }
}
