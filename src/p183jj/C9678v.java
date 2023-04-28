package p183jj;

import java.util.AbstractSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import net.time4j.C10892f0;
import net.time4j.C10906g0;
import p143hj.AbstractC8079p;
import p143hj.C8081r;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.v */
/* loaded from: classes8.dex */
public class C9678v extends AbstractC9676t<C9678v> {

    /* renamed from: u */
    private static final Set<AbstractC8079p<?>> f21512u;

    /* renamed from: k */
    private Object[] f21513k;

    /* renamed from: l */
    private Object[] f21514l;

    /* renamed from: m */
    private Map<AbstractC8079p<?>, Object> f21515m;

    /* renamed from: n */
    private int[] f21516n;

    /* renamed from: o */
    private int f21517o;

    /* renamed from: p */
    private int f21518p;

    /* renamed from: q */
    private int f21519q;

    /* renamed from: r */
    private int f21520r;

    /* renamed from: s */
    private boolean f21521s = false;

    /* renamed from: t */
    private int f21522t = -1;

    /* renamed from: jj.v$b */
    /* loaded from: classes8.dex */
    private class C9680b implements Iterator<AbstractC8079p<?>>, p163j$.util.Iterator {

        /* renamed from: k */
        int f21523k;

        /* renamed from: l */
        int f21524l;

        private C9680b() {
            this.f21523k = C9678v.this.f21517o;
            this.f21524l = C9678v.this.f21520r;
        }

