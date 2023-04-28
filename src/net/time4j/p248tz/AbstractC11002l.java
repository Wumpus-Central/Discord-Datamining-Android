package net.time4j.p248tz;

import android.util.TimeUtils;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.AbstractC10817f;
import net.time4j.base.AbstractC10818g;
import p163j$.util.Spliterator;

/* renamed from: net.time4j.tz.l */
/* loaded from: classes8.dex */
public abstract class AbstractC11002l implements Serializable {

    /* renamed from: A */
    private static final ReferenceQueue<AbstractC11002l> f38947A;

    /* renamed from: B */
    private static final LinkedList<AbstractC11002l> f38948B;

    /* renamed from: C */
    private static final ConcurrentMap<String, AbstractC11030r> f38949C;

    /* renamed from: D */
    static final AbstractC11031s f38950D;

    /* renamed from: E */
    private static final AbstractC11002l f38951E;

    /* renamed from: k */
    private static final String f24450k = System.getProperty("line.separator");

    /* renamed from: l */
    private static final String f24451l = System.getProperty("net.time4j.tz.repository.version");

    /* renamed from: m */
    private static final Comparator<AbstractC11001k> f24452m = new C11003a();

    /* renamed from: n */
    public static final AbstractC11027o f24453n;

    /* renamed from: o */
    public static final AbstractC11027o f24454o;

    /* renamed from: p */
    private static final boolean f24455p;

    /* renamed from: q */
    private static final boolean f24456q;

    /* renamed from: r */
    private static volatile C11007e f24457r;

    /* renamed from: s */
    private static volatile AbstractC11002l f24458s;

    /* renamed from: t */
    private static volatile boolean f24459t;

    /* renamed from: u */
    private static int f24460u;

    /* renamed from: v */
    private static final Map<String, AbstractC11001k> f24461v;

    /* renamed from: w */
    private static final Map<String, AbstractC11001k> f24462w;

    /* renamed from: x */
    private static final AbstractC11030r f24463x;

    /* renamed from: y */
    private static final AbstractC11030r f24464y;

    /* renamed from: z */
    private static final ConcurrentMap<String, C11005c> f24465z;

    /* renamed from: net.time4j.tz.l$a */
    /* loaded from: classes8.dex */
    static class C11003a implements Comparator<AbstractC11001k> {
        C11003a() {
        }

        /* renamed from: b */
        public int compare(AbstractC11001k kVar, AbstractC11001k kVar2) {
            return kVar.mo11196a().compareTo(kVar2.mo11196a());
        }
    }

