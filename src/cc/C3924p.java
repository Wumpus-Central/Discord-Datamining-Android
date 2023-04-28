package cc;

import cc.C3924p;
import java.util.Comparator;
import p030bc.C3457i;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.Function;
import p163j$.util.function.IntConsumer;
import p163j$.util.function.IntFunction;
import p163j$.util.stream.IntStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.p */
/* loaded from: classes3.dex */
public final class C3924p {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.p$a */
    /* loaded from: classes3.dex */
    public class C3925a implements Spliterator<OutElementT> {

        /* renamed from: a */
        final /* synthetic */ Spliterator f6460a;

        /* renamed from: b */
        final /* synthetic */ Function f6461b;

        C3925a(Spliterator spliterator, Function function) {
            this.f6460a = spliterator;
            this.f6461b = function;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static /* synthetic */ void m33333c(Consumer consumer, Function function, Object obj) {
            consumer.accept(function.apply(obj));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ void m33332d(Consumer consumer, Function function, Object obj) {
            consumer.accept(function.apply(obj));
        }

        @Override // p163j$.util.Spliterator
        public int characteristics() {
            return this.f6460a.characteristics() & (-262);
        }

        @Override // p163j$.util.Spliterator
        public long estimateSize() {
            return this.f6460a.estimateSize();
        }

        @Override // p163j$.util.Spliterator
        public void forEachRemaining(final Consumer<? super OutElementT> consumer) {
            Spliterator spliterator = this.f6460a;
            final Function function = this.f6461b;
            spliterator.forEachRemaining(new Consumer() { // from class: cc.n
                @Override // p163j$.util.function.Consumer
                public final void accept(Object obj) {
                    C3924p.C3925a.m33333c(Consumer.this, function, obj);
                }

                @Override // p163j$.util.function.Consumer
                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return consumer2.getClass();
                }
            });
        }

        @Override // p163j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // p163j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // p163j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        @Override // p163j$.util.Spliterator
        public boolean tryAdvance(final Consumer<? super OutElementT> consumer) {
            Spliterator spliterator = this.f6460a;
            final Function function = this.f6461b;
            return spliterator.tryAdvance(new Consumer() { // from class: cc.o
                @Override // p163j$.util.function.Consumer
                public final void accept(Object obj) {
                    C3924p.C3925a.m33332d(Consumer.this, function, obj);
                }

                @Override // p163j$.util.function.Consumer
                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return consumer2.getClass();
                }
            });
        }

