package p458z6;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import p008a7.AbstractC1282d;
import p027b7.AbstractC3394b;
import p362u6.AbstractC13194b;

/* renamed from: z6.w */
/* loaded from: classes7.dex */
public final class C14574w implements AbstractC13194b<C14573v> {

    /* renamed from: a */
    private final Provider<Executor> f33043a;

    /* renamed from: b */
    private final Provider<AbstractC1282d> f33044b;

    /* renamed from: c */
    private final Provider<AbstractC14575x> f33045c;

    /* renamed from: d */
    private final Provider<AbstractC3394b> f33046d;

    public C14574w(Provider<Executor> provider, Provider<AbstractC1282d> provider2, Provider<AbstractC14575x> provider3, Provider<AbstractC3394b> provider4) {
        this.f33043a = provider;
        this.f33044b = provider2;
        this.f33045c = provider3;
        this.f33046d = provider4;
    }

    /* renamed from: a */
    public static C14574w m191a(Provider<Executor> provider, Provider<AbstractC1282d> provider2, Provider<AbstractC14575x> provider3, Provider<AbstractC3394b> provider4) {
        return new C14574w(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static C14573v m189c(Executor executor, AbstractC1282d dVar, AbstractC14575x xVar, AbstractC3394b bVar) {
        return new C14573v(executor, dVar, xVar, bVar);
    }

    /* renamed from: b */
    public C14573v get() {
        return m189c(this.f33043a.get(), this.f33044b.get(), this.f33045c.get(), this.f33046d.get());
    }
}
