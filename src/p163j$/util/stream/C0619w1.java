package p163j$.util.stream;

import p163j$.util.function.AbstractC0492g;
import p163j$.util.function.C0491f;

/* renamed from: j$.util.stream.w1 */
/* loaded from: classes2.dex */
final class C0619w1 extends AbstractC0606t0 {

    /* renamed from: h */
    final /* synthetic */ AbstractC0492g f20780h;

    /* renamed from: i */
    final /* synthetic */ double f20781i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0619w1(EnumC9398T2 t2, C0491f fVar, double d) {
        super(t2);
        this.f20780h = fVar;
        this.f20781i = d;
    }

    @Override // p163j$.util.stream.AbstractC0606t0
    /* renamed from: I0 */
    public final AbstractC9374N1 mo16237I0() {
        return new C0623x1(this.f20781i, this.f20780h);
    }
}
