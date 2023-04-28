package p217lg;

import java.util.Set;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p249nh.C11136b;
import p268og.AbstractC11313e;
import p325rh.C12661e;
import p388vh.C13508c;

/* renamed from: lg.d */
/* loaded from: classes8.dex */
public final class C10415d {
    /* renamed from: a */
    public static final boolean m13454a(C10414c cVar, AbstractC11313e classDescriptor) {
        C11136b bVar;
        boolean M;
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(classDescriptor, "classDescriptor");
        if (C12661e.m6030x(classDescriptor)) {
            Set<C11136b> b = cVar.m13455b();
            C11136b k = C13508c.m3530k(classDescriptor);
            if (k != null) {
                bVar = k.m10811g();
            } else {
                bVar = null;
            }
            M = C9914r.m14778M(b, bVar);
            if (M) {
                return true;
            }
        }
        return false;
    }
}
