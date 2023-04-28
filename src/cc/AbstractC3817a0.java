package cc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.a0 */
/* loaded from: classes3.dex */
public abstract class AbstractC3817a0<E> extends AbstractC3884i0<E> {
    /* renamed from: E */
    abstract AbstractC3837d0<E> mo33223E();

    @Override // cc.AbstractC3884i0, cc.AbstractC3837d0, java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public boolean contains(Object obj) {
        return mo33223E().contains(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: i */
    public boolean mo33222i() {
        return mo33223E().mo33222i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public boolean isEmpty() {
        return mo33223E().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public int size() {
        return mo33223E().size();
    }
}
