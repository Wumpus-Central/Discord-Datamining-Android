package p163j$.util.stream;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p163j$.util.AbstractC0513i;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.C0506v;
import p163j$.util.function.C0509y;
import p163j$.util.function.C9278A;
import p163j$.util.function.C9279B;
import p163j$.util.function.C9281D;
import p163j$.util.function.C9283F;
import p163j$.util.function.C9285H;
import p163j$.util.function.C9303a0;
import p163j$.util.function.C9309g0;
import p163j$.util.stream.Stream;

/* renamed from: j$.util.stream.c0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0534c0 implements IntStream {

    /* renamed from: a */
    public final /* synthetic */ IntStream f20633a;

    private /* synthetic */ C0534c0(IntStream intStream) {
        this.f20633a = intStream;
    }

    /* renamed from: l */
    public static /* synthetic */ C0534c0 m16378l(IntStream intStream) {
        if (intStream == null) {
            return null;
        }
        return new C0534c0(intStream);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
        return this.f20633a.mo16402F(C9279B.m16550a(intPredicate));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
        return this.f20633a.mo16391m(C9279B.m16550a(intPredicate));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ DoubleStream asDoubleStream() {
        return C9323C.m16470l(this.f20633a.asDoubleStream());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ LongStream asLongStream() {
        return C0567j0.m16344l(this.f20633a.asLongStream());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalDouble average() {
        return AbstractC0513i.m16504b(this.f20633a.average());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ Stream boxed() {
        return Stream.Wrapper.convert(this.f20633a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f20633a.close();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return this.f20633a.mo16390n(C9309g0.m16525a(supplier), C9303a0.m16531b(objIntConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ long count() {
        return this.f20633a.count();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream distinct() {
        return m16378l(this.f20633a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntStream intStream = this.f20633a;
        if (obj instanceof C0534c0) {
            obj = ((C0534c0) obj).f20633a;
        }
        return intStream.equals(obj);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream filter(IntPredicate intPredicate) {
        return m16378l(this.f20633a.mo16392k(C9279B.m16550a(intPredicate)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt findAny() {
        return AbstractC0513i.m16503c(this.f20633a.findAny());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt findFirst() {
        return AbstractC0513i.m16503c(this.f20633a.findFirst());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream flatMap(IntFunction intFunction) {
        return m16378l(this.f20633a.mo16398M(C9278A.m16551a(intFunction)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEach(IntConsumer intConsumer) {
        this.f20633a.mo16403C(C0509y.m16512a(intConsumer));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
        this.f20633a.mo16405A(C0509y.m16512a(intConsumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f20633a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f20633a.isParallel();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream limit(long j) {
        return m16378l(this.f20633a.limit(j));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream map(IntUnaryOperator intUnaryOperator) {
        return m16378l(this.f20633a.mo16394g(C9285H.m16544b(intUnaryOperator)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        return C9323C.m16470l(this.f20633a.mo16389r(C9281D.m16547b(intToDoubleFunction)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
        return C0567j0.m16344l(this.f20633a.mo16397b(C9283F.m16546a(intToLongFunction)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(IntFunction intFunction) {
        return Stream.Wrapper.convert(this.f20633a.mo16404B(C9278A.m16551a(intFunction)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt max() {
        return AbstractC0513i.m16503c(this.f20633a.max());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt min() {
        return AbstractC0513i.m16503c(this.f20633a.min());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
        return this.f20633a.mo16399K(C9279B.m16550a(intPredicate));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ IntStream onClose(Runnable runnable) {
        return C0553g.m16368l(this.f20633a.onClose(runnable));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream peek(IntConsumer intConsumer) {
        return m16378l(this.f20633a.mo16400H(C0509y.m16512a(intConsumer)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
        return this.f20633a.mo16393i(i, C0506v.m16513a(intBinaryOperator));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        return AbstractC0513i.m16503c(this.f20633a.mo16401G(C0506v.m16513a(intBinaryOperator)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream skip(long j) {
        return m16378l(this.f20633a.skip(j));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream sorted() {
        return m16378l(this.f20633a.sorted());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int sum() {
        return this.f20633a.sum();
    }

    @Override // java.util.stream.IntStream
    public final IntSummaryStatistics summaryStatistics() {
        this.f20633a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int[] toArray() {
        return this.f20633a.toArray();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ IntStream unordered() {
        return C0553g.m16368l(this.f20633a.unordered());
    }
}
