package p163j$.util.stream;

import p163j$.util.function.AbstractC0489d;
import p163j$.util.function.BiFunction;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.B1 */
/* loaded from: classes2.dex */
final class C9320B1 extends AbstractC9378O1 implements AbstractC9374N1 {

    /* renamed from: b */
    final /* synthetic */ Object f20448b;

    /* renamed from: c */
    final /* synthetic */ BiFunction f20449c;

    /* renamed from: d */
    final /* synthetic */ AbstractC0489d f20450d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9320B1(Object obj, BiFunction biFunction, AbstractC0489d dVar) {
        this.f20448b = obj;
        this.f20449c = biFunction;
        this.f20450d = dVar;
    }

    @Override // p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final /* synthetic */ void accept(double d) {
        AbstractC0606t0.m16291O();
        throw null;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void accept(int i) {
        AbstractC0606t0.m16284V();
        throw null;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void accept(long j) {
        AbstractC0606t0.m16283W();
        throw null;
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f20537a = this.f20449c.apply(this.f20537a, obj);
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        this.f20537a = this.f20448b;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final /* synthetic */ boolean mo16234e() {
        return false;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void end() {
    }

    @Override // p163j$.util.stream.AbstractC9374N1
    /* renamed from: h */
    public final void mo16233h(AbstractC9374N1 n1) {
        this.f20537a = this.f20450d.apply(this.f20537a, ((C9320B1) n1).f20537a);
    }
}
