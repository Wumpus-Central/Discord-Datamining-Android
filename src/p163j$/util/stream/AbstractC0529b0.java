package p163j$.util.stream;

import p163j$.util.AbstractC0522s;
import p163j$.util.C0485f;
import p163j$.util.C0514j;
import p163j$.util.C0515k;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.AbstractC0507w;
import p163j$.util.function.AbstractC9284G;
import p163j$.util.function.AbstractC9304b0;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.C9278A;
import p163j$.util.function.C9279B;
import p163j$.util.function.C9281D;
import p163j$.util.function.C9285H;
import p163j$.util.function.IntConsumer;
import p163j$.util.function.IntFunction;
import p163j$.util.function.Supplier;

/* renamed from: j$.util.stream.b0 */
/* loaded from: classes2.dex */
abstract class AbstractC0529b0 extends AbstractC0533c implements IntStream {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0529b0(Spliterator.OfInt ofInt, int i) {
        super(ofInt, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0529b0(AbstractC0533c cVar, int i) {
        super(cVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public static Spliterator.OfInt m16395d1(Spliterator spliterator) {
        if (spliterator instanceof Spliterator.OfInt) {
            return (Spliterator.OfInt) spliterator;
        }
        if (AbstractC9347G3.f20498a) {
            AbstractC9347G3.m16469a(AbstractC0533c.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    /* renamed from: A */
    public void mo16405A(IntConsumer intConsumer) {
        intConsumer.getClass();
        m16386M0(new C9368M(intConsumer, true));
    }

    @Override // p163j$.util.stream.IntStream
    /* renamed from: B */
    public final Stream mo16404B(IntFunction intFunction) {
        intFunction.getClass();
        return new C0609u(this, EnumC9394S2.f20574p | EnumC9394S2.f20572n, intFunction, 1);
    }

    /* renamed from: C */
    public void mo16403C(IntConsumer intConsumer) {
        intConsumer.getClass();
        m16386M0(new C9368M(intConsumer, false));
    }

    @Override // p163j$.util.stream.IntStream
    /* renamed from: F */
    public final boolean mo16402F(C9279B b) {
        return ((Boolean) m16386M0(AbstractC0606t0.m16298E0(b, EnumC0595q0.ALL))).booleanValue();
    }

    @Override // p163j$.util.stream.IntStream
    /* renamed from: G */
    public final C0515k mo16401G(AbstractC0507w wVar) {
        wVar.getClass();
        return (C0515k) m16386M0(new C0627y1(EnumC9398T2.INT_VALUE, wVar, 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0606t0
    /* renamed from: G0 */
    public final AbstractC0622x0 mo16296G0(long j, IntFunction intFunction) {
        return AbstractC0606t0.m16301B0(j);
    }

    @Override // p163j$.util.stream.IntStream
    /* renamed from: H */
    public final IntStream mo16400H(IntConsumer intConsumer) {
        intConsumer.getClass();
        return new C0613v(this, 0, intConsumer, 1);
    }

    @Override // p163j$.util.stream.IntStream
    /* renamed from: K */
    public final boolean mo16399K(C9279B b) {
        return ((Boolean) m16386M0(AbstractC0606t0.m16298E0(b, EnumC0595q0.NONE))).booleanValue();
    }

    @Override // p163j$.util.stream.IntStream
    /* renamed from: M */
    public final IntStream mo16398M(C9278A a) {
        return new C0613v(this, EnumC9394S2.f20574p | EnumC9394S2.f20572n | EnumC9394S2.f20578t, a, 3);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: O0 */
    final AbstractC9324C0 mo16360O0(AbstractC0606t0 t0Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0606t0.m16264o0(t0Var, spliterator, z);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: P0 */
    final void mo16359P0(Spliterator spliterator, AbstractC0546e2 e2Var) {
        IntConsumer intConsumer;
        Spliterator.OfInt d1 = m16395d1(spliterator);
        if (e2Var instanceof IntConsumer) {
            intConsumer = (IntConsumer) e2Var;
        } else if (!AbstractC9347G3.f20498a) {
            e2Var.getClass();
            intConsumer = new C9395T(0, e2Var);
        } else {
            AbstractC9347G3.m16469a(AbstractC0533c.class, "using IntStream.adapt(Sink<Integer> s)");
            throw null;
        }
        while (!e2Var.mo16234e() && d1.tryAdvance(intConsumer)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: Q0 */
    public final EnumC9398T2 mo16358Q0() {
        return EnumC9398T2.INT_VALUE;
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: a1 */
    final Spliterator mo16357a1(AbstractC0606t0 t0Var, C0523a aVar, boolean z) {
        return new C0552f3(t0Var, aVar, z);
    }

    @Override // p163j$.util.stream.IntStream
    public final AbstractC9328D asDoubleStream() {
        return new C0621x(this, EnumC9394S2.f20574p | EnumC9394S2.f20572n, 1);
    }

    @Override // p163j$.util.stream.IntStream
    public final AbstractC0571k0 asLongStream() {
        return new C9407W(this, EnumC9394S2.f20574p | EnumC9394S2.f20572n, 0);
    }

    @Override // p163j$.util.stream.IntStream
    public final C0514j average() {
        long[] jArr = (long[]) mo16390n(new C0528b(17), new C0528b(18), new C0528b(19));
        long j = jArr[0];
        return j > 0 ? C0514j.m16498d(jArr[1] / j) : C0514j.m16501a();
    }

    @Override // p163j$.util.stream.IntStream
    /* renamed from: b */
    public final AbstractC0571k0 mo16397b(AbstractC9284G g) {
        g.getClass();
        return new C0617w(this, EnumC9394S2.f20574p | EnumC9394S2.f20572n, g, 1);
    }

    @Override // p163j$.util.stream.IntStream
    public final Stream boxed() {
        return mo16404B(new C9399U(1));
    }

    @Override // p163j$.util.stream.IntStream
    public final long count() {
        return ((AbstractC0563i0) mo16397b(new C0528b(16))).sum();
    }

    @Override // p163j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC9409W1) ((AbstractC9409W1) boxed()).distinct()).mo16414u(new C0528b(15));
    }

    @Override // p163j$.util.stream.IntStream
    public final C0515k findAny() {
        return (C0515k) m16386M0(new C9333E(false, EnumC9398T2.INT_VALUE, C0515k.m16497a(), new C9353I0(26), new C0528b(13)));
    }

    @Override // p163j$.util.stream.IntStream
    public final C0515k findFirst() {
        return (C0515k) m16386M0(new C9333E(true, EnumC9398T2.INT_VALUE, C0515k.m16497a(), new C9353I0(26), new C0528b(13)));
    }

    @Override // p163j$.util.stream.IntStream
    /* renamed from: g */
    public final IntStream mo16394g(C9285H h) {
        h.getClass();
        return new C0613v(this, EnumC9394S2.f20574p | EnumC9394S2.f20572n, h, 2);
    }

    @Override // p163j$.util.stream.IntStream
    /* renamed from: i */
    public final int mo16393i(int i, AbstractC0507w wVar) {
        wVar.getClass();
        return ((Integer) m16386M0(new C9345G1(EnumC9398T2.INT_VALUE, wVar, i))).intValue();
    }

    @Override // p163j$.util.stream.AbstractC0558h
    public final AbstractC0522s iterator() {
        return Spliterators.m16589g(spliterator());
    }

    @Override // p163j$.util.stream.IntStream
    /* renamed from: k */
    public final IntStream mo16392k(C9279B b) {
        b.getClass();
        return new C0613v(this, EnumC9394S2.f20578t, b, 4);
    }

    @Override // p163j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j >= 0) {
            return AbstractC0593p2.m16311f(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p163j$.util.stream.IntStream
    /* renamed from: m */
    public final boolean mo16391m(C9279B b) {
        return ((Boolean) m16386M0(AbstractC0606t0.m16298E0(b, EnumC0595q0.ANY))).booleanValue();
    }

    @Override // p163j$.util.stream.IntStream
    public final C0515k max() {
        return mo16401G(new C9399U(2));
    }

    @Override // p163j$.util.stream.IntStream
    public final C0515k min() {
        return mo16401G(new C9353I0(27));
    }

    @Override // p163j$.util.stream.IntStream
    /* renamed from: n */
    public final Object mo16390n(Supplier supplier, AbstractC9304b0 b0Var, BiConsumer biConsumer) {
        C0594q qVar = new C0594q(biConsumer, 1);
        supplier.getClass();
        b0Var.getClass();
        return m16386M0(new C0611u1(EnumC9398T2.INT_VALUE, qVar, b0Var, supplier, 4));
    }

    @Override // p163j$.util.stream.IntStream
    /* renamed from: r */
    public final AbstractC9328D mo16389r(C9281D d) {
        d.getClass();
        return new C0605t(this, EnumC9394S2.f20574p | EnumC9394S2.f20572n, d, 4);
    }

    @Override // p163j$.util.stream.IntStream
    public final IntStream skip(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : AbstractC0593p2.m16311f(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p163j$.util.stream.IntStream
    public final IntStream sorted() {
        return new C0628y2(this);
    }

    @Override // p163j$.util.stream.AbstractC0533c, p163j$.util.stream.AbstractC0558h
    public final Spliterator.OfInt spliterator() {
        return m16395d1(super.spliterator());
    }

    @Override // p163j$.util.stream.IntStream
    public final int sum() {
        return mo16393i(0, new C9353I0(28));
    }

    @Override // p163j$.util.stream.IntStream
    public final C0485f summaryStatistics() {
        return (C0485f) mo16390n(new C9353I0(13), new C9353I0(29), new C9399U(0));
    }

    @Override // p163j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC0606t0.m16253y0((AbstractC0630z0) m16385N0(new C0528b(20))).mo16343b();
    }

    @Override // p163j$.util.stream.AbstractC0558h
    public final AbstractC0558h unordered() {
        return !m16383S0() ? this : new C9411X(this, EnumC9394S2.f20576r);
    }
}
