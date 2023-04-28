package p163j$.util.stream;

import p163j$.util.C0512h;
import p163j$.util.function.AbstractC0489d;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.C1 */
/* loaded from: classes2.dex */
final class C9325C1 implements AbstractC9374N1 {

    /* renamed from: a */
    private boolean f20455a;

    /* renamed from: b */
    private Object f20456b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0489d f20457c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9325C1(AbstractC0489d dVar) {
        this.f20457c = dVar;
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
        if (this.f20455a) {
            this.f20455a = false;
        } else {
            obj = this.f20457c.apply(this.f20456b, obj);
        }
        this.f20456b = obj;
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        this.f20455a = true;
        this.f20456b = null;
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
        return this.f20455a ? C0512h.m16509a() : C0512h.m16506d(this.f20456b);
    }

    @Override // p163j$.util.stream.AbstractC9374N1
    /* renamed from: h */
    public final void mo16233h(AbstractC9374N1 n1) {
        C9325C1 c1 = (C9325C1) n1;
        if (!c1.f20455a) {
            accept(c1.f20456b);
        }
    }
}
