package p163j$.util.stream;

import p163j$.util.function.AbstractC0494i;

/* renamed from: j$.util.stream.V2 */
/* loaded from: classes2.dex */
final class C9406V2 extends AbstractC9418Y2 implements AbstractC0494i {

    /* renamed from: c */
    final double[] f20602c = new double[128];

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC9418Y2
    /* renamed from: a */
    public final void mo16409a(Object obj, long j) {
        AbstractC0494i iVar = (AbstractC0494i) obj;
        for (int i = 0; i < j; i++) {
            iVar.accept(this.f20602c[i]);
        }
    }

    @Override // p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        int i = this.f20610b;
        this.f20610b = i + 1;
        this.f20602c[i] = d;
    }
}
