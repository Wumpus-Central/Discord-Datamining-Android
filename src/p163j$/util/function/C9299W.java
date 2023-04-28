package p163j$.util.function;

import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.function.W */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9299W implements AbstractC9300X {

    /* renamed from: a */
    public final /* synthetic */ LongUnaryOperator f20397a;

    private /* synthetic */ C9299W(LongUnaryOperator longUnaryOperator) {
        this.f20397a = longUnaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C9299W m16534a(LongUnaryOperator longUnaryOperator) {
        if (longUnaryOperator == null) {
            return null;
        }
        return new C9299W(longUnaryOperator);
    }

    @Override // p163j$.util.function.AbstractC9300X
    public final /* synthetic */ long applyAsLong(long j) {
        return this.f20397a.applyAsLong(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9299W) {
            obj = ((C9299W) obj).f20397a;
        }
        return this.f20397a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20397a.hashCode();
    }
}
