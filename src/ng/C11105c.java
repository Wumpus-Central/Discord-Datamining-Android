package ng;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import mg.EnumC10600c;
import p217lg.C10414c;
import p217lg.C10434k;
import p217lg.EnumC10426i;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11138d;
import p249nh.C11140e;
import p249nh.C11142f;
import p249nh.C11144h;
import p249nh.C11145i;
import p326ri.C12717t;
import p326ri.C12719v;
import p407wh.EnumC13886e;

/* renamed from: ng.c */
/* loaded from: classes8.dex */
public final class C11105c {

    /* renamed from: a */
    public static final C11105c f24626a;

    /* renamed from: b */
    private static final String f24627b;

    /* renamed from: c */
    private static final String f24628c;

    /* renamed from: d */
    private static final String f24629d;

    /* renamed from: e */
    private static final String f24630e;

    /* renamed from: f */
    private static final C11136b f24631f;

    /* renamed from: g */
    private static final C11137c f24632g;

    /* renamed from: h */
    private static final C11136b f24633h;

    /* renamed from: i */
    private static final C11136b f24634i;

    /* renamed from: j */
    private static final C11136b f24635j;

    /* renamed from: k */
    private static final HashMap<C11138d, C11136b> f24636k = new HashMap<>();

    /* renamed from: l */
    private static final HashMap<C11138d, C11136b> f24637l = new HashMap<>();

    /* renamed from: m */
    private static final HashMap<C11138d, C11137c> f24638m = new HashMap<>();

    /* renamed from: n */
    private static final HashMap<C11138d, C11137c> f24639n = new HashMap<>();

    /* renamed from: o */
    private static final HashMap<C11136b, C11136b> f24640o = new HashMap<>();

    /* renamed from: p */
    private static final HashMap<C11136b, C11136b> f24641p = new HashMap<>();

    /* renamed from: q */
    private static final List<C11106a> f24642q;

    /* renamed from: ng.c$a */
    /* loaded from: classes8.dex */
    public static final class C11106a {

        /* renamed from: a */
        private final C11136b f24643a;

        /* renamed from: b */
        private final C11136b f24644b;

        /* renamed from: c */
        private final C11136b f24645c;

        public C11106a(C11136b javaClass, C11136b kotlinReadOnly, C11136b kotlinMutable) {
            C9971q.m14633g(javaClass, "javaClass");
            C9971q.m14633g(kotlinReadOnly, "kotlinReadOnly");
            C9971q.m14633g(kotlinMutable, "kotlinMutable");
            this.f24643a = javaClass;
            this.f24644b = kotlinReadOnly;
            this.f24645c = kotlinMutable;
        }

        /* renamed from: a */
        public final C11136b m10893a() {
            return this.f24643a;
        }

        /* renamed from: b */
        public final C11136b m10892b() {
            return this.f24644b;
        }

        /* renamed from: c */
        public final C11136b m10891c() {
            return this.f24645c;
        }

