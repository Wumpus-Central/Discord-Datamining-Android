package p449yi;

import bj.C3673l1;
import bj.C3705u1;
import dj.AbstractC6514c;
import dj.C6515d;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9899f;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import nf.C11075i;
import nf.C11097w;
import p446yf.C14376a;
import p469zi.C14667a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000\u001a-\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u000f*\u00020\u0003*\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\f*\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m15073d2 = {"Ljava/lang/reflect/Type;", "type", "Lkotlinx/serialization/KSerializer;", "", "e", "Ldj/c;", "d", "h", "", "failOnMissingTypeArgSerializer", "f", "(Ldj/c;Ljava/lang/reflect/Type;Z)Lkotlinx/serialization/KSerializer;", "Ljava/lang/Class;", "i", "(Ldj/c;Ljava/lang/Class;Z)Lkotlinx/serialization/KSerializer;", "T", "jClass", "", "typeArgumentsSerializers", "c", "(Ldj/c;Ljava/lang/Class;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Ljava/lang/reflect/GenericArrayType;", "a", "(Ldj/c;Ljava/lang/reflect/GenericArrayType;Z)Lkotlinx/serialization/KSerializer;", "b", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "kotlinx-serialization-core"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlinx/serialization/SerializersKt")
/* renamed from: yi.k */
/* loaded from: classes8.dex */
public final /* synthetic */ class C14444k {
    /* renamed from: a */
    private static final KSerializer<Object> m596a(AbstractC6514c cVar, GenericArrayType genericArrayType, boolean z) {
        KSerializer<Object> kSerializer;
        KClass kClass;
        Object D;
        Type eType = genericArrayType.getGenericComponentType();
        if (eType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) eType).getUpperBounds();
            C9971q.m14634f(upperBounds, "it.upperBounds");
            D = C9899f.m14966D(upperBounds);
            eType = (Type) D;
        }
        C9971q.m14634f(eType, "eType");
        if (z) {
            kSerializer = C14443j.m603b(cVar, eType);
        } else {
            kSerializer = C14443j.m600e(cVar, eType);
            if (kSerializer == null) {
                return null;
            }
        }
        if (eType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) eType).getRawType();
            C9971q.m14635e(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            kClass = C14376a.m734e((Class) rawType);
        } else if (eType instanceof KClass) {
            kClass = (KClass) eType;
        } else {
            throw new IllegalStateException("unsupported type in GenericArray: " + C9951f0.m14684b(eType.getClass()));
        }
        C9971q.m14635e(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<Object> a = C14667a.m33a(kClass, kSerializer);
        C9971q.m14635e(a, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return a;
    }

    /* renamed from: b */
    private static final Class<?> m595b(Type type) {
        Object D;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C9971q.m14634f(rawType, "it.rawType");
            return m595b(rawType);
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            C9971q.m14634f(upperBounds, "it.upperBounds");
            D = C9899f.m14966D(upperBounds);
            C9971q.m14634f(D, "it.upperBounds.first()");
            return m595b((Type) D);
        } else if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            C9971q.m14634f(genericComponentType, "it.genericComponentType");
            return m595b(genericComponentType);
        } else {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + C9951f0.m14684b(type.getClass()));
        }
    }

    /* renamed from: c */
    private static final <T> KSerializer<T> m594c(AbstractC6514c cVar, Class<T> cls, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer<T> c = C3673l1.m33848c(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (c != null) {
            return c;
        }
        KClass<T> e = C14376a.m734e(cls);
        KSerializer<T> b = C3705u1.m33786b(e);
        if (b == null) {
            return cVar.mo25390b(e, list);
        }
        return b;
    }

    /* renamed from: d */
    public static final KSerializer<Object> m593d(AbstractC6514c cVar, Type type) {
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(type, "type");
        KSerializer<Object> f = m591f(cVar, type, true);
        if (f != null) {
            return f;
        }
        C3673l1.m33838m(m595b(type));
        throw new C11075i();
    }

    /* renamed from: e */
    public static final KSerializer<Object> m592e(Type type) {
        C9971q.m14633g(type, "type");
        return C14443j.m603b(C6515d.m25386a(), type);
    }

    /* renamed from: f */
    private static final KSerializer<Object> m591f(AbstractC6514c cVar, Type type, boolean z) {
        Object D;
        ArrayList<KSerializer> arrayList;
        int t;
        if (type instanceof GenericArrayType) {
            return m596a(cVar, (GenericArrayType) type, z);
        }
        if (type instanceof Class) {
            return m588i(cVar, (Class) type, z);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            C9971q.m14635e(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            Class cls = (Class) rawType;
            Type[] args = parameterizedType.getActualTypeArguments();
            C9971q.m14634f(args, "args");
            if (z) {
                arrayList = new ArrayList(args.length);
                for (Type it : args) {
                    C9971q.m14634f(it, "it");
                    arrayList.add(C14443j.m603b(cVar, it));
                }
            } else {
                arrayList = new ArrayList(args.length);
                for (Type it2 : args) {
                    C9971q.m14634f(it2, "it");
                    KSerializer<Object> e = C14443j.m600e(cVar, it2);
                    if (e == null) {
                        return null;
                    }
                    arrayList.add(e);
                }
            }
            if (Set.class.isAssignableFrom(cls)) {
                KSerializer<Object> n = C14667a.m20n((KSerializer) arrayList.get(0));
                C9971q.m14635e(n, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return n;
            } else if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
                KSerializer<Object> h = C14667a.m26h((KSerializer) arrayList.get(0));
                C9971q.m14635e(h, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return h;
            } else if (Map.class.isAssignableFrom(cls)) {
                KSerializer<Object> k = C14667a.m23k((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                C9971q.m14635e(k, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return k;
            } else if (Map.Entry.class.isAssignableFrom(cls)) {
                KSerializer<Object> j = C14667a.m24j((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                C9971q.m14635e(j, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return j;
            } else if (Pair.class.isAssignableFrom(cls)) {
                KSerializer<Object> m = C14667a.m21m((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                C9971q.m14635e(m, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return m;
            } else if (C11097w.class.isAssignableFrom(cls)) {
                KSerializer<Object> p = C14667a.m18p((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
                C9971q.m14635e(p, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return p;
            } else {
                t = C9907k.m14809t(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(t);
                for (KSerializer kSerializer : arrayList) {
                    C9971q.m14635e(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                    arrayList2.add(kSerializer);
                }
                return m594c(cVar, cls, arrayList2);
            }
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            C9971q.m14634f(upperBounds, "type.upperBounds");
            D = C9899f.m14966D(upperBounds);
            C9971q.m14634f(D, "type.upperBounds.first()");
            return m590g(cVar, (Type) D, false, 2, null);
        } else {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + C9951f0.m14684b(type.getClass()));
        }
    }

    /* renamed from: g */
    static /* synthetic */ KSerializer m590g(AbstractC6514c cVar, Type type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return m591f(cVar, type, z);
    }

    /* renamed from: h */
    public static final KSerializer<Object> m589h(AbstractC6514c cVar, Type type) {
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(type, "type");
        return m591f(cVar, type, false);
    }

    /* renamed from: i */
    private static final KSerializer<Object> m588i(AbstractC6514c cVar, Class<?> cls, boolean z) {
        List i;
        KSerializer<Object> kSerializer;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            C9971q.m14635e(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            i = C9906j.m14820i();
            return m594c(cVar, cls, i);
        }
        Class<?> componentType = cls.getComponentType();
        C9971q.m14634f(componentType, "type.componentType");
        if (z) {
            kSerializer = C14443j.m603b(cVar, componentType);
        } else {
            kSerializer = C14443j.m600e(cVar, componentType);
            if (kSerializer == null) {
                return null;
            }
        }
        KClass e = C14376a.m734e(componentType);
        C9971q.m14635e(e, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<Object> a = C14667a.m33a(e, kSerializer);
        C9971q.m14635e(a, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return a;
    }
}
