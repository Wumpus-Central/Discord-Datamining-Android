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

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m15073d2 = {"Lqi/p;", "T", "Lkotlin/sequences/Sequence;", "", "iterator", "a", "Lkotlin/sequences/Sequence;", "sequence", "Lkotlin/Function1;", "", "b", "Lkotlin/jvm/functions/Function1;", "predicate", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: qi.p */
/* loaded from: classes8.dex */
public final class C12204p<T> implements Sequence<T> {

    /* renamed from: a */
    private final Sequence<T> f27360a;

    /* renamed from: b */
    private final Function1<T, Boolean> f27361b;

    @Metadata(m15074d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0005\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m15073d2 = {"qi/p$a", "", "", "b", "next", "()Ljava/lang/Object;", "", "hasNext", "k", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "l", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "m", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: qi.p$a */
    /* loaded from: classes8.dex */
    public static final class C12205a implements Iterator<T>, AbstractC1385a, p163j$.util.Iterator {

        /* renamed from: k */
        private final Iterator<T> f27362k;

        /* renamed from: l */
        private int f27363l = -1;

        /* renamed from: m */
        private T f27364m;

        /* renamed from: n */
        final /* synthetic */ C12204p<T> f27365n;

        C12205a(C12204p<T> pVar) {
            this.f27365n = pVar;
            this.f27362k = ((C12204p) pVar).f27360a.iterator();
        }

        /* renamed from: b */
        private final void m7414b() {
            if (this.f27362k.hasNext()) {
                T next = this.f27362k.next();
                if (((Boolean) ((C12204p) this.f27365n).f27361b.invoke(next)).booleanValue()) {
                    this.f27363l = 1;
                    this.f27364m = next;
                    return;
                }
            }
            this.f27363l = 0;
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
            if (this.f27363l == -1) {
                m7414b();
            }
            if (this.f27363l == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public T next() {
            if (this.f27363l == -1) {
                m7414b();
            }
            if (this.f27363l != 0) {
                T t = this.f27364m;
                this.f27364m = null;
                this.f27363l = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12204p(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        C9971q.m14633g(sequence, "sequence");
        C9971q.m14633g(predicate, "predicate");
        this.f27360a = sequence;
        this.f27361b = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        return new C12205a(this);
    }
}
