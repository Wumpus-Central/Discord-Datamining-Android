package p449yi;

import dj.AbstractC6514c;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

@Metadata(m15074d1 = {"yi/k", "yi/l"}, m15073d2 = {}, m15072k = 4, m15071mv = {1, 8, 0})
/* renamed from: yi.j */
/* loaded from: classes8.dex */
public final class C14443j {
    /* renamed from: a */
    public static final KSerializer<? extends Object> m604a(KClass<Object> kClass, List<? extends KType> list, List<? extends KSerializer<Object>> list2) {
        return C14445l.m584d(kClass, list, list2);
    }

    /* renamed from: b */
    public static final KSerializer<Object> m603b(AbstractC6514c cVar, Type type) {
        return C14444k.m593d(cVar, type);
    }

    /* renamed from: c */
    public static final KSerializer<Object> m602c(AbstractC6514c cVar, KType kType) {
        return C14445l.m583e(cVar, kType);
    }

    /* renamed from: d */
    public static final KSerializer<Object> m601d(Type type) {
        return C14444k.m592e(type);
    }

    /* renamed from: e */
    public static final KSerializer<Object> m600e(AbstractC6514c cVar, Type type) {
        return C14444k.m589h(cVar, type);
    }

    /* renamed from: f */
    public static final KSerializer<Object> m599f(AbstractC6514c cVar, KType kType) {
        return C14445l.m581g(cVar, kType);
    }

    /* renamed from: g */
    public static final <T> KSerializer<T> m598g(KClass<T> kClass) {
        return C14445l.m580h(kClass);
    }

    /* renamed from: h */
    public static final List<KSerializer<Object>> m597h(AbstractC6514c cVar, List<? extends KType> list, boolean z) {
        return C14445l.m579i(cVar, list, z);
    }
}
