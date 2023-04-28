package p140hg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import p107fg.AbstractC7140d;
import p107fg.C7158n;
import p158ig.AbstractC8404c0;
import p158ig.AbstractC8453l;
import p158ig.C8418e0;
import p158ig.C8503p0;
import p180jg.AbstractC9579e;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\b\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\f\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"/\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\r8F¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m15073d2 = {"Lkotlin/reflect/KProperty;", "Ljava/lang/reflect/Field;", "b", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;", "javaField", "Ljava/lang/reflect/Method;", "c", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Method;", "javaGetter", "Lfg/d;", "e", "(Lfg/d;)Ljava/lang/reflect/Method;", "javaSetter", "Lkotlin/reflect/KFunction;", "d", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Method;", "javaMethod", "T", "Ljava/lang/reflect/Constructor;", "a", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(Lkotlin/reflect/KFunction;)V", "javaConstructor", "Lkotlin/reflect/KType;", "Ljava/lang/reflect/Type;", "f", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "javaType", "kotlin-reflection"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: hg.c */
/* loaded from: classes8.dex */
public final class C8016c {
    /* renamed from: a */
    public static final <T> Constructor<T> m20852a(KFunction<? extends T> kFunction) {
        Member member;
        AbstractC9579e<?> u;
        C9971q.m14633g(kFunction, "<this>");
        AbstractC8453l<?> b = C8503p0.m19658b(kFunction);
        if (b == null || (u = b.mo19629u()) == null) {
            member = null;
        } else {
            member = u.mo15931b();
        }
        if (member instanceof Constructor) {
            return (Constructor) member;
        }
        return null;
    }

    /* renamed from: b */
    public static final Field m20851b(KProperty<?> kProperty) {
        C9971q.m14633g(kProperty, "<this>");
        AbstractC8404c0<?> d = C8503p0.m19656d(kProperty);
        if (d != null) {
            return d.m19819F();
        }
        return null;
    }

    /* renamed from: c */
    public static final Method m20850c(KProperty<?> kProperty) {
        C9971q.m14633g(kProperty, "<this>");
        return m20849d(kProperty.mo14597f());
    }

    /* renamed from: d */
    public static final Method m20849d(KFunction<?> kFunction) {
        Member member;
        AbstractC9579e<?> u;
        C9971q.m14633g(kFunction, "<this>");
        AbstractC8453l<?> b = C8503p0.m19658b(kFunction);
        if (b == null || (u = b.mo19629u()) == null) {
            member = null;
        } else {
            member = u.mo15931b();
        }
        if (member instanceof Method) {
            return (Method) member;
        }
        return null;
    }

    /* renamed from: e */
    public static final Method m20848e(AbstractC7140d<?> dVar) {
        C9971q.m14633g(dVar, "<this>");
        return m20849d(dVar.mo14612h());
    }

    /* renamed from: f */
    public static final Type m20847f(KType kType) {
        C9971q.m14633g(kType, "<this>");
        Type c = ((C8418e0) kType).mo14614c();
        if (c == null) {
            return C7158n.m23321g(kType);
        }
        return c;
    }
}
