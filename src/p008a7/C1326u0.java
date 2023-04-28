package p008a7;

import android.content.Context;
import javax.inject.Provider;
import p362u6.AbstractC13194b;

/* renamed from: a7.u0 */
/* loaded from: classes7.dex */
public final class C1326u0 implements AbstractC13194b<C1323t0> {

    /* renamed from: a */
    private final Provider<Context> f218a;

    /* renamed from: b */
    private final Provider<String> f219b;

    /* renamed from: c */
    private final Provider<Integer> f220c;

    public C1326u0(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f218a = provider;
        this.f219b = provider2;
        this.f220c = provider3;
    }

    /* renamed from: a */
    public static C1326u0 m41352a(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new C1326u0(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C1323t0 m41350c(Context context, String str, int i) {
        return new C1323t0(context, str, i);
    }

    /* renamed from: b */
    public C1323t0 get() {
        return m41350c(this.f218a.get(), this.f219b.get(), this.f220c.get().intValue());
    }
}
