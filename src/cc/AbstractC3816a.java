package cc;

import java.util.NoSuchElementException;
import p030bc.C3457i;

/* renamed from: cc.a */
/* loaded from: classes3.dex */
abstract class AbstractC3816a<E> extends AbstractC3882h2<E> {

    /* renamed from: k */
    private final int f6333k;

    /* renamed from: l */
    private int f6334l;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3816a(int i, int i2) {
        C3457i.m34350k(i2, i);
        this.f6333k = i;
        this.f6334l = i2;
    }

    /* renamed from: b */
    protected abstract E mo33396b(int i);

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final boolean hasNext() {
        return this.f6334l < this.f6333k;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6334l > 0;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final E next() {
        if (hasNext()) {
            int i = this.f6334l;
            this.f6334l = i + 1;
            return mo33396b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6334l;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f6334l - 1;
            this.f6334l = i;
            return mo33396b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6334l - 1;
    }
}
