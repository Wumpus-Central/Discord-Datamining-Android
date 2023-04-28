package p163j$.util.stream;

import p163j$.util.C0516l;
import p163j$.util.function.AbstractC9288K;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.M1 */
/* loaded from: classes2.dex */
final class C9370M1 implements AbstractC9374N1, AbstractC0541d2 {

    /* renamed from: a */
    private boolean f20526a;

    /* renamed from: b */
    private long f20527b;

    /* renamed from: c */
    final /* synthetic */ AbstractC9288K f20528c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9370M1(AbstractC9288K k) {
        this.f20528c = k;
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
    public final void accept(long j) {
        if (this.f20526a) {
            this.f20526a = false;
        } else {
            j = this.f20528c.applyAsLong(this.f20527b, j);
        }
        this.f20527b = j;
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16243j((Long) obj);
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        this.f20526a = true;
        this.f20527b = 0L;
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
        return this.f20526a ? C0516l.m16493a() : C0516l.m16490d(this.f20527b);
    }

    @Override // p163j$.util.stream.AbstractC9374N1
    /* renamed from: h */
    public final void mo16233h(AbstractC9374N1 n1) {
        C9370M1 m1 = (C9370M1) n1;
        if (!m1.f20526a) {
            accept(m1.f20527b);
        }
    }

    @Override // p163j$.util.stream.AbstractC0541d2
    /* renamed from: j */
    public final /* synthetic */ void mo16243j(Long l) {
        AbstractC0606t0.m16286T(this, l);
    }
}
