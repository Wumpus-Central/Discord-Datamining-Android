package p286pi;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p163j$.lang.Iterable$CC;
import p163j$.util.Collection;
import p163j$.util.Iterator;
import p163j$.util.List;
import p163j$.util.function.Consumer;
import p163j$.util.function.Predicate;
import p163j$.util.function.UnaryOperator;

/* renamed from: pi.e */
/* loaded from: classes8.dex */
public class C11768e<E> extends AbstractList<E> implements RandomAccess, List {

    /* renamed from: k */
    private int f26269k;

    /* renamed from: l */
    private Object f26270l;

    /* renamed from: pi.e$b */
    /* loaded from: classes8.dex */
    private static class C11770b<T> implements Iterator<T>, p163j$.util.Iterator {

        /* renamed from: k */
        private static final C11770b f26271k = new C11770b();

        private C11770b() {
        }

        /* renamed from: b */
        public static <T> C11770b<T> m8661b() {
            return f26271k;
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
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* renamed from: pi.e$c */
    /* loaded from: classes8.dex */
    private class C11771c extends AbstractC11772d<E> implements p163j$.util.Iterator {

        /* renamed from: l */
        private final int f26272l;

        public C11771c() {
            super();
            this.f26272l = ((AbstractList) C11768e.this).modCount;
        }

        @Override // p286pi.C11768e.AbstractC11772d
        /* renamed from: b */
        protected void mo8660b() {
            if (((AbstractList) C11768e.this).modCount != this.f26272l) {
                throw new ConcurrentModificationException("ModCount: " + ((AbstractList) C11768e.this).modCount + "; expected: " + this.f26272l);
            }
        }

        @Override // p286pi.C11768e.AbstractC11772d
        /* renamed from: c */
        protected E mo8659c() {
            return (E) C11768e.this.f26270l;
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
        public void remove() {
            mo8660b();
            C11768e.this.clear();
        }
    }

    /* renamed from: pi.e$d */
    /* loaded from: classes8.dex */
    private static abstract class AbstractC11772d<T> implements java.util.Iterator<T> {

        /* renamed from: k */
        private boolean f26274k;

        private AbstractC11772d() {
        }

        /* renamed from: b */
        protected abstract void mo8660b();

        /* renamed from: c */
        protected abstract T mo8659c();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f26274k;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f26274k) {
                this.f26274k = true;
                mo8660b();
                return mo8659c();
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m8666a(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) {
            throw new IllegalStateException(format);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public boolean add(E e) {
        int i = this.f26269k;
        if (i == 0) {
            this.f26270l = e;
        } else if (i == 1) {
            this.f26270l = new Object[]{this.f26270l, e};
        } else {
            Object[] objArr = (Object[]) this.f26270l;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                this.f26270l = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f26269k] = e;
        }
        this.f26269k++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public void clear() {
        this.f26270l = null;
        this.f26269k = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // p163j$.util.Collection, p163j$.lang.AbstractC9165a
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.AbstractList, java.util.List, p163j$.util.List
    public E get(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f26269k)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f26269k);
        } else if (i2 == 1) {
            return (E) this.f26270l;
        } else {
            return (E) ((Object[]) this.f26270l)[i];
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public java.util.Iterator<E> iterator() {
        int i = this.f26269k;
        if (i == 0) {
            C11770b b = C11770b.m8661b();
            if (b == null) {
                m8666a(2);
            }
            return b;
        } else if (i == 1) {
            return new C11771c();
        } else {
            java.util.Iterator<E> it = super.iterator();
            if (it == null) {
                m8666a(3);
            }
            return it;
        }
    }

    @Override // java.util.AbstractList, java.util.List, p163j$.util.List
    public E remove(int i) {
        int i2;
        E e;
        if (i < 0 || i >= (i2 = this.f26269k)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f26269k);
        }
        if (i2 == 1) {
            e = (E) this.f26270l;
            this.f26270l = null;
        } else {
            Object[] objArr = (Object[]) this.f26270l;
            Object obj = objArr[i];
            if (i2 == 2) {
                this.f26270l = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.f26269k - 1] = null;
            }
            e = (E) obj;
        }
        this.f26269k--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // p163j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return removeIf(Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // p163j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
    }

    @Override // java.util.AbstractList, java.util.List, p163j$.util.List
    public E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.f26269k)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f26269k);
        } else if (i2 == 1) {
            E e2 = (E) this.f26270l;
            this.f26270l = e;
            return e2;
        } else {
            Object[] objArr = (Object[]) this.f26270l;
            E e3 = (E) objArr[i];
            objArr[i] = e;
            return e3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, p163j$.util.List, p163j$.util.Collection
    public int size() {
        return this.f26269k;
    }

    @Override // java.util.List, p163j$.util.List
    public void sort(Comparator<? super E> comparator) {
        int i = this.f26269k;
        if (i >= 2) {
            Arrays.sort((Object[]) this.f26270l, 0, i, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, p163j$.util.List, p163j$.util.Collection
    public <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            m8666a(4);
        }
        int length = tArr.length;
        int i = this.f26269k;
        if (i == 1) {
            if (length != 0) {
                tArr[0] = this.f26270l;
            } else {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f26270l;
                return tArr2;
            }
        } else if (length < i) {
            T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f26270l, i, tArr.getClass());
            if (tArr3 == null) {
                m8666a(6);
            }
            return tArr3;
        } else if (i != 0) {
            System.arraycopy(this.f26270l, 0, tArr, 0, i);
        }
        int i2 = this.f26269k;
        if (length > i2) {
            tArr[i2] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List, p163j$.util.List
    public void add(int i, E e) {
        int i2;
        if (i < 0 || i > (i2 = this.f26269k)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f26269k);
        }
        if (i2 == 0) {
            this.f26270l = e;
        } else if (i2 == 1 && i == 0) {
            this.f26270l = new Object[]{e, this.f26270l};
        } else {
            Object[] objArr = new Object[i2 + 1];
            if (i2 == 1) {
                objArr[0] = this.f26270l;
            } else {
                Object[] objArr2 = (Object[]) this.f26270l;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.f26269k - i);
            }
            objArr[i] = e;
            this.f26270l = objArr;
        }
        this.f26269k++;
        ((AbstractList) this).modCount++;
    }
}
