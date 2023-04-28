package cc;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p030bc.C3457i;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* renamed from: cc.a1 */
/* loaded from: classes3.dex */
public final class C3818a1 {

    /* renamed from: cc.a1$a */
    /* loaded from: classes3.dex */
    class C3819a extends AbstractC3868g2<T> {

        /* renamed from: k */
        final /* synthetic */ Iterator f6335k;

        C3819a(Iterator it) {
            this.f6335k = it;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f6335k.hasNext();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // java.util.Iterator, p163j$.util.Iterator
        public T next() {
            return this.f6335k.next();
        }
    }

    /* renamed from: cc.a1$b */
    /* loaded from: classes3.dex */
    class C3820b extends AbstractC3868g2<T> {

        /* renamed from: k */
        boolean f6336k;

        /* renamed from: l */
        final /* synthetic */ Object f6337l;

        C3820b(Object obj) {
            this.f6337l = obj;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return !this.f6336k;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
        @Override // java.util.Iterator, p163j$.util.Iterator
        public T next() {
            if (!this.f6336k) {
                this.f6336k = true;
                return this.f6337l;
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cc.a1$c */
    /* loaded from: classes3.dex */
    public static final class C3821c<T> extends AbstractC3816a<T> {

        /* renamed from: o */
        static final AbstractC3882h2<Object> f6338o = new C3821c(new Object[0], 0, 0, 0);

        /* renamed from: m */
        private final T[] f6339m;

        /* renamed from: n */
        private final int f6340n;

        C3821c(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.f6339m = tArr;
            this.f6340n = i;
        }

        @Override // cc.AbstractC3816a
        /* renamed from: b */
        protected T mo33396b(int i) {
            return this.f6339m[this.f6340n + i];
        }
    }

    /* renamed from: cc.a1$d */
    /* loaded from: classes3.dex */
    private enum EnumC3822d implements Iterator<Object>, p163j$.util.Iterator {
        INSTANCE;

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Object> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            C3911m.m33351c(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> boolean m33537a(Collection<T> collection, java.util.Iterator<? extends T> it) {
        C3457i.m34352i(collection);
        C3457i.m34352i(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m33536b(java.util.Iterator<?> it) {
        C3457i.m34352i(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: c */
    public static boolean m33535c(java.util.Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m33534d(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = p030bc.C3456h.m34362a(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C3818a1.m33534d(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <T> AbstractC3868g2<T> m33533e() {
        return m33532f();
    }

    /* renamed from: f */
    static <T> AbstractC3882h2<T> m33532f() {
        return (AbstractC3882h2<T>) C3821c.f6338o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static <T> java.util.Iterator<T> m33531g() {
        return EnumC3822d.INSTANCE;
    }

    @SafeVarargs
    /* renamed from: h */
    public static <T> AbstractC3868g2<T> m33530h(T... tArr) {
        return m33529i(tArr, 0, tArr.length, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static <T> AbstractC3882h2<T> m33529i(T[] tArr, int i, int i2, int i3) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C3457i.m34357d(z);
        C3457i.m34348m(i, i + i2, tArr.length);
        C3457i.m34350k(i3, i2);
        if (i2 == 0) {
            return m33532f();
        }
        return new C3821c(tArr, i, i2, i3);
    }

    /* renamed from: j */
    public static <T> T m33528j(java.util.Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: k */
    public static <T> T m33527k(java.util.Iterator<? extends T> it, T t) {
        return it.hasNext() ? (T) it.next() : t;
    }

    /* renamed from: l */
    public static <T> T m33526l(java.util.Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static <T> T m33525m(java.util.Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: n */
    public static boolean m33524n(java.util.Iterator<?> it, Collection<?> collection) {
        C3457i.m34352i(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: o */
    public static <T> AbstractC3868g2<T> m33523o(T t) {
        return new C3820b(t);
    }

    /* renamed from: p */
    public static String m33522p(java.util.Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z = false;
        }
        sb2.append(']');
        return sb2.toString();
    }

    /* renamed from: q */
    public static <T> AbstractC3868g2<T> m33521q(java.util.Iterator<? extends T> it) {
        C3457i.m34352i(it);
        if (it instanceof AbstractC3868g2) {
            return (AbstractC3868g2) it;
        }
        return new C3819a(it);
    }
}
