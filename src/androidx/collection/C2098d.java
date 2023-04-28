package androidx.collection;

/* renamed from: androidx.collection.d */
/* loaded from: classes.dex */
public class C2098d<E> implements Cloneable {

    /* renamed from: o */
    private static final Object f2438o = new Object();

    /* renamed from: k */
    private boolean f2439k;

    /* renamed from: l */
    private long[] f2440l;

    /* renamed from: m */
    private Object[] f2441m;

    /* renamed from: n */
    private int f2442n;

    public C2098d() {
        this(10);
    }

    /* renamed from: f */
    private void m39016f() {
        int i = this.f2442n;
        long[] jArr = this.f2440l;
        Object[] objArr = this.f2441m;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2438o) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2439k = false;
        this.f2442n = i2;
    }

    /* renamed from: a */
    public void m39020a(long j, E e) {
        int i = this.f2442n;
        if (i == 0 || j > this.f2440l[i - 1]) {
            if (this.f2439k && i >= this.f2440l.length) {
                m39016f();
            }
            int i2 = this.f2442n;
            if (i2 >= this.f2440l.length) {
                int f = C2097c.m39021f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.f2440l;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f2441m;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2440l = jArr;
                this.f2441m = objArr;
            }
            this.f2440l[i2] = j;
            this.f2441m[i2] = e;
            this.f2442n = i2 + 1;
            return;
        }
        m39011m(j, e);
    }

    /* renamed from: c */
    public void m39019c() {
        int i = this.f2442n;
        Object[] objArr = this.f2441m;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2442n = 0;
        this.f2439k = false;
    }

    /* renamed from: d */
    public C2098d<E> clone() {
        try {
            C2098d<E> dVar = (C2098d) super.clone();
            dVar.f2440l = (long[]) this.f2440l.clone();
            dVar.f2441m = (Object[]) this.f2441m.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public boolean m39017e(long j) {
        return m39013k(j) >= 0;
    }

    /* renamed from: h */
    public E m39015h(long j) {
        return m39014j(j, null);
    }

    /* renamed from: j */
    public E m39014j(long j, E e) {
        E e2;
        int b = C2097c.m39025b(this.f2440l, this.f2442n, j);
        if (b < 0 || (e2 = (E) this.f2441m[b]) == f2438o) {
            return e;
        }
        return e2;
    }

    /* renamed from: k */
    public int m39013k(long j) {
        if (this.f2439k) {
            m39016f();
        }
        return C2097c.m39025b(this.f2440l, this.f2442n, j);
    }

    /* renamed from: l */
    public long m39012l(int i) {
        if (this.f2439k) {
            m39016f();
        }
        return this.f2440l[i];
    }

    /* renamed from: m */
    public void m39011m(long j, E e) {
        int b = C2097c.m39025b(this.f2440l, this.f2442n, j);
        if (b >= 0) {
            this.f2441m[b] = e;
            return;
        }
        int i = ~b;
        int i2 = this.f2442n;
        if (i < i2) {
            Object[] objArr = this.f2441m;
            if (objArr[i] == f2438o) {
                this.f2440l[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f2439k && i2 >= this.f2440l.length) {
            m39016f();
            i = ~C2097c.m39025b(this.f2440l, this.f2442n, j);
        }
        int i3 = this.f2442n;
        if (i3 >= this.f2440l.length) {
            int f = C2097c.m39021f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f2440l;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2441m;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2440l = jArr;
            this.f2441m = objArr2;
        }
        int i4 = this.f2442n;
        if (i4 - i != 0) {
            long[] jArr3 = this.f2440l;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f2441m;
            System.arraycopy(objArr4, i, objArr4, i5, this.f2442n - i);
        }
        this.f2440l[i] = j;
        this.f2441m[i] = e;
        this.f2442n++;
    }

    /* renamed from: n */
    public void m39010n(long j) {
        int b = C2097c.m39025b(this.f2440l, this.f2442n, j);
        if (b >= 0) {
            Object[] objArr = this.f2441m;
            Object obj = objArr[b];
            Object obj2 = f2438o;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.f2439k = true;
            }
        }
    }

    /* renamed from: o */
    public void m39009o(int i) {
        Object[] objArr = this.f2441m;
        Object obj = objArr[i];
        Object obj2 = f2438o;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f2439k = true;
        }
    }

    /* renamed from: q */
    public int m39008q() {
        if (this.f2439k) {
            m39016f();
        }
        return this.f2442n;
    }

    /* renamed from: r */
    public E m39007r(int i) {
        if (this.f2439k) {
            m39016f();
        }
        return (E) this.f2441m[i];
    }

    public String toString() {
        if (m39008q() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2442n * 28);
        sb2.append('{');
        for (int i = 0; i < this.f2442n; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(m39012l(i));
            sb2.append('=');
            E r = m39007r(i);
            if (r != this) {
                sb2.append(r);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C2098d(int i) {
        this.f2439k = false;
        if (i == 0) {
            this.f2440l = C2097c.f2436b;
            this.f2441m = C2097c.f2437c;
            return;
        }
        int f = C2097c.m39021f(i);
        this.f2440l = new long[f];
        this.f2441m = new Object[f];
    }
}
