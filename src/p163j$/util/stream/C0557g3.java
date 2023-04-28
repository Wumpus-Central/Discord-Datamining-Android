package p163j$.util.stream;

import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.g3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0557g3 implements AbstractC0541d2 {

    /* renamed from: a */
    public final /* synthetic */ int f20666a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC9290M f20667b;

    public /* synthetic */ C0557g3(AbstractC9290M m, int i) {
        this.f20666a = i;
        this.f20667b = m;
    }

    @Override // p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final /* synthetic */ void accept(double d) {
        switch (this.f20666a) {
            case 0:
                AbstractC0606t0.m16291O();
                throw null;
            default:
                AbstractC0606t0.m16291O();
                throw null;
        }
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final /* synthetic */ void accept(int i) {
        switch (this.f20666a) {
            case 0:
                AbstractC0606t0.m16284V();
                throw null;
            default:
                AbstractC0606t0.m16284V();
                throw null;
        }
    }

    @Override // p163j$.util.stream.AbstractC0541d2, p163j$.util.stream.AbstractC0546e2
    public final void accept(long j) {
        int i = this.f20666a;
        AbstractC9290M m = this.f20667b;
        switch (i) {
            case 0:
                ((C9371M2) m).accept(j);
                return;
            default:
                m.accept(j);
                return;
        }
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f20666a) {
            case 0:
                mo16243j((Long) obj);
                return;
            default:
                mo16243j((Long) obj);
                return;
        }
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f20666a) {
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

    @Override // p163j$.util.stream.AbstractC0541d2
    /* renamed from: j */
    public final /* synthetic */ void mo16243j(Long l) {
        switch (this.f20666a) {
            case 0:
                AbstractC0606t0.m16286T(this, l);
                return;
            default:
                AbstractC0606t0.m16286T(this, l);
                return;
        }
    }
}
