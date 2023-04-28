package cc;

import java.io.Serializable;
import java.util.Comparator;
import p030bc.C3457i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.w */
/* loaded from: classes3.dex */
public final class C3959w<T> extends AbstractC3937r1<T> implements Serializable {

    /* renamed from: k */
    final Comparator<T> f6512k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3959w(Comparator<T> comparator) {
        this.f6512k = (Comparator) C3457i.m34352i(comparator);
    }

    @Override // cc.AbstractC3937r1, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f6512k.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3959w) {
            return this.f6512k.equals(((C3959w) obj).f6512k);
        }
        return false;
    }

    public int hashCode() {
        return this.f6512k.hashCode();
    }

    public String toString() {
        return this.f6512k.toString();
    }
}
