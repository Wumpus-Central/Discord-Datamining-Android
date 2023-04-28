package p163j$.util;

import java.util.Collection;
import java.util.Iterator;
import p163j$.util.Spliterator;

/* renamed from: j$.util.Spliterators */
/* loaded from: classes2.dex */
public final class Spliterators {

    /* renamed from: a */
    private static final Spliterator f20298a = new C9246N();

    /* renamed from: b */
    private static final Spliterator.OfInt f20299b = new C9244L();

    /* renamed from: c */
    private static final AbstractC9234B f20300c = new C9245M();

    /* renamed from: d */
    private static final AbstractC9447y f20301d = new C9243K();

    /* renamed from: a */
    private static void m16595a(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
        } else if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(i2);
        } else if (i3 > i) {
            throw new ArrayIndexOutOfBoundsException(i3);
        }
    }

    /* renamed from: b */
    public static AbstractC9447y m16594b() {
        return f20301d;
    }

    /* renamed from: c */
    public static Spliterator.OfInt m16593c() {
        return f20299b;
    }

    /* renamed from: d */
    public static AbstractC9234B m16592d() {
        return f20300c;
    }

    /* renamed from: e */
    public static Spliterator m16591e() {
        return f20298a;
    }

    /* renamed from: f */
    public static AbstractC0520p m16590f(AbstractC9447y yVar) {
        yVar.getClass();
        return new C9240H(yVar);
    }

    /* renamed from: g */
    public static AbstractC0522s m16589g(Spliterator.OfInt ofInt) {
        ofInt.getClass();
        return new C9238F(ofInt);
    }

    /* renamed from: h */
    public static AbstractC9444v m16588h(AbstractC9234B b) {
        b.getClass();
        return new C9239G(b);
    }

    /* renamed from: i */
    public static Iterator m16587i(Spliterator spliterator) {
        spliterator.getClass();
        return new C9237E(spliterator);
    }

    /* renamed from: j */
    public static AbstractC9447y m16586j(double[] dArr, int i, int i2) {
        dArr.getClass();
        m16595a(dArr.length, i, i2);
        return new C9242J(dArr, i, i2, 1040);
    }

    /* renamed from: k */
    public static AbstractC9234B m16585k(long[] jArr, int i, int i2) {
        jArr.getClass();
        m16595a(jArr.length, i, i2);
        return new C9249Q(jArr, i, i2, 1040);
    }

    /* renamed from: l */
    public static Spliterator m16584l(Object[] objArr, int i, int i2) {
        objArr.getClass();
        m16595a(objArr.length, i, i2);
        return new C9241I(objArr, i, i2, 1040);
    }

    public static Spliterator.OfInt spliterator(int[] iArr, int i, int i2, int i3) {
        iArr.getClass();
        m16595a(iArr.length, i, i2);
        return new C9247O(iArr, i, i2, i3);
    }

    public static <T> Spliterator<T> spliterator(Collection<? extends T> collection, int i) {
        collection.getClass();
        return new C9248P(collection, i);
    }

    public static <T> Spliterator<T> spliterator(Iterator<? extends T> it, long j, int i) {
        it.getClass();
        return new C9248P(it, j, i);
    }

    public static <T> Spliterator<T> spliterator(Object[] objArr, int i) {
        objArr.getClass();
        return new C9241I(objArr, 0, objArr.length, i);
    }
}
