package sa;

import java.util.Iterator;
import java.util.Map;

/* renamed from: sa.d */
/* loaded from: classes3.dex */
final class C12833d extends AbstractC12838f0 {

    /* renamed from: m */
    private final transient AbstractC12836e0 f28904m;

    /* renamed from: n */
    private final transient Object[] f28905n;

    /* renamed from: o */
    private final transient int f28906o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12833d(AbstractC12836e0 e0Var, Object[] objArr, int i, int i2) {
        this.f28904m = e0Var;
        this.f28905n = objArr;
        this.f28906o = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sa.AbstractC12858y
    /* renamed from: a */
    public final int mo5257a(Object[] objArr, int i) {
        return mo5254f().mo5257a(objArr, 0);
    }

    @Override // sa.AbstractC12858y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f28904m.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // sa.AbstractC12858y
    /* renamed from: g */
    public final AbstractC12842i mo5253g() {
        return mo5254f().listIterator(0);
    }

    @Override // sa.AbstractC12858y, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return mo5254f().listIterator(0);
    }

    @Override // sa.AbstractC12838f0
    /* renamed from: p */
    final AbstractC12830b0 mo5304p() {
        return new C12831c(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f28906o;
    }
}
