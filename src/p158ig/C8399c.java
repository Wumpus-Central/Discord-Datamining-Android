package p158ig;

import gg.C7591c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9906j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KType;
import p107fg.C7151j;
import p163j$.util.concurrent.ConcurrentHashMap;

@Metadata(m15074d1 = {"\u0000H\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001a \u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\"*\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \t*\u0004\u0018\u00010\u00000\u00000\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\n\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\n\"<\u0010\u001a\u001a*\u0012&\u0012$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00170\u0014j\u0002`\u0018\u0012\u0004\u0012\u00020\u000e0\u00130\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\n*0\b\u0002\u0010\u001b\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00170\u00142\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00170\u0014¨\u0006\u001c"}, m15073d2 = {"", "T", "Ljava/lang/Class;", "jClass", "Lig/m;", "a", "Lkotlin/reflect/KDeclarationContainer;", "b", "Lig/a;", "kotlin.jvm.PlatformType", "Lig/a;", "K_CLASS_CACHE", "Lig/v;", "K_PACKAGE_CACHE", "Lkotlin/reflect/KType;", "c", "CACHE_FOR_BASE_CLASSIFIERS", "d", "CACHE_FOR_NULLABLE_BASE_CLASSIFIERS", "j$/util/concurrent/ConcurrentHashMap", "Lkotlin/Pair;", "", "Lfg/j;", "", "Lkotlin/reflect/jvm/internal/Key;", "e", "CACHE_FOR_GENERIC_CLASSIFIERS", "Key", "kotlin-reflection"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: ig.c */
/* loaded from: classes8.dex */
public final class C8399c {

    /* renamed from: a */
    private static final AbstractC8395a<C8466m<? extends Object>> f18324a = C8397b.m19832a(C8402d.f18332k);

    /* renamed from: b */
    private static final AbstractC8395a<C8519v> f18325b = C8397b.m19832a(C8403e.f18333k);

    /* renamed from: c */
    private static final AbstractC8395a<KType> f18326c = C8397b.m19832a(C8400a.f18329k);

    /* renamed from: d */
    private static final AbstractC8395a<KType> f18327d = C8397b.m19832a(C0258c.f18331k);

    /* renamed from: e */
    private static final AbstractC8395a<ConcurrentHashMap<Pair<List<C7151j>, Boolean>, KType>> f18328e = C8397b.m19832a(C8401b.f18330k);

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/KType;", "a", "(Ljava/lang/Class;)Lkotlin/reflect/KType;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.c$a */
    /* loaded from: classes8.dex */
    static final class C8400a extends AbstractC9973s implements Function1<Class<?>, KType> {

        /* renamed from: k */
        public static final C8400a f18329k = new C8400a();

        C8400a() {
            super(1);
        }

        /* renamed from: a */
        public final KType invoke(Class<?> it) {
            List i;
            List i2;
            C9971q.m14633g(it, "it");
            C8466m a = C8399c.m19830a(it);
            i = C9906j.m14820i();
            i2 = C9906j.m14820i();
            return C7591c.m21950b(a, i, false, i2);
        }
    }

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m15073d2 = {"Ljava/lang/Class;", "it", "j$/util/concurrent/ConcurrentHashMap", "Lkotlin/Pair;", "", "Lfg/j;", "", "Lkotlin/reflect/jvm/internal/Key;", "Lkotlin/reflect/KType;", "a", "(Ljava/lang/Class;)Lj$/util/concurrent/ConcurrentHashMap;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.c$b */
    /* loaded from: classes8.dex */
    static final class C8401b extends AbstractC9973s implements Function1<Class<?>, ConcurrentHashMap<Pair<? extends List<? extends C7151j>, ? extends Boolean>, KType>> {

        /* renamed from: k */
        public static final C8401b f18330k = new C8401b();

        C8401b() {
            super(1);
        }

        /* renamed from: a */
        public final ConcurrentHashMap<Pair<List<C7151j>, Boolean>, KType> invoke(Class<?> it) {
            C9971q.m14633g(it, "it");
            return new ConcurrentHashMap<>();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/KType;", "a", "(Ljava/lang/Class;)Lkotlin/reflect/KType;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.c$c */
    /* loaded from: classes8.dex */
    static final class C0258c extends AbstractC9973s implements Function1<Class<?>, KType> {

        /* renamed from: k */
        public static final C0258c f18331k = new C0258c();

        C0258c() {
            super(1);
        }

        /* renamed from: a */
        public final KType invoke(Class<?> it) {
            List i;
            List i2;
            C9971q.m14633g(it, "it");
            C8466m a = C8399c.m19830a(it);
            i = C9906j.m14820i();
            i2 = C9906j.m14820i();
            return C7591c.m21950b(a, i, true, i2);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"Ljava/lang/Class;", "it", "Lig/m;", "", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/Class;)Lig/m;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.c$d */
    /* loaded from: classes8.dex */
    static final class C8402d extends AbstractC9973s implements Function1<Class<?>, C8466m<? extends Object>> {

        /* renamed from: k */
        public static final C8402d f18332k = new C8402d();

        C8402d() {
            super(1);
        }

        /* renamed from: a */
        public final C8466m<? extends Object> invoke(Class<?> it) {
            C9971q.m14633g(it, "it");
            return new C8466m<>(it);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"Ljava/lang/Class;", "it", "Lig/v;", "a", "(Ljava/lang/Class;)Lig/v;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.c$e */
    /* loaded from: classes8.dex */
    static final class C8403e extends AbstractC9973s implements Function1<Class<?>, C8519v> {

        /* renamed from: k */
        public static final C8403e f18333k = new C8403e();

        C8403e() {
            super(1);
        }

        /* renamed from: a */
        public final C8519v invoke(Class<?> it) {
            C9971q.m14633g(it, "it");
            return new C8519v(it);
        }
    }

    /* renamed from: a */
    public static final <T> C8466m<T> m19830a(Class<T> jClass) {
        C9971q.m14633g(jClass, "jClass");
        C8466m<? extends Object> a = f18324a.mo19794a(jClass);
        C9971q.m14635e(a, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (C8466m<T>) a;
    }

    /* renamed from: b */
    public static final <T> KDeclarationContainer m19829b(Class<T> jClass) {
        C9971q.m14633g(jClass, "jClass");
        return f18325b.mo19794a(jClass);
    }
}
