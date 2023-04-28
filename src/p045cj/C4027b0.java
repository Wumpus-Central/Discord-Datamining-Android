package p045cj;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC10289o;
import kotlinx.serialization.json.AbstractC10290p;
import kotlinx.serialization.json.C10295t;
import kotlinx.serialization.json.Json;
import p014aj.AbstractC1432i;
import p045cj.C4071u;
import p267of.C11289v;
import p449yi.C14436g;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0005H\u0000\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0000\u001a&\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0000\"2\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00118\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\",\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00190\u00118\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0013\u0012\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001d"}, m15073d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/json/Json;", "json", "", "", "", "b", "descriptor", "d", "index", "f", "Lkotlinx/serialization/json/p;", "k", "name", "g", "suffix", "i", "Lcj/u$a;", "a", "Lcj/u$a;", "e", "()Lcj/u$a;", "getJsonDeserializationNamesKey$annotations", "()V", "JsonDeserializationNamesKey", "", "getJsonSerializationNamesKey", "getJsonSerializationNamesKey$annotations", "JsonSerializationNamesKey", "kotlinx-serialization-json"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: cj.b0 */
/* loaded from: classes8.dex */
public final class C4027b0 {

    /* renamed from: a */
    private static final C4071u.C4072a<Map<String, Integer>> f6617a = new C4071u.C4072a<>();

    /* renamed from: b */
    private static final C4071u.C4072a<String[]> f6618b = new C4071u.C4072a<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"", "", "", "a", "()Ljava/util/Map;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: cj.b0$a */
    /* loaded from: classes8.dex */
    public static final class C4028a extends AbstractC9973s implements Function0<Map<String, ? extends Integer>> {

        /* renamed from: k */
        final /* synthetic */ SerialDescriptor f6619k;

        /* renamed from: l */
        final /* synthetic */ Json f6620l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4028a(SerialDescriptor serialDescriptor, Json json) {
            super(0);
            this.f6619k = serialDescriptor;
            this.f6620l = json;
        }

        /* renamed from: a */
        public final Map<String, Integer> invoke() {
            return C4027b0.m33024b(this.f6619k, this.f6620l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final Map<String, Integer> m33024b(SerialDescriptor serialDescriptor, Json json) {
        Map<String, Integer> h;
        Object t0;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m33015k(serialDescriptor, json);
        int d = serialDescriptor.mo13681d();
        for (int i = 0; i < d; i++) {
            List<Annotation> f = serialDescriptor.mo13679f(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : f) {
                if (obj instanceof AbstractC10289o) {
                    arrayList.add(obj);
                }
            }
            t0 = C9914r.m14745t0(arrayList);
            AbstractC10289o oVar = (AbstractC10289o) t0;
            if (!(oVar == null || (names = oVar.names()) == null)) {
                for (String str : names) {
                    m33023c(linkedHashMap, serialDescriptor, str, i);
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            return linkedHashMap;
        }
        h = C11289v.m10251h();
        return h;
    }

    /* renamed from: c */
    private static final void m33023c(Map<String, Integer> map, SerialDescriptor serialDescriptor, String str, int i) {
        Object i2;
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The suggested name '");
        sb2.append(str);
        sb2.append("' for property ");
        sb2.append(serialDescriptor.mo13680e(i));
        sb2.append(" is already one of the names for property ");
        i2 = C11289v.m10250i(map, str);
        sb2.append(serialDescriptor.mo13680e(((Number) i2).intValue()));
        sb2.append(" in ");
        sb2.append(serialDescriptor);
        throw new C4079z(sb2.toString());
    }

    /* renamed from: d */
    public static final Map<String, Integer> m33022d(Json json, SerialDescriptor descriptor) {
        C9971q.m14633g(json, "<this>");
        C9971q.m14633g(descriptor, "descriptor");
        return (Map) C10295t.m13672a(json).m32884b(descriptor, f6617a, new C4028a(descriptor, json));
    }

    /* renamed from: e */
    public static final C4071u.C4072a<Map<String, Integer>> m33021e() {
        return f6617a;
    }

    /* renamed from: f */
    public static final String m33020f(SerialDescriptor serialDescriptor, Json json, int i) {
        C9971q.m14633g(serialDescriptor, "<this>");
        C9971q.m14633g(json, "json");
        m33015k(serialDescriptor, json);
        return serialDescriptor.mo13680e(i);
    }

    /* renamed from: g */
    public static final int m33019g(SerialDescriptor serialDescriptor, Json json, String name) {
        C9971q.m14633g(serialDescriptor, "<this>");
        C9971q.m14633g(json, "json");
        C9971q.m14633g(name, "name");
        m33015k(serialDescriptor, json);
        int c = serialDescriptor.mo13682c(name);
        if (c != -3) {
            return c;
        }
        if (!json.m13765e().m13733k()) {
            return c;
        }
        return m33018h(json, serialDescriptor, name);
    }

    /* renamed from: h */
    private static final int m33018h(Json json, SerialDescriptor serialDescriptor, String str) {
        Integer num = m33022d(json, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* renamed from: i */
    public static final int m33017i(SerialDescriptor serialDescriptor, Json json, String name, String suffix) {
        C9971q.m14633g(serialDescriptor, "<this>");
        C9971q.m14633g(json, "json");
        C9971q.m14633g(name, "name");
        C9971q.m14633g(suffix, "suffix");
        int g = m33019g(serialDescriptor, json, name);
        if (g != -3) {
            return g;
        }
        throw new C14436g(serialDescriptor.mo13676i() + " does not contain element with name '" + name + '\'' + suffix);
    }

    /* renamed from: j */
    public static /* synthetic */ int m33016j(SerialDescriptor serialDescriptor, Json json, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return m33017i(serialDescriptor, json, str, str2);
    }

    /* renamed from: k */
    public static final AbstractC10290p m33015k(SerialDescriptor serialDescriptor, Json json) {
        C9971q.m14633g(serialDescriptor, "<this>");
        C9971q.m14633g(json, "json");
        if (!C9971q.m14638b(serialDescriptor.mo13678g(), AbstractC1432i.C1433a.f481a)) {
            return null;
        }
        json.m13765e().m13736h();
        return null;
    }
}
