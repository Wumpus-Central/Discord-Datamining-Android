package p400w9;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC5374b;
import p384v9.AbstractC13468e;
import p384v9.AbstractC13478k;
import p384v9.C13456a;
import p384v9.C13456a.AbstractC13459d;

/* renamed from: w9.q */
/* loaded from: classes5.dex */
public final class C13839q<O extends C13456a.AbstractC13459d> extends C13836n {

    /* renamed from: c */
    private final AbstractC13468e<O> f31156c;

    public C13839q(AbstractC13468e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f31156c = eVar;
    }

    @Override // p384v9.AbstractC13470f
    /* renamed from: a */
    public final <A extends C13456a.AbstractC13457b, R extends AbstractC13478k, T extends AbstractC5374b<R, A>> T mo2547a(T t) {
        return (T) this.f31156c.m3633k(t);
    }

    @Override // p384v9.AbstractC13470f
    /* renamed from: b */
    public final <A extends C13456a.AbstractC13457b, T extends AbstractC5374b<? extends AbstractC13478k, A>> T mo2546b(T t) {
        return (T) this.f31156c.m3628p(t);
    }

    @Override // p384v9.AbstractC13470f
    /* renamed from: d */
    public final Looper mo2545d() {
        return this.f31156c.m3622v();
    }
}