    /* renamed from: net.time4j.tz.l$b */
    /* loaded from: classes8.dex */
    public static class C11004b {
        /* renamed from: a */
        public static void m11284a() {
            synchronized (AbstractC11002l.class) {
                while (AbstractC11002l.f38947A.poll() != null) {
                }
                AbstractC11002l.f38948B.clear();
            }
            C11007e unused = AbstractC11002l.f24457r = new C11007e();
            AbstractC11002l.f24465z.clear();
            if (AbstractC11002l.f24456q) {
                AbstractC11002l unused2 = AbstractC11002l.f24458s = AbstractC11002l.m11290v();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.tz.l$c */
    /* loaded from: classes8.dex */
    public static class C11005c extends SoftReference<AbstractC11002l> {

        /* renamed from: a */
        private final String f24466a;

        C11005c(AbstractC11002l lVar, ReferenceQueue<AbstractC11002l> referenceQueue) {
            super(lVar, referenceQueue);
            this.f24466a = lVar.mo11286z().mo11196a();
        }
    }

    /* renamed from: net.time4j.tz.l$d */
    /* loaded from: classes8.dex */
    private static class C11006d implements AbstractC11030r, AbstractC11031s {
        private C11006d() {
        }

        /* synthetic */ C11006d(C11003a aVar) {
            this();
        }

        @Override // net.time4j.p248tz.AbstractC11030r
        /* renamed from: a */
        public String mo8643a() {
            return "";
        }

        @Override // net.time4j.p248tz.AbstractC11030r
        /* renamed from: b */
        public AbstractC11031s mo8642b() {
            return this;
        }

        @Override // net.time4j.p248tz.AbstractC11031s
        /* renamed from: c */
        public Set<String> mo8629c(Locale locale, boolean z) {
            return Collections.emptySet();
        }

        @Override // net.time4j.p248tz.AbstractC11030r
        /* renamed from: d */
        public Map<String, String> mo8640d() {
            return Collections.emptyMap();
        }

        @Override // net.time4j.p248tz.AbstractC11031s
        /* renamed from: e */
        public String mo8627e(boolean z, Locale locale) {
            return z ? "GMT" : "GMT±hh:mm";
        }

        @Override // net.time4j.p248tz.AbstractC11030r
        /* renamed from: f */
        public String mo8638f() {
            return TimeUtils.getTimeZoneDatabaseVersion();
        }

        @Override // net.time4j.p248tz.AbstractC11031s
        /* renamed from: g */
        public String mo8625g(String str, EnumC10994d dVar, Locale locale) {
            if (locale == null) {
                throw new NullPointerException("Missing locale.");
            } else if (str.isEmpty()) {
                return "";
            } else {
                TimeZone R = C10998h.m11330R(str);
                if (R.getID().equals(str)) {
                    return R.getDisplayName(dVar.m11331b(), !dVar.m11332a(), locale);
                }
                return "";
            }
        }

        @Override // net.time4j.p248tz.AbstractC11030r
        public String getName() {
            return "java.util.TimeZone";
        }

        @Override // net.time4j.p248tz.AbstractC11030r
        /* renamed from: h */
        public Set<String> mo8636h() {
            HashSet hashSet = new HashSet();
            hashSet.addAll(Arrays.asList(TimeZone.getAvailableIDs()));
            return hashSet;
        }

        @Override // net.time4j.p248tz.AbstractC11030r
        /* renamed from: i */
        public String mo8635i() {
            return "";
        }

        @Override // net.time4j.p248tz.AbstractC11030r
        public AbstractC11008m load(String str) {
            return null;
        }
    }

    /* renamed from: net.time4j.tz.l$e */
    /* loaded from: classes8.dex */
    private static class C11007e {

        /* renamed from: a */
        private final List<AbstractC11001k> f24467a;

        /* renamed from: b */
        private final List<AbstractC11001k> f24468b;

        C11007e() {
            ArrayList arrayList = new ArrayList((int) Spliterator.IMMUTABLE);
            ArrayList arrayList2 = new ArrayList((int) Spliterator.IMMUTABLE);
            arrayList.add(C11028p.f24516u);
            for (Map.Entry entry : AbstractC11002l.f38949C.entrySet()) {
                AbstractC11030r rVar = (AbstractC11030r) entry.getValue();
                if (rVar != AbstractC11002l.f24463x || AbstractC11002l.f24464y == AbstractC11002l.f24463x) {
                    for (String str : rVar.mo8636h()) {
                        AbstractC11001k P = AbstractC11002l.m11308P(str);
                        if (!arrayList.contains(P)) {
                            arrayList.add(P);
                        }
                    }
                    arrayList2.addAll(arrayList);
                    for (String str2 : rVar.mo8640d().keySet()) {
                        AbstractC11001k P2 = AbstractC11002l.m11308P(str2);
                        if (!arrayList2.contains(P2)) {
                            arrayList2.add(P2);
                        }
                    }
                }
            }
            Collections.sort(arrayList, AbstractC11002l.f24452m);
            Collections.sort(arrayList2, AbstractC11002l.f24452m);
            this.f24467a = Collections.unmodifiableList(arrayList);
            this.f24468b = Collections.unmodifiableList(arrayList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ab  */
    static {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.p248tz.AbstractC11002l.<clinit>():void");
    }

    /* renamed from: C */
    public static Set<AbstractC11001k> m11321C(Locale locale, boolean z, String str) {
        AbstractC11030r D = m11320D(str);
        if (D == null) {
            return Collections.emptySet();
        }
        AbstractC11031s b = D.mo8642b();
        if (b == null) {
            b = f38950D;
        }
        HashSet hashSet = new HashSet();
        for (String str2 : b.mo8629c(locale, z)) {
            hashSet.add(m11308P(str2));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: D */
    private static AbstractC11030r m11320D(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Missing zone model provider.");
        } else if (str.equals("DEFAULT")) {
            return f24464y;
        } else {
            return f38949C.get(str);
        }
    }

    /* renamed from: F */
    private static AbstractC11002l m11318F(AbstractC11001k kVar, String str, boolean z) {
        AbstractC11002l lVar;
        String str2;
        String str3;
        ConcurrentMap<String, C11005c> concurrentMap = f24465z;
        C11005c cVar = concurrentMap.get(str);
        if (cVar != null) {
            lVar = cVar.get();
            if (lVar == null) {
                concurrentMap.remove(cVar.f24466a);
            }
        } else {
            lVar = null;
        }
        if (lVar != null) {
            return lVar;
        }
        String str4 = "";
        int length = str.length();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = str;
                break;
            } else if (str.charAt(i) == '~') {
                str4 = str.substring(0, i);
                str2 = str.substring(i + 1);
                break;
            } else {
                i++;
            }
        }
        if (!str2.isEmpty()) {
            AbstractC11030r rVar = f24464y;
            if (str4.isEmpty() || str4.equals("DEFAULT")) {
                z2 = true;
            }
            if (z2 || (rVar = f38949C.get(str4)) != null) {
                if (kVar == null) {
                    if (z2) {
                        kVar = m11308P(str2);
                        if (kVar instanceof C11028p) {
                            return ((C11028p) kVar).m11186k();
                        }
                    } else {
                        kVar = new C10995e(str);
                    }
                }
                if (rVar == f24463x) {
                    C10998h hVar = new C10998h(kVar, str2);
                    if (!hVar.m11328T() || str2.equals("GMT") || str2.startsWith("UT") || str2.equals("Z")) {
                        lVar = hVar;
                    }
                } else {
                    AbstractC11008m load = rVar.load(str2);
                    if (load == null) {
                        lVar = m11316H(rVar, kVar, str2);
                    } else {
                        lVar = new C10993c(kVar, load);
                    }
                }
                if (lVar == null) {
                    if (!z) {
                        return null;
                    }
                    if (TimeZone.getDefault().getID().equals(str)) {
                        return new C10998h(new C10995e(str));
                    }
                    throw new IllegalArgumentException("Unknown timezone: " + str);
                } else if (!f24459t) {
                    return lVar;
                } else {
                    C11005c putIfAbsent = f24465z.putIfAbsent(str, new C11005c(lVar, f38947A));
                    if (putIfAbsent == null) {
                        synchronized (AbstractC11002l.class) {
                            f38948B.addFirst(lVar);
                            while (true) {
                                LinkedList<AbstractC11002l> linkedList = f38948B;
                                if (linkedList.size() >= f24460u) {
                                    linkedList.removeLast();
                                }
                            }
                        }
                        return lVar;
                    }
                    AbstractC11002l lVar2 = putIfAbsent.get();
                    if (lVar2 != null) {
                        return lVar2;
                    }
                    return lVar;
                }
            } else if (!z) {
                return null;
            } else {
                if (str4.equals("TZDB")) {
                    str3 = "TZDB provider not available: ";
                } else {
                    str3 = "Timezone model provider not registered: ";
                }
                throw new IllegalArgumentException(str3 + str);
            }
        } else if (!z) {
            return null;
        } else {
            throw new IllegalArgumentException("Timezone key is empty.");
        }
    }

    /* renamed from: G */
    private static AbstractC11002l m11317G(AbstractC11001k kVar, boolean z) {
        if (kVar instanceof C11028p) {
            return ((C11028p) kVar).m11186k();
        }
        return m11318F(kVar, kVar.mo11196a(), z);
    }

    /* renamed from: H */
    private static AbstractC11002l m11316H(AbstractC11030r rVar, AbstractC11001k kVar, String str) {
        Map<String, String> d = rVar.mo8640d();
        String str2 = str;
        AbstractC11008m mVar = null;
        while (mVar == null) {
            str2 = d.get(str2);
            if (str2 == null) {
                break;
            }
            mVar = rVar.load(str2);
        }
        if (mVar != null) {
            return new C10993c(kVar, mVar);
        }
        String i = rVar.mo8635i();
        if (i.isEmpty()) {
            return null;
        }
        if (!i.equals(rVar.getName())) {
            return new C10991a(kVar, m11311M(i + "~" + str));
        }
        throw new IllegalArgumentException("Circular zone model provider fallback: " + rVar.getName());
    }

    /* renamed from: L */
    private static List<Class<? extends AbstractC11001k>> m11312L(ClassLoader classLoader, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Class<?> cls = Class.forName("net.time4j.tz.olson." + str, true, classLoader);
            if (AbstractC11001k.class.isAssignableFrom(cls)) {
                arrayList.add(cls);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: M */
    public static AbstractC11002l m11311M(String str) {
        return m11318F(null, str, true);
    }

    /* renamed from: N */
    public static AbstractC11002l m11310N(AbstractC11001k kVar) {
        return m11317G(kVar, true);
    }

    /* renamed from: O */
    public static AbstractC11002l m11309O() {
        if (!f24456q || f24458s == null) {
            return f38951E;
        }
        return f24458s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static AbstractC11001k m11308P(String str) {
        AbstractC11001k kVar = f24461v.get(str);
        if (kVar != null) {
            return kVar;
        }
        if (str.startsWith("GMT")) {
            str = "UTC" + str.substring(3);
        }
        C11028p s = C11028p.m11178s(str, false);
        if (s == null) {
            return new C10995e(str);
        }
        return s;
    }

    /* renamed from: r */
    private static AbstractC11030r m11294r(AbstractC11030r rVar, AbstractC11030r rVar2) {
        String f = rVar.mo8638f();
        if (!f.isEmpty()) {
            String str = f24451l;
            if (f.equals(str)) {
                return rVar;
            }
            if (str == null) {
                if (rVar2 == null || f.compareTo(rVar2.mo8638f()) > 0) {
                    return rVar;
                }
                if (f.compareTo(rVar2.mo8638f()) == 0 && !rVar.mo8643a().contains("{java.home}")) {
                    return rVar;
                }
            }
        }
        return rVar2;
    }

    /* renamed from: s */
    private static void m11293s(Map<String, AbstractC11001k> map) {
        C11028p pVar = C11028p.f24516u;
        map.put("Etc/GMT", pVar);
        map.put("Etc/Greenwich", pVar);
        map.put("Etc/Universal", pVar);
        map.put("Etc/Zulu", pVar);
        map.put("Etc/GMT+0", pVar);
        map.put("Etc/GMT-0", pVar);
        map.put("Etc/GMT0", pVar);
        map.put("Etc/UTC", pVar);
        map.put("Etc/UCT", pVar);
        map.put("Etc/GMT-14", C11028p.m11181p(50400));
        map.put("Etc/GMT-13", C11028p.m11181p(46800));
        map.put("Etc/GMT-12", C11028p.m11181p(43200));
        map.put("Etc/GMT-11", C11028p.m11181p(39600));
        map.put("Etc/GMT-10", C11028p.m11181p(36000));
        map.put("Etc/GMT-9", C11028p.m11181p(32400));
        map.put("Etc/GMT-8", C11028p.m11181p(28800));
        map.put("Etc/GMT-7", C11028p.m11181p(25200));
        map.put("Etc/GMT-6", C11028p.m11181p(21600));
        map.put("Etc/GMT-5", C11028p.m11181p(18000));
        map.put("Etc/GMT-4", C11028p.m11181p(14400));
        map.put("Etc/GMT-3", C11028p.m11181p(10800));
        map.put("Etc/GMT-2", C11028p.m11181p(7200));
        map.put("Etc/GMT-1", C11028p.m11181p(3600));
        map.put("Etc/GMT+1", C11028p.m11181p(-3600));
        map.put("Etc/GMT+2", C11028p.m11181p(-7200));
        map.put("Etc/GMT+3", C11028p.m11181p(-10800));
        map.put("Etc/GMT+4", C11028p.m11181p(-14400));
        map.put("Etc/GMT+5", C11028p.m11181p(-18000));
        map.put("Etc/GMT+6", C11028p.m11181p(-21600));
        map.put("Etc/GMT+7", C11028p.m11181p(-25200));
        map.put("Etc/GMT+8", C11028p.m11181p(-28800));
        map.put("Etc/GMT+9", C11028p.m11181p(-32400));
        map.put("Etc/GMT+10", C11028p.m11181p(-36000));
        map.put("Etc/GMT+11", C11028p.m11181p(-39600));
        map.put("Etc/GMT+12", C11028p.m11181p(-43200));
    }

    /* renamed from: t */
    public static List<AbstractC11001k> m11292t() {
        return f24457r.f24467a;
    }

    /* renamed from: u */
    public static List<AbstractC11001k> m11291u(String str) {
        if (str.equals("INCLUDE_ALIAS")) {
            return f24457r.f24468b;
        }
        AbstractC11030r D = m11320D(str);
        if (D == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : D.mo8636h()) {
            arrayList.add(m11308P(str2));
        }
        Collections.sort(arrayList, f24452m);
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static AbstractC11002l m11290v() {
        String id2 = TimeZone.getDefault().getID();
        AbstractC11002l F = m11318F(null, id2, false);
        if (F == null) {
            return new C10998h(new C10995e(id2));
        }
        return F;
    }

    /* renamed from: x */
    public static String m11288x(AbstractC11001k kVar, EnumC10994d dVar, Locale locale) {
        String str;
        String a = kVar.mo11196a();
        int indexOf = a.indexOf(126);
        AbstractC11030r rVar = f24464y;
        if (indexOf >= 0) {
            String substring = a.substring(0, indexOf);
            if (!substring.equals("DEFAULT") && (rVar = f38949C.get(substring)) == null) {
                return a;
            }
            str = a.substring(indexOf + 1);
        } else {
            str = a;
        }
        AbstractC11031s b = rVar.mo8642b();
        if (b == null) {
            b = f38950D;
        }
        String g = b.mo8625g(str, dVar, locale);
        if (!g.isEmpty()) {
            return g;
        }
        AbstractC11031s sVar = f38950D;
        if (b != sVar) {
            g = sVar.mo8625g(str, dVar, locale);
        }
        if (!g.isEmpty()) {
            a = g;
        }
        return a;
    }

    /* renamed from: A */
    public abstract C11028p mo11323A(AbstractC10811a aVar, AbstractC10818g gVar);

    /* renamed from: B */
    public abstract C11028p mo11322B(AbstractC10817f fVar);

    /* renamed from: E */
    public abstract AbstractC11027o mo11319E();

    /* renamed from: I */
    public abstract boolean mo11315I(AbstractC10817f fVar);

    /* renamed from: J */
    public abstract boolean mo11314J();

    /* renamed from: K */
    public abstract boolean mo11313K(AbstractC10811a aVar, AbstractC10818g gVar);

    /* renamed from: Q */
    public abstract AbstractC11002l mo11307Q(AbstractC11027o oVar);

    /* renamed from: w */
    public String mo11289w(EnumC10994d dVar, Locale locale) {
        return m11288x(mo11286z(), dVar, locale);
    }

    /* renamed from: y */
    public abstract AbstractC11008m mo11287y();

    /* renamed from: z */
    public abstract AbstractC11001k mo11286z();
}
