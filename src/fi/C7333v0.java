package fi;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p217lg.AbstractC10420h;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11330i;
import p268og.AbstractC11346m;
import p268og.AbstractC11397y;
import p388vh.C13508c;

/* renamed from: fi.v0 */
/* loaded from: classes8.dex */
public final class C7333v0 {

    /* renamed from: fi.v0$a */
    /* loaded from: classes8.dex */
    public static final class C7334a extends AbstractC7275h1 {

        /* renamed from: d */
        final /* synthetic */ List<AbstractC7268g1> f15818d;

        /* JADX WARN: Multi-variable type inference failed */
        C7334a(List<? extends AbstractC7268g1> list) {
            this.f15818d = list;
        }

        @Override // fi.AbstractC7275h1
        /* renamed from: k */
        public AbstractC7290k1 mo13138k(AbstractC7268g1 key) {
            C9971q.m14633g(key, "key");
            if (!this.f15818d.contains(key)) {
                return null;
            }
            AbstractC11326h p = key.mo4565p();
            C9971q.m14635e(p, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return C7322s1.m22928s((AbstractC11319f1) p);
        }
    }

    /* renamed from: a */
    private static final AbstractC7267g0 m22892a(List<? extends AbstractC7268g1> list, List<? extends AbstractC7267g0> list2, AbstractC10420h hVar) {
        Object U;
        C7309p1 g = C7309p1.m22979g(new C7334a(list));
        U = C9914r.m14770U(list2);
        AbstractC7267g0 p = g.m22970p((AbstractC7267g0) U, EnumC7338w1.OUT_VARIANCE);
        if (p == null) {
            p = hVar.m13356y();
        }
        C9971q.m14634f(p, "typeParameters: List<Typ… ?: builtIns.defaultBound");
        return p;
    }

    /* renamed from: b */
    public static final AbstractC7267g0 m22891b(AbstractC11319f1 f1Var) {
        int t;
        int t2;
        C9971q.m14633g(f1Var, "<this>");
        AbstractC11346m b = f1Var.mo6104b();
        C9971q.m14634f(b, "this.containingDeclaration");
        if (b instanceof AbstractC11330i) {
            List<AbstractC11319f1> parameters = ((AbstractC11330i) b).mo6111k().getParameters();
            C9971q.m14634f(parameters, "descriptor.typeConstructor.parameters");
            t2 = C9907k.m14809t(parameters, 10);
            ArrayList arrayList = new ArrayList(t2);
            for (AbstractC11319f1 f1Var2 : parameters) {
                AbstractC7268g1 k = f1Var2.mo6111k();
                C9971q.m14634f(k, "it.typeConstructor");
                arrayList.add(k);
            }
            List<AbstractC7267g0> upperBounds = f1Var.getUpperBounds();
            C9971q.m14634f(upperBounds, "upperBounds");
            return m22892a(arrayList, upperBounds, C13508c.m3531j(f1Var));
        } else if (b instanceof AbstractC11397y) {
            List<AbstractC11319f1> typeParameters = ((AbstractC11397y) b).getTypeParameters();
            C9971q.m14634f(typeParameters, "descriptor.typeParameters");
            t = C9907k.m14809t(typeParameters, 10);
            ArrayList arrayList2 = new ArrayList(t);
            for (AbstractC11319f1 f1Var3 : typeParameters) {
                AbstractC7268g1 k2 = f1Var3.mo6111k();
                C9971q.m14634f(k2, "it.typeConstructor");
                arrayList2.add(k2);
            }
            List<AbstractC7267g0> upperBounds2 = f1Var.getUpperBounds();
            C9971q.m14634f(upperBounds2, "upperBounds");
            return m22892a(arrayList2, upperBounds2, C13508c.m3531j(f1Var));
        } else {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
    }
}
