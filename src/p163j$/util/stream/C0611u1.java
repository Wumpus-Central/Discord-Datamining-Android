package p163j$.util.stream;

import p163j$.util.function.AbstractC0489d;
import p163j$.util.function.AbstractC9302Z;
import p163j$.util.function.AbstractC9304b0;
import p163j$.util.function.AbstractC9306d0;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.BiFunction;
import p163j$.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u1 */
/* loaded from: classes2.dex */
public final class C0611u1 extends AbstractC0606t0 {

    /* renamed from: h */
    public final /* synthetic */ int f20766h;

    /* renamed from: i */
    final /* synthetic */ Object f20767i;

    /* renamed from: j */
    final /* synthetic */ Object f20768j;

    /* renamed from: k */
    final /* synthetic */ Object f20769k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0611u1(EnumC9398T2 t2, Object obj, Object obj2, Object obj3, int i) {
        super(t2);
        this.f20766h = i;
        this.f20767i = obj;
        this.f20769k = obj2;
        this.f20768j = obj3;
    }

    @Override // p163j$.util.stream.AbstractC0606t0
    /* renamed from: I0 */
    public final AbstractC9374N1 mo16237I0() {
        int i = this.f20766h;
        Object obj = this.f20767i;
        Object obj2 = this.f20769k;
        Object obj3 = this.f20768j;
        switch (i) {
            case 0:
                return new C0615v1((Supplier) obj3, (AbstractC9306d0) obj2, (AbstractC0489d) obj);
            case 1:
                return new C9315A1((Supplier) obj3, (AbstractC9302Z) obj2, (AbstractC0489d) obj);
            case 2:
                return new C9320B1(obj3, (BiFunction) obj2, (AbstractC0489d) obj);
            case 3:
                return new C9340F1((Supplier) obj3, (BiConsumer) obj2, (BiConsumer) obj);
            default:
                return new C9358J1((Supplier) obj3, (AbstractC9304b0) obj2, (AbstractC0489d) obj);
        }
    }
}
