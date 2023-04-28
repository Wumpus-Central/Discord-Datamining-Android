package p163j$.util.function;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.function.J */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9287J implements AbstractC9288K {

    /* renamed from: a */
    public final /* synthetic */ LongBinaryOperator f20386a;

    private /* synthetic */ C9287J(LongBinaryOperator longBinaryOperator) {
        this.f20386a = longBinaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C9287J m16543a(LongBinaryOperator longBinaryOperator) {
        if (longBinaryOperator == null) {
            return null;
        }
        return new C9287J(longBinaryOperator);
    }

    @Override // p163j$.util.function.AbstractC9288K
    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.f20386a.applyAsLong(j, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9287J) {
            obj = ((C9287J) obj).f20386a;
        }
        return this.f20386a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20386a.hashCode();
    }
}
