package p163j$.util.function;

import java.util.function.LongToDoubleFunction;

/* renamed from: j$.util.function.S */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9295S implements AbstractC9296T {

    /* renamed from: a */
    public final /* synthetic */ LongToDoubleFunction f20391a;

    private /* synthetic */ C9295S(LongToDoubleFunction longToDoubleFunction) {
        this.f20391a = longToDoubleFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ C9295S m16537b(LongToDoubleFunction longToDoubleFunction) {
        if (longToDoubleFunction == null) {
            return null;
        }
        return new C9295S(longToDoubleFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ double m16538a(long j) {
        return this.f20391a.applyAsDouble(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9295S) {
            obj = ((C9295S) obj).f20391a;
        }
        return this.f20391a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20391a.hashCode();
    }
}
