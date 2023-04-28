package kotlin.collections;

import com.facebook.react.uimanager.ViewDefaults;
import eg.C6884j;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p267of.AbstractC11267c;
import p267of.AbstractC11272e;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0007\u0018\u0000 B*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001=B\t\b\u0016¢\u0006\u0004\b@\u0010AJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0015\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001d\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001fJ\u0016\u0010 \u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u001e\u0010 \u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0018\u0010!\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b%\u0010\u001eJ\u0017\u0010&\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010\u001eJ\u0017\u0010*\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010\"J\u0016\u0010+\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0016\u0010,\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J)\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010/\"\u0004\b\u0001\u0010.2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030/H\u0016¢\u0006\u0004\b1\u00104R\u0016\u00107\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R$\u0010?\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u0010>¨\u0006C"}, m15073d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lof/e;", "", "minCapacity", "", "j", "newCapacity", "g", "index", "s", "r", "p", "i", "internalIndex", "", "elements", "f", "", "isEmpty", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "()Ljava/lang/Object;", "t", "removeLast", "u", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "b", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "k", "I", "head", "l", "[Ljava/lang/Object;", "elementData", "<set-?>", "m", "a", "()I", "size", "<init>", "()V", "n", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class ArrayDeque<E> extends AbstractC11272e<E> {

    /* renamed from: n */
    public static final C9892a f22043n = new C9892a(null);

    /* renamed from: o */
    private static final Object[] f22044o = new Object[0];

    /* renamed from: k */
    private int f22045k;

    /* renamed from: l */
    private Object[] f22046l = f22044o;

    /* renamed from: m */
    private int f22047m;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, m15073d2 = {"Lkotlin/collections/ArrayDeque$a;", "", "", "oldCapacity", "minCapacity", "a", "(II)I", "defaultMinCapacity", "I", "", "emptyElementData", "[Ljava/lang/Object;", "maxArraySize", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.collections.ArrayDeque$a */
    /* loaded from: classes8.dex */
    public static final class C9892a {
        private C9892a() {
        }

        public /* synthetic */ C9892a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m15054a(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - 2147483639 <= 0) {
                return i3;
            }
            if (i2 > 2147483639) {
                return ViewDefaults.NUMBER_OF_LINES;
            }
            return 2147483639;
        }
    }

    /* renamed from: f */
    private final void m15063f(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f22046l.length;
        while (i < length && it.hasNext()) {
            this.f22046l[i] = it.next();
            i++;
        }
        int i2 = this.f22045k;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f22046l[i3] = it.next();
        }
        this.f22047m = size() + collection.size();
    }

    /* renamed from: g */
    private final void m15062g(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f22046l;
        C9897e.m14989f(objArr2, objArr, 0, this.f22045k, objArr2.length);
        Object[] objArr3 = this.f22046l;
        int length = objArr3.length;
        int i2 = this.f22045k;
        C9897e.m14989f(objArr3, objArr, length - i2, 0, i2);
        this.f22045k = 0;
        this.f22046l = objArr;
    }

    /* renamed from: i */
    private final int m15061i(int i) {
        int I;
        if (i != 0) {
            return i - 1;
        }
        I = C9899f.m14956I(this.f22046l);
        return I;
    }

    /* renamed from: j */
    private final void m15060j(int i) {
        int c;
        if (i >= 0) {
            Object[] objArr = this.f22046l;
            if (i > objArr.length) {
                if (objArr == f22044o) {
                    c = C6884j.m23961c(i, 10);
                    this.f22046l = new Object[c];
                    return;
                }
                m15062g(f22043n.m15054a(objArr.length, i));
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    /* renamed from: p */
    private final int m15059p(int i) {
        int I;
        I = C9899f.m14956I(this.f22046l);
        if (i == I) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: r */
    private final int m15058r(int i) {
        return i < 0 ? i + this.f22046l.length : i;
    }

    /* renamed from: s */
    private final int m15057s(int i) {
        Object[] objArr = this.f22046l;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // p267of.AbstractC11272e
    /* renamed from: a */
    public int mo9139a() {
        return this.f22047m;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        C9971q.m14633g(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m15060j(size() + elements.size());
        m15063f(m15057s(this.f22045k + size()), elements);
        return true;
    }

    public final void addFirst(E e) {
        m15060j(size() + 1);
        int i = m15061i(this.f22045k);
        this.f22045k = i;
        this.f22046l[i] = e;
        this.f22047m = size() + 1;
    }

    public final void addLast(E e) {
        m15060j(size() + 1);
        this.f22046l[m15057s(this.f22045k + size())] = e;
        this.f22047m = size() + 1;
    }

    @Override // p267of.AbstractC11272e
    /* renamed from: b */
    public E mo9138b(int i) {
        int k;
        int k2;
        AbstractC11267c.f25192k.m10305a(i, size());
        k = C9906j.m14818k(this);
        if (i == k) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int s = m15057s(this.f22045k + i);
        E e = (E) this.f22046l[s];
        if (i < (size() >> 1)) {
            int i2 = this.f22045k;
            if (s >= i2) {
                Object[] objArr = this.f22046l;
                C9897e.m14989f(objArr, objArr, i2 + 1, i2, s);
            } else {
                Object[] objArr2 = this.f22046l;
                C9897e.m14989f(objArr2, objArr2, 1, 0, s);
                Object[] objArr3 = this.f22046l;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f22045k;
                C9897e.m14989f(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f22046l;
            int i4 = this.f22045k;
            objArr4[i4] = null;
            this.f22045k = m15059p(i4);
        } else {
            int i5 = this.f22045k;
            k2 = C9906j.m14818k(this);
            int s2 = m15057s(i5 + k2);
            if (s <= s2) {
                Object[] objArr5 = this.f22046l;
                C9897e.m14989f(objArr5, objArr5, s, s + 1, s2 + 1);
            } else {
                Object[] objArr6 = this.f22046l;
                C9897e.m14989f(objArr6, objArr6, s, s + 1, objArr6.length);
                Object[] objArr7 = this.f22046l;
                objArr7[objArr7.length - 1] = objArr7[0];
                C9897e.m14989f(objArr7, objArr7, 0, 1, s2 + 1);
            }
            this.f22046l[s2] = null;
        }
        this.f22047m = size() - 1;
        return e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int s = m15057s(this.f22045k + size());
        int i = this.f22045k;
        if (i < s) {
            C9897e.m14983l(this.f22046l, null, i, s);
        } else if (!isEmpty()) {
            Object[] objArr = this.f22046l;
            C9897e.m14983l(objArr, null, this.f22045k, objArr.length);
            C9897e.m14983l(this.f22046l, null, 0, s);
        }
        this.f22045k = 0;
        this.f22047m = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractC11267c.f25192k.m10305a(i, size());
        return (E) this.f22046l[m15057s(this.f22045k + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int s = m15057s(this.f22045k + size());
        int i2 = this.f22045k;
        if (i2 < s) {
            while (i2 < s) {
                if (C9971q.m14638b(obj, this.f22046l[i2])) {
                    i = this.f22045k;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < s) {
            return -1;
        } else {
            int length = this.f22046l.length;
            while (true) {
                if (i2 >= length) {
                    for (int i3 = 0; i3 < s; i3++) {
                        if (C9971q.m14638b(obj, this.f22046l[i3])) {
                            i2 = i3 + this.f22046l.length;
                            i = this.f22045k;
                        }
                    }
                    return -1;
                } else if (C9971q.m14638b(obj, this.f22046l[i2])) {
                    i = this.f22045k;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int I;
        int i;
        int s = m15057s(this.f22045k + size());
        int i2 = this.f22045k;
        if (i2 < s) {
            I = s - 1;
            if (i2 <= I) {
                while (!C9971q.m14638b(obj, this.f22046l[I])) {
                    if (I != i2) {
                        I--;
                    }
                }
                i = this.f22045k;
                return I - i;
            }
            return -1;
        }
        if (i2 > s) {
            int i3 = s - 1;
            while (true) {
                if (-1 >= i3) {
                    I = C9899f.m14956I(this.f22046l);
                    int i4 = this.f22045k;
                    if (i4 <= I) {
                        while (!C9971q.m14638b(obj, this.f22046l[I])) {
                            if (I != i4) {
                                I--;
                            }
                        }
                        i = this.f22045k;
                    }
                } else if (C9971q.m14638b(obj, this.f22046l[i3])) {
                    I = i3 + this.f22046l.length;
                    i = this.f22045k;
                    break;
                } else {
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        Object[] objArr;
        int i;
        C9971q.m14633g(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (this.f22046l.length == 0) {
                objArr = 1;
            } else {
                objArr = null;
            }
            if (objArr == null) {
                int s = m15057s(this.f22045k + size());
                int i2 = this.f22045k;
                if (i2 < s) {
                    i = i2;
                    while (i2 < s) {
                        Object obj = this.f22046l[i2];
                        if (!elements.contains(obj)) {
                            this.f22046l[i] = obj;
                            i++;
                        } else {
                            z = true;
                        }
                        i2++;
                    }
                    C9897e.m14983l(this.f22046l, null, i, s);
                } else {
                    int length = this.f22046l.length;
                    boolean z2 = false;
                    int i3 = i2;
                    while (i2 < length) {
                        Object[] objArr2 = this.f22046l;
                        Object obj2 = objArr2[i2];
                        objArr2[i2] = null;
                        if (!elements.contains(obj2)) {
                            this.f22046l[i3] = obj2;
                            i3++;
                        } else {
                            z2 = true;
                        }
                        i2++;
                    }
                    i = m15057s(i3);
                    for (int i4 = 0; i4 < s; i4++) {
                        Object[] objArr3 = this.f22046l;
                        Object obj3 = objArr3[i4];
                        objArr3[i4] = null;
                        if (!elements.contains(obj3)) {
                            this.f22046l[i] = obj3;
                            i = m15059p(i);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f22047m = m15058r(i - this.f22045k);
                }
            }
        }
        return z;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f22046l;
            int i = this.f22045k;
            E e = (E) objArr[i];
            objArr[i] = null;
            this.f22045k = m15059p(i);
            this.f22047m = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        int k;
        if (!isEmpty()) {
            int i = this.f22045k;
            k = C9906j.m14818k(this);
            int s = m15057s(i + k);
            Object[] objArr = this.f22046l;
            E e = (E) objArr[s];
            objArr[s] = null;
            this.f22047m = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        Object[] objArr;
        int i;
        C9971q.m14633g(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (this.f22046l.length == 0) {
                objArr = 1;
            } else {
                objArr = null;
            }
            if (objArr == null) {
                int s = m15057s(this.f22045k + size());
                int i2 = this.f22045k;
                if (i2 < s) {
                    i = i2;
                    while (i2 < s) {
                        Object obj = this.f22046l[i2];
                        if (elements.contains(obj)) {
                            this.f22046l[i] = obj;
                            i++;
                        } else {
                            z = true;
                        }
                        i2++;
                    }
                    C9897e.m14983l(this.f22046l, null, i, s);
                } else {
                    int length = this.f22046l.length;
                    boolean z2 = false;
                    int i3 = i2;
                    while (i2 < length) {
                        Object[] objArr2 = this.f22046l;
                        Object obj2 = objArr2[i2];
                        objArr2[i2] = null;
                        if (elements.contains(obj2)) {
                            this.f22046l[i3] = obj2;
                            i3++;
                        } else {
                            z2 = true;
                        }
                        i2++;
                    }
                    i = m15057s(i3);
                    for (int i4 = 0; i4 < s; i4++) {
                        Object[] objArr3 = this.f22046l;
                        Object obj3 = objArr3[i4];
                        objArr3[i4] = null;
                        if (elements.contains(obj3)) {
                            this.f22046l[i] = obj3;
                            i = m15059p(i);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f22047m = m15058r(i - this.f22045k);
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        AbstractC11267c.f25192k.m10305a(i, size());
        int s = m15057s(this.f22045k + i);
        Object[] objArr = this.f22046l;
        E e2 = (E) objArr[s];
        objArr[s] = e;
        return e2;
    }

    /* renamed from: t */
    public final E m15056t() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        C9971q.m14633g(array, "array");
        if (array.length < size()) {
            array = (T[]) C9895c.m14994a(array, size());
        }
        int s = m15057s(this.f22045k + size());
        int i = this.f22045k;
        if (i < s) {
            C9897e.m14987h(this.f22046l, array, 0, i, s, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f22046l;
            C9897e.m14989f(objArr, array, 0, this.f22045k, objArr.length);
            Object[] objArr2 = this.f22046l;
            C9897e.m14989f(objArr2, array, objArr2.length - this.f22045k, 0, s);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    /* renamed from: u */
    public final E m15055u() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        AbstractC11267c.f25192k.m10304b(i, size());
        if (i == size()) {
            addLast(e);
        } else if (i == 0) {
            addFirst(e);
        } else {
            m15060j(size() + 1);
            int s = m15057s(this.f22045k + i);
            if (i < ((size() + 1) >> 1)) {
                int i2 = m15061i(s);
                int i3 = m15061i(this.f22045k);
                int i4 = this.f22045k;
                if (i2 >= i4) {
                    Object[] objArr = this.f22046l;
                    objArr[i3] = objArr[i4];
                    C9897e.m14989f(objArr, objArr, i4, i4 + 1, i2 + 1);
                } else {
                    Object[] objArr2 = this.f22046l;
                    C9897e.m14989f(objArr2, objArr2, i4 - 1, i4, objArr2.length);
                    Object[] objArr3 = this.f22046l;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C9897e.m14989f(objArr3, objArr3, 0, 1, i2 + 1);
                }
                this.f22046l[i2] = e;
                this.f22045k = i3;
            } else {
                int s2 = m15057s(this.f22045k + size());
                if (s < s2) {
                    Object[] objArr4 = this.f22046l;
                    C9897e.m14989f(objArr4, objArr4, s + 1, s, s2);
                } else {
                    Object[] objArr5 = this.f22046l;
                    C9897e.m14989f(objArr5, objArr5, 1, 0, s2);
                    Object[] objArr6 = this.f22046l;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C9897e.m14989f(objArr6, objArr6, s + 1, s, objArr6.length - 1);
                }
                this.f22046l[s] = e;
            }
            this.f22047m = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> elements) {
        C9971q.m14633g(elements, "elements");
        AbstractC11267c.f25192k.m10304b(i, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(elements);
        }
        m15060j(size() + elements.size());
        int s = m15057s(this.f22045k + size());
        int s2 = m15057s(this.f22045k + i);
        int size = elements.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f22045k;
            int i3 = i2 - size;
            if (s2 < i2) {
                Object[] objArr = this.f22046l;
                C9897e.m14989f(objArr, objArr, i3, i2, objArr.length);
                if (size >= s2) {
                    Object[] objArr2 = this.f22046l;
                    C9897e.m14989f(objArr2, objArr2, objArr2.length - size, 0, s2);
                } else {
                    Object[] objArr3 = this.f22046l;
                    C9897e.m14989f(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f22046l;
                    C9897e.m14989f(objArr4, objArr4, 0, size, s2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.f22046l;
                C9897e.m14989f(objArr5, objArr5, i3, i2, s2);
            } else {
                Object[] objArr6 = this.f22046l;
                i3 += objArr6.length;
                int i4 = s2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    C9897e.m14989f(objArr6, objArr6, i3, i2, s2);
                } else {
                    C9897e.m14989f(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.f22046l;
                    C9897e.m14989f(objArr7, objArr7, 0, this.f22045k + length, s2);
                }
            }
            this.f22045k = i3;
            m15063f(m15058r(s2 - size), elements);
        } else {
            int i5 = s2 + size;
            if (s2 < s) {
                int i6 = size + s;
                Object[] objArr8 = this.f22046l;
                if (i6 <= objArr8.length) {
                    C9897e.m14989f(objArr8, objArr8, i5, s2, s);
                } else if (i5 >= objArr8.length) {
                    C9897e.m14989f(objArr8, objArr8, i5 - objArr8.length, s2, s);
                } else {
                    int length2 = s - (i6 - objArr8.length);
                    C9897e.m14989f(objArr8, objArr8, 0, length2, s);
                    Object[] objArr9 = this.f22046l;
                    C9897e.m14989f(objArr9, objArr9, i5, s2, length2);
                }
            } else {
                Object[] objArr10 = this.f22046l;
                C9897e.m14989f(objArr10, objArr10, size, 0, s);
                Object[] objArr11 = this.f22046l;
                if (i5 >= objArr11.length) {
                    C9897e.m14989f(objArr11, objArr11, i5 - objArr11.length, s2, objArr11.length);
                } else {
                    C9897e.m14989f(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f22046l;
                    C9897e.m14989f(objArr12, objArr12, i5, s2, objArr12.length - size);
                }
            }
            m15063f(s2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
