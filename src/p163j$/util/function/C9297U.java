package p163j$.util.function;

import java.util.function.LongToIntFunction;

/* renamed from: j$.util.function.U */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9297U implements AbstractC9298V {

    /* renamed from: a */
    public final /* synthetic */ LongToIntFunction f20395a;

    private /* synthetic */ C9297U(LongToIntFunction longToIntFunction) {
        this.f20395a = longToIntFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ C9297U m16535b(LongToIntFunction longToIntFunction) {
        if (longToIntFunction == null) {
            return null;
        }
        return new C9297U(longToIntFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ int m16536a(long j) {
        return this.f20395a.applyAsInt(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9297U) {
            obj = ((C9297U) obj).f20395a;
        }
        return this.f20395a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20395a.hashCode();
    }
}
