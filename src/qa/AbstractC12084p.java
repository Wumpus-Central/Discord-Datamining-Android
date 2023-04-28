package qa;

import java.util.NoSuchElementException;

/* renamed from: qa.p */
/* loaded from: classes3.dex */
abstract class AbstractC12084p<E> extends AbstractC12063e0<E> {

    /* renamed from: k */
    private final int f27120k;

    /* renamed from: l */
    private int f27121l;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12084p(int i, int i2) {
        C12080n.m7866g(i2, i);
        this.f27120k = i;
        this.f27121l = i2;
    }

    /* renamed from: b */
    protected abstract E mo7854b(int i);

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final boolean hasNext() {
        return this.f27121l < this.f27120k;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f27121l > 0;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final E next() {
        if (hasNext()) {
            int i = this.f27121l;
            this.f27121l = i + 1;
            return mo7854b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27121l;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f27121l - 1;
            this.f27121l = i;
            return mo7854b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27121l - 1;
    }
}
