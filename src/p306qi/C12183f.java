package p306qi;

import ag.AbstractC1385a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\n¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0096\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011"}, m15073d2 = {"Lqi/f;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "", "iterator", "a", "Lkotlin/sequences/Sequence;", "sequence", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "transformer", "c", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: qi.f */
/* loaded from: classes8.dex */
public final class C12183f<T, R, E> implements Sequence<E> {

    /* renamed from: a */
    private final Sequence<T> f27336a;

    /* renamed from: b */
    private final Function1<T, R> f27337b;

    /* renamed from: c */
    private final Function1<R, Iterator<E>> f27338c;

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0002H\u0096\u0002R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m15073d2 = {"qi/f$a", "", "", "b", "next", "()Ljava/lang/Object;", "hasNext", "k", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "l", "getItemIterator", "setItemIterator", "(Ljava/util/Iterator;)V", "itemIterator", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: qi.f$a */
    /* loaded from: classes8.dex */
    public static final class C12184a implements Iterator<E>, AbstractC1385a, p163j$.util.Iterator {

        /* renamed from: k */
        private final Iterator<T> f27339k;

        /* renamed from: l */
        private Iterator<? extends E> f27340l;

        /* renamed from: m */
        final /* synthetic */ C12183f<T, R, E> f27341m;

        C12184a(C12183f<T, R, E> fVar) {
            this.f27341m = fVar;
            this.f27339k = ((C12183f) fVar).f27336a.iterator();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
            return true;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean m7486b() {
            /*
                r5 = this;
                java.util.Iterator<? extends E> r0 = r5.f27340l
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x000e
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L_0x000e
                r0 = r1
                goto L_0x000f
            L_0x000e:
                r0 = r2
            L_0x000f:
                if (r0 == 0) goto L_0x0014
                r0 = 0
                r5.f27340l = r0
            L_0x0014:
                java.util.Iterator<? extends E> r0 = r5.f27340l
                if (r0 != 0) goto L_0x0045
                java.util.Iterator<T> r0 = r5.f27339k
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L_0x0021
                return r2
            L_0x0021:
                java.util.Iterator<T> r0 = r5.f27339k
                java.lang.Object r0 = r0.next()
                qi.f<T, R, E> r3 = r5.f27341m
                kotlin.jvm.functions.Function1 r3 = p306qi.C12183f.m7489b(r3)
                qi.f<T, R, E> r4 = r5.f27341m
                kotlin.jvm.functions.Function1 r4 = p306qi.C12183f.m7487d(r4)
                java.lang.Object r0 = r4.invoke(r0)
                java.lang.Object r0 = r3.invoke(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0014
                r5.f27340l = r0
            L_0x0045:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p306qi.C12183f.C12184a.m7486b():boolean");
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
            return m7486b();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public E next() {
            if (m7486b()) {
                java.util.Iterator<? extends E> it = this.f27340l;
                C9971q.m14636d(it);
                return (E) it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12183f(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transformer, Function1<? super R, ? extends java.util.Iterator<? extends E>> iterator) {
        C9971q.m14633g(sequence, "sequence");
        C9971q.m14633g(transformer, "transformer");
        C9971q.m14633g(iterator, "iterator");
        this.f27336a = sequence;
        this.f27337b = transformer;
        this.f27338c = iterator;
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<E> iterator() {
        return new C12184a(this);
    }
}
