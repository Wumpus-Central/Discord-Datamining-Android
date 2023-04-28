package p163j$.util.function;

/* renamed from: j$.util.function.ToIntFunction */
/* loaded from: classes2.dex */
public interface ToIntFunction<T> {

    /* renamed from: j$.util.function.ToIntFunction$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements ToIntFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.ToIntFunction f20393a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToIntFunction toIntFunction) {
            this.f20393a = toIntFunction;
        }

        public static /* synthetic */ ToIntFunction convert(java.util.function.ToIntFunction toIntFunction) {
            if (toIntFunction == null) {
                return null;
            }
            return new VivifiedWrapper(toIntFunction);
        }

        @Override // p163j$.util.function.ToIntFunction
        public final /* synthetic */ int applyAsInt(Object obj) {
            return this.f20393a.applyAsInt(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20393a;
            }
            return this.f20393a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20393a.hashCode();
        }
    }

    int applyAsInt(Object obj);
}
