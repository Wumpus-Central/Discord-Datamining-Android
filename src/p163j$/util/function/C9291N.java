package p163j$.util.function;

import java.util.function.LongFunction;

/* renamed from: j$.util.function.N */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9291N implements AbstractC9292O {

    /* renamed from: a */
    public final /* synthetic */ LongFunction f20388a;

    private /* synthetic */ C9291N(LongFunction longFunction) {
        this.f20388a = longFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C9291N m16541a(LongFunction longFunction) {
        if (longFunction == null) {
            return null;
        }
        return new C9291N(longFunction);
    }

    @Override // p163j$.util.function.AbstractC9292O
    public final /* synthetic */ Object apply(long j) {
        return this.f20388a.apply(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9291N) {
            obj = ((C9291N) obj).f20388a;
        }
        return this.f20388a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20388a.hashCode();
    }
}
