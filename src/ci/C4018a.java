package ci;

import ai.C1406a;
import kotlin.jvm.internal.C9971q;
import p249nh.C11137c;
import p326ri.C12718u;

/* renamed from: ci.a */
/* loaded from: classes8.dex */
public final class C4018a extends C1406a {

    /* renamed from: n */
    public static final C4018a f6609n = new C4018a();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C4018a() {
        /*
            r14 = this;
            ph.g r1 = ph.C11697g.m8879d()
            p181jh.C9608b.m15927a(r1)
            java.lang.String r0 = "newInstance().apply(Buil…f::registerAllExtensions)"
            kotlin.jvm.internal.C9971q.m14634f(r1, r0)
            ph.i$f<ih.l, java.lang.Integer> r2 = p181jh.C9608b.f21285a
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.C9971q.m14634f(r2, r0)
            ph.i$f<ih.d, java.util.List<ih.b>> r3 = p181jh.C9608b.f21287c
            java.lang.String r0 = "constructorAnnotation"
            kotlin.jvm.internal.C9971q.m14634f(r3, r0)
            ph.i$f<ih.c, java.util.List<ih.b>> r4 = p181jh.C9608b.f21286b
            java.lang.String r0 = "classAnnotation"
            kotlin.jvm.internal.C9971q.m14634f(r4, r0)
            ph.i$f<ih.i, java.util.List<ih.b>> r5 = p181jh.C9608b.f21288d
            java.lang.String r0 = "functionAnnotation"
            kotlin.jvm.internal.C9971q.m14634f(r5, r0)
            ph.i$f<ih.n, java.util.List<ih.b>> r6 = p181jh.C9608b.f21289e
            java.lang.String r0 = "propertyAnnotation"
            kotlin.jvm.internal.C9971q.m14634f(r6, r0)
            ph.i$f<ih.n, java.util.List<ih.b>> r7 = p181jh.C9608b.f21290f
            java.lang.String r0 = "propertyGetterAnnotation"
            kotlin.jvm.internal.C9971q.m14634f(r7, r0)
            ph.i$f<ih.n, java.util.List<ih.b>> r8 = p181jh.C9608b.f21291g
            java.lang.String r0 = "propertySetterAnnotation"
            kotlin.jvm.internal.C9971q.m14634f(r8, r0)
            ph.i$f<ih.g, java.util.List<ih.b>> r9 = p181jh.C9608b.f21293i
            java.lang.String r0 = "enumEntryAnnotation"
            kotlin.jvm.internal.C9971q.m14634f(r9, r0)
            ph.i$f<ih.n, ih.b$b$c> r10 = p181jh.C9608b.f21292h
            java.lang.String r0 = "compileTimeValue"
            kotlin.jvm.internal.C9971q.m14634f(r10, r0)
            ph.i$f<ih.u, java.util.List<ih.b>> r11 = p181jh.C9608b.f21294j
            java.lang.String r0 = "parameterAnnotation"
            kotlin.jvm.internal.C9971q.m14634f(r11, r0)
            ph.i$f<ih.q, java.util.List<ih.b>> r12 = p181jh.C9608b.f21295k
            java.lang.String r0 = "typeAnnotation"
            kotlin.jvm.internal.C9971q.m14634f(r12, r0)
            ph.i$f<ih.s, java.util.List<ih.b>> r13 = p181jh.C9608b.f21296l
            java.lang.String r0 = "typeParameterAnnotation"
            kotlin.jvm.internal.C9971q.m14634f(r13, r0)
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.C4018a.<init>():void");
    }

    /* renamed from: o */
    private final String m33075o(C11137c cVar) {
        if (cVar.m10801d()) {
            return "default-package";
        }
        String b = cVar.m10798g().m10771b();
        C9971q.m14634f(b, "fqName.shortName().asString()");
        return b;
    }

    /* renamed from: m */
    public final String m33077m(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        return m33075o(fqName) + ".kotlin_builtins";
    }

    /* renamed from: n */
    public final String m33076n(C11137c fqName) {
        String C;
        C9971q.m14633g(fqName, "fqName");
        StringBuilder sb2 = new StringBuilder();
        String b = fqName.m10803b();
        C9971q.m14634f(b, "fqName.asString()");
        C = C12718u.m5741C(b, '.', '/', false, 4, null);
        sb2.append(C);
        sb2.append('/');
        sb2.append(m33077m(fqName));
        return sb2.toString();
    }
}
