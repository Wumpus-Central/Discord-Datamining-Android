package p315r6;

import javax.inject.Provider;
import p040c7.AbstractC3770a;
import p362u6.AbstractC13194b;
import p438y6.AbstractC14262e;
import p458z6.C14569r;
import p458z6.C14573v;

/* renamed from: r6.v */
/* loaded from: classes7.dex */
public final class C12439v implements AbstractC13194b<C12436t> {

    /* renamed from: a */
    private final Provider<AbstractC3770a> f27984a;

    /* renamed from: b */
    private final Provider<AbstractC3770a> f27985b;

    /* renamed from: c */
    private final Provider<AbstractC14262e> f27986c;

    /* renamed from: d */
    private final Provider<C14569r> f27987d;

    /* renamed from: e */
    private final Provider<C14573v> f27988e;

    public C12439v(Provider<AbstractC3770a> provider, Provider<AbstractC3770a> provider2, Provider<AbstractC14262e> provider3, Provider<C14569r> provider4, Provider<C14573v> provider5) {
        this.f27984a = provider;
        this.f27985b = provider2;
        this.f27986c = provider3;
        this.f27987d = provider4;
        this.f27988e = provider5;
    }

    /* renamed from: a */
    public static C12439v m6776a(Provider<AbstractC3770a> provider, Provider<AbstractC3770a> provider2, Provider<AbstractC14262e> provider3, Provider<C14569r> provider4, Provider<C14573v> provider5) {
        return new C12439v(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C12436t m6774c(AbstractC3770a aVar, AbstractC3770a aVar2, AbstractC14262e eVar, C14569r rVar, C14573v vVar) {
        return new C12436t(aVar, aVar2, eVar, rVar, vVar);
    }

    /* renamed from: b */
    public C12436t get() {
        return m6774c(this.f27984a.get(), this.f27985b.get(), this.f27986c.get(), this.f27987d.get(), this.f27988e.get());
    }
}
