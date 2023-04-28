package p163j$.util.stream;

import java.util.Arrays;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.Q0 */
/* loaded from: classes2.dex */
public final class C9385Q0 extends C9381P0 implements AbstractC0610u0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9385Q0(long j) {
        super(j);
    }

    @Override // p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        int i = this.f20542b;
        double[] dArr = this.f20541a;
        if (i < dArr.length) {
            this.f20542b = i + 1;
            dArr[i] = d;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16232k((Double) obj);
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0610u0, p163j$.util.stream.AbstractC0622x0
    /* renamed from: build */
    public final AbstractC0626y0 mo42182build() {
        int i = this.f20542b;
        double[] dArr = this.f20541a;
        if (i >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f20542b), Integer.valueOf(dArr.length)));
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        double[] dArr = this.f20541a;
        if (j == dArr.length) {
            this.f20542b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(dArr.length)));
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final /* synthetic */ boolean mo16234e() {
        return false;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final void end() {
        int i = this.f20542b;
        double[] dArr = this.f20541a;
        if (i < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f20542b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // p163j$.util.stream.AbstractC0531b2
    /* renamed from: k */
    public final /* synthetic */ void mo16232k(Double d) {
        AbstractC0606t0.m16290P(this, d);
    }

    @Override // p163j$.util.stream.C9381P0
    public final String toString() {
        double[] dArr = this.f20541a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f20542b), Arrays.toString(dArr));
    }
}
