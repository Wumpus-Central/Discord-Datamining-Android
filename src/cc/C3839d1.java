package cc;

import java.util.Set;

/* renamed from: cc.d1 */
/* loaded from: classes3.dex */
final class C3839d1<E> extends AbstractC3972y0<E> {

    /* renamed from: m */
    private final Set<?> f6364m;

    /* renamed from: n */
    private final AbstractC3884i0<E> f6365n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3839d1(Set<?> set, AbstractC3884i0<E> i0Var) {
        this.f6364m = set;
        this.f6365n = i0Var;
    }

    @Override // cc.AbstractC3837d0, java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public boolean contains(Object obj) {
        return this.f6364m.contains(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3972y0
    public E get(int i) {
        return this.f6365n.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: i */
    public boolean mo33222i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public int size() {
        return this.f6365n.size();
    }
}