        /* renamed from: d */
        public final C11136b m10890d() {
            return this.f24643a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11106a)) {
                return false;
            }
            C11106a aVar = (C11106a) obj;
            return C9971q.m14638b(this.f24643a, aVar.f24643a) && C9971q.m14638b(this.f24644b, aVar.f24644b) && C9971q.m14638b(this.f24645c, aVar.f24645c);
        }

        public int hashCode() {
            return (((this.f24643a.hashCode() * 31) + this.f24644b.hashCode()) * 31) + this.f24645c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f24643a + ", kotlinReadOnly=" + this.f24644b + ", kotlinMutable=" + this.f24645c + ')';
        }
    }

    static {
        List<C11106a> l;
        EnumC13886e[] values;
        C11105c cVar = new C11105c();
        f24626a = cVar;
        StringBuilder sb2 = new StringBuilder();
        EnumC10600c cVar2 = EnumC10600c.Function;
        sb2.append(cVar2.m12758c().toString());
        sb2.append('.');
        sb2.append(cVar2.m12759b());
        f24627b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        EnumC10600c cVar3 = EnumC10600c.KFunction;
        sb3.append(cVar3.m12758c().toString());
        sb3.append('.');
        sb3.append(cVar3.m12759b());
        f24628c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        EnumC10600c cVar4 = EnumC10600c.SuspendFunction;
        sb4.append(cVar4.m12758c().toString());
        sb4.append('.');
        sb4.append(cVar4.m12759b());
        f24629d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        EnumC10600c cVar5 = EnumC10600c.KSuspendFunction;
        sb5.append(cVar5.m12758c().toString());
        sb5.append('.');
        sb5.append(cVar5.m12759b());
        f24630e = sb5.toString();
        C11136b m = C11136b.m10805m(new C11137c("kotlin.jvm.functions.FunctionN"));
        C9971q.m14634f(m, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        f24631f = m;
        C11137c b = m.m10816b();
        C9971q.m14634f(b, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f24632g = b;
        C11145i iVar = C11145i.f24751a;
        f24633h = iVar.m10750k();
        f24634i = iVar.m10751j();
        f24635j = cVar.m10903g(Class.class);
        C11136b m2 = C11136b.m10805m(C10434k.C10435a.f38794T);
        C9971q.m14634f(m2, "topLevel(FqNames.iterable)");
        C11137c cVar6 = C10434k.C10435a.f22903b0;
        C11137c h = m2.m10810h();
        C11137c h2 = m2.m10810h();
        C9971q.m14634f(h2, "kotlinReadOnly.packageFqName");
        C11137c g = C11140e.m10773g(cVar6, h2);
        C11136b bVar = new C11136b(h, g, false);
        C11136b m3 = C11136b.m10805m(C10434k.C10435a.f38793S);
        C9971q.m14634f(m3, "topLevel(FqNames.iterator)");
        C11137c cVar7 = C10434k.C10435a.f22901a0;
        C11137c h3 = m3.m10810h();
        C11137c h4 = m3.m10810h();
        C9971q.m14634f(h4, "kotlinReadOnly.packageFqName");
        C11136b bVar2 = new C11136b(h3, C11140e.m10773g(cVar7, h4), false);
        C11136b m4 = C11136b.m10805m(C10434k.C10435a.f38795U);
        C9971q.m14634f(m4, "topLevel(FqNames.collection)");
        C11137c cVar8 = C10434k.C10435a.f22905c0;
        C11137c h5 = m4.m10810h();
        C11137c h6 = m4.m10810h();
        C9971q.m14634f(h6, "kotlinReadOnly.packageFqName");
        C11136b bVar3 = new C11136b(h5, C11140e.m10773g(cVar8, h6), false);
        C11136b m5 = C11136b.m10805m(C10434k.C10435a.f38796V);
        C9971q.m14634f(m5, "topLevel(FqNames.list)");
        C11137c cVar9 = C10434k.C10435a.f22907d0;
        C11137c h7 = m5.m10810h();
        C11137c h8 = m5.m10810h();
        C9971q.m14634f(h8, "kotlinReadOnly.packageFqName");
        C11136b bVar4 = new C11136b(h7, C11140e.m10773g(cVar9, h8), false);
        C11136b m6 = C11136b.m10805m(C10434k.C10435a.f38798X);
        C9971q.m14634f(m6, "topLevel(FqNames.set)");
        C11137c cVar10 = C10434k.C10435a.f22911f0;
        C11137c h9 = m6.m10810h();
        C11137c h10 = m6.m10810h();
        C9971q.m14634f(h10, "kotlinReadOnly.packageFqName");
        C11136b bVar5 = new C11136b(h9, C11140e.m10773g(cVar10, h10), false);
        C11136b m7 = C11136b.m10805m(C10434k.C10435a.f38797W);
        C9971q.m14634f(m7, "topLevel(FqNames.listIterator)");
        C11137c cVar11 = C10434k.C10435a.f22909e0;
        C11137c h11 = m7.m10810h();
        C11137c h12 = m7.m10810h();
        C9971q.m14634f(h12, "kotlinReadOnly.packageFqName");
        C11136b bVar6 = new C11136b(h11, C11140e.m10773g(cVar11, h12), false);
        C11137c cVar12 = C10434k.C10435a.f38799Y;
        C11136b m8 = C11136b.m10805m(cVar12);
        C9971q.m14634f(m8, "topLevel(FqNames.map)");
        C11137c cVar13 = C10434k.C10435a.f22913g0;
        C11137c h13 = m8.m10810h();
        C11137c h14 = m8.m10810h();
        C9971q.m14634f(h14, "kotlinReadOnly.packageFqName");
        C11136b bVar7 = new C11136b(h13, C11140e.m10773g(cVar13, h14), false);
        C11136b d = C11136b.m10805m(cVar12).m10814d(C10434k.C10435a.f38800Z.m10798g());
        C9971q.m14634f(d, "topLevel(FqNames.map).cr…mes.mapEntry.shortName())");
        C11137c cVar14 = C10434k.C10435a.f22915h0;
        C11137c h15 = d.m10810h();
        C11137c h16 = d.m10810h();
        C9971q.m14634f(h16, "kotlinReadOnly.packageFqName");
        l = C9906j.m14817l(new C11106a(cVar.m10903g(Iterable.class), m2, bVar), new C11106a(cVar.m10903g(Iterator.class), m3, bVar2), new C11106a(cVar.m10903g(Collection.class), m4, bVar3), new C11106a(cVar.m10903g(List.class), m5, bVar4), new C11106a(cVar.m10903g(Set.class), m6, bVar5), new C11106a(cVar.m10903g(ListIterator.class), m7, bVar6), new C11106a(cVar.m10903g(Map.class), m8, bVar7), new C11106a(cVar.m10903g(Map.Entry.class), d, new C11136b(h15, C11140e.m10773g(cVar14, h16), false)));
        f24642q = l;
        cVar.m10904f(Object.class, C10434k.C10435a.f22902b);
        cVar.m10904f(String.class, C10434k.C10435a.f22914h);
        cVar.m10904f(CharSequence.class, C10434k.C10435a.f22912g);
        cVar.m10905e(Throwable.class, C10434k.C10435a.f22940u);
        cVar.m10904f(Cloneable.class, C10434k.C10435a.f22906d);
        cVar.m10904f(Number.class, C10434k.C10435a.f22934r);
        cVar.m10905e(Comparable.class, C10434k.C10435a.f22942v);
        cVar.m10904f(Enum.class, C10434k.C10435a.f22936s);
        cVar.m10905e(Annotation.class, C10434k.C10435a.f38777G);
        for (C11106a aVar : l) {
            f24626a.m10906d(aVar);
        }
        for (EnumC13886e eVar : EnumC13886e.values()) {
            C11105c cVar15 = f24626a;
            C11136b m9 = C11136b.m10805m(eVar.m2389g());
            C9971q.m14634f(m9, "topLevel(jvmType.wrapperFqName)");
            EnumC10426i f = eVar.m2390f();
            C9971q.m14634f(f, "jvmType.primitiveType");
            C11136b m10 = C11136b.m10805m(C10434k.m13331c(f));
            C9971q.m14634f(m10, "topLevel(StandardNames.g…e(jvmType.primitiveType))");
            cVar15.m10909a(m9, m10);
        }
        for (C11136b bVar8 : C10414c.f22824a.m13456a()) {
            C11105c cVar16 = f24626a;
            C11136b m11 = C11136b.m10805m(new C11137c("kotlin.jvm.internal." + bVar8.m10808j().m10771b() + "CompanionObject"));
            C9971q.m14634f(m11, "topLevel(FqName(\"kotlin.…g() + \"CompanionObject\"))");
            C11136b d2 = bVar8.m10814d(C11144h.f24736d);
            C9971q.m14634f(d2, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            cVar16.m10909a(m11, d2);
        }
        for (int i = 0; i < 23; i++) {
            C11105c cVar17 = f24626a;
            C11136b m12 = C11136b.m10805m(new C11137c("kotlin.jvm.functions.Function" + i));
            C9971q.m14634f(m12, "topLevel(FqName(\"kotlin.…m.functions.Function$i\"))");
            cVar17.m10909a(m12, C10434k.m13333a(i));
            cVar17.m10907c(new C11137c(f24628c + i), f24633h);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            EnumC10600c cVar18 = EnumC10600c.KSuspendFunction;
            f24626a.m10907c(new C11137c((cVar18.m12758c().toString() + '.' + cVar18.m12759b()) + i2), f24633h);
        }
        C11105c cVar19 = f24626a;
        C11137c l2 = C10434k.C10435a.f22904c.m10782l();
        C9971q.m14634f(l2, "nothing.toSafe()");
        cVar19.m10907c(l2, cVar19.m10903g(Void.class));
    }

    private C11105c() {
    }

    /* renamed from: a */
    private final void m10909a(C11136b bVar, C11136b bVar2) {
        m10908b(bVar, bVar2);
        C11137c b = bVar2.m10816b();
        C9971q.m14634f(b, "kotlinClassId.asSingleFqName()");
        m10907c(b, bVar);
    }

    /* renamed from: b */
    private final void m10908b(C11136b bVar, C11136b bVar2) {
        HashMap<C11138d, C11136b> hashMap = f24636k;
        C11138d j = bVar.m10816b().m10795j();
        C9971q.m14634f(j, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j, bVar2);
    }

    /* renamed from: c */
    private final void m10907c(C11137c cVar, C11136b bVar) {
        HashMap<C11138d, C11136b> hashMap = f24637l;
        C11138d j = cVar.m10795j();
        C9971q.m14634f(j, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(j, bVar);
    }

    /* renamed from: d */
    private final void m10906d(C11106a aVar) {
        C11136b a = aVar.m10893a();
        C11136b b = aVar.m10892b();
        C11136b c = aVar.m10891c();
        m10909a(a, b);
        C11137c b2 = c.m10816b();
        C9971q.m14634f(b2, "mutableClassId.asSingleFqName()");
        m10907c(b2, a);
        f24640o.put(c, b);
        f24641p.put(b, c);
        C11137c b3 = b.m10816b();
        C9971q.m14634f(b3, "readOnlyClassId.asSingleFqName()");
        C11137c b4 = c.m10816b();
        C9971q.m14634f(b4, "mutableClassId.asSingleFqName()");
        HashMap<C11138d, C11137c> hashMap = f24638m;
        C11138d j = c.m10816b().m10795j();
        C9971q.m14634f(j, "mutableClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j, b3);
        HashMap<C11138d, C11137c> hashMap2 = f24639n;
        C11138d j2 = b3.m10795j();
        C9971q.m14634f(j2, "readOnlyFqName.toUnsafe()");
        hashMap2.put(j2, b4);
    }

    /* renamed from: e */
    private final void m10905e(Class<?> cls, C11137c cVar) {
        C11136b g = m10903g(cls);
        C11136b m = C11136b.m10805m(cVar);
        C9971q.m14634f(m, "topLevel(kotlinFqName)");
        m10909a(g, m);
    }

    /* renamed from: f */
    private final void m10904f(Class<?> cls, C11138d dVar) {
        C11137c l = dVar.m10782l();
        C9971q.m14634f(l, "kotlinFqName.toSafe()");
        m10905e(cls, l);
    }

    /* renamed from: g */
    private final C11136b m10903g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            C11136b m = C11136b.m10805m(new C11137c(cls.getCanonicalName()));
            C9971q.m14634f(m, "topLevel(FqName(clazz.canonicalName))");
            return m;
        }
        C11136b d = m10903g(declaringClass).m10814d(C11142f.m10767f(cls.getSimpleName()));
        C9971q.m14634f(d, "classId(outer).createNes…tifier(clazz.simpleName))");
        return d;
    }

    /* renamed from: j */
    private final boolean m10900j(C11138d dVar, String str) {
        String I0;
        boolean z;
        boolean E0;
        Integer m;
        String b = dVar.m10792b();
        C9971q.m14634f(b, "kotlinFqName.asString()");
        I0 = C12719v.m5716I0(b, str, "");
        if (I0.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            E0 = C12719v.m5721E0(I0, '0', false, 2, null);
            if (!E0) {
                m = C12717t.m5747m(I0);
                if (m == null || m.intValue() < 23) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final C11137c m10902h() {
        return f24632g;
    }

    /* renamed from: i */
    public final List<C11106a> m10901i() {
        return f24642q;
    }

    /* renamed from: k */
    public final boolean m10899k(C11138d dVar) {
        return f24638m.containsKey(dVar);
    }

    /* renamed from: l */
    public final boolean m10898l(C11138d dVar) {
        return f24639n.containsKey(dVar);
    }

    /* renamed from: m */
    public final C11136b m10897m(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        return f24636k.get(fqName.m10795j());
    }

    /* renamed from: n */
    public final C11136b m10896n(C11138d kotlinFqName) {
        C9971q.m14633g(kotlinFqName, "kotlinFqName");
        if (m10900j(kotlinFqName, f24627b)) {
            return f24631f;
        }
        if (m10900j(kotlinFqName, f24629d)) {
            return f24631f;
        }
        if (m10900j(kotlinFqName, f24628c)) {
            return f24633h;
        }
        if (m10900j(kotlinFqName, f24630e)) {
            return f24633h;
        }
        return f24637l.get(kotlinFqName);
    }

    /* renamed from: o */
    public final C11137c m10895o(C11138d dVar) {
        return f24638m.get(dVar);
    }

    /* renamed from: p */
    public final C11137c m10894p(C11138d dVar) {
        return f24639n.get(dVar);
    }
}
