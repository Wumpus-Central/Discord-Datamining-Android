package p163j$.util.stream;

import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.N0 */
/* loaded from: classes2.dex */
public abstract class AbstractC9373N0 extends AbstractC9334E0 implements AbstractC9319B0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9373N0(AbstractC9319B0 b0, AbstractC9319B0 b02) {
        super(b0, b02);
    }

    @Override // p163j$.util.stream.AbstractC9319B0
    /* renamed from: b */
    public final Object mo16343b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            mo16342f(0, newArray);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p163j$.util.stream.AbstractC9319B0
    /* renamed from: f */
    public final void mo16342f(int i, Object obj) {
        AbstractC9324C0 c0 = this.f20474a;
        ((AbstractC9319B0) c0).mo16342f(i, obj);
        ((AbstractC9319B0) this.f20475b).mo16342f(i + ((int) ((AbstractC9319B0) c0).count()), obj);
    }

    @Override // p163j$.util.stream.AbstractC9319B0
    /* renamed from: g */
    public final void mo16341g(Object obj) {
        ((AbstractC9319B0) this.f20474a).mo16341g(obj);
        ((AbstractC9319B0) this.f20475b).mo16341g(obj);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: m */
    public final /* synthetic */ Object[] mo16318m(IntFunction intFunction) {
        return AbstractC0606t0.m16282X(this, intFunction);
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f20474a, this.f20475b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
