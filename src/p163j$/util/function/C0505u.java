package p163j$.util.function;

import java.util.function.Function;
import p163j$.util.function.Function;

/* renamed from: j$.util.function.u */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0505u implements Function {

    /* renamed from: a */
    public final /* synthetic */ Function f20422a;

    private /* synthetic */ C0505u(Function function) {
        this.f20422a = function;
    }

    /* renamed from: a */
    public static /* synthetic */ Function m16514a(Function function) {
        if (function == null) {
            return null;
        }
        return function instanceof Function.VivifiedWrapper ? ((Function.VivifiedWrapper) function).f20384a : function instanceof UnaryOperator ? C9310h0.m16523a((UnaryOperator) function) : new C0505u(function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return m16514a(this.f20422a.andThen(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return this.f20422a.apply(obj);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return m16514a(this.f20422a.compose(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Function function = this.f20422a;
        if (obj instanceof C0505u) {
            obj = ((C0505u) obj).f20422a;
        }
        return function.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20422a.hashCode();
    }
}
