package p163j$.util.function;

import java.util.function.IntConsumer;

/* renamed from: j$.util.function.z */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0510z implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ IntConsumer f20427a;

    private /* synthetic */ C0510z(IntConsumer intConsumer) {
        this.f20427a = intConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ IntConsumer m16511a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof C0509y ? ((C0509y) intConsumer).f20426a : new C0510z(intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        this.f20427a.accept(i);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return m16511a(this.f20427a.andThen(C0509y.m16512a(intConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntConsumer intConsumer = this.f20427a;
        if (obj instanceof C0510z) {
            obj = ((C0510z) obj).f20427a;
        }
        return intConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20427a.hashCode();
    }
}
