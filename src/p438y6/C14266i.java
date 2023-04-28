package p438y6;

import android.content.Context;
import javax.inject.Provider;
import p008a7.AbstractC1282d;
import p040c7.AbstractC3770a;
import p362u6.AbstractC13194b;
import p362u6.C13196d;
import p458z6.AbstractC14553f;
import p458z6.AbstractC14575x;

/* renamed from: y6.i */
/* loaded from: classes7.dex */
public final class C14266i implements AbstractC13194b<AbstractC14575x> {

    /* renamed from: a */
    private final Provider<Context> f32242a;

    /* renamed from: b */
    private final Provider<AbstractC1282d> f32243b;

    /* renamed from: c */
    private final Provider<AbstractC14553f> f32244c;

    /* renamed from: d */
    private final Provider<AbstractC3770a> f32245d;

    public C14266i(Provider<Context> provider, Provider<AbstractC1282d> provider2, Provider<AbstractC14553f> provider3, Provider<AbstractC3770a> provider4) {
        this.f32242a = provider;
        this.f32243b = provider2;
        this.f32244c = provider3;
        this.f32245d = provider4;
    }

    /* renamed from: a */
    public static C14266i m1209a(Provider<Context> provider, Provider<AbstractC1282d> provider2, Provider<AbstractC14553f> provider3, Provider<AbstractC3770a> provider4) {
        return new C14266i(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static AbstractC14575x m1207c(Context context, AbstractC1282d dVar, AbstractC14553f fVar, AbstractC3770a aVar) {
        return (AbstractC14575x) C13196d.m4360c(AbstractC14265h.m1210a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public AbstractC14575x get() {
        return m1207c(this.f32242a.get(), this.f32243b.get(), this.f32244c.get(), this.f32245d.get());
    }
}
