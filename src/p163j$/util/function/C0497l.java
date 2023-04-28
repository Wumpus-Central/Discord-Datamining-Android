package p163j$.util.function;

import java.util.function.DoublePredicate;

/* renamed from: j$.util.function.l */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0497l implements AbstractC0498m {

    /* renamed from: a */
    public final /* synthetic */ DoublePredicate f20415a;

    private /* synthetic */ C0497l(DoublePredicate doublePredicate) {
        this.f20415a = doublePredicate;
    }

    /* renamed from: a */
    public static /* synthetic */ C0497l m16521a(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return new C0497l(doublePredicate);
    }

    /* renamed from: b */
    public final /* synthetic */ boolean m16520b(double d) {
        return this.f20415a.test(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0497l) {
            obj = ((C0497l) obj).f20415a;
        }
        return this.f20415a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20415a.hashCode();
    }
}
