package p163j$.util.stream;

import java.util.Arrays;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.Z0 */
/* loaded from: classes2.dex */
public final class C9420Z0 extends C9416Y0 implements AbstractC0614v0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9420Z0(long j) {
        super(j);
    }

    @Override // p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final /* synthetic */ void accept(double d) {
        AbstractC0606t0.m16291O();
        throw null;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final void accept(int i) {
        int i2 = this.f20608b;
        int[] iArr = this.f20607a;
        if (i2 < iArr.length) {
            this.f20608b = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
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

    @Override // p163j$.util.stream.AbstractC0614v0, p163j$.util.stream.AbstractC0622x0
    /* renamed from: build */
    public final AbstractC0630z0 mo42182build() {
        int i = this.f20608b;
        int[] iArr = this.f20607a;
        if (i >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f20608b), Integer.valueOf(iArr.length)));
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        int[] iArr = this.f20607a;
        if (j == iArr.length) {
            this.f20608b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(iArr.length)));
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
    public final void end() {
        int i = this.f20608b;
        int[] iArr = this.f20607a;
        if (i < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f20608b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // p163j$.util.stream.C9416Y0
    public final String toString() {
        int[] iArr = this.f20607a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f20608b), Arrays.toString(iArr));
    }
}
