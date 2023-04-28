package ug;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9899f;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import nf.AbstractC11069g;
import nf.C11098x;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11142f;
import p267of.C11289v;
import p306qi.C12193m;
import p306qi.C12200o;
import p326ri.C12718u;
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

/* renamed from: ug.d */
/* loaded from: classes8.dex */
public final class C13283d {

    /* renamed from: a */
    private static final List<KClass<? extends Object>> f29823a;

    /* renamed from: b */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f29824b;

    /* renamed from: c */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f29825c;

    /* renamed from: d */
    private static final Map<Class<? extends AbstractC11069g<?>>, Integer> f29826d;

    /* renamed from: ug.d$a */
    /* loaded from: classes8.dex */
    static final class C13284a extends AbstractC9973s implements Function1<ParameterizedType, ParameterizedType> {

        /* renamed from: k */
        public static final C13284a f29827k = new C13284a();

        C13284a() {
            super(1);
        }

        /* renamed from: a */
        public final ParameterizedType invoke(ParameterizedType it) {
            C9971q.m14633g(it, "it");
            Type ownerType = it.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* renamed from: ug.d$b */
    /* loaded from: classes8.dex */
    static final class C13285b extends AbstractC9973s implements Function1<ParameterizedType, Sequence<? extends Type>> {

        /* renamed from: k */
        public static final C13285b f29828k = new C13285b();

        C13285b() {
            super(1);
        }

        /* renamed from: a */
        public final Sequence<Type> invoke(ParameterizedType it) {
            Sequence<Type> u;
            C9971q.m14633g(it, "it");
            Type[] actualTypeArguments = it.getActualTypeArguments();
            C9971q.m14634f(actualTypeArguments, "it.actualTypeArguments");
            u = C9899f.m14915u(actualTypeArguments);
            return u;
        }
    }

    static {
        List<KClass<? extends Object>> l;
        int t;
        Map<Class<? extends Object>, Class<? extends Object>> r;
        int t2;
        Map<Class<? extends Object>, Class<? extends Object>> r2;
        List l2;
        int t3;
        Map<Class<? extends AbstractC11069g<?>>, Integer> r3;
        int i = 0;
        l = C9906j.m14817l(C9951f0.m14684b(Boolean.TYPE), C9951f0.m14684b(Byte.TYPE), C9951f0.m14684b(Character.TYPE), C9951f0.m14684b(Double.TYPE), C9951f0.m14684b(Float.TYPE), C9951f0.m14684b(Integer.TYPE), C9951f0.m14684b(Long.TYPE), C9951f0.m14684b(Short.TYPE));
        f29823a = l;
        t = C9907k.m14809t(l, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = l.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            arrayList.add(C11098x.m10921a(C14376a.m736c(kClass), C14376a.m735d(kClass)));
        }
        r = C11289v.m10241r(arrayList);
        f29824b = r;
        List<KClass<? extends Object>> list = f29823a;
        t2 = C9907k.m14809t(list, 10);
        ArrayList arrayList2 = new ArrayList(t2);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            KClass kClass2 = (KClass) it2.next();
            arrayList2.add(C11098x.m10921a(C14376a.m735d(kClass2), C14376a.m736c(kClass2)));
        }
        r2 = C11289v.m10241r(arrayList2);
        f29825c = r2;
        l2 = C9906j.m14817l(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, AbstractC14641n.class, AbstractC14642o.class, AbstractC14643p.class, AbstractC14644q.class, AbstractC14645r.class, AbstractC14628a.class, AbstractC14629b.class, AbstractC14630c.class, AbstractC14631d.class, AbstractC14632e.class, AbstractC14633f.class, AbstractC14634g.class, AbstractC14635h.class, AbstractC14636i.class, AbstractC14637j.class, AbstractC14638k.class, AbstractC14639l.class, AbstractC14640m.class);
        t3 = C9907k.m14809t(l2, 10);
        ArrayList arrayList3 = new ArrayList(t3);
        for (Object obj : l2) {
            int i2 = i + 1;
            if (i < 0) {
                C9906j.m14810s();
            }
            arrayList3.add(C11098x.m10921a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        r3 = C11289v.m10241r(arrayList3);
        f29826d = r3;
    }

    /* renamed from: a */
    public static final C11136b m4053a(Class<?> cls) {
        boolean z;
        C11136b bVar;
        C11136b a;
        C9971q.m14633g(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        } else if (!cls.isArray()) {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                C9971q.m14634f(simpleName, "simpleName");
                if (simpleName.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    if (declaringClass == null || (a = m4053a(declaringClass)) == null || (bVar = a.m10814d(C11142f.m10767f(cls.getSimpleName()))) == null) {
                        bVar = C11136b.m10805m(new C11137c(cls.getName()));
                    }
                    C9971q.m14634f(bVar, "declaringClass?.classId?…Id.topLevel(FqName(name))");
                    return bVar;
                }
            }
            C11137c cVar = new C11137c(cls.getName());
            return new C11136b(cVar.m10800e(), C11137c.m10794k(cVar.m10798g()), true);
        } else {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
    }

    /* renamed from: b */
    public static final String m4052b(Class<?> cls) {
        String C;
        String C2;
        C9971q.m14633g(cls, "<this>");
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return "C";
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return "V";
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return "F";
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return "S";
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported primitive type: " + cls);
        } else if (cls.isArray()) {
            String name2 = cls.getName();
            C9971q.m14634f(name2, "name");
            C2 = C12718u.m5741C(name2, '.', '/', false, 4, null);
            return C2;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name3 = cls.getName();
            C9971q.m14634f(name3, "name");
            C = C12718u.m5741C(name3, '.', '/', false, 4, null);
            sb2.append(C);
            sb2.append(';');
            return sb2.toString();
        }
    }

    /* renamed from: c */
    public static final Integer m4051c(Class<?> cls) {
        C9971q.m14633g(cls, "<this>");
        return f29826d.get(cls);
    }

    /* renamed from: d */
    public static final List<Type> m4050d(Type type) {
        Sequence h;
        Sequence t;
        List<Type> E;
        List<Type> u0;
        List<Type> i;
        C9971q.m14633g(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            i = C9906j.m14820i();
            return i;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C9971q.m14634f(actualTypeArguments, "actualTypeArguments");
            u0 = C9899f.m14914u0(actualTypeArguments);
            return u0;
        }
        h = C12193m.m7445h(type, C13284a.f29827k);
        t = C12200o.m7425t(h, C13285b.f29828k);
        E = C12200o.m7436E(t);
        return E;
    }

    /* renamed from: e */
    public static final Class<?> m4049e(Class<?> cls) {
        C9971q.m14633g(cls, "<this>");
        return f29824b.get(cls);
    }

    /* renamed from: f */
    public static final ClassLoader m4048f(Class<?> cls) {
        C9971q.m14633g(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        C9971q.m14634f(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }

    /* renamed from: g */
    public static final Class<?> m4047g(Class<?> cls) {
        C9971q.m14633g(cls, "<this>");
        return f29825c.get(cls);
    }

    /* renamed from: h */
    public static final boolean m4046h(Class<?> cls) {
        C9971q.m14633g(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
