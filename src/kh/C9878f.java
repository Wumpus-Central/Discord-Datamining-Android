package kh;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import p159ih.C8544c;
import p159ih.C8568i;
import p159ih.C8581n;
import p159ih.C8593q;
import p159ih.C8600r;
import p159ih.C8603s;
import p159ih.C8611u;

/* renamed from: kh.f */
/* loaded from: classes8.dex */
public final class C9878f {
    /* renamed from: a */
    public static final C8593q m15130a(C8593q qVar, C9879g typeTable) {
        C9971q.m14633g(qVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        if (qVar.m18796k0()) {
            return qVar.m18814S();
        }
        if (qVar.m18795l0()) {
            return typeTable.m15110a(qVar.m18813T());
        }
        return null;
    }

    /* renamed from: b */
    public static final List<C8593q> m15129b(C8544c cVar, C9879g typeTable) {
        int t;
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        List<C8593q> y0 = cVar.m19351y0();
        if (!(!y0.isEmpty())) {
            y0 = null;
        }
        if (y0 == null) {
            List<Integer> contextReceiverTypeIdList = cVar.m19353x0();
            C9971q.m14634f(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            t = C9907k.m14809t(contextReceiverTypeIdList, 10);
            y0 = new ArrayList<>(t);
            for (Integer it : contextReceiverTypeIdList) {
                C9971q.m14634f(it, "it");
                y0.add(typeTable.m15110a(it.intValue()));
            }
        }
        return y0;
    }

    /* renamed from: c */
    public static final List<C8593q> m15128c(C8568i iVar, C9879g typeTable) {
        int t;
        C9971q.m14633g(iVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        List<C8593q> Z = iVar.m19120Z();
        if (!(!Z.isEmpty())) {
            Z = null;
        }
        if (Z == null) {
            List<Integer> contextReceiverTypeIdList = iVar.m19121Y();
            C9971q.m14634f(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            t = C9907k.m14809t(contextReceiverTypeIdList, 10);
            Z = new ArrayList<>(t);
            for (Integer it : contextReceiverTypeIdList) {
                C9971q.m14634f(it, "it");
                Z.add(typeTable.m15110a(it.intValue()));
            }
        }
        return Z;
    }

    /* renamed from: d */
    public static final List<C8593q> m15127d(C8581n nVar, C9879g typeTable) {
        int t;
        C9971q.m14633g(nVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        List<C8593q> Y = nVar.m18957Y();
        if (!(!Y.isEmpty())) {
            Y = null;
        }
        if (Y == null) {
            List<Integer> contextReceiverTypeIdList = nVar.m18958X();
            C9971q.m14634f(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            t = C9907k.m14809t(contextReceiverTypeIdList, 10);
            Y = new ArrayList<>(t);
            for (Integer it : contextReceiverTypeIdList) {
                C9971q.m14634f(it, "it");
                Y.add(typeTable.m15110a(it.intValue()));
            }
        }
        return Y;
    }

    /* renamed from: e */
    public static final C8593q m15126e(C8600r rVar, C9879g typeTable) {
        C9971q.m14633g(rVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        if (rVar.m18697e0()) {
            C8593q expandedType = rVar.m18707U();
            C9971q.m14634f(expandedType, "expandedType");
            return expandedType;
        } else if (rVar.m18696f0()) {
            return typeTable.m15110a(rVar.m18706V());
        } else {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
        }
    }

    /* renamed from: f */
    public static final C8593q m15125f(C8593q qVar, C9879g typeTable) {
        C9971q.m14633g(qVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        if (qVar.m18791p0()) {
            return qVar.m18804c0();
        }
        if (qVar.m18790q0()) {
            return typeTable.m15110a(qVar.m18803d0());
        }
        return null;
    }

    /* renamed from: g */
    public static final boolean m15124g(C8568i iVar) {
        C9971q.m14633g(iVar, "<this>");
        if (iVar.m19097w0() || iVar.m19096x0()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m15123h(C8581n nVar) {
        C9971q.m14633g(nVar, "<this>");
        if (nVar.m18936t0() || nVar.m18935u0()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final C8593q m15122i(C8544c cVar, C9879g typeTable) {
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        if (cVar.m19368p1()) {
            return cVar.m19430K0();
        }
        if (cVar.m19366q1()) {
            return typeTable.m15110a(cVar.m19428L0());
        }
        return null;
    }

    /* renamed from: j */
    public static final C8593q m15121j(C8593q qVar, C9879g typeTable) {
        C9971q.m14633g(qVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        if (qVar.m18788s0()) {
            return qVar.m18801f0();
        }
        if (qVar.m18787t0()) {
            return typeTable.m15110a(qVar.m18800g0());
        }
        return null;
    }

    /* renamed from: k */
    public static final C8593q m15120k(C8568i iVar, C9879g typeTable) {
        C9971q.m14633g(iVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        if (iVar.m19097w0()) {
            return iVar.m19113g0();
        }
        if (iVar.m19096x0()) {
            return typeTable.m15110a(iVar.m19112h0());
        }
        return null;
    }

    /* renamed from: l */
    public static final C8593q m15119l(C8581n nVar, C9879g typeTable) {
        C9971q.m14633g(nVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        if (nVar.m18936t0()) {
            return nVar.m18950f0();
        }
        if (nVar.m18935u0()) {
            return typeTable.m15110a(nVar.m18949g0());
        }
        return null;
    }

    /* renamed from: m */
    public static final C8593q m15118m(C8568i iVar, C9879g typeTable) {
        C9971q.m14633g(iVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        if (iVar.m19095y0()) {
            C8593q returnType = iVar.m19111i0();
            C9971q.m14634f(returnType, "returnType");
            return returnType;
        } else if (iVar.m19094z0()) {
            return typeTable.m15110a(iVar.m19110j0());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
        }
    }

    /* renamed from: n */
    public static final C8593q m15117n(C8581n nVar, C9879g typeTable) {
        C9971q.m14633g(nVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        if (nVar.m18934v0()) {
            C8593q returnType = nVar.m18948h0();
            C9971q.m14634f(returnType, "returnType");
            return returnType;
        } else if (nVar.m18933w0()) {
            return typeTable.m15110a(nVar.m18947i0());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
        }
    }

    /* renamed from: o */
    public static final List<C8593q> m15116o(C8544c cVar, C9879g typeTable) {
        int t;
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        List<C8593q> b1 = cVar.m19396b1();
        if (!(!b1.isEmpty())) {
            b1 = null;
        }
        if (b1 == null) {
            List<Integer> supertypeIdList = cVar.m19398a1();
            C9971q.m14634f(supertypeIdList, "supertypeIdList");
            t = C9907k.m14809t(supertypeIdList, 10);
            b1 = new ArrayList<>(t);
            for (Integer it : supertypeIdList) {
                C9971q.m14634f(it, "it");
                b1.add(typeTable.m15110a(it.intValue()));
            }
        }
        return b1;
    }

    /* renamed from: p */
    public static final C8593q m15115p(C8593q.C8595b bVar, C9879g typeTable) {
        C9971q.m14633g(bVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        if (bVar.m18777C()) {
            return bVar.m18763z();
        }
        if (bVar.m18776D()) {
            return typeTable.m15110a(bVar.m18779A());
        }
        return null;
    }

    /* renamed from: q */
    public static final C8593q m15114q(C8611u uVar, C9879g typeTable) {
        C9971q.m14633g(uVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        if (uVar.m18576T()) {
            C8593q type = uVar.m18582N();
            C9971q.m14634f(type, "type");
            return type;
        } else if (uVar.m18575U()) {
            return typeTable.m15110a(uVar.m18581O());
        } else {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
        }
    }

    /* renamed from: r */
    public static final C8593q m15113r(C8600r rVar, C9879g typeTable) {
        C9971q.m14633g(rVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        if (rVar.m18693i0()) {
            C8593q underlyingType = rVar.m18700b0();
            C9971q.m14634f(underlyingType, "underlyingType");
            return underlyingType;
        } else if (rVar.m18692j0()) {
            return typeTable.m15110a(rVar.m18699c0());
        } else {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
        }
    }

    /* renamed from: s */
    public static final List<C8593q> m15112s(C8603s sVar, C9879g typeTable) {
        int t;
        C9971q.m14633g(sVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        List<C8593q> T = sVar.m18649T();
        if (!(!T.isEmpty())) {
            T = null;
        }
        if (T == null) {
            List<Integer> upperBoundIdList = sVar.m18650S();
            C9971q.m14634f(upperBoundIdList, "upperBoundIdList");
            t = C9907k.m14809t(upperBoundIdList, 10);
            T = new ArrayList<>(t);
            for (Integer it : upperBoundIdList) {
                C9971q.m14634f(it, "it");
                T.add(typeTable.m15110a(it.intValue()));
            }
        }
        return T;
    }

    /* renamed from: t */
    public static final C8593q m15111t(C8611u uVar, C9879g typeTable) {
        C9971q.m14633g(uVar, "<this>");
        C9971q.m14633g(typeTable, "typeTable");
        if (uVar.m18574V()) {
            return uVar.m18580P();
        }
        if (uVar.m18573W()) {
            return typeTable.m15110a(uVar.m18579Q());
        }
        return null;
    }
}
