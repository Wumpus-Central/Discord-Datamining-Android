package cc;

import java.io.Serializable;
import p030bc.C3457i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.o1 */
/* loaded from: classes3.dex */
public final class C3923o1 extends AbstractC3937r1<Comparable<?>> implements Serializable {

    /* renamed from: k */
    static final C3923o1 f6459k = new C3923o1();

    private C3923o1() {
    }

    @Override // cc.AbstractC3937r1
    /* renamed from: k */
    public <S extends Comparable<?>> AbstractC3937r1<S> mo33221k() {
        return C3970x1.f6532k;
    }

    /* renamed from: l */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        C3457i.m34352i(comparable);
        C3457i.m34352i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
