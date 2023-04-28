package p163j$.util;

import java.util.Comparator;

/* renamed from: j$.util.SortedSet */
/* loaded from: classes2.dex */
public interface SortedSet<E> extends Set<E> {
    Comparator<? super E> comparator();

    E first();

    java.util.SortedSet<E> headSet(E e);

    E last();

    @Override // p163j$.util.Set, java.lang.Iterable, java.util.Set, p163j$.util.Collection
    Spliterator<E> spliterator();

    java.util.SortedSet<E> subSet(E e, E e2);

    java.util.SortedSet<E> tailSet(E e);
}
