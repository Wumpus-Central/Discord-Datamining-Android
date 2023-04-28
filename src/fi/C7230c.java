package fi;

import fi.C7250f1;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p182ji.AbstractC9613d;
import p182ji.AbstractC9618i;
import p182ji.AbstractC9620k;
import p182ji.AbstractC9623n;
import p182ji.AbstractC9625p;

/* renamed from: fi.c */
/* loaded from: classes8.dex */
public final class C7230c {

    /* renamed from: a */
    public static final C7230c f15668a = new C7230c();

    private C7230c() {
    }

    /* renamed from: c */
    private final boolean m23162c(C7250f1 f1Var, AbstractC9620k kVar, AbstractC9623n nVar) {
        AbstractC9625p j = f1Var.m23091j();
        if (j.mo5901p(kVar)) {
            return true;
        }
        if (j.mo5880z0(kVar)) {
            return false;
        }
        if (!f1Var.m23087n() || !j.mo5913j(kVar)) {
            return j.mo5903o(j.mo5931a(kVar), nVar);
        }
        return true;
    }

    /* renamed from: e */
    private final boolean m23160e(C7250f1 f1Var, AbstractC9620k kVar, AbstractC9620k kVar2) {
        AbstractC9625p j = f1Var.m23091j();
        if (C7241f.f15682b) {
            if (!j.mo5919g(kVar) && !j.mo5886w0(j.mo5931a(kVar))) {
                f1Var.m23089l(kVar);
            }
            if (!j.mo5919g(kVar2)) {
                f1Var.m23089l(kVar2);
            }
        }
        if (j.mo5880z0(kVar2) || j.mo5944N(kVar) || j.mo5882y0(kVar)) {
            return true;
        }
        if ((kVar instanceof AbstractC9613d) && j.mo5904n0((AbstractC9613d) kVar)) {
            return true;
        }
        C7230c cVar = f15668a;
        if (cVar.m23164a(f1Var, kVar, C7250f1.AbstractC7253c.C7255b.f15715a)) {
            return true;
        }
        if (!j.mo5944N(kVar2) && !cVar.m23164a(f1Var, kVar2, C7250f1.AbstractC7253c.C7256d.f15717a) && !j.mo5914i0(kVar)) {
            return cVar.m23163b(f1Var, kVar, j.mo5931a(kVar2));
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m23164a(C7250f1 f1Var, AbstractC9620k type, C7250f1.AbstractC7253c supertypesPolicy) {
        boolean z;
        String e0;
        C7250f1.AbstractC7253c cVar;
        boolean z2;
        C9971q.m14633g(f1Var, "<this>");
        C9971q.m14633g(type, "type");
        C9971q.m14633g(supertypesPolicy, "supertypesPolicy");
        AbstractC9625p j = f1Var.m23091j();
        if ((!j.mo5914i0(type) || j.mo5880z0(type)) && !j.mo5944N(type)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            f1Var.m23090k();
            ArrayDeque<AbstractC9620k> h = f1Var.m23093h();
            C9971q.m14636d(h);
            Set<AbstractC9620k> i = f1Var.m23092i();
            C9971q.m14636d(i);
            h.push(type);
            while (!h.isEmpty()) {
                if (i.size() <= 1000) {
                    AbstractC9620k current = h.pop();
                    C9971q.m14634f(current, "current");
                    if (i.add(current)) {
                        if (j.mo5880z0(current)) {
                            cVar = C7250f1.AbstractC7253c.C0224c.f15716a;
                        } else {
                            cVar = supertypesPolicy;
                        }
                        if (!(!C9971q.m14638b(cVar, C7250f1.AbstractC7253c.C0224c.f15716a))) {
                            cVar = null;
                        }
                        if (cVar == null) {
                            continue;
                        } else {
                            AbstractC9625p j2 = f1Var.m23091j();
                            for (AbstractC9618i iVar : j2.mo5906m0(j2.mo5931a(current))) {
                                AbstractC9620k a = cVar.mo21709a(f1Var, iVar);
                                if ((!j.mo5914i0(a) || j.mo5880z0(a)) && !j.mo5944N(a)) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    f1Var.m23095e();
                                } else {
                                    h.add(a);
                                }
                            }
                            continue;
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Too many supertypes for type: ");
                    sb2.append(type);
                    sb2.append(". Supertypes = ");
                    e0 = C9914r.m14760e0(i, null, null, null, 0, null, null, 63, null);
                    sb2.append(e0);
                    throw new IllegalStateException(sb2.toString().toString());
                }
            }
            f1Var.m23095e();
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m23163b(C7250f1 state, AbstractC9620k start, AbstractC9623n end) {
        String e0;
        C7250f1.AbstractC7253c cVar;
        C9971q.m14633g(state, "state");
        C9971q.m14633g(start, "start");
        C9971q.m14633g(end, "end");
        AbstractC9625p j = state.m23091j();
        if (f15668a.m23162c(state, start, end)) {
            return true;
        }
        state.m23090k();
        ArrayDeque<AbstractC9620k> h = state.m23093h();
        C9971q.m14636d(h);
        Set<AbstractC9620k> i = state.m23092i();
        C9971q.m14636d(i);
        h.push(start);
        while (!h.isEmpty()) {
            if (i.size() <= 1000) {
                AbstractC9620k current = h.pop();
                C9971q.m14634f(current, "current");
                if (i.add(current)) {
                    if (j.mo5880z0(current)) {
                        cVar = C7250f1.AbstractC7253c.C0224c.f15716a;
                    } else {
                        cVar = C7250f1.AbstractC7253c.C7255b.f15715a;
                    }
                    if (!(!C9971q.m14638b(cVar, C7250f1.AbstractC7253c.C0224c.f15716a))) {
                        cVar = null;
                    }
                    if (cVar == null) {
                        continue;
                    } else {
                        AbstractC9625p j2 = state.m23091j();
                        for (AbstractC9618i iVar : j2.mo5906m0(j2.mo5931a(current))) {
                            AbstractC9620k a = cVar.mo21709a(state, iVar);
                            if (f15668a.m23162c(state, a, end)) {
                                state.m23095e();
                                return true;
                            }
                            h.add(a);
                        }
                        continue;
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Too many supertypes for type: ");
                sb2.append(start);
                sb2.append(". Supertypes = ");
                e0 = C9914r.m14760e0(i, null, null, null, 0, null, null, 63, null);
                sb2.append(e0);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        state.m23095e();
        return false;
    }

    /* renamed from: d */
    public final boolean m23161d(C7250f1 state, AbstractC9620k subType, AbstractC9620k superType) {
        C9971q.m14633g(state, "state");
        C9971q.m14633g(subType, "subType");
        C9971q.m14633g(superType, "superType");
        return m23160e(state, subType, superType);
    }
}
