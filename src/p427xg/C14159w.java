package p427xg;

import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11079k;

/* renamed from: xg.w */
/* loaded from: classes8.dex */
public final class C14159w {

    /* renamed from: d */
    public static final C14160a f31971d = new C14160a(null);

    /* renamed from: e */
    private static final C14159w f31972e = new C14159w(EnumC14123g0.STRICT, null, null, 6, null);

    /* renamed from: a */
    private final EnumC14123g0 f31973a;

    /* renamed from: b */
    private final C11079k f31974b;

    /* renamed from: c */
    private final EnumC14123g0 f31975c;

    /* renamed from: xg.w$a */
    /* loaded from: classes8.dex */
    public static final class C14160a {
        private C14160a() {
        }

        public /* synthetic */ C14160a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C14159w m1485a() {
            return C14159w.f31972e;
        }
    }

    public C14159w(EnumC14123g0 reportLevelBefore, C11079k kVar, EnumC14123g0 reportLevelAfter) {
        C9971q.m14633g(reportLevelBefore, "reportLevelBefore");
        C9971q.m14633g(reportLevelAfter, "reportLevelAfter");
        this.f31973a = reportLevelBefore;
        this.f31974b = kVar;
        this.f31975c = reportLevelAfter;
    }

    /* renamed from: b */
    public final EnumC14123g0 m1488b() {
        return this.f31975c;
    }

    /* renamed from: c */
    public final EnumC14123g0 m1487c() {
        return this.f31973a;
    }

    /* renamed from: d */
    public final C11079k m1486d() {
        return this.f31974b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14159w)) {
            return false;
        }
        C14159w wVar = (C14159w) obj;
        return this.f31973a == wVar.f31973a && C9971q.m14638b(this.f31974b, wVar.f31974b) && this.f31975c == wVar.f31975c;
    }

    public int hashCode() {
        int hashCode = this.f31973a.hashCode() * 31;
        C11079k kVar = this.f31974b;
        return ((hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31) + this.f31975c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f31973a + ", sinceVersion=" + this.f31974b + ", reportLevelAfter=" + this.f31975c + ')';
    }

    public /* synthetic */ C14159w(EnumC14123g0 g0Var, C11079k kVar, EnumC14123g0 g0Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(g0Var, (i & 2) != 0 ? new C11079k(1, 0) : kVar, (i & 4) != 0 ? g0Var : g0Var2);
    }
}
