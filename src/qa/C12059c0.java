package qa;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.c0 */
/* loaded from: classes3.dex */
public final class C12059c0<E> extends AbstractC12096v<E> {

    /* renamed from: m */
    private final transient E f27087m;

    /* renamed from: n */
    private transient int f27088n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12059c0(E e) {
        this.f27087m = (E) C12080n.m7871b(e);
    }

    @Override // qa.AbstractC12088r
    /* renamed from: a */
    final int mo7845a(Object[] objArr, int i) {
        objArr[0] = this.f27087m;
        return 1;
    }

    @Override // qa.AbstractC12088r
    /* renamed from: b */
    public final AbstractC12057b0<E> mo7844b() {
        return new C12094u(this.f27087m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f27087m.equals(obj);
    }

    @Override // qa.AbstractC12096v, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.f27088n;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f27087m.hashCode();
        this.f27088n = hashCode;
        return hashCode;
    }

    @Override // qa.AbstractC12096v, qa.AbstractC12088r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo7844b();
    }

    @Override // qa.AbstractC12096v
    /* renamed from: r */
    final boolean mo7840r() {
        return this.f27088n != 0;
    }

    @Override // qa.AbstractC12096v
    /* renamed from: s */
    final AbstractC12086q<E> mo7839s() {
        return AbstractC12086q.m7859p(this.f27087m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f27087m.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12059c0(E e, int i) {
        this.f27087m = e;
        this.f27088n = i;
    }
}
