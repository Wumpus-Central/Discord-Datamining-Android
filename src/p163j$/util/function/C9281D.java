package p163j$.util.function;

import java.util.function.IntToDoubleFunction;

/* renamed from: j$.util.function.D */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9281D implements AbstractC9282E {

    /* renamed from: a */
    public final /* synthetic */ IntToDoubleFunction f20382a;

    private /* synthetic */ C9281D(IntToDoubleFunction intToDoubleFunction) {
        this.f20382a = intToDoubleFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ C9281D m16547b(IntToDoubleFunction intToDoubleFunction) {
        if (intToDoubleFunction == null) {
            return null;
        }
        return new C9281D(intToDoubleFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ double m16548a(int i) {
        return this.f20382a.applyAsDouble(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9281D) {
            obj = ((C9281D) obj).f20382a;
        }
        return this.f20382a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20382a.hashCode();
    }
}
