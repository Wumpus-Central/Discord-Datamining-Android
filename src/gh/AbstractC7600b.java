package gh;

import bi.AbstractC3576f;
import bi.AbstractC3615z;
import bi.EnumC3559b;
import gh.AbstractC7600b.AbstractC7601a;
import gh.AbstractC7637r;
import gh.C7645u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kg.C9868a;
import kh.AbstractC9874c;
import kh.C9870b;
import kh.C9877e;
import kh.C9878f;
import kh.C9879g;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import mh.AbstractC10609d;
import mh.C10607b;
import mh.C10619i;
import p159ih.C8541b;
import p159ih.C8544c;
import p159ih.C8547d;
import p159ih.C8560g;
import p159ih.C8568i;
import p159ih.C8581n;
import p159ih.C8593q;
import p159ih.C8603s;
import p159ih.C8611u;
import p218lh.C10440a;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p326ri.C12718u;
import p326ri.C12719v;
import p407wh.C13885d;
import ph.AbstractC11702i;
import ph.AbstractC11724q;

/* renamed from: gh.b */
/* loaded from: classes8.dex */
public abstract class AbstractC7600b<A, S extends AbstractC7601a<? extends A>> implements AbstractC3576f<A> {

    /* renamed from: a */
    private final AbstractC7633p f16556a;

    /* renamed from: gh.b$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC7601a<A> {
        /* renamed from: a */
        public abstract Map<C7645u, List<A>> mo21913a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gh.b$b */
    /* loaded from: classes8.dex */
    public enum EnumC0237b {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* renamed from: gh.b$c */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C7602c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16561a;

