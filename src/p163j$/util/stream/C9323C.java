package p163j$.util.stream;

import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p163j$.util.AbstractC0513i;
import p163j$.util.C0484e;
import p163j$.util.C0514j;
import p163j$.util.C0519o;
import p163j$.util.Spliterators;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.C0491f;
import p163j$.util.function.C0493h;
import p163j$.util.function.C0495j;
import p163j$.util.function.C0497l;
import p163j$.util.function.C0499n;
import p163j$.util.function.C0501p;
import p163j$.util.function.C9301Y;
import p163j$.util.function.C9309g0;
import p163j$.util.function.C9311r;
import p163j$.util.stream.Stream;

/* renamed from: j$.util.stream.C */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9323C implements DoubleStream {

    /* renamed from: a */
    public final /* synthetic */ AbstractC9328D f20454a;

    private /* synthetic */ C9323C(AbstractC9328D d) {
        this.f20454a = d;
    }

    /* renamed from: l */
    public static /* synthetic */ C9323C m16470l(AbstractC9328D d) {
        if (d == null) {
            return null;
        }
        return new C9323C(d);
    }

    @Override // java.util.stream.DoubleStream
    public final boolean allMatch(DoublePredicate doublePredicate) {
        AbstractC9328D d = this.f20454a;
        C0497l a = C0497l.m16521a(doublePredicate);
        AbstractC9318B b = (AbstractC9318B) d;
        b.getClass();
        return ((Boolean) b.m16386M0(AbstractC0606t0.m16299D0(a, EnumC0595q0.ALL))).booleanValue();
    }

    @Override // java.util.stream.DoubleStream
    public final boolean anyMatch(DoublePredicate doublePredicate) {
        AbstractC9328D d = this.f20454a;
        C0497l a = C0497l.m16521a(doublePredicate);
        AbstractC9318B b = (AbstractC9318B) d;
        b.getClass();
        return ((Boolean) b.m16386M0(AbstractC0606t0.m16299D0(a, EnumC0595q0.ANY))).booleanValue();
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble average() {
        C0514j jVar;
        AbstractC9318B b = (AbstractC9318B) this.f20454a;
        b.getClass();
        double[] dArr = (double[]) b.m16473e1(new C0528b(5), new C0528b(6), new C0528b(7));
        if (dArr[2] > 0.0d) {
            int i = AbstractC0574l.f20685a;
            double d = dArr[0] + dArr[1];
            double d2 = dArr[dArr.length - 1];
            if (Double.isNaN(d) && Double.isInfinite(d2)) {
                d = d2;
            }
            jVar = C0514j.m16498d(d / dArr[2]);
        } else {
            jVar = C0514j.m16501a();
        }
        return AbstractC0513i.m16504b(jVar);
    }

    @Override // java.util.stream.DoubleStream
    public final Stream boxed() {
        AbstractC9318B b = (AbstractC9318B) this.f20454a;
        b.getClass();
        return Stream.Wrapper.convert(new C0609u(b, EnumC9394S2.f20574p | EnumC9394S2.f20572n, new C9353I0(20), 0));
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ((AbstractC0533c) this.f20454a).close();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return ((AbstractC9318B) this.f20454a).m16473e1(C9309g0.m16525a(supplier), C9301Y.m16533a(objDoubleConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public final long count() {
        AbstractC9318B b = (AbstractC9318B) this.f20454a;
        b.getClass();
        return new C0617w(b, EnumC9394S2.f20574p | EnumC9394S2.f20572n, new C0528b(4), 0).sum();
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream distinct() {
        AbstractC9318B b = (AbstractC9318B) this.f20454a;
        b.getClass();
        return m16470l(((AbstractC9409W1) new C0609u(b, EnumC9394S2.f20574p | EnumC9394S2.f20572n, new C9353I0(20), 0).distinct()).mo16424L(new C0528b(8)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC9328D d = this.f20454a;
        if (obj instanceof C9323C) {
            obj = ((C9323C) obj).f20454a;
        }
        return d.equals(obj);
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream filter(DoublePredicate doublePredicate) {
        AbstractC9328D d = this.f20454a;
        C0497l a = C0497l.m16521a(doublePredicate);
        AbstractC9318B b = (AbstractC9318B) d;
        b.getClass();
        a.getClass();
        return m16470l(new C0605t(b, EnumC9394S2.f20578t, a, 2));
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble findAny() {
        return AbstractC0513i.m16504b((C0514j) ((AbstractC9318B) this.f20454a).m16386M0(new C9333E(false, EnumC9398T2.DOUBLE_VALUE, C0514j.m16501a(), new C9353I0(23), new C0528b(10))));
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble findFirst() {
        return AbstractC0513i.m16504b((C0514j) ((AbstractC9318B) this.f20454a).m16386M0(new C9333E(true, EnumC9398T2.DOUBLE_VALUE, C0514j.m16501a(), new C9353I0(23), new C0528b(10))));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream flatMap(DoubleFunction doubleFunction) {
        AbstractC9328D d = this.f20454a;
        C0495j a = C0495j.m16522a(doubleFunction);
        AbstractC9318B b = (AbstractC9318B) d;
        b.getClass();
        return m16470l(new C0605t(b, EnumC9394S2.f20574p | EnumC9394S2.f20572n | EnumC9394S2.f20578t, a, 1));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f20454a.mo16239t(C0493h.m16524a(doubleConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f20454a.mo16238z(C0493h.m16524a(doubleConsumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f20454a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return ((AbstractC0533c) this.f20454a).isParallel();
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final Iterator<Double> iterator() {
        return Spliterators.m16590f(((AbstractC9318B) this.f20454a).spliterator());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: iterator */
    public final Iterator<Double> iterator2() {
        return C0519o.m16481a(Spliterators.m16590f(((AbstractC9318B) this.f20454a).spliterator()));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream limit(long j) {
        AbstractC9318B b = (AbstractC9318B) this.f20454a;
        b.getClass();
        if (j >= 0) {
            return m16470l(AbstractC0593p2.m16312e(b, 0L, j));
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        AbstractC9328D d = this.f20454a;
        C9311r b = C9311r.m16515b(doubleUnaryOperator);
        AbstractC9318B b2 = (AbstractC9318B) d;
        b2.getClass();
        b.getClass();
        return m16470l(new C0605t(b2, EnumC9394S2.f20574p | EnumC9394S2.f20572n, b, 0));
    }

    @Override // java.util.stream.DoubleStream
    public final IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        AbstractC9328D d = this.f20454a;
        C0499n b = C0499n.m16518b(doubleToIntFunction);
        AbstractC9318B b2 = (AbstractC9318B) d;
        b2.getClass();
        b.getClass();
        return C0534c0.m16378l(new C0613v(b2, EnumC9394S2.f20574p | EnumC9394S2.f20572n, b, 0));
    }

    @Override // java.util.stream.DoubleStream
    public final LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        AbstractC9328D d = this.f20454a;
        C0501p a = C0501p.m16517a(doubleToLongFunction);
        AbstractC9318B b = (AbstractC9318B) d;
        b.getClass();
        a.getClass();
        return C0567j0.m16344l(new C0617w(b, EnumC9394S2.f20574p | EnumC9394S2.f20572n, a, 0));
    }

    @Override // java.util.stream.DoubleStream
    public final java.util.stream.Stream mapToObj(DoubleFunction doubleFunction) {
        AbstractC9328D d = this.f20454a;
        C0495j a = C0495j.m16522a(doubleFunction);
        AbstractC9318B b = (AbstractC9318B) d;
        b.getClass();
        a.getClass();
        return Stream.Wrapper.convert(new C0609u(b, EnumC9394S2.f20574p | EnumC9394S2.f20572n, a, 0));
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble max() {
        AbstractC9318B b = (AbstractC9318B) this.f20454a;
        b.getClass();
        return AbstractC0513i.m16504b(b.m16472f1(new C9353I0(19)));
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble min() {
        AbstractC9318B b = (AbstractC9318B) this.f20454a;
        b.getClass();
        return AbstractC0513i.m16504b(b.m16472f1(new C9353I0(18)));
    }

    @Override // java.util.stream.DoubleStream
    public final boolean noneMatch(DoublePredicate doublePredicate) {
        AbstractC9328D d = this.f20454a;
        C0497l a = C0497l.m16521a(doublePredicate);
        AbstractC9318B b = (AbstractC9318B) d;
        b.getClass();
        return ((Boolean) b.m16386M0(AbstractC0606t0.m16299D0(a, EnumC0595q0.NONE))).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream onClose(Runnable runnable) {
        AbstractC0533c cVar = (AbstractC0533c) this.f20454a;
        cVar.onClose(runnable);
        return C0553g.m16368l(cVar);
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream peek(DoubleConsumer doubleConsumer) {
        AbstractC9328D d = this.f20454a;
        C0493h a = C0493h.m16524a(doubleConsumer);
        AbstractC9318B b = (AbstractC9318B) d;
        b.getClass();
        a.getClass();
        return m16470l(new C0605t(b, 0, a, 3));
    }

    @Override // java.util.stream.DoubleStream
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        AbstractC9328D d2 = this.f20454a;
        C0491f a = C0491f.m16527a(doubleBinaryOperator);
        AbstractC9318B b = (AbstractC9318B) d2;
        b.getClass();
        a.getClass();
        return ((Double) b.m16386M0(new C0619w1(EnumC9398T2.DOUBLE_VALUE, a, d))).doubleValue();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC0513i.m16504b(((AbstractC9318B) this.f20454a).m16472f1(C0491f.m16527a(doubleBinaryOperator)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.D] */
    @Override // java.util.stream.DoubleStream
    public final DoubleStream skip(long j) {
        AbstractC9318B b = (AbstractC9318B) this.f20454a;
        b.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        AbstractC9318B b2 = b;
        if (i >= 0) {
            if (i != 0) {
                b2 = AbstractC0593p2.m16312e(b, j, -1L);
            }
            return m16470l(b2);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream sorted() {
        AbstractC9318B b = (AbstractC9318B) this.f20454a;
        b.getClass();
        return m16470l(new C0624x2(b));
    }

    @Override // java.util.stream.DoubleStream
    public final double sum() {
        AbstractC9318B b = (AbstractC9318B) this.f20454a;
        b.getClass();
        double[] dArr = (double[]) b.m16473e1(new C0528b(9), new C0528b(2), new C0528b(3));
        int i = AbstractC0574l.f20685a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (!Double.isNaN(d) || !Double.isInfinite(d2)) ? d : d2;
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleSummaryStatistics summaryStatistics() {
        AbstractC9318B b = (AbstractC9318B) this.f20454a;
        b.getClass();
        C0484e eVar = (C0484e) b.m16473e1(new C9353I0(12), new C9353I0(21), new C9353I0(22));
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics");
    }

    @Override // java.util.stream.DoubleStream
    public final double[] toArray() {
        AbstractC9318B b = (AbstractC9318B) this.f20454a;
        b.getClass();
        return (double[]) AbstractC0606t0.m16255x0((AbstractC0626y0) b.m16385N0(new C0528b(1))).mo16343b();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream unordered() {
        return C0553g.m16368l(((AbstractC9318B) this.f20454a).unordered());
    }
}
