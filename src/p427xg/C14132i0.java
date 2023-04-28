package p427xg;

import eg.C6884j;
import gh.C7651y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.collections.C9921w;
import kotlin.collections.C9922x;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11098x;
import p249nh.C11142f;
import p267of.C11288u;
import p267of.C11289v;
import p407wh.EnumC13886e;

/* renamed from: xg.i0 */
/* loaded from: classes8.dex */
public class C14132i0 {

    /* renamed from: a */
    public static final C14133a f31919a = new C14133a(null);

    /* renamed from: b */
    private static final List<C14133a.C0458a> f31920b;

    /* renamed from: c */
    private static final List<String> f31921c;

    /* renamed from: d */
    private static final List<String> f31922d;

    /* renamed from: e */
    private static final Map<C14133a.C0458a, EnumC14135c> f31923e;

    /* renamed from: f */
    private static final Map<String, EnumC14135c> f31924f;

    /* renamed from: g */
    private static final Set<C11142f> f31925g;

    /* renamed from: h */
    private static final Set<String> f31926h;

    /* renamed from: i */
    private static final C14133a.C0458a f31927i;

    /* renamed from: j */
    private static final Map<C14133a.C0458a, C11142f> f31928j;

    /* renamed from: k */
    private static final Map<String, C11142f> f31929k;

    /* renamed from: l */
    private static final List<C11142f> f31930l;

    /* renamed from: m */
    private static final Map<C11142f, C11142f> f31931m;

    /* renamed from: xg.i0$a */
    /* loaded from: classes8.dex */
    public static final class C14133a {

        /* renamed from: xg.i0$a$a */
        /* loaded from: classes8.dex */
        public static final class C0458a {

            /* renamed from: a */
            private final C11142f f31932a;

            /* renamed from: b */
            private final String f31933b;

            public C0458a(C11142f name, String signature) {
                C9971q.m14633g(name, "name");
                C9971q.m14633g(signature, "signature");
                this.f31932a = name;
                this.f31933b = signature;
            }

            /* renamed from: a */
            public final C11142f m1544a() {
                return this.f31932a;
            }

            /* renamed from: b */
            public final String m1543b() {
                return this.f31933b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0458a)) {
                    return false;
                }
                C0458a aVar = (C0458a) obj;
                return C9971q.m14638b(this.f31932a, aVar.f31932a) && C9971q.m14638b(this.f31933b, aVar.f31933b);
            }

            public int hashCode() {
                return (this.f31932a.hashCode() * 31) + this.f31933b.hashCode();
            }

