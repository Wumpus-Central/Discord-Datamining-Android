package p427xg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9965m;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KDeclarationContainer;
import p249nh.C11137c;

/* renamed from: xg.x */
/* loaded from: classes8.dex */
public final class C14161x {

    /* renamed from: d */
    public static final C14163b f31976d = new C14163b(null);

    /* renamed from: e */
    private static final C14161x f31977e = new C14161x(C14158v.m1496b(null, 1, null), C14162a.f31981k);

    /* renamed from: a */
    private final C14165z f31978a;

    /* renamed from: b */
    private final Function1<C11137c, EnumC14123g0> f31979b;

    /* renamed from: c */
    private final boolean f31980c;

    /* renamed from: xg.x$a */
    /* loaded from: classes8.dex */
    /* synthetic */ class C14162a extends C9965m implements Function1<C11137c, EnumC14123g0> {

        /* renamed from: k */
        public static final C14162a f31981k = new C14162a();

        C14162a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14682d(C14158v.class, "compiler.common.jvm");
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        /* renamed from: i */
        public final EnumC14123g0 invoke(C11137c p0) {
            C9971q.m14633g(p0, "p0");
            return C14158v.m1494d(p0);
        }
    }

    /* renamed from: xg.x$b */
    /* loaded from: classes8.dex */
    public static final class C14163b {
        private C14163b() {
        }

        public /* synthetic */ C14163b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C14161x m1479a() {
            return C14161x.f31977e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14161x(C14165z jsr305, Function1<? super C11137c, ? extends EnumC14123g0> getReportLevelForAnnotation) {
        boolean z;
        C9971q.m14633g(jsr305, "jsr305");
        C9971q.m14633g(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f31978a = jsr305;
        this.f31979b = getReportLevelForAnnotation;
        if (jsr305.m1473d() || getReportLevelForAnnotation.invoke(C14158v.m1493e()) == EnumC14123g0.IGNORE) {
            z = true;
        } else {
            z = false;
        }
        this.f31980c = z;
    }

    /* renamed from: b */
    public final boolean m1483b() {
        return this.f31980c;
    }

    /* renamed from: c */
    public final Function1<C11137c, EnumC14123g0> m1482c() {
        return this.f31979b;
    }

    /* renamed from: d */
    public final C14165z m1481d() {
        return this.f31978a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f31978a + ", getReportLevelForAnnotation=" + this.f31979b + ')';
    }
}
