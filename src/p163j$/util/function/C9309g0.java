package p163j$.util.function;

import java.util.function.Supplier;

/* renamed from: j$.util.function.g0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9309g0 implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ Supplier f20411a;

    private /* synthetic */ C9309g0(Supplier supplier) {
        this.f20411a = supplier;
    }

    /* renamed from: a */
    public static /* synthetic */ C9309g0 m16525a(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return new C9309g0(supplier);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9309g0) {
            obj = ((C9309g0) obj).f20411a;
        }
        return this.f20411a.equals(obj);
    }

    @Override // p163j$.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.f20411a.get();
    }

    public final /* synthetic */ int hashCode() {
        return this.f20411a.hashCode();
    }
}
