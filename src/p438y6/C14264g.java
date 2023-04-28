package p438y6;

import javax.inject.Provider;
import p040c7.AbstractC3770a;
import p362u6.AbstractC13194b;
import p362u6.C13196d;
import p458z6.AbstractC14553f;

/* renamed from: y6.g */
/* loaded from: classes7.dex */
public final class C14264g implements AbstractC13194b<AbstractC14553f> {

    /* renamed from: a */
    private final Provider<AbstractC3770a> f32241a;

    public C14264g(Provider<AbstractC3770a> provider) {
        this.f32241a = provider;
    }

    /* renamed from: a */
    public static AbstractC14553f m1213a(AbstractC3770a aVar) {
        return (AbstractC14553f) C13196d.m4360c(AbstractC14263f.m1214a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C14264g m1212b(Provider<AbstractC3770a> provider) {
        return new C14264g(provider);
    }

    /* renamed from: c */
    public AbstractC14553f get() {
        return m1213a(this.f32241a.get());
    }
}
