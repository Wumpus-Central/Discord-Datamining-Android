package p163j$.util.stream;

import java.util.Iterator;
import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p163j$.util.AbstractC0513i;
import p163j$.util.C0511g;
import p163j$.util.C0514j;
import p163j$.util.C0516l;
import p163j$.util.C9443u;
import p163j$.util.Spliterators;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.C9287J;
import p163j$.util.function.C9289L;
import p163j$.util.function.C9291N;
import p163j$.util.function.C9293P;
import p163j$.util.function.C9295S;
import p163j$.util.function.C9297U;
import p163j$.util.function.C9299W;
import p163j$.util.function.C9305c0;
import p163j$.util.function.C9309g0;
import p163j$.util.stream.Stream;

/* renamed from: j$.util.stream.j0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0567j0 implements LongStream {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0571k0 f20677a;

    private /* synthetic */ C0567j0(AbstractC0571k0 k0Var) {
        this.f20677a = k0Var;
    }

    /* renamed from: l */
    public static /* synthetic */ C0567j0 m16344l(AbstractC0571k0 k0Var) {
        if (k0Var == null) {
            return null;
        }
        return new C0567j0(k0Var);
    }

    @Override // java.util.stream.LongStream
    public final boolean allMatch(LongPredicate longPredicate) {
        AbstractC0571k0 k0Var = this.f20677a;
        C9293P a = C9293P.m16540a(longPredicate);
        AbstractC0563i0 i0Var = (AbstractC0563i0) k0Var;
        i0Var.getClass();
        return ((Boolean) i0Var.m16386M0(AbstractC0606t0.m16297F0(a, EnumC0595q0.ALL))).booleanValue();
    }

    @Override // java.util.stream.LongStream
    public final boolean anyMatch(LongPredicate longPredicate) {
        AbstractC0571k0 k0Var = this.f20677a;
        C9293P a = C9293P.m16540a(longPredicate);
        AbstractC0563i0 i0Var = (AbstractC0563i0) k0Var;
        i0Var.getClass();
        return ((Boolean) i0Var.m16386M0(AbstractC0606t0.m16297F0(a, EnumC0595q0.ANY))).booleanValue();
    }

    @Override // java.util.stream.LongStream
    public final DoubleStream asDoubleStream() {
        AbstractC0563i0 i0Var = (AbstractC0563i0) this.f20677a;
        i0Var.getClass();
        return C9323C.m16470l(new C0621x(i0Var, EnumC9394S2.f20574p | EnumC9394S2.f20572n, 2));
    }

    @Override // java.util.stream.LongStream
    public final OptionalDouble average() {
        AbstractC0563i0 i0Var = (AbstractC0563i0) this.f20677a;
        i0Var.getClass();
        long[] jArr = (long[]) i0Var.m16354e1(new C0528b(24), new C0528b(25), new C0528b(26));
        long j = jArr[0];
        return AbstractC0513i.m16504b(j > 0 ? C0514j.m16498d(jArr[1] / j) : C0514j.m16501a());
    }

    @Override // java.util.stream.LongStream
    public final Stream boxed() {
        AbstractC0563i0 i0Var = (AbstractC0563i0) this.f20677a;
        i0Var.getClass();
        return Stream.Wrapper.convert(new C0609u(i0Var, EnumC9394S2.f20574p | EnumC9394S2.f20572n, new C9399U(5), 2));
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ((AbstractC0533c) this.f20677a).close();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return ((AbstractC0563i0) this.f20677a).m16354e1(C9309g0.m16525a(supplier), C9305c0.m16529a(objLongConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.stream.LongStream
    public final long count() {
        AbstractC0563i0 i0Var = (AbstractC0563i0) this.f20677a;
        i0Var.getClass();
        return new C0617w(i0Var, EnumC9394S2.f20574p | EnumC9394S2.f20572n, new C0528b(21), 2).sum();
    }

    @Override // java.util.stream.LongStream
    public final LongStream distinct() {
        AbstractC0563i0 i0Var = (AbstractC0563i0) this.f20677a;
        i0Var.getClass();
        return m16344l(((AbstractC9409W1) new C0609u(i0Var, EnumC9394S2.f20574p | EnumC9394S2.f20572n, new C9399U(5), 2).distinct()).mo16425J(new C0528b(22)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC0571k0 k0Var = this.f20677a;
        if (obj instanceof C0567j0) {
            obj = ((C0567j0) obj).f20677a;
        }
        return k0Var.equals(obj);
    }

    @Override // java.util.stream.LongStream
    public final LongStream filter(LongPredicate longPredicate) {
        AbstractC0571k0 k0Var = this.f20677a;
        C9293P a = C9293P.m16540a(longPredicate);
        AbstractC0563i0 i0Var = (AbstractC0563i0) k0Var;
        i0Var.getClass();
        a.getClass();
        return m16344l(new C0617w(i0Var, EnumC9394S2.f20578t, a, 4));
    }

    @Override // java.util.stream.LongStream
    public final OptionalLong findAny() {
        return AbstractC0513i.m16502d((C0516l) ((AbstractC0563i0) this.f20677a).m16386M0(new C9333E(false, EnumC9398T2.LONG_VALUE, C0516l.m16493a(), new C9353I0(24), new C0528b(11))));
    }

    @Override // java.util.stream.LongStream
    public final OptionalLong findFirst() {
        return AbstractC0513i.m16502d((C0516l) ((AbstractC0563i0) this.f20677a).m16386M0(new C9333E(true, EnumC9398T2.LONG_VALUE, C0516l.m16493a(), new C9353I0(24), new C0528b(11))));
    }

    @Override // java.util.stream.LongStream
    public final LongStream flatMap(LongFunction longFunction) {
        AbstractC0571k0 k0Var = this.f20677a;
        C9291N a = C9291N.m16541a(longFunction);
        AbstractC0563i0 i0Var = (AbstractC0563i0) k0Var;
        i0Var.getClass();
        return m16344l(new C0617w(i0Var, EnumC9394S2.f20574p | EnumC9394S2.f20572n | EnumC9394S2.f20578t, a, 3));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f20677a.mo16337q(C9289L.m16542a(longConsumer));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f20677a.mo16338o(C9289L.m16542a(longConsumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f20677a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return ((AbstractC0533c) this.f20677a).isParallel();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final Iterator<Long> iterator() {
        return Spliterators.m16588h(((AbstractC0563i0) this.f20677a).spliterator());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: iterator */
    public final Iterator<Long> iterator2() {
        return C9443u.m16227a(Spliterators.m16588h(((AbstractC0563i0) this.f20677a).spliterator()));
    }

    @Override // java.util.stream.LongStream
    public final LongStream limit(long j) {
        AbstractC0563i0 i0Var = (AbstractC0563i0) this.f20677a;
        i0Var.getClass();
        if (j >= 0) {
            return m16344l(AbstractC0593p2.m16310g(i0Var, 0L, j));
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // java.util.stream.LongStream
    public final LongStream map(LongUnaryOperator longUnaryOperator) {
        AbstractC0571k0 k0Var = this.f20677a;
        C9299W a = C9299W.m16534a(longUnaryOperator);
        AbstractC0563i0 i0Var = (AbstractC0563i0) k0Var;
        i0Var.getClass();
        a.getClass();
        return m16344l(new C0617w(i0Var, EnumC9394S2.f20574p | EnumC9394S2.f20572n, a, 2));
    }

    @Override // java.util.stream.LongStream
    public final DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        AbstractC0571k0 k0Var = this.f20677a;
        C9295S b = C9295S.m16537b(longToDoubleFunction);
        AbstractC0563i0 i0Var = (AbstractC0563i0) k0Var;
        i0Var.getClass();
        b.getClass();
        return C9323C.m16470l(new C0605t(i0Var, EnumC9394S2.f20574p | EnumC9394S2.f20572n, b, 5));
    }

    @Override // java.util.stream.LongStream
    public final IntStream mapToInt(LongToIntFunction longToIntFunction) {
        AbstractC0571k0 k0Var = this.f20677a;
        C9297U b = C9297U.m16535b(longToIntFunction);
        AbstractC0563i0 i0Var = (AbstractC0563i0) k0Var;
        i0Var.getClass();
        b.getClass();
        return C0534c0.m16378l(new C0613v(i0Var, EnumC9394S2.f20574p | EnumC9394S2.f20572n, b, 5));
    }

    @Override // java.util.stream.LongStream
    public final java.util.stream.Stream mapToObj(LongFunction longFunction) {
        AbstractC0571k0 k0Var = this.f20677a;
        C9291N a = C9291N.m16541a(longFunction);
        AbstractC0563i0 i0Var = (AbstractC0563i0) k0Var;
        i0Var.getClass();
        a.getClass();
        return Stream.Wrapper.convert(new C0609u(i0Var, EnumC9394S2.f20574p | EnumC9394S2.f20572n, a, 2));
    }

    @Override // java.util.stream.LongStream
    public final OptionalLong max() {
        AbstractC0563i0 i0Var = (AbstractC0563i0) this.f20677a;
        i0Var.getClass();
        return AbstractC0513i.m16502d(i0Var.m16353f1(new C9399U(4)));
    }

    @Override // java.util.stream.LongStream
    public final OptionalLong min() {
        AbstractC0563i0 i0Var = (AbstractC0563i0) this.f20677a;
        i0Var.getClass();
        return AbstractC0513i.m16502d(i0Var.m16353f1(new C9399U(3)));
    }

    @Override // java.util.stream.LongStream
    public final boolean noneMatch(LongPredicate longPredicate) {
        AbstractC0571k0 k0Var = this.f20677a;
        C9293P a = C9293P.m16540a(longPredicate);
        AbstractC0563i0 i0Var = (AbstractC0563i0) k0Var;
        i0Var.getClass();
        return ((Boolean) i0Var.m16386M0(AbstractC0606t0.m16297F0(a, EnumC0595q0.NONE))).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ LongStream onClose(Runnable runnable) {
        AbstractC0533c cVar = (AbstractC0533c) this.f20677a;
        cVar.onClose(runnable);
        return C0553g.m16368l(cVar);
    }

    @Override // java.util.stream.LongStream
    public final LongStream peek(LongConsumer longConsumer) {
        AbstractC0571k0 k0Var = this.f20677a;
        C9289L a = C9289L.m16542a(longConsumer);
        AbstractC0563i0 i0Var = (AbstractC0563i0) k0Var;
        i0Var.getClass();
        a.getClass();
        return m16344l(new C0617w(i0Var, 0, a, 5));
    }

    @Override // java.util.stream.LongStream
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        AbstractC0571k0 k0Var = this.f20677a;
        C9287J a = C9287J.m16543a(longBinaryOperator);
        AbstractC0563i0 i0Var = (AbstractC0563i0) k0Var;
        i0Var.getClass();
        a.getClass();
        return ((Long) i0Var.m16386M0(new C9362K1(EnumC9398T2.LONG_VALUE, a, j))).longValue();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC0513i.m16502d(((AbstractC0563i0) this.f20677a).m16353f1(C9287J.m16543a(longBinaryOperator)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.k0] */
    @Override // java.util.stream.LongStream
    public final LongStream skip(long j) {
        AbstractC0563i0 i0Var = (AbstractC0563i0) this.f20677a;
        i0Var.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        AbstractC0563i0 i0Var2 = i0Var;
        if (i >= 0) {
            if (i != 0) {
                i0Var2 = AbstractC0593p2.m16310g(i0Var, j, -1L);
            }
            return m16344l(i0Var2);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // java.util.stream.LongStream
    public final LongStream sorted() {
        AbstractC0563i0 i0Var = (AbstractC0563i0) this.f20677a;
        i0Var.getClass();
        return m16344l(new C0632z2(i0Var));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return ((AbstractC0563i0) this.f20677a).sum();
    }

    @Override // java.util.stream.LongStream
    public final LongSummaryStatistics summaryStatistics() {
        AbstractC0563i0 i0Var = (AbstractC0563i0) this.f20677a;
        i0Var.getClass();
        C0511g gVar = (C0511g) i0Var.m16354e1(new C9353I0(14), new C9399U(7), new C9399U(8));
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    @Override // java.util.stream.LongStream
    public final long[] toArray() {
        AbstractC0563i0 i0Var = (AbstractC0563i0) this.f20677a;
        i0Var.getClass();
        return (long[]) AbstractC0606t0.m16252z0((AbstractC9314A0) i0Var.m16385N0(new C0528b(23))).mo16343b();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ LongStream unordered() {
        return C0553g.m16368l(((AbstractC0563i0) this.f20677a).unordered());
    }
}
