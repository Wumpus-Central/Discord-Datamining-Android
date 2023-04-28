package p163j$.util.function;

import java.util.function.IntConsumer;

/* renamed from: j$.util.function.y */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0509y implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ IntConsumer f20426a;

    private /* synthetic */ C0509y(IntConsumer intConsumer) {
        this.f20426a = intConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ IntConsumer m16512a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof C0510z ? ((C0510z) intConsumer).f20427a : new C0509y(intConsumer);
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        this.f20426a.accept(i);
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return m16512a(this.f20426a.andThen(C0510z.m16511a(intConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0509y) {
            obj = ((C0509y) obj).f20426a;
        }
        return this.f20426a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20426a.hashCode();
    }
}
