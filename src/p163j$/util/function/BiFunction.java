package p163j$.util.function;

import java.util.function.BinaryOperator;

/* renamed from: j$.util.function.BiFunction */
/* loaded from: classes2.dex */
public interface BiFunction<T, U, R> {

    /* renamed from: j$.util.function.BiFunction$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.BiFunction f20380a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.f20380a = biFunction;
        }

        public static /* synthetic */ BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return biFunction instanceof BinaryOperator ? C0488c.m16530a((BinaryOperator) biFunction) : new VivifiedWrapper(biFunction);
        }

        @Override // p163j$.util.function.BiFunction
        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return this.f20380a.apply(obj, obj2);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20380a;
            }
            return this.f20380a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20380a.hashCode();
        }
    }

    Object apply(Object obj, Object obj2);
}
