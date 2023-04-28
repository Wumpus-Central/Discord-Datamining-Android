package gi;

import fi.AbstractC7223a0;
import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7269h;
import fi.AbstractC7290k1;
import fi.AbstractC7304o0;
import fi.AbstractC7335v1;
import fi.C7232c1;
import fi.C7245f0;
import fi.C7270h0;
import fi.C7322s1;
import fi.C7331u1;
import fi.EnumC7338w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ki.C9883a;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9965m;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KDeclarationContainer;
import nf.C11088q;
import p182ji.AbstractC9618i;
import p182ji.EnumC9611b;
import sh.C12901c;
import th.C13121p;

/* renamed from: gi.f */
/* loaded from: classes8.dex */
public abstract class AbstractC7661f extends AbstractC7269h {

    /* renamed from: gi.f$a */
    /* loaded from: classes8.dex */
    public static final class C7662a extends AbstractC7661f {

        /* renamed from: a */
        public static final C7662a f16660a = new C7662a();

        private C7662a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gi.f$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C7663b extends C9965m implements Function1<AbstractC9618i, AbstractC7335v1> {
        C7663b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "prepareType";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(AbstractC7661f.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        /* renamed from: i */
        public final AbstractC7335v1 invoke(AbstractC9618i p0) {
            C9971q.m14633g(p0, "p0");
            return ((AbstractC7661f) this.receiver).mo21705a(p0);
        }
    }

    /* renamed from: c */
    private final AbstractC7304o0 m21703c(AbstractC7304o0 o0Var) {
        int t;
        int t2;
        List i;
        int t3;
        AbstractC7267g0 type;
        AbstractC7268g1 N0 = o0Var.mo5172N0();
        boolean z = true;
        boolean z2 = false;
        C7245f0 f0Var = null;
        r5 = null;
        AbstractC7335v1 v1Var = null;
        AbstractC7267g0 g0Var = null;
        if (N0 instanceof C12901c) {
            C12901c cVar = (C12901c) N0;
            AbstractC7290k1 b = cVar.mo5160b();
            if (b.mo22906b() != EnumC7338w1.IN_VARIANCE) {
                z = false;
            }
            if (!z) {
                b = null;
            }
            if (!(b == null || (type = b.getType()) == null)) {
                v1Var = type.mo22868Q0();
            }
            if (cVar.m5158d() == null) {
                AbstractC7290k1 b2 = cVar.mo5160b();
                Collection<AbstractC7267g0> m = cVar.mo4568m();
                t3 = C9907k.m14809t(m, 10);
                ArrayList arrayList = new ArrayList(t3);
                for (AbstractC7267g0 g0Var2 : m) {
                    arrayList.add(g0Var2.mo22868Q0());
                }
                cVar.m5156f(new C7668j(b2, arrayList, null, 4, null));
            }
            EnumC9611b bVar = EnumC9611b.FOR_SUBTYPING;
            C7668j d = cVar.m5158d();
            C9971q.m14636d(d);
            return new C7667i(bVar, d, v1Var, o0Var.mo5173M0(), o0Var.mo5171O0(), false, 32, null);
        } else if (N0 instanceof C13121p) {
            Collection<AbstractC7267g0> m2 = ((C13121p) N0).mo4568m();
            t2 = C9907k.m14809t(m2, 10);
            ArrayList arrayList2 = new ArrayList(t2);
            for (AbstractC7267g0 g0Var3 : m2) {
                AbstractC7267g0 p = C7322s1.m22931p(g0Var3, o0Var.mo5171O0());
                C9971q.m14634f(p, "makeNullableAsSpecified(it, type.isMarkedNullable)");
                arrayList2.add(p);
            }
            C7245f0 f0Var2 = new C7245f0(arrayList2);
            C7232c1 M0 = o0Var.mo5173M0();
            i = C9906j.m14820i();
            return C7270h0.m23049k(M0, f0Var2, i, false, o0Var.mo5161o());
        } else if (!(N0 instanceof C7245f0) || !o0Var.mo5171O0()) {
            return o0Var;
        } else {
            C7245f0 f0Var3 = (C7245f0) N0;
            Collection<AbstractC7267g0> m3 = f0Var3.mo4568m();
            t = C9907k.m14809t(m3, 10);
            ArrayList arrayList3 = new ArrayList(t);
            for (AbstractC7267g0 g0Var4 : m3) {
                arrayList3.add(C9883a.m15084u(g0Var4));
                z2 = true;
            }
            if (z2) {
                AbstractC7267g0 e = f0Var3.m23107e();
                if (e != null) {
                    g0Var = C9883a.m15084u(e);
                }
                f0Var = new C7245f0(arrayList3).m23103i(g0Var);
            }
            if (f0Var != null) {
                f0Var3 = f0Var;
            }
            return f0Var3.m23108d();
        }
    }

    /* renamed from: b */
    public AbstractC7335v1 mo21705a(AbstractC9618i type) {
        AbstractC7335v1 v1Var;
        C9971q.m14633g(type, "type");
        if (type instanceof AbstractC7267g0) {
            AbstractC7335v1 Q0 = ((AbstractC7267g0) type).mo22868Q0();
            if (Q0 instanceof AbstractC7304o0) {
                v1Var = m21703c((AbstractC7304o0) Q0);
            } else if (Q0 instanceof AbstractC7223a0) {
                AbstractC7223a0 a0Var = (AbstractC7223a0) Q0;
                AbstractC7304o0 c = m21703c(a0Var.m23170V0());
                AbstractC7304o0 c2 = m21703c(a0Var.m23169W0());
                if (c == a0Var.m23170V0() && c2 == a0Var.m23169W0()) {
                    v1Var = Q0;
                } else {
                    v1Var = C7270h0.m23056d(c, c2);
                }
            } else {
                throw new C11088q();
            }
            return C7331u1.m22899c(v1Var, Q0, new C7663b(this));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
