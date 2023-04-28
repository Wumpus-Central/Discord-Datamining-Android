package p163j$.util.function;

/* renamed from: j$.util.function.ToDoubleFunction */
/* loaded from: classes2.dex */
public interface ToDoubleFunction<T> {

    /* renamed from: j$.util.function.ToDoubleFunction$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements ToDoubleFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.ToDoubleFunction f20392a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToDoubleFunction toDoubleFunction) {
            this.f20392a = toDoubleFunction;
        }

        public static /* synthetic */ ToDoubleFunction convert(java.util.function.ToDoubleFunction toDoubleFunction) {
            if (toDoubleFunction == null) {
                return null;
            }
            return new VivifiedWrapper(toDoubleFunction);
        }

        @Override // p163j$.util.function.ToDoubleFunction
        public final /* synthetic */ double applyAsDouble(Object obj) {
            return this.f20392a.applyAsDouble(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20392a;
            }
            return this.f20392a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20392a.hashCode();
        }
    }

    double applyAsDouble(Object obj);
}
