package p163j$.util.stream;

import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.p1 */
/* loaded from: classes2.dex */
public final class C0592p1 extends C9383P2 implements AbstractC9324C0, AbstractC0622x0 {
    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: a */
    public final AbstractC9324C0 mo16321a(int i) {
        throw new IndexOutOfBoundsException();
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

    @Override // p163j$.util.stream.C9383P2, p163j$.util.function.Consumer
    public final void accept(Object obj) {
        super.accept(obj);
    }

    @Override // p163j$.util.stream.AbstractC0622x0
    /* renamed from: build */
    public final AbstractC9324C0 mo42182build() {
        return this;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        clear();
        m16447o(j);
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final /* synthetic */ boolean mo16234e() {
        return false;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    public final void end() {
    }

    @Override // p163j$.util.stream.C9383P2, p163j$.lang.AbstractC9165a
    public final void forEach(Consumer consumer) {
        super.forEach(consumer);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: i */
    public final void mo16320i(Object[] objArr, int i) {
        long j = i;
        long count = count() + j;
        if (count > objArr.length || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        } else if (this.f20642c == 0) {
            System.arraycopy(this.f20544e, 0, objArr, i, this.f20641b);
        } else {
            for (int i2 = 0; i2 < this.f20642c; i2++) {
                Object[] objArr2 = this.f20545f[i2];
                System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
                i += this.f20545f[i2].length;
            }
            int i3 = this.f20641b;
            if (i3 > 0) {
                System.arraycopy(this.f20544e, 0, objArr, i, i3);
            }
        }
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: l */
    public final /* synthetic */ int mo16319l() {
        return 0;
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: m */
    public final Object[] mo16318m(IntFunction intFunction) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            mo16320i(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: n */
    public final /* synthetic */ AbstractC9324C0 mo16317n(long j, long j2, IntFunction intFunction) {
        return AbstractC0606t0.m16272h0(this, j, j2, intFunction);
    }

    @Override // p163j$.util.stream.C9383P2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }
}
