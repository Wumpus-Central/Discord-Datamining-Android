package p306qi;

import ag.AbstractC1385a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B)\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J5\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0002\u0010\u00062\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u0007H\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m15073d2 = {"Lqi/q;", "T", "R", "Lkotlin/sequences/Sequence;", "", "iterator", "E", "Lkotlin/Function1;", "d", "(Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "a", "Lkotlin/sequences/Sequence;", "sequence", "b", "Lkotlin/jvm/functions/Function1;", "transformer", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: qi.q */
/* loaded from: classes8.dex */
public final class C12206q<T, R> implements Sequence<R> {

    /* renamed from: a */
    private final Sequence<T> f27366a;

    /* renamed from: b */
    private final Function1<T, R> f27367b;

    @Metadata(m15074d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m15073d2 = {"qi/q$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "k", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: qi.q$a */
    /* loaded from: classes8.dex */
    public static final class C12207a implements Iterator<R>, AbstractC1385a, p163j$.util.Iterator {

        /* renamed from: k */
        private final Iterator<T> f27368k;

        /* renamed from: l */
        final /* synthetic */ C12206q<T, R> f27369l;

        C12207a(C12206q<T, R> qVar) {
            this.f27369l = qVar;
            this.f27368k = ((C12206q) qVar).f27366a.iterator();
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f27368k.hasNext();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public R next() {
            return (R) ((C12206q) this.f27369l).f27367b.invoke(this.f27368k.next());
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12206q(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transformer) {
        C9971q.m14633g(sequence, "sequence");
        C9971q.m14633g(transformer, "transformer");
        this.f27366a = sequence;
        this.f27367b = transformer;
    }

    /* renamed from: d */
    public final <E> Sequence<E> m7411d(Function1<? super R, ? extends java.util.Iterator<? extends E>> iterator) {
        C9971q.m14633g(iterator, "iterator");
        return new C12183f(this.f27366a, this.f27367b, iterator);
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<R> iterator() {
        return new C12207a(this);
    }
}
