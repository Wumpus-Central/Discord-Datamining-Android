package p427xg;

import fi.AbstractC7267g0;
import gh.AbstractC7625m;
import gh.C7648w;
import java.util.List;
import ki.C9883a;
import kotlin.Pair;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217lg.AbstractC10420h;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11301b;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.AbstractC11335j1;
import p268og.AbstractC11346m;
import p268og.AbstractC11397y;
import p325rh.AbstractC12662f;
import p388vh.C13508c;
import p427xg.C14132i0;
import p467zg.AbstractC14648c;
import p467zg.C14650e;

/* renamed from: xg.t */
/* loaded from: classes8.dex */
public final class C14155t implements AbstractC12662f {

    /* renamed from: a */
    public static final C14156a f31963a = new C14156a(null);

    /* renamed from: xg.t$a */
    /* loaded from: classes8.dex */
    public static final class C14156a {
        private C14156a() {
        }

        public /* synthetic */ C14156a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final boolean m1500b(AbstractC11397y yVar) {
            AbstractC11313e eVar;
            Object r0;
            if (yVar.mo6242i().size() != 1) {
                return false;
            }
            AbstractC11346m b = yVar.mo6104b();
            AbstractC11313e eVar2 = null;
            if (b instanceof AbstractC11313e) {
                eVar = (AbstractC11313e) b;
            } else {
                eVar = null;
            }
            if (eVar == null) {
                return false;
            }
            List<AbstractC11335j1> i = yVar.mo6242i();
            C9971q.m14634f(i, "f.valueParameters");
            r0 = C9914r.m14747r0(i);
            AbstractC11326h p = ((AbstractC11335j1) r0).getType().mo5172N0().mo4565p();
            if (p instanceof AbstractC11313e) {
                eVar2 = (AbstractC11313e) p;
            }
            if (eVar2 != null && AbstractC10420h.m13370q0(eVar) && C9971q.m14638b(C13508c.m3529l(eVar), C13508c.m3529l(eVar2))) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private final AbstractC7625m m1499c(AbstractC11397y yVar, AbstractC11335j1 j1Var) {
            if (C7648w.m21801e(yVar) || m1500b(yVar)) {
                AbstractC7267g0 type = j1Var.getType();
                C9971q.m14634f(type, "valueParameterDescriptor.type");
                return C7648w.m21799g(C9883a.m15084u(type));
            }
            AbstractC7267g0 type2 = j1Var.getType();
            C9971q.m14634f(type2, "valueParameterDescriptor.type");
            return C7648w.m21799g(type2);
        }

        /* renamed from: a */
        public final boolean m1501a(AbstractC11297a superDescriptor, AbstractC11297a subDescriptor) {
            List<Pair> K0;
            C9971q.m14633g(superDescriptor, "superDescriptor");
            C9971q.m14633g(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof C14650e) && (superDescriptor instanceof AbstractC11397y)) {
                C14650e eVar = (C14650e) subDescriptor;
                eVar.mo6242i().size();
                AbstractC11397y yVar = (AbstractC11397y) superDescriptor;
                yVar.mo6242i().size();
                List<AbstractC11335j1> i = eVar.mo6162a().mo6242i();
                C9971q.m14634f(i, "subDescriptor.original.valueParameters");
                List<AbstractC11335j1> i2 = yVar.mo6162a().mo6242i();
                C9971q.m14634f(i2, "superDescriptor.original.valueParameters");
                K0 = C9914r.m14781K0(i, i2);
                for (Pair pair : K0) {
                    AbstractC11335j1 subParameter = (AbstractC11335j1) pair.m15067a();
                    AbstractC11335j1 superParameter = (AbstractC11335j1) pair.m15066b();
                    C9971q.m14634f(subParameter, "subParameter");
                    boolean z = m1499c((AbstractC11397y) subDescriptor, subParameter) instanceof AbstractC7625m.C7629d;
                    C9971q.m14634f(superParameter, "superParameter");
                    if (z != (m1499c(yVar, superParameter) instanceof AbstractC7625m.C7629d)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    private final boolean m1502c(AbstractC11297a aVar, AbstractC11297a aVar2, AbstractC11313e eVar) {
        AbstractC11397y yVar;
        boolean z;
        if ((aVar instanceof AbstractC11301b) && (aVar2 instanceof AbstractC11397y) && !AbstractC10420h.m13391f0(aVar2)) {
            C14118f fVar = C14118f.f31900n;
            AbstractC11397y yVar2 = (AbstractC11397y) aVar2;
            C11142f name = yVar2.getName();
            C9971q.m14634f(name, "subDescriptor.name");
            if (!fVar.m1602l(name)) {
                C14132i0.C14133a aVar3 = C14132i0.f31919a;
                C11142f name2 = yVar2.getName();
                C9971q.m14634f(name2, "subDescriptor.name");
                if (!aVar3.m1547k(name2)) {
                    return false;
                }
            }
            AbstractC11301b e = C14126h0.m1576e((AbstractC11301b) aVar);
            boolean z2 = aVar instanceof AbstractC11397y;
            if (z2) {
                yVar = (AbstractC11397y) aVar;
            } else {
                yVar = null;
            }
            if (yVar == null || yVar2.mo6273A0() != yVar.mo6273A0()) {
                z = false;
            } else {
                z = true;
            }
            if ((!z) && (e == null || !yVar2.mo6273A0())) {
                return true;
            }
            if ((eVar instanceof AbstractC14648c) && yVar2.mo6239p0() == null && e != null && !C14126h0.m1575f(eVar, e)) {
                if ((e instanceof AbstractC11397y) && z2 && C14118f.m1603k((AbstractC11397y) e) != null) {
                    String c = C7648w.m21803c(yVar2, false, false, 2, null);
                    AbstractC11397y a = ((AbstractC11397y) aVar).mo6162a();
                    C9971q.m14634f(a, "superDescriptor.original");
                    if (C9971q.m14638b(c, C7648w.m21803c(a, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p325rh.AbstractC12662f
    /* renamed from: a */
    public AbstractC12662f.EnumC12664b mo1504a(AbstractC11297a superDescriptor, AbstractC11297a subDescriptor, AbstractC11313e eVar) {
        C9971q.m14633g(superDescriptor, "superDescriptor");
        C9971q.m14633g(subDescriptor, "subDescriptor");
        if (m1502c(superDescriptor, subDescriptor, eVar)) {
            return AbstractC12662f.EnumC12664b.INCOMPATIBLE;
        }
        if (f31963a.m1501a(superDescriptor, subDescriptor)) {
            return AbstractC12662f.EnumC12664b.INCOMPATIBLE;
        }
        return AbstractC12662f.EnumC12664b.UNKNOWN;
    }

    @Override // p325rh.AbstractC12662f
    /* renamed from: b */
    public AbstractC12662f.EnumC12663a mo1503b() {
        return AbstractC12662f.EnumC12663a.CONFLICTS_ONLY;
    }
}
