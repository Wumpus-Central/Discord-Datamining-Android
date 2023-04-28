package p448yh;

import java.util.HashSet;
import java.util.Set;
import kotlin.collections.C9911o;
import kotlin.jvm.internal.C9971q;
import p249nh.C11142f;

/* renamed from: yh.j */
/* loaded from: classes8.dex */
public final class C14415j {
    /* renamed from: a */
    public static final Set<C11142f> m646a(Iterable<? extends AbstractC14411h> iterable) {
        C9971q.m14633g(iterable, "<this>");
        HashSet hashSet = new HashSet();
        for (AbstractC14411h hVar : iterable) {
            Set<C11142f> g = hVar.mo635g();
            if (g == null) {
                return null;
            }
            C9911o.m14801y(hashSet, g);
        }
        return hashSet;
    }
}
