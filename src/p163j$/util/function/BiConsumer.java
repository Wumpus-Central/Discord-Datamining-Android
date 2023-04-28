package p163j$.util.function;

/* renamed from: j$.util.function.BiConsumer */
/* loaded from: classes2.dex */
public interface BiConsumer<T, U> {

    /* renamed from: j$.util.function.BiConsumer$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC<T, U> {
    }

    /* renamed from: j$.util.function.BiConsumer$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiConsumer {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.BiConsumer f20379a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiConsumer biConsumer) {
            this.f20379a = biConsumer;
        }

        public static /* synthetic */ BiConsumer convert(java.util.function.BiConsumer biConsumer) {
            if (biConsumer == null) {
                return null;
            }
            return biConsumer instanceof C0486a ? ((C0486a) biConsumer).f20399a : new VivifiedWrapper(biConsumer);
        }

        @Override // p163j$.util.function.BiConsumer
        public final /* synthetic */ void accept(Object obj, Object obj2) {
            this.f20379a.accept(obj, obj2);
        }

        @Override // p163j$.util.function.BiConsumer
        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return convert(this.f20379a.andThen(C0486a.m16532a(biConsumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20379a;
            }
            return this.f20379a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20379a.hashCode();
        }
    }

    void accept(T t, U u);

    BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> biConsumer);
}
