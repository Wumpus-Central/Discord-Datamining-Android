package p268og;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7290k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import p142hi.C8039k;
import p306qi.C12200o;
import p325rh.C12661e;
import p388vh.C13508c;

/* renamed from: og.g1 */
/* loaded from: classes8.dex */
public final class C11322g1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: og.g1$a */
    /* loaded from: classes8.dex */
    public static final class C11323a extends AbstractC9973s implements Function1<AbstractC11346m, Boolean> {

        /* renamed from: k */
        public static final C11323a f25257k = new C11323a();

        C11323a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC11346m it) {
            C9971q.m14633g(it, "it");
            return Boolean.valueOf(it instanceof AbstractC11297a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: og.g1$b */
    /* loaded from: classes8.dex */
    public static final class C11324b extends AbstractC9973s implements Function1<AbstractC11346m, Boolean> {

        /* renamed from: k */
        public static final C11324b f25258k = new C11324b();

        C11324b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC11346m it) {
            C9971q.m14633g(it, "it");
            return Boolean.valueOf(!(it instanceof AbstractC11343l));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: og.g1$c */
    /* loaded from: classes8.dex */
    public static final class C11325c extends AbstractC9973s implements Function1<AbstractC11346m, Sequence<? extends AbstractC11319f1>> {

        /* renamed from: k */
        public static final C11325c f25259k = new C11325c();

        C11325c() {
            super(1);
        }

        /* renamed from: a */
        public final Sequence<AbstractC11319f1> invoke(AbstractC11346m it) {
            Sequence<AbstractC11319f1> K;
            C9971q.m14633g(it, "it");
            List<AbstractC11319f1> typeParameters = ((AbstractC11297a) it).getTypeParameters();
            C9971q.m14634f(typeParameters, "it as CallableDescriptor).typeParameters");
            K = C9914r.m14782K(typeParameters);
            return K;
        }
    }

    /* renamed from: a */
    public static final C11372s0 m10212a(AbstractC7267g0 g0Var) {
        AbstractC11330i iVar;
        C9971q.m14633g(g0Var, "<this>");
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p instanceof AbstractC11330i) {
            iVar = (AbstractC11330i) p;
        } else {
            iVar = null;
        }
        return m10211b(g0Var, iVar, 0);
    }

    /* renamed from: b */
    private static final C11372s0 m10211b(AbstractC7267g0 g0Var, AbstractC11330i iVar, int i) {
        AbstractC11330i iVar2 = null;
        if (iVar == null || C8039k.m20765m(iVar)) {
            return null;
        }
        int size = iVar.mo6109r().size() + i;
        if (!iVar.mo6106y()) {
            if (size != g0Var.mo5174L0().size()) {
                C12661e.m6062E(iVar);
            }
            return new C11372s0(iVar, g0Var.mo5174L0().subList(i, g0Var.mo5174L0().size()), null);
        }
        List<AbstractC7290k1> subList = g0Var.mo5174L0().subList(i, size);
        AbstractC11346m b = iVar.mo6104b();
        if (b instanceof AbstractC11330i) {
            iVar2 = (AbstractC11330i) b;
        }
        return new C11372s0(iVar, subList, m10211b(g0Var, iVar2, size));
    }

    /* renamed from: c */
    private static final C11306c m10210c(AbstractC11319f1 f1Var, AbstractC11346m mVar, int i) {
        return new C11306c(f1Var, mVar, i);
    }

    /* renamed from: d */
    public static final List<AbstractC11319f1> m10209d(AbstractC11330i iVar) {
        Sequence C;
        Sequence p;
        Sequence t;
        List E;
        List<AbstractC11319f1> list;
        AbstractC11346m mVar;
        List<AbstractC11319f1> o0;
        int t2;
        List<AbstractC11319f1> o02;
        AbstractC7268g1 k;
        C9971q.m14633g(iVar, "<this>");
        List<AbstractC11319f1> declaredTypeParameters = iVar.mo6109r();
        C9971q.m14634f(declaredTypeParameters, "declaredTypeParameters");
        if (!(iVar.mo6106y() || (iVar.mo6104b() instanceof AbstractC11297a))) {
            return declaredTypeParameters;
        }
        C = C12200o.m7438C(C13508c.m3524q(iVar), C11323a.f25257k);
        p = C12200o.m7429p(C, C11324b.f25258k);
        t = C12200o.m7425t(p, C11325c.f25259k);
        E = C12200o.m7436E(t);
        Iterator<AbstractC11346m> it = C13508c.m3524q(iVar).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                mVar = null;
                break;
            }
            mVar = it.next();
            if (mVar instanceof AbstractC11313e) {
                break;
            }
        }
        AbstractC11313e eVar = (AbstractC11313e) mVar;
        if (!(eVar == null || (k = eVar.mo6111k()) == null)) {
            list = k.getParameters();
        }
        if (list == null) {
            list = C9906j.m14820i();
        }
        if (!E.isEmpty() || !list.isEmpty()) {
            o0 = C9914r.m14750o0(E, list);
            t2 = C9907k.m14809t(o0, 10);
            ArrayList arrayList = new ArrayList(t2);
            for (AbstractC11319f1 it2 : o0) {
                C9971q.m14634f(it2, "it");
                arrayList.add(m10210c(it2, iVar, declaredTypeParameters.size()));
            }
            o02 = C9914r.m14750o0(declaredTypeParameters, arrayList);
            return o02;
        }
        List<AbstractC11319f1> declaredTypeParameters2 = iVar.mo6109r();
        C9971q.m14634f(declaredTypeParameters2, "declaredTypeParameters");
        return declaredTypeParameters2;
    }
}
