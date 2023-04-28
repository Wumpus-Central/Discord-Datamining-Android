package androidx.collection;

/* loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {

    /* renamed from: o */
    private static final Object f2417o = new Object();

    /* renamed from: k */
    private boolean f2418k;

    /* renamed from: l */
    private int[] f2419l;

    /* renamed from: m */
    private Object[] f2420m;

    /* renamed from: n */
    private int f2421n;

    public SparseArrayCompat() {
        this(10);
    }

    /* renamed from: e */
    private void m39044e() {
        int i = this.f2421n;
        int[] iArr = this.f2419l;
        Object[] objArr = this.f2420m;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2417o) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2418k = false;
        this.f2421n = i2;
    }

    /* renamed from: a */
    public void m39047a(int i, E e) {
        int i2 = this.f2421n;
        if (i2 == 0 || i > this.f2419l[i2 - 1]) {
            if (this.f2418k && i2 >= this.f2419l.length) {
                m39044e();
            }
            int i3 = this.f2421n;
            if (i3 >= this.f2419l.length) {
                int e2 = C2097c.m39022e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f2419l;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f2420m;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2419l = iArr;
                this.f2420m = objArr;
            }
            this.f2419l[i3] = i;
            this.f2420m[i3] = e;
            this.f2421n = i3 + 1;
            return;
        }
        m39039l(i, e);
    }

    /* renamed from: c */
    public void m39046c() {
        int i = this.f2421n;
        Object[] objArr = this.f2420m;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2421n = 0;
        this.f2418k = false;
    }

    /* renamed from: d */
    public SparseArrayCompat<E> clone() {
        try {
            SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) super.clone();
            sparseArrayCompat.f2419l = (int[]) this.f2419l.clone();
            sparseArrayCompat.f2420m = (Object[]) this.f2420m.clone();
            return sparseArrayCompat;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public E m39043f(int i) {
        return m39042h(i, null);
    }

    /* renamed from: h */
    public E m39042h(int i, E e) {
        E e2;
        int a = C2097c.m39026a(this.f2419l, this.f2421n, i);
        if (a < 0 || (e2 = (E) this.f2420m[a]) == f2417o) {
            return e;
        }
        return e2;
    }

    /* renamed from: j */
    public int m39041j(E e) {
        if (this.f2418k) {
            m39044e();
        }
        for (int i = 0; i < this.f2421n; i++) {
            if (this.f2420m[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public int m39040k(int i) {
        if (this.f2418k) {
            m39044e();
        }
        return this.f2419l[i];
    }

    /* renamed from: l */
    public void m39039l(int i, E e) {
        int a = C2097c.m39026a(this.f2419l, this.f2421n, i);
        if (a >= 0) {
            this.f2420m[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.f2421n;
        if (i2 < i3) {
            Object[] objArr = this.f2420m;
            if (objArr[i2] == f2417o) {
                this.f2419l[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f2418k && i3 >= this.f2419l.length) {
            m39044e();
            i2 = ~C2097c.m39026a(this.f2419l, this.f2421n, i);
        }
        int i4 = this.f2421n;
        if (i4 >= this.f2419l.length) {
            int e2 = C2097c.m39022e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f2419l;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2420m;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2419l = iArr;
            this.f2420m = objArr2;
        }
        int i5 = this.f2421n;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f2419l;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f2420m;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f2421n - i2);
        }
        this.f2419l[i2] = i;
        this.f2420m[i2] = e;
        this.f2421n++;
    }

    /* renamed from: m */
    public int m39038m() {
        if (this.f2418k) {
            m39044e();
        }
        return this.f2421n;
    }

    /* renamed from: n */
    public E m39037n(int i) {
        if (this.f2418k) {
            m39044e();
        }
        return (E) this.f2420m[i];
    }

    public String toString() {
        if (m39038m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2421n * 28);
        sb2.append('{');
        for (int i = 0; i < this.f2421n; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(m39040k(i));
            sb2.append('=');
            E n = m39037n(i);
            if (n != this) {
                sb2.append(n);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public SparseArrayCompat(int i) {
        this.f2418k = false;
        if (i == 0) {
            this.f2419l = C2097c.f2435a;
            this.f2420m = C2097c.f2437c;
            return;
        }
        int e = C2097c.m39022e(i);
        this.f2419l = new int[e];
        this.f2420m = new Object[e];
    }
}
