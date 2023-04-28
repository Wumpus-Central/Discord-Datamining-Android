package ug;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9971q;

/* renamed from: ug.c */
/* loaded from: classes8.dex */
final class C13280c {

    /* renamed from: a */
    public static final C13280c f29816a = new C13280c();

    /* renamed from: b */
    private static C13281a f29817b;

    /* renamed from: ug.c$a */
    /* loaded from: classes8.dex */
    public static final class C13281a {

        /* renamed from: a */
        private final Method f29818a;

        /* renamed from: b */
        private final Method f29819b;

        public C13281a(Method method, Method method2) {
            this.f29818a = method;
            this.f29819b = method2;
        }

        /* renamed from: a */
        public final Method m4059a() {
            return this.f29819b;
        }

        /* renamed from: b */
        public final Method m4058b() {
            return this.f29818a;
        }
    }

    private C13280c() {
    }

    /* renamed from: a */
    public final C13281a m4061a(Member member) {
        C9971q.m14633g(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new C13281a(cls.getMethod("getParameters", new Class[0]), C13283d.m4048f(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C13281a(null, null);
        }
    }

    /* renamed from: b */
    public final List<String> m4060b(Member member) {
        Method a;
        C9971q.m14633g(member, "member");
        C13281a aVar = f29817b;
        if (aVar == null) {
            synchronized (this) {
                aVar = f29817b;
                if (aVar == null) {
                    aVar = f29816a.m4061a(member);
                    f29817b = aVar;
                }
            }
        }
        Method b = aVar.m4058b();
        if (b == null || (a = aVar.m4059a()) == null) {
            return null;
        }
        Object invoke = b.invoke(member, new Object[0]);
        C9971q.m14635e(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object invoke2 = a.invoke(obj, new Object[0]);
            C9971q.m14635e(invoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) invoke2);
        }
        return arrayList;
    }
}
