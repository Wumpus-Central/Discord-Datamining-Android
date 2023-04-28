package p163j$.util.stream;

import java.util.Iterator;
import p163j$.util.AbstractC9234B;
import p163j$.util.C0516l;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.AbstractC9288K;
import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.AbstractC9306d0;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.C9289L;
import p163j$.util.function.IntFunction;
import p163j$.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.i0 */
/* loaded from: classes2.dex */
public abstract class AbstractC0563i0 extends AbstractC0533c implements AbstractC0571k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0563i0(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0563i0(AbstractC0533c cVar, int i) {
        super(cVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public static AbstractC9234B m16355d1(Spliterator spliterator) {
        if (spliterator instanceof AbstractC9234B) {
            return (AbstractC9234B) spliterator;
        }
        if (AbstractC9347G3.f20498a) {
            AbstractC9347G3.m16469a(AbstractC0533c.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0606t0
    /* renamed from: G0 */
    public final AbstractC0622x0 mo16296G0(long j, IntFunction intFunction) {
        return AbstractC0606t0.m16300C0(j);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: O0 */
    final AbstractC9324C0 mo16360O0(AbstractC0606t0 t0Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0606t0.m16263p0(t0Var, spliterator, z);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: P0 */
    final void mo16359P0(Spliterator spliterator, AbstractC0546e2 e2Var) {
        AbstractC9290M m;
        AbstractC9234B d1 = m16355d1(spliterator);
        if (e2Var instanceof AbstractC9290M) {
            m = (AbstractC9290M) e2Var;
        } else if (!AbstractC9347G3.f20498a) {
            e2Var.getClass();
            m = new C0539d0(0, e2Var);
        } else {
            AbstractC9347G3.m16469a(AbstractC0533c.class, "using LongStream.adapt(Sink<Long> s)");
            throw null;
        }
        while (!e2Var.mo16234e() && d1.mo16361b(m)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: Q0 */
    public final EnumC9398T2 mo16358Q0() {
        return EnumC9398T2.LONG_VALUE;
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: a1 */
    final Spliterator mo16357a1(AbstractC0606t0 t0Var, C0523a aVar, boolean z) {
        return new C9423h3(t0Var, aVar, z);
    }

    /* renamed from: e1 */
    public final Object m16354e1(Supplier supplier, AbstractC9306d0 d0Var, BiConsumer biConsumer) {
        C0594q qVar = new C0594q(biConsumer, 2);
        supplier.getClass();
        d0Var.getClass();
        return m16386M0(new C0611u1(EnumC9398T2.LONG_VALUE, qVar, d0Var, supplier, 0));
    }

    /* renamed from: f1 */
    public final C0516l m16353f1(AbstractC9288K k) {
        k.getClass();
        return (C0516l) m16386M0(new C0627y1(EnumC9398T2.LONG_VALUE, k, 3));
    }

    /* renamed from: g1 */
    public final AbstractC9234B spliterator() {
        return m16355d1(super.spliterator());
    }

    @Override // p163j$.util.stream.AbstractC0558h
    public final Iterator iterator() {
        return Spliterators.m16588h(spliterator());
    }

    /* renamed from: o */
    public void mo16338o(C9289L l) {
        l.getClass();
        m16386M0(new C9372N(l, true));
    }

    /* renamed from: q */
    public void mo16337q(AbstractC9290M m) {
        m.getClass();
        m16386M0(new C9372N(m, false));
    }

    public final long sum() {
        return ((Long) m16386M0(new C9362K1(EnumC9398T2.LONG_VALUE, new C9399U(6), 0L))).longValue();
    }

    @Override // p163j$.util.stream.AbstractC0558h
    public final AbstractC0558h unordered() {
        return !m16383S0() ? this : new C9407W(this, EnumC9394S2.f20576r, 1);
    }
}
