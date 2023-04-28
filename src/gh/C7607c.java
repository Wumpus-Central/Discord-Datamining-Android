package gh;

import gh.C7645u;
import kh.AbstractC9874c;
import kh.C9877e;
import kh.C9879g;
import kotlin.jvm.internal.C9971q;
import mh.AbstractC10609d;
import mh.C10619i;
import p159ih.C8581n;
import p218lh.C10440a;
import ph.AbstractC11702i;

/* renamed from: gh.c */
/* loaded from: classes8.dex */
public final class C7607c {
    /* renamed from: a */
    public static final C7645u m21904a(C8581n proto, AbstractC9874c nameResolver, C9879g typeTable, boolean z, boolean z2, boolean z3) {
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        C9971q.m14633g(typeTable, "typeTable");
        AbstractC11702i.C11709f<C8581n, C10440a.C10444d> propertySignature = C10440a.f22978d;
        C9971q.m14634f(propertySignature, "propertySignature");
        C10440a.C10444d dVar = (C10440a.C10444d) C9877e.m15132a(proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        if (z) {
            AbstractC10609d.C10610a c = C10619i.f23511a.m12726c(proto, nameResolver, typeTable, z3);
            if (c == null) {
                return null;
            }
            return C7645u.f16652b.m21810b(c);
        } else if (!z2 || !dVar.m13251J()) {
            return null;
        } else {
            C7645u.C7646a aVar = C7645u.f16652b;
            C10440a.C10442c E = dVar.m13256E();
            C9971q.m14634f(E, "signature.syntheticMethod");
            return aVar.m21809c(nameResolver, E);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C7645u m21903b(C8581n nVar, AbstractC9874c cVar, C9879g gVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        boolean z4 = (i & 8) != 0 ? false : z;
        boolean z5 = (i & 16) != 0 ? false : z2;
        if ((i & 32) != 0) {
            z3 = true;
        }
        return m21904a(nVar, cVar, gVar, z4, z5, z3);
    }
}
