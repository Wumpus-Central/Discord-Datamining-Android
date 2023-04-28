package bj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a4\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0004\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0001H\u0000\u001aB\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002,\u0010\u0004\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0007H\u0000\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, m15073d2 = {"T", "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "factory", "Lbj/x1;", "a", "Lkotlin/Function2;", "", "", "Lkotlin/reflect/KType;", "Lbj/k1;", "b", "", "Z", "useClassValue", "kotlinx-serialization-core"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: bj.m */
/* loaded from: classes8.dex */
public final class C3675m {

    /* renamed from: a */
    private static final boolean f5991a;

    static {
        Object obj;
        try {
            C11090s.C11091a aVar = C11090s.f24606l;
            obj = C11090s.m10940b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th2) {
            C11090s.C11091a aVar2 = C11090s.f24606l;
            obj = C11090s.m10940b(C11093t.m10931a(th2));
        }
        if (C11090s.m10934h(obj)) {
            Class cls = (Class) obj;
            obj = Boolean.TRUE;
        }
        Object b = C11090s.m10940b(obj);
        Boolean bool = Boolean.FALSE;
        if (C11090s.m10935g(b)) {
            b = bool;
        }
        f5991a = ((Boolean) b).booleanValue();
    }

    /* renamed from: a */
    public static final <T> AbstractC3716x1<T> m33834a(Function1<? super KClass<?>, ? extends KSerializer<T>> factory) {
        C9971q.m14633g(factory, "factory");
        if (f5991a) {
            return new C3686p(factory);
        }
        return new C3703u(factory);
    }

    /* renamed from: b */
    public static final <T> AbstractC3669k1<T> m33833b(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> factory) {
        C9971q.m14633g(factory, "factory");
        if (f5991a) {
            return new C3690q(factory);
        }
        return new C3706v(factory);
    }
}
