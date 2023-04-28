package p163j$.util.concurrent;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p163j$.util.Collection;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;
import p163j$.util.function.Predicate;

/* renamed from: j$.util.concurrent.j */
/* loaded from: classes2.dex */
public final class C9261j extends AbstractC9254c implements Set, p163j$.util.Set {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9261j(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    @Override // java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p163j$.util.concurrent.AbstractC9254c, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20326a.containsKey(obj);
    }

    @Override // java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override // p163j$.util.Collection, p163j$.lang.AbstractC9165a
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        C9264m[] mVarArr = this.f20326a.table;
        if (mVarArr != null) {
            C9268q qVar = new C9268q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C9264m c = qVar.m16570c();
                if (c != null) {
                    consumer.accept(c.f20337b);
                } else {
                    return;
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Collection, java.util.Set, p163j$.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (((AbstractC0482b) it).hasNext()) {
            i += ((C9260i) it).next().hashCode();
        }
        return i;
    }

    @Override // p163j$.util.concurrent.AbstractC9254c, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f20326a;
        C9264m[] mVarArr = concurrentHashMap.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new C9260i(mVarArr, length, length, concurrentHashMap, 0);
    }

    @Override // java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
    public final boolean remove(Object obj) {
        return this.f20326a.remove(obj) != null;
    }

    @Override // p163j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, p163j$.util.Set, p163j$.util.Collection
    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f20326a;
        long sumCount = concurrentHashMap.sumCount();
        C9264m[] mVarArr = concurrentHashMap.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        long j = 0;
        if (sumCount >= 0) {
            j = sumCount;
        }
        return new C9262k(mVarArr, length, 0, length, j, 0);
    }

    @Override // p163j$.util.Collection
    public final Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }
}
