package p335s6;

import android.content.Context;
import javax.inject.Provider;
import p362u6.AbstractC13194b;

/* renamed from: s6.l */
/* loaded from: classes7.dex */
public final class C12802l implements AbstractC13194b<C12800k> {

    /* renamed from: a */
    private final Provider<Context> f28735a;

    /* renamed from: b */
    private final Provider<C12798i> f28736b;

    public C12802l(Provider<Context> provider, Provider<C12798i> provider2) {
        this.f28735a = provider;
        this.f28736b = provider2;
    }

    /* renamed from: a */
    public static C12802l m5452a(Provider<Context> provider, Provider<C12798i> provider2) {
        return new C12802l(provider, provider2);
    }

    /* renamed from: c */
    public static C12800k m5450c(Context context, Object obj) {
        return new C12800k(context, (C12798i) obj);
    }

    /* renamed from: b */
    public C12800k get() {
        return m5450c(this.f28735a.get(), this.f28736b.get());
    }
}
