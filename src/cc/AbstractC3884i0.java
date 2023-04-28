package cc;

import cc.AbstractC3837d0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import p030bc.C3457i;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;
import p163j$.util.function.UnaryOperator;

/* renamed from: cc.i0 */
/* loaded from: classes3.dex */
public abstract class AbstractC3884i0<E> extends AbstractC3837d0<E> implements List<E>, RandomAccess, p163j$.util.List {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.i0$a */
    /* loaded from: classes3.dex */
    public class C3885a extends AbstractC3816a<E> {
        C3885a(int i, int i2) {
            super(i, i2);
        }

        @Override // cc.AbstractC3816a
        /* renamed from: b */
        protected E mo33396b(int i) {
            return AbstractC3884i0.this.get(i);
        }
    }

    /* renamed from: cc.i0$b */
    /* loaded from: classes3.dex */
    public static final class C3886b<E> extends AbstractC3837d0.AbstractC3838a<E> {

        /* renamed from: a */
        Object[] f6419a;

        /* renamed from: b */
        private int f6420b;

        /* renamed from: c */
        private boolean f6421c;

        public C3886b() {
            this(4);
        }

        /* renamed from: d */
        private void m33393d(int i) {
            Object[] objArr = this.f6419a;
            if (objArr.length < i) {
                this.f6419a = Arrays.copyOf(objArr, AbstractC3837d0.AbstractC3838a.m33498a(objArr.length, i));
                this.f6421c = false;
            } else if (this.f6421c) {
                this.f6419a = Arrays.copyOf(objArr, objArr.length);
                this.f6421c = false;
            }
        }

        /* renamed from: b */
        public C3886b<E> m33395b(E e) {
            C3457i.m34352i(e);
            m33393d(this.f6420b + 1);
            Object[] objArr = this.f6419a;
            int i = this.f6420b;
            this.f6420b = i + 1;
            objArr[i] = e;
            return this;
        }

        /* renamed from: c */
        public AbstractC3884i0<E> m33394c() {
            this.f6421c = true;
            return AbstractC3884i0.m33404r(this.f6419a, this.f6420b);
        }

        C3886b(int i) {
            this.f6419a = new Object[i];
            this.f6420b = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.i0$c */
    /* loaded from: classes3.dex */
    public class C3887c extends AbstractC3884i0<E> {

        /* renamed from: l */
        final transient int f6422l;

        /* renamed from: m */
        final transient int f6423m;

        C3887c(int i, int i2) {
            this.f6422l = i;
            this.f6423m = i2;
        }

        @Override // cc.AbstractC3884i0
        /* renamed from: C */
        public AbstractC3884i0<E> subList(int i, int i2) {
            C3457i.m34348m(i, i2, this.f6423m);
            AbstractC3884i0 i0Var = AbstractC3884i0.this;
            int i3 = this.f6422l;
            return i0Var.subList(i + i3, i2 + i3);
        }

        @Override // java.util.List, p163j$.util.List
        public E get(int i) {
            C3457i.m34354g(i, this.f6423m);
            return AbstractC3884i0.this.get(i + this.f6422l);
        }

        @Override // cc.AbstractC3837d0
        /* renamed from: i */
        boolean mo33222i() {
            return true;
        }

        @Override // cc.AbstractC3884i0, cc.AbstractC3837d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return AbstractC3884i0.super.iterator();
        }

        @Override // cc.AbstractC3884i0, java.util.List, p163j$.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return AbstractC3884i0.super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public int size() {
            return this.f6423m;
        }

