package pg;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9971q;
import p249nh.C11137c;
import pg.AbstractC11672g;

/* renamed from: pg.h */
/* loaded from: classes8.dex */
public final class C11675h implements AbstractC11672g {

    /* renamed from: k */
    private final List<AbstractC11666c> f26047k;

    /* JADX WARN: Multi-variable type inference failed */
    public C11675h(List<? extends AbstractC11666c> annotations) {
        C9971q.m14633g(annotations, "annotations");
        this.f26047k = annotations;
    }

    @Override // pg.AbstractC11672g
    /* renamed from: c */
    public AbstractC11666c mo9038c(C11137c cVar) {
        return AbstractC11672g.C11674b.m9046a(this, cVar);
    }

    @Override // pg.AbstractC11672g
    public boolean isEmpty() {
        return this.f26047k.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC11666c> iterator() {
        return this.f26047k.iterator();
    }

    @Override // pg.AbstractC11672g
    /* renamed from: l */
    public boolean mo9037l(C11137c cVar) {
        return AbstractC11672g.C11674b.m9045b(this, cVar);
    }

    public String toString() {
        return this.f26047k.toString();
    }
}
