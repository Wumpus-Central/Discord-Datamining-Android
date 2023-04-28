package androidx.collection;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class SimpleArrayMap<K, V> {

    /* renamed from: n */
    static Object[] f2410n;

    /* renamed from: o */
    static int f2411o;

    /* renamed from: p */
    static Object[] f2412p;

    /* renamed from: q */
    static int f2413q;

    /* renamed from: k */
    int[] f2414k;

    /* renamed from: l */
    Object[] f2415l;

    /* renamed from: m */
    int f2416m;

    public SimpleArrayMap() {
        this.f2414k = C2097c.f2435a;
        this.f2415l = C2097c.f2437c;
        this.f2416m = 0;
    }

    /* renamed from: a */
    private void m39060a(int i) {
        if (i == 8) {
            synchronized (SimpleArrayMap.class) {
                Object[] objArr = f2412p;
                if (objArr != null) {
                    this.f2415l = objArr;
                    f2412p = (Object[]) objArr[0];
                    this.f2414k = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2413q--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (SimpleArrayMap.class) {
                Object[] objArr2 = f2410n;
                if (objArr2 != null) {
                    this.f2415l = objArr2;
                    f2410n = (Object[]) objArr2[0];
                    this.f2414k = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2411o--;
                    return;
                }
            }
        }
        this.f2414k = new int[i];
        this.f2415l = new Object[i << 1];
    }

    /* renamed from: b */
    private static int m39059b(int[] iArr, int i, int i2) {
        try {
            return C2097c.m39026a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m39057d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (SimpleArrayMap.class) {
                if (f2413q < 10) {
                    objArr[0] = f2412p;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2412p = objArr;
                    f2413q++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (SimpleArrayMap.class) {
                if (f2411o < 10) {
                    objArr[0] = f2410n;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2410n = objArr;
                    f2411o++;
                }
            }
        }
    }

    /* renamed from: c */
    public void m39058c(int i) {
        int i2 = this.f2416m;
        int[] iArr = this.f2414k;
        if (iArr.length < i) {
            Object[] objArr = this.f2415l;
            m39060a(i);
            if (this.f2416m > 0) {
                System.arraycopy(iArr, 0, this.f2414k, 0, i2);
                System.arraycopy(objArr, 0, this.f2415l, 0, i2 << 1);
            }
            m39057d(iArr, objArr, i2);
        }
        if (this.f2416m != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f2416m;
        if (i > 0) {
            int[] iArr = this.f2414k;
            Object[] objArr = this.f2415l;
            this.f2414k = C2097c.f2435a;
            this.f2415l = C2097c.f2437c;
            this.f2416m = 0;
            m39057d(iArr, objArr, i);
        }
        if (this.f2416m > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m39055g(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m39053i(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleArrayMap) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
            if (size() != simpleArrayMap.size()) {
                return false;
            }
            for (int i = 0; i < this.f2416m; i++) {
                try {
                    K j = m39052j(i);
                    V n = m39048n(i);
                    Object obj2 = simpleArrayMap.get(j);
                    if (n == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(j)) {
                            return false;
                        }
                    } else if (!n.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2416m; i2++) {
                try {
                    K j2 = m39052j(i2);
                    V n2 = m39048n(i2);
                    Object obj3 = map.get(j2);
                    if (n2 == null) {
                        if (obj3 != null || !map.containsKey(j2)) {
                            return false;
                        }
                    } else if (!n2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    int m39056f(Object obj, int i) {
        int i2 = this.f2416m;
        if (i2 == 0) {
            return -1;
        }
        int b = m39059b(this.f2414k, i2, i);
        if (b < 0) {
            return b;
        }
        if (obj.equals(this.f2415l[b << 1])) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.f2414k[i3] == i) {
            if (obj.equals(this.f2415l[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = b - 1; i4 >= 0 && this.f2414k[i4] == i; i4--) {
            if (obj.equals(this.f2415l[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: g */
    public int m39055g(Object obj) {
        return obj == null ? m39054h() : m39056f(obj, obj.hashCode());
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int g = m39055g(obj);
        if (g >= 0) {
            return (V) this.f2415l[(g << 1) + 1];
        }
        return v;
    }

    /* renamed from: h */
    int m39054h() {
        int i = this.f2416m;
        if (i == 0) {
            return -1;
        }
        int b = m39059b(this.f2414k, i, 0);
        if (b < 0) {
            return b;
        }
        if (this.f2415l[b << 1] == null) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < i && this.f2414k[i2] == 0) {
            if (this.f2415l[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = b - 1; i3 >= 0 && this.f2414k[i3] == 0; i3--) {
            if (this.f2415l[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public int hashCode() {
        int i;
        int[] iArr = this.f2414k;
        Object[] objArr = this.f2415l;
        int i2 = this.f2416m;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m39053i(Object obj) {
        int i = this.f2416m * 2;
        Object[] objArr = this.f2415l;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f2416m <= 0;
    }

    /* renamed from: j */
    public K m39052j(int i) {
        return (K) this.f2415l[i << 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public void m39051k(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        int i = simpleArrayMap.f2416m;
        m39058c(this.f2416m + i);
        if (this.f2416m != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(simpleArrayMap.m39052j(i2), simpleArrayMap.m39048n(i2));
            }
        } else if (i > 0) {
            System.arraycopy(simpleArrayMap.f2414k, 0, this.f2414k, 0, i);
            System.arraycopy(simpleArrayMap.f2415l, 0, this.f2415l, 0, i << 1);
            this.f2416m = i;
        }
    }

    /* renamed from: l */
    public V m39050l(int i) {
        Object[] objArr = this.f2415l;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f2416m;
        int i4 = 0;
        if (i3 <= 1) {
            m39057d(this.f2414k, objArr, i3);
            this.f2414k = C2097c.f2435a;
            this.f2415l = C2097c.f2437c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f2414k;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.f2415l;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.f2415l;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m39060a(i6);
                if (i3 == this.f2416m) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f2414k, 0, i);
                        System.arraycopy(objArr, 0, this.f2415l, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f2414k, i, i11);
                        System.arraycopy(objArr, i10 << 1, this.f2415l, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f2416m) {
            this.f2416m = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: m */
    public V m39049m(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f2415l;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* renamed from: n */
    public V m39048n(int i) {
        return (V) this.f2415l[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f2416m;
        if (k == null) {
            i2 = m39054h();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = m39056f(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            Object[] objArr = this.f2415l;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f2414k;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.f2415l;
            m39060a(i6);
            if (i3 == this.f2416m) {
                int[] iArr2 = this.f2414k;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f2415l, 0, objArr2.length);
                }
                m39057d(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f2414k;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f2415l;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f2416m - i5) << 1);
        }
        int i8 = this.f2416m;
        if (i3 == i8) {
            int[] iArr4 = this.f2414k;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.f2415l;
                int i9 = i5 << 1;
                objArr4[i9] = k;
                objArr4[i9 + 1] = v;
                this.f2416m = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        if (v2 == null) {
            return put(k, v);
        }
        return v2;
    }

    public V remove(Object obj) {
        int g = m39055g(obj);
        if (g >= 0) {
            return m39050l(g);
        }
        return null;
    }

    public V replace(K k, V v) {
        int g = m39055g(k);
        if (g >= 0) {
            return m39049m(g, v);
        }
        return null;
    }

    public int size() {
        return this.f2416m;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2416m * 28);
        sb2.append('{');
        for (int i = 0; i < this.f2416m; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            K j = m39052j(i);
            if (j != this) {
                sb2.append(j);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V n = m39048n(i);
            if (n != this) {
                sb2.append(n);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int g = m39055g(obj);
        if (g < 0) {
            return false;
        }
        V n = m39048n(g);
        if (obj2 != n && (obj2 == null || !obj2.equals(n))) {
            return false;
        }
        m39050l(g);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int g = m39055g(k);
        if (g < 0) {
            return false;
        }
        V n = m39048n(g);
        if (n != v && (v == null || !v.equals(n))) {
            return false;
        }
        m39049m(g, v2);
        return true;
    }

    public SimpleArrayMap(int i) {
        if (i == 0) {
            this.f2414k = C2097c.f2435a;
            this.f2415l = C2097c.f2437c;
        } else {
            m39060a(i);
        }
        this.f2416m = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
        this();
        if (simpleArrayMap != 0) {
            m39051k(simpleArrayMap);
        }
    }
}
