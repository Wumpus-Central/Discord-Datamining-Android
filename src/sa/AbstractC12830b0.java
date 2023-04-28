package sa;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: sa.b0 */
/* loaded from: classes3.dex */
public abstract class AbstractC12830b0 extends AbstractC12858y implements List, RandomAccess {

    /* renamed from: l */
    private static final AbstractC12843j f28899l = new C12859z(C12829b.f28896o, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static AbstractC12830b0 m5316r(Object[] objArr) {
        return m5315s(objArr, objArr.length);
    }

    /* renamed from: s */
    static AbstractC12830b0 m5315s(Object[] objArr, int i) {
        if (i == 0) {
            return C12829b.f28896o;
        }
        return new C12829b(objArr, i);
    }

    /* renamed from: t */
    public static AbstractC12830b0 m5314t(Collection collection) {
        if (collection instanceof AbstractC12858y) {
            AbstractC12830b0 f = ((AbstractC12858y) collection).mo5254f();
            if (!f.mo5252i()) {
                return f;
            }
            Object[] array = f.toArray();
            return m5315s(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i = 0; i < length; i++) {
            if (array2[i] == null) {
                throw new NullPointerException("at index " + i);
            }
        }
        return m5315s(array2, length);
    }

    /* renamed from: u */
    public static AbstractC12830b0 m5313u() {
        return C12829b.f28896o;
    }

    @Override // sa.AbstractC12858y
    /* renamed from: a */
    int mo5257a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // sa.AbstractC12858y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (C12852s.m5266a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!C12852s.m5266a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // sa.AbstractC12858y
    @Deprecated
    /* renamed from: f */
    public final AbstractC12830b0 mo5254f() {
        return this;
    }

    @Override // sa.AbstractC12858y
    /* renamed from: g */
    public final AbstractC12842i mo5253g() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
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

    @Override // sa.AbstractC12858y, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
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
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: p */
    public AbstractC12830b0 subList(int i, int i2) {
        C12853t.m5262d(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C12829b.f28896o;
        }
        return new C12828a0(this, i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: v */
    public final AbstractC12843j listIterator(int i) {
        C12853t.m5264b(i, size(), "index");
        if (isEmpty()) {
            return f28899l;
        }
        return new C12859z(this, i);
    }
}
