package cc;

import java.io.Serializable;
import p030bc.C3457i;

/* renamed from: cc.x1 */
/* loaded from: classes3.dex */
final class C3970x1 extends AbstractC3937r1<Comparable<?>> implements Serializable {

    /* renamed from: k */
    static final C3970x1 f6532k = new C3970x1();

    private C3970x1() {
    }

    @Override // cc.AbstractC3937r1
    /* renamed from: k */
    public <S extends Comparable<?>> AbstractC3937r1<S> mo33221k() {
        return AbstractC3937r1.m33314d();
    }

    /* renamed from: l */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        C3457i.m34352i(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
