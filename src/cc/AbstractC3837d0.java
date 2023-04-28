package cc;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.Serializable;
import java.util.AbstractCollection;
import p030bc.C3457i;
import p163j$.lang.Iterable$CC;
import p163j$.util.Collection;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.Consumer;
import p163j$.util.function.Predicate;

/* renamed from: cc.d0 */
/* loaded from: classes3.dex */
public abstract class AbstractC3837d0<E> extends AbstractCollection<E> implements Serializable, Collection {

    /* renamed from: k */
    private static final Object[] f6363k = new Object[0];

    /* renamed from: cc.d0$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC3838a<E> {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static int m33498a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return ViewDefaults.NUMBER_OF_LINES;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    /* renamed from: a */
    public AbstractC3884i0<E> mo33253a() {
        int size = size();
        if (size == 0) {
            return AbstractC3884i0.m33399x();
        }
        if (size != 1) {
            return new C3945t1(this, toArray());
        }
        return AbstractC3884i0.m33398y(iterator().next());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    @Deprecated
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo33225b(Object[] objArr, int i) {
        AbstractC3868g2<E> j = iterator();
        while (j.hasNext()) {
            objArr[i] = j.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public abstract boolean contains(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Object[] mo33242e() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo33241f() {
        throw new UnsupportedOperationException();
    }

    @Override // p163j$.util.Collection, p163j$.lang.AbstractC9165a
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo33240g() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract boolean mo33222i();

    /* renamed from: j */
    public abstract AbstractC3868g2<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    @Deprecated
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p163j$.util.Collection
    @Deprecated
    public final boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return removeIf(Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    @Deprecated
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection
    public final Object[] toArray() {
        return toArray(f6363k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C3457i.m34352i(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] e = mo33242e();
            if (e != null) {
                return (T[]) C3942s1.m33308a(e, mo33240g(), mo33241f(), tArr);
            }
            tArr = (T[]) C3934q1.m33317d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo33225b(tArr, 0);
        return tArr;
    }
}
