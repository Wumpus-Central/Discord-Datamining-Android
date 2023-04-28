package pa;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* renamed from: pa.f */
/* loaded from: classes3.dex */
abstract class AbstractC11594f<T> implements Iterator<T>, p163j$.util.Iterator {

    /* renamed from: k */
    private T f25858k;

    /* renamed from: l */
    private int f25859l = 2;

    /* renamed from: b */
    protected abstract T mo9283b();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final T m9289c() {
        this.f25859l = 3;
        return null;
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
    public final boolean hasNext() {
        int i = this.f25859l;
        if (i != 4) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return true;
            } else {
                if (i2 != 2) {
                    this.f25859l = 4;
                    this.f25858k = mo9283b();
                    if (this.f25859l != 3) {
                        this.f25859l = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f25859l = 2;
            T t = this.f25858k;
            this.f25858k = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
