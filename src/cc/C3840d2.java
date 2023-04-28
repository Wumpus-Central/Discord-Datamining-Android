package cc;

import java.util.Collections;
import p030bc.C3457i;
import p163j$.util.Set;
import p163j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.d2 */
/* loaded from: classes3.dex */
public final class C3840d2<E> extends AbstractC3884i0<E> {

    /* renamed from: l */
    final transient E f6366l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3840d2(E e) {
        this.f6366l = (E) C3457i.m34352i(e);
    }

    @Override // cc.AbstractC3884i0
    /* renamed from: C */
    public AbstractC3884i0<E> subList(int i, int i2) {
        C3457i.m34348m(i, i2, 1);
        if (i == i2) {
            return AbstractC3884i0.m33399x();
        }
        return this;
    }

    @Override // java.util.List, p163j$.util.List
    public E get(int i) {
        C3457i.m34354g(i, 1);
        return this.f6366l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: i */
    public boolean mo33222i() {
        return false;
    }

    @Override // cc.AbstractC3884i0, cc.AbstractC3837d0
    /* renamed from: j */
    public AbstractC3868g2<E> iterator() {
        return C3818a1.m33523o(this.f6366l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public int size() {
        return 1;
    }

    @Override // cc.AbstractC3884i0, cc.AbstractC3837d0, java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public Spliterator<E> spliterator() {
        return Set.EL.spliterator(Collections.singleton(this.f6366l));
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f6366l.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}
