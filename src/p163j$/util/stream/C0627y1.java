package p163j$.util.stream;

import p163j$.util.function.AbstractC0489d;
import p163j$.util.function.AbstractC0492g;
import p163j$.util.function.AbstractC0507w;
import p163j$.util.function.AbstractC9288K;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y1 */
/* loaded from: classes2.dex */
public final class C0627y1 extends AbstractC0606t0 {

    /* renamed from: h */
    public final /* synthetic */ int f20792h;

    /* renamed from: i */
    final /* synthetic */ Object f20793i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0627y1(EnumC9398T2 t2, Object obj, int i) {
        super(t2);
        this.f20792h = i;
        this.f20793i = obj;
    }

    @Override // p163j$.util.stream.AbstractC0606t0
    /* renamed from: I0 */
    public final AbstractC9374N1 mo16237I0() {
        int i = this.f20792h;
        Object obj = this.f20793i;
        switch (i) {
            case 0:
                return new C0631z1((AbstractC0492g) obj);
            case 1:
                return new C9325C1((AbstractC0489d) obj);
            case 2:
                return new C9354I1((AbstractC0507w) obj);
            default:
                return new C9370M1((AbstractC9288K) obj);
        }
    }
}
