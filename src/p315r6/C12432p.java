package p315r6;

import java.util.Set;
import p279p6.AbstractC11575e;
import p279p6.AbstractC11576f;
import p279p6.AbstractC11577g;
import p279p6.C11572b;

/* renamed from: r6.p */
/* loaded from: classes7.dex */
final class C12432p implements AbstractC11577g {

    /* renamed from: a */
    private final Set<C11572b> f27971a;

    /* renamed from: b */
    private final AbstractC12430o f27972b;

    /* renamed from: c */
    private final AbstractC12435s f27973c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12432p(Set<C11572b> set, AbstractC12430o oVar, AbstractC12435s sVar) {
        this.f27971a = set;
        this.f27972b = oVar;
        this.f27973c = sVar;
    }

    @Override // p279p6.AbstractC11577g
    /* renamed from: a */
    public <T> AbstractC11576f<T> mo6792a(String str, Class<T> cls, C11572b bVar, AbstractC11575e<T, byte[]> eVar) {
        if (this.f27971a.contains(bVar)) {
            return new C12434r(this.f27972b, str, bVar, eVar, this.f27973c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f27971a));
    }
}
