package p163j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import p163j$.util.AbstractC0513i;
import p163j$.util.C0512h;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC0489d;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.BiFunction;
import p163j$.util.function.C0488c;
import p163j$.util.function.C9278A;
import p163j$.util.function.C9309g0;
import p163j$.util.function.Consumer;
import p163j$.util.function.Function;
import p163j$.util.function.Predicate;
import p163j$.util.function.ToDoubleFunction;
import p163j$.util.function.ToIntFunction;
import p163j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.Stream */
/* loaded from: classes2.dex */
public interface Stream<T> extends AbstractC0558h {

    /* renamed from: j$.util.stream.Stream$Wrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class Wrapper implements java.util.stream.Stream {
        private /* synthetic */ Wrapper() {
            Stream.this = r1;
        }

        public static /* synthetic */ java.util.stream.Stream convert(Stream stream) {
            if (stream == null) {
                return null;
            }
            return new Wrapper();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean allMatch(Predicate predicate) {
            return Stream.this.mo16428D(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean anyMatch(java.util.function.Predicate predicate) {
            return Stream.this.mo16416p(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            Stream.this.close();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
            return Stream.this.mo16420e(C9309g0.m16525a(supplier), BiConsumer.VivifiedWrapper.convert(biConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer2));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object collect(Collector collector) {
            return Stream.this.mo16421d(C0566j.m16347d(collector));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ long count() {
            return Stream.this.count();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream distinct() {
            return convert(Stream.this.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            Stream stream = Stream.this;
            if (obj instanceof Wrapper) {
                obj = Stream.this;
            }
            return stream.equals(obj);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream filter(java.util.function.Predicate predicate) {
            return convert(Stream.this.filter(Predicate.VivifiedWrapper.convert(predicate)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional findAny() {
            return AbstractC0513i.m16505a(Stream.this.findAny());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional findFirst() {
            return AbstractC0513i.m16505a(Stream.this.findFirst());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream flatMap(Function function) {
            return convert(Stream.this.mo16412w(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ DoubleStream flatMapToDouble(java.util.function.Function function) {
            return C9323C.m16470l(Stream.this.mo16419f(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ IntStream flatMapToInt(java.util.function.Function function) {
            return C0534c0.m16378l(Stream.this.mo16423a(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ LongStream flatMapToLong(java.util.function.Function function) {
            return C0567j0.m16344l(Stream.this.mo16427E(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEach(Consumer consumer) {
            Stream.this.forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEachOrdered(java.util.function.Consumer consumer) {
            Stream.this.mo16415s(Consumer.VivifiedWrapper.convert(consumer));
        }

        public final /* synthetic */ int hashCode() {
            return Stream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return Stream.this.isParallel();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ Iterator iterator() {
            return Stream.this.iterator();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream limit(long j) {
            return convert(Stream.this.limit(j));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream map(java.util.function.Function function) {
            return convert(Stream.this.mo16413v(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
            return C9323C.m16470l(Stream.this.mo16424L(ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
            return C0534c0.m16378l(Stream.this.mo16414u(ToIntFunction.VivifiedWrapper.convert(toIntFunction)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
            return C0567j0.m16344l(Stream.this.mo16425J(ToLongFunction.VivifiedWrapper.convert(toLongFunction)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional max(Comparator comparator) {
            return AbstractC0513i.m16505a(Stream.this.max(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional min(Comparator comparator) {
            return AbstractC0513i.m16505a(Stream.this.min(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean noneMatch(java.util.function.Predicate predicate) {
            return Stream.this.mo16426I(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C0553g.m16368l(Stream.this.onClose(runnable));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream parallel() {
            return C0553g.m16368l(Stream.this.parallel());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream peek(java.util.function.Consumer consumer) {
            return convert(Stream.this.mo16417j(Consumer.VivifiedWrapper.convert(consumer)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
            return Stream.this.mo16418h(obj, BiFunction.VivifiedWrapper.convert(biFunction), C0488c.m16530a(binaryOperator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
            return Stream.this.mo16422c(obj, C0488c.m16530a(binaryOperator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
            return AbstractC0513i.m16505a(Stream.this.mo16411x(C0488c.m16530a(binaryOperator)));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream sequential() {
            return C0553g.m16368l(Stream.this.sequential());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream skip(long j) {
            return convert(Stream.this.skip(j));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted() {
            return convert(Stream.this.sorted());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted(Comparator comparator) {
            return convert(Stream.this.sorted(comparator));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(Stream.this.spliterator());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object[] toArray() {
            return Stream.this.toArray();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Stream.this.toArray(C9278A.m16551a(intFunction));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream unordered() {
            return C0553g.m16368l(Stream.this.unordered());
        }
    }

    /* renamed from: D */
    boolean mo16428D(p163j$.util.function.Predicate predicate);

    /* renamed from: E */
    AbstractC0571k0 mo16427E(p163j$.util.function.Function function);

    /* renamed from: I */
    boolean mo16426I(p163j$.util.function.Predicate predicate);

    /* renamed from: J */
    AbstractC0571k0 mo16425J(p163j$.util.function.ToLongFunction toLongFunction);

    /* renamed from: L */
    AbstractC9328D mo16424L(p163j$.util.function.ToDoubleFunction toDoubleFunction);

    /* renamed from: a */
    IntStream mo16423a(p163j$.util.function.Function function);

    /* renamed from: c */
    Object mo16422c(Object obj, C0488c cVar);

    long count();

    /* renamed from: d */
    Object mo16421d(C0566j jVar);

    Stream distinct();

    /* renamed from: e */
    Object mo16420e(C9309g0 g0Var, p163j$.util.function.BiConsumer biConsumer, p163j$.util.function.BiConsumer biConsumer2);

    /* renamed from: f */
    AbstractC9328D mo16419f(p163j$.util.function.Function function);

    Stream<T> filter(p163j$.util.function.Predicate<? super T> predicate);

    C0512h findAny();

    C0512h findFirst();

    void forEach(p163j$.util.function.Consumer consumer);

    /* renamed from: h */
    Object mo16418h(Object obj, p163j$.util.function.BiFunction biFunction, C0488c cVar);

    /* renamed from: j */
    Stream mo16417j(p163j$.util.function.Consumer consumer);

    Stream limit(long j);

    C0512h max(Comparator comparator);

    C0512h min(Comparator comparator);

    /* renamed from: p */
    boolean mo16416p(p163j$.util.function.Predicate predicate);

    /* renamed from: s */
    void mo16415s(p163j$.util.function.Consumer consumer);

    Stream skip(long j);

    Stream sorted();

    Stream sorted(Comparator comparator);

    Object[] toArray();

    Object[] toArray(p163j$.util.function.IntFunction intFunction);

    /* renamed from: u */
    IntStream mo16414u(p163j$.util.function.ToIntFunction toIntFunction);

    /* renamed from: v */
    Stream mo16413v(p163j$.util.function.Function function);

    /* renamed from: w */
    Stream mo16412w(p163j$.util.function.Function function);

    /* renamed from: x */
    C0512h mo16411x(AbstractC0489d dVar);
}
