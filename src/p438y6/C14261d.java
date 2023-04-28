package p438y6;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import p008a7.AbstractC1282d;
import p027b7.AbstractC3394b;
import p335s6.AbstractC12792e;
import p362u6.AbstractC13194b;
import p458z6.AbstractC14575x;

/* renamed from: y6.d */
/* loaded from: classes7.dex */
public final class C14261d implements AbstractC13194b<C14260c> {

    /* renamed from: a */
    private final Provider<Executor> f32236a;

    /* renamed from: b */
    private final Provider<AbstractC12792e> f32237b;

    /* renamed from: c */
    private final Provider<AbstractC14575x> f32238c;

    /* renamed from: d */
    private final Provider<AbstractC1282d> f32239d;

    /* renamed from: e */
    private final Provider<AbstractC3394b> f32240e;

    public C14261d(Provider<Executor> provider, Provider<AbstractC12792e> provider2, Provider<AbstractC14575x> provider3, Provider<AbstractC1282d> provider4, Provider<AbstractC3394b> provider5) {
        this.f32236a = provider;
        this.f32237b = provider2;
        this.f32238c = provider3;
        this.f32239d = provider4;
        this.f32240e = provider5;
    }

    /* renamed from: a */
    public static C14261d m1218a(Provider<Executor> provider, Provider<AbstractC12792e> provider2, Provider<AbstractC14575x> provider3, Provider<AbstractC1282d> provider4, Provider<AbstractC3394b> provider5) {
        return new C14261d(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C14260c m1216c(Executor executor, AbstractC12792e eVar, AbstractC14575x xVar, AbstractC1282d dVar, AbstractC3394b bVar) {
        return new C14260c(executor, eVar, xVar, dVar, bVar);
    }

    /* renamed from: b */
    public C14260c get() {
        return m1216c(this.f32236a.get(), this.f32237b.get(), this.f32238c.get(), this.f32239d.get(), this.f32240e.get());
    }
}
