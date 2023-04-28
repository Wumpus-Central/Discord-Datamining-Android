package p163j$.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;

/* renamed from: j$.util.Set */
/* loaded from: classes2.dex */
public interface Set<E> extends Collection<E> {

    /* renamed from: j$.util.Set$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC<E> {
        public static Spliterator $default$spliterator(java.util.Set set) {
            return Spliterators.spliterator(set, 1);
        }
    }

    /* renamed from: j$.util.Set$-EL */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class EL {
        public static Spliterator spliterator(java.util.Set set) {
            if (set instanceof Set) {
                return ((Set) set).spliterator();
            }
            if (set instanceof LinkedHashSet) {
                return Spliterators.spliterator((LinkedHashSet) set, 17);
            }
            if (!(set instanceof SortedSet)) {
                return Spliterators.spliterator(set, 1);
            }
            SortedSet sortedSet = (SortedSet) set;
            return new C9445w(sortedSet, sortedSet);
        }
    }

    @Override // java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
    boolean add(E e);

    @Override // java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
    boolean addAll(Collection<? extends E> collection);

    @Override // java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
    void clear();

    @Override // java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection, java.util.List, p163j$.util.List
    boolean contains(Object obj);

    @Override // java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
    boolean containsAll(Collection<?> collection);

    @Override // java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
    boolean equals(Object obj);

    @Override // java.util.Set, p163j$.util.Set
    int hashCode();

    @Override // java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection, java.util.List, p163j$.util.List
    boolean isEmpty();

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, p163j$.util.Set, p163j$.util.Collection
    Iterator<E> iterator();

    @Override // java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
    boolean remove(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
    boolean removeAll(Collection<?> collection);

    @Override // java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
    boolean retainAll(Collection<?> collection);

    @Override // java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection, java.util.List, p163j$.util.List
    int size();

    @Override // java.lang.Iterable, java.util.Set, p163j$.util.Set, p163j$.util.Collection
    Spliterator<E> spliterator();

    @Override // p163j$.util.Collection, java.util.Collection
    Object[] toArray();

    @Override // p163j$.util.Collection, java.util.Collection
    <T> T[] toArray(T[] tArr);
}
