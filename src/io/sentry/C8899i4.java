package io.sentry;

import java.util.Queue;

/* renamed from: io.sentry.i4 */
/* loaded from: classes8.dex */
final class C8899i4<E> extends C8881h4<E> implements Queue<E> {
    private C8899i4(Queue<E> queue) {
        super(queue);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <E> C8899i4<E> m17757e(Queue<E> queue) {
        return new C8899i4<>(queue);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public Queue<E> mo17759a() {
        return (Queue) super.mo17759a();
    }

    @Override // java.util.Queue
    public E element() {
        E element;
        synchronized (this.f19573l) {
            element = mo17759a().element();
        }
        return element;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f19573l) {
            equals = mo17759a().equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int hashCode;
        synchronized (this.f19573l) {
            hashCode = mo17759a().hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        boolean offer;
        synchronized (this.f19573l) {
            offer = mo17759a().offer(e);
        }
        return offer;
    }

    @Override // java.util.Queue
    public E peek() {
        E peek;
        synchronized (this.f19573l) {
            peek = mo17759a().peek();
        }
        return peek;
    }

    @Override // java.util.Queue
    public E poll() {
        E poll;
        synchronized (this.f19573l) {
            poll = mo17759a().poll();
        }
        return poll;
    }

    @Override // java.util.Queue
    public E remove() {
        E remove;
        synchronized (this.f19573l) {
            remove = mo17759a().remove();
        }
        return remove;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f19573l) {
            array = mo17759a().toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.f19573l) {
            tArr2 = (T[]) mo17759a().toArray(tArr);
        }
        return tArr2;
    }
}
