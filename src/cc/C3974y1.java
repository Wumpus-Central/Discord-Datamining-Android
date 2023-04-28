package cc;

import java.io.Serializable;
import p030bc.C3457i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.y1 */
/* loaded from: classes3.dex */
public final class C3974y1<T> extends AbstractC3937r1<T> implements Serializable {

    /* renamed from: k */
    final AbstractC3937r1<? super T> f6535k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3974y1(AbstractC3937r1<? super T> r1Var) {
        this.f6535k = (AbstractC3937r1) C3457i.m34352i(r1Var);
    }

    @Override // cc.AbstractC3937r1, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f6535k.compare(t2, t);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3974y1) {
            return this.f6535k.equals(((C3974y1) obj).f6535k);
        }
        return false;
    }

    public int hashCode() {
        return -this.f6535k.hashCode();
    }

    @Override // cc.AbstractC3937r1
    /* renamed from: k */
    public <S extends T> AbstractC3937r1<S> mo33221k() {
        return (AbstractC3937r1<? super T>) this.f6535k;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f6535k);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 10);
        sb2.append(valueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}
