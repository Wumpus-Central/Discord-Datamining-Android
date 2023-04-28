package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.e */
/* loaded from: classes8.dex */
public final class C8850e<E> extends AbstractCollection<E> implements Queue<E>, Serializable {

    /* renamed from: k */
    private transient E[] f19534k;

    /* renamed from: l */
    private transient int f19535l = 0;

    /* renamed from: m */
    private transient int f19536m = 0;

    /* renamed from: n */
    private transient boolean f19537n = false;

    /* renamed from: o */
    private final int f19538o;

    /* renamed from: io.sentry.e$a */
    /* loaded from: classes8.dex */
    class C8851a implements Iterator<E>, p163j$.util.Iterator {

        /* renamed from: k */
        private int f19539k;

        /* renamed from: l */
        private int f19540l = -1;

        /* renamed from: m */
        private boolean f19541m;

        C8851a() {
            this.f19539k = C8850e.this.f19535l;
            this.f19541m = C8850e.this.f19537n;
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
            return this.f19541m || this.f19539k != C8850e.this.f19536m;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public E next() {
            if (hasNext()) {
                this.f19541m = false;
                int i = this.f19539k;
                this.f19540l = i;
                this.f19539k = C8850e.this.m17873t(i);
                return (E) C8850e.this.f19534k[this.f19540l];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            int i = this.f19540l;
            if (i == -1) {
                throw new IllegalStateException();
            } else if (i == C8850e.this.f19535l) {
                C8850e.this.remove();
                this.f19540l = -1;
            } else {
                int i2 = this.f19540l + 1;
                if (C8850e.this.f19535l >= this.f19540l || i2 >= C8850e.this.f19536m) {
                    while (i2 != C8850e.this.f19536m) {
                        if (i2 >= C8850e.this.f19538o) {
                            C8850e.this.f19534k[i2 - 1] = C8850e.this.f19534k[0];
                            i2 = 0;
                        } else {
                            C8850e.this.f19534k[C8850e.this.m17874s(i2)] = C8850e.this.f19534k[i2];
                            i2 = C8850e.this.m17873t(i2);
                        }
                    }
                } else {
                    System.arraycopy(C8850e.this.f19534k, i2, C8850e.this.f19534k, this.f19540l, C8850e.this.f19536m - i2);
                }
                this.f19540l = -1;
                C8850e eVar = C8850e.this;
                eVar.f19536m = eVar.m17874s(eVar.f19536m);
                C8850e.this.f19534k[C8850e.this.f19536m] = null;
                C8850e.this.f19537n = false;
                this.f19539k = C8850e.this.m17874s(this.f19539k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8850e(int i) {
        if (i > 0) {
            E[] eArr = (E[]) new Object[i];
            this.f19534k = eArr;
            this.f19538o = eArr.length;
            return;
        }
        throw new IllegalArgumentException("The size must be greater than 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public int m17874s(int i) {
        int i2 = i - 1;
        return i2 < 0 ? this.f19538o - 1 : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public int m17873t(int i) {
        int i2 = i + 1;
        if (i2 >= this.f19538o) {
            return 0;
        }
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        if (e != null) {
            if (m17872u()) {
                remove();
            }
            E[] eArr = this.f19534k;
            int i = this.f19536m;
            int i2 = i + 1;
            this.f19536m = i2;
            eArr[i] = e;
            if (i2 >= this.f19538o) {
                this.f19536m = 0;
            }
            if (this.f19536m == this.f19535l) {
                this.f19537n = true;
            }
            return true;
        }
        throw new NullPointerException("Attempted to add null object to queue");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f19537n = false;
        this.f19535l = 0;
        this.f19536m = 0;
        Arrays.fill(this.f19534k, (Object) null);
    }

    @Override // java.util.Queue
    public E element() {
        if (!isEmpty()) {
            return peek();
        }
        throw new NoSuchElementException("queue is empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return new C8851a();
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        return add(e);
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f19534k[this.f19535l];
    }

    @Override // java.util.Queue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public E remove() {
        if (!isEmpty()) {
            E[] eArr = this.f19534k;
            int i = this.f19535l;
            E e = eArr[i];
            if (e != null) {
                int i2 = i + 1;
                this.f19535l = i2;
                eArr[i] = null;
                if (i2 >= this.f19538o) {
                    this.f19535l = 0;
                }
                this.f19537n = false;
            }
            return e;
        }
        throw new NoSuchElementException("queue is empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i;
        int i2 = this.f19536m;
        int i3 = this.f19535l;
        if (i2 < i3) {
            return (this.f19538o - i3) + i2;
        }
        if (i2 != i3) {
            return i2 - i3;
        }
        if (this.f19537n) {
            i = this.f19538o;
        } else {
            i = 0;
        }
        return i;
    }

    /* renamed from: u */
    public boolean m17872u() {
        return size() == this.f19538o;
    }
}
