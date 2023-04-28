package pg;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import p249nh.C11137c;
import p306qi.C12200o;

/* renamed from: pg.k */
/* loaded from: classes8.dex */
public final class C11679k implements AbstractC11672g {

    /* renamed from: k */
    private final List<AbstractC11672g> f26053k;

    /* renamed from: pg.k$a */
    /* loaded from: classes8.dex */
    static final class C11680a extends AbstractC9973s implements Function1<AbstractC11672g, AbstractC11666c> {

        /* renamed from: k */
        final /* synthetic */ C11137c f26054k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11680a(C11137c cVar) {
            super(1);
            this.f26054k = cVar;
        }

        /* renamed from: a */
        public final AbstractC11666c invoke(AbstractC11672g it) {
            C9971q.m14633g(it, "it");
            return it.mo9038c(this.f26054k);
        }
    }

    /* renamed from: pg.k$b */
    /* loaded from: classes8.dex */
    static final class C11681b extends AbstractC9973s implements Function1<AbstractC11672g, Sequence<? extends AbstractC11666c>> {

        /* renamed from: k */
        public static final C11681b f26055k = new C11681b();

        C11681b() {
            super(1);
        }

        /* renamed from: a */
        public final Sequence<AbstractC11666c> invoke(AbstractC11672g it) {
            Sequence<AbstractC11666c> K;
            C9971q.m14633g(it, "it");
            K = C9914r.m14782K(it);
            return K;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11679k(List<? extends AbstractC11672g> delegates) {
        C9971q.m14633g(delegates, "delegates");
        this.f26053k = delegates;
    }

    @Override // pg.AbstractC11672g
    /* renamed from: c */
    public AbstractC11666c mo9038c(C11137c fqName) {
        Sequence K;
        Sequence z;
        Object s;
        C9971q.m14633g(fqName, "fqName");
        K = C9914r.m14782K(this.f26053k);
        z = C12200o.m7419z(K, new C11680a(fqName));
        s = C12200o.m7426s(z);
        return (AbstractC11666c) s;
    }

    @Override // pg.AbstractC11672g
    public boolean isEmpty() {
        List<AbstractC11672g> list = this.f26053k;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (AbstractC11672g gVar : list) {
            if (!gVar.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC11666c> iterator() {
        Sequence K;
        Sequence t;
        K = C9914r.m14782K(this.f26053k);
        t = C12200o.m7425t(K, C11681b.f26055k);
        return t.iterator();
    }

    @Override // pg.AbstractC11672g
    /* renamed from: l */
    public boolean mo9037l(C11137c fqName) {
        Sequence<AbstractC11672g> K;
        C9971q.m14633g(fqName, "fqName");
        K = C9914r.m14782K(this.f26053k);
        for (AbstractC11672g gVar : K) {
            if (gVar.mo9037l(fqName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C11679k(pg.AbstractC11672g... r2) {
        /*
            r1 = this;
            java.lang.String r0 = "delegates"
            kotlin.jvm.internal.C9971q.m14633g(r2, r0)
            java.util.List r2 = kotlin.collections.C9894b.m15002u0(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.C11679k.<init>(pg.g[]):void");
    }
}
