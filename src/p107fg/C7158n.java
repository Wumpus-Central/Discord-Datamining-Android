package p107fg;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9972r;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.sequences.Sequence;
import nf.C11088q;
import p306qi.C12193m;
import p306qi.C12200o;
import p326ri.C12718u;
import p446yf.C14376a;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003\u001a\"\u0010\n\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002\"\u001e\u0010\u0012\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0012\u001a\u00020\u0003*\u00020\b8BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m15073d2 = {"Lkotlin/reflect/KType;", "", "forceWrapper", "Ljava/lang/reflect/Type;", "c", "Ljava/lang/Class;", "jClass", "", "Lfg/j;", "arguments", "e", "type", "", "h", "g", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "javaType", "f", "(Lfg/j;)Ljava/lang/reflect/Type;", "(Lfg/j;)V", "kotlin-stdlib"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: fg.n */
/* loaded from: classes8.dex */
public final class C7158n {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: fg.n$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C7159a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15557a;

        static {
            int[] iArr = new int[EnumC7154k.values().length];
            try {
                iArr[EnumC7154k.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7154k.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7154k.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15557a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: fg.n$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C7160b extends C9968n implements Function1<Class<?>, Class<?>> {

        /* renamed from: k */
        public static final C7160b f15558k = new C7160b();

        C7160b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        /* renamed from: i */
        public final Class<?> invoke(Class<?> p0) {
            C9971q.m14633g(p0, "p0");
            return p0.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final Type m23325c(KType kType, boolean z) {
        Class cls;
        Object t0;
        int i;
        AbstractC7139c d = kType.mo14594d();
        if (d instanceof AbstractC7150i) {
            return new C7157m((AbstractC7150i) d);
        }
        if (d instanceof KClass) {
            KClass kClass = (KClass) d;
            if (z) {
                cls = C14376a.m736c(kClass);
            } else {
                cls = C14376a.m737b(kClass);
            }
            List<C7151j> j = kType.mo14593j();
            if (j.isEmpty()) {
                return cls;
            }
            if (!cls.isArray()) {
                return m23323e(cls, j);
            }
            if (cls.getComponentType().isPrimitive()) {
                return cls;
            }
            t0 = C9914r.m14745t0(j);
            C7151j jVar = (C7151j) t0;
            if (jVar != null) {
                EnumC7154k a = jVar.m23337a();
                KType b = jVar.m23336b();
                if (a == null) {
                    i = -1;
                } else {
                    i = C7159a.f15557a[a.ordinal()];
                }
                if (i == -1 || i == 1) {
                    return cls;
                }
                if (i == 2 || i == 3) {
                    C9971q.m14636d(b);
                    Type d2 = m23324d(b, false, 1, null);
                    if (d2 instanceof Class) {
                        return cls;
                    }
                    return new C7137a(d2);
                }
                throw new C11088q();
            }
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
    }

    /* renamed from: d */
    static /* synthetic */ Type m23324d(KType kType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m23325c(kType, z);
    }

    /* renamed from: e */
    private static final Type m23323e(Class<?> cls, List<C7151j> list) {
        int t;
        int t2;
        int t3;
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            t3 = C9907k.m14809t(list, 10);
            ArrayList arrayList = new ArrayList(t3);
            for (C7151j jVar : list) {
                arrayList.add(m23322f(jVar));
            }
            return new C7155l(cls, null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            t2 = C9907k.m14809t(list, 10);
            ArrayList arrayList2 = new ArrayList(t2);
            for (C7151j jVar2 : list) {
                arrayList2.add(m23322f(jVar2));
            }
            return new C7155l(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type e = m23323e(declaringClass, list.subList(length, list.size()));
            List<C7151j> subList = list.subList(0, length);
            t = C9907k.m14809t(subList, 10);
            ArrayList arrayList3 = new ArrayList(t);
            for (C7151j jVar3 : subList) {
                arrayList3.add(m23322f(jVar3));
            }
            return new C7155l(cls, e, arrayList3);
        }
    }

    /* renamed from: f */
    private static final Type m23322f(C7151j jVar) {
        EnumC7154k d = jVar.m23334d();
        if (d == null) {
            return C7161o.f15559m.m23317a();
        }
        KType c = jVar.m23335c();
        C9971q.m14636d(c);
        int i = C7159a.f15557a[d.ordinal()];
        if (i == 1) {
            return new C7161o(null, m23325c(c, true));
        }
        if (i == 2) {
            return m23325c(c, true);
        }
        if (i == 3) {
            return new C7161o(m23325c(c, true), null);
        }
        throw new C11088q();
    }

    /* renamed from: g */
    public static final Type m23321g(KType kType) {
        Type c;
        C9971q.m14633g(kType, "<this>");
        if (!(kType instanceof AbstractC9972r) || (c = ((AbstractC9972r) kType).mo14614c()) == null) {
            return m23324d(kType, false, 1, null);
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final String m23320h(Type type) {
        String str;
        Sequence h;
        Object x;
        int n;
        String z;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            h = C12193m.m7445h(type, C7160b.f15558k);
            StringBuilder sb2 = new StringBuilder();
            x = C12200o.m7421x(h);
            sb2.append(((Class) x).getName());
            n = C12200o.m7431n(h);
            z = C12718u.m5726z("[]", n);
            sb2.append(z);
            str = sb2.toString();
        } else {
            str = cls.getName();
        }
        C9971q.m14634f(str, "{\n        if (type.isArr…   } else type.name\n    }");
        return str;
    }
}
