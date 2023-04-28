package p163j$.util.function;

import p163j$.util.function.Predicate;

/* renamed from: j$.util.function.e0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9307e0 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f20406a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f20407b;

    /* renamed from: c */
    public final /* synthetic */ Predicate f20408c;

    public /* synthetic */ C9307e0(Predicate predicate, Predicate predicate2, int i) {
        this.f20406a = i;
        this.f20407b = predicate;
        this.f20408c = predicate2;
    }

    @Override // p163j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f20406a) {
            case 0:
                return predicate.getClass();
            default:
                return predicate.getClass();
        }
    }

    @Override // p163j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f20406a) {
            case 0:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // p163j$.util.function.Predicate
    /* renamed from: or */
    public final /* synthetic */ Predicate mo16468or(Predicate predicate) {
        switch (this.f20406a) {
            case 0:
                return predicate.getClass();
            default:
                return predicate.getClass();
        }
    }

    @Override // p163j$.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.f20406a;
        Predicate predicate = this.f20408c;
        Predicate predicate2 = this.f20407b;
        switch (i) {
            case 0:
                return predicate2.test(obj) && predicate.test(obj);
            default:
                return predicate2.test(obj) || predicate.test(obj);
        }
    }
}
