package p163j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.function.r */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9311r implements AbstractC0503s {

    /* renamed from: a */
    public final /* synthetic */ DoubleUnaryOperator f20418a;

    private /* synthetic */ C9311r(DoubleUnaryOperator doubleUnaryOperator) {
        this.f20418a = doubleUnaryOperator;
    }

    /* renamed from: b */
    public static /* synthetic */ C9311r m16515b(DoubleUnaryOperator doubleUnaryOperator) {
        if (doubleUnaryOperator == null) {
            return null;
        }
        return new C9311r(doubleUnaryOperator);
    }

    /* renamed from: a */
    public final /* synthetic */ double m16516a(double d) {
        return this.f20418a.applyAsDouble(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9311r) {
            obj = ((C9311r) obj).f20418a;
        }
        return this.f20418a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20418a.hashCode();
    }
}
