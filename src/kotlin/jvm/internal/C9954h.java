package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.reflect.KClass;
import nf.AbstractC11069g;
import nf.C11098x;
import p267of.C11288u;
import p267of.C11289v;
import p326ri.C12719v;
import p446yf.C14376a;
import p466zf.AbstractC14628a;
import p466zf.AbstractC14629b;
import p466zf.AbstractC14630c;
import p466zf.AbstractC14631d;
import p466zf.AbstractC14632e;
import p466zf.AbstractC14633f;
import p466zf.AbstractC14634g;
import p466zf.AbstractC14635h;
import p466zf.AbstractC14636i;
import p466zf.AbstractC14637j;
import p466zf.AbstractC14638k;
import p466zf.AbstractC14639l;
import p466zf.AbstractC14640m;
import p466zf.AbstractC14641n;
import p466zf.AbstractC14642o;
import p466zf.AbstractC14643p;
import p466zf.AbstractC14644q;
import p466zf.AbstractC14645r;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0019B\u0013\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0017J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001e\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u001a"}, m15073d2 = {"Lkotlin/jvm/internal/h;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/g;", "value", "", "e", "other", "equals", "", "hashCode", "", "toString", "Ljava/lang/Class;", "k", "Ljava/lang/Class;", "i", "()Ljava/lang/Class;", "jClass", "l", "()Ljava/lang/String;", "simpleName", "qualifiedName", "<init>", "(Ljava/lang/Class;)V", "a", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlin.jvm.internal.h */
/* loaded from: classes8.dex */
public final class C9954h implements KClass<Object>, AbstractC9952g {

    /* renamed from: l */
    public static final C9955a f22079l = new C9955a(null);

    /* renamed from: m */
    private static final Map<Class<? extends AbstractC11069g<?>>, Integer> f22080m;

    /* renamed from: n */
    private static final HashMap<String, String> f22081n;

    /* renamed from: o */
    private static final HashMap<String, String> f22082o;

    /* renamed from: p */
    private static final HashMap<String, String> f22083p;

    /* renamed from: q */
    private static final Map<String, String> f22084q;

    /* renamed from: k */
    private final Class<?> f22085k;

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002R,\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0002\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR0\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0018"}, m15073d2 = {"Lkotlin/jvm/internal/h$a;", "", "Ljava/lang/Class;", "jClass", "", "b", "a", "value", "", "c", "", "Lnf/g;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "classFqNames", "Ljava/util/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.jvm.internal.h$a */
    /* loaded from: classes8.dex */
    public static final class C9955a {
        private C9955a() {
        }

