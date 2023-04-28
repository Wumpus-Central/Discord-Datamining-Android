package p163j$.util.function;

import java.util.function.IntPredicate;

/* renamed from: j$.util.function.B */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9279B implements AbstractC9280C {

    /* renamed from: a */
    public final /* synthetic */ IntPredicate f20378a;

    private /* synthetic */ C9279B(IntPredicate intPredicate) {
        this.f20378a = intPredicate;
    }

    /* renamed from: a */
    public static /* synthetic */ C9279B m16550a(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return new C9279B(intPredicate);
    }

    /* renamed from: b */
    public final /* synthetic */ boolean m16549b(int i) {
        return this.f20378a.test(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9279B) {
            obj = ((C9279B) obj).f20378a;
        }
        return this.f20378a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20378a.hashCode();
    }
}
