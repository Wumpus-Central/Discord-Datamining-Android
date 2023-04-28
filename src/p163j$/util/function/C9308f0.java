package p163j$.util.function;

import java.util.function.Predicate;
import p163j$.util.function.Predicate;

/* renamed from: j$.util.function.f0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9308f0 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f20410a;

    private /* synthetic */ C9308f0(Predicate predicate) {
        this.f20410a = predicate;
    }

    /* renamed from: a */
    public static /* synthetic */ Predicate m16526a(Predicate predicate) {
        if (predicate == null) {
            return null;
        }
        return predicate instanceof Predicate.VivifiedWrapper ? ((Predicate.VivifiedWrapper) predicate).f20390a : new C9308f0(predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        return m16526a(this.f20410a.and(Predicate.VivifiedWrapper.convert(predicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Predicate predicate = this.f20410a;
        if (obj instanceof C9308f0) {
            obj = ((C9308f0) obj).f20410a;
        }
        return predicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20410a.hashCode();
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
        return m16526a(this.f20410a.negate());
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return m16526a(this.f20410a.mo16468or(Predicate.VivifiedWrapper.convert(predicate)));
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return this.f20410a.test(obj);
    }
}
