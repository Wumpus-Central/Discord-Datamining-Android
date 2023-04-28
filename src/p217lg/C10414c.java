package p217lg;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p217lg.C10434k;
import p249nh.C11136b;
import p249nh.C11137c;

/* renamed from: lg.c */
/* loaded from: classes8.dex */
public final class C10414c {

    /* renamed from: a */
    public static final C10414c f22824a = new C10414c();

    /* renamed from: b */
    private static final Set<C11136b> f22825b;

    static {
        int t;
        List p0;
        List p02;
        List<C11137c> p03;
        Set<EnumC10426i> set = EnumC10426i.f22844p;
        t = C9907k.m14809t(set, 10);
        ArrayList arrayList = new ArrayList(t);
        for (EnumC10426i iVar : set) {
            arrayList.add(C10434k.m13331c(iVar));
        }
        C11137c l = C10434k.C10435a.f22914h.m10782l();
        C9971q.m14634f(l, "string.toSafe()");
        p0 = C9914r.m14749p0(arrayList, l);
        C11137c l2 = C10434k.C10435a.f22918j.m10782l();
        C9971q.m14634f(l2, "_boolean.toSafe()");
        p02 = C9914r.m14749p0(p0, l2);
        C11137c l3 = C10434k.C10435a.f22936s.m10782l();
        C9971q.m14634f(l3, "_enum.toSafe()");
        p03 = C9914r.m14749p0(p02, l3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C11137c cVar : p03) {
            linkedHashSet.add(C11136b.m10805m(cVar));
        }
        f22825b = linkedHashSet;
    }

    private C10414c() {
    }

    /* renamed from: a */
    public final Set<C11136b> m13456a() {
        return f22825b;
    }

    /* renamed from: b */
    public final Set<C11136b> m13455b() {
        return f22825b;
    }
}