        @Override // cc.AbstractC3884i0, java.util.List, p163j$.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return AbstractC3884i0.super.listIterator(i);
        }
    }

    /* renamed from: A */
    public static <E> AbstractC3884i0<E> m33408A(E e, E e2, E e3, E e4, E e5) {
        return m33402t(e, e2, e3, e4, e5);
    }

    /* renamed from: B */
    public static <E> AbstractC3884i0<E> m33407B(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C3457i.m34352i(comparator);
        Object[] f = C3976z0.m33212f(iterable);
        C3934q1.m33319b(f);
        Arrays.sort(f, comparator);
        return m33405p(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static <E> AbstractC3884i0<E> m33405p(Object[] objArr) {
        return m33404r(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static <E> AbstractC3884i0<E> m33404r(Object[] objArr, int i) {
        if (i == 0) {
            return m33399x();
        }
        if (i != 1) {
            if (i < objArr.length) {
                objArr = Arrays.copyOf(objArr, i);
            }
            return new C3948u1(objArr);
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        return m33398y(obj);
    }

    /* renamed from: s */
    public static <E> C3886b<E> m33403s() {
        return new C3886b<>();
    }

    /* renamed from: t */
    private static <E> AbstractC3884i0<E> m33402t(Object... objArr) {
        return m33405p(C3934q1.m33319b(objArr));
    }

    /* renamed from: u */
    public static <E> AbstractC3884i0<E> m33401u(Collection<? extends E> collection) {
        if (!(collection instanceof AbstractC3837d0)) {
            return m33402t(collection.toArray());
        }
        AbstractC3884i0<E> a = ((AbstractC3837d0) collection).mo33253a();
        if (a.mo33222i()) {
            return m33405p(a.toArray());
        }
        return a;
    }

    /* renamed from: x */
    public static <E> AbstractC3884i0<E> m33399x() {
        return (AbstractC3884i0<E>) C3948u1.f6490m;
    }

    /* renamed from: y */
    public static <E> AbstractC3884i0<E> m33398y(E e) {
        return new C3840d2(e);
    }

    /* renamed from: z */
    public static <E> AbstractC3884i0<E> m33397z(E e, E e2) {
        return m33402t(e, e2);
    }

    /* renamed from: C */
    public AbstractC3884i0<E> subList(int i, int i2) {
        C3457i.m34348m(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m33399x();
        }
        if (i3 == 1) {
            return m33398y(get(i));
        }
        return m33406D(i, i2);
    }

    /* renamed from: D */
    AbstractC3884i0<E> m33406D(int i, int i2) {
        return new C3887c(i, i2 - i);
    }

    @Override // cc.AbstractC3837d0
    @Deprecated
    /* renamed from: a */
    public final AbstractC3884i0<E> mo33253a() {
        return this;
    }

    @Override // java.util.List, p163j$.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, p163j$.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: b */
    public int mo33225b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // cc.AbstractC3837d0, java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public boolean equals(Object obj) {
        return C3847f1.m33496a(this, obj);
    }

    @Override // cc.AbstractC3837d0, p163j$.util.Collection, p163j$.lang.AbstractC9165a
    public void forEach(Consumer<? super E> consumer) {
        C3457i.m34352i(consumer);
        int size = size();
        for (int i = 0; i < size; i++) {
            consumer.accept(get(i));
        }
    }

    @Override // cc.AbstractC3837d0, java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List, p163j$.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C3847f1.m33495b(this, obj);
    }

    @Override // cc.AbstractC3837d0
    /* renamed from: j */
    public AbstractC3868g2<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List, p163j$.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C3847f1.m33493d(this, obj);
    }

    @Override // java.util.List, p163j$.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p163j$.util.List
    @Deprecated
    public final void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
    }

    @Override // java.util.List, p163j$.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, p163j$.util.List
    @Deprecated
    public final void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException();
    }

    @Override // cc.AbstractC3837d0, java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public Spliterator<E> spliterator() {
        return C3924p.m33338b(size(), 1296, new IntFunction() { // from class: cc.h0
            @Override // p163j$.util.function.IntFunction
            public final Object apply(int i) {
                return AbstractC3884i0.this.get(i);
            }
        });
    }

    /* renamed from: v */
    public AbstractC3882h2<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: w */
    public AbstractC3882h2<E> listIterator(int i) {
        return new C3885a(size(), i);
    }
}