        public /* synthetic */ C9955a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m14665a(Class<?> jClass) {
            String str;
            C9971q.m14633g(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (jClass.isArray()) {
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C9954h.f22083p.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "kotlin.Array";
                }
                return str2;
            }
            String str3 = (String) C9954h.f22083p.get(jClass.getName());
            if (str3 == null) {
                return jClass.getCanonicalName();
            }
            return str3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
            if (r2 == null) goto L_0x0043;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String m14664b(java.lang.Class<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.C9971q.m14633g(r8, r0)
                boolean r0 = r8.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto L_0x000e
                goto L_0x00b6
            L_0x000e:
                boolean r0 = r8.isLocalClass()
                if (r0 == 0) goto L_0x006c
                java.lang.String r0 = r8.getSimpleName()
                java.lang.reflect.Method r2 = r8.getEnclosingMethod()
                r3 = 2
                r4 = 36
                java.lang.String r5 = "name"
                if (r2 == 0) goto L_0x0043
                kotlin.jvm.internal.C9971q.m14634f(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = r2.getName()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r6.toString()
                java.lang.String r2 = p326ri.C12707l.m5810K0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L_0x0040
                goto L_0x0043
            L_0x0040:
                r1 = r2
                goto L_0x00b6
            L_0x0043:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                if (r8 == 0) goto L_0x0064
                kotlin.jvm.internal.C9971q.m14634f(r0, r5)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                r2.append(r4)
                java.lang.String r8 = r2.toString()
                java.lang.String r1 = p326ri.C12707l.m5810K0(r0, r8, r1, r3, r1)
                goto L_0x00b6
            L_0x0064:
                kotlin.jvm.internal.C9971q.m14634f(r0, r5)
                java.lang.String r1 = p326ri.C12707l.m5811J0(r0, r4, r1, r3, r1)
                goto L_0x00b6
            L_0x006c:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto L_0x00a1
                java.lang.Class r8 = r8.getComponentType()
                boolean r0 = r8.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L_0x009e
                java.util.Map r0 = kotlin.jvm.internal.C9954h.m14666q()
                java.lang.String r8 = r8.getName()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L_0x009e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r2)
                java.lang.String r8 = r0.toString()
                r1 = r8
            L_0x009e:
                if (r1 != 0) goto L_0x00b6
                goto L_0x0040
            L_0x00a1:
                java.util.Map r0 = kotlin.jvm.internal.C9954h.m14666q()
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L_0x00b6
                java.lang.String r1 = r8.getSimpleName()
            L_0x00b6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C9954h.C9955a.m14664b(java.lang.Class):java.lang.String");
        }

        /* renamed from: c */
        public final boolean m14663c(Object obj, Class<?> jClass) {
            C9971q.m14633g(jClass, "jClass");
            Map map = C9954h.f22080m;
            C9971q.m14635e(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return C9964l0.m14648i(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = C14376a.m736c(C14376a.m734e(jClass));
            }
            return jClass.isInstance(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List l;
        int t;
        Map<Class<? extends AbstractC11069g<?>>, Integer> r;
        int d;
        String M0;
        String M02;
        int i = 0;
        l = C9906j.m14817l(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, AbstractC14641n.class, AbstractC14642o.class, AbstractC14643p.class, AbstractC14644q.class, AbstractC14645r.class, AbstractC14628a.class, AbstractC14629b.class, AbstractC14630c.class, AbstractC14631d.class, AbstractC14632e.class, AbstractC14633f.class, AbstractC14634g.class, AbstractC14635h.class, AbstractC14636i.class, AbstractC14637j.class, AbstractC14638k.class, AbstractC14639l.class, AbstractC14640m.class);
        t = C9907k.m14809t(l, 10);
        ArrayList arrayList = new ArrayList(t);
        for (Object obj : l) {
            int i2 = i + 1;
            if (i < 0) {
                C9906j.m14810s();
            }
            arrayList.add(C11098x.m10921a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        r = C11289v.m10241r(arrayList);
        f22080m = r;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f22081n = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f22082o = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C9971q.m14634f(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            C9971q.m14634f(kotlinName, "kotlinName");
            M02 = C12719v.m5708M0(kotlinName, '.', null, 2, null);
            sb2.append(M02);
            sb2.append("CompanionObject");
            Pair a = C11098x.m10921a(sb2.toString(), kotlinName + ".Companion");
            hashMap3.put(a.m15065c(), a.m15064d());
        }
        for (Map.Entry<Class<? extends AbstractC11069g<?>>, Integer> entry : f22080m.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        f22083p = hashMap3;
        d = C11288u.m10255d(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            M0 = C12719v.m5708M0((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, M0);
        }
        f22084q = linkedHashMap;
    }

    public C9954h(Class<?> jClass) {
        C9971q.m14633g(jClass, "jClass");
        this.f22085k = jClass;
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: e */
    public boolean mo14600e(Object obj) {
        return f22079l.m14663c(obj, mo14611i());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9954h) && C9971q.m14638b(C14376a.m736c(this), C14376a.m736c((KClass) obj));
    }

    public int hashCode() {
        return C14376a.m736c(this).hashCode();
    }

    @Override // kotlin.jvm.internal.AbstractC9952g
    /* renamed from: i */
    public Class<?> mo14611i() {
        return this.f22085k;
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: k */
    public String mo14599k() {
        return f22079l.m14665a(mo14611i());
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: l */
    public String mo14598l() {
        return f22079l.m14664b(mo14611i());
    }

    public String toString() {
        return mo14611i().toString() + " (Kotlin reflection is not available)";
    }
}
