package p449yi;

import bj.C3643f;
import bj.C3653h0;
import bj.C3663j0;
import bj.C3673l1;
import bj.C3677m1;
import bj.C3695r0;
import bj.C3701t0;
import bj.C3705u1;
import dj.AbstractC6514c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import nf.C11075i;
import nf.C11090s;
import nf.C11097w;
import p107fg.AbstractC7139c;
import p107fg.C7151j;
import p469zi.C14667a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001a\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a-\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\r\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0018\u00010\u000b*\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a$\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u000e*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0007\u001a@\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u000bH\u0000\u001a9\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aG\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003\"\b\b\u0000\u0010\u000e*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m15073d2 = {"Ldj/c;", "Lkotlin/reflect/KType;", "type", "Lkotlinx/serialization/KSerializer;", "", "e", "g", "", "failOnMissingTypeArgSerializer", "f", "(Ldj/c;Lkotlin/reflect/KType;Z)Lkotlinx/serialization/KSerializer;", "", "typeArguments", "i", "T", "Lkotlin/reflect/KClass;", "h", "types", "serializers", "d", "b", "(Lkotlin/reflect/KClass;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "a", "(Lkotlin/reflect/KClass;Ljava/util/List;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "shouldBeNullable", "c", "(Lkotlinx/serialization/KSerializer;Z)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlinx/serialization/SerializersKt")
/* renamed from: yi.l */
/* loaded from: classes8.dex */
public final /* synthetic */ class C14445l {
    /* renamed from: a */
    private static final KSerializer<? extends Object> m587a(KClass<Object> kClass, List<? extends KType> list, List<? extends KSerializer<Object>> list2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (C9971q.m14638b(kClass, C9951f0.m14684b(Collection.class))) {
            z = true;
        } else {
            z = C9971q.m14638b(kClass, C9951f0.m14684b(List.class));
        }
        if (z) {
            z2 = true;
        } else {
            z2 = C9971q.m14638b(kClass, C9951f0.m14684b(List.class));
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = C9971q.m14638b(kClass, C9951f0.m14684b(ArrayList.class));
        }
        if (z3) {
            return new C3643f((KSerializer) list2.get(0));
        }
        if (C9971q.m14638b(kClass, C9951f0.m14684b(HashSet.class))) {
            return new C3663j0((KSerializer) list2.get(0));
        }
        if (C9971q.m14638b(kClass, C9951f0.m14684b(Set.class))) {
            z4 = true;
        } else {
            z4 = C9971q.m14638b(kClass, C9951f0.m14684b(Set.class));
        }
        if (z4) {
            z5 = true;
        } else {
            z5 = C9971q.m14638b(kClass, C9951f0.m14684b(LinkedHashSet.class));
        }
        if (z5) {
            return new C3701t0((KSerializer) list2.get(0));
        }
        if (C9971q.m14638b(kClass, C9951f0.m14684b(HashMap.class))) {
            return new C3653h0((KSerializer) list2.get(0), (KSerializer) list2.get(1));
        }
        if (C9971q.m14638b(kClass, C9951f0.m14684b(Map.class))) {
            z6 = true;
        } else {
            z6 = C9971q.m14638b(kClass, C9951f0.m14684b(Map.class));
        }
        if (z6) {
            z7 = true;
        } else {
            z7 = C9971q.m14638b(kClass, C9951f0.m14684b(LinkedHashMap.class));
        }
        if (z7) {
            return new C3695r0((KSerializer) list2.get(0), (KSerializer) list2.get(1));
        }
        if (C9971q.m14638b(kClass, C9951f0.m14684b(Map.Entry.class))) {
            return C14667a.m24j((KSerializer) list2.get(0), (KSerializer) list2.get(1));
        }
        if (C9971q.m14638b(kClass, C9951f0.m14684b(Pair.class))) {
            return C14667a.m21m((KSerializer) list2.get(0), (KSerializer) list2.get(1));
        }
        if (C9971q.m14638b(kClass, C9951f0.m14684b(C11097w.class))) {
            return C14667a.m18p((KSerializer) list2.get(0), (KSerializer) list2.get(1), (KSerializer) list2.get(2));
        }
        if (!C3673l1.m33840k(kClass)) {
            return null;
        }
        AbstractC7139c d = ((KType) list.get(0)).mo14594d();
        C9971q.m14635e(d, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return C14667a.m33a((KClass) d, (KSerializer) list2.get(0));
    }

    /* renamed from: b */
    private static final KSerializer<? extends Object> m586b(KClass<Object> kClass, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        return C3673l1.m33847d(kClass, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    /* renamed from: c */
    private static final <T> KSerializer<T> m585c(KSerializer<T> kSerializer, boolean z) {
        if (z) {
            return C14667a.m13u(kSerializer);
        }
        C9971q.m14635e(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return kSerializer;
    }

    /* renamed from: d */
    public static final KSerializer<? extends Object> m584d(KClass<Object> kClass, List<? extends KType> types, List<? extends KSerializer<Object>> serializers) {
        C9971q.m14633g(kClass, "<this>");
        C9971q.m14633g(types, "types");
        C9971q.m14633g(serializers, "serializers");
        KSerializer<? extends Object> a = m587a(kClass, types, serializers);
        if (a == null) {
            return m586b(kClass, serializers);
        }
        return a;
    }

    /* renamed from: e */
    public static final KSerializer<Object> m583e(AbstractC6514c cVar, KType type) {
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(type, "type");
        KSerializer<Object> f = m582f(cVar, type, true);
        if (f != null) {
            return f;
        }
        C3673l1.m33839l(C3677m1.m33828c(type));
        throw new C11075i();
    }

    /* renamed from: f */
    private static final KSerializer<Object> m582f(AbstractC6514c cVar, KType kType, boolean z) {
        int t;
        KSerializer<Object> kSerializer;
        KSerializer<? extends Object> kSerializer2;
        KClass<Object> c = C3677m1.m33828c(kType);
        boolean b = kType.mo14595b();
        List<C7151j> j = kType.mo14593j();
        t = C9907k.m14809t(j, 10);
        ArrayList arrayList = new ArrayList(t);
        for (C7151j jVar : j) {
            KType c2 = jVar.m23335c();
            if (c2 != null) {
                arrayList.add(c2);
            } else {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kType).toString());
            }
        }
        if (arrayList.isEmpty()) {
            kSerializer = C14438i.m610a(c, b);
        } else {
            Object b2 = C14438i.m609b(c, arrayList, b);
            if (z) {
                if (C11090s.m10935g(b2)) {
                    b2 = null;
                }
                kSerializer = (KSerializer) b2;
            } else if (C11090s.m10937e(b2) != null) {
                return null;
            } else {
                kSerializer = (KSerializer) b2;
            }
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        if (arrayList.isEmpty()) {
            kSerializer2 = AbstractC6514c.m25389c(cVar, c, null, 2, null);
        } else {
            List<KSerializer<Object>> h = C14443j.m597h(cVar, arrayList, z);
            if (h == null) {
                return null;
            }
            KSerializer<? extends Object> a = C14443j.m604a(c, arrayList, h);
            if (a == null) {
                kSerializer2 = cVar.mo25390b(c, h);
            } else {
                kSerializer2 = a;
            }
        }
        if (kSerializer2 != null) {
            return m585c(kSerializer2, b);
        }
        return null;
    }

    /* renamed from: g */
    public static final KSerializer<Object> m581g(AbstractC6514c cVar, KType type) {
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(type, "type");
        return m582f(cVar, type, false);
    }

    /* renamed from: h */
    public static final <T> KSerializer<T> m580h(KClass<T> kClass) {
        C9971q.m14633g(kClass, "<this>");
        KSerializer<T> b = C3673l1.m33849b(kClass);
        if (b == null) {
            return C3705u1.m33786b(kClass);
        }
        return b;
    }

    /* renamed from: i */
    public static final List<KSerializer<Object>> m579i(AbstractC6514c cVar, List<? extends KType> typeArguments, boolean z) {
        ArrayList arrayList;
        int t;
        int t2;
        C9971q.m14633g(cVar, "<this>");
        C9971q.m14633g(typeArguments, "typeArguments");
        if (z) {
            t2 = C9907k.m14809t(typeArguments, 10);
            arrayList = new ArrayList(t2);
            for (KType kType : typeArguments) {
                arrayList.add(C14443j.m602c(cVar, kType));
            }
        } else {
            t = C9907k.m14809t(typeArguments, 10);
            arrayList = new ArrayList(t);
            for (KType kType2 : typeArguments) {
                KSerializer<Object> f = C14443j.m599f(cVar, kType2);
                if (f == null) {
                    return null;
                }
                arrayList.add(f);
            }
        }
        return arrayList;
    }
}
