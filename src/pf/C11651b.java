package pf;

import ag.AbstractC1385a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.C9897e;
import kotlin.jvm.internal.C9971q;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;
import p267of.AbstractC11267c;
import p267of.AbstractC11272e;

@Metadata(m15074d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b+\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0001SBO\b\u0002\u0012\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000*\u0012\u0006\u0010J\u001a\u00020\f\u0012\u0006\u0010L\u001a\u00020\f\u0012\u0006\u0010N\u001a\u00020\n\u0012\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010R\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\bY\u0010ZB\t\b\u0016¢\u0006\u0004\bY\u0010[B\u0011\b\u0016\u0012\u0006\u0010\\\u001a\u00020\f¢\u0006\u0004\bY\u0010]J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\r\u001a\u00020\fH\u0016J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001a\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u0016\u0010 \u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\u001e\u0010 \u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\u0017\u0010\"\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u000fJ\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\u001bJ\u0016\u0010$\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\u0016\u0010%\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fH\u0016J)\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010*\"\u0004\b\u0001\u0010)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0*H\u0016¢\u0006\u0004\b,\u0010/J\u0013\u00101\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010.H\u0096\u0002J\b\u00102\u001a\u00020\fH\u0016J\b\u00104\u001a\u000203H\u0016J\u0010\u00106\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\fH\u0002J\b\u00107\u001a\u00020\u001cH\u0002J\u0010\u00109\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\fH\u0002J\u0014\u0010:\u001a\u00020\n2\n\u00100\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0018\u0010<\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0002J\u001f\u0010=\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b=\u0010\u001dJ&\u0010>\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u00108\u001a\u00020\fH\u0002J\u0017\u0010?\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\fH\u0002¢\u0006\u0004\b?\u0010\u000fJ\u0018\u0010B\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\fH\u0002J.\u0010D\u001a\u00020\f2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010C\u001a\u00020\nH\u0002R\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010IR\u0016\u0010N\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010MR\u001c\u0010Q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001c\u0010R\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010PR\u0014\u0010U\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006^"}, m15073d2 = {"Lpf/b;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lof/e;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "r", "", "isEmpty", "", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "", "listIterator", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "clear", "b", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "T", "", "destination", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "", "toString", "minCapacity", "u", "s", "n", "v", "t", "i", "w", "p", "j", "y", "rangeOffset", "rangeLength", "z", "retain", "A", "k", "[Ljava/lang/Object;", "array", "l", "I", "offset", "m", "length", "Z", "isReadOnly", "o", "Lpf/b;", "backing", "root", "a", "()I", "size", "x", "()Z", "isEffectivelyReadOnly", "<init>", "([Ljava/lang/Object;IIZLpf/b;Lpf/b;)V", "()V", "initialCapacity", "(I)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: pf.b */
/* loaded from: classes8.dex */
public final class C11651b<E> extends AbstractC11272e<E> implements RandomAccess, Serializable {

    /* renamed from: k */
    private E[] f25992k;

    /* renamed from: l */
    private int f25993l;

    /* renamed from: m */
    private int f25994m;

    /* renamed from: n */
    private boolean f25995n;

    /* renamed from: o */
    private final C11651b<E> f25996o;

    /* renamed from: p */
    private final C11651b<E> f25997p;

    @Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\b\u0016\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0005\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\b\u0010\u0011\u001a\u00020\rH\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, m15073d2 = {"Lpf/b$a;", "E", "", "", "hasPrevious", "hasNext", "", "previousIndex", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "", "set", "(Ljava/lang/Object;)V", "add", "remove", "Lpf/b;", "k", "Lpf/b;", "list", "l", "I", "index", "m", "lastIndex", "<init>", "(Lpf/b;I)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: pf.b$a */
    /* loaded from: classes8.dex */
    private static final class C11652a<E> implements ListIterator<E>, AbstractC1385a, Iterator {

        /* renamed from: k */
        private final C11651b<E> f25998k;

        /* renamed from: l */
        private int f25999l;

        /* renamed from: m */
        private int f26000m = -1;

        public C11652a(C11651b<E> list, int i) {
            C9971q.m14633g(list, "list");
            this.f25998k = list;
            this.f25999l = i;
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            C11651b<E> bVar = this.f25998k;
            int i = this.f25999l;
            this.f25999l = i + 1;
            bVar.add(i, e);
            this.f26000m = -1;
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.ListIterator, java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f25999l < ((C11651b) this.f25998k).f25994m;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f25999l > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator, p163j$.util.Iterator
        public E next() {
            if (this.f25999l < ((C11651b) this.f25998k).f25994m) {
                int i = this.f25999l;
                this.f25999l = i + 1;
                this.f26000m = i;
                return (E) ((C11651b) this.f25998k).f25992k[((C11651b) this.f25998k).f25993l + this.f26000m];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f25999l;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i = this.f25999l;
            if (i > 0) {
                int i2 = i - 1;
                this.f25999l = i2;
                this.f26000m = i2;
                return (E) ((C11651b) this.f25998k).f25992k[((C11651b) this.f25998k).f25993l + this.f26000m];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f25999l - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            boolean z;
            int i = this.f26000m;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f25998k.remove(i);
                this.f25999l = this.f26000m;
                this.f26000m = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            boolean z;
            int i = this.f26000m;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f25998k.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    private C11651b(E[] eArr, int i, int i2, boolean z, C11651b<E> bVar, C11651b<E> bVar2) {
        this.f25992k = eArr;
        this.f25993l = i;
        this.f25994m = i2;
        this.f25995n = z;
        this.f25996o = bVar;
        this.f25997p = bVar2;
    }

    /* renamed from: A */
    private final int m9140A(int i, int i2, Collection<? extends E> collection, boolean z) {
        C11651b<E> bVar = this.f25996o;
        if (bVar != null) {
            int A = bVar.m9140A(i, i2, collection, z);
            this.f25994m -= A;
            return A;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f25992k[i5]) == z) {
                E[] eArr = this.f25992k;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.f25992k;
        C9897e.m14989f(eArr2, eArr2, i + i4, i2 + i, this.f25994m);
        E[] eArr3 = this.f25992k;
        int i7 = this.f25994m;
        C11653c.m9117g(eArr3, i7 - i6, i7);
        this.f25994m -= i6;
        return i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    private final void m9134j(int i, Collection<? extends E> collection, int i2) {
        C11651b<E> bVar = this.f25996o;
        if (bVar != null) {
            bVar.m9134j(i, collection, i2);
            this.f25992k = this.f25996o.f25992k;
            this.f25994m += i2;
            return;
        }
        m9127w(i, i2);
        java.util.Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f25992k[i + i3] = it.next();
        }
    }

    /* renamed from: p */
    private final void m9133p(int i, E e) {
        C11651b<E> bVar = this.f25996o;
        if (bVar != null) {
            bVar.m9133p(i, e);
            this.f25992k = this.f25996o.f25992k;
            this.f25994m++;
            return;
        }
        m9127w(i, 1);
        this.f25992k[i] = e;
    }

    /* renamed from: s */
    private final void m9131s() {
        if (m9126x()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: t */
    private final boolean m9130t(List<?> list) {
        boolean h;
        h = C11653c.m9116h(this.f25992k, this.f25993l, this.f25994m, list);
        return h;
    }

    /* renamed from: u */
    private final void m9129u(int i) {
        if (this.f25996o != null) {
            throw new IllegalStateException();
        } else if (i >= 0) {
            E[] eArr = this.f25992k;
            if (i > eArr.length) {
                this.f25992k = (E[]) C11653c.m9119e(this.f25992k, ArrayDeque.f22043n.m15054a(eArr.length, i));
            }
        } else {
            throw new OutOfMemoryError();
        }
    }

    /* renamed from: v */
    private final void m9128v(int i) {
        m9129u(this.f25994m + i);
    }

    /* renamed from: w */
    private final void m9127w(int i, int i2) {
        m9128v(i2);
        E[] eArr = this.f25992k;
        C9897e.m14989f(eArr, eArr, i + i2, i, this.f25993l + this.f25994m);
        this.f25994m += i2;
    }

    /* renamed from: x */
    private final boolean m9126x() {
        C11651b<E> bVar;
        return this.f25995n || ((bVar = this.f25997p) != null && bVar.f25995n);
    }

    /* renamed from: y */
    private final E m9125y(int i) {
        C11651b<E> bVar = this.f25996o;
        if (bVar != null) {
            this.f25994m--;
            return bVar.m9125y(i);
        }
        E[] eArr = this.f25992k;
        E e = eArr[i];
        C9897e.m14989f(eArr, eArr, i, i + 1, this.f25993l + this.f25994m);
        C11653c.m9118f(this.f25992k, (this.f25993l + this.f25994m) - 1);
        this.f25994m--;
        return e;
    }

    /* renamed from: z */
    private final void m9124z(int i, int i2) {
        C11651b<E> bVar = this.f25996o;
        if (bVar != null) {
            bVar.m9124z(i, i2);
        } else {
            E[] eArr = this.f25992k;
            C9897e.m14989f(eArr, eArr, i, i + i2, this.f25994m);
            E[] eArr2 = this.f25992k;
            int i3 = this.f25994m;
            C11653c.m9117g(eArr2, i3 - i2, i3);
        }
        this.f25994m -= i2;
    }

    @Override // p267of.AbstractC11272e
    /* renamed from: a */
    public int mo9139a() {
        return this.f25994m;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        m9131s();
        m9133p(this.f25993l + this.f25994m, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        C9971q.m14633g(elements, "elements");
        m9131s();
        int size = elements.size();
        m9134j(this.f25993l + this.f25994m, elements, size);
        return size > 0;
    }

    @Override // p267of.AbstractC11272e
    /* renamed from: b */
    public E mo9138b(int i) {
        m9131s();
        AbstractC11267c.f25192k.m10305a(i, this.f25994m);
        return m9125y(this.f25993l + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m9131s();
        m9124z(this.f25993l, this.f25994m);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && m9130t((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractC11267c.f25192k.m10305a(i, this.f25994m);
        return this.f25992k[this.f25993l + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i;
        i = C11653c.m9115i(this.f25992k, this.f25993l, this.f25994m);
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.f25994m; i++) {
            if (C9971q.m14638b(this.f25992k[this.f25993l + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f25994m == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        return new C11652a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.f25994m - 1; i >= 0; i--) {
            if (C9971q.m14638b(this.f25992k[this.f25993l + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new C11652a(this, 0);
    }

    /* renamed from: r */
    public final List<E> m9132r() {
        if (this.f25996o == null) {
            m9131s();
            this.f25995n = true;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m9131s();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        C9971q.m14633g(elements, "elements");
        m9131s();
        if (m9140A(this.f25993l, this.f25994m, elements, false) > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        C9971q.m14633g(elements, "elements");
        m9131s();
        if (m9140A(this.f25993l, this.f25994m, elements, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        m9131s();
        AbstractC11267c.f25192k.m10305a(i, this.f25994m);
        E[] eArr = this.f25992k;
        int i2 = this.f25993l;
        E e2 = eArr[i2 + i];
        eArr[i2 + i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i, int i2) {
        C11651b<E> bVar;
        AbstractC11267c.f25192k.m10303c(i, i2, this.f25994m);
        E[] eArr = this.f25992k;
        int i3 = this.f25993l + i;
        int i4 = i2 - i;
        boolean z = this.f25995n;
        C11651b<E> bVar2 = this.f25997p;
        if (bVar2 == null) {
            bVar = this;
        } else {
            bVar = bVar2;
        }
        return new C11651b(eArr, i3, i4, z, this, bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] destination) {
        C9971q.m14633g(destination, "destination");
        int length = destination.length;
        int i = this.f25994m;
        if (length < i) {
            E[] eArr = this.f25992k;
            int i2 = this.f25993l;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, destination.getClass());
            C9971q.m14634f(tArr, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr;
        }
        E[] eArr2 = this.f25992k;
        int i3 = this.f25993l;
        C9897e.m14989f(eArr2, destination, 0, i3, i + i3);
        int length2 = destination.length;
        int i4 = this.f25994m;
        if (length2 > i4) {
            destination[i4] = null;
        }
        return destination;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j;
        j = C11653c.m9114j(this.f25992k, this.f25993l, this.f25994m);
        return j;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        AbstractC11267c.f25192k.m10304b(i, this.f25994m);
        return new C11652a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        m9131s();
        AbstractC11267c.f25192k.m10304b(i, this.f25994m);
        m9133p(this.f25993l + i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> elements) {
        C9971q.m14633g(elements, "elements");
        m9131s();
        AbstractC11267c.f25192k.m10304b(i, this.f25994m);
        int size = elements.size();
        m9134j(this.f25993l + i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        Object[] j;
        E[] eArr = this.f25992k;
        int i = this.f25993l;
        j = C9897e.m14985j(eArr, i, this.f25994m + i);
        return j;
    }

    public C11651b() {
        this(10);
    }

    public C11651b(int i) {
        this(C11653c.m9120d(i), 0, 0, false, null, null);
    }
}
