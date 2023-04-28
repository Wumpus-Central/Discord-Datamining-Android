package p163j$.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import p163j$.util.function.UnaryOperator;

/* renamed from: j$.util.List */
/* loaded from: classes2.dex */
public interface List<E> extends Collection<E> {

    /* renamed from: j$.util.List$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC<E> {
        public static void $default$replaceAll(java.util.List list, UnaryOperator unaryOperator) {
            if (DesugarCollections.f20259b.isInstance(list)) {
                DesugarCollections.m16600e(list, unaryOperator);
                return;
            }
            unaryOperator.getClass();
            ListIterator<E> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                listIterator.set((E) unaryOperator.apply(listIterator.next()));
            }
        }

        public static void $default$sort(java.util.List list, Comparator comparator) {
            if (DesugarCollections.f20259b.isInstance(list)) {
                DesugarCollections.m16599f(list, comparator);
                return;
            }
            Object[] array = list.toArray();
            Arrays.sort(array, comparator);
            ListIterator<E> listIterator = list.listIterator();
            for (Object obj : array) {
                listIterator.next();
                listIterator.set(obj);
            }
        }
    }

    void add(int i, E e);

    @Override // p163j$.util.Collection, java.util.Set, p163j$.util.Set
    boolean add(E e);

    boolean addAll(int i, Collection<? extends E> collection);

    @Override // p163j$.util.Collection, java.util.Set, p163j$.util.Set
    boolean addAll(Collection<? extends E> collection);

    @Override // p163j$.util.Collection, java.util.Set, p163j$.util.Set
    void clear();

    @Override // p163j$.util.Collection, java.util.List, p163j$.util.List
    boolean contains(Object obj);

    @Override // p163j$.util.Collection, java.util.Set, p163j$.util.Set
    boolean containsAll(Collection<?> collection);

    @Override // java.util.Collection, java.util.List, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    boolean equals(Object obj);

    E get(int i);

    @Override // java.util.Collection, java.util.List, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    int hashCode();

    int indexOf(Object obj);

    @Override // p163j$.util.Collection, java.util.List, p163j$.util.List
    boolean isEmpty();

    @Override // p163j$.util.Collection, java.lang.Iterable, java.util.Set, p163j$.util.Set
    Iterator<E> iterator();

    int lastIndexOf(Object obj);

    ListIterator<E> listIterator();

    ListIterator<E> listIterator(int i);

    E remove(int i);

    @Override // p163j$.util.Collection, java.util.Set, p163j$.util.Set
    boolean remove(Object obj);

    @Override // p163j$.util.Collection, java.util.Collection, java.util.Set, p163j$.util.Set
    boolean removeAll(Collection<?> collection);

    void replaceAll(UnaryOperator<E> unaryOperator);

    @Override // p163j$.util.Collection, java.util.Set, p163j$.util.Set
    boolean retainAll(Collection<?> collection);

    E set(int i, E e);

    @Override // p163j$.util.Collection, java.util.List, p163j$.util.List
    int size();

    void sort(Comparator<? super E> comparator);

    @Override // java.lang.Iterable, java.util.List, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    Spliterator<E> spliterator();

    java.util.List<E> subList(int i, int i2);

    @Override // p163j$.util.Collection, java.util.Collection
    Object[] toArray();

    @Override // p163j$.util.Collection, java.util.Collection
    <T> T[] toArray(T[] tArr);
}
