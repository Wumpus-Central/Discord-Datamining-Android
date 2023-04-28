package sa;

import java.util.Iterator;

/* renamed from: sa.e */
/* loaded from: classes3.dex */
final class C12835e extends AbstractC12838f0 {

    /* renamed from: m */
    private final transient AbstractC12836e0 f28910m;

    /* renamed from: n */
    private final transient AbstractC12830b0 f28911n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12835e(AbstractC12836e0 e0Var, AbstractC12830b0 b0Var) {
        this.f28910m = e0Var;
        this.f28911n = b0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sa.AbstractC12858y
    /* renamed from: a */
    public final int mo5257a(Object[] objArr, int i) {
        return this.f28911n.mo5257a(objArr, 0);
    }

    @Override // sa.AbstractC12858y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f28910m.get(obj) != null;
    }

    @Override // sa.AbstractC12838f0, sa.AbstractC12858y
    /* renamed from: f */
    public final AbstractC12830b0 mo5254f() {
        return this.f28911n;
    }

    @Override // sa.AbstractC12858y
    /* renamed from: g */
    public final AbstractC12842i mo5253g() {
        return this.f28911n.listIterator(0);
    }

    @Override // sa.AbstractC12858y, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return this.f28911n.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f28910m.size();
    }
}
