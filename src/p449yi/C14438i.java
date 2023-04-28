package p449yi;

import bj.AbstractC3669k1;
import bj.AbstractC3716x1;
import bj.C3675m;
import dj.C6515d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u001a(\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aF\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00050\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\"\"\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010\"\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u0012\u0004\b\u0012\u0010\u0010\"\"\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00148\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\u0010\"\"\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00148\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u0012\u0004\b\u001a\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m15073d2 = {"Lkotlin/reflect/KClass;", "", "clazz", "", "isNullable", "Lkotlinx/serialization/KSerializer;", "a", "", "Lkotlin/reflect/KType;", "types", "Lnf/s;", "b", "(Lkotlin/reflect/KClass;Ljava/util/List;Z)Ljava/lang/Object;", "Lbj/x1;", "Lbj/x1;", "getSERIALIZERS_CACHE$annotations", "()V", "SERIALIZERS_CACHE", "getSERIALIZERS_CACHE_NULLABLE$annotations", "SERIALIZERS_CACHE_NULLABLE", "Lbj/k1;", "c", "Lbj/k1;", "getPARAMETRIZED_SERIALIZERS_CACHE$annotations", "PARAMETRIZED_SERIALIZERS_CACHE", "d", "getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations", "PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE", "kotlinx-serialization-core"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: yi.i */
/* loaded from: classes8.dex */
public final class C14438i {

    /* renamed from: a */
    private static final AbstractC3716x1<? extends Object> f32652a = C3675m.m33834a(C14441c.f32658k);

    /* renamed from: b */
    private static final AbstractC3716x1<Object> f32653b = C3675m.m33834a(C14442d.f32659k);

    /* renamed from: c */
    private static final AbstractC3669k1<? extends Object> f32654c = C3675m.m33833b(C14439a.f32656k);

    /* renamed from: d */
    private static final AbstractC3669k1<Object> f32655d = C3675m.m33833b(C14440b.f32657k);

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m15073d2 = {"Lkotlin/reflect/KClass;", "", "clazz", "", "Lkotlin/reflect/KType;", "types", "Lkotlinx/serialization/KSerializer;", "a", "(Lkotlin/reflect/KClass;Ljava/util/List;)Lkotlinx/serialization/KSerializer;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: yi.i$a */
    /* loaded from: classes8.dex */
    static final class C14439a extends AbstractC9973s implements Function2<KClass<Object>, List<? extends KType>, KSerializer<? extends Object>> {

        /* renamed from: k */
        public static final C14439a f32656k = new C14439a();

        C14439a() {
            super(2);
        }

        /* renamed from: a */
        public final KSerializer<? extends Object> invoke(KClass<Object> clazz, List<? extends KType> types) {
            C9971q.m14633g(clazz, "clazz");
            C9971q.m14633g(types, "types");
            List<KSerializer<Object>> h = C14443j.m597h(C6515d.m25386a(), types, true);
            C9971q.m14636d(h);
            return C14443j.m604a(clazz, types, h);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m15073d2 = {"Lkotlin/reflect/KClass;", "", "clazz", "", "Lkotlin/reflect/KType;", "types", "Lkotlinx/serialization/KSerializer;", "a", "(Lkotlin/reflect/KClass;Ljava/util/List;)Lkotlinx/serialization/KSerializer;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: yi.i$b */
    /* loaded from: classes8.dex */
    static final class C14440b extends AbstractC9973s implements Function2<KClass<Object>, List<? extends KType>, KSerializer<Object>> {

        /* renamed from: k */
        public static final C14440b f32657k = new C14440b();

        C14440b() {
            super(2);
        }

        /* renamed from: a */
        public final KSerializer<Object> invoke(KClass<Object> clazz, List<? extends KType> types) {
            KSerializer<Object> u;
            C9971q.m14633g(clazz, "clazz");
            C9971q.m14633g(types, "types");
            List<KSerializer<Object>> h = C14443j.m597h(C6515d.m25386a(), types, true);
            C9971q.m14636d(h);
            KSerializer<? extends Object> a = C14443j.m604a(clazz, types, h);
            if (a == null || (u = C14667a.m13u(a)) == null) {
                return null;
            }
            return u;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"Lkotlin/reflect/KClass;", "it", "Lkotlinx/serialization/KSerializer;", "", "a", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: yi.i$c */
    /* loaded from: classes8.dex */
    static final class C14441c extends AbstractC9973s implements Function1<KClass<?>, KSerializer<? extends Object>> {

        /* renamed from: k */
        public static final C14441c f32658k = new C14441c();

        C14441c() {
            super(1);
        }

        /* renamed from: a */
        public final KSerializer<? extends Object> invoke(KClass<?> it) {
            C9971q.m14633g(it, "it");
            return C14443j.m598g(it);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"Lkotlin/reflect/KClass;", "it", "Lkotlinx/serialization/KSerializer;", "", "a", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: yi.i$d */
    /* loaded from: classes8.dex */
    static final class C14442d extends AbstractC9973s implements Function1<KClass<?>, KSerializer<Object>> {

        /* renamed from: k */
        public static final C14442d f32659k = new C14442d();

        C14442d() {
            super(1);
        }

        /* renamed from: a */
        public final KSerializer<Object> invoke(KClass<?> it) {
            KSerializer<Object> u;
            C9971q.m14633g(it, "it");
            KSerializer g = C14443j.m598g(it);
            if (g == null || (u = C14667a.m13u(g)) == null) {
                return null;
            }
            return u;
        }
    }

    /* renamed from: a */
    public static final KSerializer<Object> m610a(KClass<Object> clazz, boolean z) {
        C9971q.m14633g(clazz, "clazz");
        if (z) {
            return f32653b.mo33752a(clazz);
        }
        KSerializer<? extends Object> a = f32652a.mo33752a(clazz);
        if (a != null) {
            return a;
        }
        return null;
    }

    /* renamed from: b */
    public static final Object m609b(KClass<Object> clazz, List<? extends KType> types, boolean z) {
        C9971q.m14633g(clazz, "clazz");
        C9971q.m14633g(types, "types");
        if (!z) {
            return f32654c.mo33783a(clazz, types);
        }
        return f32655d.mo33783a(clazz, types);
    }
}
