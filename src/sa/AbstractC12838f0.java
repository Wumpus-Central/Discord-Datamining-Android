package sa;

import java.util.Set;

/* renamed from: sa.f0 */
/* loaded from: classes3.dex */
public abstract class AbstractC12838f0 extends AbstractC12858y implements Set {

    /* renamed from: l */
    private transient AbstractC12830b0 f28918l;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // sa.AbstractC12858y
    /* renamed from: f */
    public AbstractC12830b0 mo5254f() {
        AbstractC12830b0 b0Var = this.f28918l;
        if (b0Var != null) {
            return b0Var;
        }
        AbstractC12830b0 p = mo5304p();
        this.f28918l = p;
        return p;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C12841h.m5298a(this);
    }

    /* renamed from: p */
    AbstractC12830b0 mo5304p() {
        return AbstractC12830b0.m5316r(toArray());
    }
}
