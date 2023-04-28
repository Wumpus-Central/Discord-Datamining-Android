package p163j$.util.function;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import p163j$.util.function.Function;
import p163j$.util.function.UnaryOperator;

/* renamed from: j$.util.function.h0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9310h0 implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ UnaryOperator f20413a;

    private /* synthetic */ C9310h0(UnaryOperator unaryOperator) {
        this.f20413a = unaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ UnaryOperator m16523a(UnaryOperator unaryOperator) {
        if (unaryOperator == null) {
            return null;
        }
        return unaryOperator instanceof UnaryOperator.VivifiedWrapper ? ((UnaryOperator.VivifiedWrapper) unaryOperator).f20396a : new C9310h0(unaryOperator);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return C0505u.m16514a(this.f20413a.andThen(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return this.f20413a.apply(obj);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return C0505u.m16514a(this.f20413a.compose(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UnaryOperator unaryOperator = this.f20413a;
        if (obj instanceof C9310h0) {
            obj = ((C9310h0) obj).f20413a;
        }
        return unaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20413a.hashCode();
    }
}
