package tg;

import bi.C3585k;
import gh.C7614f;
import kotlin.Unit;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p268og.AbstractC11327h0;

/* renamed from: tg.k */
/* loaded from: classes8.dex */
public final class C13092k {

    /* renamed from: c */
    public static final C13093a f29400c = new C13093a(null);

    /* renamed from: a */
    private final C3585k f29401a;

    /* renamed from: b */
    private final C13081a f29402b;

    /* renamed from: tg.k$a */
    /* loaded from: classes8.dex */
    public static final class C13093a {
        private C13093a() {
        }

        public /* synthetic */ C13093a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13092k m4614a(ClassLoader classLoader) {
            C9971q.m14633g(classLoader, "classLoader");
            C13088g gVar = new C13088g(classLoader);
            C7614f.C7615a aVar = C7614f.f16608b;
            ClassLoader classLoader2 = Unit.class.getClassLoader();
            C9971q.m14634f(classLoader2, "Unit::class.java.classLoader");
            C13088g gVar2 = new C13088g(classLoader2);
            C13084d dVar = new C13084d(classLoader);
            C7614f.C7615a.C0240a a = aVar.m21881a(gVar, gVar2, dVar, "runtime module for " + classLoader, C13091j.f29399b, C13094l.f29403a);
            return new C13092k(a.m21880a().m21882a(), new C13081a(a.m21879b(), gVar), null);
        }
    }

    private C13092k(C3585k kVar, C13081a aVar) {
        this.f29401a = kVar;
        this.f29402b = aVar;
    }

    public /* synthetic */ C13092k(C3585k kVar, C13081a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, aVar);
    }

    /* renamed from: a */
    public final C3585k m4617a() {
        return this.f29401a;
    }

    /* renamed from: b */
    public final AbstractC11327h0 m4616b() {
        return this.f29401a.m34034p();
    }

    /* renamed from: c */
    public final C13081a m4615c() {
        return this.f29402b;
    }
}
