package p163j$.util.function;

import java.util.function.IntBinaryOperator;

/* renamed from: j$.util.function.v */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0506v implements AbstractC0507w {

    /* renamed from: a */
    public final /* synthetic */ IntBinaryOperator f20423a;

    private /* synthetic */ C0506v(IntBinaryOperator intBinaryOperator) {
        this.f20423a = intBinaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C0506v m16513a(IntBinaryOperator intBinaryOperator) {
        if (intBinaryOperator == null) {
            return null;
        }
        return new C0506v(intBinaryOperator);
    }

    @Override // p163j$.util.function.AbstractC0507w
    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.f20423a.applyAsInt(i, i2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0506v) {
            obj = ((C0506v) obj).f20423a;
        }
        return this.f20423a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20423a.hashCode();
    }
}