        @Override // p163j$.util.Spliterator
        public Spliterator<OutElementT> trySplit() {
            Spliterator trySplit = this.f6460a.trySplit();
            if (trySplit != null) {
                return C3924p.m33336d(trySplit, this.f6461b);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.p$b */
    /* loaded from: classes3.dex */
    public class C3926b implements Spliterator<T> {

        /* renamed from: a */
        private final Spliterator.OfInt f6462a;

        /* renamed from: b */
        final /* synthetic */ IntFunction f6463b;

        /* renamed from: c */
        final /* synthetic */ int f6464c;

        /* renamed from: d */
        final /* synthetic */ Comparator f6465d;

        C3926b(Spliterator.OfInt ofInt, IntFunction intFunction, int i, Comparator comparator) {
            this.f6463b = intFunction;
            this.f6464c = i;
            this.f6465d = comparator;
            this.f6462a = ofInt;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static /* synthetic */ void m33329c(Consumer consumer, IntFunction intFunction, int i) {
            consumer.accept(intFunction.apply(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ void m33328d(Consumer consumer, IntFunction intFunction, int i) {
            consumer.accept(intFunction.apply(i));
        }

        @Override // p163j$.util.Spliterator
        public int characteristics() {
            return this.f6464c | 16464;
        }

        @Override // p163j$.util.Spliterator
        public long estimateSize() {
            return this.f6462a.estimateSize();
        }

        @Override // p163j$.util.Spliterator
        public void forEachRemaining(final Consumer<? super T> consumer) {
            Spliterator.OfInt ofInt = this.f6462a;
            final IntFunction intFunction = this.f6463b;
            ofInt.forEachRemaining(new IntConsumer() { // from class: cc.q
                @Override // p163j$.util.function.IntConsumer
                public final void accept(int i) {
                    C3924p.C3926b.m33329c(Consumer.this, intFunction, i);
                }

                @Override // p163j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return intConsumer.getClass();
                }
            });
        }

        @Override // p163j$.util.Spliterator
        public Comparator<? super T> getComparator() {
            if (hasCharacteristics(4)) {
                return this.f6465d;
            }
            throw new IllegalStateException();
        }

        @Override // p163j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // p163j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        @Override // p163j$.util.Spliterator
        public boolean tryAdvance(final Consumer<? super T> consumer) {
            Spliterator.OfInt ofInt = this.f6462a;
            final IntFunction intFunction = this.f6463b;
            return ofInt.tryAdvance(new IntConsumer() { // from class: cc.r
                @Override // p163j$.util.function.IntConsumer
                public final void accept(int i) {
                    C3924p.C3926b.m33328d(Consumer.this, intFunction, i);
                }

                @Override // p163j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return intConsumer.getClass();
                }
            });
        }

        @Override // p163j$.util.Spliterator
        public Spliterator<T> trySplit() {
            Spliterator.OfInt trySplit = this.f6462a.trySplit();
            if (trySplit == null) {
                return null;
            }
            return new C3926b(trySplit, this.f6463b, this.f6464c, this.f6465d);
        }
    }

    /* renamed from: cc.p$c */
    /* loaded from: classes3.dex */
    static abstract class AbstractC3927c<InElementT, OutElementT, OutSpliteratorT extends Spliterator<OutElementT>> implements Spliterator<OutElementT> {

        /* renamed from: a */
        OutSpliteratorT f6466a;

        /* renamed from: b */
        final Spliterator<InElementT> f6467b;

        /* renamed from: c */
        final Function<? super InElementT, OutSpliteratorT> f6468c;

        /* renamed from: d */
        final AbstractC3928a<InElementT, OutSpliteratorT> f6469d;

        /* renamed from: e */
        int f6470e;

        /* renamed from: f */
        long f6471f;

        @FunctionalInterface
        /* renamed from: cc.p$c$a */
        /* loaded from: classes3.dex */
        interface AbstractC3928a<InElementT, OutSpliteratorT extends Spliterator<?>> {
            /* renamed from: a */
            OutSpliteratorT mo33304a(OutSpliteratorT outspliteratort, Spliterator<InElementT> spliterator, Function<? super InElementT, OutSpliteratorT> function, int i, long j);
        }

        AbstractC3927c(OutSpliteratorT outspliteratort, Spliterator<InElementT> spliterator, Function<? super InElementT, OutSpliteratorT> function, AbstractC3928a<InElementT, OutSpliteratorT> aVar, int i, long j) {
            this.f6466a = outspliteratort;
            this.f6467b = spliterator;
            this.f6468c = function;
            this.f6469d = aVar;
            this.f6470e = i;
            this.f6471f = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m33325c(Consumer consumer, Object obj) {
            OutSpliteratorT apply = this.f6468c.apply(obj);
            if (apply != null) {
                apply.forEachRemaining(consumer);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m33324d(Object obj) {
            this.f6466a = this.f6468c.apply(obj);
        }

        @Override // p163j$.util.Spliterator
        public final int characteristics() {
            return this.f6470e;
        }

        @Override // p163j$.util.Spliterator
        public final long estimateSize() {
            OutSpliteratorT outspliteratort = this.f6466a;
            if (outspliteratort != null) {
                this.f6471f = Math.max(this.f6471f, outspliteratort.estimateSize());
            }
            return Math.max(this.f6471f, 0L);
        }

        @Override // p163j$.util.Spliterator
        public final void forEachRemaining(final Consumer<? super OutElementT> consumer) {
            OutSpliteratorT outspliteratort = this.f6466a;
            if (outspliteratort != null) {
                outspliteratort.forEachRemaining(consumer);
                this.f6466a = null;
            }
            this.f6467b.forEachRemaining(new Consumer() { // from class: cc.s
                @Override // p163j$.util.function.Consumer
                public final void accept(Object obj) {
                    C3924p.AbstractC3927c.this.m33325c(consumer, obj);
                }

                @Override // p163j$.util.function.Consumer
                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return consumer2.getClass();
                }
            });
            this.f6471f = 0L;
        }

        @Override // p163j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // p163j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // p163j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        @Override // p163j$.util.Spliterator
        public final boolean tryAdvance(Consumer<? super OutElementT> consumer) {
            do {
                OutSpliteratorT outspliteratort = this.f6466a;
                if (outspliteratort == null || !outspliteratort.tryAdvance(consumer)) {
                    this.f6466a = null;
                } else {
                    long j = this.f6471f;
                    if (j == Long.MAX_VALUE) {
                        return true;
                    }
                    this.f6471f = j - 1;
                    return true;
                }
            } while (this.f6467b.tryAdvance(new Consumer() { // from class: cc.t
                @Override // p163j$.util.function.Consumer
                public final void accept(Object obj) {
                    C3924p.AbstractC3927c.this.m33324d(obj);
                }

                @Override // p163j$.util.function.Consumer
                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return consumer2.getClass();
                }
            }));
            return false;
        }

        @Override // p163j$.util.Spliterator
        public final OutSpliteratorT trySplit() {
            Spliterator<InElementT> trySplit = this.f6467b.trySplit();
            if (trySplit != null) {
                int i = this.f6470e & (-65);
                long estimateSize = estimateSize();
                if (estimateSize < Long.MAX_VALUE) {
                    estimateSize /= 2;
                    this.f6471f -= estimateSize;
                    this.f6470e = i;
                }
                OutSpliteratorT a = this.f6469d.mo33304a(this.f6466a, trySplit, this.f6468c, i, estimateSize);
                this.f6466a = null;
                return a;
            }
            OutSpliteratorT outspliteratort = this.f6466a;
            if (outspliteratort == null) {
                return null;
            }
            this.f6466a = null;
            return outspliteratort;
        }
    }

    /* renamed from: cc.p$d */
    /* loaded from: classes3.dex */
    static final class C3929d<InElementT, OutElementT> extends AbstractC3927c<InElementT, OutElementT, Spliterator<OutElementT>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C3929d(Spliterator<OutElementT> spliterator, Spliterator<InElementT> spliterator2, Function<? super InElementT, Spliterator<OutElementT>> function, int i, long j) {
            super(spliterator, spliterator2, function, new AbstractC3927c.AbstractC3928a() { // from class: cc.u
                @Override // cc.C3924p.AbstractC3927c.AbstractC3928a
                /* renamed from: a */
                public final Spliterator mo33304a(Spliterator spliterator3, Spliterator spliterator4, Function function2, int i2, long j2) {
                    return new C3924p.C3929d(spliterator3, spliterator4, function2, i2, j2);
                }
            }, i, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <InElementT, OutElementT> Spliterator<OutElementT> m33339a(Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator<OutElementT>> function, int i, long j) {
        boolean z;
        boolean z2 = true;
        if ((i & Spliterator.SUBSIZED) == 0) {
            z = true;
        } else {
            z = false;
        }
        C3457i.m34356e(z, "flatMap does not support SUBSIZED characteristic");
        if ((i & 4) != 0) {
            z2 = false;
        }
        C3457i.m34356e(z2, "flatMap does not support SORTED characteristic");
        C3457i.m34352i(spliterator);
        C3457i.m34352i(function);
        return new C3929d(null, spliterator, function, i, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> Spliterator<T> m33338b(int i, int i2, IntFunction<T> intFunction) {
        return m33337c(i, i2, intFunction, null);
    }

    /* renamed from: c */
    static <T> Spliterator<T> m33337c(int i, int i2, IntFunction<T> intFunction, Comparator<? super T> comparator) {
        boolean z;
        if (comparator != null) {
            if ((i2 & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            C3457i.m34357d(z);
        }
        return new C3926b(IntStream.CC.range(0, i).spliterator(), intFunction, i2, comparator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <InElementT, OutElementT> Spliterator<OutElementT> m33336d(Spliterator<InElementT> spliterator, Function<? super InElementT, ? extends OutElementT> function) {
        C3457i.m34352i(spliterator);
        C3457i.m34352i(function);
        return new C3925a(spliterator, function);
    }
}
