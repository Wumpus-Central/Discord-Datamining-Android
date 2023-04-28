package p163j$.util.function;

import java.util.function.DoubleToLongFunction;

/* renamed from: j$.util.function.p */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0501p implements AbstractC0502q {

    /* renamed from: a */
    public final /* synthetic */ DoubleToLongFunction f20417a;

    private /* synthetic */ C0501p(DoubleToLongFunction doubleToLongFunction) {
        this.f20417a = doubleToLongFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C0501p m16517a(DoubleToLongFunction doubleToLongFunction) {
        if (doubleToLongFunction == null) {
            return null;
        }
        return new C0501p(doubleToLongFunction);
    }

    @Override // p163j$.util.function.AbstractC0502q
    public final /* synthetic */ long applyAsLong(double d) {
        return this.f20417a.applyAsLong(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0501p) {
            obj = ((C0501p) obj).f20417a;
        }
        return this.f20417a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20417a.hashCode();
    }
}
