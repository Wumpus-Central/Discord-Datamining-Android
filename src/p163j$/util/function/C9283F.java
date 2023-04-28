package p163j$.util.function;

import java.util.function.IntToLongFunction;

/* renamed from: j$.util.function.F */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9283F implements AbstractC9284G {

    /* renamed from: a */
    public final /* synthetic */ IntToLongFunction f20383a;

    private /* synthetic */ C9283F(IntToLongFunction intToLongFunction) {
        this.f20383a = intToLongFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C9283F m16546a(IntToLongFunction intToLongFunction) {
        if (intToLongFunction == null) {
            return null;
        }
        return new C9283F(intToLongFunction);
    }

    @Override // p163j$.util.function.AbstractC9284G
    public final /* synthetic */ long applyAsLong(int i) {
        return this.f20383a.applyAsLong(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9283F) {
            obj = ((C9283F) obj).f20383a;
        }
        return this.f20383a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20383a.hashCode();
    }
}
