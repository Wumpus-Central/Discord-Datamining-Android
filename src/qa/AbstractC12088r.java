package qa;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: qa.r */
/* loaded from: classes3.dex */
public abstract class AbstractC12088r<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: k */
    private static final Object[] f27136k = new Object[0];

    /* renamed from: a */
    int mo7845a(Object[] objArr, int i) {
        AbstractC12057b0 b0Var = (AbstractC12057b0) iterator();
        while (b0Var.hasNext()) {
            objArr[i] = b0Var.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract AbstractC12057b0<E> mo7844b();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public abstract AbstractC12086q<E> mo7852e();

    /* JADX INFO: Access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: f */
    public Object[] mo7843f() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo7842g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    int mo7841i() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract /* synthetic */ Iterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f27136k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C12080n.m7871b(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] f = mo7843f();
            if (f != null) {
                return (T[]) Arrays.copyOfRange(f, mo7842g(), mo7841i(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo7845a(tArr, 0);
        return tArr;
    }
}
