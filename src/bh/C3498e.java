package bh;

import ch.C4006b;
import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import fi.C7278i0;
import fi.EnumC7319r1;
import fi.EnumC7338w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import nf.C11098x;
import ng.C11107d;
import p013ah.C1399g;
import p069dh.AbstractC6462a;
import p086eh.AbstractC6885a;
import p086eh.AbstractC6887b;
import p086eh.AbstractC6889c;
import p086eh.AbstractC6893e;
import p086eh.AbstractC6895g;
import p086eh.AbstractC6896h;
import p086eh.AbstractC6901m;
import p086eh.AbstractC6903o;
import p086eh.AbstractC6912x;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6939j;
import p087ei.C6943m;
import p142hi.C8039k;
import p142hi.EnumC8038j;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11142f;
import p267of.C11289v;
import p268og.AbstractC11313e;
import p268og.AbstractC11327h0;
import p268og.AbstractC11335j1;
import p268og.C11393x;
import p305qh.AbstractC12137c;
import p388vh.C13508c;
import p427xg.C14108b0;
import p447yg.C14378a;
import p467zg.AbstractC14655g;
import pg.AbstractC11666c;
import th.AbstractC13104g;
import th.C13097a;
import th.C13105h;
import th.C13109j;
import th.C13122q;
import th.C13127s;

/* renamed from: bh.e */
/* loaded from: classes8.dex */
public final class C3498e implements AbstractC11666c, AbstractC14655g {

    /* renamed from: i */
    static final /* synthetic */ KProperty<Object>[] f5638i = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C3498e.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C3498e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C3498e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: a */
    private final C1399g f5639a;

    /* renamed from: b */
    private final AbstractC6885a f5640b;

    /* renamed from: c */
    private final AbstractC6939j f5641c;

    /* renamed from: d */
    private final AbstractC6938i f5642d;

    /* renamed from: e */
    private final AbstractC6462a f5643e;

    /* renamed from: f */
    private final AbstractC6938i f5644f;

    /* renamed from: g */
    private final boolean f5645g;

    /* renamed from: h */
    private final boolean f5646h;

    /* renamed from: bh.e$a */
    /* loaded from: classes8.dex */
    static final class C3499a extends AbstractC9973s implements Function0<Map<C11142f, ? extends AbstractC13104g<?>>> {
        C3499a() {
            super(0);
        }

