package p163j$.util.stream;

import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.O0 */
/* loaded from: classes2.dex */
public final class C9377O0 extends AbstractC9334E0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9377O0(AbstractC9324C0 c0, AbstractC9324C0 c02) {
        super(c0, c02);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final void forEach(Consumer consumer) {
        this.f20474a.forEach(consumer);
        this.f20475b.forEach(consumer);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: i */
    public final void mo16320i(Object[] objArr, int i) {
        objArr.getClass();
        AbstractC9324C0 c0 = this.f20474a;
        c0.mo16320i(objArr, i);
        this.f20475b.mo16320i(objArr, i + ((int) c0.count()));
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
    public final AbstractC9324C0 mo16317n(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == count()) {
            return this;
        }
        long count = this.f20474a.count();
        return j >= count ? this.f20475b.mo16317n(j - count, j2 - count, intFunction) : j2 <= count ? this.f20474a.mo16317n(j, j2, intFunction) : AbstractC0606t0.m16262q0(EnumC9398T2.REFERENCE, this.f20474a.mo16317n(j, count, intFunction), this.f20475b.mo16317n(0L, j2 - count, intFunction));
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: spliterator */
    public final Spliterator mo42181spliterator() {
        return new C0550f1(this);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f20474a, this.f20475b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
