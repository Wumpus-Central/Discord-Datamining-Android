package p163j$.util.function;

import java.util.function.BiConsumer;
import p163j$.util.function.BiConsumer;

/* renamed from: j$.util.function.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0486a implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ BiConsumer f20399a;

    private /* synthetic */ C0486a(BiConsumer biConsumer) {
        this.f20399a = biConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ BiConsumer m16532a(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return null;
        }
        return biConsumer instanceof BiConsumer.VivifiedWrapper ? ((BiConsumer.VivifiedWrapper) biConsumer).f20379a : new C0486a(biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        this.f20399a.accept(obj, obj2);
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        return m16532a(this.f20399a.andThen(BiConsumer.VivifiedWrapper.convert(biConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BiConsumer biConsumer = this.f20399a;
        if (obj instanceof C0486a) {
            obj = ((C0486a) obj).f20399a;
        }
        return biConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20399a.hashCode();
    }
}
