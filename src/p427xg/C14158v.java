package p427xg;

import java.util.Map;
import kotlin.jvm.internal.C9971q;
import nf.C11079k;
import nf.C11098x;
import p249nh.C11137c;
import p267of.C11289v;
import p427xg.C14159w;

/* renamed from: xg.v */
/* loaded from: classes8.dex */
public final class C14158v {

    /* renamed from: a */
    private static final C11137c f31964a;

    /* renamed from: b */
    private static final C11137c f31965b;

    /* renamed from: c */
    private static final C11137c f31966c;

    /* renamed from: d */
    private static final String f31967d;

    /* renamed from: e */
    private static final C11137c[] f31968e;

    /* renamed from: f */
    private static final AbstractC14112d0<C14159w> f31969f;

    /* renamed from: g */
    private static final C14159w f31970g;

    static {
        Map k;
        C11137c cVar = new C11137c("org.jspecify.nullness");
        f31964a = cVar;
        C11137c cVar2 = new C11137c("io.reactivex.rxjava3.annotations");
        f31965b = cVar2;
        C11137c cVar3 = new C11137c("org.checkerframework.checker.nullness.compatqual");
        f31966c = cVar3;
        String b = cVar2.m10803b();
        C9971q.m14634f(b, "RXJAVA3_ANNOTATIONS_PACKAGE.asString()");
        f31967d = b;
        f31968e = new C11137c[]{new C11137c(b + ".Nullable"), new C11137c(b + ".NonNull")};
        C11137c cVar4 = new C11137c("org.jetbrains.annotations");
        C14159w.C14160a aVar = C14159w.f31971d;
        C11137c cVar5 = new C11137c("androidx.annotation.RecentlyNullable");
        EnumC14123g0 g0Var = EnumC14123g0.WARN;
        C11079k kVar = new C11079k(1, 9);
        EnumC14123g0 g0Var2 = EnumC14123g0.STRICT;
        k = C11289v.m10248k(C11098x.m10921a(cVar4, aVar.m1485a()), C11098x.m10921a(new C11137c("androidx.annotation"), aVar.m1485a()), C11098x.m10921a(new C11137c("android.support.annotation"), aVar.m1485a()), C11098x.m10921a(new C11137c("android.annotation"), aVar.m1485a()), C11098x.m10921a(new C11137c("com.android.annotations"), aVar.m1485a()), C11098x.m10921a(new C11137c("org.eclipse.jdt.annotation"), aVar.m1485a()), C11098x.m10921a(new C11137c("org.checkerframework.checker.nullness.qual"), aVar.m1485a()), C11098x.m10921a(cVar3, aVar.m1485a()), C11098x.m10921a(new C11137c("javax.annotation"), aVar.m1485a()), C11098x.m10921a(new C11137c("edu.umd.cs.findbugs.annotations"), aVar.m1485a()), C11098x.m10921a(new C11137c("io.reactivex.annotations"), aVar.m1485a()), C11098x.m10921a(cVar5, new C14159w(g0Var, null, null, 4, null)), C11098x.m10921a(new C11137c("androidx.annotation.RecentlyNonNull"), new C14159w(g0Var, null, null, 4, null)), C11098x.m10921a(new C11137c("lombok"), aVar.m1485a()), C11098x.m10921a(cVar, new C14159w(g0Var, kVar, g0Var2)), C11098x.m10921a(cVar2, new C14159w(g0Var, new C11079k(1, 8), g0Var2)));
        f31969f = new C14116e0(k);
        f31970g = new C14159w(g0Var, null, null, 4, null);
    }

    /* renamed from: a */
    public static final C14165z m1497a(C11079k configuredKotlinVersion) {
        EnumC14123g0 g0Var;
        C9971q.m14633g(configuredKotlinVersion, "configuredKotlinVersion");
        C14159w wVar = f31970g;
        if (wVar.m1486d() == null || wVar.m1486d().compareTo(configuredKotlinVersion) > 0) {
            g0Var = wVar.m1487c();
        } else {
            g0Var = wVar.m1488b();
        }
        return new C14165z(g0Var, m1495c(g0Var), null, 4, null);
    }

    /* renamed from: b */
    public static /* synthetic */ C14165z m1496b(C11079k kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = C11079k.f24595p;
        }
        return m1497a(kVar);
    }

    /* renamed from: c */
    public static final EnumC14123g0 m1495c(EnumC14123g0 globalReportLevel) {
        C9971q.m14633g(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == EnumC14123g0.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    /* renamed from: d */
    public static final EnumC14123g0 m1494d(C11137c annotationFqName) {
        C9971q.m14633g(annotationFqName, "annotationFqName");
        return m1490h(annotationFqName, AbstractC14112d0.f31891a.m1613a(), null, 4, null);
    }

    /* renamed from: e */
    public static final C11137c m1493e() {
        return f31964a;
    }

    /* renamed from: f */
    public static final C11137c[] m1492f() {
        return f31968e;
    }

    /* renamed from: g */
    public static final EnumC14123g0 m1491g(C11137c annotation, AbstractC14112d0<? extends EnumC14123g0> configuredReportLevels, C11079k configuredKotlinVersion) {
        C9971q.m14633g(annotation, "annotation");
        C9971q.m14633g(configuredReportLevels, "configuredReportLevels");
        C9971q.m14633g(configuredKotlinVersion, "configuredKotlinVersion");
        EnumC14123g0 g0Var = (EnumC14123g0) configuredReportLevels.mo1608a(annotation);
        if (g0Var != null) {
            return g0Var;
        }
        C14159w a = f31969f.mo1608a(annotation);
        if (a == null) {
            return EnumC14123g0.IGNORE;
        }
        if (a.m1486d() == null || a.m1486d().compareTo(configuredKotlinVersion) > 0) {
            return a.m1487c();
        }
        return a.m1488b();
    }

    /* renamed from: h */
    public static /* synthetic */ EnumC14123g0 m1490h(C11137c cVar, AbstractC14112d0 d0Var, C11079k kVar, int i, Object obj) {
        if ((i & 4) != 0) {
            kVar = new C11079k(1, 7, 20);
        }
        return m1491g(cVar, d0Var, kVar);
    }
}
