package p163j$.util.function;

/* renamed from: j$.util.function.Consumer */
/* loaded from: classes2.dex */
public interface Consumer<T> {

    /* renamed from: j$.util.function.Consumer$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC<T> {
    }

    /* renamed from: j$.util.function.Consumer$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.Consumer f20381a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Consumer consumer) {
            this.f20381a = consumer;
        }

        public static /* synthetic */ Consumer convert(java.util.function.Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof C0490e ? ((C0490e) consumer).f20405a : new VivifiedWrapper(consumer);
        }

        @Override // p163j$.util.function.Consumer
        public final /* synthetic */ void accept(Object obj) {
            this.f20381a.accept(obj);
        }

        @Override // p163j$.util.function.Consumer
        public final /* synthetic */ Consumer andThen(Consumer consumer) {
            return convert(this.f20381a.andThen(C0490e.m16528a(consumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20381a;
            }
            return this.f20381a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20381a.hashCode();
        }
    }

    void accept(T t);

    Consumer<T> andThen(Consumer<? super T> consumer);
}
