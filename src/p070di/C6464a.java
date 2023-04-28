package p070di;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KProperty;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6944n;
import p087ei.C6943m;
import p249nh.C11137c;
import pg.AbstractC11666c;
import pg.AbstractC11672g;

/* renamed from: di.a */
/* loaded from: classes8.dex */
public class C6464a implements AbstractC11672g {

    /* renamed from: l */
    static final /* synthetic */ KProperty<Object>[] f13541l = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C6464a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: k */
    private final AbstractC6938i f13542k;

    public C6464a(AbstractC6944n storageManager, Function0<? extends List<? extends AbstractC11666c>> compute) {
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(compute, "compute");
        this.f13542k = storageManager.mo23898c(compute);
    }

    /* renamed from: a */
    private final List<AbstractC11666c> m25535a() {
        return (List) C6943m.m23902a(this.f13542k, this, f13541l[0]);
    }

    @Override // pg.AbstractC11672g
    /* renamed from: c */
    public AbstractC11666c mo9038c(C11137c cVar) {
        return AbstractC11672g.C11674b.m9046a(this, cVar);
    }

    @Override // pg.AbstractC11672g
    public boolean isEmpty() {
        return m25535a().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC11666c> iterator() {
        return m25535a().iterator();
    }

    @Override // pg.AbstractC11672g
    /* renamed from: l */
    public boolean mo9037l(C11137c cVar) {
        return AbstractC11672g.C11674b.m9045b(this, cVar);
    }
}
