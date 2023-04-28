package gi;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7275h1;
import fi.AbstractC7290k1;
import fi.C7322s1;
import fi.EnumC7338w1;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9971q;
import li.C10451b;
import p268og.AbstractC11346m;
import p305qh.AbstractC12137c;
import sh.C12902d;

/* renamed from: gi.y */
/* loaded from: classes8.dex */
public final class C7696y {
    /* renamed from: a */
    private static final AbstractC7267g0 m21643a(AbstractC7267g0 g0Var) {
        return C10451b.m13148a(g0Var).m13149d();
    }

    /* renamed from: b */
    private static final String m21642b(AbstractC7268g1 g1Var) {
        StringBuilder sb2 = new StringBuilder();
        m21641c("type: " + g1Var, sb2);
        m21641c("hashCode: " + g1Var.hashCode(), sb2);
        m21641c("javaClass: " + g1Var.getClass().getCanonicalName(), sb2);
        for (AbstractC11346m p = g1Var.mo4565p(); p != null; p = p.mo6104b()) {
            m21641c("fqName: " + AbstractC12137c.f27230g.mo7630q(p), sb2);
            m21641c("javaClass: " + p.getClass().getCanonicalName(), sb2);
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: c */
    private static final StringBuilder m21641c(String str, StringBuilder sb2) {
        C9971q.m14633g(str, "<this>");
        sb2.append(str);
        C9971q.m14634f(sb2, "append(value)");
        sb2.append('\n');
        C9971q.m14634f(sb2, "append('\\n')");
        return sb2;
    }

    /* renamed from: d */
    public static final AbstractC7267g0 m21640d(AbstractC7267g0 subtype, AbstractC7267g0 supertype, AbstractC7685v typeCheckingProcedureCallbacks) {
        AbstractC7268g1 N0;
        boolean z;
        boolean z2;
        C9971q.m14633g(subtype, "subtype");
        C9971q.m14633g(supertype, "supertype");
        C9971q.m14633g(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new C7682s(subtype, null));
        AbstractC7268g1 N02 = supertype.mo5172N0();
        while (!arrayDeque.isEmpty()) {
            C7682s sVar = (C7682s) arrayDeque.poll();
            AbstractC7267g0 b = sVar.m21662b();
            AbstractC7268g1 N03 = b.mo5172N0();
            if (typeCheckingProcedureCallbacks.mo21657a(N03, N02)) {
                boolean O0 = b.mo5171O0();
                for (C7682s a = sVar.m21663a(); a != null; a = a.m21663a()) {
                    AbstractC7267g0 b2 = a.m21662b();
                    List<AbstractC7290k1> L0 = b2.mo5174L0();
                    if (!(L0 instanceof Collection) || !L0.isEmpty()) {
                        for (AbstractC7290k1 k1Var : L0) {
                            if (k1Var.mo22906b() != EnumC7338w1.INVARIANT) {
                                z2 = true;
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (z2) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        AbstractC7267g0 n = C12902d.m5150f(AbstractC7275h1.f15749c.m23040a(b2), false, 1, null).m23003c().m22972n(b, EnumC7338w1.INVARIANT);
                        C9971q.m14634f(n, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                        b = m21643a(n);
                    } else {
                        b = AbstractC7275h1.f15749c.m23040a(b2).m23003c().m22972n(b, EnumC7338w1.INVARIANT);
                        C9971q.m14634f(b, "{\n                    Ty…ARIANT)\n                }");
                    }
                    if (O0 || b2.mo5171O0()) {
                        O0 = true;
                    } else {
                        O0 = false;
                    }
                }
                if (typeCheckingProcedureCallbacks.mo21657a(b.mo5172N0(), N02)) {
                    return C7322s1.m22931p(b, O0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + m21642b(N0) + ", \n\nsupertype: " + m21642b(N02) + " \n" + typeCheckingProcedureCallbacks.mo21657a(N0, N02));
            }
            for (AbstractC7267g0 immediateSupertype : N03.mo4568m()) {
                C9971q.m14634f(immediateSupertype, "immediateSupertype");
                arrayDeque.add(new C7682s(immediateSupertype, sVar));
            }
        }
        return null;
    }
}
