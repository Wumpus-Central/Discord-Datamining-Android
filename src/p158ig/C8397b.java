package p158ig;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\n"}, m15073d2 = {"", "V", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "Lig/a;", "a", "", "Z", "useClassValue", "kotlin-reflection"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: ig.b */
/* loaded from: classes8.dex */
public final class C8397b {

    /* renamed from: a */
    private static final boolean f18322a;

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
        f18322a = ((Boolean) b).booleanValue();
    }

    /* renamed from: a */
    public static final <V> AbstractC8395a<V> m19832a(Function1<? super Class<?>, ? extends V> compute) {
        C9971q.m14633g(compute, "compute");
        if (f18322a) {
            return new C8415d(compute);
        }
        return new C8423f(compute);
    }
}
