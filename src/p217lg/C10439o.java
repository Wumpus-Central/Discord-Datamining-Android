package p217lg;

import fi.AbstractC7267g0;
import fi.C7322s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;
import p249nh.C11136b;
import p249nh.C11142f;
import p267of.C11289v;
import p268og.AbstractC11326h;
import p268og.AbstractC11344l0;
import p268og.AbstractC11346m;

/* renamed from: lg.o */
/* loaded from: classes8.dex */
public final class C10439o {

    /* renamed from: a */
    public static final C10439o f22968a = new C10439o();

    /* renamed from: b */
    private static final Set<C11142f> f22969b;

    /* renamed from: c */
    private static final Set<C11142f> f22970c;

    /* renamed from: d */
    private static final HashMap<C11136b, C11136b> f22971d;

    /* renamed from: e */
    private static final HashMap<C11136b, C11136b> f22972e;

    /* renamed from: f */
    private static final HashMap<EnumC10437m, C11142f> f22973f;

    /* renamed from: g */
    private static final Set<C11142f> f22974g;

    static {
        Set<C11142f> H0;
        Set<C11142f> H02;
        HashMap<EnumC10437m, C11142f> j;
        EnumC10438n[] values;
        EnumC10438n[] values2 = EnumC10438n.values();
        ArrayList arrayList = new ArrayList(values2.length);
        for (EnumC10438n nVar : values2) {
            arrayList.add(nVar.m13316d());
        }
        H0 = C9914r.m14786H0(arrayList);
        f22969b = H0;
        EnumC10437m[] values3 = EnumC10437m.values();
        ArrayList arrayList2 = new ArrayList(values3.length);
        for (EnumC10437m mVar : values3) {
            arrayList2.add(mVar.m13320b());
        }
        H02 = C9914r.m14786H0(arrayList2);
        f22970c = H02;
        f22971d = new HashMap<>();
        f22972e = new HashMap<>();
        j = C11289v.m10249j(C11098x.m10921a(EnumC10437m.UBYTEARRAY, C11142f.m10767f("ubyteArrayOf")), C11098x.m10921a(EnumC10437m.USHORTARRAY, C11142f.m10767f("ushortArrayOf")), C11098x.m10921a(EnumC10437m.UINTARRAY, C11142f.m10767f("uintArrayOf")), C11098x.m10921a(EnumC10437m.ULONGARRAY, C11142f.m10767f("ulongArrayOf")));
        f22973f = j;
        EnumC10438n[] values4 = EnumC10438n.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC10438n nVar2 : values4) {
            linkedHashSet.add(nVar2.m13318b().m10808j());
        }
        f22974g = linkedHashSet;
        for (EnumC10438n nVar3 : EnumC10438n.values()) {
            f22971d.put(nVar3.m13318b(), nVar3.m13317c());
            f22972e.put(nVar3.m13317c(), nVar3.m13318b());
        }
    }

    private C10439o() {
    }

    /* renamed from: d */
    public static final boolean m13312d(AbstractC7267g0 type) {
        AbstractC11326h p;
        C9971q.m14633g(type, "type");
        if (!C7322s1.m22924w(type) && (p = type.mo5172N0().mo4565p()) != null) {
            return f22968a.m13313c(p);
        }
        return false;
    }

    /* renamed from: a */
    public final C11136b m13315a(C11136b arrayClassId) {
        C9971q.m14633g(arrayClassId, "arrayClassId");
        return f22971d.get(arrayClassId);
    }

    /* renamed from: b */
    public final boolean m13314b(C11142f name) {
        C9971q.m14633g(name, "name");
        return f22974g.contains(name);
    }

    /* renamed from: c */
    public final boolean m13313c(AbstractC11346m descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        AbstractC11346m b = descriptor.mo6104b();
        if (!(b instanceof AbstractC11344l0) || !C9971q.m14638b(((AbstractC11344l0) b).mo6103e(), C10434k.f22894u) || !f22969b.contains(descriptor.getName())) {
            return false;
        }
        return true;
    }
}
