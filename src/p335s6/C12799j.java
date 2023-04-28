package p335s6;

import android.content.Context;
import javax.inject.Provider;
import p040c7.AbstractC3770a;
import p362u6.AbstractC13194b;

/* renamed from: s6.j */
/* loaded from: classes7.dex */
public final class C12799j implements AbstractC13194b<C12798i> {

    /* renamed from: a */
    private final Provider<Context> f28727a;

    /* renamed from: b */
    private final Provider<AbstractC3770a> f28728b;

    /* renamed from: c */
    private final Provider<AbstractC3770a> f28729c;

    public C12799j(Provider<Context> provider, Provider<AbstractC3770a> provider2, Provider<AbstractC3770a> provider3) {
        this.f28727a = provider;
        this.f28728b = provider2;
        this.f28729c = provider3;
    }

    /* renamed from: a */
    public static C12799j m5460a(Provider<Context> provider, Provider<AbstractC3770a> provider2, Provider<AbstractC3770a> provider3) {
        return new C12799j(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C12798i m5458c(Context context, AbstractC3770a aVar, AbstractC3770a aVar2) {
        return new C12798i(context, aVar, aVar2);
    }

    /* renamed from: b */
    public C12798i get() {
        return m5458c(this.f28727a.get(), this.f28728b.get(), this.f28729c.get());
    }
}
