package p427xg;

import java.util.Iterator;
import kotlin.jvm.internal.C9971q;
import p013ah.C1394d;
import p013ah.C1399g;
import p086eh.AbstractC6890c0;
import p249nh.C11137c;
import p268og.AbstractC11301b;
import p268og.AbstractC11362n1;
import p268og.AbstractC11387u;
import p268og.AbstractC11397y;
import p467zg.C14650e;
import pg.AbstractC11666c;

/* renamed from: xg.j0 */
/* loaded from: classes8.dex */
public final class C14138j0 {
    /* renamed from: a */
    public static final AbstractC11666c m1539a(C1399g c, AbstractC6890c0 wildcardType) {
        boolean z;
        AbstractC11666c cVar;
        boolean z2;
        C9971q.m14633g(c, "c");
        C9971q.m14633g(wildcardType, "wildcardType");
        if (wildcardType.mo4054w() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Iterator<AbstractC11666c> it = new C1394d(c, wildcardType, false, 4, null).iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                cVar = it.next();
                AbstractC11666c cVar2 = cVar;
                C11137c[] f = C14158v.m1492f();
                int length = f.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z2 = false;
                        continue;
                        break;
                    }
                    if (C9971q.m14638b(cVar2.mo722e(), f[i])) {
                        z2 = true;
                        continue;
                        break;
                    }
                    i++;
                }
                if (z2) {
                    break;
                }
            }
            return cVar;
        }
        throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported".toString());
    }

    /* renamed from: b */
    public static final boolean m1538b(AbstractC11301b memberDescriptor) {
        C9971q.m14633g(memberDescriptor, "memberDescriptor");
        if (!(memberDescriptor instanceof AbstractC11397y) || !C9971q.m14638b(memberDescriptor.mo55s0(C14650e.f39525R), Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m1537c(C14161x javaTypeEnhancementState) {
        C9971q.m14633g(javaTypeEnhancementState, "javaTypeEnhancementState");
        if (javaTypeEnhancementState.m1482c().invoke(C14158v.m1493e()) == EnumC14123g0.STRICT) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final AbstractC11387u m1536d(AbstractC11362n1 n1Var) {
        C9971q.m14633g(n1Var, "<this>");
        AbstractC11387u g = C14151s.m1509g(n1Var);
        C9971q.m14634f(g, "toDescriptorVisibility(this)");
        return g;
    }
}
