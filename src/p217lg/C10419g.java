package p217lg;

import fi.AbstractC7267g0;
import fi.AbstractC7290k1;
import fi.AbstractC7304o0;
import fi.C7236d1;
import fi.C7270h0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ki.C9883a;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import mg.EnumC10600c;
import nf.C11098x;
import p217lg.C10434k;
import p249nh.C11137c;
import p249nh.C11138d;
import p249nh.C11142f;
import p267of.C11288u;
import p267of.C11289v;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.AbstractC11346m;
import p286pi.C11754a;
import p388vh.C13508c;
import pg.AbstractC11666c;
import pg.AbstractC11672g;
import pg.C11677j;
import th.AbstractC13104g;
import th.C13114m;
import th.C13130v;

/* renamed from: lg.g */
/* loaded from: classes8.dex */
public final class C10419g {
    /* renamed from: a */
    public static final int m13451a(AbstractC7267g0 g0Var) {
        Object i;
        C9971q.m14633g(g0Var, "<this>");
        AbstractC11666c c = g0Var.getAnnotations().mo9038c(C10434k.C10435a.f38771D);
        if (c == null) {
            return 0;
        }
        i = C11289v.m10250i(c.mo700a(), C10434k.f22884k);
        AbstractC13104g gVar = (AbstractC13104g) i;
        C9971q.m14635e(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((C13114m) gVar).mo4590b().intValue();
    }

    /* renamed from: b */
    public static final AbstractC7304o0 m13450b(AbstractC10420h builtIns, AbstractC11672g annotations, AbstractC7267g0 g0Var, List<? extends AbstractC7267g0> contextReceiverTypes, List<? extends AbstractC7267g0> parameterTypes, List<C11142f> list, AbstractC7267g0 returnType, boolean z) {
        int i;
        C9971q.m14633g(builtIns, "builtIns");
        C9971q.m14633g(annotations, "annotations");
        C9971q.m14633g(contextReceiverTypes, "contextReceiverTypes");
        C9971q.m14633g(parameterTypes, "parameterTypes");
        C9971q.m14633g(returnType, "returnType");
        List<AbstractC7290k1> g = m13445g(g0Var, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        int size = parameterTypes.size() + contextReceiverTypes.size();
        if (g0Var == null) {
            i = 0;
        } else {
            i = 1;
        }
        AbstractC11313e f = m13446f(builtIns, size + i, z);
        if (g0Var != null) {
            annotations = m13432t(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = m13433s(annotations, builtIns, contextReceiverTypes.size());
        }
        return C7270h0.m23053g(C7236d1.m23140b(annotations), f, g);
    }

    /* renamed from: d */
    public static final C11142f m13448d(AbstractC7267g0 g0Var) {
        Object s0;
        C13130v vVar;
        String str;
        C9971q.m14633g(g0Var, "<this>");
        AbstractC11666c c = g0Var.getAnnotations().mo9038c(C10434k.C10435a.f38773E);
        if (c == null) {
            return null;
        }
        s0 = C9914r.m14746s0(c.mo700a().values());
        if (s0 instanceof C13130v) {
            vVar = (C13130v) s0;
        } else {
            vVar = null;
        }
        if (!(vVar == null || (str = (String) vVar.mo4590b()) == null)) {
            if (!C11142f.m10765h(str)) {
                str = null;
            }
            if (str != null) {
                return C11142f.m10767f(str);
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final List<AbstractC7267g0> m13447e(AbstractC7267g0 g0Var) {
        int t;
        List<AbstractC7267g0> i;
        C9971q.m14633g(g0Var, "<this>");
        m13437o(g0Var);
        int a = m13451a(g0Var);
        if (a == 0) {
            i = C9906j.m14820i();
            return i;
        }
        List<AbstractC7290k1> subList = g0Var.mo5174L0().subList(0, a);
        t = C9907k.m14809t(subList, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC7290k1 k1Var : subList) {
            AbstractC7267g0 type = k1Var.getType();
            C9971q.m14634f(type, "it.type");
            arrayList.add(type);
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final AbstractC11313e m13446f(AbstractC10420h builtIns, int i, boolean z) {
        AbstractC11313e eVar;
        C9971q.m14633g(builtIns, "builtIns");
        if (z) {
            eVar = builtIns.m13405X(i);
        } else {
            eVar = builtIns.m13427C(i);
        }
        C9971q.m14634f(eVar, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return eVar;
    }

    /* renamed from: g */
    public static final List<AbstractC7290k1> m13445g(AbstractC7267g0 g0Var, List<? extends AbstractC7267g0> contextReceiverTypes, List<? extends AbstractC7267g0> parameterTypes, List<C11142f> list, AbstractC7267g0 returnType, AbstractC10420h builtIns) {
        int i;
        int t;
        AbstractC7290k1 k1Var;
        C11142f fVar;
        Map e;
        List<? extends AbstractC11666c> n0;
        C9971q.m14633g(contextReceiverTypes, "contextReceiverTypes");
        C9971q.m14633g(parameterTypes, "parameterTypes");
        C9971q.m14633g(returnType, "returnType");
        C9971q.m14633g(builtIns, "builtIns");
        int size = parameterTypes.size() + contextReceiverTypes.size();
        int i2 = 0;
        if (g0Var != null) {
            i = 1;
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(size + i + 1);
        t = C9907k.m14809t(contextReceiverTypes, 10);
        ArrayList arrayList2 = new ArrayList(t);
        for (AbstractC7267g0 g0Var2 : contextReceiverTypes) {
            arrayList2.add(C9883a.m15104a(g0Var2));
        }
        arrayList.addAll(arrayList2);
        if (g0Var != null) {
            k1Var = C9883a.m15104a(g0Var);
        } else {
            k1Var = null;
        }
        C11754a.m8689a(arrayList, k1Var);
        for (Object obj : parameterTypes) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C9906j.m14810s();
            }
            AbstractC7267g0 g0Var3 = (AbstractC7267g0) obj;
            if (list == null || (fVar = list.get(i2)) == null || fVar.m10766g()) {
                fVar = null;
            }
            if (fVar != null) {
                C11137c cVar = C10434k.C10435a.f38773E;
                C11142f f = C11142f.m10767f("name");
                String b = fVar.m10771b();
                C9971q.m14634f(b, "name.asString()");
                e = C11288u.m10254e(C11098x.m10921a(f, new C13130v(b)));
                C11677j jVar = new C11677j(builtIns, cVar, e);
                AbstractC11672g.C11673a aVar = AbstractC11672g.f26044g;
                n0 = C9914r.m14751n0(g0Var3.getAnnotations(), jVar);
                g0Var3 = C9883a.m15083v(g0Var3, aVar.m9049a(n0));
            }
            arrayList.add(C9883a.m15104a(g0Var3));
            i2 = i3;
        }
        arrayList.add(C9883a.m15104a(returnType));
        return arrayList;
    }

    /* renamed from: h */
    private static final EnumC10600c m13444h(C11138d dVar) {
        if (!dVar.m10788f() || dVar.m10789e()) {
            return null;
        }
        EnumC10600c.C10601a aVar = EnumC10600c.f23473o;
        String b = dVar.m10785i().m10771b();
        C9971q.m14634f(b, "shortName().asString()");
        C11137c e = dVar.m10782l().m10800e();
        C9971q.m14634f(e, "toSafe().parent()");
        return aVar.m12755b(b, e);
    }

    /* renamed from: i */
    public static final EnumC10600c m13443i(AbstractC11346m mVar) {
        C9971q.m14633g(mVar, "<this>");
        if ((mVar instanceof AbstractC11313e) && AbstractC10420h.m13430A0(mVar)) {
            return m13444h(C13508c.m3528m(mVar));
        }
        return null;
    }

    /* renamed from: j */
    public static final AbstractC7267g0 m13442j(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        m13437o(g0Var);
        if (!m13434r(g0Var)) {
            return null;
        }
        return g0Var.mo5174L0().get(m13451a(g0Var)).getType();
    }

    /* renamed from: k */
    public static final AbstractC7267g0 m13441k(AbstractC7267g0 g0Var) {
        Object g0;
        C9971q.m14633g(g0Var, "<this>");
        m13437o(g0Var);
        g0 = C9914r.m14758g0(g0Var.mo5174L0());
        AbstractC7267g0 type = ((AbstractC7290k1) g0).getType();
        C9971q.m14634f(type, "arguments.last().type");
        return type;
    }

    /* renamed from: l */
    public static final List<AbstractC7290k1> m13440l(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        m13437o(g0Var);
        List<AbstractC7290k1> L0 = g0Var.mo5174L0();
        return L0.subList(m13451a(g0Var) + (m13439m(g0Var) ? 1 : 0), L0.size() - 1);
    }

    /* renamed from: m */
    public static final boolean m13439m(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        if (!m13437o(g0Var) || !m13434r(g0Var)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static final boolean m13438n(AbstractC11346m mVar) {
        C9971q.m14633g(mVar, "<this>");
        EnumC10600c i = m13443i(mVar);
        if (i == EnumC10600c.Function || i == EnumC10600c.SuspendFunction) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static final boolean m13437o(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p == null || !m13438n(p)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static final boolean m13436p(AbstractC7267g0 g0Var) {
        EnumC10600c cVar;
        C9971q.m14633g(g0Var, "<this>");
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p != null) {
            cVar = m13443i(p);
        } else {
            cVar = null;
        }
        if (cVar == EnumC10600c.Function) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static final boolean m13435q(AbstractC7267g0 g0Var) {
        EnumC10600c cVar;
        C9971q.m14633g(g0Var, "<this>");
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p != null) {
            cVar = m13443i(p);
        } else {
            cVar = null;
        }
        if (cVar == EnumC10600c.SuspendFunction) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private static final boolean m13434r(AbstractC7267g0 g0Var) {
        return g0Var.getAnnotations().mo9038c(C10434k.C10435a.f38769C) != null;
    }

    /* renamed from: s */
    public static final AbstractC11672g m13433s(AbstractC11672g gVar, AbstractC10420h builtIns, int i) {
        Map e;
        List<? extends AbstractC11666c> n0;
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(builtIns, "builtIns");
        C11137c cVar = C10434k.C10435a.f38771D;
        if (gVar.mo9037l(cVar)) {
            return gVar;
        }
        AbstractC11672g.C11673a aVar = AbstractC11672g.f26044g;
        e = C11288u.m10254e(C11098x.m10921a(C10434k.f22884k, new C13114m(i)));
        n0 = C9914r.m14751n0(gVar, new C11677j(builtIns, cVar, e));
        return aVar.m9049a(n0);
    }

    /* renamed from: t */
    public static final AbstractC11672g m13432t(AbstractC11672g gVar, AbstractC10420h builtIns) {
        Map h;
        List<? extends AbstractC11666c> n0;
        C9971q.m14633g(gVar, "<this>");
        C9971q.m14633g(builtIns, "builtIns");
        C11137c cVar = C10434k.C10435a.f38769C;
        if (gVar.mo9037l(cVar)) {
            return gVar;
        }
        AbstractC11672g.C11673a aVar = AbstractC11672g.f26044g;
        h = C11289v.m10251h();
        n0 = C9914r.m14751n0(gVar, new C11677j(builtIns, cVar, h));
        return aVar.m9049a(n0);
    }
}
