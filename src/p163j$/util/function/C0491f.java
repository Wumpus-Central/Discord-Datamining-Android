package p163j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.util.function.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0491f implements AbstractC0492g {

    /* renamed from: a */
    public final /* synthetic */ DoubleBinaryOperator f20409a;

    private /* synthetic */ C0491f(DoubleBinaryOperator doubleBinaryOperator) {
        this.f20409a = doubleBinaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C0491f m16527a(DoubleBinaryOperator doubleBinaryOperator) {
        if (doubleBinaryOperator == null) {
            return null;
        }
        return new C0491f(doubleBinaryOperator);
    }

    @Override // p163j$.util.function.AbstractC0492g
    public final /* synthetic */ double applyAsDouble(double d, double d2) {
        return this.f20409a.applyAsDouble(d, d2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0491f) {
            obj = ((C0491f) obj).f20409a;
        }
        return this.f20409a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20409a.hashCode();
    }
}
