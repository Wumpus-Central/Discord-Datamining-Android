package p108fh;

import eg.C6884j;
import gh.C7651y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C9899f;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;
import p267of.C11280m;
import p267of.C11288u;
import p407wh.EnumC13886e;

/* renamed from: fh.m */
/* loaded from: classes8.dex */
final class C7213m {

    /* renamed from: a */
    private final Map<String, C7206k> f15641a = new LinkedHashMap();

    /* renamed from: fh.m$a */
    /* loaded from: classes8.dex */
    public final class C7214a {

        /* renamed from: a */
        private final String f15642a;

        /* renamed from: b */
        final /* synthetic */ C7213m f15643b;

        /* renamed from: fh.m$a$a */
        /* loaded from: classes8.dex */
        public final class C0222a {

            /* renamed from: a */
            private final String f15644a;

            /* renamed from: b */
            private final List<Pair<String, C7218q>> f15645b = new ArrayList();

            /* renamed from: c */
            private Pair<String, C7218q> f15646c = C11098x.m10921a("V", null);

            /* renamed from: d */
            final /* synthetic */ C7214a f15647d;

            public C0222a(C7214a aVar, String functionName) {
                C9971q.m14633g(functionName, "functionName");
                this.f15647d = aVar;
                this.f15644a = functionName;
            }

            /* renamed from: a */
            public final Pair<String, C7206k> m23217a() {
                int t;
                int t2;
                C7651y yVar = C7651y.f16655a;
                String b = this.f15647d.m23218b();
                String str = this.f15644a;
                List<Pair<String, C7218q>> list = this.f15645b;
                t = C9907k.m14809t(list, 10);
                ArrayList arrayList = new ArrayList(t);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).m15065c());
                }
                String k = yVar.m21787k(b, yVar.m21788j(str, arrayList, this.f15646c.m15065c()));
                C7218q d = this.f15646c.m15064d();
                List<Pair<String, C7218q>> list2 = this.f15645b;
                t2 = C9907k.m14809t(list2, 10);
                ArrayList arrayList2 = new ArrayList(t2);
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((C7218q) ((Pair) it2.next()).m15064d());
                }
                return C11098x.m10921a(k, new C7206k(d, arrayList2));
            }

            /* renamed from: b */
            public final void m23216b(String type, C7172e... qualifiers) {
                boolean z;
                C7218q qVar;
                Iterable<C11280m> I0;
                int t;
                int d;
                int c;
                C9971q.m14633g(type, "type");
                C9971q.m14633g(qualifiers, "qualifiers");
                List<Pair<String, C7218q>> list = this.f15645b;
                if (qualifiers.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    qVar = null;
                } else {
                    I0 = C9899f.m14955I0(qualifiers);
                    t = C9907k.m14809t(I0, 10);
                    d = C11288u.m10255d(t);
                    c = C6884j.m23961c(d, 16);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                    for (C11280m mVar : I0) {
                        linkedHashMap.put(Integer.valueOf(mVar.m10277c()), (C7172e) mVar.m10276d());
                    }
                    qVar = new C7218q(linkedHashMap);
                }
                list.add(C11098x.m10921a(type, qVar));
            }

            /* renamed from: c */
            public final void m23215c(String type, C7172e... qualifiers) {
                Iterable<C11280m> I0;
                int t;
                int d;
                int c;
                C9971q.m14633g(type, "type");
                C9971q.m14633g(qualifiers, "qualifiers");
                I0 = C9899f.m14955I0(qualifiers);
                t = C9907k.m14809t(I0, 10);
                d = C11288u.m10255d(t);
                c = C6884j.m23961c(d, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (C11280m mVar : I0) {
                    linkedHashMap.put(Integer.valueOf(mVar.m10277c()), (C7172e) mVar.m10276d());
                }
                this.f15646c = C11098x.m10921a(type, new C7218q(linkedHashMap));
            }

            /* renamed from: d */
            public final void m23214d(EnumC13886e type) {
                C9971q.m14633g(type, "type");
                String d = type.m2392d();
                C9971q.m14634f(d, "type.desc");
                this.f15646c = C11098x.m10921a(d, null);
            }
        }

        public C7214a(C7213m mVar, String className) {
            C9971q.m14633g(className, "className");
            this.f15643b = mVar;
            this.f15642a = className;
        }

        /* renamed from: a */
        public final void m23219a(String name, Function1<? super C0222a, Unit> block) {
            C9971q.m14633g(name, "name");
            C9971q.m14633g(block, "block");
            Map map = this.f15643b.f15641a;
            C0222a aVar = new C0222a(this, name);
            block.invoke(aVar);
            Pair<String, C7206k> a = aVar.m23217a();
            map.put(a.m15065c(), a.m15064d());
        }

        /* renamed from: b */
        public final String m23218b() {
            return this.f15642a;
        }
    }

    /* renamed from: b */
    public final Map<String, C7206k> m23220b() {
        return this.f15641a;
    }
}
