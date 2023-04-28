package pg;

import ag.AbstractC1385a;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9904h;
import kotlin.jvm.internal.C9971q;
import p249nh.C11137c;

/* renamed from: pg.g */
/* loaded from: classes8.dex */
public interface AbstractC11672g extends Iterable<AbstractC11666c>, AbstractC1385a {

    /* renamed from: g */
    public static final C11673a f26044g = C11673a.f26045a;

    /* renamed from: pg.g$a */
    /* loaded from: classes8.dex */
    public static final class C11673a {

        /* renamed from: a */
        static final /* synthetic */ C11673a f26045a = new C11673a();

        /* renamed from: b */
        private static final AbstractC11672g f26046b = new C0371a();

        /* renamed from: pg.g$a$a */
        /* loaded from: classes8.dex */
        public static final class C0371a implements AbstractC11672g {
            C0371a() {
            }

            /* renamed from: a */
            public Void m9047a(C11137c fqName) {
                C9971q.m14633g(fqName, "fqName");
                return null;
            }

            @Override // pg.AbstractC11672g
            /* renamed from: c */
            public /* bridge */ /* synthetic */ AbstractC11666c mo9038c(C11137c cVar) {
                return (AbstractC11666c) m9047a(cVar);
            }

            @Override // pg.AbstractC11672g
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<AbstractC11666c> iterator() {
                return C9904h.m14862i().iterator();
            }

            @Override // pg.AbstractC11672g
            /* renamed from: l */
            public boolean mo9037l(C11137c cVar) {
                return C11674b.m9045b(this, cVar);
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private C11673a() {
        }

        /* renamed from: a */
        public final AbstractC11672g m9049a(List<? extends AbstractC11666c> annotations) {
            C9971q.m14633g(annotations, "annotations");
            if (annotations.isEmpty()) {
                return f26046b;
            }
            return new C11675h(annotations);
        }

        /* renamed from: b */
        public final AbstractC11672g m9048b() {
            return f26046b;
        }
    }

    /* renamed from: pg.g$b */
    /* loaded from: classes8.dex */
    public static final class C11674b {
        /* renamed from: a */
        public static AbstractC11666c m9046a(AbstractC11672g gVar, C11137c fqName) {
            AbstractC11666c cVar;
            C9971q.m14633g(fqName, "fqName");
            Iterator<AbstractC11666c> it = gVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                cVar = it.next();
                if (C9971q.m14638b(cVar.mo722e(), fqName)) {
                    break;
                }
            }
            return cVar;
        }

        /* renamed from: b */
        public static boolean m9045b(AbstractC11672g gVar, C11137c fqName) {
            C9971q.m14633g(fqName, "fqName");
            if (gVar.mo9038c(fqName) != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c */
    AbstractC11666c mo9038c(C11137c cVar);

    boolean isEmpty();

    /* renamed from: l */
    boolean mo9037l(C11137c cVar);
}
