package p163j$.util.function;

import java.util.function.IntUnaryOperator;

/* renamed from: j$.util.function.H */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9285H implements AbstractC9286I {

    /* renamed from: a */
    public final /* synthetic */ IntUnaryOperator f20385a;

    private /* synthetic */ C9285H(IntUnaryOperator intUnaryOperator) {
        this.f20385a = intUnaryOperator;
    }

    /* renamed from: b */
    public static /* synthetic */ C9285H m16544b(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            return null;
        }
        return new C9285H(intUnaryOperator);
    }

    /* renamed from: a */
    public final /* synthetic */ int m16545a(int i) {
        return this.f20385a.applyAsInt(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9285H) {
            obj = ((C9285H) obj).f20385a;
        }
        return this.f20385a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20385a.hashCode();
    }
}
