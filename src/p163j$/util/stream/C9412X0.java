package p163j$.util.stream;

import java.util.Arrays;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.X0 */
/* loaded from: classes2.dex */
public final class C9412X0 extends C9339F0 implements AbstractC0622x0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9412X0(long j, IntFunction intFunction) {
        super(j, intFunction);
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
        int i = this.f20483b;
        Object[] objArr = this.f20482a;
        if (i < objArr.length) {
            this.f20483b = i + 1;
            objArr[i] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0622x0
    /* renamed from: build */
    public final AbstractC9324C0 mo42182build() {
        int i = this.f20483b;
        Object[] objArr = this.f20482a;
        if (i >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f20483b), Integer.valueOf(objArr.length)));
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        Object[] objArr = this.f20482a;
        if (j == objArr.length) {
            this.f20483b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(objArr.length)));
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final /* synthetic */ boolean mo16234e() {
        return false;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final void end() {
        int i = this.f20483b;
        Object[] objArr = this.f20482a;
        if (i < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f20483b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // p163j$.util.stream.C9339F0
    public final String toString() {
        Object[] objArr = this.f20482a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f20483b), Arrays.toString(objArr));
    }
}
