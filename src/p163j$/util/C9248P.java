package p163j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import p163j$.util.Iterator;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.P */
/* loaded from: classes2.dex */
class C9248P implements Spliterator {

    /* renamed from: a */
    private final Collection f20288a;

    /* renamed from: b */
    private Iterator f20289b;

    /* renamed from: c */
    private final int f20290c;

    /* renamed from: d */
    private long f20291d;

    /* renamed from: e */
    private int f20292e;

    public C9248P(Collection collection, int i) {
        this.f20288a = collection;
        this.f20289b = null;
        this.f20290c = (i & 4096) == 0 ? i | 64 | Spliterator.SUBSIZED : i;
    }

    public C9248P(Iterator it, long j, int i) {
        this.f20288a = null;
        this.f20289b = it;
        this.f20291d = j;
        this.f20290c = (i & 4096) == 0 ? i | 64 | Spliterator.SUBSIZED : i;
    }

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        return this.f20290c;
    }

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        if (this.f20289b != null) {
            return this.f20291d;
        }
        Collection collection = this.f20288a;
        this.f20289b = collection.iterator();
        long size = collection.size();
        this.f20291d = size;
        return size;
    }

    @Override // p163j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f20289b;
        if (it == null) {
            Collection collection = this.f20288a;
            Iterator it2 = collection.iterator();
            this.f20289b = it2;
            this.f20291d = collection.size();
            it = it2;
        }
        if (it instanceof Iterator) {
            ((Iterator) it).forEachRemaining(consumer);
        } else {
            Iterator.CC.$default$forEachRemaining(it, consumer);
        }
    }

    @Override // p163j$.util.Spliterator
    public Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // p163j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f20289b == null) {
            Collection collection = this.f20288a;
            this.f20289b = collection.iterator();
            this.f20291d = collection.size();
        }
        if (!this.f20289b.hasNext()) {
            return false;
        }
        consumer.accept(this.f20289b.next());
        return true;
    }

    @Override // p163j$.util.Spliterator
    public final Spliterator trySplit() {
        long j;
        java.util.Iterator it = this.f20289b;
        if (it == null) {
            Collection collection = this.f20288a;
            java.util.Iterator it2 = collection.iterator();
            this.f20289b = it2;
            j = collection.size();
            this.f20291d = j;
            it = it2;
        } else {
            j = this.f20291d;
        }
        if (j <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.f20292e + Spliterator.IMMUTABLE;
        if (i > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = it.next();
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (it.hasNext());
        this.f20292e = i2;
        long j2 = this.f20291d;
        if (j2 != Long.MAX_VALUE) {
            this.f20291d = j2 - i2;
        }
        return new C9241I(objArr, 0, i2, this.f20290c);
    }
}
