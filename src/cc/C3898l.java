package cc;

import java.io.Serializable;
import p030bc.AbstractC3454f;
import p030bc.C3456h;
import p030bc.C3457i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.l */
/* loaded from: classes3.dex */
public final class C3898l<F, T> extends AbstractC3937r1<F> implements Serializable {

    /* renamed from: k */
    final AbstractC3454f<F, ? extends T> f6433k;

    /* renamed from: l */
    final AbstractC3937r1<T> f6434l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3898l(AbstractC3454f<F, ? extends T> fVar, AbstractC3937r1<T> r1Var) {
        this.f6433k = (AbstractC3454f) C3457i.m34352i(fVar);
        this.f6434l = (AbstractC3937r1) C3457i.m34352i(r1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cc.AbstractC3937r1, java.util.Comparator
    public int compare(F f, F f2) {
        return this.f6434l.compare(this.f6433k.apply(f), this.f6433k.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3898l)) {
            return false;
        }
        C3898l lVar = (C3898l) obj;
        if (!this.f6433k.equals(lVar.f6433k) || !this.f6434l.equals(lVar.f6434l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C3456h.m34361b(this.f6433k, this.f6434l);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f6434l);
        String valueOf2 = String.valueOf(this.f6433k);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append(".onResultOf(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
