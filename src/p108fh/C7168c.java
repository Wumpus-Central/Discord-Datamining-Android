package p108fh;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import p249nh.C11137c;
import pg.AbstractC11666c;
import pg.AbstractC11672g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: fh.c */
/* loaded from: classes8.dex */
public final class C7168c implements AbstractC11672g {

    /* renamed from: k */
    private final C11137c f15572k;

    public C7168c(C11137c fqNameToMatch) {
        C9971q.m14633g(fqNameToMatch, "fqNameToMatch");
        this.f15572k = fqNameToMatch;
    }

    /* renamed from: a */
    public C7167b mo9038c(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        if (C9971q.m14638b(fqName, this.f15572k)) {
            return C7167b.f15571a;
        }
        return null;
    }

    @Override // pg.AbstractC11672g
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC11666c> iterator() {
        List i;
        i = C9906j.m14820i();
        return i.iterator();
    }

    @Override // pg.AbstractC11672g
    /* renamed from: l */
    public boolean mo9037l(C11137c cVar) {
        return AbstractC11672g.C11674b.m9045b(this, cVar);
    }
}
