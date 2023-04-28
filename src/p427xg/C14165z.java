package p427xg;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.C9905i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11084n;
import p249nh.C11137c;
import p267of.C11289v;

/* renamed from: xg.z */
/* loaded from: classes8.dex */
public final class C14165z {

    /* renamed from: a */
    private final EnumC14123g0 f31983a;

    /* renamed from: b */
    private final EnumC14123g0 f31984b;

    /* renamed from: c */
    private final Map<C11137c, EnumC14123g0> f31985c;

    /* renamed from: d */
    private final Lazy f31986d;

    /* renamed from: e */
    private final boolean f31987e;

    /* renamed from: xg.z$a */
    /* loaded from: classes8.dex */
    static final class C14166a extends AbstractC9973s implements Function0<String[]> {
        C14166a() {
            super(0);
        }

        /* renamed from: a */
        public final String[] invoke() {
            List c;
            List a;
            C14165z zVar = C14165z.this;
            c = C9905i.m14826c();
            c.add(zVar.m1476a().m1587b());
            EnumC14123g0 b = zVar.m1475b();
            if (b != null) {
                c.add("under-migration:" + b.m1587b());
            }
            for (Map.Entry<C11137c, EnumC14123g0> entry : zVar.m1474c().entrySet()) {
                c.add('@' + entry.getKey() + ':' + entry.getValue().m1587b());
            }
            a = C9905i.m14828a(c);
            return (String[]) a.toArray(new String[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14165z(EnumC14123g0 globalLevel, EnumC14123g0 g0Var, Map<C11137c, ? extends EnumC14123g0> userDefinedLevelForSpecificAnnotation) {
        Lazy a;
        C9971q.m14633g(globalLevel, "globalLevel");
        C9971q.m14633g(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f31983a = globalLevel;
        this.f31984b = g0Var;
        this.f31985c = userDefinedLevelForSpecificAnnotation;
        a = C11084n.m10945a(new C14166a());
        this.f31986d = a;
        EnumC14123g0 g0Var2 = EnumC14123g0.IGNORE;
        this.f31987e = globalLevel == g0Var2 && g0Var == g0Var2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    /* renamed from: a */
    public final EnumC14123g0 m1476a() {
        return this.f31983a;
    }

    /* renamed from: b */
    public final EnumC14123g0 m1475b() {
        return this.f31984b;
    }

    /* renamed from: c */
    public final Map<C11137c, EnumC14123g0> m1474c() {
        return this.f31985c;
    }

    /* renamed from: d */
    public final boolean m1473d() {
        return this.f31987e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14165z)) {
            return false;
        }
        C14165z zVar = (C14165z) obj;
        return this.f31983a == zVar.f31983a && this.f31984b == zVar.f31984b && C9971q.m14638b(this.f31985c, zVar.f31985c);
    }

    public int hashCode() {
        int hashCode = this.f31983a.hashCode() * 31;
        EnumC14123g0 g0Var = this.f31984b;
        return ((hashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31) + this.f31985c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f31983a + ", migrationLevel=" + this.f31984b + ", userDefinedLevelForSpecificAnnotation=" + this.f31985c + ')';
    }

    public /* synthetic */ C14165z(EnumC14123g0 g0Var, EnumC14123g0 g0Var2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(g0Var, (i & 2) != 0 ? null : g0Var2, (i & 4) != 0 ? C11289v.m10251h() : map);
    }
}
