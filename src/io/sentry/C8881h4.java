package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.sentry.h4 */
/* loaded from: classes8.dex */
class C8881h4<E> implements Collection<E>, Serializable {

    /* renamed from: k */
    private final Collection<E> f19572k;

    /* renamed from: l */
    final Object f19573l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8881h4(Collection<E> collection) {
        if (collection != null) {
            this.f19572k = collection;
            this.f19573l = this;
            return;
        }
        throw new NullPointerException("Collection must not be null.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Collection<E> mo17759a() {
        return this.f19572k;
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        boolean add;
        synchronized (this.f19573l) {
            add = mo17759a().add(e);
        }
        return add;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        boolean addAll;
        synchronized (this.f19573l) {
            addAll = mo17759a().addAll(collection);
        }
        return addAll;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f19573l) {
            mo17759a().clear();
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.f19573l) {
            contains = mo17759a().contains(obj);
        }
        return contains;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        boolean containsAll;
        synchronized (this.f19573l) {
            containsAll = mo17759a().containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f19573l) {
            isEmpty = mo17759a().isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return mo17759a().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.f19573l) {
            remove = mo17759a().remove(obj);
        }
        return remove;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean removeAll;
        synchronized (this.f19573l) {
            removeAll = mo17759a().removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean retainAll;
        synchronized (this.f19573l) {
            retainAll = mo17759a().retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f19573l) {
            size = mo17759a().size();
        }
        return size;
    }

    public String toString() {
        String obj;
        synchronized (this.f19573l) {
            obj = mo17759a().toString();
        }
        return obj;
    }
}
