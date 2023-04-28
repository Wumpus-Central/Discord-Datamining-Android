package p008a7;

import javax.inject.Provider;
import p040c7.AbstractC3770a;
import p347t6.AbstractC12970a;
import p362u6.AbstractC13194b;
import p362u6.C13193a;

/* renamed from: a7.n0 */
/* loaded from: classes7.dex */
public final class C1311n0 implements AbstractC13194b<C1305m0> {

    /* renamed from: a */
    private final Provider<AbstractC3770a> f188a;

    /* renamed from: b */
    private final Provider<AbstractC3770a> f189b;

    /* renamed from: c */
    private final Provider<AbstractC1284e> f190c;

    /* renamed from: d */
    private final Provider<C1323t0> f191d;

    /* renamed from: e */
    private final Provider<String> f192e;

    public C1311n0(Provider<AbstractC3770a> provider, Provider<AbstractC3770a> provider2, Provider<AbstractC1284e> provider3, Provider<C1323t0> provider4, Provider<String> provider5) {
        this.f188a = provider;
        this.f189b = provider2;
        this.f190c = provider3;
        this.f191d = provider4;
        this.f192e = provider5;
    }

    /* renamed from: a */
    public static C1311n0 m41369a(Provider<AbstractC3770a> provider, Provider<AbstractC3770a> provider2, Provider<AbstractC1284e> provider3, Provider<C1323t0> provider4, Provider<String> provider5) {
        return new C1311n0(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C1305m0 m41367c(AbstractC3770a aVar, AbstractC3770a aVar2, Object obj, Object obj2, AbstractC12970a<String> aVar3) {
        return new C1305m0(aVar, aVar2, (AbstractC1284e) obj, (C1323t0) obj2, aVar3);
    }

    /* renamed from: b */
    public C1305m0 get() {
        return m41367c(this.f188a.get(), this.f189b.get(), this.f190c.get(), this.f191d.get(), C13193a.m4366a(this.f192e));
    }
}
