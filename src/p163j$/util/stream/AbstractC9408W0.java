package p163j$.util.stream;

import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.W0 */
/* loaded from: classes2.dex */
public abstract class AbstractC9408W0 implements AbstractC9324C0 {
    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: a */
    public AbstractC9324C0 mo16321a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final long count() {
        return 0L;
    }

    /* renamed from: f */
    public final void m16430f(int i, Object obj) {
    }

    /* renamed from: g */
    public final void m16429g(Object obj) {
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: l */
    public final /* synthetic */ int mo16319l() {
        return 0;
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: m */
    public final Object[] mo16318m(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: n */
    public /* synthetic */ AbstractC9324C0 mo16317n(long j, long j2, IntFunction intFunction) {
        return AbstractC0606t0.m16272h0(this, j, j2, intFunction);
    }
}
