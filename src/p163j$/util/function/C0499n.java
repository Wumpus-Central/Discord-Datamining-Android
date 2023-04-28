package p163j$.util.function;

import java.util.function.DoubleToIntFunction;

/* renamed from: j$.util.function.n */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0499n implements AbstractC0500o {

    /* renamed from: a */
    public final /* synthetic */ DoubleToIntFunction f20416a;

    private /* synthetic */ C0499n(DoubleToIntFunction doubleToIntFunction) {
        this.f20416a = doubleToIntFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ C0499n m16518b(DoubleToIntFunction doubleToIntFunction) {
        if (doubleToIntFunction == null) {
            return null;
        }
        return new C0499n(doubleToIntFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ int m16519a(double d) {
        return this.f20416a.applyAsInt(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0499n) {
            obj = ((C0499n) obj).f20416a;
        }
        return this.f20416a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20416a.hashCode();
    }
}
