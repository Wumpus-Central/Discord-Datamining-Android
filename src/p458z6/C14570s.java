package p458z6;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p008a7.AbstractC1280c;
import p008a7.AbstractC1282d;
import p027b7.AbstractC3394b;
import p040c7.AbstractC3770a;
import p335s6.AbstractC12792e;
import p362u6.AbstractC13194b;

/* renamed from: z6.s */
/* loaded from: classes7.dex */
public final class C14570s implements AbstractC13194b<C14569r> {

    /* renamed from: a */
    private final Provider<Context> f33028a;

    /* renamed from: b */
    private final Provider<AbstractC12792e> f33029b;

    /* renamed from: c */
    private final Provider<AbstractC1282d> f33030c;

    /* renamed from: d */
    private final Provider<AbstractC14575x> f33031d;

    /* renamed from: e */
    private final Provider<Executor> f33032e;

    /* renamed from: f */
    private final Provider<AbstractC3394b> f33033f;

    /* renamed from: g */
    private final Provider<AbstractC3770a> f33034g;

    /* renamed from: h */
    private final Provider<AbstractC3770a> f33035h;

    /* renamed from: i */
    private final Provider<AbstractC1280c> f33036i;

    public C14570s(Provider<Context> provider, Provider<AbstractC12792e> provider2, Provider<AbstractC1282d> provider3, Provider<AbstractC14575x> provider4, Provider<Executor> provider5, Provider<AbstractC3394b> provider6, Provider<AbstractC3770a> provider7, Provider<AbstractC3770a> provider8, Provider<AbstractC1280c> provider9) {
        this.f33028a = provider;
        this.f33029b = provider2;
        this.f33030c = provider3;
        this.f33031d = provider4;
        this.f33032e = provider5;
        this.f33033f = provider6;
        this.f33034g = provider7;
        this.f33035h = provider8;
        this.f33036i = provider9;
    }

    /* renamed from: a */
    public static C14570s m199a(Provider<Context> provider, Provider<AbstractC12792e> provider2, Provider<AbstractC1282d> provider3, Provider<AbstractC14575x> provider4, Provider<Executor> provider5, Provider<AbstractC3394b> provider6, Provider<AbstractC3770a> provider7, Provider<AbstractC3770a> provider8, Provider<AbstractC1280c> provider9) {
        return new C14570s(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    /* renamed from: c */
    public static C14569r m197c(Context context, AbstractC12792e eVar, AbstractC1282d dVar, AbstractC14575x xVar, Executor executor, AbstractC3394b bVar, AbstractC3770a aVar, AbstractC3770a aVar2, AbstractC1280c cVar) {
        return new C14569r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    /* renamed from: b */
    public C14569r get() {
        return m197c(this.f33028a.get(), this.f33029b.get(), this.f33030c.get(), this.f33031d.get(), this.f33032e.get(), this.f33033f.get(), this.f33034g.get(), this.f33035h.get(), this.f33036i.get());
    }
}
