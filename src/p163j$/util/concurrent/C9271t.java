package p163j$.util.concurrent;

import java.util.Iterator;
import p163j$.util.Collection;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;
import p163j$.util.function.Predicate;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.t */
/* loaded from: classes2.dex */
public final class C9271t extends AbstractC9254c implements Collection {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9271t(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    @Override // java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p163j$.util.concurrent.AbstractC9254c, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20326a.containsValue(obj);
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
                    consumer.accept(c.f20338c);
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

    @Override // p163j$.util.concurrent.AbstractC9254c, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f20326a;
        C9264m[] mVarArr = concurrentHashMap.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new C9260i(mVarArr, length, length, concurrentHashMap, 1);
    }

    @Override // java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public final boolean remove(Object obj) {
        AbstractC0482b bVar;
        if (obj == null) {
            return false;
        }
        Iterator it = iterator();
        do {
            bVar = (AbstractC0482b) it;
            if (!bVar.hasNext()) {
                return false;
            }
        } while (!obj.equals(((C9260i) it).next()));
        bVar.remove();
        return true;
    }

    @Override // p163j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f20326a;
        long sumCount = concurrentHashMap.sumCount();
        C9264m[] mVarArr = concurrentHashMap.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        long j = 0;
        if (sumCount >= 0) {
            j = sumCount;
        }
        return new C9262k(mVarArr, length, 0, length, j, 1);
    }

    @Override // p163j$.util.Collection
    public final Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }
}
