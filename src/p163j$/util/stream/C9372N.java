package p163j$.util.stream;

import p163j$.util.function.AbstractC9290M;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.N */
/* loaded from: classes2.dex */
public final class C9372N extends AbstractC9380P implements AbstractC0541d2 {

    /* renamed from: b */
    final AbstractC9290M f20529b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9372N(AbstractC9290M m, boolean z) {
        super(z);
        this.f20529b = m;
    }

    @Override // p163j$.util.stream.AbstractC9380P, p163j$.util.stream.AbstractC0546e2
    public final void accept(long j) {
        this.f20529b.accept(j);
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16243j((Long) obj);
    }

    @Override // p163j$.util.stream.AbstractC0541d2
    /* renamed from: j */
    public final /* synthetic */ void mo16243j(Long l) {
        AbstractC0606t0.m16286T(this, l);
    }
}
