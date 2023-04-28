package sa;

import java.util.NoSuchElementException;

/* renamed from: sa.v */
/* loaded from: classes3.dex */
abstract class AbstractC12855v extends AbstractC12843j {

    /* renamed from: k */
    private final int f28927k;

    /* renamed from: l */
    private int f28928l;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12855v(int i, int i2) {
        C12853t.m5264b(i2, i, "index");
        this.f28927k = i;
        this.f28928l = i2;
    }

    /* renamed from: b */
    protected abstract Object mo5250b(int i);

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final boolean hasNext() {
        return this.f28928l < this.f28927k;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f28928l > 0;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f28928l;
            this.f28928l = i + 1;
            return mo5250b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f28928l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f28928l - 1;
            this.f28928l = i;
            return mo5250b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f28928l - 1;
    }
}
