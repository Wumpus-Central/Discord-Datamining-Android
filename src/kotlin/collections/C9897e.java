package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p267of.AbstractC11267c;

@Metadata(m15074d1 = {"\u00006\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002*\u00020\u0005\u001aS\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u000f\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007\u001a5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0014\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0018\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\u0017*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u001a.\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a6\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0015\u0010 \u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0086\u0002\u001a\u001f\u0010!\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b!\u0010\"\u001a;\u0010&\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010%\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000#j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`$¢\u0006\u0004\b&\u0010'\u001aO\u0010(\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010%\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000#j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`$2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)¨\u0006*"}, m15073d2 = {"T", "", "", "d", "([Ljava/lang/Object;)Ljava/util/List;", "", "", "c", "destination", "destinationOffset", "startIndex", "endIndex", "f", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "", "e", "fromIndex", "toIndex", "j", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "i", "([BII)[B", "element", "", "l", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "k", "o", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "elements", "p", "([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;", "n", "q", "([Ljava/lang/Object;)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "r", "([Ljava/lang/Object;Ljava/util/Comparator;)V", "s", "([Ljava/lang/Object;Ljava/util/Comparator;II)V", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/collections/ArraysKt")
/* renamed from: kotlin.collections.e */
/* loaded from: classes8.dex */
public class C9897e extends C9896d {

    @Metadata(m15074d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m15073d2 = {"kotlin/collections/e$a", "Lof/c;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "element", "contains", "index", "b", "(I)Ljava/lang/Integer;", "f", "g", "a", "()I", "size", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.collections.e$a */
    /* loaded from: classes8.dex */
    public static final class C9898a extends AbstractC11267c<Integer> implements RandomAccess {

        /* renamed from: l */
        final /* synthetic */ int[] f22050l;

        C9898a(int[] iArr) {
            this.f22050l = iArr;
        }

        @Override // p267of.AbstractC11263a
        /* renamed from: a */
        public int mo5832a() {
            return this.f22050l.length;
        }

        /* renamed from: b */
        public Integer get(int i) {
            return Integer.valueOf(this.f22050l[i]);
        }

        @Override // p267of.AbstractC11263a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return contains(((Number) obj).intValue());
        }

        /* renamed from: f */
        public int m14974f(int i) {
            return C9899f.m14950M(this.f22050l, i);
        }

        /* renamed from: g */
        public int m14973g(int i) {
            return C9899f.m14932e0(this.f22050l, i);
        }

        @Override // p267of.AbstractC11267c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return m14974f(((Number) obj).intValue());
        }

        @Override // p267of.AbstractC11263a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f22050l.length == 0;
        }

        @Override // p267of.AbstractC11267c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return m14973g(((Number) obj).intValue());
        }

        public boolean contains(int i) {
            boolean w;
            w = C9899f.m14911w(this.f22050l, i);
            return w;
        }
    }

    /* renamed from: c */
    public static List<Integer> m14992c(int[] iArr) {
        C9971q.m14633g(iArr, "<this>");
        return new C9898a(iArr);
    }

    /* renamed from: d */
    public static <T> List<T> m14991d(T[] tArr) {
        C9971q.m14633g(tArr, "<this>");
        List<T> a = C9903g.m14902a(tArr);
        C9971q.m14634f(a, "asList(this)");
        return a;
    }

    /* renamed from: e */
    public static byte[] m14990e(byte[] bArr, byte[] destination, int i, int i2, int i3) {
        C9971q.m14633g(bArr, "<this>");
        C9971q.m14633g(destination, "destination");
        System.arraycopy(bArr, i2, destination, i, i3 - i2);
        return destination;
    }

    /* renamed from: f */
    public static <T> T[] m14989f(T[] tArr, T[] destination, int i, int i2, int i3) {
        C9971q.m14633g(tArr, "<this>");
        C9971q.m14633g(destination, "destination");
        System.arraycopy(tArr, i2, destination, i, i3 - i2);
        return destination;
    }

    /* renamed from: g */
    public static /* synthetic */ byte[] m14988g(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        byte[] e;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        e = m14990e(bArr, bArr2, i, i2, i3);
        return e;
    }

    /* renamed from: h */
    public static /* synthetic */ Object[] m14987h(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        Object[] f;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        f = m14989f(objArr, objArr2, i, i2, i3);
        return f;
    }

    /* renamed from: i */
    public static byte[] m14986i(byte[] bArr, int i, int i2) {
        C9971q.m14633g(bArr, "<this>");
        C9895c.m14993b(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C9971q.m14634f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: j */
    public static <T> T[] m14985j(T[] tArr, int i, int i2) {
        C9971q.m14633g(tArr, "<this>");
        C9895c.m14993b(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        C9971q.m14634f(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    /* renamed from: k */
    public static void m14984k(int[] iArr, int i, int i2, int i3) {
        C9971q.m14633g(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    /* renamed from: l */
    public static <T> void m14983l(T[] tArr, T t, int i, int i2) {
        C9971q.m14633g(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    /* renamed from: m */
    public static /* synthetic */ void m14982m(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m14983l(objArr, obj, i, i2);
    }

    /* renamed from: n */
    public static byte[] m14981n(byte[] bArr, byte[] elements) {
        C9971q.m14633g(bArr, "<this>");
        C9971q.m14633g(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] result = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        C9971q.m14634f(result, "result");
        return result;
    }

    /* renamed from: o */
    public static <T> T[] m14980o(T[] tArr, T t) {
        C9971q.m14633g(tArr, "<this>");
        int length = tArr.length;
        T[] result = (T[]) Arrays.copyOf(tArr, length + 1);
        result[length] = t;
        C9971q.m14634f(result, "result");
        return result;
    }

    /* renamed from: p */
    public static <T> T[] m14979p(T[] tArr, T[] elements) {
        C9971q.m14633g(tArr, "<this>");
        C9971q.m14633g(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] result = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        C9971q.m14634f(result, "result");
        return result;
    }

    /* renamed from: q */
    public static final <T> void m14978q(T[] tArr) {
        C9971q.m14633g(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    /* renamed from: r */
    public static <T> void m14977r(T[] tArr, Comparator<? super T> comparator) {
        C9971q.m14633g(tArr, "<this>");
        C9971q.m14633g(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    /* renamed from: s */
    public static <T> void m14976s(T[] tArr, Comparator<? super T> comparator, int i, int i2) {
        C9971q.m14633g(tArr, "<this>");
        C9971q.m14633g(comparator, "comparator");
        Arrays.sort(tArr, i, i2, comparator);
    }
}
