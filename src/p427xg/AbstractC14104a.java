package p427xg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C9899f;
import kotlin.collections.C9914r;
import kotlin.collections.C9922x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p108fh.C7177i;
import p108fh.EnumC7174f;
import p163j$.util.concurrent.ConcurrentHashMap;
import p217lg.C10434k;
import p249nh.C11137c;
import pg.EnumC11684n;

/* renamed from: xg.a */
/* loaded from: classes8.dex */
public abstract class AbstractC14104a<TAnnotation> {

    /* renamed from: c */
    private static final C0457a f31828c = new C0457a(null);
    @Deprecated

    /* renamed from: d */
    private static final Map<String, EnumC14107b> f31829d;

    /* renamed from: a */
    private final C14161x f31830a;

    /* renamed from: b */
    private final ConcurrentHashMap<Object, TAnnotation> f31831b = new ConcurrentHashMap<>();

    /* renamed from: xg.a$a */
    /* loaded from: classes8.dex */
    private static final class C0457a {
        private C0457a() {
        }

        public /* synthetic */ C0457a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xg.a$b */
    /* loaded from: classes8.dex */
    public static final class C14105b extends AbstractC9973s implements Function1<TAnnotation, Boolean> {

        /* renamed from: k */
        public static final C14105b f31832k = new C14105b();

        C14105b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(TAnnotation extractNullability) {
            C9971q.m14633g(extractNullability, "$this$extractNullability");
            return Boolean.FALSE;
        }
    }

    static {
        EnumC14107b[] values;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC14107b bVar : EnumC14107b.values()) {
            String b = bVar.m1643b();
            if (linkedHashMap.get(b) == null) {
                linkedHashMap.put(b, bVar);
            }
        }
        f31829d = linkedHashMap;
    }

