package p108fh;

import bh.C3498e;
import bh.C3502f;
import fi.AbstractC7267g0;
import fi.AbstractC7298n0;
import fi.AbstractC7335v1;
import fi.C7322s1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ki.C9883a;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import ng.C11105c;
import p013ah.C1389a;
import p013ah.C1399g;
import p086eh.AbstractC6885a;
import p249nh.C11142f;
import p268og.AbstractC11301b;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11335j1;
import p268og.AbstractC11396x0;
import p268og.C11371s;
import p388vh.C13508c;
import p427xg.EnumC14107b;
import pg.AbstractC11664a;
import pg.AbstractC11666c;
import pg.AbstractC11672g;

/* renamed from: fh.l */
/* loaded from: classes8.dex */
public final class C7207l {

    /* renamed from: a */
    private final C7169d f15635a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fh.l$a */
    /* loaded from: classes8.dex */
    public static final class C7208a extends AbstractC9973s implements Function1<AbstractC7335v1, Boolean> {

        /* renamed from: k */
        public static final C7208a f15636k = new C7208a();

        C7208a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC7335v1 v1Var) {
            boolean z;
            AbstractC11326h p = v1Var.mo5172N0().mo4565p();
            if (p == null) {
                return Boolean.FALSE;
            }
            C11142f name = p.getName();
            C11105c cVar = C11105c.f24626a;
            if (!C9971q.m14638b(name, cVar.m10902h().m10798g()) || !C9971q.m14638b(C13508c.m3533h(p), cVar.m10902h())) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fh.l$b */
    /* loaded from: classes8.dex */
    public static final class C7209b extends AbstractC9973s implements Function1<AbstractC11301b, AbstractC7267g0> {

        /* renamed from: k */
        public static final C7209b f15637k = new C7209b();

        C7209b() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke(AbstractC11301b it) {
            C9971q.m14633g(it, "it");
            AbstractC11396x0 M = it.mo6264M();
            C9971q.m14636d(M);
            AbstractC7267g0 type = M.getType();
            C9971q.m14634f(type, "it.extensionReceiverParameter!!.type");
            return type;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fh.l$c */
    /* loaded from: classes8.dex */
    public static final class C7210c extends AbstractC9973s implements Function1<AbstractC11301b, AbstractC7267g0> {

        /* renamed from: k */
        public static final C7210c f15638k = new C7210c();

        C7210c() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke(AbstractC11301b it) {
            C9971q.m14633g(it, "it");
            AbstractC7267g0 returnType = it.getReturnType();
            C9971q.m14636d(returnType);
            return returnType;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fh.l$d */
    /* loaded from: classes8.dex */
    public static final class C7211d extends AbstractC9973s implements Function1<AbstractC11301b, AbstractC7267g0> {

        /* renamed from: k */
        final /* synthetic */ AbstractC11335j1 f15639k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7211d(AbstractC11335j1 j1Var) {
            super(1);
            this.f15639k = j1Var;
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke(AbstractC11301b it) {
            C9971q.m14633g(it, "it");
            AbstractC7267g0 type = it.mo6242i().get(this.f15639k.getIndex()).getType();
            C9971q.m14634f(type, "it.valueParameters[p.index].type");
            return type;
        }
    }

    /* renamed from: fh.l$e */
    /* loaded from: classes8.dex */
    static final class C7212e extends AbstractC9973s implements Function1<AbstractC7335v1, Boolean> {

        /* renamed from: k */
        public static final C7212e f15640k = new C7212e();

        C7212e() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC7335v1 it) {
            C9971q.m14633g(it, "it");
            return Boolean.valueOf(it instanceof AbstractC7298n0);
        }
    }

    public C7207l(C7169d typeEnhancement) {
        C9971q.m14633g(typeEnhancement, "typeEnhancement");
        this.f15635a = typeEnhancement;
    }

    /* renamed from: a */
    private final boolean m23237a(AbstractC7267g0 g0Var) {
        return C7322s1.m22944c(g0Var, C7208a.f15636k);
    }

    /* renamed from: b */
    private final AbstractC7267g0 m23236b(C7215n nVar, AbstractC7267g0 g0Var, List<? extends AbstractC7267g0> list, C7218q qVar, boolean z) {
        return this.f15635a.m23296a(g0Var, nVar.m23313b(g0Var, list, qVar, z), nVar.mo23198u());
    }

    /* renamed from: c */
    private final AbstractC7267g0 m23235c(AbstractC11301b bVar, AbstractC11664a aVar, boolean z, C1399g gVar, EnumC14107b bVar2, C7218q qVar, boolean z2, Function1<? super AbstractC11301b, ? extends AbstractC7267g0> function1) {
        int t;
        C7215n nVar = new C7215n(aVar, z, gVar, bVar2, false, 16, null);
        AbstractC7267g0 g0Var = (AbstractC7267g0) function1.invoke(bVar);
        Collection<? extends AbstractC11301b> overriddenDescriptors = bVar.mo6249d();
        C9971q.m14634f(overriddenDescriptors, "overriddenDescriptors");
        t = C9907k.m14809t(overriddenDescriptors, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC11301b it : overriddenDescriptors) {
            C9971q.m14634f(it, "it");
            arrayList.add((AbstractC7267g0) function1.invoke(it));
        }
        return m23236b(nVar, g0Var, arrayList, qVar, z2);
    }

    /* renamed from: d */
    static /* synthetic */ AbstractC7267g0 m23234d(C7207l lVar, C7215n nVar, AbstractC7267g0 g0Var, List list, C7218q qVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            qVar = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return lVar.m23236b(nVar, g0Var, list, qVar, z);
    }

    /* renamed from: e */
    static /* synthetic */ AbstractC7267g0 m23233e(C7207l lVar, AbstractC11301b bVar, AbstractC11664a aVar, boolean z, C1399g gVar, EnumC14107b bVar2, C7218q qVar, boolean z2, Function1 function1, int i, Object obj) {
        return lVar.m23235c(bVar, aVar, z, gVar, bVar2, qVar, (i & 32) != 0 ? false : z2, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018b  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <D extends p268og.AbstractC11301b> D m23232f(D r21, p013ah.C1399g r22) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p108fh.C7207l.m23232f(og.b, ah.g):og.b");
    }

    /* renamed from: j */
    private final AbstractC7267g0 m23228j(AbstractC11301b bVar, AbstractC11335j1 j1Var, C1399g gVar, C7218q qVar, boolean z, Function1<? super AbstractC11301b, ? extends AbstractC7267g0> function1) {
        C1399g gVar2;
        C1399g h;
        if (j1Var == null || (h = C1389a.m41213h(gVar, j1Var.getAnnotations())) == null) {
            gVar2 = gVar;
        } else {
            gVar2 = h;
        }
        return m23235c(bVar, j1Var, false, gVar2, EnumC14107b.VALUE_PARAMETER, qVar, z, function1);
    }

    /* renamed from: k */
    private final <D extends AbstractC11301b> AbstractC11672g m23227k(D d, C1399g gVar) {
        C3502f fVar;
        boolean z;
        int t;
        List<? extends AbstractC11666c> m0;
        AbstractC11326h a = C11371s.m10181a(d);
        if (a == null) {
            return d.getAnnotations();
        }
        List<AbstractC6885a> list = null;
        if (a instanceof C3502f) {
            fVar = (C3502f) a;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            list = fVar.m34265Q0();
        }
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return d.getAnnotations();
        }
        t = C9907k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC6885a aVar : list) {
            arrayList.add(new C3498e(gVar, aVar, true));
        }
        AbstractC11672g.C11673a aVar2 = AbstractC11672g.f26044g;
        m0 = C9914r.m14752m0(d.getAnnotations(), arrayList);
        return aVar2.m9049a(m0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public final <D extends AbstractC11301b> Collection<D> m23231g(C1399g c, Collection<? extends D> platformSignatures) {
        int t;
        C9971q.m14633g(c, "c");
        C9971q.m14633g(platformSignatures, "platformSignatures");
        t = C9907k.m14809t(platformSignatures, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = platformSignatures.iterator();
        while (it.hasNext()) {
            arrayList.add(m23232f((AbstractC11301b) it.next(), c));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final AbstractC7267g0 m23230h(AbstractC7267g0 type, C1399g context) {
        List i;
        C9971q.m14633g(type, "type");
        C9971q.m14633g(context, "context");
        C7215n nVar = new C7215n(null, false, context, EnumC14107b.TYPE_USE, true);
        i = C9906j.m14820i();
        AbstractC7267g0 d = m23234d(this, nVar, type, i, null, false, 12, null);
        if (d == null) {
            return type;
        }
        return d;
    }

    /* renamed from: i */
    public final List<AbstractC7267g0> m23229i(AbstractC11319f1 typeParameter, List<? extends AbstractC7267g0> bounds, C1399g context) {
        int t;
        List i;
        C9971q.m14633g(typeParameter, "typeParameter");
        C9971q.m14633g(bounds, "bounds");
        C9971q.m14633g(context, "context");
        t = C9907k.m14809t(bounds, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC7267g0 g0Var : bounds) {
            if (!C9883a.m15103b(g0Var, C7212e.f15640k)) {
                C7215n nVar = new C7215n(typeParameter, false, context, EnumC14107b.TYPE_PARAMETER_BOUNDS, false, 16, null);
                i = C9906j.m14820i();
                AbstractC7267g0 d = m23234d(this, nVar, g0Var, i, null, false, 12, null);
                if (d != null) {
                    g0Var = d;
                }
            }
            arrayList.add(g0Var);
        }
        return arrayList;
    }
}