            public String toString() {
                return "NameAndSignature(name=" + this.f31932a + ", signature=" + this.f31933b + ')';
            }
        }

        private C14133a() {
        }

        public /* synthetic */ C14133a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public final C0458a m1545m(String str, String str2, String str3, String str4) {
            C11142f f = C11142f.m10767f(str2);
            C9971q.m14634f(f, "identifier(name)");
            C7651y yVar = C7651y.f16655a;
            return new C0458a(f, yVar.m21787k(str, str2 + '(' + str3 + ')' + str4));
        }

        /* renamed from: b */
        public final C11142f m1556b(C11142f name) {
            C9971q.m14633g(name, "name");
            return m1552f().get(name);
        }

        /* renamed from: c */
        public final List<String> m1555c() {
            return C14132i0.f31921c;
        }

        /* renamed from: d */
        public final Set<C11142f> m1554d() {
            return C14132i0.f31925g;
        }

        /* renamed from: e */
        public final Set<String> m1553e() {
            return C14132i0.f31926h;
        }

        /* renamed from: f */
        public final Map<C11142f, C11142f> m1552f() {
            return C14132i0.f31931m;
        }

        /* renamed from: g */
        public final List<C11142f> m1551g() {
            return C14132i0.f31930l;
        }

        /* renamed from: h */
        public final C0458a m1550h() {
            return C14132i0.f31927i;
        }

        /* renamed from: i */
        public final Map<String, EnumC14135c> m1549i() {
            return C14132i0.f31924f;
        }

        /* renamed from: j */
        public final Map<String, C11142f> m1548j() {
            return C14132i0.f31929k;
        }

        /* renamed from: k */
        public final boolean m1547k(C11142f fVar) {
            C9971q.m14633g(fVar, "<this>");
            return m1551g().contains(fVar);
        }

        /* renamed from: l */
        public final EnumC14134b m1546l(String builtinSignature) {
            Object i;
            C9971q.m14633g(builtinSignature, "builtinSignature");
            if (m1555c().contains(builtinSignature)) {
                return EnumC14134b.ONE_COLLECTION_PARAMETER;
            }
            i = C11289v.m10250i(m1549i(), builtinSignature);
            if (((EnumC14135c) i) == EnumC14135c.f31940l) {
                return EnumC14134b.OBJECT_PARAMETER_GENERIC;
            }
            return EnumC14134b.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    /* renamed from: xg.i0$b */
    /* loaded from: classes8.dex */
    public enum EnumC14134b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        

        /* renamed from: k */
        private final String f31938k;

        /* renamed from: l */
        private final boolean f31939l;

        EnumC14134b(String str, boolean z) {
            this.f31938k = str;
            this.f31939l = z;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: xg.i0$c */
    /* loaded from: classes8.dex */
    public static final class EnumC14135c extends Enum<EnumC14135c> {

        /* renamed from: l */
        public static final EnumC14135c f31940l = new EnumC14135c("NULL", 0, null);

        /* renamed from: m */
        public static final EnumC14135c f31941m = new EnumC14135c("INDEX", 1, -1);

        /* renamed from: n */
        public static final EnumC14135c f31942n = new EnumC14135c("FALSE", 2, Boolean.FALSE);

        /* renamed from: o */
        public static final EnumC14135c f31943o = new C14136a("MAP_GET_OR_DEFAULT", 3);

        /* renamed from: p */
        private static final /* synthetic */ EnumC14135c[] f31944p = m1541a();

        /* renamed from: k */
        private final Object f31945k;

        /* renamed from: xg.i0$c$a */
        /* loaded from: classes8.dex */
        static final class C14136a extends EnumC14135c {
            C14136a(String str, int i) {
                super(str, i, null, null);
            }
        }

        private EnumC14135c(String str, int i, Object obj) {
            this.f31945k = obj;
        }

        public /* synthetic */ EnumC14135c(String str, int i, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, obj);
        }

        /* renamed from: a */
        private static final /* synthetic */ EnumC14135c[] m1541a() {
            return new EnumC14135c[]{f31940l, f31941m, f31942n, f31943o};
        }

        public static EnumC14135c valueOf(String str) {
            return (EnumC14135c) Enum.valueOf(EnumC14135c.class, str);
        }

        public static EnumC14135c[] values() {
            return (EnumC14135c[]) f31944p.clone();
        }
    }

    static {
        Set<String> i;
        int t;
        int t2;
        int t3;
        Map<C14133a.C0458a, EnumC14135c> k;
        int d;
        Set<C14133a.C0458a> l;
        int t4;
        Set<C11142f> H0;
        int t5;
        Set<String> H02;
        Map<C14133a.C0458a, C11142f> k2;
        int d2;
        int t6;
        int t7;
        int t8;
        int d3;
        int c;
        i = C9921w.m14717i("containsAll", "removeAll", "retainAll");
        t = C9907k.m14809t(i, 10);
        ArrayList<C14133a.C0458a> arrayList = new ArrayList(t);
        for (String str : i) {
            C14133a aVar = f31919a;
            String d4 = EnumC13886e.BOOLEAN.m2392d();
            C9971q.m14634f(d4, "BOOLEAN.desc");
            arrayList.add(aVar.m1545m("java/util/Collection", str, "Ljava/util/Collection;", d4));
        }
        f31920b = arrayList;
        t2 = C9907k.m14809t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(t2);
        for (C14133a.C0458a aVar2 : arrayList) {
            arrayList2.add(aVar2.m1543b());
        }
        f31921c = arrayList2;
        List<C14133a.C0458a> list = f31920b;
        t3 = C9907k.m14809t(list, 10);
        ArrayList arrayList3 = new ArrayList(t3);
        for (C14133a.C0458a aVar3 : list) {
            arrayList3.add(aVar3.m1544a().m10771b());
        }
        f31922d = arrayList3;
        C7651y yVar = C7651y.f16655a;
        C14133a aVar4 = f31919a;
        String i2 = yVar.m21789i("Collection");
        EnumC13886e eVar = EnumC13886e.BOOLEAN;
        String d5 = eVar.m2392d();
        C9971q.m14634f(d5, "BOOLEAN.desc");
        C14133a.C0458a m = aVar4.m1545m(i2, "contains", "Ljava/lang/Object;", d5);
        EnumC14135c cVar = EnumC14135c.f31942n;
        String i3 = yVar.m21789i("Collection");
        String d6 = eVar.m2392d();
        C9971q.m14634f(d6, "BOOLEAN.desc");
        String i4 = yVar.m21789i("Map");
        String d7 = eVar.m2392d();
        C9971q.m14634f(d7, "BOOLEAN.desc");
        String i5 = yVar.m21789i("Map");
        String d8 = eVar.m2392d();
        C9971q.m14634f(d8, "BOOLEAN.desc");
        String i6 = yVar.m21789i("Map");
        String d9 = eVar.m2392d();
        C9971q.m14634f(d9, "BOOLEAN.desc");
        C14133a.C0458a m2 = aVar4.m1545m(yVar.m21789i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        EnumC14135c cVar2 = EnumC14135c.f31940l;
        String i7 = yVar.m21789i("List");
        EnumC13886e eVar2 = EnumC13886e.INT;
        String d10 = eVar2.m2392d();
        C9971q.m14634f(d10, "INT.desc");
        C14133a.C0458a m3 = aVar4.m1545m(i7, "indexOf", "Ljava/lang/Object;", d10);
        EnumC14135c cVar3 = EnumC14135c.f31941m;
        String i8 = yVar.m21789i("List");
        String d11 = eVar2.m2392d();
        C9971q.m14634f(d11, "INT.desc");
        k = C11289v.m10248k(C11098x.m10921a(m, cVar), C11098x.m10921a(aVar4.m1545m(i3, "remove", "Ljava/lang/Object;", d6), cVar), C11098x.m10921a(aVar4.m1545m(i4, "containsKey", "Ljava/lang/Object;", d7), cVar), C11098x.m10921a(aVar4.m1545m(i5, "containsValue", "Ljava/lang/Object;", d8), cVar), C11098x.m10921a(aVar4.m1545m(i6, "remove", "Ljava/lang/Object;Ljava/lang/Object;", d9), cVar), C11098x.m10921a(aVar4.m1545m(yVar.m21789i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), EnumC14135c.f31943o), C11098x.m10921a(m2, cVar2), C11098x.m10921a(aVar4.m1545m(yVar.m21789i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2), C11098x.m10921a(m3, cVar3), C11098x.m10921a(aVar4.m1545m(i8, "lastIndexOf", "Ljava/lang/Object;", d11), cVar3));
        f31923e = k;
        d = C11288u.m10255d(k.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator<T> it = k.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((C14133a.C0458a) entry.getKey()).m1543b(), entry.getValue());
        }
        f31924f = linkedHashMap;
        l = C9922x.m14714l(f31923e.keySet(), f31920b);
        t4 = C9907k.m14809t(l, 10);
        ArrayList arrayList4 = new ArrayList(t4);
        for (C14133a.C0458a aVar5 : l) {
            arrayList4.add(aVar5.m1544a());
        }
        H0 = C9914r.m14786H0(arrayList4);
        f31925g = H0;
        t5 = C9907k.m14809t(l, 10);
        ArrayList arrayList5 = new ArrayList(t5);
        for (C14133a.C0458a aVar6 : l) {
            arrayList5.add(aVar6.m1543b());
        }
        H02 = C9914r.m14786H0(arrayList5);
        f31926h = H02;
        C14133a aVar7 = f31919a;
        EnumC13886e eVar3 = EnumC13886e.INT;
        String d12 = eVar3.m2392d();
        C9971q.m14634f(d12, "INT.desc");
        C14133a.C0458a m4 = aVar7.m1545m("java/util/List", "removeAt", d12, "Ljava/lang/Object;");
        f31927i = m4;
        C7651y yVar2 = C7651y.f16655a;
        String h = yVar2.m21790h("Number");
        String d13 = EnumC13886e.BYTE.m2392d();
        C9971q.m14634f(d13, "BYTE.desc");
        String h2 = yVar2.m21790h("Number");
        String d14 = EnumC13886e.SHORT.m2392d();
        C9971q.m14634f(d14, "SHORT.desc");
        String h3 = yVar2.m21790h("Number");
        String d15 = eVar3.m2392d();
        C9971q.m14634f(d15, "INT.desc");
        String h4 = yVar2.m21790h("Number");
        String d16 = EnumC13886e.LONG.m2392d();
        C9971q.m14634f(d16, "LONG.desc");
        String h5 = yVar2.m21790h("Number");
        String d17 = EnumC13886e.FLOAT.m2392d();
        C9971q.m14634f(d17, "FLOAT.desc");
        String h6 = yVar2.m21790h("Number");
        String d18 = EnumC13886e.DOUBLE.m2392d();
        C9971q.m14634f(d18, "DOUBLE.desc");
        String h7 = yVar2.m21790h("CharSequence");
        String d19 = eVar3.m2392d();
        C9971q.m14634f(d19, "INT.desc");
        String d20 = EnumC13886e.CHAR.m2392d();
        C9971q.m14634f(d20, "CHAR.desc");
        k2 = C11289v.m10248k(C11098x.m10921a(aVar7.m1545m(h, "toByte", "", d13), C11142f.m10767f("byteValue")), C11098x.m10921a(aVar7.m1545m(h2, "toShort", "", d14), C11142f.m10767f("shortValue")), C11098x.m10921a(aVar7.m1545m(h3, "toInt", "", d15), C11142f.m10767f("intValue")), C11098x.m10921a(aVar7.m1545m(h4, "toLong", "", d16), C11142f.m10767f("longValue")), C11098x.m10921a(aVar7.m1545m(h5, "toFloat", "", d17), C11142f.m10767f("floatValue")), C11098x.m10921a(aVar7.m1545m(h6, "toDouble", "", d18), C11142f.m10767f("doubleValue")), C11098x.m10921a(m4, C11142f.m10767f("remove")), C11098x.m10921a(aVar7.m1545m(h7, "get", d19, d20), C11142f.m10767f("charAt")));
        f31928j = k2;
        d2 = C11288u.m10255d(k2.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2);
        Iterator<T> it2 = k2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap2.put(((C14133a.C0458a) entry2.getKey()).m1543b(), entry2.getValue());
        }
        f31929k = linkedHashMap2;
        Set<C14133a.C0458a> keySet = f31928j.keySet();
        t6 = C9907k.m14809t(keySet, 10);
        ArrayList arrayList6 = new ArrayList(t6);
        for (C14133a.C0458a aVar8 : keySet) {
            arrayList6.add(aVar8.m1544a());
        }
        f31930l = arrayList6;
        Set<Map.Entry<C14133a.C0458a, C11142f>> entrySet = f31928j.entrySet();
        t7 = C9907k.m14809t(entrySet, 10);
        ArrayList<Pair> arrayList7 = new ArrayList(t7);
        Iterator<T> it3 = entrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            arrayList7.add(new Pair(((C14133a.C0458a) entry3.getKey()).m1544a(), entry3.getValue()));
        }
        t8 = C9907k.m14809t(arrayList7, 10);
        d3 = C11288u.m10255d(t8);
        c = C6884j.m23961c(d3, 16);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(c);
        for (Pair pair : arrayList7) {
            linkedHashMap3.put((C11142f) pair.m15064d(), (C11142f) pair.m15065c());
        }
        f31931m = linkedHashMap3;
    }
}
