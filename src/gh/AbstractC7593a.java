package gh;

import bi.AbstractC3562c;
import bi.AbstractC3615z;
import bi.EnumC3559b;
import fi.AbstractC7267g0;
import gh.AbstractC7600b;
import gh.AbstractC7637r;
import gh.C7645u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kg.C9868a;
import kh.C9870b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import mh.C10619i;
import p087ei.AbstractC6936g;
import p087ei.AbstractC6944n;
import p159ih.C8581n;
import p217lg.C10439o;
import p249nh.C11136b;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import th.AbstractC13104g;
import th.C13122q;

/* renamed from: gh.a */
/* loaded from: classes8.dex */
public abstract class AbstractC7593a<A, C> extends AbstractC7600b<A, C0235a<? extends A, ? extends C>> implements AbstractC3562c<A, C> {

    /* renamed from: b */
    private final AbstractC6936g<AbstractC7637r, C0235a<A, C>> f16539b;

    /* renamed from: gh.a$a */
    /* loaded from: classes8.dex */
    public static final class C0235a<A, C> extends AbstractC7600b.AbstractC7601a<A> {

        /* renamed from: a */
        private final Map<C7645u, List<A>> f16540a;

        /* renamed from: b */
        private final Map<C7645u, C> f16541b;

        /* renamed from: c */
        private final Map<C7645u, C> f16542c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0235a(Map<C7645u, ? extends List<? extends A>> memberAnnotations, Map<C7645u, ? extends C> propertyConstants, Map<C7645u, ? extends C> annotationParametersDefaultValues) {
            C9971q.m14633g(memberAnnotations, "memberAnnotations");
            C9971q.m14633g(propertyConstants, "propertyConstants");
            C9971q.m14633g(annotationParametersDefaultValues, "annotationParametersDefaultValues");
            this.f16540a = memberAnnotations;
            this.f16541b = propertyConstants;
            this.f16542c = annotationParametersDefaultValues;
        }

        @Override // gh.AbstractC7600b.AbstractC7601a
        /* renamed from: a */
        public Map<C7645u, List<A>> mo21913a() {
            return this.f16540a;
        }

        /* renamed from: b */
        public final Map<C7645u, C> m21942b() {
            return this.f16542c;
        }

        /* renamed from: c */
        public final Map<C7645u, C> m21941c() {
            return this.f16541b;
        }
    }

    /* renamed from: gh.a$b */
    /* loaded from: classes8.dex */
    static final class C7594b extends AbstractC9973s implements Function2<C0235a<? extends A, ? extends C>, C7645u, C> {

        /* renamed from: k */
        public static final C7594b f16543k = new C7594b();

        C7594b() {
            super(2);
        }

        /* renamed from: a */
        public final C invoke(C0235a<? extends A, ? extends C> loadConstantFromProperty, C7645u it) {
            C9971q.m14633g(loadConstantFromProperty, "$this$loadConstantFromProperty");
            C9971q.m14633g(it, "it");
            return (C) loadConstantFromProperty.m21942b().get(it);
        }
    }

    /* renamed from: gh.a$c */
    /* loaded from: classes8.dex */
    public static final class C7595c implements AbstractC7637r.AbstractC7641d {

        /* renamed from: a */
        final /* synthetic */ AbstractC7593a<A, C> f16544a;

        /* renamed from: b */
        final /* synthetic */ HashMap<C7645u, List<A>> f16545b;

        /* renamed from: c */
        final /* synthetic */ AbstractC7637r f16546c;

        /* renamed from: d */
        final /* synthetic */ HashMap<C7645u, C> f16547d;

        /* renamed from: e */
        final /* synthetic */ HashMap<C7645u, C> f16548e;

        /* renamed from: gh.a$c$a */
        /* loaded from: classes8.dex */
        public final class C0236a extends C7596b implements AbstractC7637r.AbstractC7642e {

            /* renamed from: d */
            final /* synthetic */ C7595c f16549d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0236a(C7595c cVar, C7645u signature) {
                super(cVar, signature);
                C9971q.m14633g(signature, "signature");
                this.f16549d = cVar;
            }

