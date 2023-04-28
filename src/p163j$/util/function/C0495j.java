package p163j$.util.function;

import java.util.function.DoubleFunction;

/* renamed from: j$.util.function.j */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0495j implements AbstractC0496k {

    /* renamed from: a */
    public final /* synthetic */ DoubleFunction f20414a;

    private /* synthetic */ C0495j(DoubleFunction doubleFunction) {
        this.f20414a = doubleFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C0495j m16522a(DoubleFunction doubleFunction) {
        if (doubleFunction == null) {
            return null;
        }
        return new C0495j(doubleFunction);
    }

    @Override // p163j$.util.function.AbstractC0496k
    public final /* synthetic */ Object apply(double d) {
        return this.f20414a.apply(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0495j) {
            obj = ((C0495j) obj).f20414a;
        }
        return this.f20414a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20414a.hashCode();
    }
}
