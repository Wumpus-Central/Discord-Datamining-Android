package p305qh;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9912p;
import kotlin.jvm.internal.C9971q;
import p249nh.C11138d;
import p249nh.C11142f;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11344l0;
import p268og.AbstractC11346m;
import p325rh.C12661e;

/* renamed from: qh.b */
/* loaded from: classes8.dex */
public interface AbstractC12134b {

    /* renamed from: qh.b$a */
    /* loaded from: classes8.dex */
    public static final class C12135a implements AbstractC12134b {

        /* renamed from: a */
        public static final C12135a f27221a = new C12135a();

        private C12135a() {
        }

        @Override // p305qh.AbstractC12134b
        /* renamed from: a */
        public String mo7760a(AbstractC11326h classifier, AbstractC12137c renderer) {
            C9971q.m14633g(classifier, "classifier");
            C9971q.m14633g(renderer, "renderer");
            if (classifier instanceof AbstractC11319f1) {
                C11142f name = ((AbstractC11319f1) classifier).getName();
                C9971q.m14634f(name, "classifier.name");
                return renderer.mo7616v(name, false);
            }
            C11138d m = C12661e.m6041m(classifier);
            C9971q.m14634f(m, "getFqName(classifier)");
            return renderer.mo7619u(m);
        }
    }

    /* renamed from: qh.b$b */
    /* loaded from: classes8.dex */
    public static final class C0386b implements AbstractC12134b {

        /* renamed from: a */
        public static final C0386b f27222a = new C0386b();

        private C0386b() {
        }

        @Override // p305qh.AbstractC12134b
        /* renamed from: a */
        public String mo7760a(AbstractC11326h classifier, AbstractC12137c renderer) {
            boolean z;
            List G;
            C9971q.m14633g(classifier, "classifier");
            C9971q.m14633g(renderer, "renderer");
            if (classifier instanceof AbstractC11319f1) {
                C11142f name = ((AbstractC11319f1) classifier).getName();
                C9971q.m14634f(name, "classifier.name");
                return renderer.mo7616v(name, false);
            }
            ArrayList arrayList = new ArrayList();
            AbstractC11326h hVar = classifier;
            do {
                arrayList.add(hVar.getName());
                AbstractC11346m b = hVar.mo6104b();
                z = b instanceof AbstractC11313e;
                hVar = b;
            } while (z);
            G = C9912p.m14796G(arrayList);
            return C12175n.m7502c(G);
        }
    }

    /* renamed from: qh.b$c */
    /* loaded from: classes8.dex */
    public static final class C12136c implements AbstractC12134b {

        /* renamed from: a */
        public static final C12136c f27223a = new C12136c();

        private C12136c() {
        }

        /* renamed from: b */
        private final String m7759b(AbstractC11326h hVar) {
            C11142f name = hVar.getName();
            C9971q.m14634f(name, "descriptor.name");
            String b = C12175n.m7503b(name);
            if (hVar instanceof AbstractC11319f1) {
                return b;
            }
            AbstractC11346m b2 = hVar.mo6104b();
            C9971q.m14634f(b2, "descriptor.containingDeclaration");
            String c = m7758c(b2);
            if (c == null || C9971q.m14638b(c, "")) {
                return b;
            }
            return c + '.' + b;
        }

        /* renamed from: c */
        private final String m7758c(AbstractC11346m mVar) {
            if (mVar instanceof AbstractC11313e) {
                return m7759b((AbstractC11326h) mVar);
            }
            if (!(mVar instanceof AbstractC11344l0)) {
                return null;
            }
            C11138d j = ((AbstractC11344l0) mVar).mo6103e().m10795j();
            C9971q.m14634f(j, "descriptor.fqName.toUnsafe()");
            return C12175n.m7504a(j);
        }

        @Override // p305qh.AbstractC12134b
        /* renamed from: a */
        public String mo7760a(AbstractC11326h classifier, AbstractC12137c renderer) {
            C9971q.m14633g(classifier, "classifier");
            C9971q.m14633g(renderer, "renderer");
            return m7759b(classifier);
        }
    }

    /* renamed from: a */
    String mo7760a(AbstractC11326h hVar, AbstractC12137c cVar);
}
