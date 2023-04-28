package p238n2;

import java.util.Arrays;
import java.util.List;
import p358u2.C13178a;

/* renamed from: n2.n */
/* loaded from: classes.dex */
abstract class AbstractC10706n<V, O> implements AbstractC10705m<V, O> {

    /* renamed from: a */
    final List<C13178a<V>> f23676a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10706n(List<C13178a<V>> list) {
        this.f23676a = list;
    }

    @Override // p238n2.AbstractC10705m
    /* renamed from: b */
    public List<C13178a<V>> mo12623b() {
        return this.f23676a;
    }

    @Override // p238n2.AbstractC10705m
    /* renamed from: f */
    public boolean mo12622f() {
        if (!this.f23676a.isEmpty()) {
            return this.f23676a.size() == 1 && this.f23676a.get(0).m4412h();
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f23676a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f23676a.toArray()));
        }
        return sb2.toString();
    }
}
