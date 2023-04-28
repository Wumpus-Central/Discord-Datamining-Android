package pg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p249nh.C11137c;

/* renamed from: pg.l */
/* loaded from: classes8.dex */
public final class C11682l implements AbstractC11672g {

    /* renamed from: k */
    private final AbstractC11672g f26056k;

    /* renamed from: l */
    private final boolean f26057l;

    /* renamed from: m */
    private final Function1<C11137c, Boolean> f26058m;

    /* JADX WARN: Multi-variable type inference failed */
    public C11682l(AbstractC11672g delegate, boolean z, Function1<? super C11137c, Boolean> fqNameFilter) {
        C9971q.m14633g(delegate, "delegate");
        C9971q.m14633g(fqNameFilter, "fqNameFilter");
        this.f26056k = delegate;
        this.f26057l = z;
        this.f26058m = fqNameFilter;
    }

    /* renamed from: a */
    private final boolean m9039a(AbstractC11666c cVar) {
        C11137c e = cVar.mo722e();
        if (e == null || !this.f26058m.invoke(e).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // pg.AbstractC11672g
    /* renamed from: c */
    public AbstractC11666c mo9038c(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        if (this.f26058m.invoke(fqName).booleanValue()) {
            return this.f26056k.mo9038c(fqName);
        }
        return null;
    }

    @Override // pg.AbstractC11672g
    public boolean isEmpty() {
        boolean z;
        AbstractC11672g<AbstractC11666c> gVar = this.f26056k;
        if (!(gVar instanceof Collection) || !((Collection) gVar).isEmpty()) {
            for (AbstractC11666c cVar : gVar) {
                if (m9039a(cVar)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!this.f26057l) {
            return z;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC11666c> iterator() {
        AbstractC11672g gVar = this.f26056k;
        ArrayList arrayList = new ArrayList();
        for (AbstractC11666c cVar : gVar) {
            if (m9039a(cVar)) {
                arrayList.add(cVar);
            }
        }
        return arrayList.iterator();
    }

    @Override // pg.AbstractC11672g
    /* renamed from: l */
    public boolean mo9037l(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        if (this.f26058m.invoke(fqName).booleanValue()) {
            return this.f26056k.mo9037l(fqName);
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11682l(AbstractC11672g delegate, Function1<? super C11137c, Boolean> fqNameFilter) {
        this(delegate, false, fqNameFilter);
        C9971q.m14633g(delegate, "delegate");
        C9971q.m14633g(fqNameFilter, "fqNameFilter");
    }
}
