package nf;

import ag.AbstractC1385a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.jvm.internal.C9957i;
import kotlin.jvm.internal.C9971q;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\r\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0014\b\u0016\u0012\u0006\u0010'\u001a\u00020\u0003ø\u0001\u0001¢\u0006\u0004\b(\u0010)B\u0014\b\u0001\u0012\u0006\u0010%\u001a\u00020 ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u001e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001b\u0088\u0001%\u0092\u0001\u00020 ø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006-"}, m15073d2 = {"Lnf/c0;", "", "Lnf/b0;", "", "index", "r", "([II)I", "value", "", "x", "([III)V", "", "w", "([I)Ljava/util/Iterator;", "element", "", "i", "([II)Z", "elements", "j", "([ILjava/util/Collection;)Z", "v", "([I)Z", "", "y", "([I)Ljava/lang/String;", "u", "([I)I", "", "other", "p", "([ILjava/lang/Object;)Z", "", "k", "[I", "getStorage$annotations", "()V", "storage", "t", "size", "b", "(I)[I", "f", "([I)[I", "a", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: nf.c0 */
/* loaded from: classes8.dex */
public final class C11059c0 implements Collection<C11056b0>, AbstractC1385a {

    /* renamed from: k */
    private final int[] f24573k;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0016\u0010\u0005\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u0011"}, m15073d2 = {"Lnf/c0$a;", "", "Lnf/b0;", "", "hasNext", "b", "()I", "", "k", "[I", "array", "", "l", "I", "index", "<init>", "([I)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: nf.c0$a */
    /* loaded from: classes8.dex */
    public static final class C11060a implements Iterator<C11056b0>, AbstractC1385a, p163j$.util.Iterator {

        /* renamed from: k */
        private final int[] f24574k;

        /* renamed from: l */
        private int f24575l;

        public C11060a(int[] array) {
            C9971q.m14633g(array, "array");
            this.f24574k = array;
        }

        /* renamed from: b */
        public int m11009b() {
            int i = this.f24575l;
            int[] iArr = this.f24574k;
            if (i < iArr.length) {
                this.f24575l = i + 1;
                return C11056b0.m11030b(iArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f24575l));
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super C11056b0> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f24575l < this.f24574k.length;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C11056b0.m11031a(m11009b());
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C11059c0(int[] iArr) {
        this.f24573k = iArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11059c0 m11025a(int[] iArr) {
        return new C11059c0(iArr);
    }

    /* renamed from: b */
    public static int[] m11024b(int i) {
        return m11023f(new int[i]);
    }

    /* renamed from: f */
    public static int[] m11023f(int[] storage) {
        C9971q.m14633g(storage, "storage");
        return storage;
    }

    /* renamed from: i */
    public static boolean m11021i(int[] iArr, int i) {
        boolean w;
        w = C9899f.m14911w(iArr, i);
        return w;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m11020j(int[] r4, java.util.Collection<nf.C11056b0> r5) {
        /*
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C9971q.m14633g(r5, r0)
            boolean r0 = r5.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x000d
            goto L_0x0032
        L_0x000d:
            java.util.Iterator r5 = r5.iterator()
        L_0x0011:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r5.next()
            boolean r2 = r0 instanceof nf.C11056b0
            r3 = 0
            if (r2 == 0) goto L_0x002e
            nf.b0 r0 = (nf.C11056b0) r0
            int r0 = r0.m11026f()
            boolean r0 = kotlin.collections.C9894b.m14999w(r4, r0)
            if (r0 == 0) goto L_0x002e
            r0 = r1
            goto L_0x002f
        L_0x002e:
            r0 = r3
        L_0x002f:
            if (r0 != 0) goto L_0x0011
            r1 = r3
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.C11059c0.m11020j(int[], java.util.Collection):boolean");
    }

    /* renamed from: p */
    public static boolean m11019p(int[] iArr, Object obj) {
        return (obj instanceof C11059c0) && C9971q.m14638b(iArr, ((C11059c0) obj).m11010z());
    }

    /* renamed from: r */
    public static final int m11018r(int[] iArr, int i) {
        return C11056b0.m11030b(iArr[i]);
    }

    /* renamed from: t */
    public static int m11016t(int[] iArr) {
        return iArr.length;
    }

    /* renamed from: u */
    public static int m11015u(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: v */
    public static boolean m11014v(int[] iArr) {
        return iArr.length == 0;
    }

    /* renamed from: w */
    public static java.util.Iterator<C11056b0> m11013w(int[] iArr) {
        return new C11060a(iArr);
    }

    /* renamed from: x */
    public static final void m11012x(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    /* renamed from: y */
    public static String m11011y(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C11056b0 b0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C11056b0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C11056b0)) {
            return false;
        }
        return m11022g(((C11056b0) obj).m11026f());
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        C9971q.m14633g(elements, "elements");
        return m11020j(this.f24573k, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m11019p(this.f24573k, obj);
    }

    /* renamed from: g */
    public boolean m11022g(int i) {
        return m11021i(this.f24573k, i);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m11015u(this.f24573k);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m11014v(this.f24573k);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<C11056b0> iterator() {
        return m11013w(this.f24573k);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: s */
    public int size() {
        return m11016t(this.f24573k);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C9957i.m14662a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        C9971q.m14633g(array, "array");
        return (T[]) C9957i.m14661b(this, array);
    }

    public String toString() {
        return m11011y(this.f24573k);
    }

    /* renamed from: z */
    public final /* synthetic */ int[] m11010z() {
        return this.f24573k;
    }
}
