package cc;

import java.util.Set;
import p163j$.util.function.Predicate;

/* renamed from: cc.a2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3823a2 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f6343a;

    public /* synthetic */ C3823a2(Set set) {
        this.f6343a = set;
    }

    @Override // p163j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return predicate.getClass();
    }

    @Override // p163j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // p163j$.util.function.Predicate
    /* renamed from: or */
    public /* synthetic */ Predicate mo16468or(Predicate predicate) {
        return predicate.getClass();
    }

    @Override // p163j$.util.function.Predicate
    public final boolean test(Object obj) {
        return this.f6343a.contains(obj);
    }
}
