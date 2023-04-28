package p163j$.util.function;

import java.util.function.IntFunction;

/* renamed from: j$.util.function.A */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9278A implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ IntFunction f20377a;

    private /* synthetic */ C9278A(IntFunction intFunction) {
        this.f20377a = intFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C9278A m16551a(IntFunction intFunction) {
        if (intFunction == null) {
            return null;
        }
        return new C9278A(intFunction);
    }

    @Override // p163j$.util.function.IntFunction
    public final /* synthetic */ Object apply(int i) {
        return this.f20377a.apply(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9278A) {
            obj = ((C9278A) obj).f20377a;
        }
        return this.f20377a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20377a.hashCode();
    }
}
