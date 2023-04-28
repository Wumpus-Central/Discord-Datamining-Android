package p163j$.util.stream;

import p163j$.util.function.AbstractC0494i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.L */
/* loaded from: classes2.dex */
public final class C9364L extends AbstractC9380P implements AbstractC0531b2 {

    /* renamed from: b */
    final AbstractC0494i f20520b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9364L(AbstractC0494i iVar, boolean z) {
        super(z);
        this.f20520b = iVar;
    }

    @Override // p163j$.util.stream.AbstractC9380P, p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        this.f20520b.accept(d);
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16232k((Double) obj);
    }

    @Override // p163j$.util.stream.AbstractC0531b2
    /* renamed from: k */
    public final /* synthetic */ void mo16232k(Double d) {
        AbstractC0606t0.m16290P(this, d);
    }
}
