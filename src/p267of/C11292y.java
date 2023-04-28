package p267of;

import eg.C6884j;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.C9897e;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r\u0012\u0006\u0010'\u001a\u00020\u0005¢\u0006\u0004\b(\u0010)B\u0011\b\u0016\u0012\u0006\u0010 \u001a\u00020\u0005¢\u0006\u0004\b(\u0010*J\u0018\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\n\u001a\u00020\tJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002J)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0001\u0010\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0012J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0013\u001a\u00020\u0005J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0005R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR$\u0010&\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010%¨\u0006+"}, m15073d2 = {"Lof/y;", "T", "Lof/c;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "get", "(I)Ljava/lang/Object;", "", "p", "", "iterator", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "maxCapacity", "j", "element", "", "i", "(Ljava/lang/Object;)V", "n", "r", "l", "[Ljava/lang/Object;", "buffer", "m", "I", "capacity", "startIndex", "<set-?>", "o", "a", "()I", "size", "filledSize", "<init>", "([Ljava/lang/Object;I)V", "(I)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: of.y */
/* loaded from: classes8.dex */
final class C11292y<T> extends AbstractC11267c<T> implements RandomAccess {

    /* renamed from: l */
    private final Object[] f25208l;

    /* renamed from: m */
    private final int f25209m;

    /* renamed from: n */
    private int f25210n;

    /* renamed from: o */
    private int f25211o;

    @Metadata(m15074d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, m15073d2 = {"of/y$a", "Lof/b;", "", "b", "", "m", "I", "count", "n", "index", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: of.y$a */
    /* loaded from: classes8.dex */
    public static final class C11293a extends AbstractC11265b<T> {

        /* renamed from: m */
        private int f25212m;

        /* renamed from: n */
        private int f25213n;

        /* renamed from: o */
        final /* synthetic */ C11292y<T> f25214o;

        C11293a(C11292y<T> yVar) {
            this.f25214o = yVar;
            this.f25212m = yVar.size();
            this.f25213n = ((C11292y) yVar).f25210n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p267of.AbstractC11265b
        /* renamed from: b */
        protected void mo1701b() {
            if (this.f25212m == 0) {
                m10308d();
                return;
            }
            m10307f(((C11292y) this.f25214o).f25208l[this.f25213n]);
            this.f25213n = (this.f25213n + 1) % ((C11292y) this.f25214o).f25209m;
            this.f25212m--;
        }
    }

    public C11292y(Object[] buffer, int i) {
        C9971q.m14633g(buffer, "buffer");
        this.f25208l = buffer;
        boolean z = true;
        if (i >= 0) {
            if (i > buffer.length ? false : z) {
                this.f25209m = buffer.length;
                this.f25211o = i;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + buffer.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
    }

    @Override // p267of.AbstractC11263a
    /* renamed from: a */
    public int mo5832a() {
        return this.f25211o;
    }

    @Override // p267of.AbstractC11267c, java.util.List
    public T get(int i) {
        AbstractC11267c.f25192k.m10305a(i, size());
        return (T) this.f25208l[(this.f25210n + i) % this.f25209m];
    }

    /* renamed from: i */
    public final void m10233i(T t) {
        if (!m10231p()) {
            this.f25208l[(this.f25210n + size()) % this.f25209m] = t;
            this.f25211o = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    @Override // p267of.AbstractC11267c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new C11293a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final C11292y<T> m10232j(int i) {
        int g;
        Object[] objArr;
        int i2 = this.f25209m;
        g = C6884j.m23957g(i2 + (i2 >> 1) + 1, i);
        if (this.f25210n == 0) {
            objArr = Arrays.copyOf(this.f25208l, g);
            C9971q.m14634f(objArr, "copyOf(this, newSize)");
        } else {
            objArr = toArray(new Object[g]);
        }
        return new C11292y<>(objArr, size());
    }

    /* renamed from: p */
    public final boolean m10231p() {
        return size() == this.f25209m;
    }

    /* renamed from: r */
    public final void m10230r(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i > size()) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
            } else if (i > 0) {
                int i2 = this.f25210n;
                int i3 = (i2 + i) % this.f25209m;
                if (i2 > i3) {
                    C9897e.m14983l(this.f25208l, null, i2, this.f25209m);
                    C9897e.m14983l(this.f25208l, null, 0, i3);
                } else {
                    C9897e.m14983l(this.f25208l, null, i2, i3);
                }
                this.f25210n = i3;
                this.f25211o = size() - i;
            }
        } else {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p267of.AbstractC11263a, java.util.Collection
    public <T> T[] toArray(T[] array) {
        C9971q.m14633g(array, "array");
        if (array.length < size()) {
            array = (T[]) Arrays.copyOf(array, size());
            C9971q.m14634f(array, "copyOf(this, newSize)");
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.f25210n; i2 < size && i3 < this.f25209m; i3++) {
            array[i2] = this.f25208l[i3];
            i2++;
        }
        while (i2 < size) {
            array[i2] = this.f25208l[i];
            i2++;
            i++;
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    public C11292y(int i) {
        this(new Object[i], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p267of.AbstractC11263a, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