            @Override // gh.AbstractC7637r.AbstractC7642e
            /* renamed from: c */
            public AbstractC7637r.AbstractC7638a mo21815c(int i, C11136b classId, AbstractC11299a1 source) {
                C9971q.m14633g(classId, "classId");
                C9971q.m14633g(source, "source");
                C7645u e = C7645u.f16652b.m21807e(m21939d(), i);
                List<A> list = this.f16549d.f16545b.get(e);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f16549d.f16545b.put(e, list);
                }
                return this.f16549d.f16544a.m21916w(classId, source, list);
            }
        }

        /* renamed from: gh.a$c$b */
        /* loaded from: classes8.dex */
        public class C7596b implements AbstractC7637r.AbstractC7640c {

            /* renamed from: a */
            private final C7645u f16550a;

            /* renamed from: b */
            private final ArrayList<A> f16551b = new ArrayList<>();

            /* renamed from: c */
            final /* synthetic */ C7595c f16552c;

            public C7596b(C7595c cVar, C7645u signature) {
                C9971q.m14633g(signature, "signature");
                this.f16552c = cVar;
                this.f16550a = signature;
            }

            @Override // gh.AbstractC7637r.AbstractC7640c
            /* renamed from: a */
            public void mo15156a() {
                if (!this.f16551b.isEmpty()) {
                    this.f16552c.f16545b.put(this.f16550a, this.f16551b);
                }
            }

            @Override // gh.AbstractC7637r.AbstractC7640c
            /* renamed from: b */
            public AbstractC7637r.AbstractC7638a mo15155b(C11136b classId, AbstractC11299a1 source) {
                C9971q.m14633g(classId, "classId");
                C9971q.m14633g(source, "source");
                return this.f16552c.f16544a.m21916w(classId, source, this.f16551b);
            }

            /* renamed from: d */
            protected final C7645u m21939d() {
                return this.f16550a;
            }
        }

        C7595c(AbstractC7593a<A, C> aVar, HashMap<C7645u, List<A>> hashMap, AbstractC7637r rVar, HashMap<C7645u, C> hashMap2, HashMap<C7645u, C> hashMap3) {
            this.f16544a = aVar;
            this.f16545b = hashMap;
            this.f16546c = rVar;
            this.f16547d = hashMap2;
            this.f16548e = hashMap3;
        }

        @Override // gh.AbstractC7637r.AbstractC7641d
        /* renamed from: a */
        public AbstractC7637r.AbstractC7642e mo21817a(C11142f name, String desc) {
            C9971q.m14633g(name, "name");
            C9971q.m14633g(desc, "desc");
            C7645u.C7646a aVar = C7645u.f16652b;
            String b = name.m10771b();
            C9971q.m14634f(b, "name.asString()");
            return new C0236a(this, aVar.m21808d(b, desc));
        }

