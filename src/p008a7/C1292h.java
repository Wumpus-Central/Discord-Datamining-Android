package p008a7;

import android.content.Context;
import javax.inject.Provider;
import p362u6.AbstractC13194b;
import p362u6.C13196d;

/* renamed from: a7.h */
/* loaded from: classes7.dex */
public final class C1292h implements AbstractC13194b<String> {

    /* renamed from: a */
    private final Provider<Context> f165a;

    public C1292h(Provider<Context> provider) {
        this.f165a = provider;
    }

    /* renamed from: a */
    public static C1292h m41468a(Provider<Context> provider) {
        return new C1292h(provider);
    }

    /* renamed from: c */
    public static String m41466c(Context context) {
        return (String) C13196d.m4360c(AbstractC1287f.m41475b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public String get() {
        return m41466c(this.f165a.get());
    }
}
