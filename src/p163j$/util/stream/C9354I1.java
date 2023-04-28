package p163j$.util.stream;

import p163j$.util.C0515k;
import p163j$.util.function.AbstractC0507w;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.I1 */
/* loaded from: classes2.dex */
final class C9354I1 implements AbstractC9374N1, AbstractC0536c2 {

    /* renamed from: a */
    private boolean f20505a;

    /* renamed from: b */
    private int f20506b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0507w f20507c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9354I1(AbstractC0507w wVar) {
        this.f20507c = wVar;
    }

    @Override // p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final /* synthetic */ void accept(double d) {
        AbstractC0606t0.m16291O();
        throw null;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final void accept(int i) {
        if (this.f20505a) {
            this.f20505a = false;
        } else {
            i = this.f20507c.applyAsInt(this.f20506b, i);
        }
        this.f20506b = i;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void accept(long j) {
        AbstractC0606t0.m16283W();
        throw null;
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16334d((Integer) obj);
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return intConsumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        this.f20505a = true;
        this.f20506b = 0;
    }

    @Override // p163j$.util.stream.AbstractC0536c2
    /* renamed from: d */
    public final /* synthetic */ void mo16334d(Integer num) {
        AbstractC0606t0.m16288R(this, num);
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final /* synthetic */ boolean mo16234e() {
        return false;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void end() {
    }

    @Override // p163j$.util.function.Supplier
    public final Object get() {
        return this.f20505a ? C0515k.m16497a() : C0515k.m16494d(this.f20506b);
    }

    @Override // p163j$.util.stream.AbstractC9374N1
    /* renamed from: h */
    public final void mo16233h(AbstractC9374N1 n1) {
        C9354I1 i1 = (C9354I1) n1;
        if (!i1.f20505a) {
            accept(i1.f20506b);
        }
    }
}
