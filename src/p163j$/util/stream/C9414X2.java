package p163j$.util.stream;

import p163j$.util.function.AbstractC9290M;

/* renamed from: j$.util.stream.X2 */
/* loaded from: classes2.dex */
final class C9414X2 extends AbstractC9418Y2 implements AbstractC9290M {

    /* renamed from: c */
    final long[] f20606c = new long[128];

    @Override // p163j$.util.stream.AbstractC9418Y2
    /* renamed from: a */
    public final void mo16409a(Object obj, long j) {
        AbstractC9290M m = (AbstractC9290M) obj;
        for (int i = 0; i < j; i++) {
            m.accept(this.f20606c[i]);
        }
    }

    @Override // p163j$.util.function.AbstractC9290M
    public final void accept(long j) {
        int i = this.f20610b;
        this.f20610b = i + 1;
        this.f20606c[i] = j;
    }
}
