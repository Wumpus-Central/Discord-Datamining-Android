package p163j$.util.function;

import java.util.function.BinaryOperator;

/* renamed from: j$.util.function.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0488c implements AbstractC0489d {

    /* renamed from: a */
    public final /* synthetic */ BinaryOperator f20403a;

    private /* synthetic */ C0488c(BinaryOperator binaryOperator) {
        this.f20403a = binaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C0488c m16530a(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return new C0488c(binaryOperator);
    }

    @Override // p163j$.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f20403a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0488c) {
            obj = ((C0488c) obj).f20403a;
        }
        return this.f20403a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20403a.hashCode();
    }
}
