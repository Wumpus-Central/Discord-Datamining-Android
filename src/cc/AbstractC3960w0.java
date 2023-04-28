package cc;

import cc.AbstractC3837d0;
import ec.C6813a;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p030bc.C3457i;

/* renamed from: cc.w0 */
/* loaded from: classes3.dex */
public abstract class AbstractC3960w0<E> extends AbstractC3837d0<E> implements Set<E>, p163j$.util.Set {

    /* renamed from: cc.w0$a */
    /* loaded from: classes3.dex */
    static abstract class AbstractC3961a<E> extends AbstractC3960w0<E> {

        /* renamed from: l */
        private transient AbstractC3884i0<E> f6513l;

        /* renamed from: B */
        AbstractC3884i0<E> mo33226B() {
            return new C3945t1(this, toArray());
        }

        @Override // cc.AbstractC3837d0
        /* renamed from: a */
        public AbstractC3884i0<E> mo33253a() {
            AbstractC3884i0<E> i0Var = this.f6513l;
            if (i0Var != null) {
                return i0Var;
            }
            AbstractC3884i0<E> B = mo33226B();
            this.f6513l = B;
            return B;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cc.w0$b */
    /* loaded from: classes3.dex */
    public static final class C3962b<E> extends AbstractC3964d<E> {

        /* renamed from: c */
        private final Set<Object> f6514c = C3828b2.m33509e(this.f6520b);

        C3962b(AbstractC3964d<E> dVar) {
            super(dVar);
            for (int i = 0; i < this.f6520b; i++) {
                Set<Object> set = this.f6514c;
                E e = this.f6519a[i];
                Objects.requireNonNull(e);
                set.add(e);
            }
        }

        @Override // cc.AbstractC3960w0.AbstractC3964d
        /* renamed from: a */
        AbstractC3964d<E> mo33247a(E e) {
            C3457i.m34352i(e);
            if (this.f6514c.add(e)) {
                m33246b(e);
            }
            return this;
        }

        @Override // cc.AbstractC3960w0.AbstractC3964d
        /* renamed from: c */
        AbstractC3960w0<E> mo33245c() {
            int i = this.f6520b;
            if (i == 0) {
                return AbstractC3960w0.m33256x();
            }
            if (i != 1) {
                return new C3839d1(this.f6514c, AbstractC3884i0.m33404r(this.f6519a, this.f6520b));
            }
            E e = this.f6519a[0];
            Objects.requireNonNull(e);
            return AbstractC3960w0.m33255y(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cc.w0$c */
    /* loaded from: classes3.dex */
    public static final class C3963c<E> extends AbstractC3964d<E> {

        /* renamed from: c */
        private Object[] f6515c = null;

        /* renamed from: d */
        private int f6516d = 0;

        /* renamed from: e */
        private int f6517e = 0;

        /* renamed from: f */
        private int f6518f;

        C3963c(int i) {
            super(i);
        }

        /* renamed from: g */
        static boolean m33251g(Object[] objArr) {
            int i = m33249i(objArr.length);
            int length = objArr.length - 1;
            int i2 = 0;
            int i3 = 0;
            while (i2 < objArr.length) {
                if (i2 == i3 && objArr[i2] == null) {
                    i3 = i2 + i;
                    if (objArr[(i3 - 1) & length] != null) {
                        i3 = i2 + 1;
                    }
                    i2 = i3;
                } else {
                    int i4 = i2 + i;
                    for (int i5 = i4 - 1; i5 >= i3; i5--) {
                        if (objArr[i5 & length] == null) {
                            i3 = i4;
                            i2 = i5 + 1;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        private AbstractC3964d<E> m33250h(E e) {
            Objects.requireNonNull(this.f6515c);
            int hashCode = e.hashCode();
            int b = C3975z.m33219b(hashCode);
            int length = this.f6515c.length - 1;
            for (int i = b; i - b < this.f6516d; i++) {
                int i2 = i & length;
                Object obj = this.f6515c[i2];
                if (obj == null) {
                    m33246b(e);
                    this.f6515c[i2] = e;
                    this.f6518f += hashCode;
                    m33252f(this.f6520b);
                    return this;
                } else if (obj.equals(e)) {
                    return this;
                }
            }
            return new C3962b(this).mo33247a(e);
        }

        /* renamed from: i */
        static int m33249i(int i) {
            return C6813a.m24300c(i, RoundingMode.UNNECESSARY) * 13;
        }

        /* renamed from: j */
        static Object[] m33248j(int i, Object[] objArr, int i2) {
            int i3;
            Object[] objArr2 = new Object[i];
            int i4 = i - 1;
            for (int i5 = 0; i5 < i2; i5++) {
                Object obj = objArr[i5];
                Objects.requireNonNull(obj);
                int b = C3975z.m33219b(obj.hashCode());
                while (true) {
                    i3 = b & i4;
                    if (objArr2[i3] == null) {
                        break;
                    }
                    b++;
                }
                objArr2[i3] = obj;
            }
            return objArr2;
        }

        @Override // cc.AbstractC3960w0.AbstractC3964d
        /* renamed from: a */
        AbstractC3964d<E> mo33247a(E e) {
            C3457i.m34352i(e);
            if (this.f6515c != null) {
                return m33250h(e);
            }
            if (this.f6520b == 0) {
                m33246b(e);
                return this;
            }
            m33252f(this.f6519a.length);
            this.f6520b--;
            return m33250h(this.f6519a[0]).mo33247a(e);
        }

        @Override // cc.AbstractC3960w0.AbstractC3964d
        /* renamed from: c */
        AbstractC3960w0<E> mo33245c() {
            int i = this.f6520b;
            if (i == 0) {
                return AbstractC3960w0.m33256x();
            }
            if (i != 1) {
                Object[] objArr = this.f6519a;
                if (i != objArr.length) {
                    objArr = Arrays.copyOf(objArr, i);
                }
                int i2 = this.f6518f;
                Object[] objArr2 = this.f6515c;
                Objects.requireNonNull(objArr2);
                return new C3965w1(objArr, i2, objArr2, this.f6515c.length - 1);
            }
            E e = this.f6519a[0];
            Objects.requireNonNull(e);
            return AbstractC3960w0.m33255y(e);
        }

        @Override // cc.AbstractC3960w0.AbstractC3964d
        /* renamed from: e */
        AbstractC3964d<E> mo33243e() {
            if (this.f6515c == null) {
                return this;
            }
            int p = AbstractC3960w0.m33262p(this.f6520b);
            if (p * 2 < this.f6515c.length) {
                this.f6515c = m33248j(p, this.f6519a, this.f6520b);
                this.f6516d = m33249i(p);
                this.f6517e = (int) (p * 0.7d);
            }
            if (m33251g(this.f6515c)) {
                return new C3962b(this);
            }
            return this;
        }

        /* renamed from: f */
        void m33252f(int i) {
            int i2;
            Object[] objArr = this.f6515c;
            if (objArr == null) {
                i2 = AbstractC3960w0.m33262p(i);
                this.f6515c = new Object[i2];
            } else if (i > this.f6517e && objArr.length < 1073741824) {
                i2 = objArr.length * 2;
                this.f6515c = m33248j(i2, this.f6519a, this.f6520b);
            } else {
                return;
            }
            this.f6516d = m33249i(i2);
            this.f6517e = (int) (i2 * 0.7d);
        }
    }

    /* renamed from: A */
    public static <E> AbstractC3960w0<E> m33263A(E e, E e2, E e3) {
        return m33261r(3, 3, e, e2, e3);
    }

    /* renamed from: p */
    static int m33262p(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        C3457i.m34356e(z, "collection too large");
        return 1073741824;
    }

    /* renamed from: r */
    private static <E> AbstractC3960w0<E> m33261r(int i, int i2, Object... objArr) {
        if (i == 0) {
            return m33256x();
        }
        int i3 = 0;
        if (i == 1) {
            return m33255y(objArr[0]);
        }
        C3963c cVar = new C3963c(i2);
        while (i3 < i) {
            i3++;
            cVar = cVar.mo33247a(C3457i.m34352i(objArr[i3]));
        }
        return cVar.mo33243e().mo33245c();
    }

    /* renamed from: s */
    private static <E> AbstractC3960w0<E> m33260s(int i, Object... objArr) {
        return m33261r(i, Math.max(4, C6813a.m24298e(i, RoundingMode.CEILING)), objArr);
    }

    /* renamed from: t */
    public static <E> AbstractC3960w0<E> m33259t(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC3960w0) && !(collection instanceof SortedSet)) {
            AbstractC3960w0<E> w0Var = (AbstractC3960w0) collection;
            if (!w0Var.mo33222i()) {
                return w0Var;
            }
        } else if (collection instanceof EnumSet) {
            return m33257v((EnumSet) collection);
        }
        Object[] array = collection.toArray();
        if (collection instanceof Set) {
            return m33261r(array.length, array.length, array);
        }
        return m33260s(array.length, array);
    }

    /* renamed from: u */
    public static <E> AbstractC3960w0<E> m33258u(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m33256x();
        }
        if (length != 1) {
            return m33260s(eArr.length, (Object[]) eArr.clone());
        }
        return m33255y(eArr[0]);
    }

    /* renamed from: v */
    private static AbstractC3960w0 m33257v(EnumSet enumSet) {
        return C3866g0.m33439B(EnumSet.copyOf(enumSet));
    }

    /* renamed from: x */
    public static <E> AbstractC3960w0<E> m33256x() {
        return C3965w1.f6522r;
    }

    /* renamed from: y */
    public static <E> AbstractC3960w0<E> m33255y(E e) {
        return new C3844e2(e);
    }

    /* renamed from: z */
    public static <E> AbstractC3960w0<E> m33254z(E e, E e2) {
        return m33261r(2, 2, e, e2);
    }

    @Override // java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3960w0) || !mo33239w() || !((AbstractC3960w0) obj).mo33239w() || hashCode() == obj.hashCode()) {
            return C3828b2.m33513a(this, obj);
        }
        return false;
    }

    @Override // java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public int hashCode() {
        return C3828b2.m33512b(this);
    }

    @Override // cc.AbstractC3837d0
    /* renamed from: j */
    public abstract AbstractC3868g2<E> iterator();

    /* renamed from: w */
    boolean mo33239w() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cc.w0$d */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC3964d<E> {

        /* renamed from: a */
        E[] f6519a;

        /* renamed from: b */
        int f6520b;

        AbstractC3964d(int i) {
            this.f6519a = (E[]) new Object[i];
            this.f6520b = 0;
        }

        /* renamed from: d */
        private void m33244d(int i) {
            E[] eArr = this.f6519a;
            if (i > eArr.length) {
                this.f6519a = (E[]) Arrays.copyOf(this.f6519a, AbstractC3837d0.AbstractC3838a.m33498a(eArr.length, i));
            }
        }

        /* renamed from: a */
        abstract AbstractC3964d<E> mo33247a(E e);

        /* renamed from: b */
        final void m33246b(E e) {
            m33244d(this.f6520b + 1);
            E[] eArr = this.f6519a;
            int i = this.f6520b;
            this.f6520b = i + 1;
            eArr[i] = e;
        }

        /* renamed from: c */
        abstract AbstractC3960w0<E> mo33245c();

        /* renamed from: e */
        AbstractC3964d<E> mo33243e() {
            return this;
        }

        AbstractC3964d(AbstractC3964d<E> dVar) {
            E[] eArr = dVar.f6519a;
            this.f6519a = (E[]) Arrays.copyOf(eArr, eArr.length);
            this.f6520b = dVar.f6520b;
        }
    }
}
