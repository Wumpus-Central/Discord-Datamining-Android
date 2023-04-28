package p427xg;

import ch.C4013g;
import ch.C4016h;
import fi.AbstractC7267g0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import p268og.AbstractC11297a;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11335j1;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.AbstractC11404z0;
import p306qi.C12200o;
import p325rh.AbstractC12662f;
import p325rh.C12669k;
import p467zg.C14650e;

/* renamed from: xg.l */
/* loaded from: classes8.dex */
public final class C14140l implements AbstractC12662f {

    /* renamed from: xg.l$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C14141a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31947a;

        static {
            int[] iArr = new int[C12669k.C12678i.EnumC12679a.values().length];
            try {
                iArr[C12669k.C12678i.EnumC12679a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f31947a = iArr;
        }
    }

    /* renamed from: xg.l$b */
    /* loaded from: classes8.dex */
    static final class C14142b extends AbstractC9973s implements Function1<AbstractC11335j1, AbstractC7267g0> {

        /* renamed from: k */
        public static final C14142b f31948k = new C14142b();

        C14142b() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke(AbstractC11335j1 j1Var) {
            return j1Var.getType();
        }
    }

    @Override // p325rh.AbstractC12662f
    /* renamed from: a */
    public AbstractC12662f.EnumC12664b mo1504a(AbstractC11297a superDescriptor, AbstractC11297a subDescriptor, AbstractC11313e eVar) {
        List<AbstractC11319f1> typeParameters;
        C12669k.C12678i.EnumC12679a aVar;
        Sequence K;
        Sequence y;
        Sequence B;
        AbstractC7267g0 g0Var;
        List m;
        Sequence A;
        boolean z;
        List<AbstractC11319f1> typeParameters2;
        List<AbstractC11319f1> i;
        boolean z2;
        C9971q.m14633g(superDescriptor, "superDescriptor");
        C9971q.m14633g(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof C14650e) {
            C14650e eVar2 = (C14650e) subDescriptor;
            C9971q.m14634f(eVar2.getTypeParameters(), "subDescriptor.typeParameters");
            if (!(!typeParameters.isEmpty())) {
                C12669k.C12678i w = C12669k.m5983w(superDescriptor, subDescriptor);
                if (w != null) {
                    aVar = w.m5969c();
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    return AbstractC12662f.EnumC12664b.UNKNOWN;
                }
                List<AbstractC11335j1> i2 = eVar2.mo6242i();
                C9971q.m14634f(i2, "subDescriptor.valueParameters");
                K = C9914r.m14782K(i2);
                y = C12200o.m7420y(K, C14142b.f31948k);
                AbstractC7267g0 returnType = eVar2.getReturnType();
                C9971q.m14636d(returnType);
                B = C12200o.m7439B(y, returnType);
                AbstractC11396x0 M = eVar2.mo6264M();
                if (M != null) {
                    g0Var = M.getType();
                } else {
                    g0Var = null;
                }
                m = C9906j.m14816m(g0Var);
                A = C12200o.m7440A(B, m);
                Iterator it = A.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    AbstractC7267g0 g0Var2 = (AbstractC7267g0) it.next();
                    if (!(!g0Var2.mo5174L0().isEmpty()) || (g0Var2.mo22868Q0() instanceof C4016h)) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return AbstractC12662f.EnumC12664b.UNKNOWN;
                }
                AbstractC11297a c = superDescriptor.mo6167c(new C4013g(null, 1, null).m23003c());
                if (c == null) {
                    return AbstractC12662f.EnumC12664b.UNKNOWN;
                }
                if (c instanceof AbstractC11404z0) {
                    AbstractC11404z0 z0Var = (AbstractC11404z0) c;
                    C9971q.m14634f(z0Var.getTypeParameters(), "erasedSuper.typeParameters");
                    if (!typeParameters2.isEmpty()) {
                        AbstractC11397y.AbstractC11398a<? extends AbstractC11404z0> u = z0Var.mo6238u();
                        i = C9906j.m14820i();
                        c = u.mo6200m(i).build();
                        C9971q.m14636d(c);
                    }
                }
                C12669k.C12678i.EnumC12679a c2 = C12669k.f28507f.m6012F(c, subDescriptor, false).m5969c();
                C9971q.m14634f(c2, "DEFAULT.isOverridableByW…Descriptor, false).result");
                if (C14141a.f31947a[c2.ordinal()] == 1) {
                    return AbstractC12662f.EnumC12664b.OVERRIDABLE;
                }
                return AbstractC12662f.EnumC12664b.UNKNOWN;
            }
        }
        return AbstractC12662f.EnumC12664b.UNKNOWN;
    }

    @Override // p325rh.AbstractC12662f
    /* renamed from: b */
    public AbstractC12662f.EnumC12663a mo1503b() {
        return AbstractC12662f.EnumC12663a.SUCCESS_ONLY;
    }
}
