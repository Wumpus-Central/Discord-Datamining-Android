package p163j$.util.function;

import p163j$.util.function.Function;

/* renamed from: j$.util.function.UnaryOperator */
/* loaded from: classes2.dex */
public interface UnaryOperator<T> extends Function<T, T> {

    /* renamed from: j$.util.function.UnaryOperator$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements UnaryOperator {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.UnaryOperator f20396a;

        private /* synthetic */ VivifiedWrapper(java.util.function.UnaryOperator unaryOperator) {
            this.f20396a = unaryOperator;
        }

        public static /* synthetic */ UnaryOperator convert(java.util.function.UnaryOperator unaryOperator) {
            if (unaryOperator == null) {
                return null;
            }
            return unaryOperator instanceof C9310h0 ? ((C9310h0) unaryOperator).f20413a : new VivifiedWrapper(unaryOperator);
        }

        @Override // p163j$.util.function.Function
        public final /* synthetic */ Function andThen(Function function) {
            return Function.VivifiedWrapper.convert(this.f20396a.andThen(C0505u.m16514a(function)));
        }

        @Override // p163j$.util.function.Function
        public final /* synthetic */ Object apply(Object obj) {
            return this.f20396a.apply(obj);
        }

        @Override // p163j$.util.function.Function
        public final /* synthetic */ Function compose(Function function) {
            return Function.VivifiedWrapper.convert(this.f20396a.compose(C0505u.m16514a(function)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20396a;
            }
            return this.f20396a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20396a.hashCode();
        }
    }
}
