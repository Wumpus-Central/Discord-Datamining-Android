package cc;

import p030bc.C3457i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.e2 */
/* loaded from: classes3.dex */
public final class C3844e2<E> extends AbstractC3960w0<E> {

    /* renamed from: l */
    final transient E f6369l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3844e2(E e) {
        this.f6369l = (E) C3457i.m34352i(e);
    }

    @Override // cc.AbstractC3837d0
    /* renamed from: a */
    public AbstractC3884i0<E> mo33253a() {
        return AbstractC3884i0.m33398y(this.f6369l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: b */
    public int mo33225b(Object[] objArr, int i) {
        objArr[i] = this.f6369l;
        return i + 1;
    }

    @Override // cc.AbstractC3837d0, java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public boolean contains(Object obj) {
        return this.f6369l.equals(obj);
    }

    @Override // cc.AbstractC3960w0, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public final int hashCode() {
        return this.f6369l.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: i */
    public boolean mo33222i() {
        return false;
    }

    @Override // cc.AbstractC3960w0, cc.AbstractC3837d0
    /* renamed from: j */
    public AbstractC3868g2<E> iterator() {
        return C3818a1.m33523o(this.f6369l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f6369l.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}
