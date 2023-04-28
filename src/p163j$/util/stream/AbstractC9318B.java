package p163j$.util.stream;

import java.util.Iterator;
import p163j$.util.AbstractC9447y;
import p163j$.util.C0514j;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.AbstractC0492g;
import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.AbstractC9302Z;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.C0493h;
import p163j$.util.function.IntFunction;
import p163j$.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.B */
/* loaded from: classes2.dex */
public abstract class AbstractC9318B extends AbstractC0533c implements AbstractC9328D {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9318B(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9318B(AbstractC0533c cVar, int i) {
        super(cVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public static AbstractC9447y m16474d1(Spliterator spliterator) {
        if (spliterator instanceof AbstractC9447y) {
            return (AbstractC9447y) spliterator;
        }
        if (AbstractC9347G3.f20498a) {
            AbstractC9347G3.m16469a(AbstractC0533c.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0606t0
    /* renamed from: G0 */
    public final AbstractC0622x0 mo16296G0(long j, IntFunction intFunction) {
        return AbstractC0606t0.m16259t0(j);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: O0 */
    final AbstractC9324C0 mo16360O0(AbstractC0606t0 t0Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0606t0.m16265n0(t0Var, spliterator, z);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: P0 */
    final void mo16359P0(Spliterator spliterator, AbstractC0546e2 e2Var) {
        AbstractC0494i iVar;
        AbstractC9447y d1 = m16474d1(spliterator);
        if (e2Var instanceof AbstractC0494i) {
            iVar = (AbstractC0494i) e2Var;
        } else if (!AbstractC9347G3.f20498a) {
            e2Var.getClass();
            iVar = new C9433r(0, e2Var);
        } else {
            AbstractC9347G3.m16469a(AbstractC0533c.class, "using DoubleStream.adapt(Sink<Double> s)");
            throw null;
        }
        while (!e2Var.mo16234e() && d1.mo16225f(iVar)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: Q0 */
    public final EnumC9398T2 mo16358Q0() {
        return EnumC9398T2.DOUBLE_VALUE;
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: a1 */
    final Spliterator mo16357a1(AbstractC0606t0 t0Var, C0523a aVar, boolean z) {
        return new C0542d3(t0Var, aVar, z);
    }

    /* renamed from: e1 */
    public final Object m16473e1(Supplier supplier, AbstractC9302Z z, BiConsumer biConsumer) {
        C0594q qVar = new C0594q(biConsumer, 0);
        supplier.getClass();
        z.getClass();
        return m16386M0(new C0611u1(EnumC9398T2.DOUBLE_VALUE, qVar, z, supplier, 1));
    }

    /* renamed from: f1 */
    public final C0514j m16472f1(AbstractC0492g gVar) {
        gVar.getClass();
        return (C0514j) m16386M0(new C0627y1(EnumC9398T2.DOUBLE_VALUE, gVar, 0));
    }

    /* renamed from: g1 */
    public final AbstractC9447y spliterator() {
        return m16474d1(super.spliterator());
    }

    @Override // p163j$.util.stream.AbstractC0558h
    public final Iterator iterator() {
        return Spliterators.m16590f(spliterator());
    }

    @Override // p163j$.util.stream.AbstractC9328D
    /* renamed from: t */
    public void mo16239t(AbstractC0494i iVar) {
        iVar.getClass();
        m16386M0(new C9364L(iVar, false));
    }

    @Override // p163j$.util.stream.AbstractC0558h
    public final AbstractC0558h unordered() {
        return !m16383S0() ? this : new C0621x(this, EnumC9394S2.f20576r, 0);
    }

    @Override // p163j$.util.stream.AbstractC9328D
    /* renamed from: z */
    public void mo16238z(C0493h hVar) {
        hVar.getClass();
        m16386M0(new C9364L(hVar, true));
    }
}
