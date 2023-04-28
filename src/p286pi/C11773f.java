package p286pi;

import ag.AbstractC1385a;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C9899f;
import kotlin.jvm.internal.C9941b;
import kotlin.jvm.internal.C9964l0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* renamed from: pi.f */
/* loaded from: classes8.dex */
public final class C11773f<T> extends AbstractSet<T> {

    /* renamed from: m */
    public static final C11775b f26275m = new C11775b(null);

    /* renamed from: k */
    private Object f26276k;

    /* renamed from: l */
    private int f26277l;

    /* renamed from: pi.f$a */
    /* loaded from: classes8.dex */
    private static final class C11774a<T> implements Iterator<T>, AbstractC1385a, p163j$.util.Iterator {

        /* renamed from: k */
        private final Iterator<T> f26278k;

        public C11774a(T[] array) {
            C9971q.m14633g(array, "array");
            this.f26278k = C9941b.m14688a(array);
        }

        /* renamed from: b */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f26278k.hasNext();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public T next() {
            return this.f26278k.next();
        }
    }

    /* renamed from: pi.f$b */
    /* loaded from: classes8.dex */
    public static final class C11775b {
        private C11775b() {
        }

        public /* synthetic */ C11775b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T> C11773f<T> m8654a() {
            return new C11773f<>(null);
        }

        /* renamed from: b */
        public final <T> C11773f<T> m8653b(Collection<? extends T> set) {
            C9971q.m14633g(set, "set");
            C11773f<T> fVar = new C11773f<>(null);
            fVar.addAll(set);
            return fVar;
        }
    }

    /* renamed from: pi.f$c */
    /* loaded from: classes8.dex */
    private static final class C11776c<T> implements java.util.Iterator<T>, AbstractC1385a, p163j$.util.Iterator {

        /* renamed from: k */
        private final T f26279k;

        /* renamed from: l */
        private boolean f26280l = true;

        public C11776c(T t) {
            this.f26279k = t;
        }

        /* renamed from: b */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f26280l;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public T next() {
            if (this.f26280l) {
                this.f26280l = false;
                return this.f26279k;
            }
            throw new NoSuchElementException();
        }
    }

    private C11773f() {
    }

    public /* synthetic */ C11773f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public static final <T> C11773f<T> m8658a() {
        return f26275m.m8654a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean add(T r5) {
        /*
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r4.f26276k = r5
            goto L_0x0078
        L_0x000a:
            int r0 = r4.size()
            r2 = 0
            if (r0 != r1) goto L_0x0026
            java.lang.Object r0 = r4.f26276k
            boolean r0 = kotlin.jvm.internal.C9971q.m14638b(r0, r5)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r3 = r4.f26276k
            r0[r2] = r3
            r0[r1] = r5
            r4.f26276k = r0
            goto L_0x0078
        L_0x0026:
            int r0 = r4.size()
            r3 = 5
            if (r0 >= r3) goto L_0x0066
            java.lang.Object r0 = r4.f26276k
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.C9971q.m14635e(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = kotlin.collections.C9894b.m14996y(r0, r5)
            if (r3 == 0) goto L_0x003d
            return r2
        L_0x003d:
            int r2 = r4.size()
            r3 = 4
            if (r2 != r3) goto L_0x0051
            int r2 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.util.LinkedHashSet r0 = kotlin.collections.C9919u.m14732f(r0)
            r0.add(r5)
            goto L_0x0063
        L_0x0051:
            int r2 = r4.size()
            int r2 = r2 + r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.C9971q.m14634f(r0, r2)
            int r2 = r0.length
            int r2 = r2 - r1
            r0[r2] = r5
        L_0x0063:
            r4.f26276k = r0
            goto L_0x0078
        L_0x0066:
            java.lang.Object r0 = r4.f26276k
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.C9971q.m14635e(r0, r3)
            java.util.Set r0 = kotlin.jvm.internal.C9964l0.m14654c(r0)
            boolean r5 = r0.add(r5)
            if (r5 != 0) goto L_0x0078
            return r2
        L_0x0078:
            int r5 = r4.size()
            int r5 = r5 + r1
            r4.m8656e(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p286pi.C11773f.add(java.lang.Object):boolean");
    }

    /* renamed from: b */
    public int m8657b() {
        return this.f26277l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f26276k = null;
        m8656e(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        boolean y;
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return C9971q.m14638b(this.f26276k, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f26276k;
            C9971q.m14635e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            y = C9899f.m14907y((Object[]) obj2, obj);
            return y;
        }
        Object obj3 = this.f26276k;
        C9971q.m14635e(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    /* renamed from: e */
    public void m8656e(int i) {
        this.f26277l = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new C11776c(this.f26276k);
        }
        if (size() < 5) {
            Object obj = this.f26276k;
            C9971q.m14635e(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new C11774a((Object[]) obj);
        }
        Object obj2 = this.f26276k;
        C9971q.m14635e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return C9964l0.m14654c(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return m8657b();
    }
}
