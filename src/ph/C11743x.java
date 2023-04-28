package ph;

import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* renamed from: ph.x */
/* loaded from: classes8.dex */
public class C11743x extends AbstractList<String> implements RandomAccess, AbstractC11720o {

    /* renamed from: k */
    private final AbstractC11720o f26217k;

    /* renamed from: ph.x$a */
    /* loaded from: classes8.dex */
    class C11744a implements ListIterator<String>, Iterator {

        /* renamed from: k */
        ListIterator<String> f26218k;

        /* renamed from: l */
        final /* synthetic */ int f26219l;

        C11744a(int i) {
            this.f26219l = i;
            this.f26218k = C11743x.this.f26217k.listIterator(i);
        }

        /* renamed from: b */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f26218k.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f26218k.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.ListIterator, java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f26218k.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f26218k.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f26218k.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f26218k.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: ph.x$b */
    /* loaded from: classes8.dex */
    class C11745b implements java.util.Iterator<String>, Iterator {

        /* renamed from: k */
        java.util.Iterator<String> f26221k;

        C11745b() {
            this.f26221k = C11743x.this.f26217k.iterator();
        }

        /* renamed from: b */
        public String next() {
            return this.f26221k.next();
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super String> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f26221k.hasNext();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C11743x(AbstractC11720o oVar) {
        this.f26217k = oVar;
    }

    /* renamed from: b */
    public String get(int i) {
        return this.f26217k.get(i);
    }

    @Override // ph.AbstractC11720o
    /* renamed from: h */
    public List<?> mo8713h() {
        return this.f26217k.mo8713h();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<String> iterator() {
        return new C11745b();
    }

    @Override // ph.AbstractC11720o
    /* renamed from: k */
    public AbstractC11691d mo8712k(int i) {
        return this.f26217k.mo8712k(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new C11744a(i);
    }

    @Override // ph.AbstractC11720o
    /* renamed from: m */
    public void mo8711m(AbstractC11691d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // ph.AbstractC11720o
    /* renamed from: q */
    public AbstractC11720o mo8710q() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26217k.size();
    }
}
