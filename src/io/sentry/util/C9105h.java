package io.sentry.util;

import io.sentry.AbstractC8869g0;
import io.sentry.C9116v;
import io.sentry.hints.AbstractC8882a;
import io.sentry.hints.AbstractC8883b;
import io.sentry.util.C9105h;

/* renamed from: io.sentry.util.h */
/* loaded from: classes8.dex */
public final class C9105h {

    @FunctionalInterface
    /* renamed from: io.sentry.util.h$a */
    /* loaded from: classes8.dex */
    public interface AbstractC9106a<T> {
        void accept(T t);
    }

    @FunctionalInterface
    /* renamed from: io.sentry.util.h$b */
    /* loaded from: classes8.dex */
    public interface AbstractC9107b {
        /* renamed from: a */
        void mo16999a(Object obj, Class<?> cls);
    }

    @FunctionalInterface
    /* renamed from: io.sentry.util.h$c */
    /* loaded from: classes8.dex */
    public interface AbstractC9108c<T> {
        void accept(T t);
    }

    /* renamed from: e */
    public static C9116v m17014e(Object obj) {
        C9116v vVar = new C9116v();
        m17001r(vVar, obj);
        return vVar;
    }

    /* renamed from: f */
    public static Object m17013f(C9116v vVar) {
        return vVar.m16978c("sentry:typeCheckHint");
    }

    /* renamed from: g */
    public static boolean m17012g(C9116v vVar, Class<?> cls) {
        return cls.isInstance(m17013f(vVar));
    }

    /* renamed from: h */
    public static boolean m17011h(C9116v vVar) {
        return Boolean.TRUE.equals(vVar.m16977d("sentry:isFromHybridSdk", Boolean.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m17010i(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m17008k(Object obj, Class cls) {
    }

    /* renamed from: m */
    public static <T> void m17006m(C9116v vVar, Class<T> cls, final AbstractC9108c<Object> cVar) {
        m17004o(vVar, cls, new AbstractC9106a() { // from class: io.sentry.util.e
            @Override // io.sentry.util.C9105h.AbstractC9106a
            public final void accept(Object obj) {
                C9105h.m17010i(obj);
            }
        }, new AbstractC9107b() { // from class: io.sentry.util.f
            @Override // io.sentry.util.C9105h.AbstractC9107b
            /* renamed from: a */
            public final void mo16999a(Object obj, Class cls2) {
                C9105h.AbstractC9108c.this.accept(obj);
            }
        });
    }

    /* renamed from: n */
    public static <T> void m17005n(C9116v vVar, Class<T> cls, AbstractC9106a<T> aVar) {
        m17004o(vVar, cls, aVar, new AbstractC9107b() { // from class: io.sentry.util.d
            @Override // io.sentry.util.C9105h.AbstractC9107b
            /* renamed from: a */
            public final void mo16999a(Object obj, Class cls2) {
                C9105h.m17008k(obj, cls2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static <T> void m17004o(C9116v vVar, Class<T> cls, AbstractC9106a<T> aVar, AbstractC9107b bVar) {
        Object f = m17013f(vVar);
        if (!m17012g(vVar, cls) || f == null) {
            bVar.mo16999a(f, cls);
        } else {
            aVar.accept(f);
        }
    }

    /* renamed from: p */
    public static <T> void m17003p(C9116v vVar, Class<T> cls, final AbstractC8869g0 g0Var, AbstractC9106a<T> aVar) {
        m17004o(vVar, cls, aVar, new AbstractC9107b() { // from class: io.sentry.util.g
            @Override // io.sentry.util.C9105h.AbstractC9107b
            /* renamed from: a */
            public final void mo16999a(Object obj, Class cls2) {
                C9110j.m16996a(cls2, obj, AbstractC8869g0.this);
            }
        });
    }

    /* renamed from: q */
    public static void m17002q(C9116v vVar, String str) {
        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
            vVar.m16973h("sentry:isFromHybridSdk", Boolean.TRUE);
        }
    }

    /* renamed from: r */
    public static void m17001r(C9116v vVar, Object obj) {
        vVar.m16973h("sentry:typeCheckHint", obj);
    }

    /* renamed from: s */
    public static boolean m17000s(C9116v vVar) {
        return !m17012g(vVar, AbstractC8883b.class) || m17012g(vVar, AbstractC8882a.class);
    }
}
