package p163j$.util.function;

/* renamed from: j$.util.function.ToLongFunction */
/* loaded from: classes2.dex */
public interface ToLongFunction<T> {

    /* renamed from: j$.util.function.ToLongFunction$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements ToLongFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.ToLongFunction f20394a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToLongFunction toLongFunction) {
            this.f20394a = toLongFunction;
        }

        public static /* synthetic */ ToLongFunction convert(java.util.function.ToLongFunction toLongFunction) {
            if (toLongFunction == null) {
                return null;
            }
            return new VivifiedWrapper(toLongFunction);
        }

        @Override // p163j$.util.function.ToLongFunction
        public final /* synthetic */ long applyAsLong(Object obj) {
            return this.f20394a.applyAsLong(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20394a;
            }
            return this.f20394a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20394a.hashCode();
        }
    }

    long applyAsLong(Object obj);
}
