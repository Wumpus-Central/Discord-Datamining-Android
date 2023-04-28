package p325rh;

import java.util.Collection;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11301b;
import p268og.C11373t;

/* renamed from: rh.q */
/* loaded from: classes8.dex */
public final class C12687q {
    /* renamed from: a */
    public static final AbstractC11301b m5875a(Collection<? extends AbstractC11301b> descriptors) {
        Integer d;
        C9971q.m14633g(descriptors, "descriptors");
        descriptors.isEmpty();
        AbstractC11301b bVar = null;
        for (AbstractC11301b bVar2 : descriptors) {
            if (bVar == null || ((d = C11373t.m10172d(bVar.getVisibility(), bVar2.getVisibility())) != null && d.intValue() < 0)) {
                bVar = bVar2;
            }
        }
        C9971q.m14636d(bVar);
        return bVar;
    }
}
