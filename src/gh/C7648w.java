package gh;

import fi.AbstractC7267g0;
import gh.AbstractC7625m;
import java.util.List;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import ng.C11105c;
import p217lg.C10434k;
import p249nh.C11136b;
import p249nh.C11138d;
import p268og.AbstractC11297a;
import p268og.AbstractC11301b;
import p268og.AbstractC11313e;
import p268og.AbstractC11335j1;
import p268og.AbstractC11343l;
import p268og.AbstractC11346m;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.AbstractC11404z0;
import p325rh.C12661e;
import p388vh.C13508c;
import p407wh.C13885d;
import p407wh.EnumC13886e;
import p427xg.C14118f;
import p427xg.C14126h0;

/* renamed from: gh.w */
/* loaded from: classes8.dex */
public final class C7648w {
    /* renamed from: a */
    private static final void m21805a(StringBuilder sb2, AbstractC7267g0 g0Var) {
        sb2.append(m21799g(g0Var));
    }

    /* renamed from: b */
    public static final String m21804b(AbstractC11397y yVar, boolean z, boolean z2) {
        String str;
        C9971q.m14633g(yVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z2) {
            if (yVar instanceof AbstractC11343l) {
                str = "<init>";
            } else {
                str = yVar.getName().m10771b();
                C9971q.m14634f(str, "name.asString()");
            }
            sb2.append(str);
        }
        sb2.append("(");
        AbstractC11396x0 M = yVar.mo6264M();
        if (M != null) {
            AbstractC7267g0 type = M.getType();
            C9971q.m14634f(type, "it.type");
            m21805a(sb2, type);
        }
        for (AbstractC11335j1 j1Var : yVar.mo6242i()) {
            AbstractC7267g0 type2 = j1Var.getType();
            C9971q.m14634f(type2, "parameter.type");
            m21805a(sb2, type2);
        }
        sb2.append(")");
        if (z) {
            if (C7613e.m21885c(yVar)) {
                sb2.append("V");
            } else {
                AbstractC7267g0 returnType = yVar.getReturnType();
                C9971q.m14636d(returnType);
                m21805a(sb2, returnType);
            }
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: c */
    public static /* synthetic */ String m21803c(AbstractC11397y yVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m21804b(yVar, z, z2);
    }

    /* renamed from: d */
    public static final String m21802d(AbstractC11297a aVar) {
        AbstractC11313e eVar;
        AbstractC11404z0 z0Var;
        C9971q.m14633g(aVar, "<this>");
        C7651y yVar = C7651y.f16655a;
        if (C12661e.m6062E(aVar)) {
            return null;
        }
        AbstractC11346m b = aVar.mo6104b();
        if (b instanceof AbstractC11313e) {
            eVar = (AbstractC11313e) b;
        } else {
            eVar = null;
        }
        if (eVar == null || eVar.getName().m10766g()) {
            return null;
        }
        AbstractC11297a a = aVar.mo6162a();
        if (a instanceof AbstractC11404z0) {
            z0Var = (AbstractC11404z0) a;
        } else {
            z0Var = null;
        }
        if (z0Var == null) {
            return null;
        }
        return C7647v.m21806a(yVar, eVar, m21803c(z0Var, false, false, 3, null));
    }

    /* renamed from: e */
    public static final boolean m21801e(AbstractC11297a f) {
        Object r0;
        AbstractC7625m.C7629d dVar;
        AbstractC11397y k;
        Object r02;
        C9971q.m14633g(f, "f");
        if (!(f instanceof AbstractC11397y)) {
            return false;
        }
        AbstractC11397y yVar = (AbstractC11397y) f;
        if (!C9971q.m14638b(yVar.getName().m10771b(), "remove") || yVar.mo6242i().size() != 1 || C14126h0.m1573h((AbstractC11301b) f)) {
            return false;
        }
        List<AbstractC11335j1> i = yVar.mo6162a().mo6242i();
        C9971q.m14634f(i, "f.original.valueParameters");
        r0 = C9914r.m14747r0(i);
        AbstractC7267g0 type = ((AbstractC11335j1) r0).getType();
        C9971q.m14634f(type, "f.original.valueParameters.single().type");
        AbstractC7625m g = m21799g(type);
        EnumC13886e eVar = null;
        if (g instanceof AbstractC7625m.C7629d) {
            dVar = (AbstractC7625m.C7629d) g;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            eVar = dVar.m21835i();
        }
        if (eVar != EnumC13886e.INT || (k = C14118f.m1603k(yVar)) == null) {
            return false;
        }
        List<AbstractC11335j1> i2 = k.mo6162a().mo6242i();
        C9971q.m14634f(i2, "overridden.original.valueParameters");
        r02 = C9914r.m14747r0(i2);
        AbstractC7267g0 type2 = ((AbstractC11335j1) r02).getType();
        C9971q.m14634f(type2, "overridden.original.valueParameters.single().type");
        AbstractC7625m g2 = m21799g(type2);
        AbstractC11346m b = k.mo6104b();
        C9971q.m14634f(b, "overridden.containingDeclaration");
        if (!C9971q.m14638b(C13508c.m3528m(b), C10434k.C10435a.f22905c0.m10795j()) || !(g2 instanceof AbstractC7625m.C7628c) || !C9971q.m14638b(((AbstractC7625m.C7628c) g2).m21836i(), "java/lang/Object")) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final String m21800f(AbstractC11313e eVar) {
        C9971q.m14633g(eVar, "<this>");
        C11105c cVar = C11105c.f24626a;
        C11138d j = C13508c.m3529l(eVar).m10795j();
        C9971q.m14634f(j, "fqNameSafe.toUnsafe()");
        C11136b n = cVar.m10896n(j);
        if (n == null) {
            return C7613e.m21886b(eVar, null, 2, null);
        }
        String f = C13885d.m2401b(n).m2397f();
        C9971q.m14634f(f, "byClassId(it).internalName");
        return f;
    }

    /* renamed from: g */
    public static final AbstractC7625m m21799g(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        return (AbstractC7625m) C7613e.m21883e(g0Var, C7631o.f16642a, C7604b0.f16568o, C7599a0.f16555a, null, null, 32, null);
    }
}
