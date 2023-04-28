package p045cj;

import dj.AbstractC6514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import p014aj.AbstractC1410d;
import p014aj.AbstractC1413e;
import p014aj.AbstractC1429h;
import p014aj.AbstractC1432i;
import p014aj.C1408b;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\b"}, m15073d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "desc", "Lcj/t0;", "b", "Ldj/c;", "module", "a", "kotlinx-serialization-json"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: cj.u0 */
/* loaded from: classes8.dex */
public final class C4073u0 {
    /* renamed from: a */
    public static final SerialDescriptor m32882a(SerialDescriptor serialDescriptor, AbstractC6514c module) {
        SerialDescriptor a;
        C9971q.m14633g(serialDescriptor, "<this>");
        C9971q.m14633g(module, "module");
        if (C9971q.m14638b(serialDescriptor.mo13678g(), AbstractC1429h.C1430a.f479a)) {
            SerialDescriptor b = C1408b.m41137b(module, serialDescriptor);
            if (b == null || (a = m32882a(b, module)) == null) {
                return serialDescriptor;
            }
            return a;
        } else if (serialDescriptor.isInline()) {
            return m32882a(serialDescriptor.mo13677h(0), module);
        } else {
            return serialDescriptor;
        }
    }

    /* renamed from: b */
    public static final EnumC4070t0 m32881b(Json json, SerialDescriptor desc) {
        C9971q.m14633g(json, "<this>");
        C9971q.m14633g(desc, "desc");
        AbstractC1429h g = desc.mo13678g();
        if (g instanceof AbstractC1410d) {
            return EnumC4070t0.POLY_OBJ;
        }
        if (C9971q.m14638b(g, AbstractC1432i.C1434b.f482a)) {
            return EnumC4070t0.LIST;
        }
        if (!C9971q.m14638b(g, AbstractC1432i.C1435c.f483a)) {
            return EnumC4070t0.OBJ;
        }
        SerialDescriptor a = m32882a(desc.mo13677h(0), json.mo611a());
        AbstractC1429h g2 = a.mo13678g();
        if ((g2 instanceof AbstractC1413e) || C9971q.m14638b(g2, AbstractC1429h.C1431b.f480a)) {
            return EnumC4070t0.MAP;
        }
        if (json.m13765e().m13742b()) {
            return EnumC4070t0.LIST;
        }
        throw C4025a0.m33035c(a);
    }
}