        static {
            int[] iArr = new int[EnumC3559b.values().length];
            try {
                iArr[EnumC3559b.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3559b.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3559b.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16561a = iArr;
        }
    }

    /* renamed from: gh.b$d */
    /* loaded from: classes8.dex */
    public static final class C7603d implements AbstractC7637r.AbstractC7640c {

        /* renamed from: a */
        final /* synthetic */ AbstractC7600b<A, S> f16562a;

        /* renamed from: b */
        final /* synthetic */ ArrayList<A> f16563b;

        C7603d(AbstractC7600b<A, S> bVar, ArrayList<A> arrayList) {
            this.f16562a = bVar;
            this.f16563b = arrayList;
        }

        @Override // gh.AbstractC7637r.AbstractC7640c
        /* renamed from: a */
        public void mo15156a() {
        }

        @Override // gh.AbstractC7637r.AbstractC7640c
        /* renamed from: b */
        public AbstractC7637r.AbstractC7638a mo15155b(C11136b classId, AbstractC11299a1 source) {
            C9971q.m14633g(classId, "classId");
            C9971q.m14633g(source, "source");
            return this.f16562a.m21916w(classId, source, this.f16563b);
        }
    }

    public AbstractC7600b(AbstractC7633p kotlinClassFinder) {
        C9971q.m14633g(kotlinClassFinder, "kotlinClassFinder");
        this.f16556a = kotlinClassFinder;
    }

    /* renamed from: l */
    private final int m21926l(AbstractC3615z zVar, AbstractC11724q qVar) {
        if (qVar instanceof C8568i) {
            if (C9878f.m15124g((C8568i) qVar)) {
                return 1;
            }
        } else if (qVar instanceof C8581n) {
            if (C9878f.m15123h((C8581n) qVar)) {
                return 1;
            }
        } else if (qVar instanceof C8547d) {
            C9971q.m14635e(zVar, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            AbstractC3615z.C3616a aVar = (AbstractC3615z.C3616a) zVar;
            if (aVar.m33972g() == C8544c.EnumC0270c.ENUM_CLASS) {
                return 2;
            }
            if (aVar.m33970i()) {
                return 1;
            }
        } else {
            throw new UnsupportedOperationException("Unsupported message: " + qVar.getClass());
        }
        return 0;
    }

    /* renamed from: m */
    private final List<A> m21925m(AbstractC3615z zVar, C7645u uVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        List<A> i;
        List<A> i2;
        AbstractC7637r o = m21923o(zVar, m21918t(zVar, z, z2, bool, z3));
        if (o == null) {
            i2 = C9906j.m14820i();
            return i2;
        }
        List<A> list = mo21922p(o).mo21913a().get(uVar);
        if (list != null) {
            return list;
        }
        i = C9906j.m14820i();
        return i;
    }

    /* renamed from: n */
    static /* synthetic */ List m21924n(AbstractC7600b bVar, AbstractC3615z zVar, C7645u uVar, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        if (obj == null) {
            return bVar.m21925m(zVar, uVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? false : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    /* renamed from: s */
    public static /* synthetic */ C7645u m21919s(AbstractC7600b bVar, AbstractC11724q qVar, AbstractC9874c cVar, C9879g gVar, EnumC3559b bVar2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                z = false;
            }
            return bVar.m21920r(qVar, cVar, gVar, bVar2, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    /* renamed from: x */
    private final List<A> m21915x(AbstractC3615z zVar, C8581n nVar, EnumC0237b bVar) {
        boolean M;
        List<A> i;
        List<A> i2;
        List<A> i3;
        Boolean g = C9870b.f38748A.mo15135d(nVar.m18954b0());
        C9971q.m14634f(g, "IS_CONST.get(proto.flags)");
        boolean booleanValue = g.booleanValue();
        boolean f = C10619i.m12723f(nVar);
        if (bVar == EnumC0237b.PROPERTY) {
            C7645u b = C7607c.m21903b(nVar, zVar.m33977b(), zVar.m33975d(), false, true, false, 40, null);
            if (b != null) {
                return m21924n(this, zVar, b, true, false, Boolean.valueOf(booleanValue), f, 8, null);
            }
            i3 = C9906j.m14820i();
            return i3;
        }
        C7645u b2 = C7607c.m21903b(nVar, zVar.m33977b(), zVar.m33975d(), true, false, false, 48, null);
        if (b2 == null) {
            i2 = C9906j.m14820i();
            return i2;
        }
        boolean z = false;
        M = C12719v.m5709M(b2.m21812a(), "$delegate", false, 2, null);
        if (bVar == EnumC0237b.DELEGATE_FIELD) {
            z = true;
        }
        if (M == z) {
            return m21925m(zVar, b2, true, true, Boolean.valueOf(booleanValue), f);
        }
        i = C9906j.m14820i();
        return i;
    }

    /* renamed from: z */
    private final AbstractC7637r m21914z(AbstractC3615z.C3616a aVar) {
        AbstractC11299a1 c = aVar.m33976c();
        C7644t tVar = c instanceof C7644t ? (C7644t) c : null;
        if (tVar != null) {
            return tVar.m21813d();
        }
        return null;
    }

    @Override // bi.AbstractC3576f
    /* renamed from: a */
    public List<A> mo21935a(AbstractC3615z container, C8581n proto) {
        C9971q.m14633g(container, "container");
        C9971q.m14633g(proto, "proto");
        return m21915x(container, proto, EnumC0237b.DELEGATE_FIELD);
    }

    @Override // bi.AbstractC3576f
    /* renamed from: b */
    public List<A> mo21934b(C8593q proto, AbstractC9874c nameResolver) {
        int t;
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        Object v = proto.m8832v(C10440a.f22980f);
        C9971q.m14634f(v, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<C8541b> iterable = (Iterable) v;
        t = C9907k.m14809t(iterable, 10);
        ArrayList arrayList = new ArrayList(t);
        for (C8541b it : iterable) {
            C9971q.m14634f(it, "it");
            arrayList.add(mo21891y(it, nameResolver));
        }
        return arrayList;
    }

    @Override // bi.AbstractC3576f
    /* renamed from: c */
    public List<A> mo21933c(AbstractC3615z.C3616a container) {
        C9971q.m14633g(container, "container");
        AbstractC7637r z = m21914z(container);
        if (z != null) {
            ArrayList arrayList = new ArrayList(1);
            z.mo4631c(new C7603d(this, arrayList), m21921q(z));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.mo33969a()).toString());
    }

    @Override // bi.AbstractC3576f
    /* renamed from: d */
    public List<A> mo21932d(AbstractC3615z container, C8560g proto) {
        C9971q.m14633g(container, "container");
        C9971q.m14633g(proto, "proto");
        C7645u.C7646a aVar = C7645u.f16652b;
        String string = container.m33977b().getString(proto.m19217G());
        String c = ((AbstractC3615z.C3616a) container).m33974e().m10815c();
        C9971q.m14634f(c, "container as ProtoContai…Class).classId.asString()");
        return m21924n(this, container, aVar.m21811a(string, C10607b.m12739b(c)), false, false, null, false, 60, null);
    }

    @Override // bi.AbstractC3576f
    /* renamed from: f */
    public List<A> mo21931f(AbstractC3615z container, AbstractC11724q proto, EnumC3559b kind) {
        List<A> i;
        C9971q.m14633g(container, "container");
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(kind, "kind");
        if (kind == EnumC3559b.PROPERTY) {
            return m21915x(container, (C8581n) proto, EnumC0237b.PROPERTY);
        }
        C7645u s = m21919s(this, proto, container.m33977b(), container.m33975d(), kind, false, 16, null);
        if (s != null) {
            return m21924n(this, container, s, false, false, null, false, 60, null);
        }
        i = C9906j.m14820i();
        return i;
    }

    @Override // bi.AbstractC3576f
    /* renamed from: g */
    public List<A> mo21930g(C8603s proto, AbstractC9874c nameResolver) {
        int t;
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        Object v = proto.m8832v(C10440a.f22982h);
        C9971q.m14634f(v, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<C8541b> iterable = (Iterable) v;
        t = C9907k.m14809t(iterable, 10);
        ArrayList arrayList = new ArrayList(t);
        for (C8541b it : iterable) {
            C9971q.m14634f(it, "it");
            arrayList.add(mo21891y(it, nameResolver));
        }
        return arrayList;
    }

    @Override // bi.AbstractC3576f
    /* renamed from: h */
    public List<A> mo21929h(AbstractC3615z container, AbstractC11724q proto, EnumC3559b kind) {
        List<A> i;
        C9971q.m14633g(container, "container");
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(kind, "kind");
        C7645u s = m21919s(this, proto, container.m33977b(), container.m33975d(), kind, false, 16, null);
        if (s != null) {
            return m21924n(this, container, C7645u.f16652b.m21807e(s, 0), false, false, null, false, 60, null);
        }
        i = C9906j.m14820i();
        return i;
    }

    @Override // bi.AbstractC3576f
    /* renamed from: j */
    public List<A> mo21928j(AbstractC3615z container, AbstractC11724q callableProto, EnumC3559b kind, int i, C8611u proto) {
        List<A> i2;
        C9971q.m14633g(container, "container");
        C9971q.m14633g(callableProto, "callableProto");
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(proto, "proto");
        C7645u s = m21919s(this, callableProto, container.m33977b(), container.m33975d(), kind, false, 16, null);
        if (s != null) {
            return m21924n(this, container, C7645u.f16652b.m21807e(s, i + m21926l(container, callableProto)), false, false, null, false, 60, null);
        }
        i2 = C9906j.m14820i();
        return i2;
    }

    @Override // bi.AbstractC3576f
    /* renamed from: k */
    public List<A> mo21927k(AbstractC3615z container, C8581n proto) {
        C9971q.m14633g(container, "container");
        C9971q.m14633g(proto, "proto");
        return m21915x(container, proto, EnumC0237b.BACKING_FIELD);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final AbstractC7637r m21923o(AbstractC3615z container, AbstractC7637r rVar) {
        C9971q.m14633g(container, "container");
        if (rVar != null) {
            return rVar;
        }
        if (container instanceof AbstractC3615z.C3616a) {
            return m21914z((AbstractC3615z.C3616a) container);
        }
        return null;
    }

    /* renamed from: p */
    protected abstract S mo21922p(AbstractC7637r rVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public byte[] m21921q(AbstractC7637r kotlinClass) {
        C9971q.m14633g(kotlinClass, "kotlinClass");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final C7645u m21920r(AbstractC11724q proto, AbstractC9874c nameResolver, C9879g typeTable, EnumC3559b kind, boolean z) {
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        C9971q.m14633g(typeTable, "typeTable");
        C9971q.m14633g(kind, "kind");
        if (proto instanceof C8547d) {
            C7645u.C7646a aVar = C7645u.f16652b;
            AbstractC10609d.C10611b b = C10619i.f23511a.m12727b((C8547d) proto, nameResolver, typeTable);
            if (b == null) {
                return null;
            }
            return aVar.m21810b(b);
        } else if (proto instanceof C8568i) {
            C7645u.C7646a aVar2 = C7645u.f16652b;
            AbstractC10609d.C10611b e = C10619i.f23511a.m12724e((C8568i) proto, nameResolver, typeTable);
            if (e == null) {
                return null;
            }
            return aVar2.m21810b(e);
        } else if (!(proto instanceof C8581n)) {
            return null;
        } else {
            AbstractC11702i.C11709f<C8581n, C10440a.C10444d> propertySignature = C10440a.f22978d;
            C9971q.m14634f(propertySignature, "propertySignature");
            C10440a.C10444d dVar = (C10440a.C10444d) C9877e.m15132a((AbstractC11702i.AbstractC11706d) proto, propertySignature);
            if (dVar == null) {
                return null;
            }
            int i = C7602c.f16561a[kind.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return C7607c.m21904a((C8581n) proto, nameResolver, typeTable, true, true, z);
                } else if (!dVar.m13252I()) {
                    return null;
                } else {
                    C7645u.C7646a aVar3 = C7645u.f16652b;
                    C10440a.C10442c D = dVar.m13257D();
                    C9971q.m14634f(D, "signature.setter");
                    return aVar3.m21809c(nameResolver, D);
                }
            } else if (!dVar.m13253H()) {
                return null;
            } else {
                C7645u.C7646a aVar4 = C7645u.f16652b;
                C10440a.C10442c C = dVar.m13258C();
                C9971q.m14634f(C, "signature.getter");
                return aVar4.m21809c(nameResolver, C);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final AbstractC7637r m21918t(AbstractC3615z container, boolean z, boolean z2, Boolean bool, boolean z3) {
        AbstractC3615z.C3616a h;
        C7624l lVar;
        C13885d dVar;
        String C;
        C9971q.m14633g(container, "container");
        if (z) {
            if (bool != null) {
                if (container instanceof AbstractC3615z.C3616a) {
                    AbstractC3615z.C3616a aVar = (AbstractC3615z.C3616a) container;
                    if (aVar.m33972g() == C8544c.EnumC0270c.INTERFACE) {
                        AbstractC7633p pVar = this.f16556a;
                        C11136b d = aVar.m33974e().m10814d(C11142f.m10767f("DefaultImpls"));
                        C9971q.m14634f(d, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                        return C7636q.m21818b(pVar, d);
                    }
                }
                if (bool.booleanValue() && (container instanceof AbstractC3615z.C3617b)) {
                    AbstractC11299a1 c = container.m33976c();
                    if (c instanceof C7624l) {
                        lVar = (C7624l) c;
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        dVar = lVar.m21856f();
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        AbstractC7633p pVar2 = this.f16556a;
                        String f = dVar.m2397f();
                        C9971q.m14634f(f, "facadeClassName.internalName");
                        C = C12718u.m5741C(f, '/', '.', false, 4, null);
                        C11136b m = C11136b.m10805m(new C11137c(C));
                        C9971q.m14634f(m, "topLevel(FqName(facadeCl…lName.replace('/', '.')))");
                        return C7636q.m21818b(pVar2, m);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
            }
        }
        if (z2 && (container instanceof AbstractC3615z.C3616a)) {
            AbstractC3615z.C3616a aVar2 = (AbstractC3615z.C3616a) container;
            if (aVar2.m33972g() == C8544c.EnumC0270c.COMPANION_OBJECT && (h = aVar2.m33971h()) != null && (h.m33972g() == C8544c.EnumC0270c.CLASS || h.m33972g() == C8544c.EnumC0270c.ENUM_CLASS || (z3 && (h.m33972g() == C8544c.EnumC0270c.INTERFACE || h.m33972g() == C8544c.EnumC0270c.ANNOTATION_CLASS)))) {
                return m21914z(h);
            }
        }
        if (!(container instanceof AbstractC3615z.C3617b) || !(container.m33976c() instanceof C7624l)) {
            return null;
        }
        AbstractC11299a1 c2 = container.m33976c();
        C9971q.m14635e(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        C7624l lVar2 = (C7624l) c2;
        AbstractC7637r g = lVar2.m21855g();
        if (g == null) {
            return C7636q.m21818b(this.f16556a, lVar2.m21858d());
        }
        return g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean m21917u(C11136b classId) {
        AbstractC7637r b;
        C9971q.m14633g(classId, "classId");
        if (classId.m10811g() == null || !C9971q.m14638b(classId.m10808j().m10771b(), "Container") || (b = C7636q.m21818b(this.f16556a, classId)) == null || !C9868a.f21990a.m15157c(b)) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    protected abstract AbstractC7637r.AbstractC7638a mo21892v(C11136b bVar, AbstractC11299a1 a1Var, List<A> list);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final AbstractC7637r.AbstractC7638a m21916w(C11136b annotationClassId, AbstractC11299a1 source, List<A> result) {
        C9971q.m14633g(annotationClassId, "annotationClassId");
        C9971q.m14633g(source, "source");
        C9971q.m14633g(result, "result");
        if (C9868a.f21990a.m15158b().contains(annotationClassId)) {
            return null;
        }
        return mo21892v(annotationClassId, source, result);
    }

    /* renamed from: y */
    protected abstract A mo21891y(C8541b bVar, AbstractC9874c cVar);
}
