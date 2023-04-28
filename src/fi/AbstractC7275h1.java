package fi;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: fi.h1 */
/* loaded from: classes8.dex */
public abstract class AbstractC7275h1 extends AbstractC7299n1 {

    /* renamed from: c */
    public static final C7276a f15749c = new C7276a(null);

    /* renamed from: fi.h1$a */
    /* loaded from: classes8.dex */
    public static final class C7276a {

        /* renamed from: fi.h1$a$a */
        /* loaded from: classes8.dex */
        public static final class C0226a extends AbstractC7275h1 {

            /* renamed from: d */
            final /* synthetic */ Map<AbstractC7268g1, AbstractC7290k1> f15750d;

            /* renamed from: e */
            final /* synthetic */ boolean f15751e;

            /* JADX WARN: Multi-variable type inference failed */
            C0226a(Map<AbstractC7268g1, ? extends AbstractC7290k1> map, boolean z) {
                this.f15750d = map;
                this.f15751e = z;
            }

            @Override // fi.AbstractC7299n1
            /* renamed from: a */
            public boolean mo22913a() {
                return this.f15751e;
            }

            @Override // fi.AbstractC7299n1
            /* renamed from: f */
            public boolean mo22911f() {
                return this.f15750d.isEmpty();
            }

            @Override // fi.AbstractC7275h1
            /* renamed from: k */
            public AbstractC7290k1 mo13138k(AbstractC7268g1 key) {
                C9971q.m14633g(key, "key");
                return this.f15750d.get(key);
            }
        }

        private C7276a() {
        }

        public /* synthetic */ C7276a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: e */
        public static /* synthetic */ AbstractC7275h1 m23036e(C7276a aVar, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.m23037d(map, z);
        }

        /* renamed from: a */
        public final AbstractC7299n1 m23040a(AbstractC7267g0 kotlinType) {
            C9971q.m14633g(kotlinType, "kotlinType");
            return m23039b(kotlinType.mo5172N0(), kotlinType.mo5174L0());
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
            if (r2.mo6393O() == true) goto L_0x0025;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final fi.AbstractC7299n1 m23039b(fi.AbstractC7268g1 r6, java.util.List<? extends fi.AbstractC7290k1> r7) {
            /*
                r5 = this;
                java.lang.String r0 = "typeConstructor"
                kotlin.jvm.internal.C9971q.m14633g(r6, r0)
                java.lang.String r0 = "arguments"
                kotlin.jvm.internal.C9971q.m14633g(r7, r0)
                java.util.List r0 = r6.getParameters()
                java.lang.String r1 = "typeConstructor.parameters"
                kotlin.jvm.internal.C9971q.m14634f(r0, r1)
                java.lang.Object r2 = kotlin.collections.C9904h.m14861i0(r0)
                og.f1 r2 = (p268og.AbstractC11319f1) r2
                r3 = 0
                if (r2 == 0) goto L_0x0024
                boolean r2 = r2.mo6393O()
                r4 = 1
                if (r2 != r4) goto L_0x0024
                goto L_0x0025
            L_0x0024:
                r4 = r3
            L_0x0025:
                if (r4 == 0) goto L_0x0060
                java.util.List r6 = r6.getParameters()
                kotlin.jvm.internal.C9971q.m14634f(r6, r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.collections.C9904h.m14841t(r6, r1)
                r0.<init>(r1)
                java.util.Iterator r6 = r6.iterator()
            L_0x003d:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L_0x0051
                java.lang.Object r1 = r6.next()
                og.f1 r1 = (p268og.AbstractC11319f1) r1
                fi.g1 r1 = r1.mo6111k()
                r0.add(r1)
                goto L_0x003d
            L_0x0051:
                java.util.List r6 = kotlin.collections.C9904h.m14888K0(r0, r7)
                java.util.Map r6 = p267of.C11286s.m10261r(r6)
                r7 = 2
                r0 = 0
                fi.h1 r6 = m23036e(r5, r6, r3, r7, r0)
                return r6
            L_0x0060:
                fi.e0 r6 = new fi.e0
                r6.<init>(r0, r7)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: fi.AbstractC7275h1.C7276a.m23039b(fi.g1, java.util.List):fi.n1");
        }

        /* renamed from: c */
        public final AbstractC7275h1 m23038c(Map<AbstractC7268g1, ? extends AbstractC7290k1> map) {
            C9971q.m14633g(map, "map");
            return m23036e(this, map, false, 2, null);
        }

        /* renamed from: d */
        public final AbstractC7275h1 m23037d(Map<AbstractC7268g1, ? extends AbstractC7290k1> map, boolean z) {
            C9971q.m14633g(map, "map");
            return new C0226a(map, z);
        }
    }

    /* renamed from: i */
    public static final AbstractC7299n1 m23042i(AbstractC7268g1 g1Var, List<? extends AbstractC7290k1> list) {
        return f15749c.m23039b(g1Var, list);
    }

    /* renamed from: j */
    public static final AbstractC7275h1 m23041j(Map<AbstractC7268g1, ? extends AbstractC7290k1> map) {
        return f15749c.m23038c(map);
    }

    @Override // fi.AbstractC7299n1
    /* renamed from: e */
    public AbstractC7290k1 mo5147e(AbstractC7267g0 key) {
        C9971q.m14633g(key, "key");
        return mo13138k(key.mo5172N0());
    }

    /* renamed from: k */
    public abstract AbstractC7290k1 mo13138k(AbstractC7268g1 g1Var);
}
