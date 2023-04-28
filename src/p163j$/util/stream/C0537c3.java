package p163j$.util.stream;

import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.c3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0537c3 implements AbstractC0531b2 {

    /* renamed from: a */
    public final /* synthetic */ int f20634a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0494i f20635b;

    public /* synthetic */ C0537c3(AbstractC0494i iVar, int i) {
        this.f20634a = i;
        this.f20635b = iVar;
    }

    @Override // p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        int i = this.f20634a;
        AbstractC0494i iVar = this.f20635b;
        switch (i) {
            case 0:
                ((C9355I2) iVar).accept(d);
                return;
            default:
                iVar.accept(d);
                return;
        }
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void accept(int i) {
        switch (this.f20634a) {
            case 0:
                AbstractC0606t0.m16284V();
                throw null;
            default:
                AbstractC0606t0.m16284V();
                throw null;
        }
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void accept(long j) {
        switch (this.f20634a) {
            case 0:
                AbstractC0606t0.m16283W();
                throw null;
            default:
                AbstractC0606t0.m16283W();
                throw null;
        }
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f20634a) {
            case 0:
                mo16232k((Double) obj);
                return;
            default:
                mo16232k((Double) obj);
                return;
        }
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f20634a) {
            case 0:
                return consumer.getClass();
            default:
                return consumer.getClass();
        }
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final /* synthetic */ void mo16235c(long j) {
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final /* synthetic */ boolean mo16234e() {
        return false;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void end() {
    }

    @Override // p163j$.util.stream.AbstractC0531b2
    /* renamed from: k */
    public final /* synthetic */ void mo16232k(Double d) {
        switch (this.f20634a) {
            case 0:
                AbstractC0606t0.m16290P(this, d);
                return;
            default:
                AbstractC0606t0.m16290P(this, d);
                return;
        }
    }
}