        /* renamed from: a */
        public final Map<C11142f, AbstractC13104g<?>> invoke() {
            Map<C11142f, AbstractC13104g<?>> r;
            Pair pair;
            Collection<AbstractC6887b> j = C3498e.this.f5640b.mo4040j();
            C3498e eVar = C3498e.this;
            ArrayList arrayList = new ArrayList();
            for (AbstractC6887b bVar : j) {
                C11142f name = bVar.getName();
                if (name == null) {
                    name = C14108b0.f31848c;
                }
                AbstractC13104g l = eVar.m34279l(bVar);
                if (l != null) {
                    pair = C11098x.m10921a(name, l);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            r = C11289v.m10241r(arrayList);
            return r;
        }
    }

    /* renamed from: bh.e$b */
    /* loaded from: classes8.dex */
    static final class C3500b extends AbstractC9973s implements Function0<C11137c> {
        C3500b() {
            super(0);
        }

        /* renamed from: a */
        public final C11137c invoke() {
            C11136b k = C3498e.this.f5640b.mo4039k();
            if (k != null) {
                return k.m10816b();
            }
            return null;
        }
    }

    /* renamed from: bh.e$c */
    /* loaded from: classes8.dex */
    static final class C3501c extends AbstractC9973s implements Function0<AbstractC7304o0> {
        C3501c() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC7304o0 invoke() {
            C11137c e = C3498e.this.mo722e();
            if (e == null) {
                return C8039k.m20774d(EnumC8038j.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, C3498e.this.f5640b.toString());
            }
            AbstractC11313e f = C11107d.m10884f(C11107d.f24646a, e, C3498e.this.f5639a.m41171d().mo6136n(), null, 4, null);
            if (f == null) {
                AbstractC6895g t = C3498e.this.f5640b.mo4037t();
                if (t != null) {
                    f = C3498e.this.f5639a.m41174a().m41196n().mo41162a(t);
                } else {
                    f = null;
                }
                if (f == null) {
                    f = C3498e.this.m34283g(e);
                }
            }
            return f.mo6166p();
        }
    }

    public C3498e(C1399g c, AbstractC6885a javaAnnotation, boolean z) {
        C9971q.m14633g(c, "c");
        C9971q.m14633g(javaAnnotation, "javaAnnotation");
        this.f5639a = c;
        this.f5640b = javaAnnotation;
        this.f5641c = c.m41170e().mo23896e(new C3500b());
        this.f5642d = c.m41170e().mo23898c(new C3501c());
        this.f5643e = c.m41174a().m41190t().mo4613a(javaAnnotation);
        this.f5644f = c.m41170e().mo23898c(new C3499a());
        this.f5645g = javaAnnotation.mo4038n();
        this.f5646h = javaAnnotation.mo4043G() || z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final AbstractC11313e m34283g(C11137c cVar) {
        AbstractC11327h0 d = this.f5639a.m41171d();
        C11136b m = C11136b.m10805m(cVar);
        C9971q.m14634f(m, "topLevel(fqName)");
        return C11393x.m10147c(d, m, this.f5639a.m41174a().m41208b().m21872d().m34033q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final AbstractC13104g<?> m34279l(AbstractC6887b bVar) {
        if (bVar instanceof AbstractC6903o) {
            return C13105h.f29410a.m4595c(((AbstractC6903o) bVar).getValue());
        }
        if (bVar instanceof AbstractC6901m) {
            AbstractC6901m mVar = (AbstractC6901m) bVar;
            return m34276p(mVar.mo3990d(), mVar.mo3989e());
        } else if (bVar instanceof AbstractC6893e) {
            AbstractC6893e eVar = (AbstractC6893e) bVar;
            C11142f name = eVar.getName();
            if (name == null) {
                name = C14108b0.f31848c;
            }
            C9971q.m14634f(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            return m34277o(name, eVar.mo4032c());
        } else if (bVar instanceof AbstractC6889c) {
            return m34278m(((AbstractC6889c) bVar).mo4035a());
        } else {
            if (bVar instanceof AbstractC6896h) {
                return m34275q(((AbstractC6896h) bVar).mo3998b());
            }
            return null;
        }
    }

    /* renamed from: m */
    private final AbstractC13104g<?> m34278m(AbstractC6885a aVar) {
        return new C13097a(new C3498e(this.f5639a, aVar, false, 4, null));
    }

    /* renamed from: o */
    private final AbstractC13104g<?> m34277o(C11142f fVar, List<? extends AbstractC6887b> list) {
        AbstractC7267g0 g0Var;
        int t;
        AbstractC7304o0 type = getType();
        C9971q.m14634f(type, "type");
        if (C7278i0.m23035a(type)) {
            return null;
        }
        AbstractC11313e i = C13508c.m3532i(this);
        C9971q.m14636d(i);
        AbstractC11335j1 b = C14378a.m732b(fVar, i);
        if (b == null || (g0Var = b.getType()) == null) {
            g0Var = this.f5639a.m41174a().m41197m().mo6136n().m13381l(EnumC7338w1.INVARIANT, C8039k.m20774d(EnumC8038j.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
        }
        C9971q.m14634f(g0Var, "DescriptorResolverUtils.…GUMENT)\n                )");
        t = C9907k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC6887b bVar : list) {
            AbstractC13104g<?> l = m34279l(bVar);
            if (l == null) {
                l = new C13127s();
            }
            arrayList.add(l);
        }
        return C13105h.f29410a.m4597a(arrayList, g0Var);
    }

    /* renamed from: p */
    private final AbstractC13104g<?> m34276p(C11136b bVar, C11142f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new C13109j(bVar, fVar);
    }

    /* renamed from: q */
    private final AbstractC13104g<?> m34275q(AbstractC6912x xVar) {
        return C13122q.f29432b.m4562a(this.f5639a.m41168g().m33093o(xVar, C4006b.m33109b(EnumC7319r1.COMMON, false, false, null, 7, null)));
    }

    @Override // pg.AbstractC11666c
    /* renamed from: a */
    public Map<C11142f, AbstractC13104g<?>> mo700a() {
        return (Map) C6943m.m23902a(this.f5644f, this, f5638i[2]);
    }

    @Override // pg.AbstractC11666c
    /* renamed from: e */
    public C11137c mo722e() {
        return (C11137c) C6943m.m23901b(this.f5641c, this, f5638i[0]);
    }

    /* renamed from: h */
    public AbstractC6462a mo721j() {
        return this.f5643e;
    }

    /* renamed from: i */
    public AbstractC7304o0 getType() {
        return (AbstractC7304o0) C6943m.m23902a(this.f5642d, this, f5638i[1]);
    }

    /* renamed from: k */
    public final boolean m34280k() {
        return this.f5646h;
    }

    @Override // p467zg.AbstractC14655g
    /* renamed from: n */
    public boolean mo54n() {
        return this.f5645g;
    }

    public String toString() {
        return AbstractC12137c.m7757s(AbstractC12137c.f27230g, this, null, 2, null);
    }

    public /* synthetic */ C3498e(C1399g gVar, AbstractC6885a aVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, aVar, (i & 4) != 0 ? false : z);
    }
}