    public AbstractC14104a(C14161x javaTypeEnhancementState) {
        C9971q.m14633g(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f31830a = javaTypeEnhancementState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final Set<EnumC14107b> m1667a(Set<? extends EnumC14107b> set) {
        Set H0;
        Set k;
        Set<EnumC14107b> l;
        if (!set.contains(EnumC14107b.TYPE_USE)) {
            return set;
        }
        H0 = C9899f.m14957H0(EnumC14107b.values());
        k = C9922x.m14715k(H0, EnumC14107b.TYPE_PARAMETER_BOUNDS);
        l = C9922x.m14714l(k, set);
        return l;
    }

    /* renamed from: d */
    private final C14150r m1665d(TAnnotation tannotation) {
        C7177i g;
        C14150r r = m1654r(tannotation);
        if (r != null) {
            return r;
        }
        Pair<TAnnotation, Set<EnumC14107b>> t = m1652t(tannotation);
        if (t == null) {
            return null;
        }
        TAnnotation a = t.m15067a();
        Set<EnumC14107b> b = t.m15066b();
        EnumC14123g0 q = m1655q(tannotation);
        if (q == null) {
            q = m1656p(a);
        }
        if (!q.m1586c() && (g = m1662g(a, C14105b.f31832k)) != null) {
            return new C14150r(C7177i.m23274b(g, null, q.m1585d(), 1, null), b, false, 4, null);
        }
        return null;
    }

    /* renamed from: g */
    private final C7177i m1662g(TAnnotation tannotation, Function1<? super TAnnotation, Boolean> function1) {
        C7177i n;
        C7177i n2 = m1658n(tannotation, function1.invoke(tannotation).booleanValue());
        if (n2 != null) {
            return n2;
        }
        TAnnotation s = m1653s(tannotation);
        if (s == null) {
            return null;
        }
        EnumC14123g0 p = m1656p(tannotation);
        if (!p.m1586c() && (n = m1658n(s, function1.invoke(s).booleanValue())) != null) {
            return C7177i.m23274b(n, null, p.m1585d(), 1, null);
        }
        return null;
    }

    /* renamed from: h */
    private final TAnnotation m1661h(TAnnotation tannotation, C11137c cVar) {
        for (TAnnotation tannotation2 : mo1619k(tannotation)) {
            if (C9971q.m14638b(mo1621i(tannotation2), cVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    /* renamed from: l */
    private final boolean m1660l(TAnnotation tannotation, C11137c cVar) {
        Iterable<TAnnotation> k = mo1619k(tannotation);
        if ((k instanceof Collection) && ((Collection) k).isEmpty()) {
            return false;
        }
        for (TAnnotation tannotation2 : k) {
            if (C9971q.m14638b(mo1621i(tannotation2), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (r6.equals("ALWAYS") != false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
        if (r6.equals("NEVER") == false) goto L_0x009c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
        if (r6.equals("MAYBE") == false) goto L_0x009c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
        r6 = p108fh.EnumC7176h.NULLABLE;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p108fh.C7177i m1658n(TAnnotation r6, boolean r7) {
        /*
            r5 = this;
            nh.c r0 = r5.mo1621i(r6)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            xg.x r2 = r5.f31830a
            kotlin.jvm.functions.Function1 r2 = r2.m1482c()
            java.lang.Object r2 = r2.invoke(r0)
            xg.g0 r2 = (p427xg.EnumC14123g0) r2
            boolean r3 = r2.m1586c()
            if (r3 == 0) goto L_0x001b
            return r1
        L_0x001b:
            java.util.List r3 = p427xg.C14110c0.m1624l()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L_0x002a
            fh.h r6 = p108fh.EnumC7176h.NULLABLE
            goto L_0x00d3
        L_0x002a:
            java.util.List r3 = p427xg.C14110c0.m1625k()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x0038
            fh.h r6 = p108fh.EnumC7176h.NOT_NULL
            goto L_0x00d3
        L_0x0038:
            nh.c r3 = p427xg.C14110c0.m1629g()
            boolean r3 = kotlin.jvm.internal.C9971q.m14638b(r0, r3)
            if (r3 == 0) goto L_0x0046
            fh.h r6 = p108fh.EnumC7176h.NULLABLE
            goto L_0x00d3
        L_0x0046:
            nh.c r3 = p427xg.C14110c0.m1628h()
            boolean r3 = kotlin.jvm.internal.C9971q.m14638b(r0, r3)
            if (r3 == 0) goto L_0x0054
            fh.h r6 = p108fh.EnumC7176h.FORCE_FLEXIBILITY
            goto L_0x00d3
        L_0x0054:
            nh.c r3 = p427xg.C14110c0.m1630f()
            boolean r3 = kotlin.jvm.internal.C9971q.m14638b(r0, r3)
            if (r3 == 0) goto L_0x00a0
            java.lang.Iterable r6 = r5.mo1622b(r6, r4)
            java.lang.Object r6 = kotlin.collections.C9904h.m14877V(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x009d
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L_0x0090;
                case 74175084: goto L_0x0087;
                case 433141802: goto L_0x007b;
                case 1933739535: goto L_0x0072;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x009c
        L_0x0072:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x009c
            goto L_0x009d
        L_0x007b:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0084
            goto L_0x009c
        L_0x0084:
            fh.h r6 = p108fh.EnumC7176h.FORCE_FLEXIBILITY
            goto L_0x00d3
        L_0x0087:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0099
            goto L_0x009c
        L_0x0090:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0099
            goto L_0x009c
        L_0x0099:
            fh.h r6 = p108fh.EnumC7176h.NULLABLE
            goto L_0x00d3
        L_0x009c:
            return r1
        L_0x009d:
            fh.h r6 = p108fh.EnumC7176h.NOT_NULL
            goto L_0x00d3
        L_0x00a0:
            nh.c r6 = p427xg.C14110c0.m1632d()
            boolean r6 = kotlin.jvm.internal.C9971q.m14638b(r0, r6)
            if (r6 == 0) goto L_0x00ad
            fh.h r6 = p108fh.EnumC7176h.NULLABLE
            goto L_0x00d3
        L_0x00ad:
            nh.c r6 = p427xg.C14110c0.m1633c()
            boolean r6 = kotlin.jvm.internal.C9971q.m14638b(r0, r6)
            if (r6 == 0) goto L_0x00ba
            fh.h r6 = p108fh.EnumC7176h.NOT_NULL
            goto L_0x00d3
        L_0x00ba:
            nh.c r6 = p427xg.C14110c0.m1635a()
            boolean r6 = kotlin.jvm.internal.C9971q.m14638b(r0, r6)
            if (r6 == 0) goto L_0x00c7
            fh.h r6 = p108fh.EnumC7176h.NOT_NULL
            goto L_0x00d3
        L_0x00c7:
            nh.c r6 = p427xg.C14110c0.m1634b()
            boolean r6 = kotlin.jvm.internal.C9971q.m14638b(r0, r6)
            if (r6 == 0) goto L_0x00e2
            fh.h r6 = p108fh.EnumC7176h.NULLABLE
        L_0x00d3:
            fh.i r0 = new fh.i
            boolean r1 = r2.m1585d()
            if (r1 != 0) goto L_0x00dd
            if (r7 == 0) goto L_0x00de
        L_0x00dd:
            r4 = 1
        L_0x00de:
            r0.<init>(r6, r4)
            return r0
        L_0x00e2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p427xg.AbstractC14104a.m1658n(java.lang.Object, boolean):fh.i");
    }

    /* renamed from: o */
    private final EnumC14123g0 m1657o(TAnnotation tannotation) {
        C11137c i = mo1621i(tannotation);
        if (i == null || !C14109c.m1640c().containsKey(i)) {
            return m1656p(tannotation);
        }
        return this.f31830a.m1482c().invoke(i);
    }

    /* renamed from: p */
    private final EnumC14123g0 m1656p(TAnnotation tannotation) {
        EnumC14123g0 q = m1655q(tannotation);
        if (q != null) {
            return q;
        }
        return this.f31830a.m1481d().m1476a();
    }

    /* renamed from: q */
    private final EnumC14123g0 m1655q(TAnnotation tannotation) {
        Iterable<String> b;
        Object V;
        EnumC14123g0 g0Var = this.f31830a.m1481d().m1474c().get(mo1621i(tannotation));
        if (g0Var != null) {
            return g0Var;
        }
        TAnnotation h = m1661h(tannotation, C14109c.m1639d());
        if (h == null || (b = mo1622b(h, false)) == null) {
            return null;
        }
        V = C9914r.m14769V(b);
        String str = (String) V;
        if (str == null) {
            return null;
        }
        EnumC14123g0 b2 = this.f31830a.m1481d().m1475b();
        if (b2 != null) {
            return b2;
        }
        int hashCode = str.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && str.equals("WARN")) {
                    return EnumC14123g0.WARN;
                }
                return null;
            } else if (!str.equals("STRICT")) {
                return null;
            } else {
                return EnumC14123g0.STRICT;
            }
        } else if (!str.equals("IGNORE")) {
            return null;
        } else {
            return EnumC14123g0.IGNORE;
        }
    }

    /* renamed from: r */
    private final C14150r m1654r(TAnnotation tannotation) {
        C14150r rVar;
        boolean z;
        if (this.f31830a.m1483b() || (rVar = C14109c.m1642a().get(mo1621i(tannotation))) == null) {
            return null;
        }
        EnumC14123g0 o = m1657o(tannotation);
        if (o != EnumC14123g0.IGNORE) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            o = null;
        }
        if (o == null) {
            return null;
        }
        return C14150r.m1519b(rVar, C7177i.m23274b(rVar.m1517d(), null, o.m1585d(), 1, null), null, false, 6, null);
    }

    /* renamed from: t */
    private final Pair<TAnnotation, Set<EnumC14107b>> m1652t(TAnnotation tannotation) {
        TAnnotation h;
        TAnnotation tannotation2;
        boolean z;
        if (this.f31830a.m1481d().m1473d() || (h = m1661h(tannotation, C14109c.m1638e())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = mo1619k(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation2 = null;
                break;
            }
            tannotation2 = it.next();
            if (m1653s(tannotation2) != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        Iterable<String> b = mo1622b(h, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : b) {
            EnumC14107b bVar = f31829d.get(str);
            if (bVar != null) {
                linkedHashSet.add(bVar);
            }
        }
        return new Pair<>(tannotation2, m1667a(linkedHashSet));
    }

    /* renamed from: b */
    protected abstract Iterable<String> mo1622b(TAnnotation tannotation, boolean z);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final C14164y m1666c(C14164y yVar, Iterable<? extends TAnnotation> annotations) {
        EnumMap enumMap;
        EnumMap<EnumC14107b, C14150r> b;
        C9971q.m14633g(annotations, "annotations");
        if (this.f31830a.m1483b()) {
            return yVar;
        }
        ArrayList<C14150r> arrayList = new ArrayList();
        Iterator<? extends TAnnotation> it = annotations.iterator();
        while (it.hasNext()) {
            C14150r d = m1665d(it.next());
            if (d != null) {
                arrayList.add(d);
            }
        }
        if (arrayList.isEmpty()) {
            return yVar;
        }
        if (yVar == null || (b = yVar.m1477b()) == null) {
            enumMap = new EnumMap(EnumC14107b.class);
        } else {
            enumMap = new EnumMap((EnumMap) b);
        }
        boolean z = false;
        for (C14150r rVar : arrayList) {
            for (EnumC14107b bVar : rVar.m1516e()) {
                enumMap.put((EnumMap) bVar, (EnumC14107b) rVar);
                z = true;
            }
        }
        if (!z) {
            return yVar;
        }
        return new C14164y(enumMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final EnumC7174f m1664e(Iterable<? extends TAnnotation> annotations) {
        EnumC7174f fVar;
        C9971q.m14633g(annotations, "annotations");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        EnumC7174f fVar2 = null;
        while (it.hasNext()) {
            C11137c i = mo1621i(it.next());
            if (C14110c0.m1623m().contains(i)) {
                fVar = EnumC7174f.READ_ONLY;
            } else if (C14110c0.m1626j().contains(i)) {
                fVar = EnumC7174f.MUTABLE;
            } else {
                continue;
            }
            if (fVar2 != null && fVar2 != fVar) {
                return null;
            }
            fVar2 = fVar;
        }
        return fVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final C7177i m1663f(Iterable<? extends TAnnotation> annotations, Function1<? super TAnnotation, Boolean> forceWarning) {
        C9971q.m14633g(annotations, "annotations");
        C9971q.m14633g(forceWarning, "forceWarning");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        C7177i iVar = null;
        while (it.hasNext()) {
            C7177i g = m1662g(it.next(), forceWarning);
            if (iVar != null) {
                if (g != null && !C9971q.m14638b(g, iVar) && (!g.m23272d() || iVar.m23272d())) {
                    if (g.m23272d() || !iVar.m23272d()) {
                        return null;
                    }
                }
            }
            iVar = g;
        }
        return iVar;
    }

    /* renamed from: i */
    protected abstract C11137c mo1621i(TAnnotation tannotation);

    /* renamed from: j */
    protected abstract Object mo1620j(TAnnotation tannotation);

    /* renamed from: k */
    protected abstract Iterable<TAnnotation> mo1619k(TAnnotation tannotation);

    /* renamed from: m */
    public final boolean m1659m(TAnnotation annotation) {
        C9971q.m14633g(annotation, "annotation");
        TAnnotation h = m1661h(annotation, C10434k.C10435a.f38779H);
        if (h == null) {
            return false;
        }
        Iterable<String> b = mo1622b(h, false);
        if ((b instanceof Collection) && ((Collection) b).isEmpty()) {
            return false;
        }
        for (String str : b) {
            if (C9971q.m14638b(str, EnumC11684n.TYPE.name())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final TAnnotation m1653s(TAnnotation annotation) {
        boolean M;
        TAnnotation tannotation;
        C9971q.m14633g(annotation, "annotation");
        if (this.f31830a.m1481d().m1473d()) {
            return null;
        }
        M = C9914r.m14778M(C14109c.m1641b(), mo1621i(annotation));
        if (M || m1660l(annotation, C14109c.m1637f())) {
            return annotation;
        }
        if (!m1660l(annotation, C14109c.m1636g())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f31831b;
        Object j = mo1620j(annotation);
        TAnnotation tannotation2 = concurrentHashMap.get(j);
        if (tannotation2 != null) {
            return tannotation2;
        }
        Iterator<TAnnotation> it = mo1619k(annotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation = null;
                break;
            }
            tannotation = m1653s(it.next());
            if (tannotation != null) {
                break;
            }
        }
        if (tannotation == null) {
            return null;
        }
        TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(j, tannotation);
        if (putIfAbsent == null) {
            return tannotation;
        }
        return putIfAbsent;
    }
}
