package p163j$.util.function;

import java.util.function.UnaryOperator;
import p163j$.util.function.UnaryOperator;

/* renamed from: j$.util.function.Function */
/* loaded from: classes2.dex */
public interface Function<T, R> {

    /* renamed from: j$.util.function.Function$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC<T, R> {
    }

    /* renamed from: j$.util.function.Function$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Function {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.Function f20384a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Function function) {
            this.f20384a = function;
        }

        public static /* synthetic */ Function convert(java.util.function.Function function) {
            if (function == null) {
                return null;
            }
            return function instanceof C0505u ? ((C0505u) function).f20422a : function instanceof UnaryOperator ? UnaryOperator.VivifiedWrapper.convert((java.util.function.UnaryOperator) function) : new VivifiedWrapper(function);
        }

        @Override // p163j$.util.function.Function
        public final /* synthetic */ Function andThen(Function function) {
            return convert(this.f20384a.andThen(C0505u.m16514a(function)));
        }

        @Override // p163j$.util.function.Function
        public final /* synthetic */ Object apply(Object obj) {
            return this.f20384a.apply(obj);
        }

        @Override // p163j$.util.function.Function
        public final /* synthetic */ Function compose(Function function) {
            return convert(this.f20384a.compose(C0505u.m16514a(function)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20384a;
            }
            return this.f20384a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20384a.hashCode();
        }
    }

    <V> Function<T, V> andThen(Function<? super R, ? extends V> function);

    R apply(T t);

    <V> Function<V, R> compose(Function<? super V, ? extends T> function);
}
