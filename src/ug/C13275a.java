package ug;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C9971q;

/* renamed from: ug.a */
/* loaded from: classes8.dex */
final class C13275a {

    /* renamed from: a */
    public static final C13275a f29801a = new C13275a();

    /* renamed from: b */
    private static C0433a f29802b;

    /* renamed from: ug.a$a */
    /* loaded from: classes8.dex */
    public static final class C0433a {

        /* renamed from: a */
        private final Method f29803a;

        /* renamed from: b */
        private final Method f29804b;

        public C0433a(Method method, Method method2) {
            this.f29803a = method;
            this.f29804b = method2;
        }

        /* renamed from: a */
        public final Method m4076a() {
            return this.f29804b;
        }

        /* renamed from: b */
        public final Method m4075b() {
            return this.f29803a;
        }
    }

    private C13275a() {
    }

    /* renamed from: a */
    private final C0433a m4080a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0433a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C0433a(null, null);
        }
    }

    /* renamed from: b */
    private final C0433a m4079b(Object obj) {
        C0433a aVar = f29802b;
        if (aVar != null) {
            return aVar;
        }
        C0433a a = m4080a(obj);
        f29802b = a;
        return a;
    }

    /* renamed from: c */
    public final Method m4078c(Object recordComponent) {
        C9971q.m14633g(recordComponent, "recordComponent");
        Method a = m4079b(recordComponent).m4076a();
        if (a == null) {
            return null;
        }
        Object invoke = a.invoke(recordComponent, new Object[0]);
        C9971q.m14635e(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) invoke;
    }

    /* renamed from: d */
    public final Class<?> m4077d(Object recordComponent) {
        C9971q.m14633g(recordComponent, "recordComponent");
        Method b = m4079b(recordComponent).m4075b();
        if (b == null) {
            return null;
        }
        Object invoke = b.invoke(recordComponent, new Object[0]);
        C9971q.m14635e(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) invoke;
    }
}
