package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.collection.b */
/* loaded from: classes.dex */
public final class C2095b<E> implements Collection<E>, Set<E> {

    /* renamed from: o */
    private static final int[] f2424o = new int[0];

    /* renamed from: p */
    private static final Object[] f2425p = new Object[0];

    /* renamed from: q */
    private static Object[] f2426q;

    /* renamed from: r */
    private static int f2427r;

    /* renamed from: s */
    private static Object[] f2428s;

    /* renamed from: t */
    private static int f2429t;

    /* renamed from: k */
    private int[] f2430k;

    /* renamed from: l */
    Object[] f2431l;

    /* renamed from: m */
    int f2432m;

    /* renamed from: n */
    private AbstractC2099e<E, E> f2433n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.collection.b$a */
    /* loaded from: classes.dex */
    public class C2096a extends AbstractC2099e<E, E> {
        C2096a() {
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: a */
        protected void mo39006a() {
            C2095b.this.clear();
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: b */
        protected Object mo39005b(int i, int i2) {
            return C2095b.this.f2431l[i];
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: c */
        protected Map<E, E> mo39004c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: d */
        protected int mo39003d() {
            return C2095b.this.f2432m;
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: e */
        protected int mo39002e(Object obj) {
            return C2095b.this.indexOf(obj);
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: f */
        protected int mo39001f(Object obj) {
            return C2095b.this.indexOf(obj);
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: g */
        protected void mo39000g(E e, E e2) {
            C2095b.this.add(e);
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: h */
        protected void mo38999h(int i) {
            C2095b.this.m39028j(i);
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: i */
        protected E mo38998i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C2095b() {
        this(0);
    }

    /* renamed from: a */
    private void m39034a(int i) {
        if (i == 8) {
            synchronized (C2095b.class) {
                Object[] objArr = f2428s;
                if (objArr != null) {
                    this.f2431l = objArr;
                    f2428s = (Object[]) objArr[0];
                    this.f2430k = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2429t--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C2095b.class) {
                Object[] objArr2 = f2426q;
                if (objArr2 != null) {
                    this.f2431l = objArr2;
                    f2426q = (Object[]) objArr2[0];
                    this.f2430k = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2427r--;
                    return;
                }
            }
        }
        this.f2430k = new int[i];
        this.f2431l = new Object[i];
    }

    /* renamed from: e */
    private static void m39032e(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C2095b.class) {
                if (f2429t < 10) {
                    objArr[0] = f2428s;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2428s = objArr;
                    f2429t++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C2095b.class) {
                if (f2427r < 10) {
                    objArr[0] = f2426q;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2426q = objArr;
                    f2427r++;
                }
            }
        }
    }

    /* renamed from: f */
    private AbstractC2099e<E, E> m39031f() {
        if (this.f2433n == null) {
            this.f2433n = new C2096a();
        }
        return this.f2433n;
    }

    /* renamed from: g */
    private int m39030g(Object obj, int i) {
        int i2 = this.f2432m;
        if (i2 == 0) {
            return -1;
        }
        int a = C2097c.m39026a(this.f2430k, i2, i);
        if (a < 0) {
            return a;
        }
        if (obj.equals(this.f2431l[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f2430k[i3] == i) {
            if (obj.equals(this.f2431l[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.f2430k[i4] == i; i4--) {
            if (obj.equals(this.f2431l[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: i */
    private int m39029i() {
        int i = this.f2432m;
        if (i == 0) {
            return -1;
        }
        int a = C2097c.m39026a(this.f2430k, i, 0);
        if (a < 0) {
            return a;
        }
        if (this.f2431l[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f2430k[i2] == 0) {
            if (this.f2431l[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.f2430k[i3] == 0; i3--) {
            if (this.f2431l[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m39029i();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m39030g(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f2432m;
        int[] iArr = this.f2430k;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f2431l;
            m39034a(i5);
            int[] iArr2 = this.f2430k;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2431l, 0, objArr.length);
            }
            m39032e(iArr, objArr, this.f2432m);
        }
        int i6 = this.f2432m;
        if (i3 < i6) {
            int[] iArr3 = this.f2430k;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f2431l;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f2432m - i3);
        }
        this.f2430k[i3] = i;
        this.f2431l[i3] = e;
        this.f2432m++;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m39033b(this.f2432m + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    public void m39033b(int i) {
        int[] iArr = this.f2430k;
        if (iArr.length < i) {
            Object[] objArr = this.f2431l;
            m39034a(i);
            int i2 = this.f2432m;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f2430k, 0, i2);
                System.arraycopy(objArr, 0, this.f2431l, 0, this.f2432m);
            }
            m39032e(iArr, objArr, this.f2432m);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f2432m;
        if (i != 0) {
            m39032e(this.f2430k, this.f2431l, i);
            this.f2430k = f2424o;
            this.f2431l = f2425p;
            this.f2432m = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f2432m; i++) {
                try {
                    if (!set.contains(m39027p(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f2430k;
        int i = this.f2432m;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m39029i() : m39030g(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f2432m <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m39031f().m38994m().iterator();
    }

    /* renamed from: j */
    public E m39028j(int i) {
        Object[] objArr = this.f2431l;
        E e = (E) objArr[i];
        int i2 = this.f2432m;
        if (i2 <= 1) {
            m39032e(this.f2430k, objArr, i2);
            this.f2430k = f2424o;
            this.f2431l = f2425p;
            this.f2432m = 0;
        } else {
            int[] iArr = this.f2430k;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f2432m = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr2 = this.f2431l;
                    System.arraycopy(objArr2, i5, objArr2, i, this.f2432m - i);
                }
                this.f2431l[this.f2432m] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                m39034a(i3);
                this.f2432m--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f2430k, 0, i);
                    System.arraycopy(objArr, 0, this.f2431l, 0, i);
                }
                int i6 = this.f2432m;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f2430k, i, i6 - i);
                    System.arraycopy(objArr, i7, this.f2431l, i, this.f2432m - i);
                }
            }
        }
        return e;
    }

    /* renamed from: p */
    public E m39027p(int i) {
        return (E) this.f2431l[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m39028j(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f2432m - 1; i >= 0; i--) {
            if (!collection.contains(this.f2431l[i])) {
                m39028j(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f2432m;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f2432m;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f2431l, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2432m * 14);
        sb2.append('{');
        for (int i = 0; i < this.f2432m; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            E p = m39027p(i);
            if (p != this) {
                sb2.append(p);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C2095b(int i) {
        if (i == 0) {
            this.f2430k = f2424o;
            this.f2431l = f2425p;
        } else {
            m39034a(i);
        }
        this.f2432m = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f2432m) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2432m));
        }
        System.arraycopy(this.f2431l, 0, tArr, 0, this.f2432m);
        int length = tArr.length;
        int i = this.f2432m;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
