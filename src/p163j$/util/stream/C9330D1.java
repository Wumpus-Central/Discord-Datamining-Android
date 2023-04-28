package p163j$.util.stream;

import p163j$.util.function.AbstractC0489d;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.C0488c;
import p163j$.util.function.C9309g0;
import p163j$.util.function.Supplier;

/* renamed from: j$.util.stream.D1 */
/* loaded from: classes2.dex */
final class C9330D1 extends AbstractC0606t0 {

    /* renamed from: h */
    final /* synthetic */ AbstractC0489d f20464h;

    /* renamed from: i */
    final /* synthetic */ BiConsumer f20465i;

    /* renamed from: j */
    final /* synthetic */ Supplier f20466j;

    /* renamed from: k */
    final /* synthetic */ AbstractC0570k f20467k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9330D1(EnumC9398T2 t2, C0488c cVar, BiConsumer biConsumer, C9309g0 g0Var, C0566j jVar) {
        super(t2);
        this.f20464h = cVar;
        this.f20465i = biConsumer;
        this.f20466j = g0Var;
        this.f20467k = jVar;
    }

    @Override // p163j$.util.stream.AbstractC0606t0
    /* renamed from: I0 */
    public final AbstractC9374N1 mo16237I0() {
        return new C9335E1(this.f20466j, this.f20465i, this.f20464h);
    }

    @Override // p163j$.util.stream.AbstractC0606t0, p163j$.util.stream.AbstractC9332D3
    /* renamed from: y */
    public final int mo16254y() {
        if (((C0566j) this.f20467k).m16349b().contains(EnumC0562i.UNORDERED)) {
            return EnumC9394S2.f20576r;
        }
        return 0;
    }
}
