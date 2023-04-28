package qa;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: qa.q */
/* loaded from: classes3.dex */
public abstract class AbstractC12086q<E> extends AbstractC12088r<E> implements List<E>, RandomAccess {

    /* renamed from: l */
    private static final AbstractC12063e0<Object> f27135l = new C12092t(C12098w.f27144o, 0);

    /* renamed from: p */
    public static <E> AbstractC12086q<E> m7859p(E e) {
        Object[] objArr = {e};
        for (int i = 0; i <= 0; i++) {
            C12099x.m7847a(objArr[0], 0);
        }
        return m7857s(objArr, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static <E> AbstractC12086q<E> m7858r(Object[] objArr) {
        return m7857s(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static <E> AbstractC12086q<E> m7857s(Object[] objArr, int i) {
        if (i == 0) {
            return (AbstractC12086q<E>) C12098w.f27144o;
        }
        return new C12098w(objArr, i);
    }

    @Override // qa.AbstractC12088r
    /* renamed from: a */
    int mo7845a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // qa.AbstractC12088r
    /* renamed from: b */
    public final AbstractC12057b0<E> mo7844b() {
        return (AbstractC12063e0) listIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // qa.AbstractC12088r
    /* renamed from: e */
    public final AbstractC12086q<E> mo7852e() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
        if (obj == C12080n.m7871b(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (C12074k.m7878a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e = get(i2);
                        i2++;
                        if (!C12074k.m7878a(e, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // qa.AbstractC12088r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Iterator iterator() {
        return mo7844b();
    }

    /* renamed from: j */
    public AbstractC12086q<E> subList(int i, int i2) {
        C12080n.m7869d(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return (AbstractC12086q<E>) C12098w.f27144o;
        }
        return new C12090s(this, i, i3);
    }

    @Override // java.util.List
    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i) {
        C12080n.m7866g(i, size());
        if (isEmpty()) {
            return f27135l;
        }
        return new C12092t(this, i);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (AbstractC12063e0) listIterator(0);
    }
}
