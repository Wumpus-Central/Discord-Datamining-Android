package ug;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C9971q;

/* renamed from: ug.b */
/* loaded from: classes8.dex */
final class C13277b {

    /* renamed from: a */
    public static final C13277b f29806a = new C13277b();

    /* renamed from: b */
    private static C13278a f29807b;

    /* renamed from: ug.b$a */
    /* loaded from: classes8.dex */
    public static final class C13278a {

        /* renamed from: a */
        private final Method f29808a;

        /* renamed from: b */
        private final Method f29809b;

        /* renamed from: c */
        private final Method f29810c;

        /* renamed from: d */
        private final Method f29811d;

        public C13278a(Method method, Method method2, Method method3, Method method4) {
            this.f29808a = method;
            this.f29809b = method2;
            this.f29810c = method3;
            this.f29811d = method4;
        }

        /* renamed from: a */
        public final Method m4067a() {
            return this.f29809b;
        }

        /* renamed from: b */
        public final Method m4066b() {
            return this.f29811d;
        }

        /* renamed from: c */
        public final Method m4065c() {
            return this.f29810c;
        }

        /* renamed from: d */
        public final Method m4064d() {
            return this.f29808a;
        }
    }

    private C13277b() {
    }

    /* renamed from: a */
    private final C13278a m4073a() {
        try {
            return new C13278a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C13278a(null, null, null, null);
        }
    }

    /* renamed from: b */
    private final C13278a m4072b() {
        C13278a aVar = f29807b;
        if (aVar != null) {
            return aVar;
        }
        C13278a a = m4073a();
        f29807b = a;
        return a;
    }

    /* renamed from: c */
    public final Class<?>[] m4071c(Class<?> clazz) {
        C9971q.m14633g(clazz, "clazz");
        Method a = m4072b().m4067a();
        if (a == null) {
            return null;
        }
        Object invoke = a.invoke(clazz, new Object[0]);
        C9971q.m14635e(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) invoke;
    }

    /* renamed from: d */
    public final Object[] m4070d(Class<?> clazz) {
        C9971q.m14633g(clazz, "clazz");
        Method b = m4072b().m4066b();
        if (b == null) {
            return null;
        }
        return (Object[]) b.invoke(clazz, new Object[0]);
    }

    /* renamed from: e */
    public final Boolean m4069e(Class<?> clazz) {
        C9971q.m14633g(clazz, "clazz");
        Method c = m4072b().m4065c();
        if (c == null) {
            return null;
        }
        Object invoke = c.invoke(clazz, new Object[0]);
        C9971q.m14635e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }

    /* renamed from: f */
    public final Boolean m4068f(Class<?> clazz) {
        C9971q.m14633g(clazz, "clazz");
        Method d = m4072b().m4064d();
        if (d == null) {
            return null;
        }
        Object invoke = d.invoke(clazz, new Object[0]);
        C9971q.m14635e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }
}