        /* renamed from: b */
        public AbstractC8079p<?> next() {
            Object obj;
            if (this.f21524l > 0) {
                Object[] objArr = C9678v.this.f21513k;
                do {
                    int i = this.f21523k - 1;
                    this.f21523k = i;
                    if (i >= 0) {
                        obj = objArr[i];
                    }
                } while (obj == null);
                this.f21524l--;
                return (AbstractC8079p) AbstractC8079p.class.cast(obj);
            }
            throw new NoSuchElementException();
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super AbstractC8079p<?>> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f21524l > 0;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    /* renamed from: jj.v$c */
    /* loaded from: classes8.dex */
    private class C9681c extends AbstractSet<AbstractC8079p<?>> {
        private C9681c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<AbstractC8079p<?>> iterator() {
            return new C9680b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C9678v.this.f21520r;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(C10892f0.f24174z);
        hashSet.add(C10892f0.f38899D);
        hashSet.add(C10892f0.f38900E);
        hashSet.add(C10906g0.f38912E);
        hashSet.add(C10906g0.f38914G);
        hashSet.add(C10906g0.f38916I);
        hashSet.add(C10906g0.f38920M);
        f21512u = Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9678v(int i, boolean z) {
        if (z) {
            this.f21517o = Integer.MIN_VALUE;
            this.f21518p = Integer.MIN_VALUE;
            this.f21519q = Integer.MIN_VALUE;
            this.f21520r = Integer.MIN_VALUE;
            this.f21513k = null;
            this.f21514l = null;
            this.f21516n = new int[3];
            for (int i2 = 0; i2 < 3; i2++) {
                this.f21516n[i2] = Integer.MIN_VALUE;
            }
        } else {
            int R = m15643R(i);
            this.f21517o = R;
            this.f21518p = R - 1;
            this.f21519q = m15638X(R);
            int i3 = this.f21517o;
            this.f21513k = new Object[i3];
            this.f21514l = null;
            this.f21516n = new int[i3];
            this.f21520r = 0;
        }
        this.f21515m = null;
    }

    /* renamed from: R */
    private static int m15643R(int i) {
        return Math.max(2, m15636Z((int) Math.ceil(i / 0.75f)));
    }

    /* renamed from: T */
    private static AbstractC8079p<Integer> m15642T(int i) {
        switch (i) {
            case 0:
                return C10892f0.f24174z;
            case 1:
                return C10892f0.f38899D;
            case 2:
                return C10892f0.f38900E;
            case 3:
                return C10906g0.f38912E;
            case 4:
                return C10906g0.f38914G;
            case 5:
                return C10906g0.f38916I;
            case 6:
                return C10906g0.f38920M;
            default:
                throw new IllegalStateException("No element index: " + i);
        }
    }

    /* renamed from: U */
    private int m15641U(AbstractC8079p<?> pVar) {
        Object obj;
        Object[] objArr = this.f21513k;
        if (objArr != null) {
            int Y = m15637Y(pVar.hashCode()) & this.f21518p;
            Object obj2 = objArr[Y];
            if (obj2 == null) {
                return Integer.MIN_VALUE;
            }
            if (pVar.equals(obj2)) {
                return this.f21516n[Y];
            }
            do {
                Y = (Y + 1) & this.f21518p;
                obj = objArr[Y];
                if (obj == null) {
                    return Integer.MIN_VALUE;
                }
            } while (!pVar.equals(obj));
            return this.f21516n[Y];
        } else if (pVar == C10892f0.f24174z) {
            return this.f21516n[0];
        } else {
            if (pVar == C10892f0.f38899D) {
                return this.f21516n[1];
            }
            if (pVar == C10892f0.f38900E) {
                return this.f21516n[2];
            }
            if (pVar == C10906g0.f38912E) {
                return this.f21517o;
            }
            if (pVar == C10906g0.f38914G) {
                return this.f21518p;
            }
            if (pVar == C10906g0.f38916I) {
                return this.f21519q;
            }
            if (pVar == C10906g0.f38920M) {
                return this.f21520r;
            }
            Map<AbstractC8079p<?>, Object> map = this.f21515m;
            if (map == null || !map.containsKey(pVar)) {
                return Integer.MIN_VALUE;
            }
            return ((Integer) Integer.class.cast(map.get(pVar))).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public static boolean m15639W(AbstractC8079p<?> pVar) {
        return f21512u.contains(pVar);
    }

    /* renamed from: X */
    private static int m15638X(int i) {
        return Math.min((int) Math.ceil(i * 0.75f), i - 1);
    }

    /* renamed from: Y */
    private static int m15637Y(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: Z */
    private static int m15636Z(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 1);
        int i4 = i3 | (i3 >> 2);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 8);
        return (i6 | (i6 >> 16)) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[SYNTHETIC] */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m15634b0(int r13) {
        /*
            r12 = this;
            java.lang.Object[] r0 = r12.f21513k
            java.lang.Object[] r1 = r12.f21514l
            int[] r2 = r12.f21516n
            int r3 = r13 + (-1)
            java.lang.Object[] r4 = new java.lang.Object[r13]
            if (r1 != 0) goto L_0x000e
            r5 = 0
            goto L_0x0010
        L_0x000e:
            java.lang.Object[] r5 = new java.lang.Object[r13]
        L_0x0010:
            int[] r6 = new int[r13]
            int r7 = r12.f21517o
            int r8 = r12.f21520r
            r9 = 0
        L_0x0017:
            if (r9 >= r8) goto L_0x0046
        L_0x0019:
            int r7 = r7 + (-1)
            r10 = r0[r7]
            if (r10 != 0) goto L_0x0020
            goto L_0x0019
        L_0x0020:
            int r10 = r10.hashCode()
            int r10 = m15637Y(r10)
            r10 = r10 & r3
            r11 = r4[r10]
            if (r11 == 0) goto L_0x0035
        L_0x002d:
            int r10 = r10 + 1
            r10 = r10 & r3
            r11 = r4[r10]
            if (r11 == 0) goto L_0x0035
            goto L_0x002d
        L_0x0035:
            r11 = r0[r7]
            r4[r10] = r11
            if (r1 == 0) goto L_0x003f
            r11 = r1[r7]
            r5[r10] = r11
        L_0x003f:
            r11 = r2[r7]
            r6[r10] = r11
            int r9 = r9 + 1
            goto L_0x0017
        L_0x0046:
            r12.f21517o = r13
            r12.f21518p = r3
            int r13 = m15638X(r13)
            r12.f21519q = r13
            r12.f21513k = r4
            r12.f21514l = r5
            r12.f21516n = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p183jj.C9678v.m15634b0(int):void");
    }

    /* renamed from: c0 */
    private void m15633c0(Object obj) {
        Object obj2;
        Object[] objArr = this.f21513k;
        if (objArr != null) {
            int Y = m15637Y(obj.hashCode()) & this.f21518p;
            Object obj3 = objArr[Y];
            if (obj3 != null) {
                if (obj.equals(obj3)) {
                    m15632d0(Y);
                    return;
                }
                do {
                    Y = (Y + 1) & this.f21518p;
                    obj2 = objArr[Y];
                    if (obj2 == null) {
                        return;
                    }
                } while (!obj.equals(obj2));
                m15632d0(Y);
            }
        } else if (obj == C10892f0.f24174z) {
            this.f21516n[0] = Integer.MIN_VALUE;
        } else if (obj == C10892f0.f38899D) {
            this.f21516n[1] = Integer.MIN_VALUE;
        } else if (obj == C10892f0.f38900E) {
            this.f21516n[2] = Integer.MIN_VALUE;
        } else if (obj == C10906g0.f38912E) {
            this.f21517o = Integer.MIN_VALUE;
        } else if (obj == C10906g0.f38914G) {
            this.f21518p = Integer.MIN_VALUE;
        } else if (obj == C10906g0.f38916I) {
            this.f21519q = Integer.MIN_VALUE;
        } else if (obj == C10906g0.f38920M) {
            this.f21520r = Integer.MIN_VALUE;
        } else {
            Map<AbstractC8079p<?>, Object> map = this.f21515m;
            if (map != null) {
                map.remove(obj);
            }
        }
    }

    /* renamed from: d0 */
    private void m15632d0(int i) {
        Object obj;
        this.f21520r--;
        Object[] objArr = this.f21513k;
        while (true) {
            int i2 = (i + 1) & this.f21518p;
            while (true) {
                obj = objArr[i2];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int Y = m15637Y(obj.hashCode());
                int i3 = this.f21518p;
                int i4 = Y & i3;
                if (i <= i2) {
                    if (i >= i4 || i4 > i2) {
                        break;
                    }
                    i2 = (i2 + 1) & i3;
                } else {
                    if (i >= i4 && i4 > i2) {
                        break;
                    }
                    i2 = (i2 + 1) & i3;
                }
            }
            objArr[i] = obj;
            Object[] objArr2 = this.f21514l;
            if (objArr2 != null) {
                objArr2[i] = objArr2[i2];
            }
            int[] iArr = this.f21516n;
            iArr[i] = iArr[i2];
            i = i2;
        }
    }

    @Override // p183jj.AbstractC9676t
    /* renamed from: F */
    <E> E mo15650F() {
        return null;
    }

    @Override // p183jj.AbstractC9676t
    /* renamed from: G */
    void mo15649G(AbstractC8079p<?> pVar, int i) {
        Object obj;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Object[] objArr = this.f21513k;
        if (objArr != null) {
            int Y = m15637Y(pVar.hashCode()) & this.f21518p;
            Object obj2 = objArr[Y];
            if (obj2 != null) {
                if (!obj2.equals(pVar)) {
                    do {
                        Y = (Y + 1) & this.f21518p;
                        obj = objArr[Y];
                        if (obj != null) {
                        }
                    } while (!obj.equals(pVar));
                    if (this.f21521s || this.f21516n[Y] == i) {
                        this.f21516n[Y] = i;
                        return;
                    }
                    throw new C9632a(pVar);
                } else if (this.f21521s || this.f21516n[Y] == i) {
                    this.f21516n[Y] = i;
                    return;
                } else {
                    throw new C9632a(pVar);
                }
            }
            objArr[Y] = pVar;
            this.f21516n[Y] = i;
            int i9 = this.f21520r;
            int i10 = i9 + 1;
            this.f21520r = i10;
            if (i9 >= this.f21519q) {
                m15634b0(m15643R(i10));
            }
        } else if (pVar == C10892f0.f24174z) {
            if (this.f21521s || (i8 = this.f21516n[0]) == Integer.MIN_VALUE || i8 == i) {
                this.f21516n[0] = i;
                return;
            }
            throw new C9632a(pVar);
        } else if (pVar == C10892f0.f38899D) {
            if (this.f21521s || (i7 = this.f21516n[1]) == Integer.MIN_VALUE || i7 == i) {
                this.f21516n[1] = i;
                return;
            }
            throw new C9632a(pVar);
        } else if (pVar == C10892f0.f38900E) {
            if (this.f21521s || (i6 = this.f21516n[2]) == Integer.MIN_VALUE || i6 == i) {
                this.f21516n[2] = i;
                return;
            }
            throw new C9632a(pVar);
        } else if (pVar == C10906g0.f38912E) {
            if (this.f21521s || (i5 = this.f21517o) == Integer.MIN_VALUE || i5 == i) {
                this.f21517o = i;
                return;
            }
            throw new C9632a(pVar);
        } else if (pVar == C10906g0.f38914G) {
            if (this.f21521s || (i4 = this.f21518p) == Integer.MIN_VALUE || i4 == i) {
                this.f21518p = i;
                return;
            }
            throw new C9632a(pVar);
        } else if (pVar == C10906g0.f38916I) {
            if (this.f21521s || (i3 = this.f21519q) == Integer.MIN_VALUE || i3 == i) {
                this.f21519q = i;
                return;
            }
            throw new C9632a(pVar);
        } else if (pVar != C10906g0.f38920M) {
            Map map = this.f21515m;
            if (map == null) {
                map = new HashMap();
                this.f21515m = map;
            }
            Integer valueOf = Integer.valueOf(i);
            if (this.f21521s || !map.containsKey(pVar) || valueOf.equals(map.get(pVar))) {
                map.put(pVar, valueOf);
                return;
            }
            throw new C9632a(pVar);
        } else if (this.f21521s || (i2 = this.f21520r) == Integer.MIN_VALUE || i2 == i) {
            this.f21520r = i;
        } else {
            throw new C9632a(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p183jj.AbstractC9676t
    /* renamed from: I */
    public void mo15648I(AbstractC8079p<?> pVar, Object obj) {
        Object obj2;
        if (obj == null) {
            m15633c0(pVar);
        } else if (pVar.getType() == Integer.class) {
            mo15649G(pVar, ((Integer) Integer.class.cast(obj)).intValue());
        } else {
            Object[] objArr = this.f21513k;
            if (objArr == null) {
                Map map = this.f21515m;
                if (map == null) {
                    map = new HashMap();
                    this.f21515m = map;
                }
                if (this.f21521s || !map.containsKey(pVar) || obj.equals(map.get(pVar))) {
                    map.put(pVar, obj);
                    return;
                }
                throw new C9632a(pVar);
            }
            if (this.f21514l == null) {
                this.f21514l = new Object[this.f21517o];
            }
            int Y = m15637Y(pVar.hashCode()) & this.f21518p;
            Object obj3 = objArr[Y];
            if (obj3 != null) {
                if (!obj3.equals(pVar)) {
                    do {
                        Y = (Y + 1) & this.f21518p;
                        obj2 = objArr[Y];
                        if (obj2 != null) {
                        }
                    } while (!obj2.equals(pVar));
                    if (this.f21521s || obj.equals(this.f21514l[Y])) {
                        this.f21514l[Y] = obj;
                        return;
                    }
                    throw new C9632a(pVar);
                } else if (this.f21521s || obj.equals(this.f21514l[Y])) {
                    this.f21514l[Y] = obj;
                    return;
                } else {
                    throw new C9632a(pVar);
                }
            }
            objArr[Y] = pVar;
            this.f21514l[Y] = obj;
            int i = this.f21520r;
            int i2 = i + 1;
            this.f21520r = i2;
            if (i >= this.f21519q) {
                m15634b0(m15643R(i2));
            }
        }
    }

    @Override // p183jj.AbstractC9676t
    /* renamed from: J */
    void mo15647J(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public int m15640V() {
        return this.f21522t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void m15635a0(C9678v vVar) {
        int i = 0;
        if (this.f21513k == null) {
            int i2 = vVar.f21517o;
            if (i2 != Integer.MIN_VALUE) {
                int i3 = this.f21517o;
                if (i3 == Integer.MIN_VALUE || this.f21521s || i3 == i2) {
                    this.f21517o = i2;
                } else {
                    throw new C9632a(C10906g0.f38912E);
                }
            }
            int i4 = vVar.f21518p;
            if (i4 != Integer.MIN_VALUE) {
                int i5 = this.f21518p;
                if (i5 == Integer.MIN_VALUE || this.f21521s || i5 == i4) {
                    this.f21518p = i4;
                } else {
                    throw new C9632a(C10906g0.f38914G);
                }
            }
            int i6 = vVar.f21519q;
            if (i6 != Integer.MIN_VALUE) {
                int i7 = this.f21519q;
                if (i7 == Integer.MIN_VALUE || this.f21521s || i7 == i6) {
                    this.f21519q = i6;
                } else {
                    throw new C9632a(C10906g0.f38916I);
                }
            }
            int i8 = vVar.f21520r;
            if (i8 != Integer.MIN_VALUE) {
                int i9 = this.f21520r;
                if (i9 == Integer.MIN_VALUE || this.f21521s || i9 == i8) {
                    this.f21520r = i8;
                } else {
                    throw new C9632a(C10906g0.f38920M);
                }
            }
            while (i < 3) {
                int i10 = vVar.f21516n[i];
                if (i10 != Integer.MIN_VALUE) {
                    int[] iArr = this.f21516n;
                    int i11 = iArr[i];
                    if (i11 == Integer.MIN_VALUE || this.f21521s || i11 == i10) {
                        iArr[i] = i10;
                    } else {
                        throw new C9632a(m15642T(i));
                    }
                }
                i++;
            }
            Map<AbstractC8079p<?>, Object> map = vVar.f21515m;
            if (map != null) {
                for (AbstractC8079p<?> pVar : map.keySet()) {
                    mo15648I(pVar, map.get(pVar));
                }
                return;
            }
            return;
        }
        Object[] objArr = vVar.f21513k;
        while (i < objArr.length) {
            Object obj = objArr[i];
            if (obj != null) {
                AbstractC8079p<?> pVar2 = (AbstractC8079p) AbstractC8079p.class.cast(obj);
                if (pVar2.getType() == Integer.class) {
                    mo15649G(pVar2, vVar.f21516n[i]);
                } else {
                    mo15648I(pVar2, vVar.f21514l[i]);
                }
            }
            i++;
        }
    }

    @Override // p143hj.AbstractC8080q, p143hj.AbstractC8077o
    /* renamed from: e */
    public boolean mo11377e(AbstractC8079p<?> pVar) {
        Object obj;
        if (pVar == null) {
            return false;
        }
        Object[] objArr = this.f21513k;
        if (objArr != null) {
            int Y = m15637Y(pVar.hashCode()) & this.f21518p;
            Object obj2 = objArr[Y];
            if (obj2 == null) {
                return false;
            }
            if (pVar.equals(obj2)) {
                return true;
            }
            do {
                Y = (Y + 1) & this.f21518p;
                obj = objArr[Y];
                if (obj == null) {
                    return false;
                }
            } while (!pVar.equals(obj));
            return true;
        } else if (pVar == C10892f0.f24174z) {
            if (this.f21516n[0] != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (pVar == C10892f0.f38899D) {
            if (this.f21516n[1] != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (pVar == C10892f0.f38900E) {
            if (this.f21516n[2] != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (pVar == C10906g0.f38912E) {
            if (this.f21517o != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (pVar == C10906g0.f38914G) {
            if (this.f21518p != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (pVar == C10906g0.f38916I) {
            if (this.f21519q != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (pVar != C10906g0.f38920M) {
            Map<AbstractC8079p<?>, Object> map = this.f21515m;
            if (map == null || !map.containsKey(pVar)) {
                return false;
            }
            return true;
        } else if (this.f21520r != Integer.MIN_VALUE) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void m15631e0() {
        Object[] objArr = this.f21513k;
        if (objArr == null) {
            this.f21517o = Integer.MIN_VALUE;
            this.f21518p = Integer.MIN_VALUE;
            this.f21519q = Integer.MIN_VALUE;
            this.f21520r = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                this.f21516n[i] = Integer.MIN_VALUE;
            }
            this.f21515m = null;
        } else {
            this.f21513k = new Object[objArr.length];
        }
        this.f21520r = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void m15630f0() {
        this.f21521s = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void m15629g0(int i) {
        this.f21522t = i;
    }

    @Override // p143hj.AbstractC8080q, p143hj.AbstractC8077o
    /* renamed from: r */
    public <V> V mo11371r(AbstractC8079p<V> pVar) {
        int Y;
        Object obj;
        Object obj2;
        Class<V> type = pVar.getType();
        if (type == Integer.class) {
            int U = m15641U(pVar);
            if (U != Integer.MIN_VALUE) {
                return type.cast(Integer.valueOf(U));
            }
            throw new C8081r("No value found for: " + pVar.name());
        }
        Object[] objArr = this.f21513k;
        if (objArr == null) {
            Map<AbstractC8079p<?>, Object> map = this.f21515m;
            if (map != null && map.containsKey(pVar)) {
                return pVar.getType().cast(map.get(pVar));
            }
            throw new C8081r("No value found for: " + pVar.name());
        } else if (this.f21514l == null || (obj = objArr[(Y = m15637Y(pVar.hashCode()) & this.f21518p)]) == null) {
            throw new C8081r("No value found for: " + pVar.name());
        } else if (pVar.equals(obj)) {
            return type.cast(this.f21514l[Y]);
        } else {
            do {
                Y = (Y + 1) & this.f21518p;
                obj2 = objArr[Y];
                if (obj2 == null) {
                    throw new C8081r("No value found for: " + pVar.name());
                }
            } while (!pVar.equals(obj2));
            return type.cast(this.f21514l[Y]);
        }
    }

    @Override // p143hj.AbstractC8080q, p143hj.AbstractC8077o
    /* renamed from: s */
    public int mo11370s(AbstractC8079p<Integer> pVar) {
        return m15641U(pVar);
    }

    @Override // p143hj.AbstractC8080q
    /* renamed from: v */
    public Set<AbstractC8079p<?>> mo15628v() {
        if (this.f21513k != null) {
            return new C9681c();
        }
        HashSet hashSet = new HashSet();
        if (this.f21516n[0] != Integer.MIN_VALUE) {
            hashSet.add(C10892f0.f24174z);
        }
        if (this.f21516n[1] != Integer.MIN_VALUE) {
            hashSet.add(C10892f0.f38899D);
        }
        if (this.f21516n[2] != Integer.MIN_VALUE) {
            hashSet.add(C10892f0.f38900E);
        }
        if (this.f21517o != Integer.MIN_VALUE) {
            hashSet.add(C10906g0.f38912E);
        }
        if (this.f21518p != Integer.MIN_VALUE) {
            hashSet.add(C10906g0.f38914G);
        }
        if (this.f21519q != Integer.MIN_VALUE) {
            hashSet.add(C10906g0.f38916I);
        }
        if (this.f21520r != Integer.MIN_VALUE) {
            hashSet.add(C10906g0.f38920M);
        }
        Map<AbstractC8079p<?>, Object> map = this.f21515m;
        if (map != null) {
            hashSet.addAll(map.keySet());
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
