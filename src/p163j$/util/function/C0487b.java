package p163j$.util.function;

import java.util.Comparator;
import p163j$.util.function.Predicate;

/* renamed from: j$.util.function.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0487b implements AbstractC0489d, Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f20401a;

    /* renamed from: b */
    public final /* synthetic */ Object f20402b;

    public /* synthetic */ C0487b(int i, Object obj) {
        this.f20401a = i;
        this.f20402b = obj;
    }

    @Override // p163j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return predicate.getClass();
    }

    @Override // p163j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.f20401a;
        Object obj3 = this.f20402b;
        switch (i) {
            case 0:
                return ((Comparator) obj3).compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return ((Comparator) obj3).compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }

    @Override // p163j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // p163j$.util.function.Predicate
    /* renamed from: or */
    public final /* synthetic */ Predicate mo16468or(Predicate predicate) {
        return predicate.getClass();
    }

    @Override // p163j$.util.function.Predicate
    public final boolean test(Object obj) {
        return !((Predicate) this.f20402b).test(obj);
    }
}