        @Override // gh.AbstractC7637r.AbstractC7641d
        /* renamed from: b */
        public AbstractC7637r.AbstractC7640c mo21816b(C11142f name, String desc, Object obj) {
            C E;
            C9971q.m14633g(name, "name");
            C9971q.m14633g(desc, "desc");
            C7645u.C7646a aVar = C7645u.f16652b;
            String b = name.m10771b();
            C9971q.m14634f(b, "name.asString()");
            C7645u a = aVar.m21811a(b, desc);
            if (!(obj == null || (E = this.f16544a.mo21900E(desc, obj)) == null)) {
                this.f16548e.put(a, E);
            }
            return new C7596b(this, a);
        }
    }

    /* renamed from: gh.a$d */
    /* loaded from: classes8.dex */
    static final class C7597d extends AbstractC9973s implements Function2<C0235a<? extends A, ? extends C>, C7645u, C> {

        /* renamed from: k */
        public static final C7597d f16553k = new C7597d();

        C7597d() {
            super(2);
        }

        /* renamed from: a */
        public final C invoke(C0235a<? extends A, ? extends C> loadConstantFromProperty, C7645u it) {
            C9971q.m14633g(loadConstantFromProperty, "$this$loadConstantFromProperty");
            C9971q.m14633g(it, "it");
            return (C) loadConstantFromProperty.m21941c().get(it);
        }
    }

    /* renamed from: gh.a$e */
    /* loaded from: classes8.dex */
    static final class C7598e extends AbstractC9973s implements Function1<AbstractC7637r, C0235a<? extends A, ? extends C>> {

        /* renamed from: k */
        final /* synthetic */ AbstractC7593a<A, C> f16554k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7598e(AbstractC7593a<A, C> aVar) {
            super(1);
            this.f16554k = aVar;
        }

        /* renamed from: a */
        public final C0235a<A, C> invoke(AbstractC7637r kotlinClass) {
            C9971q.m14633g(kotlinClass, "kotlinClass");
            return this.f16554k.m21946D(kotlinClass);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7593a(AbstractC6944n storageManager, AbstractC7633p kotlinClassFinder) {
        super(kotlinClassFinder);
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(kotlinClassFinder, "kotlinClassFinder");
        this.f16539b = storageManager.mo23892i(new C7598e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final C0235a<A, C> m21946D(AbstractC7637r rVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        rVar.mo4632b(new C7595c(this, hashMap, rVar, hashMap3, hashMap2), m21921q(rVar));
        return new C0235a<>(hashMap, hashMap2, hashMap3);
    }

    /* renamed from: F */
    private final C m21945F(AbstractC3615z zVar, C8581n nVar, EnumC3559b bVar, AbstractC7267g0 g0Var, Function2<? super C0235a<? extends A, ? extends C>, ? super C7645u, ? extends C> function2) {
        C c;
        AbstractC7637r o = m21923o(zVar, m21918t(zVar, true, true, C9870b.f38748A.mo15135d(nVar.m18954b0()), C10619i.m12723f(nVar)));
        if (o == null) {
            return null;
        }
        C7645u r = m21920r(nVar, zVar.m33977b(), zVar.m33975d(), bVar, o.mo4630d().m20841d().m15151d(C7618h.f16612b.m21862a()));
        if (r == null || (c = (C) function2.invoke(this.f16539b.invoke(o), r)) == null) {
            return null;
        }
        if (C10439o.m13312d(g0Var)) {
            return mo21899G(c);
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public C0235a<A, C> mo21922p(AbstractC7637r binaryClass) {
        C9971q.m14633g(binaryClass, "binaryClass");
        return this.f16539b.invoke(binaryClass);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public final boolean m21947C(C11136b annotationClassId, Map<C11142f, ? extends AbstractC13104g<?>> arguments) {
        C13122q qVar;
        C9971q.m14633g(annotationClassId, "annotationClassId");
        C9971q.m14633g(arguments, "arguments");
        if (!C9971q.m14638b(annotationClassId, C9868a.f21990a.m15159a())) {
            return false;
        }
        Object obj = arguments.get(C11142f.m10767f("value"));
        C13122q.AbstractC13124b.C0421b bVar = null;
        if (obj instanceof C13122q) {
            qVar = (C13122q) obj;
        } else {
            qVar = null;
        }
        if (qVar == null) {
            return false;
        }
        Object b = qVar.mo4590b();
        if (b instanceof C13122q.AbstractC13124b.C0421b) {
            bVar = (C13122q.AbstractC13124b.C0421b) b;
        }
        if (bVar == null) {
            return false;
        }
        return m21917u(bVar.m4559b());
    }

    /* renamed from: E */
    protected abstract C mo21900E(String str, Object obj);

    /* renamed from: G */
    protected abstract C mo21899G(C c);

    @Override // bi.AbstractC3562c
    /* renamed from: e */
    public C mo21944e(AbstractC3615z container, C8581n proto, AbstractC7267g0 expectedType) {
        C9971q.m14633g(container, "container");
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(expectedType, "expectedType");
        return m21945F(container, proto, EnumC3559b.PROPERTY, expectedType, C7597d.f16553k);
    }

    @Override // bi.AbstractC3562c
    /* renamed from: i */
    public C mo21943i(AbstractC3615z container, C8581n proto, AbstractC7267g0 expectedType) {
        C9971q.m14633g(container, "container");
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(expectedType, "expectedType");
        return m21945F(container, proto, EnumC3559b.PROPERTY_GETTER, expectedType, C7594b.f16543k);
    }
}
